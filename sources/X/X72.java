package X;

import java.io.InputStream;

/* loaded from: classes16.dex */
public class X72 implements InterfaceC84307X6x {
    public final X73 LJLIL;
    public final InputStream LJLILLLLZI;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.LJLILLLLZI.close();
    }

    public X72(X73 x73, InputStream inputStream) {
        this.LJLIL = x73;
        this.LJLILLLLZI = inputStream;
    }
}
