package com.ss.android.ugc.aweme.legoImpl.task;

import X.AV1;
import X.C0RN;
import X.C35226Ds6;
import X.C35232DsC;
import X.C36089EEj;
import X.C36093EEn;
import X.C38986FRu;
import X.C3GN;
import X.C54366LVi;
import X.C55888Lwa;
import X.C57738MlK;
import X.C62822Ol8;
import X.C77266UUc;
import X.EE1;
import X.EFK;
import X.EFM;
import X.EFN;
import X.EHL;
import X.EI0;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.FFL;
import X.HG3;
import X.InterfaceC56896MUq;
import X.InterfaceC84043Ro;
import X.InterfaceC98123tA;
import X.RBX;
import X.UTK;
import android.content.Context;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.IMandatoryLoginService;
import com.ss.android.ugc.aweme.account.experiment.AccountFeatureFlagService;
import com.ss.android.ugc.aweme.account.login.trusted.LoginHistoryStateUploadRequest;
import com.ss.android.ugc.aweme.account.passwordcheck.service.KnownWeakPasswordPreloadRequest;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.im.sdk.relations.data.core.helper.FetchIMFollowListRequest;
import com.ss.android.ugc.aweme.im.sdk.relations.data.core.helper.FetchMAFListRequest;
import com.ss.android.ugc.aweme.im.service.IIMService;
import com.ss.android.ugc.aweme.legoImp.task.InitServiceSettingTask;
import com.ss.android.ugc.aweme.request_combine.request.individual.FetchComplianceSettingRequest;
import com.ss.android.ugc.aweme.request_combine.task.FetchCombineSettingsTask;
import com.ss.android.ugc.aweme.requesttask.idle.GeckoCheckInRequest;
import com.ss.android.ugc.aweme.requesttask.idle.GeckoHighPriorityCheckInRequest;
import com.ss.android.ugc.aweme.requesttask.idle.InitBDRegionDataRequest;
import com.ss.android.ugc.aweme.requesttask.idle.SecSdkRequest;
import com.ss.android.ugc.aweme.services.MandatoryLoginService;
import com.ss.android.ugc.aweme.settingsrequest.SettingsRequestServiceImpl;
import com.ss.android.ugc.aweme.task.fb.FacebookUploadRequest;
import com.ss.android.ugc.aweme.user.lego.FetchUserInfoRequest;
import defpackage.e1;
import java.util.Iterator;
import java.util.List;
import yq4.a;

/* loaded from: classes7.dex */
public class LegoRequestTask implements EE1 {
    public static volatile boolean LJLIL = true;

    @Override // X.EEY
    public final String key() {
        return "LegoRequestTask";
    }

    @Override // X.EEY
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.EEY
    public final /* synthetic */ String prefix() {
        return "task_";
    }

    @Override // X.EE1
    public final /* synthetic */ boolean serialExecute() {
        return false;
    }

    @Override // X.EEY
    public final /* synthetic */ int targetProcess() {
        return C0RN.LIZ();
    }

    @Override // X.EEY
    public final /* synthetic */ List triggerOtherLegoComponents() {
        return null;
    }

    @Override // X.EEY
    public final /* synthetic */ EnumC36103EEx triggerType() {
        return C0RN.LIZIZ(this);
    }

    @Override // X.EEY
    public final EnumC36092EEm scenesType() {
        return EnumC36092EEm.DEFAULT;
    }

    @Override // X.EE1
    public final EFK type() {
        return EFK.BACKGROUND;
    }

