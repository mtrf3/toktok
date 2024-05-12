package X;

import java.io.InputStream;

/* loaded from: classes15.dex */
public final class VXI implements InterfaceC79048V0q {
    public final InputStream LJLIL;

    @Override // X.InterfaceC79048V0q
    public final boolean available() {
        if (this.LJLIL.available() >= 0) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC79048V0q
    public final void close() {
        this.LJLIL.close();
    }

    public VXI(VXH vxh) {
        this.LJLIL = vxh;
    }

    @Override // X.InterfaceC79048V0q
    public final int read(byte[] bArr, int i, int i2) {
        return this.LJLIL.read(bArr, 0, i2);
    }
}
