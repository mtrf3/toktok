package X;

import X.InterfaceC93360aPc;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: X.aPd, reason: case insensitive filesystem */
/* loaded from: classes32.dex */
public final class C93361aPd<T extends InterfaceC93360aPc> {
    public final C93357aPZ LIZ;
    public final int LIZIZ;
    public java.util.Set<T> LIZJ;
    public List<C93361aPd<T>> LIZLLL;

    public C93361aPd(C93357aPZ c93357aPZ, int i) {
        this.LIZ = c93357aPZ;
        this.LIZIZ = i;
    }

    public final void LIZIZ(C93357aPZ c93357aPZ, Collection<T> collection) {
        C93357aPZ c93357aPZ2 = this.LIZ;
        c93357aPZ2.getClass();
        double d = c93357aPZ.LIZ;
        double d2 = c93357aPZ.LIZJ;
        double d3 = c93357aPZ.LIZIZ;
        double d4 = c93357aPZ.LIZLLL;
        if (d < c93357aPZ2.LIZJ && c93357aPZ2.LIZ < d2 && d3 < c93357aPZ2.LIZLLL && c93357aPZ2.LIZIZ < d4) {
            List<C93361aPd<T>> list = this.LIZLLL;
            if (list != null) {
                Iterator it = ((ArrayList) list).iterator();
                while (it.hasNext()) {
                    ((C93361aPd) it.next()).LIZIZ(c93357aPZ, collection);
                }
                return;
            }
            java.util.Set<T> set = this.LIZJ;
            if (set != null) {
                C93357aPZ c93357aPZ3 = this.LIZ;
                if (c93357aPZ3.LIZ >= d && c93357aPZ3.LIZJ <= d2 && c93357aPZ3.LIZIZ >= d3 && c93357aPZ3.LIZLLL <= d4) {
                    ((ArrayList) collection).addAll(set);
                    return;
                }
                for (T t : set) {
                    C93394aQA LIZ = t.LIZ();
                    double d5 = LIZ.LIZ;
                    double d6 = LIZ.LIZIZ;
                    if (c93357aPZ.LIZ <= d5 && d5 <= c93357aPZ.LIZJ && c93357aPZ.LIZIZ <= d6 && d6 <= c93357aPZ.LIZLLL) {
                        ((ArrayList) collection).add(t);
                    }
                }
            }
        }
    }

    public final void LIZ(double d, double d2, T t) {
        List<C93361aPd<T>> list = this.LIZLLL;
        if (list != null) {
            C93357aPZ c93357aPZ = this.LIZ;
            if (d2 < c93357aPZ.LJFF) {
                if (d < c93357aPZ.LJ) {
                    ((C93361aPd) ListProtector.get(list, 0)).LIZ(d, d2, t);
                    return;
                } else {
                    ((C93361aPd) ListProtector.get(list, 1)).LIZ(d, d2, t);
                    return;
                }
            }
            if (d < c93357aPZ.LJ) {
                ((C93361aPd) ListProtector.get(list, 2)).LIZ(d, d2, t);
                return;
            } else {
                ((C93361aPd) ListProtector.get(list, 3)).LIZ(d, d2, t);
                return;
            }
        }
        if (this.LIZJ == null) {
            this.LIZJ = new LinkedHashSet();
        }
        this.LIZJ.add(t);
        if (this.LIZJ.size() > 50 && this.LIZIZ < 40) {
            ArrayList arrayList = new ArrayList(4);
            this.LIZLLL = arrayList;
            C93357aPZ c93357aPZ2 = this.LIZ;
            arrayList.add(new C93361aPd(this.LIZIZ + 1, c93357aPZ2.LIZ, c93357aPZ2.LJ, c93357aPZ2.LIZIZ, c93357aPZ2.LJFF));
            List<C93361aPd<T>> list2 = this.LIZLLL;
            C93357aPZ c93357aPZ3 = this.LIZ;
            ArrayList arrayList2 = (ArrayList) list2;
            arrayList2.add(new C93361aPd(this.LIZIZ + 1, c93357aPZ3.LJ, c93357aPZ3.LIZJ, c93357aPZ3.LIZIZ, c93357aPZ3.LJFF));
            List<C93361aPd<T>> list3 = this.LIZLLL;
            C93357aPZ c93357aPZ4 = this.LIZ;
            ArrayList arrayList3 = (ArrayList) list3;
            arrayList3.add(new C93361aPd(this.LIZIZ + 1, c93357aPZ4.LIZ, c93357aPZ4.LJ, c93357aPZ4.LJFF, c93357aPZ4.LIZLLL));
            List<C93361aPd<T>> list4 = this.LIZLLL;
            C93357aPZ c93357aPZ5 = this.LIZ;
            ArrayList arrayList4 = (ArrayList) list4;
            arrayList4.add(new C93361aPd(this.LIZIZ + 1, c93357aPZ5.LJ, c93357aPZ5.LIZJ, c93357aPZ5.LJFF, c93357aPZ5.LIZLLL));
            java.util.Set<T> set = this.LIZJ;
            this.LIZJ = null;
            for (T t2 : set) {
                LIZ(t2.LIZ().LIZ, t2.LIZ().LIZIZ, t2);
            }
        }
    }

    public C93361aPd(int i, double d, double d2, double d3, double d4) {
        this(new C93357aPZ(d, d2, d3, d4), i);
    }
}
