package com.ss.android.storageInit;

import X.C0RN;
import X.C59162NJu;
import X.C66592QBo;
import X.C66593QBp;
import X.C66594QBq;
import X.EE1;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.InterfaceC37286EkE;
import X.P8H;
import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class StorageModuleInitTask implements EE1 {
    public C59162NJu LJLIL;
    public C66593QBp LJLILLLLZI;
    public C66592QBo LJLJI;
    public final ArrayList<InterfaceC37286EkE> LJLJJI = new ArrayList<>();

    @Override // X.EEY
    public final String key() {
        return "StorageModuleInitTask";
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

    @Override // X.EE1
    public final EFK type() {
        return EFK.BOOT_FINISH;
    }

    @Override // X.EEY
    public final void run(Context context) {
        o.LJIIIZ(context, "context");
        P8H.LIZJ = new C66594QBq(this);
    }
}
