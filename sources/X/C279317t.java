package X;

import android.util.Pair;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: X.17t, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C279317t<K, V> implements InterfaceC006200s<K, V> {
    public final InterfaceC48038ItG<K, Integer> LIZ;
    public final RTU<K, List<V>, List<V>> LIZIZ;
    public final C279117r LIZJ;
    public final java.util.Map<Integer, List<V>> LIZLLL;
    public final ConcurrentMap<Integer, C73893SzJ<C006100r>> LJ;
    public final C73893SzJ<Pair<K, C006100r>> LJFF;

    public C279317t() {
        C279017q c279017q = new C279017q();
        C279117r c279117r = new C279117r();
        C279217s c279217s = new C279217s();
        this.LIZLLL = new ConcurrentHashMap();
        this.LJ = new ConcurrentHashMap(20, 0.75f, 4);
        this.LJFF = new C73893SzJ<>();
        this.LIZ = c279017q;
        this.LIZJ = c279117r;
        this.LIZIZ = c279217s;
    }

    @Override // X.InterfaceC006200s
    public final void LIZ(Object obj) {
        int intValue = ((Integer) BTJ.LIZ(this.LIZ, obj)).intValue();
        if (!((ConcurrentHashMap) this.LIZLLL).containsKey(Integer.valueOf(intValue))) {
            ((ConcurrentHashMap) this.LIZLLL).put(Integer.valueOf(intValue), new ArrayList());
        }
        List list = (List) ((ConcurrentHashMap) this.LIZLLL).get(Integer.valueOf(intValue));
        if (list == null || list.size() < 0) {
            return;
        }
        Object remove = ListProtector.remove(list, 0);
        if (!((ConcurrentHashMap) this.LJ).containsKey(Integer.valueOf(intValue))) {
            return;
        }
        C73893SzJ c73893SzJ = (C73893SzJ) ((ConcurrentHashMap) this.LJ).get(Integer.valueOf(intValue));
        if (c73893SzJ == null) {
            return;
        }
        c73893SzJ.onNext(new C006100r(2, Collections.singletonList(remove)));
    }

    @Override // X.InterfaceC006200s
    public final void LIZJ(K k) {
        int intValue = ((Integer) BTJ.LIZ(this.LIZ, k)).intValue();
        if (!((ConcurrentHashMap) this.LIZLLL).containsKey(Integer.valueOf(intValue))) {
            ((ConcurrentHashMap) this.LIZLLL).put(Integer.valueOf(intValue), new ArrayList());
        }
        List list = (List) ((ConcurrentHashMap) this.LIZLLL).get(Integer.valueOf(intValue));
        if (list != null) {
            list.clear();
        }
    }

    @Override // X.InterfaceC006200s
    public final int LIZLLL(K k) {
        int intValue = ((Integer) BTJ.LIZ(this.LIZ, k)).intValue();
        if (!((ConcurrentHashMap) this.LIZLLL).containsKey(Integer.valueOf(intValue))) {
            ((ConcurrentHashMap) this.LIZLLL).put(Integer.valueOf(intValue), new ArrayList());
        }
        List list = (List) ((ConcurrentHashMap) this.LIZLLL).get(Integer.valueOf(intValue));
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // X.InterfaceC006200s
    public final List<V> get(K k) {
        int intValue = ((Integer) BTJ.LIZ(this.LIZ, k)).intValue();
        if (!((ConcurrentHashMap) this.LIZLLL).containsKey(Integer.valueOf(intValue))) {
            ((ConcurrentHashMap) this.LIZLLL).put(Integer.valueOf(intValue), new ArrayList());
        }
        return (List) ((ConcurrentHashMap) this.LIZLLL).get(Integer.valueOf(intValue));
    }

    @Override // X.InterfaceC006200s
    public final List<V> LIZIZ(K k, List<V> list) {
        RuntimeException LIZIZ;
        List<V> apply;
        int intValue = ((Integer) BTJ.LIZ(this.LIZ, k)).intValue();
        if (!((ConcurrentHashMap) this.LIZLLL).containsKey(Integer.valueOf(intValue))) {
            ((ConcurrentHashMap) this.LIZLLL).put(Integer.valueOf(intValue), new ArrayList());
        }
        List list2 = (List) ((ConcurrentHashMap) this.LIZLLL).get(Integer.valueOf(intValue));
        if (list2 == null) {
            return list;
        }
        int size = list2.size();
        synchronized (this) {
            int intValue2 = ((Integer) BTJ.LIZ(this.LIZ, k)).intValue();
            if (!((ConcurrentHashMap) this.LIZLLL).containsKey(Integer.valueOf(intValue2))) {
                ((ConcurrentHashMap) this.LIZLLL).put(Integer.valueOf(intValue2), new ArrayList());
            }
            try {
                apply = this.LIZIZ.apply(k, list);
                List list3 = (List) ((ConcurrentHashMap) this.LIZLLL).get(Integer.valueOf(intValue2));
                if (list3 == null) {
                    apply = new ArrayList<>();
                } else {
                    try {
                        this.LIZJ.getClass();
                        if (!C32151Nz.LJJIIJZLJL(apply)) {
                            list3.addAll(Math.min(size, list3.size()), apply);
                            ((ConcurrentHashMap) this.LIZLLL).put(Integer.valueOf(intValue2), list3);
                            C006100r c006100r = new C006100r(1, apply);
                            if (((ConcurrentHashMap) this.LJ).containsKey(Integer.valueOf(intValue2))) {
                                C73893SzJ c73893SzJ = (C73893SzJ) ((ConcurrentHashMap) this.LJ).get(Integer.valueOf(intValue2));
                                if (c73893SzJ != null) {
                                    c73893SzJ.onNext(c006100r);
                                }
                            }
                            this.LJFF.onNext(Pair.create(k, c006100r));
                            this.LJFF.onNext(Pair.create(k, new C006100r(5, list3)));
                        }
                    } finally {
                    }
                }
            } finally {
            }
        }
        return apply;
    }
}
