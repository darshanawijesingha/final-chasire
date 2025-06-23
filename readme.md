type below code in your sql
user =root
password =""

CREATE TABLE books (
company varchar(255) DEFAULT NULL,
id int(11) DEFAULT NULL,
type varchar(15) DEFAULT NULL,
page int(11) DEFAULT NULL,
price float DEFAULT NULL,
discount float DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table books
INSERT INTO books (company, id, type, page, price, discount) VALUES
('atlas', 11040, 'ex', 40, 40, 8),
('atlas', 11080, 'ex', 80, 70, 14),
('atlas', 11120, 'ex', 120, 110, 22),
('atlas', 11160, 'ex', 160, 150, 30),
('atlas', 11200, 'ex', 200, 170, 34),
('atlas', 11400, 'ex', 400, 370, 74);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT /;
/!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS /;
/!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

