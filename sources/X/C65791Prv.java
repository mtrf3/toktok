package X;

import java.util.Iterator;
import java.util.Map;

/* renamed from: X.Prv, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65791Prv extends AbstractC65793Prx {
    public final transient AbstractC65789Prt LJLJI;
    public final transient Object[] LJLJJI;
    public final transient int LJLJJL;

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.LJLJJL;
    }

    @Override // X.AbstractC65793Prx
    public final AbstractC65794Pry LJIIJ() {
        return new C65796Ps0(this);
    }

    @Override // X.AbstractC65793Prx, X.AbstractC65792Prw, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return zzd().listIterator(0);
    }

    @Override // X.AbstractC65793Prx, X.AbstractC65792Prw
    /* renamed from: zze */
    public final AbstractC65801Ps5 iterator() {
        return zzd().listIterator(0);
    }

    @Override // X.AbstractC65792Prw
    public final int LIZJ(Object[] objArr) {
        return zzd().LIZJ(objArr);
    }

    @Override // X.AbstractC65792Prw, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.LJLJI.get(key))) {
                return true;
            }
        }
        return false;
    }

    public C65791Prv(AbstractC65789Prt abstractC65789Prt, Object[] objArr, int i) {
        this.LJLJI = abstractC65789Prt;
        this.LJLJJI = objArr;
        this.LJLJJL = i;
    }
}
