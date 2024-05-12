package X;

import android.text.TextUtils;
import com.lynx.tasm.behavior.ui.view.UIComponent;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: X.JRr, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class RunnableC49175JRr implements Runnable {
    public final WeakReference<C49176JRs> LJLIL;

    public final void LIZ() {
        UIComponent L;
        C49176JRs c49176JRs = this.LJLIL.get();
        if (c49176JRs == null) {
            return;
        }
        c49176JRs.LIZJ = null;
        while (c49176JRs.LIZLLL.size() > 0) {
            C49174JRq removeFirst = c49176JRs.LIZLLL.removeFirst();
            if (removeFirst.LIZ.L() != null && removeFirst.LIZIZ != null && removeFirst.LIZLLL != null) {
                Iterator<C49174JRq> it = c49176JRs.LIZLLL.iterator();
                while (it.hasNext()) {
                    C49174JRq next = it.next();
                    String str = removeFirst.LIZLLL;
                    if (str != null || next.LIZLLL != null) {
                        if (TextUtils.equals(str, next.LIZLLL)) {
                            c49176JRs.LIZLLL.remove(next);
                            break;
                        }
                    } else if (removeFirst.LIZJ == next.LIZJ) {
                        c49176JRs.LIZLLL.remove(next);
                        break;
                        break;
                    }
                }
                Iterator<C49174JRq> it2 = c49176JRs.LJ.iterator();
                while (it2.hasNext()) {
                    C49174JRq next2 = it2.next();
                    String str2 = removeFirst.LIZLLL;
                    if (str2 != null || next2.LIZLLL != null) {
                        if (TextUtils.equals(str2, next2.LIZLLL)) {
                            c49176JRs.LJ.remove(next2);
                            break;
                        }
                    } else if (removeFirst.LIZJ == next2.LIZJ) {
                        c49176JRs.LJ.remove(next2);
                        break;
                        break;
                    }
                }
                if (removeFirst.LIZ.L() != null && removeFirst.LIZIZ != null && removeFirst.LIZLLL != null && (L = removeFirst.LIZ.L()) != null && L.getEvents() != null && L.getEvents().containsKey(removeFirst.LIZIZ)) {
                    c49176JRs.LIZ(removeFirst);
                }
            }
        }
        c49176JRs.LIZLLL = c49176JRs.LJ;
        c49176JRs.LJ = new LinkedList<>();
        if (c49176JRs.LIZLLL.size() <= 0 || c49176JRs.LIZJ != null) {
            return;
        }
        RunnableC49175JRr runnableC49175JRr = new RunnableC49175JRr(c49176JRs);
        c49176JRs.LIZJ = runnableC49175JRr;
        c49176JRs.LIZIZ.postDelayed(runnableC49175JRr, 50);
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }

    public RunnableC49175JRr(C49176JRs c49176JRs) {
        this.LJLIL = new WeakReference<>(c49176JRs);
    }
}
