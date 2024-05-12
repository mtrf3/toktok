package X;

import android.os.Trace;

/* loaded from: classes12.dex */
public final class P7T {
    public static boolean LIZ;

    public static void LIZIZ() {
        if (!LIZ) {
            return;
        }
        Trace.endSection();
    }

    public static void LIZ(String str) {
        if (!LIZ) {
            return;
        }
        Trace.beginSection(str);
    }
}
