package X;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.0AR, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0AR<T> {
    public static final C0AO LJII = new C0AO();
    public final C0AK LIZ;
    public final C0AL<T> LIZIZ;
    public final C0AO LIZJ;
    public List<T> LJ;
    public int LJI;
    public final List<C0AN<T>> LIZLLL = new CopyOnWriteArrayList();
    public List<T> LJFF = Collections.emptyList();

    public C0AR(C28811Bd c28811Bd, C0AL c0al) {
        this.LIZ = c28811Bd;
        this.LIZIZ = c0al;
        c0al.getClass();
        this.LIZJ = LJII;
    }

    public final void LIZ(List<T> list, Runnable runnable) {
        Iterator it = ((CopyOnWriteArrayList) this.LIZLLL).iterator();
        while (it.hasNext()) {
            ((C0AN) it.next()).LIZ(list, this.LJFF);
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void LIZIZ(List<T> list, Runnable runnable) {
        int i = this.LJI + 1;
        this.LJI = i;
        List<T> list2 = this.LJ;
        if (list == list2) {
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        List<T> list3 = this.LJFF;
        if (list == null) {
            int size = list2.size();
            this.LJ = null;
            this.LJFF = Collections.emptyList();
            this.LIZ.LJJIJLIJ(0, size);
            LIZ(list3, runnable);
            return;
        }
        if (list2 == null) {
            this.LJ = list;
            this.LJFF = Collections.unmodifiableList(list);
            this.LIZ.LJLIIIL(0, list.size());
            LIZ(list3, runnable);
            return;
        }
        this.LIZIZ.LIZ.execute(new C0AM(this, list2, list, i, runnable));
    }
}
