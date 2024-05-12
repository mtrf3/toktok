package com.ss.android.ugc.aweme.compliance.business.banappeal;

import X.AbstractC73672Svk;
import X.ActivityC86117Xqz;
import X.C01R;
import X.C09900aA;
import X.C10K;
import X.C16880lQ;
import X.C18I;
import X.C198517qh;
import X.C212428Vi;
import X.C221108m2;
import X.C26045AKb;
import X.C26227ARb;
import X.C2TV;
import X.C36089EEj;
import X.C36093EEn;
import X.C38995FSd;
import X.C3AW;
import X.C40534FvW;
import X.C43280Gyi;
import X.C52283KfX;
import X.C54840Lfg;
import X.C54931Lh9;
import X.C56662Kg;
import X.C62822Ol8;
import X.C62910OmY;
import X.C62948OnA;
import X.C62949OnB;
import X.C62950OnC;
import X.C62951OnD;
import X.C62952OnE;
import X.C62953OnF;
import X.C73318Sq2;
import X.C73428Sro;
import X.C73849Syb;
import X.C73969T1h;
import X.C78685UuP;
import X.C78866UxK;
import X.C78999UzT;
import X.C87277YNd;
import X.C9X3;
import X.G53;
import X.HG3;
import X.IK4;
import X.InterfaceC252619vl;
import X.InterfaceC36571c5;
import X.InterfaceC55452LpY;
import X.QD3;
import X.RBX;
import X.RunnableC58617MzV;
import X.T16;
import X.UC0;
import X.X1D;
import Y.ACallableS87S0200000_10;
import Y.ARunnableS46S0100000_10;
import Y.AfS62S0100000_10;
import Y.AfS6S0100100_10;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility;
import com.ss.android.ugc.aweme.base.BaseMainContainerAssem;
import com.ss.android.ugc.aweme.compliance.business.agecontrol.PNSAgeControlInitTask;
import com.ss.android.ugc.aweme.compliance.business.banappeal.popup.api.AppealApi;
import com.ss.android.ugc.aweme.compliance.business.banappeal.popup.model.AppealStatusResponse;
import com.ss.android.ugc.aweme.compliance.business.gatekeeper.GatekeeperComplianceInitLegoTask;
import com.ss.android.ugc.aweme.compliance.business.statemachine.PNSNormalStateMachineInitTask;
import com.ss.android.ugc.aweme.compliance.common.hydrogen.InitHydrogenTask;
import com.ss.android.ugc.aweme.feed.model.TextWithInlineLink;
import com.ss.android.ugc.aweme.pns.gatekeeper.GatekeeperManager;
import com.ss.android.ugc.aweme.pns.gatekeeper.api.GatekeeperService;
import com.ss.android.ugc.aweme.profile.model.AGSWarning;
import com.ss.android.ugc.aweme.profile.model.AGSWarningPopupWindow;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import com.zhiliaoapp.musically.R;
import defpackage.e1;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AqS141S0200000_10;
import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONObject;
import yq4.a;

/* loaded from: classes11.dex */
public final class ComplianceBusinessActivityAssem extends BaseMainContainerAssem implements InterfaceC252619vl {
    public boolean LJLILLLLZI;
    public boolean LJLJJI;
    public boolean LJLJJLL;
    public AppealStatusResponse LJLJL;
    public boolean LJLJLJ;
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(new AqS160S0100000_10(this, 145));
    public final AtomicBoolean LJLJI = new AtomicBoolean(false);
    public boolean LJLJJL = true;
    public final C73849Syb<Object> LJLJLLL = new C73849Syb<>();
    public final C73318Sq2 LJLL = new C73318Sq2();
    public final C62822Ol8 LJLLI = C221108m2.LIZIZ(C62952OnE.LJLIL);

    @Override // X.C8W0
    public final void onResume() {
        String LLLZ = C16880lQ.LLLZ("main_act_assem_lifecycle_%s_%s", new Object[]{C16880lQ.LJLLJ(ComplianceBusinessActivityAssem.class), "onResume"});
        C56662Kg.LIZ().LIZJ(LLLZ, false);
        super.onResume();
        if (this.LJLJJLL) {
            InterfaceC36571c5 LIZ = C212428Vi.LIZ(this);
            o.LJII(LIZ, "null cannot be cast to non-null type com.ss.android.ugc.aweme.main.IMainActivityService");
            if (!((InterfaceC55452LpY) LIZ).isADShowing() && this.LJLJL != null) {
                SmartRoute buildRoute = SmartRouter.buildRoute(C212428Vi.LIZ(this), "//compliance/appeal_dialog");
                buildRoute.withParam("appeal_info", this.LJLJL);
                buildRoute.open();
            }
        }
        C56662Kg.LIZ().LJFF(LLLZ, false);
    }

