package X;

import X.AbstractC65694PqM;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;

/* renamed from: X.PqL, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC65693PqL<K, V> extends AbstractMap<K, V> {
    public transient C65699PqR LJLIL;
    public transient C65659Ppn LJLILLLLZI;

    @Override // java.util.AbstractMap, java.util.Map
    public final java.util.Set<Map.Entry<K, V>> entrySet() {
        C65699PqR c65699PqR = this.LJLIL;
        if (c65699PqR == null) {
            C65699PqR c65699PqR2 = new C65699PqR((AbstractC65694PqM.c) this);
            this.LJLIL = c65699PqR2;
            return c65699PqR2;
        }
        return c65699PqR;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection<V> values() {
        C65659Ppn c65659Ppn = this.LJLILLLLZI;
        if (c65659Ppn == null) {
            C65659Ppn c65659Ppn2 = new C65659Ppn(this);
            this.LJLILLLLZI = c65659Ppn2;
            return c65659Ppn2;
        }
        return c65659Ppn;
    }
}
