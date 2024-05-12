package X;

import com.ss.ugc.android.davinciresource.jni.DAVLogLevel;

/* renamed from: X.WpS, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public /* synthetic */ class C83474WpS {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[DAVLogLevel.values().length];
        try {
            iArr[DAVLogLevel.LEVEL_VERBOSE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[DAVLogLevel.LEVEL_DEBUG.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[DAVLogLevel.LEVEL_INFO.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[DAVLogLevel.LEVEL_WARNING.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[DAVLogLevel.LEVEL_ERROR.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        LIZ = iArr;
    }
}
