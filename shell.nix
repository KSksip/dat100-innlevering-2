{ pkgs ? import <nixpkgs> {} }:
let 
  cwd = builtins.toString ./.;
in
with pkgs; mkShell {

  packages = [
    jdk25
    maven
    bashInteractive
  ];

  JAVA_HOME_25 = "${jdk25}/lib/openjdk";
}