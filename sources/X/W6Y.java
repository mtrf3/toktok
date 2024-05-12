package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes15.dex */
public final class W6Y<K, V> {
    public final W6H<V> LIZ;
    public final LinkedHashMap<K, V> LIZIZ = new LinkedHashMap<>();
    public int LIZJ = 0;

    public final synchronized ArrayList<V> LIZ() {
        ArrayList<V> arrayList;
        arrayList = new ArrayList<>((Collection<? extends V>) this.LIZIZ.values());
        this.LIZIZ.clear();
        this.LIZJ = 0;
        return arrayList;
    }

    public final synchronized int LIZLLL() {
        return this.LIZIZ.size();
    }

    public final synchronized K LJ() {
        K next;
        if (!this.LIZIZ.isEmpty()) {
            next = this.LIZIZ.keySet().iterator().next();
        } else {
            next = null;
        }
        return next;
    }

    public final synchronized int LJI() {
        return this.LIZJ;
    }

    public W6Y(C81737W6b c81737W6b) {
        this.LIZ = c81737W6b;
    }

    public final synchronized boolean LIZIZ(C81723W5n c81723W5n) {
        return this.LIZIZ.containsKey(c81723W5n);
    }

    public final synchronized Object LIZJ(W6U w6u) {
        return this.LIZIZ.get(w6u);
    }

    public final synchronized ArrayList<Map.Entry<K, V>> LJFF(InterfaceC78852Ux6<K> interfaceC78852Ux6) {
        ArrayList<Map.Entry<K, V>> arrayList;
        arrayList = new ArrayList<>(this.LIZIZ.entrySet().size());
        for (Map.Entry<K, V> entry : this.LIZIZ.entrySet()) {
            if (interfaceC78852Ux6.mo42apply(entry.getKey())) {
                arrayList.add(entry);
            }
        }
        return arrayList;
    }

    public final synchronized V LJIIIIZZ(K k) {
        V remove;
        int LIZIZ;
        remove = this.LIZIZ.remove(k);
        int i = this.LIZJ;
        if (remove == null) {
            LIZIZ = 0;
        } else {
            LIZIZ = this.LIZ.LIZIZ(remove);
        }
        this.LIZJ = i - LIZIZ;
        return remove;
    }

    public final synchronized ArrayList<V> LJIIIZ(InterfaceC78852Ux6<K> interfaceC78852Ux6) {
        ArrayList<V> arrayList;
        int LIZIZ;
        arrayList = new ArrayList<>();
        Iterator<Map.Entry<K, V>> it = this.LIZIZ.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (interfaceC78852Ux6.mo42apply(next.getKey())) {
                arrayList.add(next.getValue());
                int i = this.LIZJ;
                V value = next.getValue();
                if (value == null) {
                    LIZIZ = 0;
                } else {
                    LIZIZ = this.LIZ.LIZIZ(value);
                }
                this.LIZJ = i - LIZIZ;
                it.remove();
            }
        }
        return arrayList;
    }

    public final synchronized void LJII(Object obj, Object obj2) {
        int LIZIZ;
        V remove = this.LIZIZ.remove(obj);
        int i = this.LIZJ;
        int i2 = 0;
        if (remove == null) {
            LIZIZ = 0;
        } else {
            LIZIZ = this.LIZ.LIZIZ(remove);
        }
        this.LIZJ = i - LIZIZ;
        this.LIZIZ.put(obj, obj2);
        int i3 = this.LIZJ;
        if (obj2 != null) {
            i2 = this.LIZ.LIZIZ(obj2);
        }
        this.LIZJ = i3 + i2;
    }
}
