package X;

import Y.IDRunnableS29S0200000;
import android.content.Context;
import java.util.ArrayList;
import java.util.LinkedHashSet;

/* renamed from: X.0lN, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC16850lN<T> {
    public final InterfaceC23750wV LIZ;
    public final Context LIZIZ;
    public final Object LIZJ = new Object();
    public final java.util.Set<InterfaceC13800gS<T>> LIZLLL = new LinkedHashSet();
    public T LJ;

    public abstract T LIZ();

    public abstract void LIZLLL();

    public abstract void LJ();

    static {
        C0VW.LIZIZ("ConstraintTracker");
    }

    public final void LIZIZ(C1UC c1uc) {
        synchronized (this.LIZJ) {
            if (this.LIZLLL.remove(c1uc) && this.LIZLLL.isEmpty()) {
                LJ();
            }
        }
    }

    public final void LIZJ(T t) {
        synchronized (this.LIZJ) {
            T t2 = this.LJ;
            if (t2 == t || (t2 != null && t2.equals(t))) {
                return;
            }
            this.LJ = t;
            ((C35591aV) this.LIZ).LIZJ.execute(new IDRunnableS29S0200000(new ArrayList(this.LIZLLL), this, 32));
        }
    }

    public AbstractC16850lN(Context context, InterfaceC23750wV interfaceC23750wV) {
        this.LIZIZ = C16880lQ.LLLLL(context);
        this.LIZ = interfaceC23750wV;
    }
}
