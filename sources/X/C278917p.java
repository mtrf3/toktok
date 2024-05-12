package X;

import android.util.Pair;
import com.bytedance.android.livesdk.feed.feed.FeedDataKey;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: X.17p, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C278917p<K, V> implements InterfaceC006000q<K, V> {
    public final InterfaceC48038ItG<K, Integer> LIZ;
    public final RTU<K, V, Boolean> LIZIZ;
    public final InterfaceC89813fl<K, V, Long, Boolean> LIZJ;
    public final RTU<V, V, V> LIZLLL;
    public final java.util.Map<Integer, Pair<V, Long>> LJ;
    public final ConcurrentMap<Integer, AbstractC73851Syd<V>> LJFF;

    public C278917p() {
        C278517l c278517l = new C278517l();
        C278617m c278617m = new C278617m(0);
        InterfaceC89813fl<K, V, Long, Boolean> interfaceC89813fl = new InterfaceC89813fl() { // from class: X.17n
            public final /* synthetic */ long LJLIL = Long.MAX_VALUE;

            @Override // X.InterfaceC89813fl
            public final Object LIZJ(Object obj, Object obj2, Object obj3) {
                boolean z;
                Long l = (Long) obj3;
                if (System.currentTimeMillis() - l.longValue() > this.LJLIL || System.currentTimeMillis() < l.longValue()) {
                    z = true;
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        };
        C278817o c278817o = new C278817o();
        this.LJ = new ConcurrentHashMap();
        this.LJFF = new ConcurrentHashMap(20, 0.75f, 4);
        this.LIZ = c278617m;
        this.LIZIZ = c278517l;
        this.LIZJ = interfaceC89813fl;
        this.LIZLLL = c278817o;
    }

    @Override // X.InterfaceC006000q
    public final void LIZ(K k) {
        ((ConcurrentHashMap) this.LJ).remove(BTJ.LIZ(this.LIZ, k));
    }

    @Override // X.InterfaceC006000q
    public final AbstractC73672Svk LIZIZ(FeedDataKey feedDataKey) {
        int intValue = ((Integer) BTJ.LIZ(this.LIZ, feedDataKey)).intValue();
        ((ConcurrentHashMap) this.LJFF).putIfAbsent(Integer.valueOf(intValue), new C73893SzJ());
        return (AbstractC73672Svk) ((ConcurrentHashMap) this.LJFF).get(Integer.valueOf(intValue));
    }

    @Override // X.InterfaceC006000q
    public final V get(K k) {
        Pair pair = (Pair) ((ConcurrentHashMap) this.LJ).get(BTJ.LIZ(this.LIZ, k));
        if (pair != null) {
            try {
                if (!((Boolean) this.LIZJ.LIZJ(k, pair.first, pair.second)).booleanValue()) {
                    return (V) pair.first;
                }
                return null;
            } catch (Throwable th) {
                throw C73864Syq.LIZIZ(th);
            }
        }
        return null;
    }

    @Override // X.InterfaceC006000q
    public final void put(K k, V v) {
        RuntimeException LIZIZ;
        RuntimeException LIZIZ2;
        RuntimeException LIZIZ3;
        try {
            if (this.LIZIZ.apply(k, v).booleanValue()) {
                return;
            }
            int intValue = ((Integer) BTJ.LIZ(this.LIZ, k)).intValue();
            Pair pair = (Pair) ((ConcurrentHashMap) this.LJ).get(Integer.valueOf(intValue));
            if (pair != null) {
                try {
                    if (!((Boolean) this.LIZJ.LIZJ(k, pair.first, pair.second)).booleanValue()) {
                        Object obj = ((Pair) ((ConcurrentHashMap) this.LJ).get(Integer.valueOf(intValue))).first;
                        if (!v.equals(obj)) {
                            try {
                                v = (V) this.LIZLLL.apply(obj, v);
                                if (v.equals(obj)) {
                                    return;
                                }
                            } finally {
                            }
                        } else {
                            return;
                        }
                    }
                } finally {
                }
            }
            ((ConcurrentHashMap) this.LJ).put(Integer.valueOf(intValue), new Pair(v, Long.valueOf(System.currentTimeMillis())));
            if (((ConcurrentHashMap) this.LJFF).containsKey(Integer.valueOf(intValue))) {
                ((AbstractC73851Syd) ((ConcurrentHashMap) this.LJFF).get(Integer.valueOf(intValue))).onNext(v);
            }
        } finally {
        }
    }
}
