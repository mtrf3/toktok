package com.ss.android.ugc.aweme.assem;

import X.ActivityC45651qj;
import X.C10K;
import X.C16880lQ;
import X.C212428Vi;
import X.C221108m2;
import X.C2K0;
import X.C36093EEn;
import X.C36922EeM;
import X.C37288EkG;
import X.C40328FsC;
import X.C41379GLv;
import X.C42250Gi6;
import X.C45035Hlv;
import X.C45036Hlw;
import X.C46538IOg;
import X.C53765L8f;
import X.C54838Lfe;
import X.C55096Ljo;
import X.C55230Lly;
import X.C56662Kg;
import X.C62822Ol8;
import X.C73040SlY;
import X.C76800UCe;
import X.C78685UuP;
import X.C84193Sd;
import X.C87781Ycj;
import X.EE1;
import X.EI0;
import X.FR4;
import X.InterfaceC41605GUn;
import X.InterfaceC55102Lju;
import X.OSZ;
import X.X1D;
import X.Z9N;
import Y.ACallableS110S0100000_7;
import Y.ACallableS84S0200000_7;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.FragmentManager;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.ability.ToolsMainActivityAbility;
import com.ss.android.ugc.aweme.base.BaseMainContainerAssem;
import com.ss.android.ugc.aweme.base.MainBusinessAbility;
import com.ss.android.ugc.aweme.journey.NewUserGuideAbility;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.IBusinessMainService;
import com.ss.android.ugc.aweme.services.IDLCallbackS16S0200000_7;
import com.ss.android.ugc.aweme.services.IMainService;
import com.ss.android.ugc.aweme.services.MainServiceImpl;
import com.ss.android.ugc.aweme.services.external.ui.RecordConfig;
import com.ss.android.ugc.aweme.services.publish.Publish;
import com.ss.android.ugc.aweme.services.video.IAVPublishService;
import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.CreateBaseAwemeResponse;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import com.ss.android.ugc.governance.eventbus.IEvent;
import java.util.HashSet;
import java.util.concurrent.FutureTask;
import kotlin.jvm.internal.AqS138S0200000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class ToolsActivityAssem extends BaseMainContainerAssem implements ToolsMainActivityAbility, InterfaceC55102Lju {
    public boolean LJLIL;
    public boolean LJLILLLLZI;
    public boolean LJLJI;
    public FutureTask<C76800UCe> LJLJJI;
    public final C62822Ol8 LJLJJL = C221108m2.LIZIZ(C45035Hlv.LJLIL);
    public final HashSet<String> LJLJJLL = new HashSet<>();
    public final C62822Ol8 LJLJL = C221108m2.LIZIZ(C45036Hlw.LJLIL);

    @Override // X.C8W0
    public final void onResume() {
        ActivityC45651qj LIZ;
        Intent intent;
        String LLLZ = C16880lQ.LLLZ("main_act_assem_lifecycle_%s_%s", new Object[]{C16880lQ.LJLLJ(ToolsActivityAssem.class), "onResume"});
        C56662Kg.LIZ().LIZJ(LLLZ, false);
        super.onResume();
        IAVPublishService publishService = AVExternalServiceImpl.LIZ().publishService();
        if (publishService.isPublishing() && ((Z9N.LIZIZ.LJJLIIIJ() || publishService.enableFloatingProgress()) && (LIZ = C212428Vi.LIZ(this)) != null && (intent = LIZ.getIntent()) != null)) {
            F3(intent, false, true);
        }
        C56662Kg.LIZ().LJFF(LLLZ, false);
    }

    @Override // X.InterfaceC55102Lju
    public final C2K0 provideAbility(String str) {
        if (str.hashCode() != 1353757167) {
            return null;
        }
        return this;
    }

    public final IMainService A3() {
        Object value = this.LJLJJL.getValue();
        o.LJIIIIZZ(value, "<get-mainService>(...)");
        return (IMainService) value;
    }

    @Override // X.C8W0
    public final void onStop() {
        super.onStop();
        MainServiceImpl.createIMainServicebyMonsterPlugin(false).startCleanEffect(C212428Vi.LIZ(this));
    }

    /* JADX WARN: Code restructure failed: missing block: B:86:0x0100, code lost:
    
        if (r6 != null) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0089 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean C3(com.ss.android.ugc.aweme.shortvideo.publish.PublishModel r10) {
        /*
            Method dump skipped, instructions count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.assem.ToolsActivityAssem.C3(com.ss.android.ugc.aweme.shortvideo.publish.PublishModel):boolean");
    }

    public final void E3(Bundle bundle) {
        super.onCreate();
        C56662Kg.LIZ().LIZJ("main_act_tools_activity_observer_duration", false);
        EE1 cleanEffectsTask = MainServiceImpl.createIMainServicebyMonsterPlugin(false).getCleanEffectsTask();
        if (cleanEffectsTask != null) {
            C36093EEn.LIZ.getClass();
            EI0 ei0 = new EI0();
            ei0.LIZIZ(cleanEffectsTask, true);
            ei0.LIZJ();
        }
        C37288EkG.LIZ();
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (LIZ == null) {
            return;
        }
        Intent intent = LIZ.getIntent();
        boolean hasExtra = intent.hasExtra("enable_optimize_main_not_in_stack");
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("ProcessPublish MainActivityCreate isMainNotInStackPublish:");
        LIZ2.append(hasExtra);
        C36922EeM.LJ(X1D.LIZIZ(LIZ2));
        if (!((NewUserGuideAbility) C55096Ljo.LIZIZ(C55096Ljo.LJIIZILJ(this), NewUserGuideAbility.class)).isNewUser() && ((bundle == null && hasExtra) || Publish.isNeedProcessPublish || Publish.isInPublish)) {
            this.LJLJI = true;
            Publish.isNeedProcessPublish = false;
            F3(intent, true, false);
        }
        EI0 LIZJ = C40328FsC.LIZJ(C36093EEn.LIZ);
        EE1 initTask = AVExternalServiceImpl.LIZ().initService().initTask(5);
        o.LJI(initTask);
        LIZJ.LIZIZ(initTask, true);
        EE1 initTask2 = AVExternalServiceImpl.LIZ().initService().initTask(6);
        o.LJI(initTask2);
        LIZJ.LIZIZ(initTask2, true);
        EE1 initTask3 = AVExternalServiceImpl.LIZ().initService().initTask(7);
        o.LJI(initTask3);
        LIZJ.LIZIZ(initTask3, true);
        EE1 initTask4 = AVExternalServiceImpl.LIZ().initService().initTask(10);
        if (initTask4 != null) {
            LIZJ.LIZIZ(initTask4, true);
            EE1 initTask5 = AVExternalServiceImpl.LIZ().initService().initTask(11);
            if (initTask5 != null) {
                LIZJ.LIZIZ(initTask5, true);
                EE1 initTask6 = AVExternalServiceImpl.LIZ().initService().initTask(18);
                if (initTask6 != null) {
                    LIZJ.LIZIZ(initTask6, true);
                    EE1 initTask7 = AVExternalServiceImpl.LIZ().initService().initTask(17);
                    if (initTask7 != null) {
                        LIZJ.LIZIZ(initTask7, true);
                        EE1 initTask8 = AVExternalServiceImpl.LIZ().initService().initTask(16);
                        if (initTask8 != null) {
                            LIZJ.LIZIZ(initTask8, true);
                            EE1 initTask9 = AVExternalServiceImpl.LIZ().initService().initTask(13);
                            if (initTask9 != null) {
                                LIZJ.LIZLLL(initTask9);
                                EE1 initTask10 = AVExternalServiceImpl.LIZ().initService().initTask(9);
                                if (initTask10 != null) {
                                    LIZJ.LIZ(initTask10);
                                }
                                LIZJ.LIZJ();
                                C56662Kg.LIZ().LJFF("main_act_tools_activity_observer_duration", false);
                                return;
                            }
                            "Required value was null.".toString();
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        "Required value was null.".toString();
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // com.ss.android.ugc.aweme.base.BaseMainContainerAssem, X.InterfaceC55372LoG
    public final void onCreate(Bundle bundle) {
        String LLLZ = C16880lQ.LLLZ("main_act_assem_lifecycle_%s_%s", new Object[]{C16880lQ.LJLLJ(ToolsActivityAssem.class), "onCreate_with_bundle"});
        C56662Kg.LIZ().LIZJ(LLLZ, false);
        if (!((Boolean) C87781Ycj.LIZIZ.getValue()).booleanValue()) {
            E3(bundle);
        } else {
            this.LJLJJI = new FutureTask<>(new ACallableS84S0200000_7(this, bundle, 3));
        }
        C10K.LIZJ(new ACallableS110S0100000_7(this, 4));
        C56662Kg.LIZ().LJFF(LLLZ, false);
    }

    @Override // com.ss.android.ugc.aweme.base.BaseMainContainerAssem, X.InterfaceC55372LoG
    public final void onNewIntent(Intent intent) {
        boolean z;
        o.LJIIIZ(intent, "intent");
        this.LJLILLLLZI = true;
        String LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(intent, "extra_back_url");
        if (LLJJIJIIJIL != null) {
            Bundle LJJLIIIIJ = C16880lQ.LJJLIIIIJ(intent, "extra_back_bundle");
            if (LJJLIIIIJ == null) {
                LJJLIIIIJ = new Bundle();
            }
            if (C78685UuP.LJJJZ(LLJJIJIIJIL)) {
                SmartRoute buildRoute = SmartRouter.buildRoute(C212428Vi.LIZ(this), LLJJIJIIJIL);
                buildRoute.withParam(LJJLIIIIJ);
                buildRoute.open();
            }
        }
        if (F3(intent, false, false)) {
            return;
        }
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (LIZ != null) {
            ((MainBusinessAbility) C55096Ljo.LIZIZ(C55230Lly.LIZLLL(LIZ, null), MainBusinessAbility.class)).VU(LIZ, "onNewIntent", intent);
            if (C53765L8f.LJIILIIL("NOTIFICATION") || C53765L8f.LJIILIIL("USER")) {
                z = true;
            } else {
                z = false;
            }
            if ((!TextUtils.equals(intent.getAction(), "android.intent.action.MAIN") || !intent.hasCategory("android.intent.category.LAUNCHER")) && !z) {
                C84193Sd.LIZ(LIZ).E50("page_feed", false);
            }
        }
        x3(intent, intent.getBooleanExtra("enter_record_from_other_platform", false));
    }

    @Override // com.ss.android.ugc.aweme.base.BaseMainContainerAssem, X.InterfaceC55372LoG
    public final void K5(boolean z, boolean z2) {
        ActivityC45651qj LIZ;
        FutureTask<C76800UCe> futureTask = this.LJLJJI;
        if (futureTask != null) {
            futureTask.run();
        }
        if (z2 && (LIZ = C212428Vi.LIZ(this)) != null && LIZ.getIntent().getBooleanExtra("enter_record_from_other_platform", false) && !this.LJLIL) {
            AVExternalServiceImpl.LIZ().publishService().tryRestorePublish(LIZ, new AqS138S0200000_7(this, LIZ, 9));
        }
    }

    public final void v3(PublishModel publishModel, boolean z) {
        MainBusinessAbility mainBusinessAbility = (MainBusinessAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), MainBusinessAbility.class, null);
        if (mainBusinessAbility != null) {
            mainBusinessAbility.VU(C212428Vi.LIZ(this), "changeTabAfterPublish", new OSZ(Boolean.valueOf(z), publishModel));
        }
    }

    public final void x3(Intent intent, boolean z) {
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (LIZ != null && z) {
            this.LJLIL = true;
            C73040SlY.LJII(C16880lQ.LLLLLILLIL(LIZ), "protect", "record_on");
            boolean booleanExtra = intent.getBooleanExtra("show_no_splash_ad", false);
            RecordConfig recordConfig = (RecordConfig) intent.getSerializableExtra("EXTRA_AV_RECORD_CONFIG");
            if (booleanExtra) {
                FR4.LIZJ = true;
            }
            AVExternalServiceImpl.LIZ().asyncService(LIZ, "from_3rd_platform", new IDLCallbackS16S0200000_7(recordConfig, LIZ, 3));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:82:0x0189, code lost:
    
        if (r20 != false) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01f9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01fb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean F3(android.content.Intent r18, boolean r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 559
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.assem.ToolsActivityAssem.F3(android.content.Intent, boolean, boolean):boolean");
    }

    @Override // com.ss.android.ugc.aweme.base.BaseMainContainerAssem, X.InterfaceC55372LoG
    public final boolean onActivityResult(int i, int i2, Intent intent) {
        if (i == 1996 && i2 == -1 && intent != null) {
            C41379GLv.LIZ(C212428Vi.LIZ(this), intent);
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ability.ToolsMainActivityAbility
    public final void Lm(C42250Gi6 c42250Gi6, BaseShortVideoContext args, String str, PublishModel publishModel, boolean z) {
        o.LJIIIZ(args, "args");
        o.LJIIIZ(publishModel, "publishModel");
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        IMainService A3 = A3();
        if (!z) {
            v3(publishModel, publishModel.isStoryPublish);
        }
        C56662Kg.LIZ().LIZLLL = false;
        C46538IOg.LIZ = false;
        IEvent publishConcatMessage = A3.getPublishConcatMessage();
        if (publishConcatMessage != null) {
            publishConcatMessage.postSticky();
        }
        int LJFF = c42250Gi6.LJFF();
        ActivityC45651qj LIZ2 = C212428Vi.LIZ(this);
        A3().tryToShowPromoteNotification(LIZ2, LJFF);
        A3().checkAmplify(LIZ2, LJFF);
        Object value = this.LJLJL.getValue();
        o.LJIIIIZZ(value, "<get-businessService>(...)");
        if (!((IBusinessMainService) value).isInActivity()) {
            A3().tryToShowPromoteProgram(LIZ2);
        }
        A3.hideUploadRecover();
        IAVPublishService publishService = AVExternalServiceImpl.LIZ().publishService();
        if ((publishModel.isStoryPublish && C54838Lfe.LJJIJ(publishModel)) || z || publishService.enableFloatingProgress() || LIZ == null) {
            return;
        }
        FragmentManager supportFragmentManager = LIZ.getSupportFragmentManager();
        o.LJIIIIZZ(supportFragmentManager, "activity.supportFragmentManager");
        OSZ<InterfaceC41605GUn<CreateBaseAwemeResponse>, Boolean> parallelPublishUICallBackPair = publishService.getParallelPublishUICallBackPair(A3.showPublishDialogFragmentForParallelPublish(args, supportFragmentManager, c42250Gi6), str, publishModel);
        if (parallelPublishUICallBackPair == null) {
            return;
        }
        Boolean second = parallelPublishUICallBackPair.getSecond();
        o.LJIIIIZZ(second, "pair.second");
        if (!second.booleanValue()) {
            return;
        }
        c42250Gi6.LJI(parallelPublishUICallBackPair.getFirst());
    }
}
