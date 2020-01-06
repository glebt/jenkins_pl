#!groovy
package com.foobar

def foobarHellow() {
    print "I am the foobarHellow() function from Foobar.groovy\n"
}

def createConfig(clientId, accessToken) {
    def myConfigTemplateText = readFile file: "config.template"

    // replace placeholders
    myConfigTemplateText = (myConfigTemplateText =~ /CLIENT_SECRET/).replaceFirst(clientId)
    myConfigTemplateText = (myConfigTemplateText =~ /ACCESS_TOKEN/).replaceFirst(accessToken)

    writeFile file: "config", text: myConfigTemplateText
}

return this
