package X;

import java.util.Iterator;

/* renamed from: X.Zli, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90886Zli<K> extends AbstractC90762Zji<K> {
    public final transient AbstractC90754Zja<K> LJLJI;

    @Override // X.AbstractC90354Zd8, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 0;
    }

    @Override // X.AbstractC90762Zji, X.AbstractC90354Zd8
    public final AbstractC90754Zja<K> zzd() {
        return this.LJLJI;
    }

    @Override // X.AbstractC90762Zji, X.AbstractC90354Zd8, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return this.LJLJI.listIterator(0);
    }

    @Override // X.AbstractC90762Zji, X.AbstractC90354Zd8
    /* renamed from: zze */
    public final AbstractC90278Zbu<K> iterator() {
        return this.LJLJI.listIterator(0);
    }

    public C90886Zli(C90887Zlj c90887Zlj) {
        this.LJLJI = c90887Zlj;
    }

    @Override // X.AbstractC90354Zd8
    public final int LIZJ(Object[] objArr) {
        return this.LJLJI.LIZJ(objArr);
    }
}
