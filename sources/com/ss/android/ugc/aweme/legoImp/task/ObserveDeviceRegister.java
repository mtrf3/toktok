package com.ss.android.ugc.aweme.legoImp.task;

import X.C0RN;
import X.C36301EMn;
import X.C56662Kg;
import X.EE1;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import android.content.Context;
import com.ss.android.deviceregister.DeviceRegisterManager;
import java.util.List;

/* loaded from: classes7.dex */
public class ObserveDeviceRegister implements EE1 {
    public static final C36301EMn LJLIL = new C36301EMn();

    public static void LIZLLL() {
        if (!C56662Kg.LIZ().LJIIIIZZ("app_start_to_get_did")) {
            C56662Kg.LIZ().LJFF("app_start_to_get_did", false);
        }
        if (!C56662Kg.LIZ().LJIIIIZZ("cold_boot_first_request_to_get_did")) {
            C56662Kg.LIZ().LJFF("cold_boot_first_request_to_get_did", false);
        }
    }

    @Override // X.EEY
    public final String key() {
        return "ObserveDeviceRegister";
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
        DeviceRegisterManager.addOnDeviceConfigUpdateListener(LJLIL);
    }
}
