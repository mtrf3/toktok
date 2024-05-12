package X;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.o;

/* renamed from: X.Pt8, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65866Pt8<K, V> extends C65869PtB<K, V> implements Iterator<V>, InterfaceC90533gv {
    @Override // java.util.Iterator
    public final V next() {
        int i = this.LJLILLLLZI;
        C65864Pt6<K, V> c65864Pt6 = this.LJLIL;
        if (i < c65864Pt6.length) {
            this.LJLILLLLZI = i + 1;
            this.LJLJI = i;
            V[] vArr = c65864Pt6.valuesArray;
            o.LJI(vArr);
            V v = vArr[this.LJLJI];
            LIZ();
            return v;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C65866Pt8(C65864Pt6<K, V> map) {
        super(map);
        o.LJIIIZ(map, "map");
    }
}
