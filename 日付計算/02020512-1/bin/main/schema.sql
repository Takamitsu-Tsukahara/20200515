DROP TABLE IF EXISTS select_plus_db;
CREATE TABLE select_plus_db(
	id BIGINT(20) NOT NULL AUTO_INCREMENT,
	select_date DATETIME NOT NULL,
	update_date DATETIME NOT NULL,
	create_date DATETIME NOT NULL,
	delete_date DATETIME NULL,
	PRIMARY KEY (id)
  )
ENGINE=InnoDB DEFAULT CHARSET=utf8;