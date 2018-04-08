INSERT INTO cars (make, model, year)
VALUES
  ('Honda', 'Accord', 2012),
  ('Toyota', 'Camry', 2014),
  ('Honda', 'Civic', 2015),
  ('Subaru', 'Legacy', 2018);

INSERT INTO auto_prices (car_id, package, price)
VALUES (2, 'Economy', 15000);

INSERT INTO auto_prices (car_id, package, price)
VALUES
  (1, 'Economy', 12500),
  (1, 'Standard', 18000),
  (1, 'Navigation', 19500),
  (1, 'Luxury', 24000),
  (1, 'Opulent', 95000);

INSERT INTO auto_prices (car_id, package, price)
VALUES
  (3, 'Economy', 10500),
  (3, 'Standard', 16000),
  (3, 'Navigation', 17500),
  (3, 'Luxury', 22000),
  (3, 'Opulent', 93000);
-------------------------------------- Person Builder

INSERT INTO person (LAST_NAME, FIRST_NAME, MOBILE, BIRTHDAY)
VALUES
  ('Hendricks', 'Joe', '489-1813', '1987-04-15'),
  ('Kuderski', 'Jess', '489-1515', '1984-08-21'),
  ('Vila', 'Bob', '555-6666', '1948-06-20'),
  ('Iommi', 'Tony', '666-4311', '1946-04-03');


