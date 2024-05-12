package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

/* renamed from: X.Zc0, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public class C90284Zc0<K extends Comparable<K>, V> extends AbstractMap<K, V> {
    public static final /* synthetic */ int LJLJL = 0;
    public final int LJLIL;
    public boolean LJLJJI;
    public volatile C90277Zbt LJLJJL;
    public List<C90256ZbY> LJLILLLLZI = Collections.emptyList();
    public java.util.Map<K, V> LJLJI = Collections.emptyMap();
    public java.util.Map<K, V> LJLJJLL = Collections.emptyMap();

    public void LIZ() {
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

    public final void LJI() {
        if (!this.LJLJJI) {
        } else {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.util.Set<Map.Entry<K, V>> entrySet() {
        if (this.LJLJJL == null) {
            this.LJLJJL = new C90277Zbt(this);
        }
        return this.LJLJJL;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int size = this.LJLILLLLZI.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += ((C90256ZbY) ListProtector.get(this.LJLILLLLZI, i2)).hashCode();
        }
        if (this.LJLJI.size() > 0) {
            return i + this.LJLJI.hashCode();
        }
        return i;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.LJLILLLLZI.size() + this.LJLJI.size();
    }

    public final SortedMap<K, V> LJ() {
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

    public final int LIZJ(K k) {
        int size = this.LJLILLLLZI.size() - 1;
        int i = 0;
        if (size >= 0) {
            int compareTo = k.compareTo(((C90256ZbY) ListProtector.get(this.LJLILLLLZI, size)).LJLIL);
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
            do {
                int i2 = (i + size) / 2;
                int compareTo2 = k.compareTo(((C90256ZbY) ListProtector.get(this.LJLILLLLZI, i2)).LJLIL);
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

    public final V LIZLLL(int i) {
        LJI();
        V v = (V) ((C90256ZbY) ListProtector.remove(this.LJLILLLLZI, i)).LJLILLLLZI;
        if (!this.LJLJI.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = LJ().entrySet().iterator();
            List<C90256ZbY> list = this.LJLILLLLZI;
            Map.Entry<K, V> next = it.next();
            list.add(new C90256ZbY(this, next.getKey(), next.getValue()));
            it.remove();
        }
        return v;
    }

    /* JADX WARN: Multi-variable type inference failed */
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
        if (!(obj instanceof C90284Zc0)) {
            return super.equals(obj);
        }
        C90284Zc0 c90284Zc0 = (C90284Zc0) obj;
        int size = size();
        if (size != c90284Zc0.size()) {
            return false;
        }
        int size2 = this.LJLILLLLZI.size();
        if (size2 == c90284Zc0.LJLILLLLZI.size()) {
            for (int i = 0; i < size2; i++) {
                if (!((Map.Entry) ListProtector.get(this.LJLILLLLZI, i)).equals(ListProtector.get(c90284Zc0.LJLILLLLZI, i))) {
                    return false;
                }
            }
            if (size2 == size) {
                return true;
            }
            return this.LJLJI.equals(c90284Zc0.LJLJI);
        }
        return ((AbstractSet) entrySet()).equals(c90284Zc0.entrySet());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public final V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int LIZJ = LIZJ(comparable);
        if (LIZJ >= 0) {
            return (V) ((C90256ZbY) ListProtector.get(this.LJLILLLLZI, LIZJ)).LJLILLLLZI;
        }
        return this.LJLJI.get(comparable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        LJI();
        Comparable comparable = (Comparable) obj;
        int LIZJ = LIZJ(comparable);
        if (LIZJ >= 0) {
            return (V) LIZLLL(LIZJ);
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
        int LIZJ = LIZJ(k);
        if (LIZJ >= 0) {
            return (V) ((C90256ZbY) ListProtector.get(this.LJLILLLLZI, LIZJ)).setValue(v);
        }
        LJI();
        if (this.LJLILLLLZI.isEmpty() && !(this.LJLILLLLZI instanceof ArrayList)) {
            this.LJLILLLLZI = new ArrayList(this.LJLIL);
        }
        int i = -(LIZJ + 1);
        if (i >= this.LJLIL) {
            return LJ().put(k, v);
        }
        int size = this.LJLILLLLZI.size();
        int i2 = this.LJLIL;
        if (size == i2) {
            C90256ZbY c90256ZbY = (C90256ZbY) ListProtector.remove(this.LJLILLLLZI, i2 - 1);
            LJ().put(c90256ZbY.LJLIL, c90256ZbY.LJLILLLLZI);
        }
        ListProtector.add(this.LJLILLLLZI, i, new C90256ZbY(this, k, v));
        return null;
    }
}
