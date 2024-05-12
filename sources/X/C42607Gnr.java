package X;

import android.os.CancellationSignal;

/* renamed from: X.Gnr, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42607Gnr implements InterfaceC92693kP {
    public final InterfaceC92693kP LJLIL;
    public final CancellationSignal LJLILLLLZI;

    @Override // X.InterfaceC92693kP
    public final void dispose() {
        CancellationSignal cancellationSignal = this.LJLILLLLZI;
        if (cancellationSignal != null && !cancellationSignal.isCanceled()) {
            this.LJLILLLLZI.cancel();
        }
        if (!this.LJLIL.isDisposed()) {
            this.LJLIL.dispose();
        }
    }

    @Override // X.InterfaceC92693kP
    public final boolean isDisposed() {
        CancellationSignal cancellationSignal;
        if (this.LJLIL.isDisposed() && ((cancellationSignal = this.LJLILLLLZI) == null || cancellationSignal.isCanceled())) {
            return true;
        }
        return false;
    }

    public C42607Gnr(C73411SrX c73411SrX, CancellationSignal cancellationSignal) {
        this.LJLIL = c73411SrX;
        this.LJLILLLLZI = cancellationSignal;
    }
}
