package X;

import com.bytedance.crash.CrashType;

/* renamed from: X.FYk, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public /* synthetic */ class C39158FYk {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[CrashType.values().length];
        try {
            iArr[CrashType.ANR.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[CrashType.OOM.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        LIZ = iArr;
    }
}
