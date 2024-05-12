package com.bytedance.ies.effecteditor.swig;

import X.AnonymousClass073;
import X.V0N;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;

/* loaded from: classes16.dex */
public enum UIAnnotationErrorCode {
    UIAnnotationErrorCode_None(0),
    UIAnnotationErrorCode_NullPtr(1),
    UIAnnotationErrorCode_NoEffect(2),
    UIAnnotationErrorCode_NotFound(4),
    UIAnnotationErrorCode_ReadFailed(8),
    UIAnnotationErrorCode_ParseFailed(16),
    UIAnnotationErrorCode_SavePathFault(32),
    UIAnnotationErrorCode_MakeTempPathFailed(64),
    UIAnnotationErrorCode_EffectExportFailed(128),
    UIAnnotationErrorCode_EffectExportTimeout(256),
    UIAnnotationErrorCode_DumpFailed(512),
    UIAnnotationErrorCode_WriteFailed(1024),
    UIAnnotationErrorCode_ZipFailed(2048),
    UIAnnotationErrorCode_RemoveTempPathFailed(4096),
    UIAnnotationErrorCode_RenameZipFileFailed(FileUtils.BUFFER_SIZE),
    UIAnnotationErrorCode_AssetsSaveFailed(16384),
    UIAnnotationErrorCode_UpdateValueFault(32768),
    UIAnnotationErrorCode_UpdateTimeout(65536);

    public final int swigValue;

    /* loaded from: classes16.dex */
    public static class SwigNext {
        public static int next;
    }

    public final int swigValue() {
        return this.swigValue;
    }

    public static UIAnnotationErrorCode swigToEnum(int i) {
        UIAnnotationErrorCode[] uIAnnotationErrorCodeArr = (UIAnnotationErrorCode[]) UIAnnotationErrorCode.class.getEnumConstants();
        if (i < uIAnnotationErrorCodeArr.length && i >= 0) {
            UIAnnotationErrorCode uIAnnotationErrorCode = uIAnnotationErrorCodeArr[i];
            if (uIAnnotationErrorCode.swigValue == i) {
                return uIAnnotationErrorCode;
            }
        }
        for (UIAnnotationErrorCode uIAnnotationErrorCode2 : uIAnnotationErrorCodeArr) {
            if (uIAnnotationErrorCode2.swigValue == i) {
                return uIAnnotationErrorCode2;
            }
        }
        throw new IllegalArgumentException(AnonymousClass073.LIZ("No enum ", UIAnnotationErrorCode.class, " with value ", i));
    }

    public static UIAnnotationErrorCode valueOf(String str) {
        return (UIAnnotationErrorCode) V0N.LJJJ(UIAnnotationErrorCode.class, str);
    }

    UIAnnotationErrorCode() {
        int i = SwigNext.next;
        SwigNext.next = i + 1;
        this.swigValue = i;
    }

    UIAnnotationErrorCode(UIAnnotationErrorCode uIAnnotationErrorCode) {
        int i = uIAnnotationErrorCode.swigValue;
        this.swigValue = i;
        SwigNext.next = i + 1;
    }

    UIAnnotationErrorCode(int i) {
        this.swigValue = i;
        SwigNext.next = i + 1;
    }
}
