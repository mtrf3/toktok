package X;

import java.io.InputStream;

/* loaded from: classes16.dex */
public final class X70 extends X71 {
    public int LJLIL;
    public final /* synthetic */ C84308X6y LJLILLLLZI;

    @Override // X.X71
    public final boolean LIZ() {
        this.LJLILLLLZI.LIZJ();
        if (this.LJLIL < this.LJLILLLLZI.LJLIL.length) {
            return true;
        }
        return false;
    }

    @Override // X.X71
    public final X72 LIZIZ() {
        this.LJLILLLLZI.LIZJ();
        C84308X6y c84308X6y = this.LJLILLLLZI;
        C84309X6z[] c84309X6zArr = c84308X6y.LJLIL;
        int i = this.LJLIL;
        this.LJLIL = i + 1;
        C84309X6z c84309X6z = c84309X6zArr[i];
        InputStream inputStream = c84308X6y.LJLILLLLZI.getInputStream(c84309X6z.LJLJI);
        try {
            return new X72(c84309X6z, inputStream);
        } catch (Throwable th) {
            if (inputStream != null) {
                inputStream.close();
            }
            throw th;
        }
    }

    public X70(C84308X6y c84308X6y) {
        this.LJLILLLLZI = c84308X6y;
    }
}
