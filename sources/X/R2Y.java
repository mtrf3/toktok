package X;

import android.os.Bundle;

/* loaded from: classes12.dex */
public final class R2Y implements InterfaceC73463SsN<String> {
    public final /* synthetic */ Boolean LJLIL;
    public final /* synthetic */ Bundle LJLILLLLZI;
    public final /* synthetic */ R2X LJLJI;

    @Override // X.InterfaceC73463SsN
    public final void onSubscribe(InterfaceC92693kP interfaceC92693kP) {
    }

    @Override // X.InterfaceC73463SsN
    public final void onError(Throwable th) {
        if (th instanceof C38333F2r) {
            C38333F2r c38333F2r = (C38333F2r) th;
            C38591FCp.LIZ(1, c38333F2r.getErrorCode(), "checkout", c38333F2r.getErrorMsg());
            R41.LJIIJ(false);
        }
    }

    @Override // X.InterfaceC73463SsN
    public final void onSuccess(String str) {
        try {
            this.LJLJI.LIZ(str, false, this.LJLIL.booleanValue(), this.LJLILLLLZI);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public R2Y(R2X r2x, Boolean bool, Bundle bundle) {
        this.LJLJI = r2x;
        this.LJLIL = bool;
        this.LJLILLLLZI = bundle;
    }
}
