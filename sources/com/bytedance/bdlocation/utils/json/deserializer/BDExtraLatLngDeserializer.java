package com.bytedance.bdlocation.utils.json.deserializer;

import com.bytedance.bdlocation.BDExtraLatLng;
import com.google.gson.h;
import com.google.gson.i;
import com.google.gson.j;
import com.google.gson.m;
import com.google.gson.p;
import java.lang.reflect.Type;

/* loaded from: classes17.dex */
public class BDExtraLatLngDeserializer implements i<BDExtraLatLng> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.gson.i
    public BDExtraLatLng deserialize(j jVar, Type type, h hVar) {
        m LJIIZILJ = jVar.LJIIZILJ();
        BDExtraLatLng bDExtraLatLng = new BDExtraLatLng();
        bDExtraLatLng.setUnshiftedLatitude(LJIIZILJ.LJJIJL("mUnshiftedLatitude").LJIIIZ());
        bDExtraLatLng.setUnshiftedLongitude(LJIIZILJ.LJJIJL("mUnshiftedLongitude").LJIIIZ());
        bDExtraLatLng.setShiftedLatitude(LJIIZILJ.LJJIJL("mShiftedLatitude").LJIIIZ());
        bDExtraLatLng.setShiftedLongitude(LJIIZILJ.LJJIJL("mShiftedLongitude").LJIIIZ());
        p LJJIJL = LJIIZILJ.LJJIJL("mUnshiftedAndEncryptedLat");
        if (LJJIJL != null) {
            bDExtraLatLng.setUnshiftedAndEncryptedLat(LJJIJL.LJJIFFI());
        }
        p LJJIJL2 = LJIIZILJ.LJJIJL("mUnshiftedAndEncryptedLng");
        if (LJJIJL2 != null) {
            bDExtraLatLng.setUnshiftedAndEncryptedLng(LJJIJL2.LJJIFFI());
        }
        p LJJIJL3 = LJIIZILJ.LJJIJL("mShiftedAndEncryptedLat");
        if (LJJIJL3 != null) {
            bDExtraLatLng.setShiftedAndEncryptedLat(LJJIJL3.LJJIFFI());
        }
        p LJJIJL4 = LJIIZILJ.LJJIJL("mShiftAndEncryptedLng");
        if (LJJIJL4 != null) {
            bDExtraLatLng.setShiftedAndEncryptedLng(LJJIJL4.LJJIFFI());
        }
        return bDExtraLatLng;
    }
}
