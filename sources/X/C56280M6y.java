package X;

import Y.ACListenerS26S0100000_6;
import android.app.Activity;
import android.os.Bundle;
import android.os.SystemClock;
import com.ss.android.ugc.aweme.service.increaseloginnotify.IncreaseLoginNotifyService;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS159S0100000_9;

/* renamed from: X.M6y, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56280M6y extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ IncreaseLoginNotifyService LJLIL;
    public final /* synthetic */ ActivityC45651qj LJLILLLLZI;
    public final /* synthetic */ Activity LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C56280M6y(IncreaseLoginNotifyService increaseLoginNotifyService, ActivityC45651qj activityC45651qj, ActivityC45651qj activityC45651qj2) {
        super(0);
        this.LJLIL = increaseLoginNotifyService;
        this.LJLILLLLZI = activityC45651qj;
        this.LJLJI = activityC45651qj2;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        int LJII = this.LJLIL.LJII();
        if (LJII != 1 && LJII != 2) {
            if (LJII == 3) {
                Bundle LJ = V3N.LJ(new OSZ[0]);
                LJ.putBoolean("should_change_signup_copy_for_increase_login_notify", true);
                InterfaceC65895Ptb LJIIIIZZ = HG3.LJIIIIZZ();
                C78450Uqc c78450Uqc = new C78450Uqc();
                c78450Uqc.LIZ = this.LJLILLLLZI;
                c78450Uqc.LIZIZ = "homepage_hot";
                c78450Uqc.LIZJ = "increase_login_notify_triggered";
                c78450Uqc.LIZLLL = LJ;
                C40925G4j.LIZ(c78450Uqc, LJIIIIZZ);
            }
        } else {
            IncreaseLoginNotifyService increaseLoginNotifyService = this.LJLIL;
            AKT akt = new AKT(this.LJLILLLLZI);
            akt.LJ(R.style.ux);
            akt.LIZ.LJLJL = ((Number) this.LJLIL.LJIIIIZZ.getValue()).intValue();
            akt.LJI(this.LJLILLLLZI.getString(R.string.j8b));
            IncreaseLoginNotifyService increaseLoginNotifyService2 = this.LJLIL;
            akt.LIZJ(increaseLoginNotifyService2.LJIIIZ(increaseLoginNotifyService2.LJII()));
            akt.LIZ.LJLJLJ = new ACListenerS26S0100000_6(this.LJLJI, 6);
            akt.LIZIZ(new AqS159S0100000_9(this.LJLIL, 857));
            increaseLoginNotifyService.LJ = akt;
            IncreaseLoginNotifyService increaseLoginNotifyService3 = this.LJLIL;
            AKT akt2 = increaseLoginNotifyService3.LJ;
            if (akt2 != null) {
                akt2.LJII();
                increaseLoginNotifyService3.LIZLLL = Long.valueOf(SystemClock.elapsedRealtime());
                C188727au c188727au = new C188727au();
                c188727au.LJIIIZ("enter_from", "homepage_hot");
                c188727au.LJIIIZ("enter_method", "increase_login_notify_triggered");
                FMX.LJIIL("login_bottom_toast", c188727au.LIZ);
            }
        }
        return C76800UCe.LIZ;
    }
}
