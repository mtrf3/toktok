package X;

import android.app.Activity;
import android.os.Bundle;
import com.bytedance.poplayer.core.PopupManager;
import com.ss.android.ugc.aweme.compliance.api.services.depend.IComplianceDependService;
import kotlin.jvm.internal.o;

/* renamed from: X.FjP, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39783FjP implements InterfaceC39779FjL {
    public final java.util.Set<String> LIZ = C77275UUl.LJIIIIZZ("UserUpdate", "WindowFocusChanged");

    @Override // X.InterfaceC39779FjL
    public final void LIZ() {
    }

    @Override // X.InterfaceC39779FjL
    public final String LIZJ() {
        return "AgeGateBanGatekeeperTask";
    }

    @Override // X.InterfaceC39779FjL
    public final java.util.Set<String> LIZIZ() {
        return this.LIZ;
    }

    @Override // X.InterfaceC39779FjL
    public final EnumC39780FjM category() {
        return EnumC39780FjM.BLOCKING;
    }

    @Override // X.InterfaceC39779FjL
    public final boolean LJ(Bundle bundle, String signal) {
        IComplianceDependService LIZ;
        o.LJIIIZ(signal, "signal");
        o.LJIIIZ(bundle, "bundle");
        if ((!o.LJ(signal, "WindowFocusChanged") || bundle.getBoolean("has_focus")) && AV1.LJIIL() && ((LIZ = C54936LhE.LIZ()) == null || !LIZ.LIZ())) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC39779FjL
    public final void LIZLLL(String signal, Bundle bundle, C39778FjK c39778FjK) {
        ActivityC45651qj activityC45651qj;
        o.LJIIIZ(signal, "signal");
        o.LJIIIZ(bundle, "bundle");
        Activity LJIIIIZZ = C84763XOl.LJIIIIZZ();
        if (LJIIIIZZ instanceof ActivityC45651qj) {
            activityC45651qj = (ActivityC45651qj) LJIIIIZZ;
        } else {
            activityC45651qj = null;
        }
        PopupManager.LJIIL(new C40459FuJ(activityC45651qj, c39778FjK));
    }
}
