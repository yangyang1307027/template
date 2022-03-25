package com.github.yangyang1307027.template.services

import com.intellij.openapi.project.Project
import com.github.yangyang1307027.template.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
