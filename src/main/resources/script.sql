-- Add the following movies to the movies table using an insert statement
INSERT INTO movies ( Title, Runtime, Genre, IMDB_Score, Rating)
VALUES ('Howard the Duck', 110,  'Sci-Fi',  4.6, 'PG'),
('Lavalantula', 83,  'Horror',  4.7, 'TV-14'),
('Starship Troopers', 129,  'Sci-Fi',  7.2, 'PG-13'),
('Waltz With Bashir', 90,  'Documentary',  8.0, 'R'),
('Spaceballs', 96,  'Comedy',  7.1, 'PG'),
('Monsters Inc.', 92,  'Animation',  8.1, 'G'),
('BaseketBall', 103, 'Comedy', 6.6, 'R'),
('Dune', 137, 'Sci-Fi', 6.6, 'PG-13'),
('Moon', 97, 'Sci-Fi', 7.9, 'R'),
('Honey I Blew Up the Kid', 89, 'Comedy', 4.7, 'PG');

-- Create a query to find all movies in the Sci-Fi genre.
SELECT * FROM movies
WHERE genre = 'Sci-Fi';

-- Create a query to find all films that scored at least a 6.5 on IMDB
SELECT * FROM movies
WHERE IMDB_Score >= 6.5;

-- For parents who have young kids, but who don't want to sit through long
-- children's movies, create a query to find all of the movies rated G or PG
-- that are less than 100 minutes long.
SELECT * FROM movies
WHERE Rating = 'G' OR Rating = 'PG' AND Runtime < 100;

-- Create a query to show the average runtimes of movies scoring below a 7.5
--  on imdb, grouped by their respective genres.
SELECT AVG(Runtime)
FROM movies
WHERE IMDB_Score < 7.5 GROUP BY genre;


-- There's been a data entry mistake; Starship Troopers is actually rated R,
-- not PG-13. Create a query that finds the movie by its title and changes its
-- rating to R.
UPDATE movies
SET Rating = 'R'
WHERE title = 'Starship Troopers';

-- Show the ID number and rating of all of the Horror and Documentary movies
--  in the database. Do this in only one query.
SELECT Id, Rating
FROM movies
WHERE Genre = 'Horror' OR Genre = 'Documentary';

-- This time let's find the average, maximum, and minimum IMDB score for movies of each rating. -->
SELECT AVG(IMDB_Score),
MAX(IMDB_Score),
MIN(IMDB_Score)
FROM movies GROUP BY rating;

-- That last query isn't very informative for ratings that only have 1 entry. use a HAVING COUNT(*) > 1 clause
-- to only show ratings with multiple movies showing.
SELECT AVG(IMDB_Score),
MIN(IMDB_Score),
MAX(IMDB_Score)
FROM movies GROUP BY rating HAVING COUNT(*) > 1;

-- Let's make our movie list more child-friendly. Delete all entries that have a rating of R.
DELETE FROM movies
WHERE rating = 'R';