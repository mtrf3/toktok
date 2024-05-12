package com.ss.android.ugc.aweme.legoImpl.task;

import X.C0RN;
import X.C39579Fg7;
import X.C79081V1x;
import X.C81742W6g;
import X.DMN;
import X.EE1;
import X.EE4;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.FCO;
import X.InterfaceC36076EDw;
import X.PEH;
import X.PGN;
import X.W4T;
import X.WCW;
import android.content.Context;
import java.util.List;

/* loaded from: classes15.dex */
public class FrescoTask implements EE1, InterfaceC36076EDw {
    public static volatile boolean LJLIL;

    @Override // X.InterfaceC36076EDw
    public final /* synthetic */ String[] deps() {
        return null;
    }

    @Override // X.EEY
    public final String key() {
        return "FrescoTask";
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
    public final int priority() {
        return 2;
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

    @Override // X.EE1
    public final EFK type() {
        if (DMN.LIZ()) {
            return EFK.BACKGROUND;
        }
        return EFK.MAIN;
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
        if (!LJLIL) {
            synchronized (FrescoTask.class) {
                if (!LJLIL) {
                    if (DMN.LIZ()) {
                        WCW.LJJJIL.getClass();
                    }
                    if (FCO.LIZ) {
                        W4T.LJ = true;
                    }
                    System.currentTimeMillis();
                    context.getClass();
                    C39579Fg7.LJLIL = context;
                    try {
                        C79081V1x.LJIJ();
                        LJLIL = true;
                        PGN.LIZ.LIZ(new C81742W6g());
                    } catch (Exception e) {
                        PEH.LIZLLL(e, "[Lighten][Fresco][Initializer][Throwable]");
                        throw e;
                    }
                }
            }
        }
    }
}
