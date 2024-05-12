package com.ss.android.legoimpl;

import X.C00F;
import X.C0RN;
import X.C39052FUi;
import X.C39642Fh8;
import X.C39725FiT;
import X.C39728FiW;
import X.C39733Fib;
import X.EE1;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import android.app.Application;
import android.content.Context;
import java.util.List;

/* loaded from: classes7.dex */
public class DecompressTask implements EE1 {
    @Override // X.EEY
    public final String key() {
        return "DecompressTask";
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

    /* loaded from: classes7.dex */
    public static class InitTask implements EE1 {
        public static volatile boolean LJLIL;

        @Override // X.EEY
        public final String key() {
            return "DecompressTask$InitTask";
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

        @Override // X.EEY
        public final EnumC36092EEm scenesType() {
            return EnumC36092EEm.DEFAULT;
        }

        @Override // X.EE1
        public final EFK type() {
            return EFK.BOOT_FINISH;
        }

        public static void LIZLLL(Application application) {
            if (C39052FUi.LIZ && !LJLIL) {
                synchronized (InitTask.class) {
                    if (!LJLIL) {
                        C39725FiT c39725FiT = C39642Fh8.LIZ;
                        c39725FiT.LIZJ(application, new C39733Fib(application));
                        c39725FiT.LIZLLL(new C39728FiW(0));
                        LJLIL = true;
                    }
                }
            }
        }

        @Override // X.EEY
        public final void run(Context context) {
            if (context != null) {
                LIZLLL((Application) context);
            }
        }
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
        if (C00F.LIZ(31744, 0, "enable_effect_compress_config", true) < 1) {
            return;
        }
        C39052FUi.LIZ = true;
    }
}
