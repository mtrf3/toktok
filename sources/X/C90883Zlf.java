package X;

import java.util.Iterator;
import java.util.Map;

/* renamed from: X.Zlf, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90883Zlf<K, V> extends AbstractC90762Zji<Map.Entry<K, V>> {
    public final transient Object[] LJLJI;

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 0;
    }

    @Override // X.AbstractC90762Zji
    public final AbstractC90754Zja<Map.Entry<K, V>> LJIIJ() {
        return new C90882Zle(this);
    }

    @Override // X.AbstractC90762Zji, X.AbstractC90354Zd8, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return zzd().listIterator(0);
    }

    @Override // X.AbstractC90762Zji, X.AbstractC90354Zd8
    /* renamed from: zze */
    public final AbstractC90278Zbu<Map.Entry<K, V>> iterator() {
        return zzd().listIterator(0);
    }

    public C90883Zlf(Object[] objArr) {
        this.LJLJI = objArr;
    }

    @Override // X.AbstractC90354Zd8
    public final int LIZJ(Object[] objArr) {
        return zzd().LIZJ(objArr);
    }

    @Override // X.AbstractC90354Zd8, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(null)) {
                return true;
            }
        }
        return false;
    }
}
