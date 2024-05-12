package X;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: Add missing generic type declarations: [E] */
/* renamed from: X.Po3, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65551Po3<E> extends AbstractC65543Pnv<E> {
    public final /* synthetic */ java.util.Set LJLIL;

    @Override // X.AbstractC65543Pnv, X.AbstractC65559PoB, X.AbstractC65561PoD
    public final Object LJII() {
        return this.LJLIL;
    }

    @Override // X.AbstractC65543Pnv, X.AbstractC65559PoB
    /* renamed from: LJIIIIZZ */
    public final Collection LJII() {
        return this.LJLIL;
    }

    @Override // X.AbstractC65543Pnv
    /* renamed from: LJIIIZ */
    public final java.util.Set<E> LJII() {
        return this.LJLIL;
    }

    public C65551Po3(java.util.Set set) {
        this.LJLIL = set;
    }

    @Override // X.AbstractC65559PoB, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        java.util.Set set = this.LJLIL;
        set.getClass();
        try {
            if (!set.contains(obj)) {
                return false;
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // X.AbstractC65559PoB, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // X.AbstractC65559PoB, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (obj == null) {
            return false;
        }
        java.util.Set set = this.LJLIL;
        set.getClass();
        try {
            if (!set.remove(obj)) {
                return false;
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // X.AbstractC65559PoB, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection<?> collection) {
        collection.getClass();
        return C65607Pox.LIZJ(this, collection);
    }
}
