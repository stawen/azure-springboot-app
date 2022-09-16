# demo-springboot-app

Projet a base de Spring boot pour livrer sur des services Azure

A base du projet : <https://github.com/spring-guides/gs-spring-boot/>

## Usage

V1.0.0 : Blue Version Page
V2.0.0 : Green Version Page

## Jenkins job

https://jenkins.maif.local/job/cloud-platform-azure/job/examples-demo-springboot-app/

Le pipeline utilisé par jenkins est basé sur le fow [TrunkBased](https://pages.github.maif.local/forge/maif-pipeline-library/guide/devflows/#trunkbasedflow)

## Output

## HTML

`Demo Spring Boot V(n)`

Color Green or Blue

## Sytem Out

On start : `Let's start Spring Boot`

On each web call : `2021-09-13T07-42-45.5063Z - Demo Cloud APP - V2.0`

Les system Out d'une application SpringBoot remote directement dans un LAW si les diagnostic settings sont activés.
