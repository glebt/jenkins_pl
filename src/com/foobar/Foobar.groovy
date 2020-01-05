#!groovy
package com.foobar

def foobarHellow() {
    print "I am the foobarHellow() function from Foobar.groovy\n"
}

def createConfig() {
    def myConfigTemplate = new File("config.template") 
    // read content
    def myConfigTemplateText = myConfigTemplate.text
    // replace placeholders
    myConfigTemplateText = (myConfigTemplateText =~ /CLIENT_SECRET/).replaceFirst("UIOPPOIUO12345_CLIENT_SECRET")
    myConfigTemplateText = (myConfigTemplateText =~ /ACCESS_TOKEN/).replaceFirst("ABCDEFHREPIJOPIJPOU!_ACCESS_TOKEN")
    // write to config
    def myConfig = new File("config") 
    myConfig.write(myConfigTemplateText)
}

return this
