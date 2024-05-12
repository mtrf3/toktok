package com.bytedance.android.livesdk.init;

import X.AbstractC31208CMq;
import X.CN1;
import X.CN2;
import X.InterfaceC30950CCs;
import com.bytedance.android.livesdk.livesetting.performance.LiveServiceManagerOptSetting;
import java.lang.reflect.InvocationTargetException;

@InterfaceC30950CCs
/* loaded from: classes6.dex */
public class ServicePreloadTask extends AbstractC31208CMq {
    @Override // X.AbstractC31208CMq
    public String getTaskName() {
        return "service_preload_task";
    }

    @Override // X.AbstractC31208CMq
    public void run() {
        if (!LiveServiceManagerOptSetting.enable()) {
            return;
        }
        try {
            Class<?> cls = Class.forName("com.bytedance.android.live.service.initializer.ServiceInitializerV2");
            cls.getDeclaredMethod("preloadServiceClasses", new Class[0]).invoke(null, new Object[0]);
            Object newInstance = cls.getConstructor(new Class[0]).newInstance(new Object[0]);
            if (newInstance instanceof CN2) {
                CN1.LIZIZ = (CN2) newInstance;
            }
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException unused) {
        }
    }
}
