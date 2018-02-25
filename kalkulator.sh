#! /system/bin/sh
# 25 / 02 / 2018
# KALKULATOR CLI  © created by Hendriyawan
# github : @github.com/Hendriyawan
# facebook : www.fb.com/hendri.glanex
# email : hendrijs44@gmail.com
# Thanks to Nizar Ibrahim

base=$PWD/kalkulator.jar
if [ ! -f $base ]; then
    echo "file kalkulator.jar tidak ditemukan !"
    exit 1
else
    dalvikvm -classpath $base Main "$@"
fi