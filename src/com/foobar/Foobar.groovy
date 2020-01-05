#!groovy
package com.foobar

def foobarHellow() {
    print "I am the foobarHellow() function from Foobar.groovy\n"
}

def createConfig() {
    def myConfigTemplateText = readFile file: "config.template"

    // replace placeholders
    myConfigTemplateText = (myConfigTemplateText =~ /CLIENT_SECRET/).replaceFirst("UIOPPOIUO12345_CLIENT_SECRET")
    myConfigTemplateText = (myConfigTemplateText =~ /ACCESS_TOKEN/).replaceFirst("ABCDEFHREPIJOPIJPOU!_ACCESS_TOKEN")

    writeFile file: "config", text: myConfigTemplateText
}

return this
