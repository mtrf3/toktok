package com.ss.android.ugc.aweme.compliance.business.serviceimpl;

import X.ActivityC45651qj;
import X.C10K;
import X.C113554cx;
import X.C162476Zf;
import X.C188727au;
import X.C221108m2;
import X.C253539xF;
import X.C253549xG;
import X.C25853ACr;
import X.C40459FuJ;
import X.C40462FuM;
import X.C40465FuP;
import X.C40535FvX;
import X.C43286Gyo;
import X.C58096Mr6;
import X.C58294MuI;
import X.C62822Ol8;
import X.C62913Omb;
import X.C62914Omc;
import X.C62955OnH;
import X.C62957OnJ;
import X.C62958OnK;
import X.C62959OnL;
import X.C62964OnQ;
import X.C62965OnR;
import X.C62966OnS;
import X.C62967OnT;
import X.C62977Ond;
import X.C63062Op0;
import X.C63761P0r;
import X.C73969T1h;
import X.C84763XOl;
import X.C85990Xow;
import X.C87093YGb;
import X.E4G;
import X.E7U;
import X.EA5;
import X.EnumC35839E4t;
import X.EnumC62956OnI;
import X.EnumC86095Xqd;
import X.FMX;
import X.HG3;
import X.InterfaceC62968OnU;
import X.InterfaceC62969OnV;
import X.N78;
import X.OPP;
import X.OSZ;
import X.QD3;
import X.RBX;
import X.T16;
import Y.ACallableS113S0100000_10;
import Y.AfS3S0000100_10;
import android.app.Activity;
import com.bytedance.poplayer.core.PopupManager;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.account.experiment.MultiAccountService;
import com.ss.android.ugc.aweme.compliance.api.services.agegate.IAgeGateService;
import com.ss.android.ugc.aweme.compliance.business.settings.DoBStatusApi;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.plugin.IPluginService;
import com.ss.android.ugc.aweme.plugin.PluginService;
import com.ss.android.ugc.aweme.pns.agegate.IPNSAgeGateService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.BaseUserService;
import com.ss.android.ugc.aweme.setting.I18nSettingManageMyAccountActivity;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.AqS156S0100000_6;
import kotlin.jvm.internal.AqS157S0200000_10;
import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class AgeGateServiceImpl implements IAgeGateService {
    public static String LJI;
    public static C62964OnQ LJII;
    public static InterfaceC62969OnV LJIIIIZZ;
    public static boolean LJIIIZ;
    public static Map<String, String> LJIIJ = C113554cx.LJJJLIIL();
    public static boolean LJIIJJI;
    public final C62822Ol8 LIZ = C221108m2.LIZIZ(N78.LJLIL);
    public final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C58294MuI.LJLIL);
    public final C62822Ol8 LIZJ = C221108m2.LIZIZ(C62965OnR.LJLIL);
    public final C62822Ol8 LIZLLL = C221108m2.LIZIZ(new AqS160S0100000_10(this, 149));
    public EA5 LJ = new EA5(C85990Xow.LIZ(), C85990Xow.LIZ(), 0, "device_api");
    public boolean LJFF = true;

    public static boolean LJJIFFI() {
        User currentUser = BaseUserService.createIUserServicebyMonsterPlugin(false).getCurrentUser();
        return currentUser != null && currentUser.getAgeGateAction() == EnumC62956OnI.US_FTC.getValue();
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.agegate.IAgeGateService
    public final boolean LIZ() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.agegate.IAgeGateService
    public final Class<C40459FuJ> LIZJ() {
        return C40459FuJ.class;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.agegate.IAgeGateService
    public final boolean LJII() {
        E4G e4g;
        IPluginService.PluginDataWrapper value;
        IPluginService.SimplePluginData simplePluginData;
        boolean z = false;
        Iterator<E4G> it = PluginService.createIPluginServicebyMonsterPlugin(false).getCurrentPluginList().iterator();
        do {
            e4g = null;
            if (!it.hasNext()) {
                break;
            }
            e4g = it.next();
        } while (e4g.getType() != EnumC35839E4t.SIGN_UP_REGION_ENTRANCE);
        E4G e4g2 = e4g;
        if (e4g2 == null || (value = e4g2.getValue()) == null || (simplePluginData = value.simplePluginData) == null || Integer.valueOf(simplePluginData.abGroup) == null) {
            return false;
        }
        IPluginService.SimplePluginData simplePluginData2 = value.simplePluginData;
        if (simplePluginData2 != null && simplePluginData2.abGroup == 2) {
            z = true;
        }
        return !z;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.agegate.IAgeGateService
    public final Class<C40462FuM> LJIILJJIL() {
        return C40462FuM.class;
    }

    @QD3
    public final void onBottomSheetOptionClickEvent(C253539xF event) {
        o.LJIIIZ(event, "event");
    }

    @QD3
    public final void onBottomSheetOptionClickEvent(C253549xG event) {
        o.LJIIIZ(event, "event");
    }

    public static IAgeGateService LJJ() {
        Object LIZ = C58096Mr6.LIZ(IAgeGateService.class, false);
        if (LIZ != null) {
            return (IAgeGateService) LIZ;
        }
        if (C58096Mr6.LLLZLL == null) {
            synchronized (IAgeGateService.class) {
                if (C58096Mr6.LLLZLL == null) {
                    C58096Mr6.LLLZLL = new AgeGateServiceImpl();
                }
            }
        }
        return C58096Mr6.LLLZLL;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.agegate.IAgeGateService
    public final int LJIILIIL() {
        return this.LJ.LIZJ;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.agegate.IAgeGateService
    public final String LJIILL() {
        return this.LJ.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.agegate.IAgeGateService
    public final String LJIIZILJ() {
        return this.LJ.LIZLLL;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.agegate.IAgeGateService
    public final void LJIJ() {
        this.LJ = new EA5(C85990Xow.LIZ(), C85990Xow.LIZ(), 0, "device_api");
        C10K.LIZJ(new ACallableS113S0100000_10(this, 1));
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.agegate.IAgeGateService
    public final String LJIJI() {
        return this.LJ.LIZIZ;
    }

    public final IPNSAgeGateService LJJI() {
        return (IPNSAgeGateService) this.LIZLLL.getValue();
    }

    public final boolean LJJIII() {
        C62955OnH c62955OnH = EnumC62956OnI.Companion;
        int ageGateAction = ((IUserService) this.LIZ.getValue()).getCurrentUser().getAgeGateAction();
        c62955OnH.getClass();
        EnumC62956OnI enumC62956OnI = EnumC62956OnI.MAP.get(Integer.valueOf(ageGateAction));
        if (enumC62956OnI == null) {
            enumC62956OnI = EnumC62956OnI.PASS;
        }
        int i = C62957OnJ.LIZ[enumC62956OnI.ordinal()];
        if (i != 1) {
            if (i == 2 || i == 3) {
                return true;
            }
            throw new C162476Zf();
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.agegate.IAgeGateService
    public final void LIZLLL() {
        ActivityC45651qj activityC45651qj;
        Activity LJIIIIZZ2 = C84763XOl.LJIIIIZZ();
        if (LJIIIIZZ2 instanceof ActivityC45651qj) {
            activityC45651qj = (ActivityC45651qj) LJIIIIZZ2;
        } else {
            activityC45651qj = null;
        }
        PopupManager.LJIIL(new C40459FuJ(activityC45651qj, 2));
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.agegate.IAgeGateService
    public final EnumC62956OnI LJI() {
        if (MultiAccountService.LJ().LIZJ()) {
            return EnumC62956OnI.PASS;
        }
        if (C62913Omb.LIZLLL() != EnumC62956OnI.PASS) {
            return C62913Omb.LIZLLL();
        }
        return EnumC62956OnI.EU_EEA;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.agegate.IAgeGateService
    public final IPNSAgeGateService LJIIIIZZ() {
        IPNSAgeGateService pnsAgeGateService = LJJI();
        o.LJIIIIZZ(pnsAgeGateService, "pnsAgeGateService");
        return pnsAgeGateService;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.agegate.IAgeGateService
    public final boolean LJIILLIIL() {
        C62914Omc c62914Omc;
        Long l;
        if (C62913Omb.LIZLLL() == EnumC62956OnI.US_FTC && ((l = (c62914Omc = C62913Omb.LIZIZ).LJIIJ) != null || (l = Long.valueOf(c62914Omc.LIZIZ.getLong("age_gate_block_device_register_expire_time", 0L))) != null)) {
            long longValue = l.longValue();
            if (longValue > 0 && System.currentTimeMillis() / 1000 <= longValue) {
                return true;
            }
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.agegate.IAgeGateService
    public final boolean isFtcForRegistration() {
        String str;
        if (LJI() == EnumC62956OnI.PASS) {
            String str2 = this.LJ.LIZ;
            if (str2 != null) {
                str = str2.toUpperCase(Locale.ROOT);
                o.LJIIIIZZ(str, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            } else {
                str = null;
            }
            return o.LJ(str, "US");
        }
        if (LJI() == EnumC62956OnI.US_FTC) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.agegate.IAgeGateService
    public final String LJ() {
        return LJI;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.agegate.IAgeGateService
    public final boolean LJIIJJI() {
        return this.LJFF;
    }

    public static void LJJII(boolean z) {
        C188727au c188727au = new C188727au();
        c188727au.LIZLLL(((RBX) HG3.LJIILL()).getCurUser().getAgeGateAction(), "age_gate_action");
        c188727au.LIZLLL(z ? 1 : 0, "result");
        FMX.LJIIL("check_age_gate_status", c188727au.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.agegate.IAgeGateService
    public final void LIZIZ(boolean z) {
        this.LJFF = z;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.agegate.IAgeGateService
    public final void LJIIJ(String str) {
        LJIIIZ = false;
        C62964OnQ c62964OnQ = LJII;
        if (c62964OnQ != null) {
            c62964OnQ.LIZ(str, true);
        }
        LJII = null;
        InterfaceC62969OnV interfaceC62969OnV = LJIIIIZZ;
        if (interfaceC62969OnV != null) {
            interfaceC62969OnV.LIZ(str, true);
        }
        LJIIIIZZ = null;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.agegate.IAgeGateService
    public final void LJIJJ(Activity activity) {
        boolean z;
        SmartRoute buildRoute;
        boolean z2 = activity instanceof ActivityC45651qj;
        ActivityC45651qj activityC45651qj = null;
        if (!z2 || activity == null) {
            return;
        }
        RBX rbx = (RBX) HG3.LJIILL();
        if (rbx.isLogin() && rbx.getCurUser().getUserMode() == 2 && C40535FvX.LIZ().getBoolean("ftc_create_account_showing", false)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            FMX.LJIIL("recover_from_account_page", new C188727au().LIZ);
            LJIIIZ = true;
            buildRoute = SmartRouter.buildRoute(activity, "//account/ftc");
            buildRoute.withParam("is_existing_user", true);
            buildRoute.withParam("next_page", 1);
            buildRoute.withParam("enter_type", "click_sign_up");
        } else {
            RBX rbx2 = (RBX) HG3.LJIILL();
            if (rbx2.isLogin() && rbx2.getCurUser().getUserMode() == 2 && C40535FvX.LIZ().getBoolean("ftc_create_password_showing", false)) {
                FMX.LJIIL("recover_from_password_page", new C188727au().LIZ);
                LJIIIZ = true;
                buildRoute = SmartRouter.buildRoute(activity, "//account/ftc");
                buildRoute.withParam("is_existing_user", true);
                buildRoute.withParam("next_page", 52);
                buildRoute.withParam("enter_type", "click_sign_up");
            } else {
                if (!C40535FvX.LIZ().getBoolean("ftc_delete_video_alert_showing", false)) {
                    return;
                }
                FMX.LJIIL("recover_from_video_delete", new C188727au().LIZ);
                boolean z3 = C40535FvX.LIZ().getBoolean("ftc_age_gate_response_prompt", true);
                buildRoute = SmartRouter.buildRoute(activity, "aweme://hyd_action/delete_video_us");
                buildRoute.withParam("enter_from", "from_kids_flow_recovery");
                buildRoute.withParam("is_existing_user", true);
                buildRoute.withParam("is_prompt", z3 ? 1 : 0);
                buildRoute.withParam("age_gate_post_action", EnumC62956OnI.US_FTC.getValue());
                buildRoute.withParam("is_kids", 1);
                buildRoute.withParam("username", "");
            }
        }
        if (z2) {
            activityC45651qj = (ActivityC45651qj) activity;
        }
        PopupManager.LJIIL(new C40465FuP(activityC45651qj, new AqS156S0100000_6(buildRoute, 90)));
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.agegate.IAgeGateService
    public final void LJIL(String str) {
        LJI = str;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.agegate.IAgeGateService
    public final void LJIIIZ(Activity activity, InterfaceC62968OnU interfaceC62968OnU) {
        if (activity == null) {
            activity = ActivityStack.getTopActivity();
        }
        if (LJJIII()) {
            FMX.onEventV3("age_gate_should_popup");
        }
        if (LJIIIZ || !LJJIII() || !(activity instanceof ActivityC45651qj)) {
            LJJII(false);
            if (interfaceC62968OnU != null) {
                interfaceC62968OnU.LIZIZ();
                return;
            }
            return;
        }
        LJII = new C62964OnQ(interfaceC62968OnU);
        C62967OnT c62967OnT = new C62967OnT(interfaceC62968OnU);
        FMX.onEventV3("age_gate_popup_task_in_queue");
        PopupManager.LJIIL(new C40462FuM((ActivityC45651qj) activity, c62967OnT, new AqS157S0200000_10(this, activity, 10)));
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.agegate.IAgeGateService
    public final void LJIIL(Activity activity, InterfaceC62969OnV interfaceC62969OnV, String enterMethod) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(enterMethod, "enterMethod");
        if (LJIIJJI) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        DoBStatusApi.LIZ.getClass();
        E7U.LIZIZ.getDoBStatus().LJJL(T16.LIZ()).LJIJJLI(new AfS3S0000100_10(currentTimeMillis, 0)).LJIJJ(new AfS3S0000100_10(currentTimeMillis, 1)).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new C62959OnL(enterMethod, this, interfaceC62969OnV, activity), OPP.LJLIL);
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.agegate.IAgeGateService
    public final boolean LJFF(int i, String str, String str2, String str3) {
        if (str != null) {
            Locale locale = Locale.ROOT;
            String lowerCase = str.toLowerCase(locale);
            o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            if (o.LJ(lowerCase, "unknown")) {
                return false;
            }
            if (str2 != null) {
                String lowerCase2 = str2.toLowerCase(locale);
                o.LJIIIIZZ(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                if (!o.LJ(lowerCase2, "unknown")) {
                    if (str.length() > 2) {
                        this.LJ = new EA5(this.LJ.LIZ, str2, i, str3);
                        return true;
                    }
                    this.LJ = new EA5(str, str2, i, str3);
                    return true;
                }
            }
            this.LJ = new EA5(str, str, i, str3);
            return false;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.agegate.IAgeGateService
    public final void LJIJJLI(I18nSettingManageMyAccountActivity i18nSettingManageMyAccountActivity, C25853ACr c25853ACr, String str, int i, String str2, int i2) {
        if (!LJIIJJI) {
            Map<String, String> LJJL = C113554cx.LJJL(new OSZ("enter_method", "click_dob_from_manage_account"), new OSZ("user_type", "edit"));
            LJJI().LIZIZ(LJJL);
            LJIIJ = LJJL;
            IPNSAgeGateService LJJI = LJJI();
            C43286Gyo.LIZ.getClass();
            LJJI.LJII(new Locale(C87093YGb.LIZ(), C85990Xow.LIZ()));
            LJIIIIZZ = c25853ACr;
            LJJI().LIZLLL();
            IPNSAgeGateService pnsAgeGateService = LJJI();
            C62958OnK c62958OnK = new C62958OnK(i18nSettingManageMyAccountActivity, "from_edit_age", LJJIFFI());
            C63062Op0 c63062Op0 = new C63062Op0(i, i2, C63761P0r.LIZ(str), C63761P0r.LIZ(str2));
            EnumC86095Xqd enumC86095Xqd = EnumC86095Xqd.EDIT;
            C62977Ond c62977Ond = new C62977Ond();
            o.LJIIIIZZ(pnsAgeGateService, "pnsAgeGateService");
            C62966OnS.LIZ(pnsAgeGateService, enumC86095Xqd, c62958OnK, i18nSettingManageMyAccountActivity, c62977Ond, null, c63062Op0, 16);
        }
    }
}
