package X;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.0z8, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C25380z8<T> {
    public static final ExecutorC25370z7 LJII = new ExecutorC25370z7();
    public final C0AK LIZ;
    public final C25340z4<T> LIZIZ;
    public final ExecutorC25370z7 LIZJ;
    public final List<InterfaceC25360z6<T>> LIZLLL;
    public List<T> LJ;
    public List<T> LJFF;
    public int LJI;

    public C25380z8(AbstractC029409q abstractC029409q, QXX qxx) {
        C28811Bd c28811Bd = new C28811Bd(abstractC029409q);
        C25330z3 c25330z3 = new C25330z3(qxx);
        if (c25330z3.LIZ == null) {
            synchronized (C25330z3.LIZIZ) {
                if (C25330z3.LIZJ == null) {
                    C25330z3.LIZJ = C16880lQ.LLLLZ(2);
                }
            }
            c25330z3.LIZ = C25330z3.LIZJ;
        }
        C25340z4<T> c25340z4 = new C25340z4<>(c25330z3.LIZ, qxx);
        this.LIZLLL = new CopyOnWriteArrayList();
        this.LJFF = Collections.emptyList();
        this.LIZ = c28811Bd;
        this.LIZIZ = c25340z4;
        this.LIZJ = LJII;
    }

    public final void LIZ(List<T> list, Runnable runnable) {
        Iterator it = ((CopyOnWriteArrayList) this.LIZLLL).iterator();
        while (it.hasNext()) {
            ((InterfaceC25360z6) it.next()).LIZ();
        }
        if (runnable != null) {
            runnable.run();
        }
    }
}
