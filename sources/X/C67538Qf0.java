package X;

import java.io.OutputStream;

/* renamed from: X.Qf0, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67538Qf0 extends OutputStream {
    public long LJLIL;

    @Override // java.io.OutputStream
    public final void write(int i) {
        this.LJLIL++;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        this.LJLIL += bArr.length;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        int i3;
        if (i >= 0 && i <= bArr.length && i2 >= 0 && (i3 = i + i2) <= bArr.length && i3 >= 0) {
            this.LJLIL += i2;
            return;
        }
        throw new IndexOutOfBoundsException();
    }
}
