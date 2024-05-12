package X;

import android.os.SystemClock;
import com.bytedance.crash.Npth;
import java.util.Collections;

/* renamed from: X.1PY, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1PY implements InterfaceC10030aN {
    public final C64182PGw LIZ() {
        String LJII;
        C64176PGq c64176PGq = C64125PEr.LIZLLL().LJIIIIZZ;
        long uptimeMillis = SystemClock.uptimeMillis();
        c64176PGq.getClass();
        C64177PGr c64177PGr = new C64177PGr();
        c64177PGr.LJIIIIZZ = c64176PGq.LJIILL;
        c64177PGr.LJIIIZ = c64176PGq.LJIILJJIL;
        c64177PGr.LJFF = uptimeMillis - c64176PGq.LJIIJJI;
        c64177PGr.LJI = PEJ.LJFF(c64176PGq.LJIIL) - c64176PGq.LJIILIIL;
        c64177PGr.LJ = c64176PGq.LJFF;
        String str = c64177PGr.LJIIIZ;
        if (str == null) {
            LJII = "empty msg";
        } else {
            LJII = C45439HsR.LJII(str);
        }
        java.util.Map singletonMap = Collections.singletonMap("dispatch_last_msg", LJII);
        if (C64131PEx.LIZ != null) {
            Npth.addTags(singletonMap);
        }
        return C64179PGt.LIZ(c64177PGr);
    }
}
