package com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.activity;

import X.AEB;
import X.AEG;
import X.AbstractActivityC239069Zu;
import X.AbstractC234519Ih;
import X.AbstractC78621UtN;
import X.C16880lQ;
import X.C188727au;
import X.C221108m2;
import X.C234529Ii;
import X.C235119Kp;
import X.C238879Zb;
import X.C238889Zc;
import X.C238909Ze;
import X.C252709vu;
import X.C25848ACm;
import X.C25849ACn;
import X.C25851ACp;
import X.C25859ACx;
import X.C25860ACy;
import X.C36636EZk;
import X.C38281F0r;
import X.C39849FkT;
import X.C56642Ke;
import X.C62822Ol8;
import X.C65803Ps7;
import X.C78613UtF;
import X.C79045V0n;
import X.C84661XKn;
import X.C90193gN;
import X.C9KF;
import X.C9Z8;
import X.C9Z9;
import X.C9ZB;
import X.C9ZE;
import X.C9ZI;
import X.C9ZT;
import X.C9ZZ;
import X.HG3;
import X.QD3;
import X.RBX;
import X.X1D;
import X.XKX;
import Y.ACListenerS24S0100000_4;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.commerce.BizAccountInfo;
import com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.controller.IBaAutoMessageService;
import com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.helper.BaAutoMessageServiceImpl;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.setting.services.LanguageService;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import defpackage.t1;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS94S0101000_4;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class BaMessageSettingActivity extends AbstractActivityC239069Zu {
    public C84661XKn LJLJI;
    public final Boolean LJLJJLL;
    public C25849ACn LJLJL;
    public C25849ACn LJLJLJ;
    public C25849ACn LJLJLLL;
    public C25860ACy LJLL;
    public C25860ACy LJLLI;
    public C25860ACy LJLLILLLL;
    public int LJLLJ;
    public boolean LJLLL;
    public int LJLLLL;
    public int LJLLLLLL;
    public final C238889Zc LJLZ;
    public final Map<Integer, View> LJZ = new LinkedHashMap();
    public final IBaAutoMessageService LJLJJI = BaAutoMessageServiceImpl.LJIJ();
    public final C62822Ol8 LJLJJL = C221108m2.LIZIZ(new AqS154S0100000_4(this, 70));

    @Override // X.AbstractActivityC239069Zu, X.ActivityC86117Xqz, X.KMV
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJZ).clear();
    }

    @Override // X.AbstractActivityC239069Zu, X.ActivityC86117Xqz, X.KMV
    public final View _$_findCachedViewById(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJZ;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public final void onPause() {
        C65803Ps7.LIZJ(this);
        super.onPause();
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onStart() {
        C65803Ps7.LJ(this);
        super.onStart();
    }

    @Override // X.ActivityC86117Xqz, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.activity.BaMessageSettingActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public BaMessageSettingActivity() {
        Boolean bool;
        BizAccountInfo bizAccountInfo;
        User curUser = ((RBX) HG3.LJIILL()).getCurUser();
        if (curUser != null && (bizAccountInfo = curUser.getBizAccountInfo()) != null) {
            bool = Boolean.valueOf(bizAccountInfo.enableSuggestedQuestion());
        } else {
            bool = null;
        }
        this.LJLJJLL = bool;
        this.LJLLL = true;
        this.LJLLLLLL = 3;
        this.LJLZ = new C238889Zc(3, 0);
    }

    public static void LLFII() {
        C38281F0r c38281F0r = new C38281F0r("https://feedback.tiktokv.com/falcon/tiktok/feedback/main/index.html#/?hide_nav_bar=1");
        c38281F0r.LIZLLL("entrance", "BA_auto_message");
        c38281F0r.LIZLLL("locale", LanguageService.LIZ().getAppLanguage());
        SmartRoute buildRoute = SmartRouter.buildRoute(C39849FkT.LIZ(), "aweme://webview/");
        buildRoute.withParam("url", c38281F0r.LJ());
        buildRoute.withParam("hide_nav_bar", true);
        buildRoute.open();
        C238909Ze.LJFF();
    }

    public final C25851ACp LLII() {
        return (C25851ACp) this.LJLJJL.getValue();
    }

    @Override // X.AbstractActivityC239069Zu, X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onDestroy() {
        C65803Ps7.LIZIZ(this);
        super.onDestroy();
        EventBus.LIZJ().LJIJ(this);
    }

    @Override // X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public final void onResume() {
        C65803Ps7.LIZLLL(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.activity.BaMessageSettingActivity", "onResume", true);
        super.onResume();
        this.LJLJI = XKX.LIZIZ(this, C78613UtF.LIZJ, null, new C9ZZ(null), 2);
        AbstractC78621UtN abstractC78621UtN = C36636EZk.LIZ;
        XKX.LIZLLL(this, abstractC78621UtN, null, new C9ZT(this, null), 2);
        XKX.LIZLLL(this, abstractC78621UtN, null, new C9ZI(this, null), 2);
        XKX.LIZLLL(this, null, null, new C9Z9(this, null), 3);
        XKX.LIZLLL(this, null, null, new C9Z8(this, null), 3);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.activity.BaMessageSettingActivity", "onResume", false);
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onStop() {
        C65803Ps7.LJFF(this);
        super.onStop();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused) {
            }
        }
        try {
            getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
        } catch (Throwable unused2) {
        }
    }

    public final String LLFZ(C238889Zc c238889Zc) {
        this.LJLLLLLL = c238889Zc.LJLIL;
        StringBuilder sb = new StringBuilder();
        sb.append(getResources().getText(R.string.skr));
        if (C90193gN.LIZ()) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append('(');
            LIZ.append(c238889Zc.LJLIL);
            LIZ.append('/');
            LIZ.append(c238889Zc.LJLILLLLZI);
            LIZ.append(')');
            sb.append(X1D.LIZIZ(LIZ));
        } else {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(" (");
            LIZ2.append(c238889Zc.LJLILLLLZI);
            LIZ2.append('/');
            LIZ2.append(c238889Zc.LJLIL);
            LIZ2.append(')');
            sb.append(X1D.LIZIZ(LIZ2));
        }
        String sb2 = sb.toString();
        o.LJIIIIZZ(sb2, "StringBuilder().apply {\n…   }\n        }.toString()");
        return sb2;
    }

    public final void LLIIIILZ(C25849ACn c25849ACn) {
        XKX.LIZLLL(this, C36636EZk.LIZ, null, new C9ZE(this, c25849ACn, null), 2);
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void exitSuggestedPage(C56642Ke broadCastEvent) {
        int i;
        o.LJIIIZ(broadCastEvent, "broadCastEvent");
        JSONObject jSONObject = broadCastEvent.LJLIL;
        if (jSONObject != null && TextUtils.equals(JSONObjectProtectorUtils.getString(jSONObject, "eventName"), "suggested_questions_manage_page_exit")) {
            JSONObject optJSONObject = broadCastEvent.LJLIL.optJSONObject("data");
            if (optJSONObject != null) {
                i = JSONObjectProtectorUtils.getInt(optJSONObject, "qa_count");
            } else {
                i = 0;
            }
            C25860ACy c25860ACy = this.LJLLILLLL;
            if (c25860ACy != null) {
                c25860ACy.LJIIJ(new AqS94S0101000_4(this, i, 3));
            } else {
                o.LJIJI("suggestedSetting");
                throw null;
            }
        }
    }

    @Override // X.AbstractActivityC239069Zu, X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public final void onCreate(Bundle bundle) {
        C65803Ps7.LIZ(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.activity.BaMessageSettingActivity", "onCreate", true);
        super.onCreate(bundle);
        setTheme(R.style.kp);
        this.LJLJJI.LJIILJJIL();
        setContentView(R.layout.cjs);
        EventBus.LIZJ().LJIILJJIL(this);
        C252709vu c252709vu = (C252709vu) _$_findCachedViewById(R.id.la4);
        C235119Kp c235119Kp = new C235119Kp();
        C234529Ii LIZJ = s1.LIZJ();
        LIZJ.LIZJ = R.raw.icon_arrow_left_ltr;
        LIZJ.LIZLLL = true;
        LIZJ.LIZIZ(new AqS154S0100000_4(this, 68));
        C9KF LIZLLL = t1.LIZLLL(c235119Kp, new AbstractC234519Ih[]{LIZJ});
        String string = getString(R.string.x_);
        o.LJIIIIZZ(string, "getString(R.string.TTBA_automsg_bs_title)");
        LIZLLL.LIZJ = string;
        c235119Kp.LIZJ = LIZLLL;
        C234529Ii LIZJ2 = s1.LIZJ();
        LIZJ2.LIZJ = R.raw.icon_pen_on_doc;
        LIZJ2.LIZLLL = true;
        LIZJ2.LIZIZ(new AqS154S0100000_4(this, 69));
        c235119Kp.LIZIZ(LIZJ2);
        c252709vu.setNavActions(c235119Kp);
        String string2 = getString(R.string.tw8);
        String string3 = getString(R.string.tw9);
        ACListenerS24S0100000_4 aCListenerS24S0100000_4 = new ACListenerS24S0100000_4(this, 30);
        o.LJIIIIZZ(string2, "getString(R.string.welcome_message)");
        this.LJLJL = new C25849ACn(new C25848ACm(false, string2, aCListenerS24S0100000_4, false, null, null, null, string3, false, false, false, null, 63993));
        String string4 = getString(R.string.hm5);
        String string5 = getString(R.string.hm6);
        ACListenerS24S0100000_4 aCListenerS24S0100000_42 = new ACListenerS24S0100000_4(this, 31);
        o.LJIIIIZZ(string4, "getString(R.string.keyword_auto_reply)");
        this.LJLJLJ = new C25849ACn(new C25848ACm(false, string4, aCListenerS24S0100000_42, false, null, null, null, string5, false, false, false, null, 64505));
        String string6 = getString(R.string.xc);
        ACListenerS24S0100000_4 aCListenerS24S0100000_43 = new ACListenerS24S0100000_4(this, 32);
        o.LJIIIIZZ(string6, "getString(R.string.TTBA_automsg_wel_description)");
        this.LJLL = new C25860ACy(new C25859ACx(string6, null, aCListenerS24S0100000_43, null, true, null, null, null, true, false, null, null, false, false, null, null, null, 8380138));
        StringBuilder sb = new StringBuilder();
        sb.append(getResources().getText(R.string.xa));
        if (C90193gN.LIZ()) {
            sb.append("(4/0) ");
        } else {
            sb.append(" (0/4)");
        }
        String sb2 = sb.toString();
        o.LJIIIIZZ(sb2, "StringBuilder().apply {\n…  }\n\n        }.toString()");
        this.LJLLI = new C25860ACy(new C25859ACx(sb2, null, new ACListenerS24S0100000_4(this, 33), null, true, null, null, getResources().getString(R.string.fgu), true, false, null, null, false, false, null, null, null, 8380010));
        String LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(getIntent(), "enter_from");
        if (LLJJIJIIJIL == null) {
            LLJJIJIIJIL = "";
        }
        C238879Zb eventSender = C238879Zb.LJLIL;
        o.LJIIIZ(eventSender, "eventSender");
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", LLJJIJIIJIL);
        Map<String, String> map = c188727au.LIZ;
        o.LJIIIIZZ(map, "newBuilder()\n           …m)\n            .builder()");
        eventSender.invoke("enter_business_message_setting", map);
        C25851ACp LLII = LLII();
        String string7 = getString(R.string.sku);
        o.LJIIIIZZ(string7, "getString(R.string.ttba_auto_welcome_section)");
        LLII.LIZ(new AEG(new AEB(string7, false, false, false, false, null, null, null, null, null, null, 16382)));
        C25851ACp LLII2 = LLII();
        C25849ACn c25849ACn = this.LJLJL;
        if (c25849ACn != null) {
            LLII2.LIZ(c25849ACn);
            C25851ACp LLII3 = LLII();
            C25860ACy c25860ACy = this.LJLL;
            if (c25860ACy != null) {
                LLII3.LIZ(c25860ACy);
                C25851ACp LLII4 = LLII();
                String string8 = getString(R.string.sko);
                o.LJIIIIZZ(string8, "getString(R.string.ttba_auto_keyword_section)");
                boolean z = true;
                LLII4.LIZ(new AEG(new AEB(string8, true, false, false, false, null, null, null, null, null, null, 16380)));
                C25851ACp LLII5 = LLII();
                C25849ACn c25849ACn2 = this.LJLJLJ;
                if (c25849ACn2 != null) {
                    LLII5.LIZ(c25849ACn2);
                    C25851ACp LLII6 = LLII();
                    C25860ACy c25860ACy2 = this.LJLLI;
                    if (c25860ACy2 != null) {
                        LLII6.LIZ(c25860ACy2);
                        if (o.LJ(this.LJLJJLL, Boolean.TRUE)) {
                            String string9 = getString(R.string.skt);
                            String string10 = getString(R.string.skq);
                            ACListenerS24S0100000_4 aCListenerS24S0100000_44 = new ACListenerS24S0100000_4(this, 288);
                            o.LJIIIIZZ(string9, "getString(R.string.ttba_auto_question_title)");
                            this.LJLJLLL = new C25849ACn(new C25848ACm(false, string9, aCListenerS24S0100000_44, false, null, null, null, string10, false, false, false, null, 62457));
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(getResources().getText(R.string.skr));
                            if (C90193gN.LIZ()) {
                                StringBuilder LIZ = X1D.LIZ();
                                LIZ.append('(');
                                LIZ.append(this.LJLZ.LJLIL);
                                LIZ.append('/');
                                LIZ.append(this.LJLZ.LJLILLLLZI);
                                LIZ.append(") ");
                                sb3.append(X1D.LIZIZ(LIZ));
                            } else {
                                StringBuilder LIZ2 = X1D.LIZ();
                                LIZ2.append(" (");
                                LIZ2.append(this.LJLZ.LJLILLLLZI);
                                LIZ2.append('/');
                                LIZ2.append(this.LJLZ.LJLIL);
                                LIZ2.append(')');
                                sb3.append(X1D.LIZIZ(LIZ2));
                            }
                            String sb4 = sb3.toString();
                            o.LJIIIIZZ(sb4, "StringBuilder().apply {\n…  }\n\n        }.toString()");
                            this.LJLLILLLL = new C25860ACy(new C25859ACx(sb4, null, new ACListenerS24S0100000_4(this, 289), null, true, null, null, null, true, false, null, null, false, false, null, null, null, 8380138));
                            C25851ACp LLII7 = LLII();
                            String string11 = getString(R.string.sks);
                            o.LJIIIIZZ(string11, "getString(R.string.ttba_auto_question_section)");
                            z = true;
                            LLII7.LIZ(new AEG(new AEB(string11, true, false, false, false, null, null, null, null, null, null, 16380)));
                            C25851ACp LLII8 = LLII();
                            C25849ACn c25849ACn3 = this.LJLJLLL;
                            if (c25849ACn3 != null) {
                                LLII8.LIZ(c25849ACn3);
                                C25851ACp LLII9 = LLII();
                                C25860ACy c25860ACy3 = this.LJLLILLLL;
                                if (c25860ACy3 != null) {
                                    LLII9.LIZ(c25860ACy3);
                                    XKX.LIZLLL(this, null, null, new C9ZB(this, null), 3);
                                } else {
                                    o.LJIJI("suggestedSetting");
                                    throw null;
                                }
                            } else {
                                o.LJIJI("suggestedSwitch");
                                throw null;
                            }
                        }
                        LLII().LIZ(new AEG(new AEB("", z, false, false, false, null, null, null, null, null, null, 16380)));
                        this.LJLJJI.LJII();
                        this.LJLJJI.LJIIZILJ();
                        this.LJLJJI.LJIIJ();
                        Integer LJI = C79045V0n.LJI(R.attr.c9, this);
                        if (LJI != null) {
                            LJI.intValue();
                            _$_findCachedViewById(R.id.j83).setBackgroundColor(LJI.intValue());
                            ((C252709vu) _$_findCachedViewById(R.id.la4)).setNavBackground(LJI.intValue());
                            LLII().LIZLLL();
                        }
                        ActivityAgent.onTrace("com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.activity.BaMessageSettingActivity", "onCreate", false);
                        return;
                    }
                    o.LJIJI("autoReplySetting");
                    throw null;
                }
                o.LJIJI("autoReplySwitch");
                throw null;
            }
            o.LJIJI("welcomeSetting");
            throw null;
        }
        o.LJIJI("welcomeSwitch");
        throw null;
    }
}
