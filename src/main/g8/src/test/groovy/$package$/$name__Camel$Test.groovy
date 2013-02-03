package $package$

import static org.junit.Assert.*;

import org.gradle.api.Project
import org.gradle.testfixtures.ProjectBuilder
import org.junit.Before
import org.junit.Test

class $name;format="Camel"$Test {
    
    def Project project;
    
    @Before
    public void setUp(){
        project = ProjectBuilder.builder().build()
        new $name;format="Camel"$().apply(project)
    }
    
    @Test
    void afterApplyMyPluginProjectShouldHave(){
        //test code goes here...
    }
}
