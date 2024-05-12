package com.ss.android.ugc.aweme.legoImp.task;

import X.C0RN;
import X.C34710Djm;
import X.EE1;
import X.EE4;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.FMW;
import X.InterfaceC36076EDw;
import android.content.Context;
import java.util.List;
import kotlin.jvm.internal.AqS156S0100000_6;

/* loaded from: classes7.dex */
public final class PreloadResourcesTask implements EE1, InterfaceC36076EDw {
    public static final PreloadResourcesTask LJLIL = new PreloadResourcesTask();

    @Override // X.InterfaceC36076EDw
    public final /* synthetic */ String[] deps() {
        return null;
    }

    @Override // X.EEY
    public final String key() {
        return "PreloadResourcesTask";
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

    @Override // X.InterfaceC36076EDw
    public final EE4 threadType() {
        return EE4.IO;
    }

    @Override // X.EE1
    public final EFK type() {
        return EFK.BACKGROUND;
    }

    @Override // X.EEY
    public final void run(Context context) {
        if (!((Boolean) C34710Djm.LJIJJLI.getValue()).booleanValue()) {
            return;
        }
        FMW.LIZJ(new AqS156S0100000_6(context, 47));
    }
}
