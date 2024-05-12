package X;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.o;

/* renamed from: X.PtA, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65868PtA<K, V> extends C65869PtB<K, V> implements Iterator<K>, InterfaceC90533gv {
    @Override // java.util.Iterator
    public final K next() {
        int i = this.LJLILLLLZI;
        C65864Pt6<K, V> c65864Pt6 = this.LJLIL;
        if (i < c65864Pt6.length) {
            this.LJLILLLLZI = i + 1;
            this.LJLJI = i;
            K k = c65864Pt6.keysArray[i];
            LIZ();
            return k;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C65868PtA(C65864Pt6<K, V> map) {
        super(map);
        o.LJIIIZ(map, "map");
    }
}
