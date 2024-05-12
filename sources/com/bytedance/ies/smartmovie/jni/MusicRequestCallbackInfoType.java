package com.bytedance.ies.smartmovie.jni;

import X.AnonymousClass073;
import X.C45230Hp4;
import X.V0N;

/* loaded from: classes8.dex */
public enum MusicRequestCallbackInfoType {
    BEFORE_EXTRACTOR(0),
    AFTER_EXTRACTOR(1),
    ZIP_GENERATE_SUCCESS(2),
    ZIP_UPLOAD_TOS_SUCCESS(3),
    RESPONSE_SUCCESS(4),
    REQUEST_ERROR(5);

    public final int swigValue;

    public final int swigValue() {
        return this.swigValue;
    }

    public static MusicRequestCallbackInfoType swigToEnum(int i) {
        MusicRequestCallbackInfoType[] musicRequestCallbackInfoTypeArr = (MusicRequestCallbackInfoType[]) MusicRequestCallbackInfoType.class.getEnumConstants();
        if (i < musicRequestCallbackInfoTypeArr.length && i >= 0) {
            MusicRequestCallbackInfoType musicRequestCallbackInfoType = musicRequestCallbackInfoTypeArr[i];
            if (musicRequestCallbackInfoType.swigValue == i) {
                return musicRequestCallbackInfoType;
            }
        }
        for (MusicRequestCallbackInfoType musicRequestCallbackInfoType2 : musicRequestCallbackInfoTypeArr) {
            if (musicRequestCallbackInfoType2.swigValue == i) {
                return musicRequestCallbackInfoType2;
            }
        }
        throw new IllegalArgumentException(AnonymousClass073.LIZ("No enum ", MusicRequestCallbackInfoType.class, " with value ", i));
    }

    public static MusicRequestCallbackInfoType valueOf(String str) {
        return (MusicRequestCallbackInfoType) V0N.LJJJ(MusicRequestCallbackInfoType.class, str);
    }

    MusicRequestCallbackInfoType() {
        int i = C45230Hp4.LIZ;
        C45230Hp4.LIZ = i + 1;
        this.swigValue = i;
    }

    MusicRequestCallbackInfoType(MusicRequestCallbackInfoType musicRequestCallbackInfoType) {
        int i = musicRequestCallbackInfoType.swigValue;
        this.swigValue = i;
        C45230Hp4.LIZ = i + 1;
    }

    MusicRequestCallbackInfoType(int i) {
        this.swigValue = i;
        C45230Hp4.LIZ = i + 1;
    }
}
