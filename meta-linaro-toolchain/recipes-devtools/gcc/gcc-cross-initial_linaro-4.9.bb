BASEPV = "4.9"
PV = "linaro-${BASEPV}"
require recipes-devtools/gcc/gcc-cross_${PV}.bb
require recipes-devtools/gcc/gcc-cross-initial.inc
