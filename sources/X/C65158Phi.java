package X;

/* renamed from: X.Phi, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65158Phi {
    public byte[] LIZ;
    public int LIZIZ;

    public C65158Phi(int i) {
        if (i >= 0) {
            this.LIZ = new byte[i];
            return;
        }
        throw new IllegalArgumentException("Buffer capacity may not be negative");
    }

    public final void LIZ(byte[] bArr, int i) {
        if (i >= 0 && i >= 0 && i <= bArr.length) {
            if (i == 0) {
                return;
            }
            int i2 = this.LIZIZ + i;
            byte[] bArr2 = this.LIZ;
            if (i2 > bArr2.length) {
                byte[] bArr3 = new byte[Math.max(bArr2.length << 1, i2)];
                System.arraycopy(this.LIZ, 0, bArr3, 0, this.LIZIZ);
                this.LIZ = bArr3;
            }
            System.arraycopy(bArr, 0, this.LIZ, this.LIZIZ, i);
            this.LIZIZ = i2;
            return;
        }
        throw new IndexOutOfBoundsException();
    }
}
