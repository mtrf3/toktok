package com.ss.android.ugc.aweme.legoImp.task;

import X.C0RN;
import X.C100833xX;
import X.C2NW;
import X.C33883DRn;
import X.C36152EGu;
import X.C36798EcM;
import X.EE1;
import X.EE4;
import X.EFK;
import X.EKL;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.InterfaceC36076EDw;
import X.InterfaceC36797EcL;
import android.content.Context;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import java.util.List;

/* loaded from: classes7.dex */
public class CleanEffectsTask implements EE1, InterfaceC36076EDw {
    public static volatile boolean LJLIL;
    public static volatile boolean LJLILLLLZI;

    @Override // X.InterfaceC36076EDw
    public final /* synthetic */ String[] deps() {
        return null;
    }

    @Override // X.EEY
    public final String key() {
        return "CleanEffectsTask";
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

    @Override // X.EEY
    public final boolean meetTrigger() {
        if (!C36152EGu.LJ()) {
            return true;
        }
        return !C2NW.LIZ().LJIILLIIL(C100833xX.LJLIL);
    }

    @Override // X.InterfaceC36076EDw
    public final int priority() {
        InterfaceC36797EcL interfaceC36797EcL;
        if (EKL.LIZJ() && (interfaceC36797EcL = C36798EcM.LIZ.get("shoot_level")) != null && interfaceC36797EcL.LIZ() == 3) {
            return 2;
        }
        return 1;
    }

    @Override // X.EEY
    public final EnumC36092EEm scenesType() {
        return EnumC36092EEm.DEFAULT;
    }

    @Override // X.InterfaceC36076EDw
    public final EE4 threadType() {
        return EE4.CPU;
    }

    @Override // X.EEY
    public final void run(Context context) {
        try {
            AVExternalServiceImpl.LIZ().configService().cacheConfig().clearExpiredDrafts();
            AVExternalServiceImpl.LIZ().configService().cacheConfig().clearCreativeCacheFiles();
            AVExternalServiceImpl.LIZ().configService().cacheConfig().preloadDraftEffectList();
        } catch (Exception unused) {
        }
    }
}
