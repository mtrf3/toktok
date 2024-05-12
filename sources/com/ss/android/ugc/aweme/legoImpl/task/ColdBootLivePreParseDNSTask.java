package com.ss.android.ugc.aweme.legoImpl.task;

import X.C0RN;
import X.C33798DOg;
import X.C35274Dss;
import X.EE1;
import X.EE4;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.InterfaceC36076EDw;
import android.content.Context;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class ColdBootLivePreParseDNSTask implements EE1, InterfaceC36076EDw {
    @Override // X.InterfaceC36076EDw
    public final /* synthetic */ String[] deps() {
        return null;
    }

    @Override // X.EEY
    public final String key() {
        return "ColdBootLivePreParseDNSTask";
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

    @Override // X.InterfaceC36076EDw
    public final int priority() {
        if (((Boolean) C33798DOg.LIZ.getValue()).booleanValue()) {
            return 2;
        }
        return 1;
    }

    @Override // X.EEY
    public final EnumC36092EEm scenesType() {
        if (((Boolean) C35274Dss.LJII.getValue()).booleanValue()) {
            return EnumC36092EEm.FIRST_WINDOW_FOCUS;
        }
        EnumC36092EEm enumC36092EEm = EnumC36092EEm.DEFAULT;
        o.LJIIIIZZ(enumC36092EEm, "super.scenesType()");
        return enumC36092EEm;
    }

    @Override // X.EE1
    public final EFK type() {
        if (((Boolean) C33798DOg.LIZ.getValue()).booleanValue()) {
            return EFK.BOOT_FINISH;
        }
        return EFK.BACKGROUND;
    }

    @Override // X.InterfaceC36076EDw
    public final EE4 threadType() {
        return EE4.CPU;
    }

    @Override // X.EEY
    public final void run(Context context) {
        o.LJIIIZ(context, "context");
        LiveOuterService.LJJJLL().LJIIIIZZ(context);
    }
}
