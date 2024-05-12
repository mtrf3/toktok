package X;

import Y.IDeS358S0100000_13;
import android.os.Bundle;
import android.view.View;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.account.agegate.customdataforsdk.TTKAgeGateRegistrationFragment;
import com.ss.android.ugc.aweme.services.AgeGateSdkRegistrationFlow;

/* renamed from: X.Uqf, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class ViewOnClickListenerC78453Uqf implements View.OnClickListener {
    public final /* synthetic */ TTKAgeGateRegistrationFragment LJLIL;

    public ViewOnClickListenerC78453Uqf(TTKAgeGateRegistrationFragment tTKAgeGateRegistrationFragment) {
        this.LJLIL = tTKAgeGateRegistrationFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.LJLIL.Ol() != AgeGateSdkRegistrationFlow.SIGN_UP.getFlow()) {
            G50.LIZ("login_click");
        }
        Bundle LIZ = C0JT.LIZ("is_fullscreen_dialog", false, "is_skippable_dialog", true);
        LIZ.putBoolean("show_login_page_first", true);
        ActivityC45651qj mo49getActivity = this.LJLIL.mo49getActivity();
        if (mo49getActivity == null || mo49getActivity.isFinishing()) {
            return;
        }
        C78450Uqc c78450Uqc = new C78450Uqc();
        c78450Uqc.LIZ = mo49getActivity;
        c78450Uqc.LIZJ = "age_gate_page";
        c78450Uqc.LIZLLL = LIZ;
        c78450Uqc.LJ = new IDeS358S0100000_13(mo49getActivity, 5);
        AccountService.LJIJ().LJI().showLoginAndRegisterView(new C78451Uqd(c78450Uqc));
    }
}
