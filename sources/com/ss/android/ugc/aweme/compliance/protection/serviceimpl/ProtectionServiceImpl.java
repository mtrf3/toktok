package com.ss.android.ugc.aweme.compliance.protection.serviceimpl;

import X.C03880Dg;
import X.C188727au;
import X.C1FO;
import X.C26045AKb;
import X.C2NU;
import X.C34K;
import X.C38281F0r;
import X.C40386Ft8;
import X.C47261Igj;
import X.C52254Kf4;
import X.C53830LAs;
import X.C57404Mfw;
import X.C57408Mg0;
import X.C58096Mr6;
import X.C5S1;
import X.C65300Pk0;
import X.C74592wJ;
import X.C74612wL;
import X.C78490UrG;
import X.C86305Xu1;
import X.C86306Xu2;
import X.C86307Xu3;
import X.C86308Xu4;
import X.C86309Xu5;
import X.C86311Xu7;
import X.DialogC25756A8y;
import X.EnumC62934Omw;
import X.F3T;
import X.FMX;
import X.HG3;
import X.InterfaceC38186Eyk;
import X.InterfaceC53832LAu;
import X.LL6;
import X.LL7;
import X.RBX;
import X.X1D;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.compliance.api.expriements.DigitalWellbeingEntranceSettings;
import com.ss.android.ugc.aweme.compliance.api.services.teenmode.IProtectionService;
import com.ss.android.ugc.aweme.compliance.protection.common.model.UserDetailsInfoBean;
import com.ss.android.ugc.aweme.compliance.protection.common.model.UserNightScreenTimeSettings;
import com.ss.android.ugc.aweme.compliance.protection.familypairing.FamilyPiaringManager;
import com.ss.android.ugc.aweme.compliance.protection.jsb.GetDigitalWellbeingStatusMethod;
import com.ss.android.ugc.aweme.compliance.protection.jsb.GetFormattedTimeMethod;
import com.ss.android.ugc.aweme.compliance.protection.jsb.PopDigitalWellbeingVerifyViewMethod;
import com.ss.android.ugc.aweme.compliance.protection.jsb.SetDigitalWellbeingStatusMethod;
import com.ss.android.ugc.aweme.compliance.protection.restrictmode.entity.DigitalWellbeingSetting;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class ProtectionServiceImpl implements IProtectionService {
    @Override // com.ss.android.ugc.aweme.compliance.api.services.teenmode.IProtectionService
    public final void LIZLLL() {
        C57408Mg0.LJFF(4);
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.teenmode.IProtectionService
    public final void LJI() {
        C86306Xu2.LIZJ = false;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.teenmode.IProtectionService
    public final void LJIIIIZZ() {
        DigitalWellbeingSetting digitalWellbeingSetting = C86306Xu2.LIZIZ;
        if (digitalWellbeingSetting != null) {
            digitalWellbeingSetting.setRestrictModeSelf(false);
        }
        DigitalWellbeingSetting digitalWellbeingSetting2 = C86306Xu2.LIZIZ;
        if (digitalWellbeingSetting2 != null) {
            digitalWellbeingSetting2.setTimeLockSelfInMin(0);
        }
        DigitalWellbeingSetting digitalWellbeingSetting3 = C86306Xu2.LIZIZ;
        if (digitalWellbeingSetting3 != null) {
            digitalWellbeingSetting3.setTimelockEligible(0);
        }
        DigitalWellbeingSetting digitalWellbeingSetting4 = C86306Xu2.LIZIZ;
        if (digitalWellbeingSetting4 != null) {
            digitalWellbeingSetting4.setWeeklyUpdate(false);
        }
        DigitalWellbeingSetting digitalWellbeingSetting5 = C86306Xu2.LIZIZ;
        if (digitalWellbeingSetting5 != null) {
            digitalWellbeingSetting5.setScreenTimeBreaks(0);
        }
        DigitalWellbeingSetting digitalWellbeingSetting6 = C86306Xu2.LIZIZ;
        if (digitalWellbeingSetting6 != null) {
            digitalWellbeingSetting6.setScreenTimeType(0);
        }
        DigitalWellbeingSetting digitalWellbeingSetting7 = C86306Xu2.LIZIZ;
        if (digitalWellbeingSetting7 != null) {
            digitalWellbeingSetting7.setTimeLockSelfEnable(0);
        }
        DigitalWellbeingSetting digitalWellbeingSetting8 = C86306Xu2.LIZIZ;
        if (digitalWellbeingSetting8 != null) {
            digitalWellbeingSetting8.setScreenTimeType(0);
        }
        C86306Xu2.LJFF(C86306Xu2.LIZIZ);
        Boolean bool = Boolean.FALSE;
        C86308Xu4.LJFF(new UserNightScreenTimeSettings(0, 0, 0, 0, bool));
        C86308Xu4.LJII(new UserDetailsInfoBean(bool));
        FamilyPiaringManager.LIZ.getClass();
        FamilyPiaringManager.LJI(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x0090  */
    @Override // com.ss.android.ugc.aweme.compliance.api.services.teenmode.IProtectionService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIJJ() {
        /*
            Method dump skipped, instructions count: 399
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.compliance.protection.serviceimpl.ProtectionServiceImpl.LJIJJ():void");
    }

    public static IProtectionService LJJ() {
        Object LIZ = C58096Mr6.LIZ(IProtectionService.class, false);
        if (LIZ != null) {
            return (IProtectionService) LIZ;
        }
        if (C58096Mr6.f == null) {
            synchronized (IProtectionService.class) {
                if (C58096Mr6.f == null) {
                    C58096Mr6.f = new ProtectionServiceImpl();
                }
            }
        }
        return C58096Mr6.f;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.teenmode.IProtectionService
    public final boolean LIZ() {
        if (new C40386Ft8().LIZ(System.currentTimeMillis()) && SharePrefCache.inst().getTodayVideoPlayTime().LIZ().longValue() > C86305Xu1.LIZJ() * 60 * 1000) {
            return C1FO.LJIIJ(null, "pip");
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.teenmode.IProtectionService
    public final LL7 LJIILL() {
        return new LL6();
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.teenmode.IProtectionService
    public final boolean LIZIZ() {
        return C86305Xu1.LJFF();
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.teenmode.IProtectionService
    public final void LJIIJJI() {
        UserNightScreenTimeSettings LIZIZ;
        UserNightScreenTimeSettings LIZIZ2 = C86308Xu4.LIZIZ();
        if (LIZIZ2 != null && o.LJ(LIZIZ2.getSleepReminderEnabled(), Boolean.TRUE) && (LIZIZ = C86308Xu4.LIZIZ()) != null) {
            C57404Mfw.LIZ(LIZIZ, true);
        }
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.teenmode.IProtectionService
    public final int LJIILJJIL() {
        return C86306Xu2.LIZJ() ? 1 : 0;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.teenmode.IProtectionService
    public final boolean LJIJ() {
        return C86305Xu1.LJ();
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.teenmode.IProtectionService
    public final int LJIJJLI() {
        if (C86305Xu1.LJ()) {
            return 2;
        }
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.teenmode.IProtectionService
    public final void LJII() {
        C74592wJ.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.teenmode.IProtectionService
    public final void LJIIIZ() {
        C74612wL.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.teenmode.IProtectionService
    public final boolean LJIIJ() {
        return C86306Xu2.LIZJ;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.teenmode.IProtectionService
    public final void LJIILLIIL() {
        C86305Xu1.LJIIIIZZ();
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.teenmode.IProtectionService
    public final void LJ(Bundle bundle) {
        String str;
        Activity validTopActivity = ActivityStack.getValidTopActivity();
        if (bundle == null || (str = bundle.getString("enter_from")) == null) {
            str = "";
        }
        if (validTopActivity == null) {
            return;
        }
        if (C2NU.LIZ.LIZIZ()) {
            String str2 = "fe_tns_screen_time_homepage";
            C86305Xu1.LJII(C47261Igj.LJJIJIL("fe_tns_screen_time_homepage", "fe_tns_screen_time_management", "fe_tns_reminder"));
            if (!C52254Kf4.LIZ()) {
                str2 = "fe_privacy_and_safety_lynx";
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("aweme://lynxview_popup/?channel=");
            LIZ.append(str2);
            LIZ.append("&bundle=digital-wellbeing-react/template.js&hide_nav_bar=1&use_spark=1&enable_canvas=1&wait_gecko_update=1&use_forest=1");
            Uri build = UriProtector.parse(X1D.LIZIZ(LIZ)).buildUpon().appendQueryParameter("height", "262").appendQueryParameter("gravity", "bottom").appendQueryParameter("show_mask", "1").appendQueryParameter("mask_bg_color", "00000080").appendQueryParameter("panel_style", "1").build();
            DigitalWellbeingEntranceSettings digitalWellbeingEntranceSettings = DigitalWellbeingEntranceSettings.LIZ;
            String uri = build.toString();
            o.LJIIIIZZ(uri, "url.toString()");
            digitalWellbeingEntranceSettings.getClass();
            C38281F0r c38281F0r = new C38281F0r(DigitalWellbeingEntranceSettings.LIZ(uri));
            c38281F0r.LIZLLL("user_id", ((RBX) HG3.LJIILL()).getCurUserId());
            c38281F0r.LIZLLL("enter_from", str);
            c38281F0r.LIZIZ(C57408Mg0.LJ(), "used_time");
            c38281F0r.LIZLLL("group", "digital_wellbeing");
            SmartRouter.buildRoute(validTopActivity, c38281F0r.LJ()).open();
            return;
        }
        C5S1 c5s1 = new C5S1(validTopActivity);
        c5s1.LIZLLL(validTopActivity.getString(R.string.g5t));
        c5s1.LJ();
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.teenmode.IProtectionService
    public final boolean LJIIL(long j) {
        C34K c34k = new C34K();
        CountDownLatch countDownLatch = new CountDownLatch(1);
        Object value = C86305Xu1.LIZ.getValue();
        C86309Xu5 c86309Xu5 = new C86309Xu5(countDownLatch, c34k, j);
        value.getClass();
        C53830LAs.LIZ(c86309Xu5);
        countDownLatch.await();
        return c34k.element;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.teenmode.IProtectionService
    public final void LJIILIIL(InterfaceC53832LAu interfaceC53832LAu) {
        C86305Xu1.LJIIIZ(interfaceC53832LAu);
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.teenmode.IProtectionService
    public final void LJIIZILJ(List<String> list) {
        C86305Xu1.LJII(list);
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.teenmode.IProtectionService
    public final void LJIJI(Activity activity) {
        if (activity == null) {
            return;
        }
        if (C2NU.LIZ.LIZIZ()) {
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("enter_from", "general_setting");
            FMX.LJIIL("mute_push_notification_click", c188727au.LIZ);
            DialogC25756A8y dialogC25756A8y = new DialogC25756A8y(activity);
            dialogC25756A8y.LIZLLL(false);
            dialogC25756A8y.LIZIZ(R.string.rjz);
            dialogC25756A8y.setCancelable(false);
            if (!new C03880Dg(2).LIZJ(300000, "com/bytedance/tux/status/loading/TuxLoadingDialogHUD", "show", dialogC25756A8y, new Object[0], "void", new C65300Pk0(false, "()V", "7109077275359217465")).LIZ) {
                dialogC25756A8y.show();
            }
            C86305Xu1.LJIIIZ(new C86307Xu3(dialogC25756A8y, activity));
            return;
        }
        C26045AKb c26045AKb = new C26045AKb(activity);
        c26045AKb.LJIIIZ(activity.getString(R.string.g5t));
        c26045AKb.LJIIJ();
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.teenmode.IProtectionService
    public final List<InterfaceC38186Eyk> LJIL(F3T context) {
        o.LJIIIZ(context, "context");
        ArrayList arrayList = new ArrayList();
        arrayList.add(new GetDigitalWellbeingStatusMethod(context));
        arrayList.add(new PopDigitalWellbeingVerifyViewMethod(context));
        arrayList.add(new SetDigitalWellbeingStatusMethod(context));
        arrayList.add(new GetFormattedTimeMethod(context));
        return arrayList;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.ss.android.ugc.aweme.compliance.api.services.teenmode.IProtectionService
    public final InterfaceC38186Eyk LIZJ(F3T context, String str) {
        o.LJIIIZ(context, "context");
        switch (str.hashCode()) {
            case -1371524671:
                if (str.equals("getDigitalWellbeingStatus")) {
                    return new GetDigitalWellbeingStatusMethod(context);
                }
                return null;
            case -528233011:
                if (str.equals("setDigitalWellbeingStatus")) {
                    return new SetDigitalWellbeingStatusMethod(context);
                }
                return null;
            case -169720760:
                if (str.equals("popDigitalWellbeingVerifyView")) {
                    return new PopDigitalWellbeingVerifyViewMethod(context);
                }
                return null;
            case 1459844595:
                if (str.equals("getFormattedTime")) {
                    return new GetFormattedTimeMethod(context);
                }
                return null;
            default:
                return null;
        }
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.teenmode.IProtectionService
    public final void LJFF(Context context, Runnable runnable, String str) {
        FamilyPiaringManager.LIZ.getClass();
        if (FamilyPiaringManager.LIZJ() == EnumC62934Omw.CHILD || FamilyPiaringManager.LIZJ() == EnumC62934Omw.UNLINK_LOCKED) {
            C86305Xu1.LJIIIZ(new C86311Xu7(context, runnable, str));
            return;
        }
        if (C86306Xu2.LIZJ()) {
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("enter_from", str);
            FMX.LJIIL("time_lock_block_show", c188727au.LIZ);
            C1FO.LJIIJ(new C78490UrG(runnable), str);
            return;
        }
        runnable.run();
    }
}
