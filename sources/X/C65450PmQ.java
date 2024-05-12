package X;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* renamed from: X.PmQ, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65450PmQ<K, V> extends AbstractSet<Map.Entry<K, V>> {
    public final /* synthetic */ C65446PmM LJLIL;

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<Map.Entry<K, V>> iterator() {
        return new C65448PmO(this.LJLIL);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.LJLIL.LJLIL;
    }

    public C65450PmQ(C65446PmM c65446PmM) {
        this.LJLIL = c65446PmM;
    }
}
