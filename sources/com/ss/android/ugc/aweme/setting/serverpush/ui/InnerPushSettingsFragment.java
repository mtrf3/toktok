package com.ss.android.ugc.aweme.setting.serverpush.ui;

import X.AG6;
import X.C221108m2;
import X.C235119Kp;
import X.C252709vu;
import X.C25848ACm;
import X.C25851ACp;
import X.C26045AKb;
import X.C52293Kfh;
import X.C52483Kil;
import X.C52726Kmg;
import X.C52906Kpa;
import X.C62822Ol8;
import X.C78840Uwu;
import X.C85897XnR;
import X.C85938Xo6;
import X.C85940Xo8;
import X.EF7;
import X.InterfaceC61213O0r;
import X.InterfaceC85903XnX;
import X.ORY;
import X.SYL;
import X.Z8A;
import Y.ACListenerS31S1200000_15;
import android.os.Bundle;
import android.view.View;
import com.ss.android.ugc.aweme.innerpush.api.setting.FriendsPostExp;
import com.ss.android.ugc.aweme.innerpush.api.setting.InnerPushReverseExp;
import com.ss.android.ugc.aweme.setting.page.BasePage;
import com.ss.android.ugc.aweme.setting.serverpush.model.InAppPushSetting;
import com.ss.android.ugc.aweme.setting.serverpush.model.PushSettingSwitchModel;
import com.ss.android.ugc.aweme.setting.serverpush.model.PushSettings;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS146S0200000_15;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.o;

@InterfaceC61213O0r
/* loaded from: classes16.dex */
public final class InnerPushSettingsFragment extends BasePage implements InterfaceC85903XnX {
    public static final /* synthetic */ int LJLZ = 0;
    public C252709vu LJLJI;
    public C85897XnR LJLLLL;
    public final Map<Integer, View> LJLLLLLL = new LinkedHashMap();
    public final C62822Ol8 LJLJJI = C221108m2.LIZIZ(new AqS165S0100000_15(this, 635));
    public final C62822Ol8 LJLJJL = C221108m2.LIZIZ(new AqS165S0100000_15(this, 630));
    public final C62822Ol8 LJLJJLL = C221108m2.LIZIZ(new AqS165S0100000_15(this, 632));
    public final C62822Ol8 LJLJL = C221108m2.LIZIZ(new AqS165S0100000_15(this, 637));
    public final C62822Ol8 LJLJLJ = C221108m2.LIZIZ(new AqS165S0100000_15(this, 631));
    public final C62822Ol8 LJLJLLL = C221108m2.LIZIZ(new AqS165S0100000_15(this, 629));
    public final C62822Ol8 LJLL = C221108m2.LIZIZ(new AqS165S0100000_15(this, 636));
    public final C62822Ol8 LJLLI = C221108m2.LIZIZ(new AqS165S0100000_15(this, 633));
    public final C62822Ol8 LJLLILLLL = C221108m2.LIZIZ(new AqS165S0100000_15(this, 638));
    public final C62822Ol8 LJLLJ = C221108m2.LIZIZ(new AqS165S0100000_15(this, 639));
    public final C62822Ol8 LJLLL = C221108m2.LIZIZ(new AqS165S0100000_15(this, 634));

