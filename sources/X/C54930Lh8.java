package X;

import Y.IDCListenerS51S0200000_9;
import android.app.Dialog;
import com.ss.android.ugc.aweme.compliance.business.banappeal.gradientpunish.GradientPunishWarning;
import kotlin.jvm.internal.o;

@InterfaceC55642Lsc("global_gradient_punish_warning")
/* renamed from: X.Lh8, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54930Lh8 extends AbstractC56325M8r<Dialog> {
    public final ActivityC45651qj LJLIL;
    public final String LJLILLLLZI;
    public final int LJLJI = 150;

    @Override // X.InterfaceC55641Lsb
    public final C54082LKk getPopupContext() {
        ActivityC45651qj activityC45651qj = this.LJLIL;
        return C54081LKj.LIZ(activityC45651qj, activityC45651qj);
    }

    @Override // X.M74
    public final boolean canShow() {
        if (C54929Lh7.LIZ() != null) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC56321M8n
    public final int getPriority() {
        return this.LJLJI;
    }

    @Override // com.bytedance.poplayer.IPopupTask
    public final Object showPopup(C54082LKk context) {
        GradientPunishWarning LIZ;
        o.LJIIIZ(context, "context");
        ActivityC45651qj LIZJ = context.LIZJ();
        if (LIZJ == null || (LIZ = C54929Lh7.LIZ()) == null) {
            return null;
        }
        String dialogMessage = LIZ.getDialogMessage();
        String dialogButton = LIZ.getDialogButton();
        C62905OmT c62905OmT = new C62905OmT(LIZJ);
        c62905OmT.LIZJ = dialogMessage;
        c62905OmT.LJIIIIZZ = new C62907OmV(new IDCListenerS51S0200000_9(LIZJ, this, 3), dialogButton, false);
        c62905OmT.LJII = false;
        C62906OmU c62906OmU = new C62906OmU(c62905OmT);
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", this.LJLILLLLZI);
        FMX.LJIIL("violation_dialog_show", c188727au.LIZ);
        return c62906OmU.LJ();
    }

    public C54930Lh8(ActivityC45651qj activityC45651qj, String str) {
        this.LJLIL = activityC45651qj;
        this.LJLILLLLZI = str;
    }
}
