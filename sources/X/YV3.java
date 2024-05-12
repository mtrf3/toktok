package X;

/* loaded from: classes16.dex */
public final class YV3 extends AbstractC87480YUy {
    public static final YV3 LJLJJL = new YV3(0, new Object[0]);
    public final transient Object[] LJLJI;
    public final transient int LJLJJI;

    @Override // X.AbstractC87481YUz
    public final int LJFF() {
        return this.LJLJJI;
    }

    @Override // X.AbstractC87481YUz
    public final int LJII() {
        return 0;
    }

    @Override // X.AbstractC87481YUz
    public final Object[] LJIIIIZZ() {
        return this.LJLJI;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.LJLJJI;
    }

    @Override // X.AbstractC87480YUy, X.AbstractC87481YUz
    public final void LIZJ(Object[] objArr) {
        System.arraycopy(this.LJLJI, 0, objArr, 0, this.LJLJJI);
    }

    @Override // java.util.List
    public final Object get(int i) {
        C47265Ign.LIZ(i, this.LJLJJI);
        Object obj = this.LJLJI[i];
        obj.getClass();
        return obj;
    }

    public YV3(int i, Object[] objArr) {
        this.LJLJI = objArr;
        this.LJLJJI = i;
    }
}
