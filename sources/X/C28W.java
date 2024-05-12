package X;

import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.28W, reason: invalid class name */
/* loaded from: classes.dex */
public final class C28W<K, V> extends OJN<K> implements InterfaceC37421dS<K> {
    public final C44541ow<K, V> LJLIL;

    @Override // X.OQZ
    public final int LIZJ() {
        C44541ow<K, V> c44541ow = this.LJLIL;
        c44541ow.getClass();
        return c44541ow.LJLILLLLZI;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<K> iterator() {
        final C14U<K, V> c14u = this.LJLIL.LJLIL;
        return new AbstractC38681fU<K, V, K>(c14u) { // from class: X.1p0
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
                    X.1p4 r0 = new X.1p4
                    r0.<init>()
                    r2[r1] = r0
                    int r1 = r1 + 1
                    if (r1 >= r3) goto L16
                    goto La
                L16:
                    r4.<init>(r5, r2)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C44581p0.<init>(X.14U):void");
            }
        };
    }

    public C28W(C44541ow<K, V> map) {
        o.LJIIIZ(map, "map");
        this.LJLIL = map;
    }

    @Override // X.OQZ, java.util.Collection
    public final boolean contains(Object obj) {
        return this.LJLIL.containsKey(obj);
    }
}
