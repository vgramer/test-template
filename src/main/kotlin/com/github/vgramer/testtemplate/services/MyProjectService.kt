package com.github.vgramer.testtemplate.services

import com.intellij.openapi.project.Project
import com.github.vgramer.testtemplate.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
