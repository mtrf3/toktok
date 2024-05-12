package com.ss.android.ugc.aweme.legoImp.task;

import X.BPR;
import X.C0RN;
import X.C16880lQ;
import X.C34281Dcr;
import X.C35156Dqy;
import X.C35348Du4;
import X.C36381bm;
import X.C36893Edt;
import X.C37191Eih;
import X.C38027EwB;
import X.C39143FXv;
import X.C39144FXw;
import X.C39146FXy;
import X.C39532FfM;
import X.C54846Lfm;
import X.C60992aN;
import X.C66512jH;
import X.C73040SlY;
import X.C78248UnM;
import X.EE1;
import X.EF7;
import X.EFK;
import X.EJP;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.F6O;
import X.FKM;
import X.FSY;
import X.FY0;
import X.FY1;
import X.FY4;
import X.FY6;
import X.FY8;
import X.FY9;
import X.FYA;
import X.FYL;
import X.FYO;
import Y.ARunnableS1S0001000_6;
import android.app.Application;
import android.content.Context;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.sliver.Sliver;
import com.ss.android.ugc.aweme.ecommerce.core.preloader.ImagePreloadExperiment;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.List;
import java.util.Random;
import kotlin.jvm.internal.AqS68S0000000_6;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class ScalpelConfigInitTask implements EE1 {
    public final Random LJLIL = new Random();

    @Override // X.EEY
    public final String key() {
        return "ScalpelConfigInitTask";
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
    public final int targetProcess() {
        return 1;
    }

    @Override // X.EEY
    public final /* synthetic */ List triggerOtherLegoComponents() {
        return null;
    }

    @Override // X.EEY
    public final /* synthetic */ EnumC36103EEx triggerType() {
        return C0RN.LIZIZ(this);
    }

    public static void LIZLLL() {
        C36893Edt c36893Edt = C36893Edt.LJLIL;
        o.LJIIIZ(c36893Edt, "<set-?>");
        FYL.LIZ = c36893Edt;
        EF7.LJI();
        C66512jH c66512jH = C66512jH.LJLIL;
        o.LJIIIZ(c66512jH, "<set-?>");
        FYL.LIZIZ = c66512jH;
        FY0 fy0 = FY0.LJLIL;
        o.LJIIIZ(fy0, "<set-?>");
        FYO.LIZ = fy0;
        FYO.LIZIZ = new AqS68S0000000_6(0);
        EJP ejp = EJP.LJLIL;
        o.LJIIIZ(ejp, "<set-?>");
        FYO.LIZJ = ejp;
        F6O f6o = F6O.LJLIL;
        o.LJIIIZ(f6o, "<set-?>");
        FYO.LIZLLL = f6o;
        new C73040SlY();
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
        Application application;
        if (this.LJLIL.nextFloat() > 0.05d) {
            return;
        }
        if (C35348Du4.LIZIZ) {
            LIZLLL();
            String LIZIZ = C39532FfM.LIZJ(FKM.LIZ()).LIZIZ("build_timestamp", CardStruct.IStatusCode.DEFAULT);
            o.LJIIIIZZ(LIZIZ, "inst(ApplicationHolder.a…g(\"build_timestamp\", \"0\")");
            long parseLong = CastLongProtector.parseLong(LIZIZ);
            float f = C35156Dqy.LIZ;
            Sliver.init(false);
            float f2 = 5 * f;
            Sliver.start(C16880lQ.LLJJJJ().getThread(), (int) f2, ImagePreloadExperiment.PRIORITY_DEFAULT, FY8.RING);
            FY6 LIZIZ2 = FY6.LIZIZ();
            FY4 fy4 = new FY4(50 * f, f2, parseLong);
            LIZIZ2.LIZ = fy4;
            if (!C39146FXy.LIZ) {
                C39146FXy.LIZ = true;
                C39143FXv c39143FXv = C39143FXv.LIZIZ;
                Sliver.unRegisterSamplingListener(c39143FXv);
                Sliver.registerSamplingListener(c39143FXv);
                C39146FXy.LIZIZ = new FY1(fy4);
            }
            FY6.LIZIZ().getClass();
            C36381bm c36381bm = C36381bm.LJIL;
            if (c36381bm.LJIJJLI && C39146FXy.LIZ) {
                if (!C39146FXy.LIZJ) {
                    C39146FXy.LIZJ = true;
                    C60992aN.LIZIZ.LIZ().postDelayed(new ARunnableS1S0001000_6(0, 13), 60000L);
                }
                c36381bm.LIZLLL(C39146FXy.LIZIZ);
            }
            Context context2 = null;
            if (context != null) {
                context2 = C16880lQ.LLLLL(context);
            }
            if (!(context2 instanceof Application) || (application = (Application) context2) == null) {
                return;
            }
            BPR bpr = new BPR();
            bpr.LIZ = true;
            bpr.LIZIZ = true;
            bpr.LIZJ = true;
            C38027EwB c38027EwB = new C38027EwB(FSY.FIXED);
            c38027EwB.LIZJ = 1;
            c38027EwB.LIZIZ = "scalpel_scene_thread";
            bpr.LIZLLL = C37191Eih.LIZ(c38027EwB);
            if (!C39144FXw.LIZIZ) {
                C39144FXw.LIZJ = new FYA();
                FY9 fy9 = new FY9();
                C39144FXw.LIZLLL = fy9;
                application.registerActivityLifecycleCallbacks(fy9);
                C39144FXw.LIZ = bpr;
                C39144FXw.LIZIZ = true;
            }
            C78248UnM c78248UnM = new C78248UnM();
            FY9 fy92 = C39144FXw.LIZLLL;
            if (fy92 != null) {
                fy92.LJLILLLLZI = c78248UnM;
            }
            FYA fya = C39144FXw.LIZJ;
            if (fya != null) {
                fya.LJ = c78248UnM;
            }
            C39144FXw.LJ = new C54846Lfm();
            return;
        }
        if (!C35348Du4.LIZJ) {
            return;
        }
        C34281Dcr.LIZ().LJIIJJI();
    }
}
