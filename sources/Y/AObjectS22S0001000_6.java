package Y;

import X.BLD;
import X.C34668Dj6;
import X.C34680DjI;
import X.C35818E3y;
import X.C36089EEj;
import X.C36093EEn;
import X.C38656FFc;
import X.C38657FFd;
import X.C38659FFf;
import X.C40104Foa;
import X.C40106Foc;
import X.C40438Fty;
import X.C61532OCy;
import X.CN1;
import X.DR6;
import X.EBC;
import X.EE4;
import X.EFK;
import X.EU3;
import X.EnumC38662FFi;
import X.EnumC40442Fu2;
import X.GGS;
import X.InterfaceC38673FFt;
import X.InterfaceC65784Pro;
import com.bytedance.android.live.function.IRoomFunctionService;
import com.bytedance.android.livesdk.chatroom.ui.AbsAudienceInteractionFragment;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.im.service.IIMService;
import com.ss.android.ugc.aweme.lego.RunnableIdleTask;
import com.ss.android.ugc.aweme.legoImpl.task.PreloadInMeasureTriggerTask;
import com.ss.android.ugc.aweme.setting.ui.I18nSettingNewVersionFragment;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes7.dex */
public class AObjectS22S0001000_6 implements InterfaceC65784Pro {
    public final int $t;
    public int i0;

    @Override // X.InterfaceC65784Pro
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            case 6:
                return invoke$6(this);
            case 7:
                return invoke$7(this);
            case 8:
                return invoke$8(this);
            case 9:
                return invoke$9(this);
            case 10:
                return invoke$10(this);
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                return invoke$11(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AObjectS22S0001000_6 aObjectS22S0001000_6) {
        switch (aObjectS22S0001000_6.i0) {
            case 0:
                return AbsAudienceInteractionFragment.lambda$loadInitWidgetsP0$31();
            case 1:
                return new BLD(-1);
            case 2:
                C38659FFf.LJFF.getClass();
                if (((Boolean) C34668Dj6.LIZ.getValue()).booleanValue()) {
                    EnumC38662FFi enumC38662FFi = EnumC38662FFi.KV;
                    C38657FFd.LJ(enumC38662FFi, "frist_brush_keva");
                    C38657FFd.LIZIZ(enumC38662FFi, "frist_brush_keva");
                    return null;
                }
                return null;
            case 3:
                GGS.LIZ.getClass();
                return GGS.LIZLLL;
            default:
                return I18nSettingNewVersionFragment.lambda$semisugar$$init$$1();
        }
    }

    public static final Object invoke$1(AObjectS22S0001000_6 aObjectS22S0001000_6) {
        switch (aObjectS22S0001000_6.i0) {
            case 0:
                return ((IRoomFunctionService) CN1.LIZ(IRoomFunctionService.class)).Qz();
            case 1:
                C61532OCy c61532OCy = EBC.LIZ;
                c61532OCy.LIZ("occasion_high_priority");
                c61532OCy.LIZ("occasion_normal");
                return null;
            default:
                return EFK.BACKGROUND;
        }
    }

    public static final Object invoke$10(AObjectS22S0001000_6 aObjectS22S0001000_6) {
        InterfaceC38673FFt heavyJobControlService;
        switch (aObjectS22S0001000_6.i0) {
            case 0:
                IIMService createIIMServicebyMonsterPlugin = IMService.createIIMServicebyMonsterPlugin(false);
                if (createIIMServicebyMonsterPlugin != null && (heavyJobControlService = createIIMServicebyMonsterPlugin.getHeavyJobControlService()) != null) {
                    heavyJobControlService.LIZIZ();
                    return null;
                }
                return null;
            default:
                return EFK.IDLE;
        }
    }

    public static final Object invoke$11(AObjectS22S0001000_6 aObjectS22S0001000_6) {
        switch (aObjectS22S0001000_6.i0) {
            case 0:
                return new C40104Foa(true, true);
            default:
                return EFK.BACKGROUND;
        }
    }