    public final ActivityC86117Xqz x3() {
        return (ActivityC86117Xqz) this.LJLIL.getValue();
    }

    @Override // X.C8W0
    public final void onDestroy() {
        super.onDestroy();
        EventBus.LIZJ().LJIJ(this);
        HG3.LJIILL().removeUserChangeListener(this);
        this.LJLL.LIZLLL();
    }

    @Override // X.C8W0
    public final void onPause() {
        super.onPause();
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onAgeVerificationEvent$compliance_business_release(G53 g53) {
        if (e1.LIZ(31744, "show_new_user_age_verification_android", true, false)) {
            this.LJLILLLLZI = true;
            SmartRouter.buildRoute(getContext(), "aweme://hyd_action/registration_age_confirmation").open();
        }
    }

    @Override // com.ss.android.ugc.aweme.base.BaseMainContainerAssem, X.InterfaceC55372LoG
    public final void onCreate(Bundle bundle) {
        String LLLZ = C16880lQ.LLLZ("main_act_assem_lifecycle_%s_%s", new Object[]{C16880lQ.LJLLJ(ComplianceBusinessActivityAssem.class), "onCreate_with_bundle"});
        C56662Kg.LIZ().LIZJ(LLLZ, false);
        EventBus.LIZJ().LJIILJJIL(this);
        C38995FSd.LIZLLL().execute(RunnableC58617MzV.LJLIL);
        C36093EEn.LIZ.getClass();
        C36089EEj LJIIIZ = C36093EEn.LJIIIZ();
        LJIIIZ.LIZIZ(new InitHydrogenTask(), true);
        LJIIIZ.LIZIZ(new PNSNormalStateMachineInitTask(), true);
        LJIIIZ.LIZIZ(new GatekeeperComplianceInitLegoTask(), true);
        LJIIIZ.LIZIZ(new PNSAgeControlInitTask(), true);
        LJIIIZ.LIZJ();
        new Handler().post(new ARunnableS46S0100000_10(this, 45));
        C73428Sro LJJL = this.LJLJLLL.LJJL(T16.LIZIZ);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        C78999UzT.LJFF(LJJL.LJJLIIIJILLIZJL(30000L, timeUnit).LJIIL(1000L, timeUnit).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(C62948OnA.LJLIL, C62951OnD.LJLIL), this.LJLL);
        C56662Kg.LIZ().LJFF(LLLZ, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0051  */
    @X.QD3(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMixedAgeEvent$compliance_business_release(X.C62921Omj r7) {
        /*
            r6 = this;
            r4 = 0
            r5 = 1
            if (r7 == 0) goto L4e
            int r0 = r7.LJLIL
            if (r0 != r5) goto Le
            boolean r0 = r6.LJLJLJ
            if (r0 == 0) goto L17
            if (r7 == 0) goto L4e
        Le:
            int r1 = r7.LJLIL
            r0 = 2
            if (r1 != r0) goto L4e
            boolean r0 = r6.LJLJLJ
            if (r0 != 0) goto L4e
        L17:
            r6.LJLJLJ = r5
            android.content.Context r1 = r6.getContext()
            java.lang.String r0 = "aweme://hyd_action/mixed_age_user_consent"
            com.bytedance.router.SmartRoute r3 = com.bytedance.router.SmartRouter.buildRoute(r1, r0)
            X.Ol8 r0 = r6.LJLLI
            java.lang.Object r1 = r0.getValue()
            com.bytedance.keva.Keva r1 = (com.bytedance.keva.Keva) r1
            java.lang.String r0 = "0"
            java.lang.String r2 = "mixed_age_seen"
            java.lang.String r0 = r1.getString(r2, r0)
            java.lang.String r1 = "1"
            boolean r0 = kotlin.jvm.internal.o.LJ(r0, r1)
            if (r0 == 0) goto L51
            java.lang.String r1 = "from_relaunch"
        L3d:
            java.lang.String r0 = "enter_from"
            r3.withParam(r0, r1)
            int r0 = r7.LJLIL
            if (r0 != r5) goto L4f
        L46:
            java.lang.String r0 = "is_prompt"
            r3.withParam(r0, r4)
            r3.open()
        L4e:
            return
        L4f:
            r4 = 1
            goto L46
        L51:
            X.Ol8 r0 = r6.LJLLI
            java.lang.Object r0 = r0.getValue()
            com.bytedance.keva.Keva r0 = (com.bytedance.keva.Keva) r0
            r0.storeString(r2, r1)
            java.lang.String r1 = "reactivation_from_mixed_user_nonconsent"
            goto L3d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.compliance.business.banappeal.ComplianceBusinessActivityAssem.onMixedAgeEvent$compliance_business_release(X.Omj):void");
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onStemFeedUpdateEvent$compliance_business_release(C62910OmY c62910OmY) {
        HomeTabAbility LJIL;
        MainActivityScope LJJLIIIJJIZ = C78866UxK.LJJLIIIJJIZ(this);
        if (LJJLIIIJJIZ != null && (LJIL = C87277YNd.LJIL(LJJLIIIJJIZ)) != null) {
            LJIL.XZ();
        }
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onUserBannedEvent$compliance_business_release(C62950OnC c62950OnC) {
        boolean z;
        String str;
        if (c62950OnC != null && (str = c62950OnC.LJLIL) != null && C78685UuP.LJJJZ(str)) {
            z = true;
        } else {
            z = false;
        }
        String str2 = "";
        if (z && C52283KfX.LIZ()) {
            String str3 = c62950OnC.LJLJJI;
            if (str3 == null) {
                str3 = "";
            }
            String str4 = c62950OnC.LJLIL;
            if (str4 == null) {
                str4 = "";
            }
            String str5 = c62950OnC.LJLILLLLZI;
            if (str5 == null) {
                str5 = "";
            }
            String str6 = c62950OnC.LJLJI;
            if (str6 != null) {
                str2 = str6;
            }
            v3(str3, str4, str5, str2);
            return;
        }
        C18I x3 = x3();
        o.LJII(x3, "null cannot be cast to non-null type com.ss.android.ugc.aweme.main.IMainActivityService");
        if (((InterfaceC55452LpY) x3).isADShowing() || !this.LJLJI.compareAndSet(false, true) || this.LJLILLLLZI) {
            return;
        }
        v3("", "", "", "");
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onUserWriteBlockedEvent$compliance_business_release(IK4 ik4) {
        this.LJLJLLL.onNext("");
    }

    public static void C3(ActivityC86117Xqz activityC86117Xqz, AGSWarningPopupWindow aGSWarningPopupWindow) {
        CharSequence LJJLIIIJLLLLLLLZ;
        if (aGSWarningPopupWindow.getContent() == null) {
            LJJLIIIJLLLLLLLZ = "";
        } else {
            TextWithInlineLink content = aGSWarningPopupWindow.getContent();
            if (content != null) {
                LJJLIIIJLLLLLLLZ = C54840Lfg.LJJLIIIJLLLLLLLZ(content, activityC86117Xqz, C2TV.LJLIL, 2);
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        C26227ARb LIZ = C3AW.LIZ(activityC86117Xqz);
        LIZ.LJFF(aGSWarningPopupWindow.getTitle());
        LIZ.LIZIZ(LJJLIIIJLLLLLLLZ);
        UC0.LIZJ(LIZ, new AqS141S0200000_10(activityC86117Xqz, aGSWarningPopupWindow, 51));
        LIZ.LIZLLL(C62953OnF.LJLIL);
        LIZ.LJII = false;
        LIZ.LJI().LIZLLL();
    }

    @Override // com.ss.android.ugc.aweme.base.BaseMainContainerAssem, X.InterfaceC55372LoG
    public final void K5(boolean z, boolean z2) {
        GatekeeperService LJ = GatekeeperManager.LJ();
        Bundle LIZ = C01R.LIZ("has_focus", z);
        LIZ.putBoolean("is_first_visible", this.LJLJJL);
        LJ.LIZIZ(LIZ, "WindowFocusChanged");
        this.LJLJJI = false;
        if (z) {
            if (C40534FvW.LIZ()) {
                a.LIZIZ().LIZLLL();
            }
            if (this.LJLJJL) {
                this.LJLJJL = false;
                this.LJLJJI = true;
            }
        }
        if (!this.LJLJJI) {
            a.LJIIJ().LJFF(x3(), new C43280Gyi());
        }
    }

    public static void A3(int i, int i2, long j) {
        C198517qh c198517qh = new C198517qh();
        c198517qh.LIZ.put("service", "/aweme/v2/appeal/status/");
        c198517qh.LIZ.put("code", Integer.valueOf(i2));
        JSONObject LJ = c198517qh.LJ();
        C198517qh c198517qh2 = new C198517qh();
        c198517qh2.LIZ.put("duration", Long.valueOf(j));
        C09900aA.LJIIJ("compliance_api_status", i, LJ, c198517qh2.LJ(), null);
    }

    @Override // com.ss.android.ugc.aweme.base.BaseMainContainerAssem, X.InterfaceC55372LoG
    public final boolean onActivityResult(int i, int i2, Intent intent) {
        if (i2 == 10) {
            if (intent == null) {
                return false;
            }
            if (intent.getIntExtra("result", -1) == 0) {
                C26045AKb c26045AKb = new C26045AKb(x3());
                c26045AKb.LJIIIIZZ(R.string.p8_);
                c26045AKb.LJIIJ();
            }
            return true;
        }
        if (i != 17) {
            return false;
        }
        HG3.LJIIIIZZ().logout("user_banned", "user_banned");
        return true;
    }

    @Override // X.InterfaceC252619vl
    public final void t0(int i, User user, User user2) {
        AGSWarning agsWarning;
        AGSWarningPopupWindow agsWarningPopupWindow;
        if ((i != 1 && i != 2 && i != 3 && i != 4) || user2 == null || (agsWarning = user2.getAgsWarning()) == null || (agsWarningPopupWindow = agsWarning.getAgsWarningPopupWindow()) == null || agsWarningPopupWindow.getContent() == null) {
            return;
        }
        if (o.LJ(C16880lQ.LLJJJJ(), Looper.myLooper())) {
            C3(x3(), agsWarningPopupWindow);
        } else {
            C10K.LIZIZ(new ACallableS87S0200000_10(agsWarningPopupWindow, this, 10), C10K.LJIIIIZZ, null);
        }
    }

    public final void v3(String updatedPrefix, String str, String str2, String str3) {
        int i;
        AbstractC73672Svk<AppealStatusResponse> userAppealStatus;
        boolean z = true;
        try {
            String LIZIZ = C9X3.LIZ.LIZIZ("appeal_status_source", "1");
            o.LJIIIIZZ(LIZIZ, "instance().get(\"appeal_status_source\", \"1\")");
            i = CastIntegerProtector.parseInt(LIZIZ);
        } catch (Exception unused) {
            i = 1;
        }
        C9X3.LIZ.LIZ.erase("appeal_status_source");
        long currentTimeMillis = System.currentTimeMillis();
        C54931Lh9 c54931Lh9 = AppealApi.LIZ;
        if (str.length() == 0) {
            str = ((RBX) HG3.LJIILL()).getCurUserId();
        }
        o.LJIIIIZZ(str, "uid.ifEmpty { AccountPro…userService().curUserId }");
        c54931Lh9.getClass();
        o.LJIIIZ(updatedPrefix, "updatedPrefix");
        if (updatedPrefix.length() <= 0) {
            z = false;
        }
        if (z) {
            IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("https://");
            LIZ.append(updatedPrefix);
            userAppealStatus = ((AppealApi) LIZLLL.create(X1D.LIZIZ(LIZ)).create(AppealApi.class)).getUserAppealStatus("6", str, i);
        } else {
            userAppealStatus = C54931Lh9.LIZIZ.getUserAppealStatus("6", str, i);
        }
        userAppealStatus.LJJL(T16.LIZ()).LJIJJLI(new AfS6S0100100_10(this, currentTimeMillis, 2)).LJIJJ(new AfS6S0100100_10(this, currentTimeMillis, 3)).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new C62949OnB(this, str2, str3, updatedPrefix), new AfS62S0100000_10(this, 12));
    }
}
