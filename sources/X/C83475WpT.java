package X;

import com.ss.ugc.android.davinciresource.jni.DAVLogLevel;

/* renamed from: X.WpT, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public /* synthetic */ class C83475WpT {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[DAVLogLevel.values().length];
        iArr[DAVLogLevel.LEVEL_VERBOSE.ordinal()] = 1;
        iArr[DAVLogLevel.LEVEL_DEBUG.ordinal()] = 2;
        iArr[DAVLogLevel.LEVEL_INFO.ordinal()] = 3;
        iArr[DAVLogLevel.LEVEL_WARNING.ordinal()] = 4;
        iArr[DAVLogLevel.LEVEL_ERROR.ordinal()] = 5;
        LIZ = iArr;
    }
}
