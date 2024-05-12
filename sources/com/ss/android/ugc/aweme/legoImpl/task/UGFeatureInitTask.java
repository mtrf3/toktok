package com.ss.android.ugc.aweme.legoImpl.task;

import X.C0RN;
import X.C35274Dss;
import X.EE1;
import X.EE4;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.InterfaceC36076EDw;
import android.content.Context;
import com.ss.android.ugc.aweme.compliance.business.serviceimpl.TpcConsentServiceImpl;
import com.ss.android.ugc.aweme.service.newusermode.NewUserModeService;
import java.util.List;
import kotlin.jvm.internal.o;
import yq4.a;

/* loaded from: classes7.dex */
public final class UGFeatureInitTask implements EE1, InterfaceC36076EDw {
    @Override // X.InterfaceC36076EDw
    public final /* synthetic */ String[] deps() {
        return null;
    }

    @Override // X.EEY
    public final String key() {
        return "UGFeatureInitTask";
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
        if (((Boolean) C35274Dss.LJIJJLI.getValue()).booleanValue()) {
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
        return EFK.BACKGROUND;
    }

    @Override // X.EEY
    public final void run(Context context) {
        o.LJIIIZ(context, "context");
        if (!TpcConsentServiceImpl.LJIIZILJ().LJIILLIIL()) {
            a.LJIIL().LIZJ(context);
        }
        NewUserModeService.LIZJ().LIZIZ();
    }
}
