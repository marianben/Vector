drop database if exists MyShop;
create database MyShop;
use MyShop;

create table Supplier(
		SupplierID int primary key auto_increment,
        supplier_name varchar(50) not null,
        city varchar(65) not null,
		country varchar(65) not null
);

create table Categories(
		CategoryID int primary key auto_increment,
        category_name varchar(50) not null,
		description varchar(255) not null
);

create table Products(
  ProductsID int primary key auto_increment,
        products_name varchar(50) not null,
        supplier_fk_id int NULL,
        category_fk_id int NULL,
        price decimal (5,2) not null default 0,
        FOREIGN KEY (category_fk_id) REFERENCES Categories(CategoryID),
        FOREIGN KEY (supplier_fk_id) REFERENCES Supplier(SupplierID)
 );


insert into Supplier( supplier_name,city,country)
		values('ExoticLiquid' , 'London', 'UK'),
			  ('New Orleans Cajun Delights', 'New Orleans', 'USA'),
			  ('Grandma Kelly’s Homestead', 'Ann Arbor', 'USA'),
			  ('Tokyo Traders','Tokyo','Japan'),
			  ('Cooperativa de Quesos' ,'Las Cabras','Oviedo;Spain');


 insert into Categories( category_name,description)
		values('Beverages','Soft drinks, coffees, teas, beers, and ales'),
			  ('Condiments', 'Sweet and savory sauces, relishes, spreads, and seasonings'),
			  ('Confections','Desserts, candies, and sweet breads'),
			  ('Dairy Products','Cheeses'),
			  ('Grains/Cereals','Breads, crackers, pasta, and cereal');

insert into Products( products_name,supplier_fk_id, category_fk_id,price)
  values('Chais','1','1',18.00),
     ('Chang','1','1',19.00),
     ('Aniseed Syrup','1','2',10.00),
     ('Chef Anton’s Cajun Seasoning','2','2',22.00),
     ('Chef Anton’s Gumbo Mix','2','2',21.35);              
     
SELECT * FROM Products WHERE products_name Like 'C%';

SELECT MIN(price), products_name
FROM Products;

SELECT SUM(price)
FROM Products
WHERE  supplier_fk_id = 2;
 
 SELECT SUM(Price) FROM Products pr 
                        INNER JOIN Supplier s 
                                   ON pr.supplier_fk_id = s.SupplierID 
                                       where s.Country='USA';
                                       
SELECT *  FROM Supplier s
		INNER JOIN Products pr
				ON pr.supplier_fk_id  =  s.SupplierID  
						WHERE pr.category_fk_id = 2;
                        
INSERT INTO Supplier( supplier_name,city,country)
  VALUES('Norske Meieier' , 'Lviv', 'Ukraine');
 
insert into Products( products_name,supplier_fk_id, category_fk_id,price)
  values('Green tea','6','1',10.00) ;      
  /*
  or 
  SELECT DISTINCT Supplier.SupplierName, Supplier.City, Supplier.Country
 FROM (( Supplier INNER JOIN Products ON Supplier.SupplierID = Products.supplier_fk_id)
 INNER JOIN Categories ON Products.category_fk_id = Categories.CategoryID)
 WHERE Categories.CategoryName = 'Condiments';
  
  */
  
  
