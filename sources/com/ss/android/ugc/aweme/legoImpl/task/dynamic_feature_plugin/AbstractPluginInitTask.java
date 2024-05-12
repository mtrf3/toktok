package com.ss.android.ugc.aweme.legoImpl.task.dynamic_feature_plugin;

import X.C0RN;
import X.E5I;
import X.E6U;
import X.E6V;
import X.EE1;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import android.text.TextUtils;
import com.ss.android.deviceregister.DeviceRegisterManager;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.plugin.IPluginService;
import com.ss.android.ugc.aweme.plugin.PluginService;
import defpackage.t1;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public abstract class AbstractPluginInitTask implements EE1 {
    public static final AtomicBoolean LJLILLLLZI = new AtomicBoolean(false);
    public boolean LJLIL;

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
    public final /* synthetic */ List triggerOtherLegoComponents() {
        return null;
    }

    @Override // X.EEY
    public final /* synthetic */ EnumC36103EEx triggerType() {
        return C0RN.LIZIZ(this);
    }

    @Override // X.EEY
    public EnumC36092EEm scenesType() {
        return EnumC36092EEm.DEFAULT;
    }

    public final void LIZLLL(boolean z) {
        this.LJLIL = z;
        if (!TextUtils.isEmpty(DeviceRegisterManager.com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId())) {
            IPluginService createIPluginServicebyMonsterPlugin = PluginService.createIPluginServicebyMonsterPlugin(false);
            o.LJIIIIZZ(createIPluginServicebyMonsterPlugin, "get().getService(IPluginService::class.java)");
            E5I.LIZ(createIPluginServicebyMonsterPlugin, Boolean.FALSE, this.LJLIL, 101, 7);
        } else {
            DeviceRegisterManager.addOnDeviceConfigUpdateListener(new E6V(this));
        }
        AccountService.LJIJ().LJIILJJIL(E6U.LJLIL);
        PluginService.createIPluginServicebyMonsterPlugin(false).initRealtimeFeedbackInterceptor();
    }

    public final void LJ(boolean z) {
        if (z && LJLILLLLZI.compareAndSet(false, true) && !t1.LJI()) {
            IPluginService createIPluginServicebyMonsterPlugin = PluginService.createIPluginServicebyMonsterPlugin(false);
            o.LJIIIIZZ(createIPluginServicebyMonsterPlugin, "get().getService(IPluginService::class.java)");
            E5I.LIZ(createIPluginServicebyMonsterPlugin, Boolean.FALSE, this.LJLIL, 101, 7);
        }
    }
}
