package com.bytedance.ies.smartmovie.jni;

import X.AnonymousClass073;
import X.C45112HnA;
import X.V0N;

/* loaded from: classes8.dex */
public enum SmartMovieErrorCode {
    ZIP_EMPTY(1),
    UPLOAD_TOS_FAILURE(2),
    MUSIC_REQUEST_FAILURE(3),
    COMPRESS_FAILURE(4),
    CONFIG_REQUEST_FAILURE(5),
    FETCH_NLEMODEL_FAILURE(6),
    INPUT_RESOURCE_EXCEPTION(7),
    HANDLE_TEMPLATE_FAILURE(8);

    public final int swigValue;

    public final int swigValue() {
        return this.swigValue;
    }

    public static SmartMovieErrorCode swigToEnum(int i) {
        SmartMovieErrorCode[] smartMovieErrorCodeArr = (SmartMovieErrorCode[]) SmartMovieErrorCode.class.getEnumConstants();
        if (i < smartMovieErrorCodeArr.length && i >= 0) {
            SmartMovieErrorCode smartMovieErrorCode = smartMovieErrorCodeArr[i];
            if (smartMovieErrorCode.swigValue == i) {
                return smartMovieErrorCode;
            }
        }
        for (SmartMovieErrorCode smartMovieErrorCode2 : smartMovieErrorCodeArr) {
            if (smartMovieErrorCode2.swigValue == i) {
                return smartMovieErrorCode2;
            }
        }
        throw new IllegalArgumentException(AnonymousClass073.LIZ("No enum ", SmartMovieErrorCode.class, " with value ", i));
    }

    public static SmartMovieErrorCode valueOf(String str) {
        return (SmartMovieErrorCode) V0N.LJJJ(SmartMovieErrorCode.class, str);
    }

    SmartMovieErrorCode() {
        int i = C45112HnA.LIZ;
        C45112HnA.LIZ = i + 1;
        this.swigValue = i;
    }

    SmartMovieErrorCode(SmartMovieErrorCode smartMovieErrorCode) {
        int i = smartMovieErrorCode.swigValue;
        this.swigValue = i;
        C45112HnA.LIZ = i + 1;
    }

    SmartMovieErrorCode(int i) {
        this.swigValue = i;
        C45112HnA.LIZ = i + 1;
    }
}
