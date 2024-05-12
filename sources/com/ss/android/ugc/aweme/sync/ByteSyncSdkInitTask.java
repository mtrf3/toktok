package com.ss.android.ugc.aweme.sync;

import X.C0RN;
import X.C67035QSp;
import X.EE1;
import X.EE4;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.InterfaceC36076EDw;
import android.content.Context;
import com.ss.android.common.applog.AppLog;
import com.ss.android.deviceregister.DeviceRegisterManager;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class ByteSyncSdkInitTask implements EE1, InterfaceC36076EDw {
    @Override // X.InterfaceC36076EDw
    public final /* synthetic */ String[] deps() {
        return null;
    }

    @Override // X.EEY
    public final String key() {
        return "ByteSyncSdkInitTask";
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
        return EFK.BOOT_FINISH;
    }

    @Override // X.EEY
    public final void run(Context context) {
        if (!o.LJ(C67035QSp.LIZIZ().enable, Boolean.TRUE) || !C67035QSp.LIZIZ.compareAndSet(false, true)) {
            return;
        }
        String serverDeviceId = AppLog.getServerDeviceId();
        String str = "";
        if (serverDeviceId == null) {
            serverDeviceId = "";
        }
        String installId = AppLog.getInstallId();
        if (installId != null) {
            str = installId;
        }
        if (serverDeviceId.length() == 0 || str.length() == 0) {
            DeviceRegisterManager.addOnDeviceConfigUpdateListener(C67035QSp.LJII);
        } else {
            C67035QSp.LIZLLL(serverDeviceId, str);
        }
    }
}
