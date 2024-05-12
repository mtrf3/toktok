package com.bytedance.ies.effectcreator.swig;

import X.V0N;
import X.X1D;

/* loaded from: classes34.dex */
public enum ErrorType {
    ErrorType_Success(0),
    ErrorType_Failed,
    ErrorType_LoadFailed,
    ErrorType_SaveFailed,
    ErrorType_ExportEffectFailed,
    ErrorType_ApplyToEffectFailed,
    ErrorType_InvalidParameter,
    ErrorType_NullEffectHandle,
    ErrorType_ParseFailed,
    ErrorType_DumpFailed,
    ErrorType_EffectSdkErrorCode,
    ErrorType_EffectPartSyncError,
    ErrorType_OpenOldDraftWithInteractionUnsupported,
    ErrorType_TargetResourceUnsupported;

    public final int swigValue;

    /* loaded from: classes34.dex */
    public static class SwigNext {
        public static int next;
    }

    public final int swigValue() {
        return this.swigValue;
    }

    public static ErrorType swigToEnum(int i) {
        ErrorType[] errorTypeArr = (ErrorType[]) ErrorType.class.getEnumConstants();
        if (i < errorTypeArr.length && i >= 0) {
            ErrorType errorType = errorTypeArr[i];
            if (errorType.swigValue == i) {
                return errorType;
            }
        }
        for (ErrorType errorType2 : errorTypeArr) {
            if (errorType2.swigValue == i) {
                return errorType2;
            }
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("No enum ");
        LIZ.append(ErrorType.class);
        LIZ.append(" with value ");
        LIZ.append(i);
        throw new IllegalArgumentException(X1D.LIZIZ(LIZ));
    }

    public static ErrorType valueOf(String str) {
        return (ErrorType) V0N.LJJJ(ErrorType.class, str);
    }

    ErrorType() {
        int i = SwigNext.next;
        SwigNext.next = i + 1;
        this.swigValue = i;
    }

    ErrorType(ErrorType errorType) {
        int i = errorType.swigValue;
        this.swigValue = i;
        SwigNext.next = i + 1;
    }

    ErrorType(int i) {
        this.swigValue = i;
        SwigNext.next = i + 1;
    }
}
