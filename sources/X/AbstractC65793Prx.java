package X;

import java.util.Iterator;

/* renamed from: X.Prx, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC65793Prx extends AbstractC65792Prw implements java.util.Set {
    public transient AbstractC65794Pry LJLILLLLZI;

    @Override // X.AbstractC65792Prw
    /* renamed from: zze */
    public abstract AbstractC65801Ps5 iterator();

    @Override // X.AbstractC65792Prw
    public AbstractC65794Pry zzd() {
        AbstractC65794Pry abstractC65794Pry = this.LJLILLLLZI;
        if (abstractC65794Pry == null) {
            AbstractC65794Pry LJIIJ = LJIIJ();
            this.LJLILLLLZI = LJIIJ;
            return LJIIJ;
        }
        return abstractC65794Pry;
    }

    public AbstractC65794Pry LJIIJ() {
        Object[] array = toArray();
        int length = array.length;
        if (length == 0) {
            return C65798Ps2.LJLJJL;
        }
        return new C65798Ps2(length, array);
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int i;
        Iterator it = iterator();
        int i2 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            if (next != null) {
                i = next.hashCode();
            } else {
                i = 0;
            }
            i2 += i;
        }
        return i2;
    }

    @Override // X.AbstractC65792Prw, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* bridge */ /* synthetic */ Iterator iterator() {
        return iterator();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this || obj == this) {
            return true;
        }
        if (obj instanceof java.util.Set) {
            java.util.Set set = (java.util.Set) obj;
            try {
                if (size() == set.size()) {
                    if (containsAll(set)) {
                        return true;
                    }
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }
}
