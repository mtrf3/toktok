package X;

import android.os.Looper;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class PL4 {
    public static final /* synthetic */ int LIZ = 0;

    public static final void LIZ(C43750HFa c43750HFa, String str, String str2, String str3) {
        String str4;
        c43750HFa.LIZIZ.LIZJ = str2;
        StackTraceElement stackTraceElement = new StackTraceElement(PL4.class.getName(), "", "", 0);
        if (o.LJ(C16880lQ.LLJJJJ(), Looper.myLooper())) {
            str4 = "MainThread";
        } else {
            str4 = "SubThread";
        }
        C64246PJi LJJIFFI = C64246PJi.LJJIFFI(stackTraceElement, str, str2, str4, true, "EnsureNotReachHere", str3);
        Iterator it = ((ArrayList) c43750HFa.LIZ).iterator();
        while (it.hasNext()) {
            C43751HFb c43751HFb = (C43751HFb) it.next();
            String str5 = c43751HFb.LIZJ;
            if (str5 != null) {
                LJJIFFI.LIZIZ(c43751HFb.LIZ, str5);
                if (c43751HFb.LIZIZ) {
                    LJJIFFI.LJFF(c43751HFb.LIZ, str5);
                }
            }
        }
        C64241PJd.LIZIZ(LJJIFFI);
    }
}
