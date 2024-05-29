USE bookmyshow;

-- Inserimento dati nella tabella 'table_bookings'
INSERT INTO `table_bookings`
VALUES
(32,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0),
(33,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0),
(34,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0),
(35,0,0,0,1,0,1,0,0,0,0,0,0,0,0,0),
(36,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0);

-- Inserimento dati nella tabella 'table_city'
INSERT INTO `table_city`
VALUES
(1, 'Bengaluru', '590056', 'Karnataka'),
(2, 'Belagavi', '590059', 'Karnataka'),
(3, 'Maysuru', '590103', 'Karnataka');

-- Inserimento dati nella tabella 'table_movie'
INSERT INTO `table_movie`
VALUES
(10, 'description about the WAR 3 movie here', 'WAR 3 directors', 'WAR 3'),
(11, 'description about the WAR 3 movie here', 'Remo', 'Street Dance 3');

-- Inserimento dati nella tabella 'table_show'
INSERT INTO `table_show`
VALUES
(12, '2020-04-04 09:00:00', 10, 4),
(13, '2020-04-04 12:00:00', 10, 4),
(14, '2020-04-04 15:00:00', 10, 4),
(15, '2020-04-04 18:00:00', 10, 4),
(16, '2020-04-04 21:00:00', 10, 4),
(17, '2020-04-04 15:00:00', 11, 4),
(18, '2020-04-04 21:00:00', 11, 4),
(19, '2020-04-04 09:00:00', 10, 5),
(20, '2020-04-04 21:00:00', 10, 5),
(21, '2020-04-04 21:00:00', 10, 6),
(22, '2020-04-04 21:00:00', 10, 7),
(23, '2020-04-04 21:00:00', 10, 8),
(24, '2020-04-04 15:00:00', 10, 9),
(25, '2020-04-04 18:00:00', 11, 9),
(26, '2020-04-04 18:00:00', 11, 8),
(27, '2020-04-04 18:00:00', 11, 7),
(28, '2020-04-04 18:00:00', 11, 6),
(29, '2020-04-04 18:00:00', 11, 5),
(30, '2020-04-04 18:00:00', 11, 4),
(32, '2020-04-04 18:00:00', 10, 9),
(33, '2020-04-04 18:00:00', 10, 9),
(34, '2020-04-04 18:00:00', 10, 4),
(35, '2020-04-04 18:00:00', 10, 5),
(36, '2020-04-04 18:00:00', 10, 6);

-- Inserimento dati nella tabella 'table_theater'
INSERT INTO `table_theater`
VALUES
(4, 'Koramangala', 'Finox mall', 1),
(5, 'Koramangala', 'PVR Koramangala', 1),
(6, 'RD Collage POST', 'Shrinival Theater', 1),
(7, 'Head post office', 'INOX Cinema', 2),
(8, 'Goods shed Road', 'Chitra Theater', 2),
(9, 'Old school theater road', 'Rajkamal theater', 3);
