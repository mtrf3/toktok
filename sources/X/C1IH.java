package X;

import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.1IH, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1IH<K, V> extends C0O7<K, V> implements Iterator<Map.Entry<K, V>>, InterfaceC90533gv {
    @Override // java.util.Iterator
    public final Object next() {
        LIZ();
        if (this.LJLJJI != null) {
            return new C41281jg(this);
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1IH(C41311jj<K, V> map, Iterator<? extends Map.Entry<? extends K, ? extends V>> iterator) {
        super(map, iterator);
        o.LJIIIZ(map, "map");
        o.LJIIIZ(iterator, "iterator");
    }
}
