package com.ss.android.ugc.aweme.request_combine.task;

import X.C0RN;
import X.C36093EEn;
import X.C64920Pds;
import X.EE1;
import X.EE4;
import X.EFK;
import X.EHL;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.InterfaceC36076EDw;
import android.content.Context;
import com.ss.android.ugc.aweme.settingsrequest.SettingsRequestServiceImpl;
import java.util.List;

/* loaded from: classes7.dex */
public final class FetchABCommonTask implements EE1, InterfaceC36076EDw {
    @Override // X.InterfaceC36076EDw
    public final /* synthetic */ String[] deps() {
        return null;
    }

    @Override // X.EEY
    public final String key() {
        return "FetchABCommonTask";
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

    @Override // X.EEY
    public final EnumC36092EEm scenesType() {
        return EnumC36092EEm.DEFAULT;
    }

    @Override // X.InterfaceC36076EDw
    public final EE4 threadType() {
        return EE4.CPU;
    }

    @Override // X.EE1
    public final EFK type() {
        return EFK.BACKGROUND;
    }

    @Override // X.EEY
    public final void run(Context context) {
        if (C64920Pds.LIZLLL(context)) {
            C36093EEn.LIZ.getClass();
            EHL ehl = new EHL();
            ehl.LIZLLL(SettingsRequestServiceImpl.LJIILLIIL().LJIILL());
            ehl.LIZJ();
        }
    }
}