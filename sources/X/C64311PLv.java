package X;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.PLv, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C64311PLv<K, V> extends HashMap<K, List<V>> {
    public static final long serialVersionUID = -8278080958339137414L;

    public List<V> newList() {
        return new ArrayList();
    }

    public List<V> getList(K k) {
        List<V> list = (List) super.get(k);
        if (list == null) {
            List<V> newList = newList();
            put(k, newList);
            return newList;
        }
        return list;
    }

    public void removeAll(V v) {
        Iterator<V> it = values().iterator();
        while (it.hasNext()) {
            ((List) it.next()).remove(v);
        }
    }

    public void add(K k, V v) {
        getList(k).add(v);
    }

    public void addMulti(V v, K... kArr) {
        if (v != null && kArr != null && kArr.length > 0) {
            for (K k : kArr) {
                getList(k).add(v);
            }
        }
    }

    public void removeInList(K k, V v) {
        getList(k).remove(v);
    }
}
