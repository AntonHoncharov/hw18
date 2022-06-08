package SQL;

public class SQL {

    CREATE TABLE public."user"
            (
    user_id integer NOT NULL GENERATED ALWAYS AS IDENTITY ( CYCLE INCREMENT 1 START 1 MINVALUE 1 MAXVALUE 2147483647 CACHE 1 ),
    name character varying(100) COLLATE pg_catalog."default" NOT NULL,
    surname character varying(100) COLLATE pg_catalog."default" NOT NULL,
    date_of_registration date NOT NULL,
    CONSTRAINT user_pkey PRIMARY KEY (user_id)
)

    TABLESPACE pg_default;

    CREATE TABLE public.wallet
            (
                    wallet_id integer NOT NULL GENERATED ALWAYS AS IDENTITY ( CYCLE INCREMENT 1 START 1 MINVALUE 1 MAXVALUE 2147483647 CACHE 1 ),
    currency character varying(100) NOT NULL,
    amount integer NOT NULL,
    user_id integer NOT NULL,
    created date NOT NULL,
    CONSTRAINT wallet_pkey PRIMARY KEY (wallet_id),
    CONSTRAINT fk_user_id_wallet FOREIGN KEY (user_id)
    REFERENCES public."user" (user_id) MATCH SIMPLE
    ON UPDATE NO ACTION
    ON DELETE NO ACTION
)

    TABLESPACE pg_default;

    INSERT INTO public."user"(
    name, surname, date_of_registration)
    VALUES ('Alex ', 'Smith', '2022-06-01');

    INSERT INTO public."user"(
    name, surname, date_of_registration)
    VALUES ('Anthony ', 'Johnson', '2022-06-01');

    INSERT INTO public."user"(
    name, surname, date_of_registration)
    VALUES ('Brandon ', 'Williams', '2022-06-01');

    INSERT INTO public."user"(
    name, surname, date_of_registration)
    VALUES ('Christopher ', 'Brown', '2022-06-01');

    INSERT INTO public."user"(
    name, surname, date_of_registration)
    VALUES ('David ', 'Wilson', '2022-06-01');

    INSERT INTO public.wallet(
            currency, amount, user_id, created)
    VALUES ('USD', 5555, 1, '2022-06-01');

    INSERT INTO public.wallet(
            currency, amount, user_id, created)
    VALUES ('USD', 6666, 2, '2022-06-01');

    INSERT INTO public.wallet(
            currency, amount, user_id, created)
    VALUES ('USD', 7777, 3, '2022-06-01');

    INSERT INTO public.wallet(
            currency, amount, user_id, created)
    VALUES ('USD', 8888, 4, '2022-06-01');

    INSERT INTO public.wallet(
            currency, amount, user_id, created)
    VALUES ('USD', 9999, 5, '2022-06-01');

    SELECT name, currency, amount FROM public.user JOIN public.wallet ON "user".user_id = wallet.user_id;


}
