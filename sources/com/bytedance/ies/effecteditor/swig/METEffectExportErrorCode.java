package com.bytedance.ies.effecteditor.swig;

import X.AnonymousClass073;
import X.V0N;

/* loaded from: classes16.dex */
public enum METEffectExportErrorCode {
    METEffectExportErrorCode_None(0),
    METEffectExportErrorCode_NoEffect,
    METEffectExportErrorCode_Failed,
    METEffectExportErrorCode_Timeout;

    public final int swigValue;

    /* loaded from: classes16.dex */
    public static class SwigNext {
        public static int next;
    }

    public final int swigValue() {
        return this.swigValue;
    }

    public static METEffectExportErrorCode swigToEnum(int i) {
        METEffectExportErrorCode[] mETEffectExportErrorCodeArr = (METEffectExportErrorCode[]) METEffectExportErrorCode.class.getEnumConstants();
        if (i < mETEffectExportErrorCodeArr.length && i >= 0) {
            METEffectExportErrorCode mETEffectExportErrorCode = mETEffectExportErrorCodeArr[i];
            if (mETEffectExportErrorCode.swigValue == i) {
                return mETEffectExportErrorCode;
            }
        }
        for (METEffectExportErrorCode mETEffectExportErrorCode2 : mETEffectExportErrorCodeArr) {
            if (mETEffectExportErrorCode2.swigValue == i) {
                return mETEffectExportErrorCode2;
            }
        }
        throw new IllegalArgumentException(AnonymousClass073.LIZ("No enum ", METEffectExportErrorCode.class, " with value ", i));
    }

    public static METEffectExportErrorCode valueOf(String str) {
        return (METEffectExportErrorCode) V0N.LJJJ(METEffectExportErrorCode.class, str);
    }

    METEffectExportErrorCode() {
        int i = SwigNext.next;
        SwigNext.next = i + 1;
        this.swigValue = i;
    }

    METEffectExportErrorCode(METEffectExportErrorCode mETEffectExportErrorCode) {
        int i = mETEffectExportErrorCode.swigValue;
        this.swigValue = i;
        SwigNext.next = i + 1;
    }

    METEffectExportErrorCode(int i) {
        this.swigValue = i;
        SwigNext.next = i + 1;
    }
}
