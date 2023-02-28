package com.jaytala.whatsappui.model

class ModelData {

    lateinit var name:String
    var img:Int = 0

    constructor(name: String, img: Int) {
        this.name = name
        this.img = img
    }
}