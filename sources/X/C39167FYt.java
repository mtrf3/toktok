package X;

import com.bytedance.crash.CrashType;

/* renamed from: X.FYt, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public /* synthetic */ class C39167FYt {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[CrashType.values().length];
        LIZ = iArr;
        try {
            iArr[CrashType.JAVA.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            LIZ[CrashType.LAUNCH.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            LIZ[CrashType.NATIVE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
