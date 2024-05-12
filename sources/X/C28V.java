package X;

import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.28V, reason: invalid class name */
/* loaded from: classes.dex */
public final class C28V<K, V> extends OJN<Map.Entry<? extends K, ? extends V>> implements InterfaceC37421dS<Map.Entry<? extends K, ? extends V>> {
    public final C44541ow<K, V> LJLIL;

    @Override // X.OQZ
    public final int LIZJ() {
        C44541ow<K, V> c44541ow = this.LJLIL;
        c44541ow.getClass();
        return c44541ow.LJLILLLLZI;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<Map.Entry<K, V>> iterator() {
        final C14U<K, V> c14u = this.LJLIL.LJLIL;
        return new AbstractC38681fU<K, V, Map.Entry<? extends K, ? extends V>>(c14u) { // from class: X.1oz
            /* JADX WARN: Illegal instructions before constructor call */
            {
                /*
                    r4 = this;
                    java.lang.String r0 = "node"
                    kotlin.jvm.internal.o.LJIIIZ(r5, r0)
                    r3 = 8
                    X.1fW[] r2 = new X.AbstractC38701fW[r3]
                    r1 = 0
                La:
                    X.1p3 r0 = new X.1p3
                    r0.<init>()
                    r2[r1] = r0
                    int r1 = r1 + 1
                    if (r1 >= r3) goto L16
                    goto La
                L16:
                    r4.<init>(r5, r2)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C44571oz.<init>(X.14U):void");
            }
        };
    }

    public C28V(C44541ow<K, V> map) {
        o.LJIIIZ(map, "map");
        this.LJLIL = map;
    }

    @Override // X.OQZ, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry element = (Map.Entry) obj;
        o.LJIIIZ(element, "element");
        V v = this.LJLIL.get(element.getKey());
        if (v != null) {
            return o.LJ(v, element.getValue());
        }
        if (element.getValue() != null || !this.LJLIL.containsKey(element.getKey())) {
            return false;
        }
        return true;
    }
}
