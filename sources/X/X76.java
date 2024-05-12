package X;

import java.io.FileInputStream;

/* loaded from: classes16.dex */
public final class X76 extends X71 {
    public int LJLIL;
    public final /* synthetic */ X75 LJLILLLLZI;

    @Override // X.X71
    public final boolean LIZ() {
        if (this.LJLIL < this.LJLILLLLZI.LJLIL.length) {
            return true;
        }
        return false;
    }

    @Override // X.X71
    public final X72 LIZIZ() {
        X7B[] x7bArr = this.LJLILLLLZI.LJLIL;
        int i = this.LJLIL;
        this.LJLIL = i + 1;
        X7B x7b = x7bArr[i];
        FileInputStream fileInputStream = new FileInputStream(x7b.LJLJI);
        try {
            return new X72(x7b, fileInputStream);
        } catch (Throwable th) {
            fileInputStream.close();
            throw th;
        }
    }

    public X76(X75 x75) {
        this.LJLILLLLZI = x75;
    }
}
