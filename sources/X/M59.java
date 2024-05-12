package X;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import yq4.a;

/* loaded from: classes10.dex */
public final class M59 implements M5A, C2K2 {
    public static M59 LJLJI;
    public boolean LJLIL;
    public final List<M5A> LJLILLLLZI = new CopyOnWriteArrayList();

    public final synchronized void LIZ() {
        if (this.LJLIL) {
            return;
        }
        if (FCD.LJI(EF7.LIZIZ())) {
            LIZIZ().LIZJ(a.LIZLLL().LIZLLL());
            LIZIZ().LIZJ(a.LIZLLL().LIZIZ());
            LIZIZ().LIZJ(new C38461F7p());
        }
        this.LJLIL = true;
    }

    public static M59 LIZIZ() {
        if (LJLJI == null) {
            synchronized (M59.class) {
                if (LJLJI == null) {
                    LJLJI = new M59();
                }
            }
        }
        return LJLJI;
    }

    @Override // X.M5A
    public final void onAppEnterBackGround() {
        LIZ();
        synchronized (M59.class) {
            Iterator it = ((CopyOnWriteArrayList) this.LJLILLLLZI).iterator();
            while (it.hasNext()) {
                M5A m5a = (M5A) it.next();
                if (m5a != null) {
                    m5a.onAppEnterBackGround();
                }
            }
        }
    }

    @Override // X.M5A
    public final void onAppEnterForeground() {
        LIZ();
        synchronized (M59.class) {
            Iterator it = ((CopyOnWriteArrayList) this.LJLILLLLZI).iterator();
            while (it.hasNext()) {
                M5A m5a = (M5A) it.next();
                if (m5a != null) {
                    m5a.onAppEnterForeground();
                }
            }
        }
    }

    public final void LIZJ(M5A m5a) {
        synchronized (M59.class) {
            if (m5a != null) {
                if (!((CopyOnWriteArrayList) this.LJLILLLLZI).contains(m5a)) {
                    ((CopyOnWriteArrayList) this.LJLILLLLZI).add(m5a);
                }
            }
        }
    }
}
