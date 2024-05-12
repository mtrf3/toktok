package X;

import java.util.Collection;
import java.util.Map;

/* renamed from: X.PoL, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC65569PoL<K, V> extends AbstractC65564PoG<K, V> {
    public abstract AbstractC65557Po9<Map.Entry<K, V>> LJI();

    @Override // X.AbstractC65564PoG
    public final AbstractC65583PoZ<Map.Entry<K, V>> LIZ() {
        return new C65568PoK(this);
    }

    @Override // X.AbstractC65564PoG
    public AbstractC65583PoZ<K> LIZIZ() {
        return new C65571PoN(this);
    }

    @Override // X.AbstractC65564PoG
    public final AbstractC65578PoU<V> LIZJ() {
        return new C65604Pou(this);
    }

    @Override // X.AbstractC65564PoG, java.util.Map
    public final /* bridge */ /* synthetic */ java.util.Set entrySet() {
        return entrySet();
    }

    @Override // X.AbstractC65564PoG, java.util.Map
    public final /* bridge */ /* synthetic */ java.util.Set keySet() {
        return keySet();
    }

    @Override // X.AbstractC65564PoG, java.util.Map
    public final /* bridge */ /* synthetic */ Collection values() {
        return values();
    }
}
