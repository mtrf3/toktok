package X;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.9Kp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C235119Kp {
    public final List<AbstractC234519Ih> LIZ = new ArrayList();
    public final List<AbstractC234519Ih> LIZIZ = new ArrayList();
    public C9KF LIZJ;
    public boolean LIZLLL;
    public Integer LJ;

    public final void LIZ(C9KF action) {
        o.LJIIIZ(action, "action");
        this.LIZJ = action;
    }

    public final void LIZIZ(AbstractC234519Ih... abstractC234519IhArr) {
        ((ArrayList) this.LIZIZ).addAll(ORY.LJJZZIII(abstractC234519IhArr));
    }

    public final void LIZJ(int i) {
        this.LJ = Integer.valueOf(i);
    }

    public final void LIZLLL(AbstractC234519Ih... abstractC234519IhArr) {
        ((ArrayList) this.LIZ).addAll(ORY.LJJZZIII(abstractC234519IhArr));
    }
}
