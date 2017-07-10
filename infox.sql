create database dbinfox;
use dbinfox;

create table tbusuarios(
iduser int primary key,
usuario varchar(50) not null,
fone varchar(15),
login varchar(15) not null unique,
senha varchar(15) not null
);

describe tbusuarios;

-- crud insert creat
insert into tbusuarios(iduser, usuario, fone, login, senha) 
values (1, 'Djair Vieira', '9999-9999', 'djairvieira', '123456');

select * from tbusuarios;

insert into tbusuarios(iduser, usuario, fone, login, senha) 
values (2, 'Administrador', '9999-9999', 'admin', 'admin');

insert into tbusuarios(iduser, usuario, fone, login, senha) 
values (3, 'Bill Gates', '9999-9999', 'bill', '123456');

-- a linha abaixo modifica dados na tabela do (CRU) update

update tbusuarios set fone='8888-8888' where iduser=2;


-- a linha abaixo apaga um registro da tabela (CRUD) delete delete

delete from tbusuarios where iduser=3;

create table tbclientes(
idcli int primary key auto_increment,
nomecli varchar(50) not null,
cpfcli varchar(11) not null,
endcli varchar(100), 
numcasacli varchar(10) not null,
bairrocli varchar(50) not null,
pontorecli varchar(50) not null,
fonecli varchar(50) not null,
emailcli varchar(50)
);

describe tbclientes;
select * from tbclientes;

insert into tbclientes(idcli, nomecli, cpfcli, endcli, numcasacli, bairrocli, pontorecli, fonecli, emailcli) 
values (1, 'Carlos da Silva', '09305561435', 'Rua juarez candido carneiro', '18', 'livramento', 'por tras hsm', '9999-9999', 'djairv53@gmail.com');


create table tbos(
os int primary key auto_increment,
data_os timestamp default current_timestamp,
equipamento varchar(150) not null,
defeito varchar(150) not null,
servico varchar(150),
tecnico varchar(30),
valor decimal(10,2),
idcli int not null,
foreign key(idcli) references tbclientes(idcli)
);

describe tbos;
select * from tbos;

insert into tbos (equipamento, defeito, servico, tecnico, valor, idcli)
values ('Notbook', 'nao liga', 'troca da fonte', 'ze', 87.50, 1);  


-- o codigo abaixo traz informacoes de duas tabelas inner join

select 
O.os,equipamento,defeito,servico,valor,
C.nomecli,fonecli
from tbos as O
inner join tbclientes as C
on (O.idcli = C.idcli);




