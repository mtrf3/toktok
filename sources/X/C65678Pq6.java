package X;

import java.util.AbstractSet;
import java.util.Iterator;

/* JADX INFO: Add missing generic type declarations: [K] */
/* renamed from: X.Pq6, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C65678Pq6<K> extends AbstractSet<K> {
    public final /* synthetic */ C65658Ppm LJLIL;

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.LJLIL.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<K> iterator() {
        C65658Ppm c65658Ppm = this.LJLIL;
        c65658Ppm.getClass();
        return new C65707PqZ(c65658Ppm);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.LJLIL.LJLJLJ;
    }

    public C65678Pq6(C65658Ppm c65658Ppm) {
        this.LJLIL = c65658Ppm;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.LJLIL.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int LJ = this.LJLIL.LJ(obj);
        if (LJ == -1) {
            return false;
        }
        this.LJLIL.LJIIJJI(LJ);
        return true;
    }
}
