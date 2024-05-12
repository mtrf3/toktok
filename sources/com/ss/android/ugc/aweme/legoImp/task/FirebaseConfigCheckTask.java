package com.ss.android.ugc.aweme.legoImp.task;

import X.C0RN;
import X.C221108m2;
import X.C57105Mb7;
import X.C62822Ol8;
import X.C73969T1h;
import X.EE1;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.FGC;
import X.FGD;
import X.FLL;
import X.T16;
import Y.IDxS307S0100000_6;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.keva.Keva;
import com.ss.android.deviceregister.DeviceRegisterManager;
import com.ss.android.ugc.aweme.legoImp.task.api.FirebaseReportApi;
import com.ss.android.ugc.aweme.ug.UgCommonServiceImpl;
import java.util.List;

/* loaded from: classes7.dex */
public final class FirebaseConfigCheckTask implements EE1 {
    public static final /* synthetic */ int LJLILLLLZI = 0;
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(FGC.LJLIL);

    @Override // X.EEY
    public final String key() {
        return "FirebaseConfigCheckTask";
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

    public final void LIZLLL() {
        FirebaseReportApi.LIZ.getUserForceLoginConfig().LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LIZ(new IDxS307S0100000_6(this, 3));
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
        boolean z = ((Keva) this.LJLIL.getValue()).getBoolean("user_in_forced_login", true);
        if (z && C57105Mb7.LJII(Long.valueOf(((Keva) this.LJLIL.getValue()).getLong("last_request_time", 0L))) >= 1) {
            if (TextUtils.isEmpty(DeviceRegisterManager.com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId())) {
                DeviceRegisterManager.addOnDeviceConfigUpdateListener(new FGD(this));
                return;
            } else {
                LIZLLL();
                return;
            }
        }
        UgCommonServiceImpl.LJIJ().LJIIJJI();
        FLL.LIZ(z);
    }
}
