package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.PWk, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C64586PWk extends AbstractC64554PVe {
    public static final void LIZJ(C64582PWg c64582PWg, C64561PVl c64561PVl) {
        c64582PWg.getClass();
        if (FLR.LIZIZ(1) && FLR.LIZIZ(4)) {
            if (!Boolean.valueOf(c64582PWg.LJFF).booleanValue()) {
                c64582PWg.LJFF = true;
                Runnable runnable = c64582PWg.LIZJ;
                if (!(runnable instanceof RunnableC64591PWp)) {
                    runnable = new RunnableC64591PWp(c64582PWg);
                    c64582PWg.LIZJ = runnable;
                }
                RunnableC64591PWp runnableC64591PWp = (RunnableC64591PWp) runnable;
                runnableC64591PWp.LJLILLLLZI.execute(runnableC64591PWp);
            }
            ((ArrayDeque) c64582PWg.LIZLLL).add(c64561PVl);
            return;
        }
        if (!c64582PWg.LJFF) {
            c64582PWg.LJFF = true;
            C64582PWg.LJI.execute(c64582PWg.LIZJ);
        }
        ((ArrayDeque) c64582PWg.LIZLLL).add(c64561PVl);
    }

    public final Socket LIZ(C64582PWg c64582PWg, C64563PVn c64563PVn, C64583PWh c64583PWh) {
        Iterator it = ((ArrayDeque) c64582PWg.LIZLLL).iterator();
        while (it.hasNext()) {
            C64561PVl c64561PVl = (C64561PVl) it.next();
            if (c64561PVl.LJI(c64563PVn, null) && c64561PVl.LJII != null && c64561PVl != c64583PWh.LIZIZ()) {
                if (c64583PWh.LJIILJJIL == null && ((ArrayList) c64583PWh.LJIIIZ.LJIILIIL).size() == 1) {
                    Object obj = ListProtector.get(c64583PWh.LJIIIZ.LJIILIIL, 0);
                    Socket LIZJ = c64583PWh.LIZJ(true, false, false);
                    c64583PWh.LJIIIZ = c64561PVl;
                    ((ArrayList) c64561PVl.LJIILIIL).add(obj);
                    return LIZJ;
                }
                throw new IllegalStateException();
            }
        }
        return null;
    }

    public final C64561PVl LIZIZ(C64582PWg c64582PWg, C64563PVn c64563PVn, C64583PWh c64583PWh, C64562PVm c64562PVm) {
        Iterator it = ((ArrayDeque) c64582PWg.LIZLLL).iterator();
        while (it.hasNext()) {
            C64561PVl c64561PVl = (C64561PVl) it.next();
            if (c64561PVl.LJI(c64563PVn, c64562PVm)) {
                c64583PWh.LIZ(c64561PVl, true);
                return c64561PVl;
            }
        }
        return null;
    }
}
