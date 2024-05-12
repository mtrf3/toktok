package X;

import java.util.Iterator;

/* renamed from: X.YUx, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C87479YUx extends AbstractC87478YUw {
    public static final Object[] LJLJLJ;
    public static final C87479YUx LJLJLLL;
    public final transient Object[] LJLJI;
    public final transient int LJLJJI;
    public final transient Object[] LJLJJL;
    public final transient int LJLJJLL;
    public final transient int LJLJL;

    static {
        Object[] objArr = new Object[0];
        LJLJLJ = objArr;
        LJLJLLL = new C87479YUx(0, 0, 0, objArr, objArr);
    }

    @Override // X.AbstractC87481YUz
    public final int LJFF() {
        return this.LJLJL;
    }

    @Override // X.AbstractC87481YUz
    public final int LJII() {
        return 0;
    }

    @Override // X.AbstractC87481YUz
    public final Object[] LJIIIIZZ() {
        return this.LJLJI;
    }

    @Override // X.AbstractC87478YUw, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.LJLJJI;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.LJLJL;
    }

    @Override // X.AbstractC87478YUw
    public final YV3 LJIIJ() {
        Object[] objArr = this.LJLJI;
        int i = this.LJLJL;
        if (i == 0) {
            return YV3.LJLJJL;
        }
        return new YV3(i, objArr);
    }

    @Override // X.AbstractC87478YUw, X.AbstractC87481YUz, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return zzg().listIterator(0);
    }

    @Override // X.AbstractC87478YUw, X.AbstractC87481YUz
    /* renamed from: zzd */
    public final YV5 iterator() {
        return zzg().listIterator(0);
    }

    @Override // X.AbstractC87481YUz
    public final void LIZJ(Object[] objArr) {
        System.arraycopy(this.LJLJI, 0, objArr, 0, this.LJLJL);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        Object[] objArr = this.LJLJJL;
        if (obj == null || objArr.length == 0) {
            return false;
        }
        int rotateLeft = (int) (Integer.rotateLeft((int) (obj.hashCode() * (-862048943)), 15) * 461845907);
        while (true) {
            int i = this.LJLJJLL & rotateLeft;
            Object obj2 = objArr[i];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            rotateLeft = i + 1;
        }
    }

    public C87479YUx(int i, int i2, int i3, Object[] objArr, Object[] objArr2) {
        this.LJLJI = objArr;
        this.LJLJJI = i;
        this.LJLJJL = objArr2;
        this.LJLJJLL = i2;
        this.LJLJL = i3;
    }
}
