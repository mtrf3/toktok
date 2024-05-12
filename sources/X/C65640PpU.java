package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* renamed from: X.PpU, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65640PpU<K, V> extends AbstractC65645PpZ<Map.Entry<K, Collection<V>>, InterfaceC65712Pqe<K>> {
    public C65640PpU(Iterator it) {
        super(it);
    }

    @Override // X.AbstractC65645PpZ
    public final Object LIZ(Object obj) {
        return new C65647Ppb((Map.Entry) obj);
    }
}
