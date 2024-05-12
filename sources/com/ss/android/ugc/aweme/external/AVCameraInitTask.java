package com.ss.android.ugc.aweme.external;

import X.C0RN;
import X.C100833xX;
import X.C244019ht;
import X.C26223AQx;
import X.C2NW;
import X.C33883DRn;
import X.C36798EcM;
import X.C3B1;
import X.C45757HxZ;
import X.C48841JEv;
import X.C60903NvH;
import X.C65083PgV;
import X.C78547UsB;
import X.C78548UsC;
import X.C78554UsI;
import X.C78613UtF;
import X.C79733Az;
import X.C88074YhS;
import X.EE1;
import X.EE4;
import X.EFK;
import X.EKL;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.GO2;
import X.H7B;
import X.InterfaceC36076EDw;
import X.InterfaceC36797EcL;
import X.Q3P;
import X.XKX;
import android.content.Context;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.shortvideo.network.ToolsInterceptor;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class AVCameraInitTask implements EE1, InterfaceC36076EDw {
    @Override // X.InterfaceC36076EDw
    public final /* synthetic */ String[] deps() {
        return null;
    }

    @Override // X.EEY
    public final String key() {
        return "AVCameraInitTask";
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

    @Override // X.EE1
    public final EFK type() {
        InterfaceC36797EcL interfaceC36797EcL;
        if (C2NW.LIZ().LJIILLIIL(C33883DRn.LJLIL)) {
            return EFK.APP_BACKGROUND;
        }
        if ((EKL.LIZJ() || EKL.LIZIZ()) && (interfaceC36797EcL = C36798EcM.LIZ.get("shoot_level")) != null) {
            int LIZ = interfaceC36797EcL.LIZ();
            if (EKL.LIZJ()) {
                if (LIZ == 0) {
                    return EFK.APP_BACKGROUND;
                }
            } else if (EKL.LIZIZ()) {
                if (LIZ != 0) {
                    if (LIZ == 3) {
                        return EFK.BACKGROUND;
                    }
                } else {
                    return EFK.APP_BACKGROUND;
                }
            }
        }
        return EFK.BOOT_FINISH;
    }

    @Override // X.InterfaceC36076EDw
    public final EE4 threadType() {
        if (((Boolean) C88074YhS.LJ.getValue()).booleanValue()) {
            return EE4.IO;
        }
        return EE4.CPU;
    }

    @Override // X.EEY
    public final boolean meetTrigger() {
        if (!C2NW.LIZ().isNewUser() || !C2NW.LIZ().LJIILLIIL(C100833xX.LJLIL)) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC36076EDw
    public final int priority() {
        InterfaceC36797EcL interfaceC36797EcL;
        if (EKL.LIZJ() && (interfaceC36797EcL = C36798EcM.LIZ.get("shoot_level")) != null && interfaceC36797EcL.LIZ() == 3) {
            return 2;
        }
        return 1;
    }

    /* loaded from: classes5.dex */
    public static final class PostedDraftConvertToNormal implements EE1 {
        @Override // X.EEY
        public final String key() {
            return "AVCameraInitTask$PostedDraftConvertToNormal";
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
            return EFK.SPARSE;
        }

        @Override // X.EEY
        public final void run(Context context) {
            GO2.LIZ.getClass();
            Keva keva = GO2.LIZJ;
            boolean z = keva.getBoolean("posted_draft_experiment_last_status", false);
            if (!C26223AQx.LIZ() && z) {
                XKX.LIZLLL(C48841JEv.LIZ(C78613UtF.LIZJ), null, null, new C244019ht(null), 3);
            }
            keva.storeBoolean("posted_draft_experiment_last_status", C26223AQx.LIZ());
        }
    }

    /* loaded from: classes12.dex */
    public static final class InitToolsActivityListener implements EE1 {
        @Override // X.EEY
        public final String key() {
            return "AVCameraInitTask$InitToolsActivityListener";
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
            return EFK.BOOT_FINISH;
        }

        @Override // X.EEY
        public final void run(Context context) {
            o.LJIIIZ(context, "context");
            if (C78548UsC.LIZ()) {
                C78554UsI.LIZIZ.init();
                C60903NvH.LJIIJJI().LJIILIIL().listenToCurrentPage(C3B1.LJLIL);
            }
            if (C78547UsB.LIZ()) {
                C60903NvH.LJIIJJI().LJIILIIL().listenToCurrentPage(C79733Az.LJLIL);
            }
            if (Q3P.LIZ().getEnable()) {
                C65083PgV.LIZIZ(new ToolsInterceptor());
            }
        }
    }

    /* loaded from: classes7.dex */
    public static final class InitCBClickTrack implements EE1 {
        @Override // X.EEY
        public final String key() {
            return "AVCameraInitTask$InitCBClickTrack";
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
            return EFK.BOOT_FINISH;
        }

        @Override // X.EEY
        public final void run(Context context) {
            o.LJIIIZ(context, "context");
        }
    }

    @Override // X.EEY
    public final EnumC36092EEm scenesType() {
        return EnumC36092EEm.DEFAULT;
    }

    @Override // X.EEY
    public final void run(Context context) {
        o.LJIIIZ(context, "context");
        H7B.LJ("camera preLoad so start");
        H7B.LJ("camera preLoad so preLoadVESo");
        ((C45757HxZ) C45757HxZ.LJ.getValue()).preLoadVESo();
        H7B.LJ("camera preLoad so end");
    }
}
