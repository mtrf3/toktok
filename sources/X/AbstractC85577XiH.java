package X;

import Y.ACListenerS35S0100000_15;
import android.os.Bundle;
import com.bytedance.android.livesdk.livesetting.performance.LiveGiftNewGifterBadgeSetting;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.account.login.auth.SignupViewModel;
import com.ss.android.ugc.aweme.account.login.googleonetap.GoogleOneTapService;
import com.ss.android.ugc.aweme.account.login.model.BaseLoginMethod;
import com.ss.android.ugc.aweme.account.login.model.TPLoginMethod;
import com.ss.android.ugc.aweme.account.login.passkey.PasskeyService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.MandatoryLoginService;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.o;

/* renamed from: X.XiH, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public abstract class AbstractC85577XiH implements InterfaceC85586XiQ {
    public final ActivityC86117Xqz LIZ;
    public final R6A LIZIZ;
    public final InterfaceC85592XiW LIZJ;
    public final C62822Ol8 LIZLLL;

    public abstract Bundle LIZJ();

    public final SignupViewModel LIZIZ() {
        return (SignupViewModel) this.LIZLLL.getValue();
    }

    public final void LJI() {
        if (!LIZIZ().sv0()) {
            LJFF(LIZIZ().ov0().LJLJI);
            return;
        }
        if (((Boolean) LIZIZ().LLIIIZ.getValue()).booleanValue()) {
            LJFF(LIZIZ().ov0().LJLJI);
            LIZIZ().ov0().LJLJJL.setVisibility(0);
            C16880lQ.LJJJJI(LIZIZ().ov0().LJLJJL, new ACListenerS35S0100000_15(this, 6));
            return;
        }
        TuxIconView tuxIconView = LIZIZ().ov0().LJLJJI;
        C16880lQ.LJJJ(tuxIconView, new ACListenerS35S0100000_15(this, 7));
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZ = R.raw.icon_x_mark;
        c2068389v.LJ = Integer.valueOf(R.attr.gv);
        tuxIconView.setTuxIcon(c2068389v);
        tuxIconView.setVisibility(0);
        LJFF(LIZIZ().ov0().LJLJI);
    }

    public final void LJIIIZ() {
        String str;
        if (!PasskeyService.LJFF().LIZJ()) {
            return;
        }
        if (!MandatoryLoginService.createIMandatoryLoginServicebyMonsterPlugin(false).shouldShowLoginTabFirst()) {
            str = "passkey_login";
        } else {
            str = "passkey_google_onetap";
        }
        R6A r6a = this.LIZIZ;
        boolean LJJLIIJ = LJJLIIJ();
        Bundle LIZJ = LIZJ();
        LIZJ.putString("enter_type", "click_login");
        r6a.LJJJLZIJ(LJJLIIJ, "passkey", "click_login", str, LIZJ);
    }

    public final void LIZ(Bundle bundle) {
        bundle.putBoolean("is_from_new_user_journey", ((Boolean) LIZIZ().LLIIIZ.getValue()).booleanValue());
        bundle.putBoolean("age_gate_block", ((Boolean) LIZIZ().LLIIL.getValue()).booleanValue());
        bundle.putBoolean("is_fullscreen", LIZIZ().rv0());
        bundle.putBoolean("is_expandable_dialog", LIZIZ().pv0());
    }

    public final void LIZLLL(String str) {
        if (LIZIZ().rv0()) {
            C35936E8m c35936E8m = new C35936E8m();
            c35936E8m.LIZLLL("enter_method", LIZIZ().getEnterMethod());
            c35936E8m.LIZLLL("enter_from", LIZIZ().getEnterFrom());
            c35936E8m.LIZLLL("exit_method", str);
            FMX.LJIIL("exit_cold_launch_login_notify", c35936E8m.LIZ);
        }
    }

    public final void LJ(String str) {
        C35936E8m c35936E8m = new C35936E8m();
        c35936E8m.LIZLLL("enter_method", LIZIZ().getEnterMethod());
        c35936E8m.LIZLLL("enter_from", LIZIZ().getEnterFrom());
        c35936E8m.LIZLLL("exit_method", str);
        c35936E8m.LIZLLL("group_id", LIZIZ().jv0());
        c35936E8m.LIZLLL("login_panel_type", LIZIZ().lv0());
        c35936E8m.LIZIZ(((Number) LIZIZ().LJLLL.getValue()).longValue(), "duration");
        if (o.LJ(LIZIZ().getEnterFrom(), "age_gate_page")) {
            c35936E8m.LIZJ("exit_to", "back_to_age_gate");
        }
        FMX.LJIIL("close_login_notify", c35936E8m.LIZ);
        if (LJJLIL()) {
            String enterFrom = LIZIZ().getEnterFrom();
            o.LJIIIIZZ(enterFrom, "dependencies.enterFrom");
            String enterMethod = LIZIZ().getEnterMethod();
            o.LJIIIIZZ(enterMethod, "dependencies.enterMethod");
            C85579XiJ.LIZLLL("close", enterFrom, enterMethod);
        }
        LIZLLL("skip");
        this.LIZJ.LJIILIIL();
    }

    public final void LJFF(TuxIconView tuxIconView) {
        C16880lQ.LJJJ(tuxIconView, new ACListenerS35S0100000_15(this, 5));
        tuxIconView.setIconRes(R.raw.icon_question_mark_circle_ltr);
        tuxIconView.setTintColorRes(R.attr.gv);
        tuxIconView.setVisibility(0);
    }

    public final void LJII(boolean z, boolean z2) {
        GoogleOneTapService.LJI.getValue().LJII(new WeakReference(this.LIZ), LJJLIIJ(), "login_panel_close", true, z, z2);
    }

    public AbstractC85577XiH(ActivityC86117Xqz activity, R6A signupListener, InterfaceC85592XiW signupContentListener) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(signupListener, "signupListener");
        o.LJIIIZ(signupContentListener, "signupContentListener");
        this.LIZ = activity;
        this.LIZIZ = signupListener;
        this.LIZJ = signupContentListener;
        this.LIZLLL = C221108m2.LIZIZ(new AqS165S0100000_15(this, 11));
    }

    public final void LJIIIIZZ(String str, boolean z, boolean z2) {
        String uid;
        String uid2;
        String str2;
        WeakReference weakReference = new WeakReference(this.LIZ);
        String enterMethod = LIZIZ().getEnterMethod();
        o.LJIIIIZZ(enterMethod, "dependencies.enterMethod");
        if (!QCT.LIZ(enterMethod, weakReference) || !o.LJ("US", AccountService.LJIJ().LJIILL()) || ((Boolean) QCT.LIZ.getValue()).booleanValue()) {
            GoogleOneTapService.LJI.getValue().LJII(new WeakReference(this.LIZ), LJJLIIJ(), str, false, z, z2);
            return;
        }
        C35936E8m c35936E8m = new C35936E8m();
        c35936E8m.LIZLLL("enter_from", LIZIZ().getEnterFrom());
        c35936E8m.LIZJ("enter_method", LIZIZ().getEnterMethod());
        User user = AV1.LIZ;
        if (user == null) {
            uid = ((RBX) HG3.LJIILL()).getLastUid();
        } else {
            uid = user.getUid();
        }
        if (!o.LJ(uid, "")) {
            c35936E8m.LIZ(1, "prev_logged");
        } else {
            c35936E8m.LIZ(0, "prev_logged");
        }
        User user2 = AV1.LIZ;
        if (user2 == null) {
            uid2 = ((RBX) HG3.LJIILL()).getLastUid();
        } else {
            uid2 = user2.getUid();
        }
        if (!o.LJ(uid2, "")) {
            BaseLoginMethod LJIIJJI = C68517Qun.LIZ.LJIIJJI();
            if (LJIIJJI instanceof TPLoginMethod) {
                str2 = ((TPLoginMethod) LJIIJJI).getPlatform();
            } else {
                str2 = LJIIJJI.getLoginMethodName().toString();
            }
        } else {
            str2 = LiveGiftNewGifterBadgeSetting.DEFAULT;
        }
        c35936E8m.LIZJ("prev_login_method", str2);
        FMX.LJIIL("show_google_onetap", c35936E8m.LIZ);
        R6A r6a = this.LIZIZ;
        boolean LJJLIIJ = LJJLIIJ();
        Bundle LIZJ = LIZJ();
        LIZJ.putString("enter_type", "auto_pop");
        r6a.LJJJLZIJ(LJJLIIJ, "google_onetap", "auto_pop", "signup_login", LIZJ);
    }
}
