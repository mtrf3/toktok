package X;

import android.os.StatFs;

/* loaded from: classes8.dex */
public final class H53 {
    public static C43485H4v LIZ;

    public static float LIZ() {
        long j;
        try {
            j = new StatFs(C43075GvP.LIZ).getAvailableBytes();
        } catch (Exception unused) {
            j = 0;
        }
        float f = (float) j;
        float f2 = (float) 1024;
        return (f / f2) / f2;
    }

    public static final void LIZIZ(String str) {
        if (str == null) {
            return;
        }
        C43485H4v c43485H4v = new C43485H4v(str, EnumC2323499y.Draft);
        LIZ = c43485H4v;
        c43485H4v.LIZJ = LIZ();
    }
}
