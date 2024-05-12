package com.bytedance.lynx.service;

import X.C40033FnR;
import X.C40035FnT;
import X.X1D;
import Y.ARunnableS42S0100000_6;
import com.bytedance.lynx.service.monitor.LynxMonitorService;
import com.bytedance.lynx.service.resource.LynxResourceService;
import com.lynx.tasm.base.LLog;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class LynxServiceInitializer {
    public static final LynxServiceInitializer INSTANCE = new LynxServiceInitializer();
    public static C40033FnR lynxServiceConfig;

    public final void ensureInitialize() {
        LLog.LIZLLL(2, "LynxServiceInitializer", "Ensure initialize.");
        LynxResourceService.INSTANCE.initForest();
    }

    public final C40033FnR getLynxServiceConfig() {
        return lynxServiceConfig;
    }

    public final void initialize(C40033FnR lynxServiceConfig2) {
        o.LJIIJ(lynxServiceConfig2, "lynxServiceConfig");
        LLog.LIZLLL(2, "LynxServiceInitializer", "Will initialize.");
        lynxServiceConfig = lynxServiceConfig2;
        synchronized (C40035FnT.LJIIJ) {
            if (lynxServiceConfig2.LJIIL.length() != 0) {
                AtomicBoolean atomicBoolean = C40035FnT.LIZ;
                if (!atomicBoolean.get()) {
                    atomicBoolean.set(true);
                    new PthreadThread(new ARunnableS42S0100000_6(lynxServiceConfig2, 171), "LynxSettingsDownloader").start();
                }
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Stop initialize, host: ");
            LIZ.append(lynxServiceConfig2.LJIIL);
            LLog.LIZLLL(4, "LynxSettingsDownloader", X1D.LIZIZ(LIZ));
        }
        LynxMonitorService.INSTANCE.initialize(lynxServiceConfig2);
        LynxResourceService.INSTANCE.initialize(lynxServiceConfig2);
    }
}
