package com.ss.android.ugc.aweme.legoImp.task;

import X.C0RN;
import X.C16880lQ;
import X.C33949DUb;
import X.C34319DdT;
import X.C35274Dss;
import X.C36261EKz;
import X.DN4;
import X.E3F;
import X.EE1;
import X.EE4;
import X.EF7;
import X.EFK;
import X.EL0;
import X.EL1;
import X.EXK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.InterfaceC36076EDw;
import android.content.Context;
import com.ss.android.ugc.aweme.compliance.sandbox.serviceimpl.SandboxServiceImpl;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class InitWebViewHookTask implements EE1, InterfaceC36076EDw {
    @Override // X.InterfaceC36076EDw
    public final /* synthetic */ String[] deps() {
        return null;
    }

    @Override // X.EEY
    public final String key() {
        return "InitWebViewHookTask";
    }

    @Override // X.EEY
    public final /* synthetic */ String prefix() {
        return "task_";
    }

    @Override // X.InterfaceC36076EDw
    public final /* synthetic */ int priority() {
        return 1;
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
        if (((Boolean) C35274Dss.LJIIIZ.getValue()).booleanValue()) {
            return EnumC36092EEm.FIRST_WINDOW_FOCUS;
        }
        EnumC36092EEm enumC36092EEm = EnumC36092EEm.DEFAULT;
        o.LJIIIIZZ(enumC36092EEm, "super.scenesType()");
        return enumC36092EEm;
    }

    @Override // X.InterfaceC36076EDw
    public final EE4 threadType() {
        Object LIZJ = E3F.LIZJ("initWebviewhook_io", C36261EKz.LJLIL, EL0.LJLIL, ((Boolean) DN4.LJ.getValue()).booleanValue());
        if (LIZJ != null) {
            return (EE4) LIZJ;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // X.EE1
    public final EFK type() {
        if (((Number) C34319DdT.LIZ.getValue()).intValue() > 0) {
            return EFK.BOOT_FINISH;
        }
        return EFK.BACKGROUND;
    }

    @Override // X.EEY
    public final boolean meetTrigger() {
        if (C33949DUb.LIZJ()) {
            return false;
        }
        return true;
    }

    @Override // X.EEY
    public final void run(Context context) {
        Context LIZIZ = EF7.LIZIZ();
        if (EXK.LJIIIZ.contains(LIZIZ.getPackageName())) {
            try {
                if (!EXK.LJI.getAndSet(true)) {
                    C16880lQ.LLLLL(LIZIZ);
                    EXK.LIZIZ();
                    EXK.LIZ();
                }
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
        }
        SandboxServiceImpl.LIZ().hookWebView();
        EL1.LIZIZ.LIZ();
    }
}
