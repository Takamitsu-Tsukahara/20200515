package demo.controller;

import java.util.Date;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import demo.model.ModelData;
import demo.repository.RepositoryData;
import demo.request.RequestDemo;


@Controller
public class ControllerDemo {

	@Autowired
    RepositoryData repositoryData;

    @GetMapping("/")
    public String index(Model model) {


    	//個別表示
    	ModelData displayData = repositoryData.selectByPrimaryKey(1);
    	model.addAttribute("displayId",displayData.getId());
    	model.addAttribute("displayDataDB",displayData.getDatadb());


    	//新規入力画面
    	model.addAttribute("requestData", new ModelData());


        return "index";
    }

    @RequestMapping(value="/add")
    public String add(@ModelAttribute @Valid RequestDemo datadb, Model model) {


    	Date date = java.sql.Date.valueOf(datadb.getDatadb());
    	ModelData newData = new ModelData();
    	newData.setDatadb(date);
    	repositoryData.insert(newData);
    	System.out.println(date);

    	return "redirect:";

    }
}








