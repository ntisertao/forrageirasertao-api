CREATE TABLE IF NOT EXISTS forrageira (
	id                    serial NOT NULL,
	nome_cientifico       varchar(255) NOT NULL,
	nome_comum            varchar(255) NOT NULL,
	genero                varchar(255) NOT NULL,
	origem                varchar(255) NOT NULL,
	exigencia_fertilidade integer NOT NULL,
	precipiticao_minima   integer NOT NULL,
	tolerancia_alagamento BOOLEAN NOT NULL,
	tolerancia_seca       integer NOT NULL,
	tolerancia_frio       integer NOT NULL,
	CONSTRAINT forrageira_pk PRIMARY KEY (id)
);