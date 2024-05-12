package X;

import com.bytedance.ies.actionai.jni.LogLevel;

/* renamed from: X.Wo2, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public /* synthetic */ class C83386Wo2 {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[LogLevel.values().length];
        try {
            iArr[LogLevel.LEVEL_VERBOSE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[LogLevel.LEVEL_DEBUG.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[LogLevel.LEVEL_INFO.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[LogLevel.LEVEL_WARNING.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[LogLevel.LEVEL_ERROR.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        LIZ = iArr;
    }
}
