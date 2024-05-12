package X;

/* loaded from: classes12.dex */
public final class Q9M extends Q9K {
    public final byte[] LIZIZ;
    public int LIZJ;

    @Override // X.Q9I
    public final boolean LJJIII() {
        if (this.LIZIZ.length - this.LIZJ > 0) {
            return true;
        }
        return false;
    }

    @Override // X.Q9I
    public final byte readByte() {
        byte[] bArr = this.LIZIZ;
        int i = this.LIZJ;
        this.LIZJ = i + 1;
        return bArr[i];
    }

    public Q9M(byte[] bArr) {
        this.LIZIZ = bArr;
    }

    @Override // X.Q9I
    public final String LJJIFFI(long j) {
        String str = new String(this.LIZIZ, this.LIZJ, (int) j, Q9K.LIZ);
        this.LIZJ = (int) (this.LIZJ + j);
        return str;
    }

    @Override // X.Q9I
    public final byte[] LJJII(long j) {
        int i = (int) j;
        byte[] bArr = new byte[i];
        System.arraycopy(this.LIZIZ, this.LIZJ, bArr, 0, i);
        this.LIZJ += i;
        return bArr;
    }

    @Override // X.Q9I
    public final void skip(long j) {
        this.LIZJ = (int) (this.LIZJ + j);
    }
}
