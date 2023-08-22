# agencia

## Criar um projeto no Maven  
mvn archetype:generate -DgroupId=br.com.senai -DartifactId=agencia -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false

## Acessar o projeto 
    cd nome_do_projeto

## Inicializar o versionamento
    git init

## Adicionar os arquivos do projeto
    git add . (o ponto informa que irá adicionar tudo)

## Colocar o comentario no versionamento 
    git commit -m "coloque o seu comentario"

## Criar um repositorio na minha conta do GitHub com nome do projeto
    Ex.: agencia | agenciaRh ou agencia-rh

## Capturar o link do git remote em ssh
    Ex.: git@github.com:AnaLuiizaM/agencia.git

## Subir o projeto para o GitHub 
    git push ~u origin (ou branch atual)