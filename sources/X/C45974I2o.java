package X;

import android.view.View;
import kotlin.jvm.internal.o;

/* renamed from: X.I2o, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45974I2o implements InterfaceC81972WFc {
    public final /* synthetic */ WID LIZ;

    @Override // X.InterfaceC81972WFc
    public final void LIZ(C81975WFf c81975WFf) {
    }

    @Override // X.InterfaceC81972WFc
    public final void LIZIZ(C81975WFf c81975WFf) {
    }

    @Override // X.InterfaceC81972WFc
    public final boolean LIZJ(C81975WFf c81975WFf) {
        return false;
    }

    public C45974I2o(WID wid) {
        this.LIZ = wid;
    }

    @Override // X.InterfaceC81972WFc
    public final void LIZLLL(View view, C81975WFf c81975WFf) {
        o.LJIIIZ(view, "view");
        C45964I2e c45964I2e = new C45964I2e(this.LIZ.LJIILIIL().cameraComponentModel.mCurrentDurationMode, this.LIZ.LJIILIIL().cameraComponentModel.mDurationSwitchable);
        InterfaceC45979I2t interfaceC45979I2t = (InterfaceC45979I2t) this.LIZ.LIZ.LJIIIIZZ(null, InterfaceC45979I2t.class);
        if (interfaceC45979I2t != null) {
            interfaceC45979I2t.configSwitchDuration(c45964I2e);
        }
    }
}
