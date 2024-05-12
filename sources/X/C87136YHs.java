package X;

/* renamed from: X.YHs, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C87136YHs extends C87135YHr {
    public final int LJLILLLLZI;

    @Override // X.C87135YHr
    public final void LJIIJ() {
    }

    @Override // X.C87135YHr, X.AbstractC87134YHq
    public final int zzd() {
        return this.LJLILLLLZI;
    }

    @Override // X.C87135YHr, X.AbstractC87134YHq
    public final byte LIZJ(int i) {
        return this.LJLIL[i];
    }

    @Override // X.C87135YHr, X.AbstractC87134YHq
    public final byte zza(int i) {
        int i2 = this.LJLILLLLZI;
        if (((i2 - (i + 1)) | i) < 0) {
            if (i < 0) {
                throw new ArrayIndexOutOfBoundsException(C64.LIZIZ("Index < 0: ", i));
            }
            throw new ArrayIndexOutOfBoundsException(C48263Iwt.LIZIZ("Index > length: ", i, ", ", i2));
        }
        return this.LJLIL[i];
    }

    public C87136YHs(byte[] bArr, int i) {
        super(bArr);
        AbstractC87134YHq.LJIIIZ(0, i, bArr.length);
        this.LJLILLLLZI = i;
    }
}
