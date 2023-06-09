PGDMP     /    '                {            BDYOYADEFINITIVO    15.2    15.2     	           0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false            
           0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false                       0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false                       1262    16773    BDYOYADEFINITIVO    DATABASE     �   CREATE DATABASE "BDYOYADEFINITIVO" WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE_PROVIDER = libc LOCALE = 'Spanish_Spain.1252';
 "   DROP DATABASE "BDYOYADEFINITIVO";
                postgres    false            �            1259    16833    cargo    TABLE     �   CREATE TABLE public.cargo (
    id_cargo character varying(1) NOT NULL,
    nombre_cargo character varying(30),
    CONSTRAINT ck_nombre_cargo CHECK ((nombre_cargo IS NOT NULL))
);
    DROP TABLE public.cargo;
       public         heap    postgres    false            �            1259    16840    usuario    TABLE     �  CREATE TABLE public.usuario (
    id_usuarios integer NOT NULL,
    name_usuario character varying(12),
    pass_usuario character varying(80),
    nombre_completo character varying(35),
    cargo character varying(1),
    estado boolean,
    pregunta_secreta character varying(30),
    respuesta_secreta character varying(30),
    CONSTRAINT ck_estado CHECK ((estado = ANY (ARRAY[true, false]))),
    CONSTRAINT ck_name_usuario CHECK ((name_usuario IS NOT NULL)),
    CONSTRAINT ck_nombre_completo CHECK ((nombre_completo IS NOT NULL)),
    CONSTRAINT ck_pass_usuario CHECK ((pass_usuario IS NOT NULL)),
    CONSTRAINT ck_pregunta_secreta CHECK ((pregunta_secreta IS NOT NULL)),
    CONSTRAINT ck_respuesta_secreta CHECK ((respuesta_secreta IS NOT NULL))
);
    DROP TABLE public.usuario;
       public         heap    postgres    false            �            1259    16839    usuario_id_usuarios_seq    SEQUENCE     �   CREATE SEQUENCE public.usuario_id_usuarios_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 .   DROP SEQUENCE public.usuario_id_usuarios_seq;
       public          postgres    false    216                       0    0    usuario_id_usuarios_seq    SEQUENCE OWNED BY     S   ALTER SEQUENCE public.usuario_id_usuarios_seq OWNED BY public.usuario.id_usuarios;
          public          postgres    false    215            i           2604    16843    usuario id_usuarios    DEFAULT     z   ALTER TABLE ONLY public.usuario ALTER COLUMN id_usuarios SET DEFAULT nextval('public.usuario_id_usuarios_seq'::regclass);
 B   ALTER TABLE public.usuario ALTER COLUMN id_usuarios DROP DEFAULT;
       public          postgres    false    215    216    216                      0    16833    cargo 
   TABLE DATA           7   COPY public.cargo (id_cargo, nombre_cargo) FROM stdin;
    public          postgres    false    214   m                 0    16840    usuario 
   TABLE DATA           �   COPY public.usuario (id_usuarios, name_usuario, pass_usuario, nombre_completo, cargo, estado, pregunta_secreta, respuesta_secreta) FROM stdin;
    public          postgres    false    216   �                  0    0    usuario_id_usuarios_seq    SEQUENCE SET     E   SELECT pg_catalog.setval('public.usuario_id_usuarios_seq', 2, true);
          public          postgres    false    215            r           2606    16838    cargo pk_cargp 
   CONSTRAINT     R   ALTER TABLE ONLY public.cargo
    ADD CONSTRAINT pk_cargp PRIMARY KEY (id_cargo);
 8   ALTER TABLE ONLY public.cargo DROP CONSTRAINT pk_cargp;
       public            postgres    false    214            t           2606    16850    usuario pk_usuario 
   CONSTRAINT     Y   ALTER TABLE ONLY public.usuario
    ADD CONSTRAINT pk_usuario PRIMARY KEY (id_usuarios);
 <   ALTER TABLE ONLY public.usuario DROP CONSTRAINT pk_usuario;
       public            postgres    false    216            u           2606    16851    usuario fk_cargo_usuario    FK CONSTRAINT     {   ALTER TABLE ONLY public.usuario
    ADD CONSTRAINT fk_cargo_usuario FOREIGN KEY (cargo) REFERENCES public.cargo(id_cargo);
 B   ALTER TABLE ONLY public.usuario DROP CONSTRAINT fk_cargo_usuario;
       public          postgres    false    3186    216    214               %   x�3�tt����	rt��2���w��b���� z,         �   x�e���0��󦊭�!!99;$�q�A:^�@6bM6fԣ�}��
.|����g�e2�\��,�2�$u��q-�2I�(����-a��	��Ý��E8r���wx8P �āz�������:l���d!�l���f^�LW&5I��.���ij�\�ӽ�4�l�9�������hˁ����@~3[�����<�     