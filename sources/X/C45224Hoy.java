package X;

import com.bytedance.ies.smartmovie.jni.MusicRequestCallbackInfoType;

/* renamed from: X.Hoy, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public /* synthetic */ class C45224Hoy {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[MusicRequestCallbackInfoType.values().length];
        try {
            iArr[MusicRequestCallbackInfoType.BEFORE_EXTRACTOR.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[MusicRequestCallbackInfoType.AFTER_EXTRACTOR.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[MusicRequestCallbackInfoType.ZIP_GENERATE_SUCCESS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[MusicRequestCallbackInfoType.ZIP_UPLOAD_TOS_SUCCESS.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[MusicRequestCallbackInfoType.RESPONSE_SUCCESS.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[MusicRequestCallbackInfoType.REQUEST_ERROR.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        LIZ = iArr;
    }
}
