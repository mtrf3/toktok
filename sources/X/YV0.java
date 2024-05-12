package X;

import defpackage.a1;
import java.util.Iterator;

/* loaded from: classes16.dex */
public final class YV0 extends AbstractC87478YUw {
    public final transient Object LJLJI;

    @Override // X.AbstractC87478YUw, X.AbstractC87481YUz, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return new YV6(this.LJLJI);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // X.AbstractC87478YUw, X.AbstractC87481YUz
    /* renamed from: zzd */
    public final YV5 iterator() {
        return new YV6(this.LJLJI);
    }

    @Override // X.AbstractC87478YUw, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.LJLJI.hashCode();
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return a1.LJ("[", this.LJLJI.toString(), "]");
    }

    public YV0(Object obj) {
        this.LJLJI = obj;
    }

    @Override // X.AbstractC87481YUz
    public final void LIZJ(Object[] objArr) {
        objArr[0] = this.LJLJI;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.LJLJI.equals(obj);
    }
}
