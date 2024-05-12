package com.ss.android.ugc.aweme.lego.kita;

import X.C0RN;
import X.C1DH;
import X.C2303892k;
import X.C47063IdX;
import X.C47066Ida;
import X.ChoreographerFrameCallbackC47064IdY;
import X.ChoreographerFrameCallbackC47065IdZ;
import X.EE1;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.FFR;
import Y.ARunnableS44S0100000_8;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.Choreographer;
import com.bytedance.common.jato.gfx.DoFrameController;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes9.dex */
public final class InitKitaTask implements EE1 {
    public boolean LJLIL;
    public Choreographer.FrameCallback LJLJJI;
    public final ChoreographerFrameCallbackC47065IdZ LJLILLLLZI = new ChoreographerFrameCallbackC47065IdZ(this);
    public final ChoreographerFrameCallbackC47064IdY LJLJI = new ChoreographerFrameCallbackC47064IdY(this);
    public final C47063IdX LJLJJL = new C47063IdX(this);
    public final FFR LJLJJLL = new FFR(this);

    @Override // X.EEY
    public final String key() {
        return "InitKitaTask";
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

    @Override // X.EEY
    public final void run(Context context) {
        if (Build.VERSION.SDK_INT >= 24 && (((Number) C47066Ida.LIZ.getValue()).intValue() & 1) == 1) {
            C1DH.LJJIJIIJI(new ARunnableS44S0100000_8(this, 22));
        }
        if (!((Boolean) C2303892k.LIZIZ.getValue()).booleanValue()) {
            return;
        }
        C1DH.LJJIJIIJI(new Runnable() { // from class: X.9QE
            public static void LIZ() {
                try {
                    Activity LJIIIIZZ = C84763XOl.LJIIIIZZ();
                    if (LJIIIIZZ != null) {
                        C9QH.LIZ = false;
                        C25937AFx.LIZ(LJIIIIZZ, ((Number) C2303892k.LIZ.getValue()).intValue());
                        C9QF c9qf = new C9QG() { // from class: X.9QF
                            @Override // X.C9QG
                            public final void LIZ() {
                                C36505EUj.LIZ();
                            }
                        };
                        if (C16880lQ.LLLLIIIILLL() == C16880lQ.LLJJJJ().getThread()) {
                            if (DoFrameController.LJII == null) {
                                DoFrameController.LJII = new ArrayList<>();
                            }
                            DoFrameController.LJII.add(c9qf);
                            return;
                        }
                        throw new IllegalStateException("must call in main thread");
                    }
                } catch (Throwable unused) {
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean LIZ;
                try {
                    LIZ();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
    }
}
