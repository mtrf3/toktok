package com.bytedance.pia.core.spi;

import X.C37238EjS;
import com.bytedance.pia.core.spi.api.IPiaConfigTask;
import com.ss.android.ugc.aweme.hybridkit.task.PiaConfigTask;

/* loaded from: classes7.dex */
public class ConfigTask implements IPiaConfigTask {
    @Override // java.lang.Runnable
    public void run() {
    }

    public static IPiaConfigTask get() {
        try {
            return PiaConfigTask.LIZ();
        } catch (Throwable unused) {
            C37238EjS.LJI(6, "[SPI] try get config task failed, fallback to default.", null);
            return new ConfigTask();
        }
    }
}
