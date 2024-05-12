package X;

import Y.ACallableS41S0000000_6;
import Y.ACallableS43S0201000_2;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;
import m43.u;

/* renamed from: X.0y5, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C24730y5 {
    public final Object LIZ;
    public Object LIZIZ;

    public final Object LIZ() {
        C03680Cm c03680Cm = (C03680Cm) ((AtomicReference) this.LIZ).get();
        int LIZ = c03680Cm.LIZ(C16880lQ.LLLLIIIILLL().getId());
        if (LIZ >= 0) {
            return c03680Cm.LIZJ[LIZ];
        }
        return null;
    }

    public C24730y5() {
        this.LIZ = new AtomicReference(C03690Cn.LIZ);
        this.LIZIZ = new Object();
    }

    public /* synthetic */ C24730y5(ACallableS41S0000000_6 aCallableS41S0000000_6) {
        this.LIZ = new CountDownLatch(1);
        u.LJ().execute(new FutureTask(new ACallableS43S0201000_2(0, this, aCallableS41S0000000_6, 0)));
    }

    public final void LIZIZ(Object obj) {
        long id = C16880lQ.LLLLIIIILLL().getId();
        synchronized (this.LIZIZ) {
            C03680Cm c03680Cm = (C03680Cm) ((AtomicReference) this.LIZ).get();
            int LIZ = c03680Cm.LIZ(id);
            if (LIZ < 0) {
                ((AtomicReference) this.LIZ).set(c03680Cm.LIZIZ(id, obj));
            } else {
                c03680Cm.LIZJ[LIZ] = obj;
            }
        }
    }

    public /* synthetic */ C24730y5(int i) {
        this.LIZ = "hybrid_resource_fetch";
        this.LIZIZ = null;
    }
}
