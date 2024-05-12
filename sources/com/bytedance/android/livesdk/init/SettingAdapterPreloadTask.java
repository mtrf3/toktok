package com.bytedance.android.livesdk.init;

import X.AbstractC31208CMq;
import X.C30922CBq;
import X.InterfaceC30950CCs;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.performance.SettingManagerCustomTypeOptSetting;
import com.google.gson.Gson;
import java.lang.reflect.InvocationTargetException;

@InterfaceC30950CCs
/* loaded from: classes6.dex */
public class SettingAdapterPreloadTask extends AbstractC31208CMq {
    @Override // X.AbstractC31208CMq
    public String getTaskName() {
        return "setting_adapter_preload_task";
    }

    @Override // X.AbstractC31208CMq
    public void run() {
        if (!SettingManagerCustomTypeOptSetting.enableOpt()) {
            return;
        }
        try {
            Class.forName("com.bytedance.android.live.settings.initializer.TypeAdapterFactoryInitializer").getDeclaredMethod("preload", Gson.class).invoke(null, NormalGson.singletonOpt());
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
        }
        C30922CBq.LJFF(SettingsManager.INSTANCE.getModels(), null);
    }
}
