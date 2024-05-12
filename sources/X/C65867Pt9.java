package X;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.o;

/* renamed from: X.Pt9, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65867Pt9<K, V> extends C65869PtB<K, V> implements Iterator<Map.Entry<K, V>>, InterfaceC90533gv {
    @Override // java.util.Iterator
    public final Object next() {
        int i = this.LJLILLLLZI;
        C65864Pt6<K, V> c65864Pt6 = this.LJLIL;
        if (i < c65864Pt6.length) {
            this.LJLILLLLZI = i + 1;
            this.LJLJI = i;
            C65861Pt3 c65861Pt3 = new C65861Pt3(c65864Pt6, i);
            LIZ();
            return c65861Pt3;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C65867Pt9(C65864Pt6<K, V> map) {
        super(map);
        o.LJIIIZ(map, "map");
    }
}
