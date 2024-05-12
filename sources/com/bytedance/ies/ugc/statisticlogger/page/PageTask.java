package com.bytedance.ies.ugc.statisticlogger.page;

import X.C0RN;
import X.C18080nM;
import X.C40930G4o;
import X.C40931G4p;
import X.C40932G4q;
import X.EE1;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.G4T;
import X.InterfaceC18060nK;
import android.content.Context;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class PageTask implements EE1 {
    @Override // X.EEY
    public final String key() {
        return "PageTask";
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
        return EFK.MAIN;
    }

    @Override // X.EEY
    public final void run(Context context) {
        C40932G4q c40932G4q = C40932G4q.LIZ;
        c40932G4q.getClass();
        final G4T onAttach = G4T.LJLIL;
        final C40930G4o c40930G4o = new C40930G4o(c40932G4q);
        o.LJIIIZ(onAttach, "onAttach");
        C18080nM.LIZ.getClass();
        C18080nM.LJ().add(new InterfaceC18060nK() { // from class: X.1X0
            @Override // X.InterfaceC18060nK
            public final void LIZJ(C32781Qk c32781Qk) {
            }

            @Override // X.InterfaceC18060nK
            public final void LIZLLL(C32781Qk c32781Qk) {
            }

            @Override // X.InterfaceC18060nK
            public final void LIZ(C32781Qk c32781Qk) {
                onAttach.invoke(c32781Qk);
            }

            @Override // X.InterfaceC18060nK
            public final void LIZIZ(C32781Qk c32781Qk) {
                c40930G4o.invoke(c32781Qk);
            }
        });
        C40931G4p listener = C40931G4p.LJLIL;
        o.LJIIIZ(listener, "listener");
        ((CopyOnWriteArrayList) C18080nM.LJIIIIZZ.getValue()).add(listener);
    }
}
