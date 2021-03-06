DESCRIPTION = "Broadcom AP6210 firmware files"
SECTION = "connectivity"

SRC_URI = "git://github.com/ARMWorks/dibs.git;branch=master;protocol=https;rev=bee5cbc03bb078b664cd08733b46d88142189dff \
           https://android.googlesource.com/platform/hardware/broadcom/wlan/+/gingerbread-mr4-release/bcm4329/firmware/LICENSE.TXT"

LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://${WORKDIR}/LICENSE.TXT;md5=02de91ee94eb0b66f407f5cef55e1629"

S = "${WORKDIR}/git/targets/nanopi_overlay/lib/firmware/ap6210/"

FILES_${PN} += "/lib/firmware/*"

do_compile() {
}

do_install() {
        install -v -d  ${D}/lib/firmware/ap6210/
        install -m 0755 bcm20702a.hcd ${D}/lib/firmware/ap6210/
        install -m 0755 fw_bcm40181a2.bin ${D}/lib/firmware/ap6210/
        install -m 0755 fw_bcm40181a2_apsta.bin ${D}/lib/firmware/ap6210/
        install -m 0755 fw_bcm40181a2_p2p.bin ${D}/lib/firmware/ap6210/
        install -m 0755 nvram.txt ${D}/lib/firmware/ap6210/
}

SRC_URI[md5sum] = "02de91ee94eb0b66f407f5cef55e1629"
SRC_URI[sha256sum] = "57e64c76b4e3bccb95a8f5fe995ead069a4e21660cc61acf9f2b33a0e53f677d"
