package X;

/* renamed from: X.YHz, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C87143YHz extends C87142YHy {
    public final int LJLJI;
    public final int LJLJJI;

    @Override // X.C87142YHy
    public final int LJIILJJIL() {
        return this.LJLJI;
    }

    @Override // X.C87142YHy, X.AbstractC87141YHx
    public final int size() {
        return this.LJLJJI;
    }

    @Override // X.C87142YHy, X.AbstractC87141YHx
    public final byte LJIIIZ(int i) {
        return this.LJLILLLLZI[this.LJLJI + i];
    }

    @Override // X.C87142YHy, X.AbstractC87141YHx
    public final byte zzfi(int i) {
        int i2 = this.LJLJJI;
        if (((i2 - (i + 1)) | i) < 0) {
            if (i < 0) {
                StringBuilder sb = new StringBuilder(22);
                sb.append("Index < 0: ");
                sb.append(i);
                throw new ArrayIndexOutOfBoundsException(sb.toString());
            }
            StringBuilder sb2 = new StringBuilder(40);
            sb2.append("Index > length: ");
            sb2.append(i);
            sb2.append(", ");
            sb2.append(i2);
            throw new ArrayIndexOutOfBoundsException(sb2.toString());
        }
        return this.LJLILLLLZI[this.LJLJI + i];
    }

    @Override // X.C87142YHy, X.AbstractC87141YHx
    public final void LJII(byte[] bArr, int i) {
        System.arraycopy(this.LJLILLLLZI, this.LJLJI, bArr, 0, i);
    }

    public C87143YHz(byte[] bArr, int i, int i2) {
        super(bArr);
        AbstractC87141YHx.LJIIJ(i, i + i2, bArr.length);
        this.LJLJI = i;
        this.LJLJJI = i2;
    }
}
