package X;

import android.app.Activity;
import android.os.Bundle;
import com.bytedance.poplayer.core.PopupManager;
import kotlin.jvm.internal.o;

/* renamed from: X.FjQ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39784FjQ implements InterfaceC39779FjL {
    public final java.util.Set<String> LIZ = C77275UUl.LJIIIIZZ("UserUpdate", "WindowFocusChanged");

    @Override // X.InterfaceC39779FjL
    public final void LIZ() {
    }

    @Override // X.InterfaceC39779FjL
    public final String LIZJ() {
        return "RecoverAccountGatekeeperTask";
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
        o.LJIIIZ(signal, "signal");
        o.LJIIIZ(bundle, "bundle");
        if ((o.LJ(signal, "WindowFocusChanged") && (!bundle.getBoolean("has_focus") || !bundle.getBoolean("is_first_visible"))) || !HG3.LJIILL().getCurUser().isUserCancelled()) {
            return false;
        }
        return true;
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
        PopupManager.LJIIL(new C40460FuK(activityC45651qj, c39778FjK));
    }
}
