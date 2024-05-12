package X;

import java.util.Iterator;

/* renamed from: X.Pru, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65790Pru extends AbstractC65793Prx {
    public final transient AbstractC65789Prt LJLJI;
    public final transient AbstractC65794Pry LJLJJI;

    @Override // X.AbstractC65793Prx, X.AbstractC65792Prw
    public final AbstractC65794Pry zzd() {
        return this.LJLJJI;
    }

    @Override // X.AbstractC65793Prx, X.AbstractC65792Prw, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.LJLJJI.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.LJLJI.size();
    }

    @Override // X.AbstractC65793Prx, X.AbstractC65792Prw
    /* renamed from: zze */
    public final AbstractC65801Ps5 iterator() {
        return this.LJLJJI.listIterator(0);
    }

    @Override // X.AbstractC65792Prw
    public final int LIZJ(Object[] objArr) {
        return this.LJLJJI.LIZJ(objArr);
    }

    @Override // X.AbstractC65792Prw, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (this.LJLJI.get(obj) != null) {
            return true;
        }
        return false;
    }

    public C65790Pru(AbstractC65789Prt abstractC65789Prt, C65799Ps3 c65799Ps3) {
        this.LJLJI = abstractC65789Prt;
        this.LJLJJI = c65799Ps3;
    }
}
