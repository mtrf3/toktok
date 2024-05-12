package com.ss.android.ugc.aweme.legoImp.task;

import X.C0RN;
import X.C16880lQ;
import X.EE1;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.InterfaceC65349Pkn;
import Y.IDRunnableS6S0101000;
import android.content.Context;
import android.os.Handler;
import java.util.List;

/* loaded from: classes7.dex */
public class PublicTestSupportTask implements EE1 {

    /* loaded from: classes7.dex */
    public static class GeckoPublishTestData {

        @InterfaceC65349Pkn("publish_support_test")
        public boolean publishTest;
    }

    @Override // X.EEY
    public final String key() {
        return "PublicTestSupportTask";
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
        new Handler(C16880lQ.LLJJJJ()).postDelayed(new IDRunnableS6S0101000(5, this, 10), 1000L);
    }
}
