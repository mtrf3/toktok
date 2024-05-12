package X;

import java.util.List;

/* loaded from: classes16.dex */
public final class YV1 extends AbstractC87480YUy {
    public final transient int LJLJI;
    public final transient int LJLJJI;
    public final /* synthetic */ AbstractC87480YUy LJLJJL;

    @Override // X.AbstractC87481YUz
    public final int LJFF() {
        return this.LJLJJL.LJII() + this.LJLJI + this.LJLJJI;
    }

    @Override // X.AbstractC87481YUz
    public final int LJII() {
        return this.LJLJJL.LJII() + this.LJLJI;
    }

    @Override // X.AbstractC87481YUz
    public final Object[] LJIIIIZZ() {
        return this.LJLJJL.LJIIIIZZ();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.LJLJJI;
    }

    @Override // java.util.List
    public final Object get(int i) {
        C47265Ign.LIZ(i, this.LJLJJI);
        return this.LJLJJL.get(i + this.LJLJI);
    }

    @Override // X.AbstractC87480YUy, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }

    @Override // X.AbstractC87480YUy
    /* renamed from: zzf */
    public final AbstractC87480YUy subList(int i, int i2) {
        C47265Ign.LIZJ(i, i2, this.LJLJJI);
        AbstractC87480YUy abstractC87480YUy = this.LJLJJL;
        int i3 = this.LJLJI;
        return abstractC87480YUy.subList(i + i3, i2 + i3);
    }

    public YV1(AbstractC87480YUy abstractC87480YUy, int i, int i2) {
        this.LJLJJL = abstractC87480YUy;
        this.LJLJI = i;
        this.LJLJJI = i2;
    }
}
