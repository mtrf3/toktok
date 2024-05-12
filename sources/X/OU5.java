package X;

import android.app.Activity;
import android.os.Bundle;

/* loaded from: classes11.dex */
public final class OU5 implements InterfaceC62968OnU {
    public final /* synthetic */ Bundle LIZ;
    public final /* synthetic */ Activity LIZIZ;

    @Override // X.InterfaceC62968OnU
    public final void LIZJ() {
    }

    @Override // X.InterfaceC62968OnU
    public final void LIZIZ() {
        if (AV1.LJIIJJI()) {
            this.LIZ.putBoolean("kids_mode_restart", true);
            ((InterfaceC40454FuE) C58725N2z.LIZIZ(InterfaceC40454FuE.class)).LIZ(this.LIZIZ);
        }
        OUG.LIZ(this.LIZ);
    }

    public OU5(Activity activity, Bundle bundle) {
        this.LIZ = bundle;
        this.LIZIZ = activity;
    }

    @Override // X.InterfaceC62968OnU
    public final void LIZ(String str, boolean z) {
        OUG.LIZ(this.LIZ);
    }
}
