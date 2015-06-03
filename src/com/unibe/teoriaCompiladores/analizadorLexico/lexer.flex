package com.unibe.teoriaCompiladores.analizadorLexico;

import static com.unibe.teoriaCompiladores.analizadorLexico.Tokens.*;
%%
%class AnalizadorJFlex
%type Tokens
D=[0-9]
INTEGER=[Ii][Nn][Tt][Ee][Gg][Ee][Rr]
CHAR=[Cc][hH][aA][Rr]
REAL=[Rr][eE][aA][Ll]
Esp=[\ \t\r\n]
LETRA=[A-Za-z]
WHITE=[ \t\r\n]
%{
public String Tipo;
%}
%%
"+" {return SUMA;}
"-" {return RESTA;}
"*" {return MULTIPLICACION;}
"/" {return DIVISION;}
"^" {return POTENCIA;}
{D}+{Esp}* {Tipo=yytext(); return NUMERO;}
{D}+("*"|"+"|"/"|"^"){D}+{Esp}* {Tipo=yytext(); return VALIDO;}
{Esp} {Tipo=yytext(); return SEPARADOR;}
{INTEGER} +  {Tipo=yytext(); return RESERVADA;}
{CHAR} +  {Tipo=yytext(); return RESERVADA;}
{REAL} +  {Tipo=yytext(); return RESERVADA;}
("integer")|("real")|("char") {Tipo=yytext(); return RESERVADA;}

.*|,+ {return ERROR;}