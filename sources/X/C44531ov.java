package X;

import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.1ov, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C44531ov<K, V> extends C38671fT<K, V> implements EHP {
    public final C38691fV<K, V> LJLJI;
    public V LJLJJI;

    @Override // X.C38671fT, java.util.Map.Entry
    public final V getValue() {
        return this.LJLJJI;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C38671fT, java.util.Map.Entry
    public final V setValue(V v) {
        int i;
        V v2 = this.LJLJJI;
        this.LJLJJI = v;
        C38691fV<K, V> c38691fV = this.LJLJI;
        K k = this.LJLIL;
        C44561oy<K, V, Map.Entry<K, V>> c44561oy = c38691fV.LJLIL;
        if (c44561oy.LJLJJI.containsKey(k)) {
            if (c44561oy.LJLJI) {
                AbstractC38701fW abstractC38701fW = c44561oy.LJLIL[c44561oy.LJLILLLLZI];
                Object obj = abstractC38701fW.LJLIL[abstractC38701fW.LJLJI];
                c44561oy.LJLJJI.put(k, v);
                if (obj != null) {
                    i = obj.hashCode();
                } else {
                    i = 0;
                }
                c44561oy.LIZLLL(i, c44561oy.LJLJJI.LJLJI, obj, 0);
            } else {
                c44561oy.LJLJJI.put(k, v);
            }
            c44561oy.LJLJL = c44561oy.LJLJJI.LJLJJL;
        }
        return v2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C44531ov(C38691fV<K, V> parentIterator, K k, V v) {
        super(k, v);
        o.LJIIIZ(parentIterator, "parentIterator");
        this.LJLJI = parentIterator;
        this.LJLJJI = v;
    }
}
