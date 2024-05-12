package com.ss.android.ugc.aweme.legoImp.task;

import X.C0RN;
import X.C35274Dss;
import X.C36243EKh;
import X.EE1;
import X.EE4;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.FLK;
import X.InterfaceC36076EDw;
import android.content.Context;
import android.text.TextUtils;
import com.ss.android.deviceregister.DeviceRegisterManager;
import java.util.List;
import yq4.a;

/* loaded from: classes7.dex */
public final class FetchUltimateComplianceSettingsTask implements EE1, InterfaceC36076EDw {
    public static Context LJLIL;
    public static final C36243EKh LJLILLLLZI = new C36243EKh();

    @Override // X.InterfaceC36076EDw
    public final /* synthetic */ String[] deps() {
        return null;
    }

    @Override // X.EEY
    public final String key() {
        return "FetchUltimateComplianceSettingsTask";
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
        if (((Boolean) C35274Dss.LJIL.getValue()).booleanValue()) {
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
        LJLIL = context;
        if (TextUtils.isEmpty(DeviceRegisterManager.com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId())) {
            DeviceRegisterManager.addOnDeviceConfigUpdateListener(LJLILLLLZI);
        } else {
            a.LJIIZILJ().LJIIJ(new FLK());
        }
    }
}
