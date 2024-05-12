package com.ss.android.ugc.aweme.legoImp.task;

import X.C05060Hu;
import X.C09580Ze;
import X.C0RN;
import X.C2NW;
import X.EE1;
import X.EE4;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.InterfaceC09240Xw;
import X.InterfaceC36076EDw;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;
import java.util.List;

/* loaded from: classes2.dex */
public final class DeviceInfoUpdateTask implements EE1, InterfaceC36076EDw {
    public static final DeviceInfoUpdateTask LJLIL = new DeviceInfoUpdateTask();

    @Override // X.InterfaceC36076EDw
    public final /* synthetic */ String[] deps() {
        return null;
    }

    @Override // X.EEY
    public final String key() {
        return "DeviceInfoUpdateTask";
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
        return EFK.BOOT_FINISH;
    }

    @Override // X.EEY
    public final void run(Context context) {
        InterfaceC09240Xw LIZIZ = C09580Ze.LIZJ().LIZIZ(C2NW.LIZ().getAppId());
        Bundle bundle = new Bundle();
        C05060Hu c05060Hu = C05060Hu.LIZJ;
        LIZIZ.LJIILIIL(new C05060Hu[]{c05060Hu}, bundle);
        Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).storeFloat("lowend_device_key", bundle.getFloat(c05060Hu.LIZ));
    }
}
