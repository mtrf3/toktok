package X;

/* renamed from: X.Zmx, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90963Zmx extends C90895Zlr {
    public final int LJLILLLLZI;

    @Override // X.C90895Zlr
    public final void LJIIJ() {
    }

    @Override // X.C90895Zlr, X.AbstractC90364ZdI
    public final int zzd() {
        return this.LJLILLLLZI;
    }

    @Override // X.C90895Zlr, X.AbstractC90364ZdI
    public final byte LIZJ(int i) {
        return this.LJLIL[i];
    }

    @Override // X.C90895Zlr, X.AbstractC90364ZdI
    public final byte zza(int i) {
        int i2 = this.LJLILLLLZI;
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
        return this.LJLIL[i];
    }

    public C90963Zmx(byte[] bArr, int i) {
        super(bArr);
        AbstractC90364ZdI.LJIIIZ(i, bArr.length);
        this.LJLILLLLZI = i;
    }
}
