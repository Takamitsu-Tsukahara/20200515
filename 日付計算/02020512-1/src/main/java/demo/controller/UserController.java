package demo.controller;

import java.time.LocalDateTime;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import demo.model.ModelData;


@Controller
public class UserController {

	@RequestMapping("/")
	public String index(Model model) {

		LocalDateTime today = LocalDateTime.now();
		//本日のデータ
		model.addAttribute("modelNow", today);
		//本日のデータを分けてテーブル表示
		model.addAttribute("todayYear", today.getYear());
		model.addAttribute("todayMonth", today.getMonthValue());
		model.addAttribute("todayDay", today.getDayOfMonth());
		model.addAttribute("todayWeek", today.getDayOfWeek());
		//変化させる数値の枠に"0"を入れて表示
		model.addAttribute("numberYear", 0);
		model.addAttribute("numberMonth", 0);
		model.addAttribute("numberDay", 0);
		//本日のデータを分けてテーブル表示
		model.addAttribute("modelYear", today.getYear());
		model.addAttribute("modelMonth", today.getMonthValue());
		model.addAttribute("modelDay", today.getDayOfMonth());
		model.addAttribute("modelWeek", today.getDayOfWeek());
		//入力枠
		model.addAttribute("Request", new ModelData());

		return "index";
	}

	@RequestMapping("/indexPlus")
	public String indexPlus(
		@ModelAttribute ("plusyear") String plusyear,
		@ModelAttribute ("plusmonth") String plusmonth,
		@ModelAttribute ("plusday") String plusday,
		Model model) {
		LocalDateTime today = LocalDateTime.now();

		int y = Integer.parseInt(plusyear);
		int m = Integer.parseInt(plusmonth);
		int d = Integer.parseInt(plusday);
		LocalDateTime collectday = LocalDateTime.now()
				.plusYears(y).plusMonths(m).plusDays(d);
		//本日のデータ
		model.addAttribute("modelNow", today);
		//本日のデータを分けてテーブル表示
		model.addAttribute("todayYear", today.getYear());
		model.addAttribute("todayMonth", today.getMonthValue());
		model.addAttribute("todayDay", today.getDayOfMonth());
		model.addAttribute("todayWeek", today.getDayOfWeek());
		//変化させる数値を入れて表示
		model.addAttribute("numberYear", y);
		model.addAttribute("numberMonth", m);
		model.addAttribute("numberDay", d);
		//変化後のデータを分けてテーブル表示
		model.addAttribute("modelYear", collectday.getYear());
		model.addAttribute("modelMonth", collectday.getMonthValue());
		model.addAttribute("modelDay", collectday.getDayOfMonth());
		model.addAttribute("modelWeek", collectday.getDayOfWeek());
		//入力枠
		model.addAttribute("Request", new ModelData());

		return "index";
	}

}