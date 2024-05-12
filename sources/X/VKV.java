package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

/* loaded from: classes15.dex */
public class VKV extends AbstractMap {
    public static final /* synthetic */ int LJLJL = 0;
    public final int LJLIL;
    public boolean LJLJJI;
    public volatile VKY LJLJJL;
    public List LJLILLLLZI = Collections.emptyList();
    public java.util.Map LJLJI = Collections.emptyMap();
    public java.util.Map LJLJJLL = Collections.emptyMap();

    public void LIZ() {
        java.util.Map unmodifiableMap;
        java.util.Map unmodifiableMap2;
        if (!this.LJLJJI) {
            if (this.LJLJI.isEmpty()) {
                unmodifiableMap = Collections.emptyMap();
            } else {
                unmodifiableMap = Collections.unmodifiableMap(this.LJLJI);
            }
            this.LJLJI = unmodifiableMap;
            if (this.LJLJJLL.isEmpty()) {
                unmodifiableMap2 = Collections.emptyMap();
            } else {
                unmodifiableMap2 = Collections.unmodifiableMap(this.LJLJJLL);
            }
            this.LJLJJLL = unmodifiableMap2;
            this.LJLJJI = true;
        }
    }

    public final void LJI() {
        if (!this.LJLJJI) {
        } else {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.util.Set entrySet() {
        if (this.LJLJJL == null) {
            this.LJLJJL = new VKY(this);
        }
        return this.LJLJJL;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int size = this.LJLILLLLZI.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += ((VKT) ListProtector.get(this.LJLILLLLZI, i2)).hashCode();
        }
        if (this.LJLJI.size() > 0) {
            return this.LJLJI.hashCode() + i;
        }
        return i;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.LJLJI.size() + this.LJLILLLLZI.size();
    }

    public final SortedMap LJ() {
        LJI();
        if (this.LJLJI.isEmpty() && !(this.LJLJI instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.LJLJI = treeMap;
            this.LJLJJLL = treeMap.descendingMap();
        }
        return (SortedMap) this.LJLJI;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        LJI();
        if (!this.LJLILLLLZI.isEmpty()) {
            this.LJLILLLLZI.clear();
        }
        if (!this.LJLJI.isEmpty()) {
            this.LJLJI.clear();
        }
    }

    public final int LIZJ(Comparable comparable) {
        int size = this.LJLILLLLZI.size() - 1;
        int i = 0;
        if (size >= 0) {
            int compareTo = comparable.compareTo(((VKT) ListProtector.get(this.LJLILLLLZI, size)).LJLIL);
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
            do {
                int i2 = (i + size) / 2;
                int compareTo2 = comparable.compareTo(((VKT) ListProtector.get(this.LJLILLLLZI, i2)).LJLIL);
                if (compareTo2 < 0) {
                    size = i2 - 1;
                } else if (compareTo2 > 0) {
                    i = i2 + 1;
                } else {
                    return i2;
                }
            } while (i <= size);
        }
        return -(i + 1);
    }

    public final Object LIZLLL(int i) {
        LJI();
        Object obj = ((VKT) ListProtector.remove(this.LJLILLLLZI, i)).LJLILLLLZI;
        if (!this.LJLJI.isEmpty()) {
            Iterator it = LJ().entrySet().iterator();
            List list = this.LJLILLLLZI;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new VKT(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        if (LIZJ(comparable) >= 0 || this.LJLJI.containsKey(comparable)) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VKV)) {
            return super.equals(obj);
        }
        VKV vkv = (VKV) obj;
        int size = size();
        if (size != vkv.size()) {
            return false;
        }
        int size2 = this.LJLILLLLZI.size();
        if (size2 == vkv.LJLILLLLZI.size()) {
            for (int i = 0; i < size2; i++) {
                if (!((Map.Entry) ListProtector.get(this.LJLILLLLZI, i)).equals(ListProtector.get(vkv.LJLILLLLZI, i))) {
                    return false;
                }
            }
            if (size2 == size) {
                return true;
            }
            return this.LJLJI.equals(vkv.LJLJI);
        }
        return ((AbstractSet) entrySet()).equals(vkv.entrySet());
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int LIZJ = LIZJ(comparable);
        if (LIZJ >= 0) {
            return ((VKT) ListProtector.get(this.LJLILLLLZI, LIZJ)).LJLILLLLZI;
        }
        return this.LJLJI.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        LJI();
        Comparable comparable = (Comparable) obj;
        int LIZJ = LIZJ(comparable);
        if (LIZJ >= 0) {
            return LIZLLL(LIZJ);
        }
        if (this.LJLJI.isEmpty()) {
            return null;
        }
        return this.LJLJI.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        LJI();
        int LIZJ = LIZJ(comparable);
        if (LIZJ >= 0) {
            return ((VKT) ListProtector.get(this.LJLILLLLZI, LIZJ)).setValue(obj);
        }
        LJI();
        if (this.LJLILLLLZI.isEmpty() && !(this.LJLILLLLZI instanceof ArrayList)) {
            this.LJLILLLLZI = new ArrayList(this.LJLIL);
        }
        int i = -(LIZJ + 1);
        if (i >= this.LJLIL) {
            return LJ().put(comparable, obj);
        }
        int size = this.LJLILLLLZI.size();
        int i2 = this.LJLIL;
        if (size == i2) {
            VKT vkt = (VKT) ListProtector.remove(this.LJLILLLLZI, i2 - 1);
            LJ().put(vkt.LJLIL, vkt.LJLILLLLZI);
        }
        ListProtector.add(this.LJLILLLLZI, i, new VKT(this, comparable, obj));
        return null;
    }
}
