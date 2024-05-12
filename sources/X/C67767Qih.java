package X;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

/* renamed from: X.Qih, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67767Qih implements InterfaceC67706Qhi, InterfaceC67707Qhj {
    public final /* synthetic */ C67761Qib LJLIL;

    public /* synthetic */ C67767Qih(C67761Qib c67761Qib) {
        this.LJLIL = c67761Qib;
    }

    @Override // X.InterfaceC67784Qiy
    public final void v7(int i) {
    }

    @Override // X.InterfaceC67784Qiy
    public final void H0(Bundle bundle) {
        QH7.LJIIIIZZ(this.LJLIL.LJIIZILJ);
        InterfaceC67779Qit interfaceC67779Qit = this.LJLIL.LJIIJ;
        QH7.LJIIIIZZ(interfaceC67779Qit);
        interfaceC67779Qit.LJII(new BinderC67774Qio(this.LJLIL));
    }

    @Override // X.InterfaceC67712Qho
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        this.LJLIL.LIZIZ.lock();
        try {
            if (this.LJLIL.LJIIJJI && !connectionResult.LJJJJL()) {
                this.LJLIL.LJII();
                this.LJLIL.LJIIL();
            } else {
                this.LJLIL.LJIIJ(connectionResult);
            }
        } finally {
            this.LJLIL.LIZIZ.unlock();
        }
    }
}
