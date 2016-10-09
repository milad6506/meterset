SUMMARY = "Qt5 QML test app"
HOMEPAGE = "http://www.jumpnowtek.com"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=0835ade698e0bcf8506ecda2f7b4f302"

DEPENDS += "qtdeclarative"

PR = "r0"

SRCREV = "${AUTOREV}"
SRC_URI = "git://github.com/milad6506/meterset.git"

S = "${WORKDIR}/git"

require recipes-qt/qt5/qt5.inc

do_install() {
    install -d ${D}${bindir}
    install -m 0755 ${B}/${PN} ${D}${bindir}
}

FILES_${PN} = "${bindir}"

RDEPENDS_${PN} = "qtdeclarative-qmlplugins"
