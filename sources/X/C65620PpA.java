package X;

import defpackage.g0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

/* renamed from: X.PpA, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C65620PpA<K, V> {
    public final C65658Ppm LIZ = new C65658Ppm();

    public Collection<V> LIZ() {
        return new ArrayList();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void LIZJ(Map.Entry entry) {
        LIZIZ(entry.getKey(), entry.getValue());
    }

    public C65620PpA<K, V> LIZIZ(K k, V v) {
        g0.LJII(k, v);
        Collection<V> collection = (Collection) this.LIZ.get(k);
        if (collection == null) {
            C65658Ppm c65658Ppm = this.LIZ;
            collection = LIZ();
            c65658Ppm.put(k, collection);
        }
        collection.add(v);
        return this;
    }
}
