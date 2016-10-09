SUMMARY = "Qt5 QML test app"
HOMEPAGE = "http://www.jumpnowtek.com"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=7e906140db3bf8fa79fd876d9fdd0b1e"

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
