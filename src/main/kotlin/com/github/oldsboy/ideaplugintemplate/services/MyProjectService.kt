package com.github.oldsboy.ideaplugintemplate.services

import com.intellij.openapi.project.Project
import com.github.oldsboy.ideaplugintemplate.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
