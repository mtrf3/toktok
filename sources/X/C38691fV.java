package X;

import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.1fV, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C38691fV<K, V> implements Iterator<Map.Entry<K, V>>, InterfaceC90533gv {
    public final C44561oy<K, V, Map.Entry<K, V>> LJLIL;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.LJLIL.LJLJI;
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.LJLIL.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.LJLIL.remove();
    }

    public C38691fV(C44551ox<K, V> builder) {
        o.LJIIIZ(builder, "builder");
        AbstractC38701fW[] abstractC38701fWArr = new AbstractC38701fW[8];
        int i = 0;
        do {
            abstractC38701fWArr[i] = new AbstractC38701fW<K, V, Map.Entry<K, V>>(this) { // from class: X.1p5
                public final C38691fV<K, V> LJLJJI;

                @Override // java.util.Iterator
                public final Object next() {
                    int i2 = this.LJLJI + 2;
                    this.LJLJI = i2;
                    C38691fV<K, V> c38691fV = this.LJLJJI;
                    Object[] objArr = this.LJLIL;
                    return new C44531ov(c38691fV, objArr[i2 - 2], objArr[i2 - 1]);
                }

                {
                    o.LJIIIZ(this, "parentIterator");
                    this.LJLJJI = this;
                }
            };
            i++;
        } while (i < 8);
        this.LJLIL = new C44561oy<>(builder, abstractC38701fWArr);
    }
}
