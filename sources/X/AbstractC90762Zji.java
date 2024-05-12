package X;

import java.util.Iterator;

/* renamed from: X.Zji, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public abstract class AbstractC90762Zji<E> extends AbstractC90354Zd8<E> implements java.util.Set<E> {
    public transient AbstractC90754Zja<E> LJLILLLLZI;

    @Override // X.AbstractC90354Zd8
    /* renamed from: zze */
    public abstract AbstractC90278Zbu<E> iterator();

    @Override // X.AbstractC90354Zd8
    public AbstractC90754Zja<E> zzd() {
        AbstractC90754Zja<E> abstractC90754Zja = this.LJLILLLLZI;
        if (abstractC90754Zja == null) {
            AbstractC90754Zja<E> LJIIJ = LJIIJ();
            this.LJLILLLLZI = LJIIJ;
            return LJIIJ;
        }
        return abstractC90754Zja;
    }

    public AbstractC90754Zja<E> LJIIJ() {
        Object[] array = toArray();
        int length = array.length;
        if (length == 0) {
            return C90901Zlx.LJLJJL;
        }
        return new C90901Zlx(length, array);
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

    @Override // X.AbstractC90354Zd8, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
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
