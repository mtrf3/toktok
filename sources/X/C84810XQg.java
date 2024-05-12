package X;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.XQg, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public class C84810XQg<K, V> extends AbstractC68899R2h<K, V> {
    public final C1M7 LIZJ;

    public /* synthetic */ C84810XQg() {
        this(-1L);
    }

    @Override // X.AbstractC68899R2h
    public final List<OSZ<K, V>> LJII() {
        C1M7 c1m7 = this.LIZJ;
        c1m7.getClass();
        ArrayList arrayList = new ArrayList();
        ConcurrentMapC84812XQi<K, V> concurrentMapC84812XQi = ((XQY) ((InterfaceC84371X9j) c1m7.LJLIL)).LJLIL;
        o.LJFF(concurrentMapC84812XQi, "mRealCache.asMap()");
        for (Map.Entry<K, V> entry : concurrentMapC84812XQi.entrySet()) {
            arrayList.add(new OSZ(entry.getKey(), entry.getValue()));
        }
        return arrayList;
    }

    public final void LJIIIZ() {
        ((XQY) ((InterfaceC84371X9j) this.LIZJ.LJLIL)).LJLIL.clear();
    }

    public C84810XQg(long j) {
        XQY LIZ;
        if (j > 0) {
            XQ7 xq7 = new XQ7();
            xq7.LIZIZ(j);
            LIZ = xq7.LIZ();
        } else {
            LIZ = new XQ7().LIZ();
        }
        this.LIZJ = new C1M7(LIZ);
    }

    @Override // X.AbstractC68899R2h
    public V LIZIZ(K k) {
        ConcurrentMapC84812XQi<K, V> concurrentMapC84812XQi = ((XQY) ((InterfaceC84371X9j) this.LIZJ.LJLIL)).LJLIL;
        concurrentMapC84812XQi.getClass();
        k.getClass();
        int LIZLLL = concurrentMapC84812XQi.LIZLLL(k);
        return (V) concurrentMapC84812XQi.LJII(LIZLLL).LJII(LIZLLL, k);
    }

    @Override // X.AbstractC68899R2h
    public final void LJIIIIZZ(K k, V v) {
        C1M7 c1m7 = this.LIZJ;
        if (v != null) {
            ((XQY) ((InterfaceC84371X9j) c1m7.LJLIL)).LJLIL.put(k, v);
            return;
        }
        XQY xqy = (XQY) ((InterfaceC84371X9j) c1m7.LJLIL);
        xqy.getClass();
        k.getClass();
        xqy.LJLIL.remove(k);
    }
}