    @Override // X.EEY
    public final void run(Context context) {
        boolean z;
        boolean z2 = LJLIL;
        if (z2) {
            LJLIL = false;
        }
        C36093EEn.LIZ.getClass();
        C36089EEj LJIIIZ = C36093EEn.LJIIIZ();
        HG3.LJIILL().getClass();
        LJIIIZ.LIZ(new FetchUserInfoRequest());
        LJIIIZ.LIZIZ(new SecSdkRequest(), true);
        LJIIIZ.LIZIZ(new AbSdkCommonRequest(), true);
        LJIIIZ.LIZIZ(new FacebookUploadRequest(), true);
        LJIIIZ.LIZ(C77266UUc.LIZIZ.LJJJIL());
        LJIIIZ.LIZ(new InitBDRegionDataRequest());
        C62822Ol8 c62822Ol8 = C35226Ds6.LIZ;
        if (((Boolean) c62822Ol8.getValue()).booleanValue() && z2) {
            LJIIIZ.LIZ(new FetchCombineSettingsTask());
        }
        LJIIIZ.LIZ(new PolicyNoticeLegoRequest());
        if (((Boolean) c62822Ol8.getValue()).booleanValue() || !C35232DsC.LIZ() || !z2) {
            LJIIIZ.LIZ(SettingsRequestServiceImpl.LJIILLIIL().LJIILL());
        }
        LJIIIZ.LIZ(new LoginHistoryStateUploadRequest());
        if (AccountFeatureFlagService.LJI().LIZ()) {
            LJIIIZ.LIZ(new KnownWeakPasswordPreloadRequest());
        }
        LJIIIZ.LIZJ();
        FFL.LJIIIZ().getClass();
        if (FFL.LJIIJ(31744, 0, "use_new_app_alert", true) == 1) {
            EHL ehl = new EHL();
            ehl.LIZIZ(new AppAlertRequest(), true);
            ehl.LIZJ();
        }
        IIMService createIIMServicebyMonsterPlugin = IMService.createIIMServicebyMonsterPlugin(false);
        InterfaceC98123tA relationService = createIIMServicebyMonsterPlugin.getRelationService();
        C57738MlK c57738MlK = C57738MlK.LIZIZ;
        c57738MlK.LJFF();
        if (relationService != null) {
            FetchIMFollowListRequest LJ = relationService.LJ();
            FetchMAFListRequest LIZJ = relationService.LIZJ();
            C36089EEj LJIIIZ2 = C36093EEn.LJIIIZ();
            LJIIIZ2.LIZ(LJ);
            if (LIZJ != null) {
                LJIIIZ2.LIZ(LIZJ);
                z = true;
            } else {
                z = false;
            }
            LJIIIZ2.LIZJ();
        } else {
            z = false;
        }
        EFM LJIIIZ3 = C3GN.LIZIZ.LJIIIZ();
        if (Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getInt("ttk_contact_bytesync_enabled_experiment", 0) > 0 && LJIIIZ3 != null) {
            C36089EEj LJIIIZ4 = C36093EEn.LJIIIZ();
            LJIIIZ4.LIZIZ(LJIIIZ3, true);
            LJIIIZ4.LIZJ();
        }
        IMandatoryLoginService createIMandatoryLoginServicebyMonsterPlugin = MandatoryLoginService.createIMandatoryLoginServicebyMonsterPlugin(false);
        if (C38986FRu.LIZ().LIZJ() != 0 && createIMandatoryLoginServicebyMonsterPlugin.shouldShowForcedLogin(false) && !createIMandatoryLoginServicebyMonsterPlugin.getHasRequestComplianceApi()) {
            createIMandatoryLoginServicebyMonsterPlugin.setHasRequestComplianceApi(true);
            EHL ehl2 = new EHL();
            ehl2.LIZIZ(new FetchComplianceSettingRequest(EFN.NORMAL), true);
            ehl2.LIZJ();
        }
        a.LJIJJ().initialize();
        EI0 ei0 = new EI0();
        ei0.LIZIZ(new GeckoHighPriorityCheckInRequest(), true);
        ei0.LIZIZ(new GeckoCheckInRequest(), true);
        ei0.LIZLLL(new InitServiceSettingTask());
        InterfaceC84043Ro familiarService = createIIMServicebyMonsterPlugin.getFamiliarService();
        if (familiarService != null) {
            ei0.LIZLLL(familiarService.LIZIZ());
        }
        ei0.LIZJ();
        if (((RBX) HG3.LJIILL()).isLogin() && !AV1.LJIIJJI() && e1.LIZ(31744, "inbox_has_top_msg", true, false)) {
            InterfaceC56896MUq interfaceC56896MUq = (InterfaceC56896MUq) C54366LVi.LIZ(InterfaceC56896MUq.class);
            if (interfaceC56896MUq != null) {
                interfaceC56896MUq.LJII("");
                interfaceC56896MUq.LIZJ("");
                interfaceC56896MUq.LJFF("");
                interfaceC56896MUq.LJIIJ("");
                interfaceC56896MUq.LJIIIIZZ("");
                interfaceC56896MUq.LJI("");
            }
            EHL ehl3 = new EHL();
            ehl3.LIZLLL(C55888Lwa.LIZIZ.LJJIJIL());
            ehl3.LIZJ();
        }
        List<EFM> LJII = c57738MlK.LJII(!z);
        List<EFM> LJII2 = UTK.LIZIZ.LJII();
        C36089EEj LJIIIZ5 = C36093EEn.LJIIIZ();
        Iterator<EFM> it = LJII.iterator();
        while (it.hasNext()) {
            LJIIIZ5.LIZ(it.next());
        }
        Iterator<EFM> it2 = LJII2.iterator();
        while (it2.hasNext()) {
            LJIIIZ5.LIZ(it2.next());
        }
        LJIIIZ5.LIZJ();
    }
}
