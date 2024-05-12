package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

/* loaded from: classes15.dex */
public class VKW<K extends Comparable<K>, V> extends AbstractMap<K, V> {
    public static final /* synthetic */ int LJLJL = 0;
    public final int LJLIL;
    public boolean LJLJJI;
    public volatile VKX LJLJJL;
    public List<VKU> LJLILLLLZI = Collections.emptyList();
    public java.util.Map<K, V> LJLJI = Collections.emptyMap();
    public java.util.Map<K, V> LJLJJLL = Collections.emptyMap();

    public void LIZJ() {
        java.util.Map<K, V> unmodifiableMap;
        java.util.Map<K, V> unmodifiableMap2;
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

    public final int LIZLLL() {
        return this.LJLILLLLZI.size();
    }

    public final Iterable<Map.Entry<K, V>> LJ() {
        if (this.LJLJI.isEmpty()) {
            return VKZ.LIZIZ;
        }
        return this.LJLJI.entrySet();
    }

    public final void LJI() {
        if (!this.LJLJJI) {
        } else {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.util.Set<Map.Entry<K, V>> entrySet() {
        if (this.LJLJJL == null) {
            this.LJLJJL = new VKX(this);
        }
        return this.LJLJJL;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.LJLJI.size() + this.LJLILLLLZI.size();
    }

    public final SortedMap<K, V> LJII() {
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

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int LIZLLL = LIZLLL();
        int i = 0;
        for (int i2 = 0; i2 < LIZLLL; i2++) {
            i += ((VKU) ListProtector.get(this.LJLILLLLZI, i2)).hashCode();
        }
        if (this.LJLJI.size() > 0) {
            return i + this.LJLJI.hashCode();
        }
        return i;
    }

    public VKW(int i) {
        this.LJLIL = i;
    }

    public final int LIZ(K k) {
        int size = this.LJLILLLLZI.size() - 1;
        if (size >= 0) {
            int compareTo = k.compareTo(((VKU) ListProtector.get(this.LJLILLLLZI, size)).LJLIL);
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) / 2;
            int compareTo2 = k.compareTo(((VKU) ListProtector.get(this.LJLILLLLZI, i2)).LJLIL);
            if (compareTo2 < 0) {
                size = i2 - 1;
            } else if (compareTo2 > 0) {
                i = i2 + 1;
            } else {
                return i2;
            }
        }
        return -(i + 1);
    }

    public final Map.Entry<K, V> LJIIIIZZ(int i) {
        return (Map.Entry) ListProtector.get(this.LJLILLLLZI, i);
    }

    public final V LJIIIZ(int i) {
        LJI();
        V v = (V) ((VKU) ListProtector.remove(this.LJLILLLLZI, i)).LJLILLLLZI;
        if (!this.LJLJI.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = LJII().entrySet().iterator();
            List<VKU> list = this.LJLILLLLZI;
            Map.Entry<K, V> next = it.next();
            list.add(new VKU(this, next.getKey(), next.getValue()));
            it.remove();
        }
        return v;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        if (LIZ(comparable) >= 0 || this.LJLJI.containsKey(comparable)) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VKW)) {
            return super.equals(obj);
        }
        VKW vkw = (VKW) obj;
        int size = size();
        if (size != vkw.size()) {
            return false;
        }
        int LIZLLL = LIZLLL();
        if (LIZLLL != vkw.LIZLLL()) {
            return entrySet().equals(vkw.entrySet());
        }
        for (int i = 0; i < LIZLLL; i++) {
            if (!LJIIIIZZ(i).equals(vkw.LJIIIIZZ(i))) {
                return false;
            }
        }
        if (LIZLLL == size) {
            return true;
        }
        return this.LJLJI.equals(vkw.LJLJI);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public final V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int LIZ = LIZ(comparable);
        if (LIZ >= 0) {
            return (V) ((VKU) ListProtector.get(this.LJLILLLLZI, LIZ)).LJLILLLLZI;
        }
        return this.LJLJI.get(comparable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        LJI();
        Comparable comparable = (Comparable) obj;
        int LIZ = LIZ(comparable);
        if (LIZ >= 0) {
            return (V) LJIIIZ(LIZ);
        }
        if (this.LJLJI.isEmpty()) {
            return null;
        }
        return this.LJLJI.remove(comparable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final V put(K k, V v) {
        LJI();
        int LIZ = LIZ(k);
        if (LIZ >= 0) {
            return (V) ((VKU) ListProtector.get(this.LJLILLLLZI, LIZ)).setValue(v);
        }
        LJI();
        if (this.LJLILLLLZI.isEmpty() && !(this.LJLILLLLZI instanceof ArrayList)) {
            this.LJLILLLLZI = new ArrayList(this.LJLIL);
        }
        int i = -(LIZ + 1);
        if (i >= this.LJLIL) {
            return LJII().put(k, v);
        }
        int size = this.LJLILLLLZI.size();
        int i2 = this.LJLIL;
        if (size == i2) {
            VKU vku = (VKU) ListProtector.remove(this.LJLILLLLZI, i2 - 1);
            LJII().put(vku.LJLIL, vku.LJLILLLLZI);
        }
        ListProtector.add(this.LJLILLLLZI, i, new VKU(this, k, v));
        return null;
    }
}
