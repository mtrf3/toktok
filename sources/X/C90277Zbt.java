package X;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.Zbt, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90277Zbt extends AbstractSet<Map.Entry> {
    public final /* synthetic */ C90284Zc0 LJLIL;

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<Map.Entry> iterator() {
        return new C90266Zbi(this.LJLIL);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.LJLIL.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.LJLIL.size();
    }

    public /* synthetic */ C90277Zbt(C90284Zc0 c90284Zc0) {
        this.LJLIL = c90284Zc0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (!contains(entry)) {
            this.LJLIL.put((Comparable) entry.getKey(), entry.getValue());
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        Object obj2 = this.LJLIL.get(entry.getKey());
        Object value = entry.getValue();
        if (obj2 == value) {
            return true;
        }
        if (obj2 != null && obj2.equals(value)) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (contains(entry)) {
            this.LJLIL.remove(entry.getKey());
            return true;
        }
        return false;
    }
}