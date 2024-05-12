package com.bytedance.pitaya.feature;

import X.InterfaceC93239aNf;
import com.bytedance.pitaya.jniwrapper.PitayaNativeInstance;
import com.bytedance.pitaya.jniwrapper.ReflectionCall;
import com.bytedance.pitaya.log.PitayaLogger;

/* loaded from: classes30.dex */
public final class Watcher implements InterfaceC93239aNf, ReflectionCall {
    public static final Watcher INSTANCE = new Watcher();

    @Override // X.InterfaceC93239aNf
    public void onAppBackground() {
        try {
            PitayaNativeInstance.nativePostNotification(0);
        } catch (UnsatisfiedLinkError e) {
            PitayaLogger.LJ(e, null, 6);
        }
    }

    @Override // X.InterfaceC93239aNf
    public void onAppForeground() {
        try {
            PitayaNativeInstance.nativePostNotification(1);
        } catch (UnsatisfiedLinkError e) {
            PitayaLogger.LJ(e, null, 6);
        }
    }
}
