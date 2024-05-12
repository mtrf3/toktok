package com.ss.android.ugc.aweme.legoImp.task;

import X.C0RN;
import X.C10K;
import X.C16880lQ;
import X.C36152EGu;
import X.DPP;
import X.EE1;
import X.EE4;
import X.EFK;
import X.EU1;
import X.EU2;
import X.EU3;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.InterfaceC36076EDw;
import android.content.Context;
import android.os.Looper;
import java.util.List;

/* loaded from: classes7.dex */
public class GetGoogleAIdTask implements EE1, InterfaceC36076EDw {
    public final EFK LJLIL;

    @Override // X.InterfaceC36076EDw
    public final /* synthetic */ String[] deps() {
        return null;
    }

    @Override // X.EEY
    public final String key() {
        return "GetGoogleAIdTask";
    }

    @Override // X.EEY
    public final /* synthetic */ boolean meetTrigger() {
        return true;
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

    @Override // X.InterfaceC36076EDw
    public final EE4 threadType() {
        if (C36152EGu.LJ()) {
            if (DPP.LIZIZ()) {
                return EE4.IO;
            }
            return EE4.CPU;
        }
        if (EU2.LIZ()) {
            return EE4.IO;
        }
        return EE4.CPU;
    }

    @Override // X.EEY
    public final EnumC36092EEm scenesType() {
        return EnumC36092EEm.DEFAULT;
    }

    @Override // X.EE1
    public final EFK type() {
        return this.LJLIL;
    }

    public GetGoogleAIdTask(EFK efk) {
        this.LJLIL = efk;
    }

    @Override // X.EEY
    public final void run(Context context) {
        EFK efk = this.LJLIL;
        if (efk == EFK.BACKGROUND) {
            if (Looper.myLooper() == C16880lQ.LLJJJJ()) {
                return;
            }
            EU3.LJFF();
        } else if (efk == EFK.BOOT_FINISH) {
            C10K.LJII(60000L).LJ(new EU1(0), C10K.LJIIIIZZ, null);
        } else {
            if (efk != EFK.IDLE || Looper.myLooper() == C16880lQ.LLJJJJ()) {
                return;
            }
            EU3.LJFF();
        }
    }
}
