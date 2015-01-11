# MyLib
Projeto lib que faz deploy em um arquivo local no computador.
Ver gradle.properties e build.gradle

1) Adicionar No arquivo app/build.gradle:

<pre>
apply plugin: 'maven'
</pre>

<pre>
uploadArchives {
    repositories {
        mavenDeployer {
            //repository(url: "file:///R:/gradle/rep/")
            repository(url: "file:///home/ricardo/gradle/rep")

            pom.groupId = GROUP
            pom.artifactId = POM_ARTIFACT_ID
            pom.version = VERSION_NAME
        }
    }
}

task install(dependsOn: uploadArchives)
</pre>

2) Adicionar no app/gradle.properties:

<pre>
POM_ARTIFACT_ID=mylib
VERSION_NAME=0.0.1
GROUP=br.com.livroandroid
</pre>

3) Para fazer deploy executar a task install.