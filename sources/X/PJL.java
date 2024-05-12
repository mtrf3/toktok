package X;

import android.os.SystemClock;
import android.util.Printer;

/* loaded from: classes12.dex */
public class PJL implements Printer {
    @Override // android.util.Printer
    public final void println(String str) {
        if (str == null) {
            return;
        }
        if (str.charAt(0) == '>') {
            PJK LIZ = PJK.LIZ();
            LIZ.LIZ = -1L;
            try {
                PJK.LIZIZ(str, LIZ.LIZIZ);
            } catch (Exception unused) {
                C78685UuP.LJJ();
            }
        } else if (str.charAt(0) == '<') {
            PJK LIZ2 = PJK.LIZ();
            LIZ2.getClass();
            LIZ2.LIZ = SystemClock.uptimeMillis();
            try {
                PJK.LIZIZ(str, LIZ2.LIZJ);
            } catch (Exception unused2) {
                C78685UuP.LJLIL();
            }
        }
        Printer printer = PJK.LJ;
        if (printer != null && printer != PJK.LJI) {
            PJK.LJ.println(str);
        }
    }
}
