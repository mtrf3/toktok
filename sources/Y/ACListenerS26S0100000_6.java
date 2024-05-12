package Y;

import X.AGF;
import X.AbstractC029409q;
import X.ActivityC45651qj;
import X.C03880Dg;
import X.C12460eI;
import X.C188727au;
import X.C35878E6g;
import X.C39257Fav;
import X.C40751Fz1;
import X.C40882G2s;
import X.C40883G2t;
import X.C63078OpG;
import X.C65300Pk0;
import X.C78450Uqc;
import X.DialogC72606SeY;
import X.E56;
import X.FMX;
import X.G0D;
import X.G31;
import X.G36;
import X.HG3;
import X.HP7;
import X.InterfaceC40740Fyq;
import X.InterfaceC65895Ptb;
import X.J9P;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import com.bytedance.ies.safemode.SmartProtected.fastboot.FastBootBlankActivity;
import com.bytedance.ies.safemode.SmartProtected.utils.logger.LLog;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.journey.step.applanguage.ChooseAppLanguageComponent;
import com.ss.android.ugc.aweme.journey.step.contentlanguage.ContentLanguageComponent;
import com.ss.android.ugc.aweme.journey.step.swipeup.SwipeUpVideoComponent;
import com.ss.android.ugc.aweme.view.hub.ProfileNaviHubFragment;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public class ACListenerS26S0100000_6 implements View.OnClickListener {
    public final int $t;
    public Object l0;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                return;
            case 1:
                onClick$1(this, view);
                return;
            case 2:
                onClick$2(this, view);
                return;
            case 3:
                onClick$3(this, view);
                return;
            case 4:
                onClick$4(this, view);
                return;
            case 5:
                onClick$5(this, view);
                return;
            case 6:
                onClick$6(this, view);
                return;
            case 7:
                onClick$7(this, view);
                return;
            case 8:
                onClick$8(this, view);
                return;
            case 9:
                onClick$9(this, view);
                return;
            case 10:
                onClick$10(this, view);
                return;
            default:
                return;
        }
    }

    public ACListenerS26S0100000_6(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onClick$0(ACListenerS26S0100000_6 aCListenerS26S0100000_6, View view) {
        LLog.LIZ("FastBootLauncher_FastBootBlankActivity", "showWebViewDialog click cancel", new Object[0]);
        FastBootBlankActivity fastBootBlankActivity = (FastBootBlankActivity) aCListenerS26S0100000_6.l0;
        HP7 hp7 = fastBootBlankActivity.LJLIL;
        if (hp7 != null) {
            hp7.dismiss();
        }
        new PthreadThread(new ARunnableS42S0100000_6(fastBootBlankActivity, 17), "FastBootBlankActivity").start();
    }

    public static final void onClick$1(ACListenerS26S0100000_6 aCListenerS26S0100000_6, View view) {
        LLog.LIZ("FastBootLauncher_FastBootBlankActivity", "showWebViewDialog click confirm", new Object[0]);
        FastBootBlankActivity fastBootBlankActivity = (FastBootBlankActivity) aCListenerS26S0100000_6.l0;
        HP7 hp7 = fastBootBlankActivity.LJLIL;
        if (hp7 != null) {
            hp7.dismiss();
        }
        new PthreadThread(new ARunnableS42S0100000_6(fastBootBlankActivity, 18), "FastBootBlankActivity").start();
        View findViewById = fastBootBlankActivity.findViewById(R.id.g4c);
        o.LJFF(findViewById, "findViewById<LinearLayout>(R.id.ll_loading)");
        findViewById.setVisibility(0);
    }

    public static final void onClick$10(ACListenerS26S0100000_6 aCListenerS26S0100000_6, View view) {
        ((AGF) aCListenerS26S0100000_6.l0).dismiss();
        C39257Fav.LIZJ().LIZ();
    }

    public static final void onClick$2(ACListenerS26S0100000_6 aCListenerS26S0100000_6, View view) {
        SwipeUpVideoComponent swipeUpVideoComponent = (SwipeUpVideoComponent) aCListenerS26S0100000_6.l0;
        TuxTextView tuxTextView = swipeUpVideoComponent.LJLLILLLL;
        if (tuxTextView != null) {
            swipeUpVideoComponent.Al(tuxTextView, "click");
            if (E56.LIZ()) {
                SwipeUpVideoComponent swipeUpVideoComponent2 = (SwipeUpVideoComponent) aCListenerS26S0100000_6.l0;
                TuxTextView tuxTextView2 = swipeUpVideoComponent2.LJLLJ;
                if (tuxTextView2 != null) {
                    swipeUpVideoComponent2.Al(tuxTextView2, "");
                    return;
                } else {
                    o.LJIJI("nujNudge");
                    throw null;
                }
            }
            return;
        }
        o.LJIJI("startWatchingView");
        throw null;
    }

    public static final void onClick$3(ACListenerS26S0100000_6 aCListenerS26S0100000_6, View view) {
        SwipeUpVideoComponent swipeUpVideoComponent = (SwipeUpVideoComponent) aCListenerS26S0100000_6.l0;
        swipeUpVideoComponent.LJLLL = true;
        swipeUpVideoComponent.Dl("click");
        TuxTextView tuxTextView = ((SwipeUpVideoComponent) aCListenerS26S0100000_6.l0).LJLLILLLL;
        if (tuxTextView != null) {
            C12460eI.LJIILJJIL(tuxTextView, "c3690", "d9848", null, null);
            SwipeUpVideoComponent swipeUpVideoComponent2 = (SwipeUpVideoComponent) aCListenerS26S0100000_6.l0;
            swipeUpVideoComponent2.getClass();
            C63078OpG.LIZ();
            swipeUpVideoComponent2.vl(null);
            return;
        }
        o.LJIJI("startWatchingView");
        throw null;
    }

    public static final void onClick$4(ACListenerS26S0100000_6 aCListenerS26S0100000_6, View view) {
        ActivityC45651qj mo49getActivity = ((SwipeUpVideoComponent) aCListenerS26S0100000_6.l0).mo49getActivity();
        C40883G2t c40883G2t = new C40883G2t();
        c40883G2t.LIZJ("show_login_page_first", true);
        J9P.LIZIZ(mo49getActivity, "welcome_page", "click_swipeup_button", (Bundle) c40883G2t.LIZ, new C40882G2s((SwipeUpVideoComponent) aCListenerS26S0100000_6.l0));
    }

    public static final void onClick$5(ACListenerS26S0100000_6 aCListenerS26S0100000_6, View view) {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", "avatar_hub");
        FMX.LJIIL("more_option_avatar_hub", c188727au.LIZ);
        DialogC72606SeY Jl = ((ProfileNaviHubFragment) aCListenerS26S0100000_6.l0).Jl();
        if (new C03880Dg(2).LIZJ(300000, "com/ss/android/ugc/aweme/view/hub/ProfileNaviHubOptionsBottomSheet", "show", Jl, new Object[0], "void", new C65300Pk0(false, "()V", "5361340042834576275")).LIZ) {
            return;
        }
        Jl.show();
    }

    public static final void onClick$6(ACListenerS26S0100000_6 aCListenerS26S0100000_6, View view) {
        InterfaceC65895Ptb LJIIIIZZ = HG3.LJIIIIZZ();
        C78450Uqc c78450Uqc = new C78450Uqc();
        c78450Uqc.LIZ = (Activity) aCListenerS26S0100000_6.l0;
        c78450Uqc.LIZIZ = "homepage_hot";
        c78450Uqc.LIZJ = "click_increase_notify_bottom_toast";
        LJIIIIZZ.showLoginAndRegisterView(c78450Uqc.LIZ());
    }

    public static final void onClick$7(ACListenerS26S0100000_6 aCListenerS26S0100000_6, View view) {
        InterfaceC40740Fyq interfaceC40740Fyq;
        ChooseAppLanguageComponent chooseAppLanguageComponent = (ChooseAppLanguageComponent) aCListenerS26S0100000_6.l0;
        chooseAppLanguageComponent.LJLJLLL = true;
        AbstractC029409q adapter = chooseAppLanguageComponent.Dl().getAdapter();
        o.LJII(adapter, "null cannot be cast to non-null type com.ss.android.ugc.aweme.journey.step.applanguage.ChooseAppLanguageAdapter");
        G36 g36 = ((G31) adapter).LJLJJI;
        o.LJI(g36);
        ChooseAppLanguageComponent chooseAppLanguageComponent2 = (ChooseAppLanguageComponent) aCListenerS26S0100000_6.l0;
        String LIZJ = g36.LIZJ();
        o.LJIIIIZZ(LIZJ, "selectItem.isO639");
        chooseAppLanguageComponent2.Hl(LIZJ, false);
        C35878E6g.LIZ();
        ((ChooseAppLanguageComponent) aCListenerS26S0100000_6.l0).getClass();
        G0D LIZ = C40751Fz1.LIZ();
        if (LIZ != null && (interfaceC40740Fyq = (InterfaceC40740Fyq) LIZ.LIZ(InterfaceC40740Fyq.class)) != null) {
            interfaceC40740Fyq.hg0(g36);
        }
        ((ChooseAppLanguageComponent) aCListenerS26S0100000_6.l0).vl(null);
    }

    public static final void onClick$8(ACListenerS26S0100000_6 aCListenerS26S0100000_6, View view) {
        ChooseAppLanguageComponent chooseAppLanguageComponent = (ChooseAppLanguageComponent) aCListenerS26S0100000_6.l0;
        chooseAppLanguageComponent.LJLJLLL = true;
        chooseAppLanguageComponent.Hl("cancel", false);
        ((ChooseAppLanguageComponent) aCListenerS26S0100000_6.l0).vl(null);
    }

    public static final void onClick$9(ACListenerS26S0100000_6 aCListenerS26S0100000_6, View view) {
        ContentLanguageComponent contentLanguageComponent = (ContentLanguageComponent) aCListenerS26S0100000_6.l0;
        contentLanguageComponent.LJLJLLL = true;
        contentLanguageComponent.Hl("cancel", false);
        ((ContentLanguageComponent) aCListenerS26S0100000_6.l0).vl(Boolean.TRUE);
    }
}
