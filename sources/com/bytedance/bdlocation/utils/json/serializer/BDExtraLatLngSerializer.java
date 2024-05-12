package com.bytedance.bdlocation.utils.json.serializer;

import com.bytedance.bdlocation.BDExtraLatLng;
import com.google.gson.j;
import com.google.gson.m;
import com.google.gson.q;
import com.google.gson.r;
import java.lang.reflect.Type;

/* loaded from: classes17.dex */
public class BDExtraLatLngSerializer implements r<BDExtraLatLng> {
    @Override // com.google.gson.r
    public j serialize(BDExtraLatLng bDExtraLatLng, Type type, q qVar) {
        m mVar = new m();
        mVar.LJJIIJ("mUnshiftedLatitude", Double.valueOf(bDExtraLatLng.getUnshiftedLatitude()));
        mVar.LJJIIJ("mUnshiftedLongitude", Double.valueOf(bDExtraLatLng.getUnshiftedLongitude()));
        mVar.LJJIIJ("mShiftedLatitude", Double.valueOf(bDExtraLatLng.getShiftedLatitude()));
        mVar.LJJIIJ("mShiftedLongitude", Double.valueOf(bDExtraLatLng.getShiftedLongitude()));
        mVar.LJJIIZ("mUnshiftedAndEncryptedLat", bDExtraLatLng.getUnshiftedAndEncryptedLat());
        mVar.LJJIIZ("mUnshiftedAndEncryptedLng", bDExtraLatLng.getUnshiftedAndEncryptedLng());
        mVar.LJJIIZ("mShiftedAndEncryptedLat", bDExtraLatLng.getShiftedAndEncryptedLat());
        mVar.LJJIIZ("mShiftedAndEncryptedLng", bDExtraLatLng.getShiftedAndEncryptedLng());
        return mVar;
    }
}
