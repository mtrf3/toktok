package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AqS99S0300000_10;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class OFJ<K, V> implements java.util.Map<K, V>, EHO {
    public volatile java.util.Map<K, V> LJLIL;
    public volatile List<K> LJLILLLLZI;
    public final int LJLJI;
    public final InterfaceC88472Yns<K, V> LJLJJI;

    @Override // java.util.Map
    public final void clear() {
        this.LJLILLLLZI.clear();
        ((ConcurrentHashMap) this.LJLIL).clear();
    }

    @Override // java.util.Map
    public final java.util.Set<Map.Entry<K, V>> entrySet() {
        return ((ConcurrentHashMap) this.LJLIL).entrySet();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return ((ConcurrentHashMap) this.LJLIL).isEmpty();
    }

    @Override // java.util.Map
    public final java.util.Set<K> keySet() {
        return ((ConcurrentHashMap) this.LJLIL).keySet();
    }

    @Override // java.util.Map
    public final int size() {
        return ((ConcurrentHashMap) this.LJLIL).size();
    }

    @Override // java.util.Map
    public final Collection<V> values() {
        return ((ConcurrentHashMap) this.LJLIL).values();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return ((ConcurrentHashMap) this.LJLIL).containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return ((ConcurrentHashMap) this.LJLIL).containsValue(obj);
    }

    @Override // java.util.Map
    public final V get(Object obj) {
        return (V) ((ConcurrentHashMap) this.LJLIL).get(obj);
    }

    @Override // java.util.Map
    public final void putAll(java.util.Map<? extends K, ? extends V> from) {
        o.LJIIJ(from, "from");
        ((ConcurrentHashMap) this.LJLIL).putAll(from);
    }

    @Override // java.util.Map
    public final V remove(Object obj) {
        return (V) ((ConcurrentHashMap) this.LJLIL).remove(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OFJ(int i, InterfaceC88472Yns<? super K, ? extends V> createIfMissAbsent) {
        o.LJIIJ(createIfMissAbsent, "createIfMissAbsent");
        this.LJLJI = i;
        this.LJLJJI = createIfMissAbsent;
        this.LJLIL = new ConcurrentHashMap();
        List<K> synchronizedList = Collections.synchronizedList(new LinkedList());
        o.LJFF(synchronizedList, "Collections.synchronizedList(LinkedList())");
        this.LJLILLLLZI = synchronizedList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Object LIZ(OFJ ofj, Object obj) {
        ofj.getClass();
        AqS99S0300000_10 aqS99S0300000_10 = new AqS99S0300000_10(ofj, (Object) null, obj, 18);
        if (ofj.LJLJI <= 0) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("invalid map size: ");
            LIZ.append(ofj.LJLJI);
            X1D.LIZIZ(LIZ);
            return aqS99S0300000_10.invoke();
        }
        Object obj2 = ((ConcurrentHashMap) ofj.LJLIL).get(obj);
        if (obj2 == null) {
            obj2 = aqS99S0300000_10.invoke();
            if (ofj.LJLILLLLZI.size() > ofj.LJLJI) {
                ((ConcurrentHashMap) ofj.LJLIL).remove(ListProtector.remove(ofj.LJLILLLLZI, 0));
            }
            ofj.LJLILLLLZI.add(obj);
            ((ConcurrentHashMap) ofj.LJLIL).put(obj, obj2);
        }
        if (obj2 != null) {
            return obj2;
        }
        return aqS99S0300000_10.invoke();
    }

    @Override // java.util.Map
    public final V put(K k, V v) {
        return (V) ((ConcurrentHashMap) this.LJLIL).put(k, v);
    }
}
