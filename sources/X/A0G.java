package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.account.agegate.activity.FtcRegistrationCompleteActivity;
import kotlin.jvm.internal.AqS177S0100000_11;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class A0G extends AbstractC65781Prl implements InterfaceC88472Yns<ARN, C76800UCe> {
    public final /* synthetic */ FtcRegistrationCompleteActivity LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A0G(FtcRegistrationCompleteActivity ftcRegistrationCompleteActivity) {
        super(1);
        this.LJLIL = ftcRegistrationCompleteActivity;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(ARN it) {
        o.LJIIIZ(it, "it");
        FtcRegistrationCompleteActivity ftcRegistrationCompleteActivity = this.LJLIL;
        Bundle LLJJIJI = C16880lQ.LLJJIJI(ftcRegistrationCompleteActivity.getIntent());
        if (LLJJIJI == null) {
            LLJJIJI = new Bundle();
        }
        if (R41.LJII()) {
            LLJJIJI.putBoolean("only_login", true);
        }
        C39326Fc2.LIZIZ(LLJJIJI, new AqS177S0100000_11(ftcRegistrationCompleteActivity, 41));
        String str = (String) ftcRegistrationCompleteActivity.LJLIL.getValue();
        C35936E8m c35936E8m = new C35936E8m();
        c35936E8m.LIZLLL("enter_method", str);
        c35936E8m.LIZ(EOO.LIZIZ(), "is_in_personalized_nuj");
        FMX.LJIIL("confirm_relaunch_app_popup", c35936E8m.LIZ);
        return C76800UCe.LIZ;
    }
}
