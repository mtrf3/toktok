package com.bytedance.ies.nle.editor_jni;

import X.AnonymousClass073;
import X.C5OJ;
import X.V0N;

/* loaded from: classes3.dex */
public enum NLEVEOperationResType {
    UNKNOWN(-1),
    VIDEO(0),
    AUDIO,
    FILTER_NORMAL,
    FILTER_COMPOSER,
    FILTER_AMAZING,
    EFFECT_NORMAL(5),
    EFFECT_COMPOSER,
    EFFECT_AMAZING,
    EFFECT_TIME,
    STICKER_INFO,
    STICKER_IMAGE(10),
    STICKER_TEXT,
    STICKER_SUBTITLE,
    STICKER_EMOJI,
    TRANSITION,
    MASK(15);

    public final int swigValue;

    public final int swigValue() {
        return this.swigValue;
    }

    public static NLEVEOperationResType swigToEnum(int i) {
        NLEVEOperationResType[] nLEVEOperationResTypeArr = (NLEVEOperationResType[]) NLEVEOperationResType.class.getEnumConstants();
        if (i < nLEVEOperationResTypeArr.length && i >= 0) {
            NLEVEOperationResType nLEVEOperationResType = nLEVEOperationResTypeArr[i];
            if (nLEVEOperationResType.swigValue == i) {
                return nLEVEOperationResType;
            }
        }
        for (NLEVEOperationResType nLEVEOperationResType2 : nLEVEOperationResTypeArr) {
            if (nLEVEOperationResType2.swigValue == i) {
                return nLEVEOperationResType2;
            }
        }
        throw new IllegalArgumentException(AnonymousClass073.LIZ("No enum ", NLEVEOperationResType.class, " with value ", i));
    }

    public static NLEVEOperationResType valueOf(String str) {
        return (NLEVEOperationResType) V0N.LJJJ(NLEVEOperationResType.class, str);
    }

    NLEVEOperationResType() {
        int i = C5OJ.LIZ;
        C5OJ.LIZ = i + 1;
        this.swigValue = i;
    }

    NLEVEOperationResType(NLEVEOperationResType nLEVEOperationResType) {
        int i = nLEVEOperationResType.swigValue;
        this.swigValue = i;
        C5OJ.LIZ = i + 1;
    }

    NLEVEOperationResType(int i) {
        this.swigValue = i;
        C5OJ.LIZ = i + 1;
    }
}
