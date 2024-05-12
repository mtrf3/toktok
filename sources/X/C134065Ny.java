package X;

import com.bytedance.ies.nle.editor_jni.LogLevel;

/* renamed from: X.5Ny, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public /* synthetic */ class C134065Ny {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[LogLevel.values().length];
        try {
            iArr[LogLevel.LEVEL_INFO.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[LogLevel.LEVEL_DEBUG.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[LogLevel.LEVEL_ERROR.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[LogLevel.LEVEL_WARNING.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        LIZ = iArr;
    }
}
