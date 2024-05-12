package X;

import java.io.IOException;

/* loaded from: classes12.dex */
public final class PVK extends PVM {
    public final PVM LJLIL;
    public final C64532PUi LJLILLLLZI;
    public IOException LJLJI;

    @Override // X.PVM, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.LJLIL.close();
    }

    @Override // X.PVM
    public final long contentLength() {
        return this.LJLIL.contentLength();
    }

    @Override // X.PVM
    public final C39745Fin contentType() {
        return this.LJLIL.contentType();
    }

    @Override // X.PVM
    public final PW3 source() {
        return this.LJLILLLLZI;
    }

    public PVK(PVM pvm) {
        this.LJLIL = pvm;
        this.LJLILLLLZI = PU7.LIZ(new PVI(this, pvm.source()));
    }
}
