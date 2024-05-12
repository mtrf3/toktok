package X;

import com.bytedance.crash.CrashType;

/* renamed from: X.FYh, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public /* synthetic */ class C39155FYh {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[CrashType.values().length];
        LIZ = iArr;
        try {
            iArr[CrashType.LAUNCH.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            LIZ[CrashType.JAVA.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            LIZ[CrashType.NATIVE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            LIZ[CrashType.ANR.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
    }
}
