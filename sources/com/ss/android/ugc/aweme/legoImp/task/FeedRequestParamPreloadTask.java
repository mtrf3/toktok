package com.ss.android.ugc.aweme.legoImp.task;

import X.C0RN;
import X.C16880lQ;
import X.C35401Duv;
import X.C43286Gyo;
import X.C87093YGb;
import X.EE1;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import android.content.Context;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.deviceregister.DeviceRegisterManager;
import com.ss.android.ugc.aweme.services.MainServiceImpl;
import com.ss.android.ugc.network.observer.bean.DetectorParam;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;
import yq4.a;

/* loaded from: classes7.dex */
public final class FeedRequestParamPreloadTask implements EE1 {
    @Override // X.EEY
    public final String key() {
        return "FeedRequestParamPreloadTask";
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
        return EFK.BACKGROUND;
    }

    @Override // X.EEY
    public final void run(Context context) {
        o.LJIIIZ(context, "context");
        if (((Boolean) C35401Duv.LIZLLL.getValue()).booleanValue()) {
            SettingsManager.LIZLLL().LJIIIIZZ("network_monitor_config", DetectorParam.class, null);
            a.LJIIJ().LJIILIIL();
            DeviceRegisterManager.com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getSSIDs(new LinkedHashMap());
            MainServiceImpl.createIMainServicebyMonsterPlugin(false).isLimitAdTrackingEnabled();
            C16880lQ.LLJJ(context);
            C43286Gyo.LIZ.getClass();
            C87093YGb.LIZ();
        }
    }
}