    public static final Object invoke$2(AObjectS22S0001000_6 aObjectS22S0001000_6) {
        switch (aObjectS22S0001000_6.i0) {
            case 0:
                return AbsAudienceInteractionFragment.lambda$loadWidgetWithRoomP1$39();
            case 1:
                return new BLD(0);
            default:
                C38656FFc.LJFF.getClass();
                if (((Boolean) C34680DjI.LIZ.getValue()).booleanValue()) {
                    EnumC38662FFi enumC38662FFi = EnumC38662FFi.AB;
                    C38657FFd.LJ(enumC38662FFi, "frist_brush");
                    C38657FFd.LIZIZ(enumC38662FFi, "frist_brush");
                    return null;
                }
                return null;
        }
    }

    public static final Object invoke$3(AObjectS22S0001000_6 aObjectS22S0001000_6) {
        switch (aObjectS22S0001000_6.i0) {
            case 0:
                return new BLD(0);
            case 1:
                return new C40106Foc();
            case 2:
                ArrayList arrayList = new ArrayList();
                arrayList.add(PreloadInMeasureTriggerTask.LJLIL);
                return arrayList;
            default:
                return new BLD(0);
        }
    }

    public static final Object invoke$4(AObjectS22S0001000_6 aObjectS22S0001000_6) {
        switch (aObjectS22S0001000_6.i0) {
            case 0:
                C40438Fty.LJI("three_vv", null);
                ((HashMap) C40438Fty.LIZ).put("three_vv", EnumC40442Fu2.NOT_MONITORED);
                return null;
            case 1:
                return new C40106Foc();
            default:
                EU3.LJ();
                return null;
        }
    }

    public static final Object invoke$5(AObjectS22S0001000_6 aObjectS22S0001000_6) {
        switch (aObjectS22S0001000_6.i0) {
            case 0:
                return Boolean.valueOf(C35818E3y.LIZ());
            case 1:
                return EFK.BACKGROUND;
            default:
                synchronized (EU3.class) {
                    if (!EU3.LIZIZ) {
                        EU3.LJ();
                        return null;
                    }
                    return null;
                }
        }
    }

    public static final Object invoke$6(AObjectS22S0001000_6 aObjectS22S0001000_6) {
        switch (aObjectS22S0001000_6.i0) {
            case 0:
                return EFK.BOOT_FINISH;
            default:
                return new BLD(0);
        }
    }

    public static final Object invoke$7(AObjectS22S0001000_6 aObjectS22S0001000_6) {
        switch (aObjectS22S0001000_6.i0) {
            case 0:
                return Boolean.valueOf(((Boolean) DR6.LIZLLL.getValue()).booleanValue());
            default:
                return new C40106Foc();
        }
    }

    public static final Object invoke$8(AObjectS22S0001000_6 aObjectS22S0001000_6) {
        switch (aObjectS22S0001000_6.i0) {
            case 0:
                C61532OCy c61532OCy = EBC.LIZ;
                c61532OCy.LJIILIIL("occasion_high_priority");
                c61532OCy.LJIILIIL("occasion_normal");
                return null;
            case 1:
                return new C40106Foc();
            default:
                C36093EEn.LIZ.getClass();
                C36089EEj LJIIIZ = C36093EEn.LJIIIZ();
                LJIIIZ.LIZIZ(new RunnableIdleTask(new ARunnableS13S0000000_6(60), "InitPushFullyTask", 1000L, EE4.CPU), true);
                LJIIIZ.LIZJ();
                return null;
        }
    }

    public static final Object invoke$9(AObjectS22S0001000_6 aObjectS22S0001000_6) {
        InterfaceC38673FFt heavyJobControlService;
        switch (aObjectS22S0001000_6.i0) {
            case 0:
                IIMService createIIMServicebyMonsterPlugin = IMService.createIIMServicebyMonsterPlugin(false);
                if (createIIMServicebyMonsterPlugin != null && (heavyJobControlService = createIIMServicebyMonsterPlugin.getHeavyJobControlService()) != null) {
                    heavyJobControlService.LIZ();
                    return null;
                }
                return null;
            default:
                return new BLD(0);
        }
    }

    public AObjectS22S0001000_6(int i, int i2) {
        this.$t = i2;
        this.i0 = i;
    }
}
