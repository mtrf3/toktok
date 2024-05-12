package com.ss.android.ugc.aweme.legoImp.task;

import X.C0RN;
import X.C2NW;
import X.C35799E3f;
import X.C35800E3g;
import X.C35801E3h;
import X.C35818E3y;
import X.C36152EGu;
import X.C62822Ol8;
import X.DS5;
import X.DS8;
import X.DSB;
import X.DSC;
import X.DSG;
import X.EE1;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.X1D;
import android.content.Context;
import android.os.Process;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS156S0100000_6;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class ColdStartThreadPriorityOpt implements EE1 {
    public final EFK LJLIL;
    public final int LJLILLLLZI;

    @Override // X.EEY
    public final String key() {
        return "ColdStartThreadPriorityOpt";
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
        return this.LJLIL;
    }

    public ColdStartThreadPriorityOpt(EFK workType) {
        o.LJIIIZ(workType, "workType");
        this.LJLIL = workType;
        this.LJLILLLLZI = Process.myTid();
    }

    @Override // X.EEY
    public final void run(Context context) {
        Thread thread;
        if (C36152EGu.LJ()) {
            if (C2NW.LIZ().LJIILLIIL(DSB.LJLIL)) {
                C35801E3h.LIZJ();
                if (C2NW.LIZ().LJIILLIIL(DS5.LJLIL)) {
                    C35818E3y.LIZJ(1, new AqS156S0100000_6(this, 52));
                    C35818E3y.LIZJ(2, new AqS156S0100000_6(this, 53));
                }
                if (DS8.LIZIZ() || C2NW.LIZ().LJIILLIIL(DSC.LJLIL)) {
                    C35818E3y.LIZJ(1, C35799E3f.LJLIL);
                }
                C35818E3y.LIZJ(4, C35800E3g.LJLIL);
                return;
            }
            return;
        }
        EFK efk = this.LJLIL;
        if (efk == EFK.BACKGROUND) {
            C62822Ol8 c62822Ol8 = DSG.LIZIZ;
            if (((Boolean) c62822Ol8.getValue()).booleanValue() || ((Boolean) DSG.LIZJ.getValue()).booleanValue() || ((Boolean) DSG.LIZLLL.getValue()).booleanValue()) {
                C35801E3h.LIZJ();
            }
            if (((Boolean) c62822Ol8.getValue()).booleanValue()) {
                C35801E3h.LJIIIZ("APM_light-weight-task");
            }
            if (((Boolean) DSG.LIZJ.getValue()).booleanValue()) {
                C35801E3h.LJIIIZ("ActionReaper");
                C35801E3h.LJIIIZ("TeaThread");
                C35801E3h.LJIIIZ("mdl_log_handler");
            }
            if (!((Boolean) DSG.LIZLLL.getValue()).booleanValue()) {
                return;
            }
            C35801E3h.LJII("acceleratePlayHandlerThread");
            return;
        }
        if (efk != EFK.BOOT_FINISH) {
            return;
        }
        if (((Boolean) DSG.LIZIZ.getValue()).booleanValue()) {
            C35801E3h.LJIIJJI("APM_light-weight-task");
        }
        if (((Boolean) DSG.LIZJ.getValue()).booleanValue()) {
            C35801E3h.LJIIJJI("ActionReaper");
            C35801E3h.LJIIJJI("TeaThread");
            C35801E3h.LJIIJJI("mdl_log_handler");
        }
        if (((Boolean) DSG.LIZLLL.getValue()).booleanValue()) {
            C35801E3h.LJIIJJI("acceleratePlayHandlerThread");
        }
        C62822Ol8 c62822Ol82 = DSG.LJI;
        if (((Boolean) c62822Ol82.getValue()).booleanValue() || ((Boolean) DSG.LJFF.getValue()).booleanValue()) {
            C35801E3h.LIZJ();
        }
        if (((Boolean) c62822Ol82.getValue()).booleanValue() && (thread = (Thread) ((LinkedHashMap) C35801E3h.LIZIZ).get("RenderThread")) != null) {
            thread.setPriority(10);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("setThreadPriorityMaxByName ");
            LIZ.append("RenderThread");
            LIZ.append(' ');
            X1D.LIZIZ(LIZ);
        }
        if (((Boolean) DSG.LJFF.getValue()).booleanValue()) {
            C35801E3h.LJII("play_thread_0");
            C35801E3h.LJII("play_thread_1");
            C35801E3h.LJII("play_thread_2");
            C35801E3h.LJII("explay_thread_0");
            C35801E3h.LJII("explay_thread_1");
            C35801E3h.LJII("explay_thread_2");
            C35801E3h.LJII("main");
        }
        if (DSG.LIZIZ()) {
            C35801E3h.LJ("RenderThread");
            C35801E3h.LJ("play_thread_0");
            C35801E3h.LJ("play_thread_1");
            C35801E3h.LJ("play_thread_2");
            C35801E3h.LJ("explay_thread_0");
            C35801E3h.LJ("explay_thread_1");
            C35801E3h.LJ("explay_thread_2");
            C35801E3h.LJ("main");
        }
        ((LinkedHashMap) C35801E3h.LIZIZ).clear();
        C35801E3h.LJI = false;
    }
}
