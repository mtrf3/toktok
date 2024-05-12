package X;

import android.view.View;
import com.ss.android.ugc.aweme.account.login.auth.I18nSignUpActivity;
import com.ss.android.ugc.aweme.account.login.auth.SignupViewModel;
import kotlin.jvm.internal.o;

/* renamed from: X.XiI, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85578XiI extends AbstractC80579Vjr {
    public final /* synthetic */ I18nSignUpActivity LIZ;

    @Override // X.AbstractC80579Vjr
    public final void LIZ(View view) {
    }

    public C85578XiI(I18nSignUpActivity i18nSignUpActivity) {
        this.LIZ = i18nSignUpActivity;
    }

    @Override // X.AbstractC80579Vjr
    public final void LIZIZ(int i, View view) {
        if (i == 5) {
            C35936E8m c35936E8m = new C35936E8m();
            SignupViewModel signupViewModel = this.LIZ.LJLJLJ;
            if (signupViewModel != null) {
                c35936E8m.LIZLLL("enter_method", signupViewModel.getEnterMethod());
                SignupViewModel signupViewModel2 = this.LIZ.LJLJLJ;
                if (signupViewModel2 != null) {
                    c35936E8m.LIZLLL("enter_from", signupViewModel2.getEnterFrom());
                    SignupViewModel signupViewModel3 = this.LIZ.LJLJLJ;
                    if (signupViewModel3 != null) {
                        c35936E8m.LIZLLL("login_panel_type", signupViewModel3.lv0());
                        SignupViewModel signupViewModel4 = this.LIZ.LJLJLJ;
                        if (signupViewModel4 != null) {
                            c35936E8m.LIZLLL("group_id", signupViewModel4.jv0());
                            c35936E8m.LIZLLL("exit_method", "slide");
                            SignupViewModel signupViewModel5 = this.LIZ.LJLJLJ;
                            if (signupViewModel5 != null) {
                                c35936E8m.LIZIZ(((Number) signupViewModel5.LJLLL.getValue()).longValue(), "duration");
                                SignupViewModel signupViewModel6 = this.LIZ.LJLJLJ;
                                if (signupViewModel6 != null) {
                                    if (o.LJ(signupViewModel6.getEnterFrom(), "age_gate_page")) {
                                        c35936E8m.LIZJ("exit_to", "back_to_age_gate");
                                    }
                                    FMX.LJIIL("close_login_notify", c35936E8m.LIZ);
                                    this.LIZ.LLFII();
                                    this.LIZ.finish();
                                    return;
                                }
                                o.LJIJI("dependencies");
                                throw null;
                            }
                            o.LJIJI("dependencies");
                            throw null;
                        }
                        o.LJIJI("dependencies");
                        throw null;
                    }
                    o.LJIJI("dependencies");
                    throw null;
                }
                o.LJIJI("dependencies");
                throw null;
            }
            o.LJIJI("dependencies");
            throw null;
        }
    }
}
