package com.github.gaogorden.refkname.services

import com.github.gaogorden.refkname.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
