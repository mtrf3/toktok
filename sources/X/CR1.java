package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CR1<T> {
    public final int LIZ;
    public final ArrayList<T> LIZIZ;
    public final LinkedList<T> LIZJ;
    public final List<T> LIZLLL;
    public final List<T> LJ;
    public final java.util.Set<InterfaceC31338CRq<T>> LJFF;
    public boolean LJI;

    public final void LIZLLL() {
        this.LIZJ.clear();
        if (this.LJI) {
            Iterator<T> it = this.LIZIZ.iterator();
            while (it.hasNext()) {
                T next = it.next();
                if (!LIZJ(next)) {
                    this.LIZJ.add(next);
                }
            }
        }
    }

    public final List<T> LJFF() {
        if (this.LJI) {
            List<T> list = this.LJ;
            o.LJIIIIZZ(list, "{\n            unmodifiableFilteredList\n        }");
            return list;
        }
        List<T> list2 = this.LIZLLL;
        o.LJIIIIZZ(list2, "{\n            unmodifiableRawList\n        }");
        return list2;
    }

    public final int LJI() {
        if (this.LJI) {
            return this.LIZJ.size();
        }
        return this.LIZIZ.size();
    }

    public final int LJII() {
        return this.LIZIZ.size();
    }

    public CR1(int i) {
        this.LIZ = i;
        ArrayList<T> arrayList = new ArrayList<>(i);
        this.LIZIZ = arrayList;
        LinkedList<T> linkedList = new LinkedList<>();
        this.LIZJ = linkedList;
        this.LIZLLL = Collections.unmodifiableList(arrayList);
        this.LJ = Collections.unmodifiableList(linkedList);
        this.LJFF = new LinkedHashSet();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZ(CRD crd) {
        this.LIZIZ.add(crd);
        if (this.LJI && !LIZJ(crd)) {
            this.LIZJ.add(crd);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZIZ(Collection collection) {
        boolean addAll = this.LIZIZ.addAll(collection);
        if (this.LJI) {
            for (Object obj : collection) {
                if (!LIZJ(obj)) {
                    if (this.LIZJ.add(obj) || addAll) {
                        addAll = true;
                    } else {
                        addAll = false;
                    }
                }
            }
        }
    }

    public final boolean LIZJ(T t) {
        boolean z;
        if (!this.LJI) {
            return false;
        }
        java.util.Set<InterfaceC31338CRq<T>> set = this.LJFF;
        if (set.size() == 0) {
            return false;
        }
        loop0: while (true) {
            z = true;
            for (InterfaceC31338CRq<T> interfaceC31338CRq : set) {
                if (!z || !interfaceC31338CRq.filter(t)) {
                    z = false;
                }
            }
        }
        if (!z) {
            return false;
        }
        return true;
    }

    public final T LJ(int i) {
        return (T) ListProtector.get(this.LIZIZ, i);
    }

    public final int LJIIIIZZ(T t) {
        if (this.LJI) {
            return this.LIZJ.indexOf(t);
        }
        return this.LIZIZ.indexOf(t);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJIIIZ(CRD crd) {
        this.LIZIZ.remove(crd);
        if (this.LJI && !LIZJ(crd)) {
            this.LIZJ.remove(crd);
        }
    }

    public final void LJIIJ(int i, Object obj) {
        int indexOf;
        Object obj2 = ListProtector.get(this.LIZIZ, i);
        ListProtector.set(this.LIZIZ, i, obj);
        if (this.LJI && (indexOf = this.LIZJ.indexOf(obj2)) != -1) {
            this.LIZJ.set(indexOf, obj);
        }
    }
}
