package X;

import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.1IL, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1IL<K, V> extends C0O7<K, V> implements Iterator<V>, InterfaceC90533gv {
    @Override // java.util.Iterator
    public final V next() {
        Map.Entry<? extends K, ? extends V> entry = this.LJLJJL;
        if (entry != null) {
            LIZ();
            return entry.getValue();
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1IL(C41311jj<K, V> map, Iterator<? extends Map.Entry<? extends K, ? extends V>> iterator) {
        super(map, iterator);
        o.LJIIIZ(map, "map");
        o.LJIIIZ(iterator, "iterator");
    }
}
