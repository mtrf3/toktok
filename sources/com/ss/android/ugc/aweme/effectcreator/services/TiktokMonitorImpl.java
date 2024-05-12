package com.ss.android.ugc.aweme.effectcreator.services;

import X.H78;
import X.PJZ;
import com.bytedance.effectcreatormobile.ckeapi.api.monitor.IMonitor;
import kotlin.jvm.internal.o;

/* loaded from: classes34.dex */
public final class TiktokMonitorImpl implements IMonitor {
    @Override // com.bytedance.effectcreatormobile.ckeapi.api.monitor.IMonitor
    public void ensureNotReachHere(Throwable t, String msg) {
        o.LJIIIZ(t, "t");
        o.LJIIIZ(msg, "msg");
        H78.LIZLLL("[CKE]::", t);
        PJZ.LIZIZ(t, msg);
    }
}
