package X;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes15.dex */
public class VKX extends AbstractSet {
    public final /* synthetic */ VKW LJLIL;

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.LJLIL.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return new VKR(this.LJLIL);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.LJLIL.size();
    }

    public VKX(VKW vkw) {
        this.LJLIL = vkw;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* synthetic */ boolean add(Object obj) {
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
        if (obj2 != value) {
            if (obj2 != null && obj2.equals(value)) {
                return true;
            }
            return false;
        }
        return true;
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
