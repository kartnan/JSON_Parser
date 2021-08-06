package com.github.kartnan.jsonparser.services

import com.github.kartnan.jsonparser.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
