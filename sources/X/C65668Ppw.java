package X;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* renamed from: X.Ppw, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C65668Ppw<K, V> extends AbstractSet<Map.Entry<K, V>> {
    public final /* synthetic */ C65658Ppm LJLIL;

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.LJLIL.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<Map.Entry<K, V>> iterator() {
        C65658Ppm c65658Ppm = this.LJLIL;
        c65658Ppm.getClass();
        return new C65706PqY(c65658Ppm);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.LJLIL.LJLJLJ;
    }

    public C65668Ppw(C65658Ppm c65658Ppm) {
        this.LJLIL = c65658Ppm;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        int LJ = this.LJLIL.LJ(entry.getKey());
        if (LJ == -1 || !C78886Uxe.LJIIIIZZ(this.LJLIL.LJLJJI[LJ], entry.getValue())) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            int LJ = this.LJLIL.LJ(entry.getKey());
            if (LJ != -1 && C78886Uxe.LJIIIIZZ(this.LJLIL.LJLJJI[LJ], entry.getValue())) {
                this.LJLIL.LJIIJJI(LJ);
                return true;
            }
            return false;
        }
        return false;
    }
}