    @Override // com.ss.android.ugc.aweme.setting.page.BasePage, com.bytedance.ies.foundation.fragment.BaseFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLLLLLL).clear();
    }

    @Override // com.ss.android.ugc.aweme.setting.page.BasePage, com.bytedance.ies.foundation.fragment.BaseFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLLLLLL;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i)) == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.setting.page.BasePage
    public final int getLayout() {
        return R.layout.cks;
    }

    public final C85938Xo6 Dl() {
        return (C85938Xo6) this.LJLJLLL.getValue();
    }

    public final C85938Xo6 Gl() {
        return (C85938Xo6) this.LJLJLJ.getValue();
    }

    public final C85938Xo6 Hl() {
        return (C85938Xo6) this.LJLL.getValue();
    }

    public final C85938Xo6 Il() {
        return (C85938Xo6) this.LJLLJ.getValue();
    }

    @Override // X.InterfaceC85903XnX
    public final void LLJJ() {
        if (o.LJ(EF7.LJIILIIL, "local_test")) {
            C26045AKb c26045AKb = new C26045AKb(this);
            c26045AKb.LJIIIIZZ(R.string.b5e);
            c26045AKb.LJIIJ();
        }
    }

    @Override // X.InterfaceC85903XnX
    public final void vx() {
        if (o.LJ(EF7.LJIILIIL, "local_test")) {
            C26045AKb c26045AKb = new C26045AKb(this);
            c26045AKb.LJIIIIZZ(R.string.im9);
            c26045AKb.LJIIJ();
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        C85897XnR c85897XnR = this.LJLLLL;
        if (c85897XnR != null) {
            c85897XnR.LIZIZ();
        }
    }

    public final C85938Xo6 Al(int i, boolean z) {
        String string = getString(i);
        o.LJIIIIZZ(string, "getString(stringResId)");
        return new C85938Xo6(new C25848ACm(z, string, null, false, null, null, null, null, false, false, false, null, 65532));
    }

    public final void Jl(C85938Xo6 c85938Xo6, String str) {
        c85938Xo6.getClass();
        c85938Xo6.LJIIJ(new AqS146S0200000_15(c85938Xo6, str, 46));
        c85938Xo6.LJIIJ(new AqS146S0200000_15(c85938Xo6, (View.OnClickListener) new ACListenerS31S1200000_15(c85938Xo6, this, str, 3), 45));
    }

    @Override // com.ss.android.ugc.aweme.setting.page.BasePage, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        o.LJIIIZ(view, "view");
        this.LJLJI = (C252709vu) view.findViewById(R.id.la4);
        View findViewById = view.findViewById(R.id.igb);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.push_list)");
        C25851ACp c25851ACp = new C25851ACp((SYL) findViewById);
        c25851ACp.LIZ((AG6) this.LJLJJI.getValue());
        c25851ACp.LIZ((AG6) this.LJLJJL.getValue());
        c25851ACp.LIZ((AG6) this.LJLJJLL.getValue());
        c25851ACp.LIZ((AG6) this.LJLJL.getValue());
        c25851ACp.LIZ(Gl());
        c25851ACp.LIZ(Dl());
        c25851ACp.LIZ((AG6) this.LJLLI.getValue());
        c25851ACp.LIZ(Il());
        c25851ACp.LIZ(Hl());
        c25851ACp.LIZ((AG6) this.LJLLL.getValue());
        c25851ACp.LIZ((AG6) this.LJLLILLLL.getValue());
        Hl().LJIIIZ(C52293Kfh.LIZ());
        Dl().LJIIIZ(((Boolean) C52906Kpa.LIZ.getValue()).booleanValue());
        ((AG6) this.LJLLI.getValue()).LJIIIZ(((Boolean) FriendsPostExp.LIZJ.getValue()).booleanValue());
        ((AG6) this.LJLLL.getValue()).LJIIIZ(((Boolean) C52726Kmg.LIZ.getValue()).booleanValue());
        boolean z11 = true;
        if (C52483Kil.LIZ && Z8A.LIZIZ.shouldShowProfileViewerPushItem()) {
            Il().LJIIIZ(true);
        } else {
            Il().LJIIIZ(false);
        }
        if (InnerPushReverseExp.LIZ()) {
            ((AG6) this.LJLJJI.getValue()).LJIIIZ(false);
            ((AG6) this.LJLJJL.getValue()).LJIIIZ(false);
            ((AG6) this.LJLJJLL.getValue()).LJIIIZ(false);
            ((AG6) this.LJLJL.getValue()).LJIIIZ(false);
            Dl().LJIIIZ(false);
            Hl().LJIIIZ(false);
            if (ORY.LJJIJ(21, (int[]) InnerPushReverseExp.LIZJ.getValue())) {
                Gl().LJIIIZ(false);
            }
        }
        super.onViewCreated(view, bundle);
        C252709vu c252709vu = this.LJLJI;
        if (c252709vu != null) {
            C235119Kp c235119Kp = new C235119Kp();
            String string = getString(R.string.hbd);
            o.LJIIIIZZ(string, "getString(R.string.in_ap…ush_settings_in_app_push)");
            C78840Uwu.LJJIZ(c235119Kp, string, new AqS165S0100000_15(this, 816));
            c235119Kp.LIZLLL = false;
            c252709vu.setNavActions(c235119Kp);
        }
        Jl((C85938Xo6) this.LJLJJI.getValue(), "in_app_digg_push");
        Jl((C85938Xo6) this.LJLJJL.getValue(), "in_app_comment_push");
        Jl((C85938Xo6) this.LJLJJLL.getValue(), "in_app_follow_push");
        Jl((C85938Xo6) this.LJLJL.getValue(), "in_app_mention_push");
        Jl(Gl(), "in_app_im_push");
        Jl(Dl(), "in_app_active_status_push");
        Jl((C85938Xo6) this.LJLLI.getValue(), "in_app_friends_post_push");
        Jl(Il(), "in_app_profile_viewer_push");
        Jl(Hl(), "live_inner_push");
        Jl((C85938Xo6) this.LJLLL.getValue(), "in_app_sellers_chats_push");
        Jl((C85938Xo6) this.LJLLILLLL.getValue(), "in_app_other_channel_push");
        PushSettings LJ = C85940Xo8.LIZIZ.LJ();
        InAppPushSetting inAppPushSetting = null;
        if (LJ != null) {
            inAppPushSetting = LJ.inAppPushSetting;
            List<PushSettingSwitchModel> list = LJ.extraPushSettings;
            if (list != null) {
                for (PushSettingSwitchModel pushSettingSwitchModel : list) {
                    if (o.LJ(pushSettingSwitchModel.itemId, "in_app_sellers_chats_push")) {
                        C85938Xo6 c85938Xo6 = (C85938Xo6) this.LJLLL.getValue();
                        if (pushSettingSwitchModel.status == 1) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        c85938Xo6.LJIILIIL(z10);
                    }
                }
            }
        }
        C85938Xo6 c85938Xo62 = (C85938Xo6) this.LJLJJI.getValue();
        if (inAppPushSetting != null && inAppPushSetting.getInAppDiggPush() == 1) {
            z = true;
        } else {
            z = false;
        }
        c85938Xo62.LJIILIIL(z);
        C85938Xo6 c85938Xo63 = (C85938Xo6) this.LJLJJL.getValue();
        if (inAppPushSetting != null && inAppPushSetting.getInAppCommentPush() == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        c85938Xo63.LJIILIIL(z2);
        C85938Xo6 c85938Xo64 = (C85938Xo6) this.LJLJJLL.getValue();
        if (inAppPushSetting != null && inAppPushSetting.getInAppFollowPush() == 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        c85938Xo64.LJIILIIL(z3);
        C85938Xo6 c85938Xo65 = (C85938Xo6) this.LJLJL.getValue();
        if (inAppPushSetting != null && inAppPushSetting.getInAppMentionPush() == 1) {
            z4 = true;
        } else {
            z4 = false;
        }
        c85938Xo65.LJIILIIL(z4);
        C85938Xo6 Gl = Gl();
        if (inAppPushSetting != null && inAppPushSetting.getInAppImPush() == 1) {
            z5 = true;
        } else {
            z5 = false;
        }
        Gl.LJIILIIL(z5);
        C85938Xo6 Dl = Dl();
        if (inAppPushSetting != null && inAppPushSetting.getInAppActiveStatusPush() == 1) {
            z6 = true;
        } else {
            z6 = false;
        }
        Dl.LJIILIIL(z6);
        C85938Xo6 c85938Xo66 = (C85938Xo6) this.LJLLI.getValue();
        if (inAppPushSetting != null && inAppPushSetting.getInAppFriendsPostPush() == 1) {
            z7 = true;
        } else {
            z7 = false;
        }
        c85938Xo66.LJIILIIL(z7);
        C85938Xo6 Il = Il();
        if (inAppPushSetting != null && inAppPushSetting.getInAppProfileViewPush() == 1) {
            z8 = true;
        } else {
            z8 = false;
        }
        Il.LJIILIIL(z8);
        C85938Xo6 Hl = Hl();
        if (LJ != null && LJ.liveInnerPush == 1) {
            z9 = true;
        } else {
            z9 = false;
        }
        Hl.LJIILIIL(z9);
        C85938Xo6 c85938Xo67 = (C85938Xo6) this.LJLLILLLL.getValue();
        if (inAppPushSetting == null || inAppPushSetting.getInAppOtherPush() != 1) {
            z11 = false;
        }
        c85938Xo67.LJIILIIL(z11);
        C85897XnR c85897XnR = new C85897XnR();
        this.LJLLLL = c85897XnR;
        c85897XnR.LJLILLLLZI = this;
        c85897XnR.LJLJI = false;
    }
}
