package X;

import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* renamed from: X.PpQ, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C65636PpQ<K, V> extends AbstractC65632PpM<K, V>.a implements java.util.Set<Map.Entry<K, V>> {
    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return C65607Pox.LIZIZ(this);
    }

    public C65636PpQ(AbstractC65632PpM abstractC65632PpM) {
        super();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        return C65607Pox.LIZ(this, obj);
    }
}
