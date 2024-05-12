package com.ss.android.ugc.aweme.legoImp.task;

import X.C0RN;
import X.C58096Mr6;
import X.EE1;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import android.content.Context;
import com.ss.android.ugc.aweme.share.ShareSdkService;
import com.ss.android.ugc.sdk.ShareSdkServiceImpl;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class InitShareSdkTask implements EE1 {
    @Override // X.EEY
    public final String key() {
        return "InitShareSdkTask";
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
        ShareSdkService shareSdkService;
        ShareSdkService.LIZ.getClass();
        Object LIZ = C58096Mr6.LIZ(ShareSdkService.class, false);
        if (LIZ != null) {
            shareSdkService = (ShareSdkService) LIZ;
        } else {
            if (C58096Mr6.L8 == null) {
                synchronized (ShareSdkService.class) {
                    if (C58096Mr6.L8 == null) {
                        C58096Mr6.L8 = new ShareSdkServiceImpl();
                    }
                }
            }
            shareSdkService = C58096Mr6.L8;
        }
        o.LJIIIIZZ(shareSdkService, "get().getService(ShareSdkService::class.java)");
        shareSdkService.LIZ();
    }
}
