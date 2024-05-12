package com.bytedance.android.live_settings;

import X.C00F;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class MonitorImpl implements Monitor {
    public final boolean isDebug;

    @Override // com.bytedance.android.live_settings.Monitor
    public void reportSettingReadPerformance(String str, long j, String str2, boolean z) {
    }

    public MonitorImpl(boolean z) {
        this.isDebug = z;
    }

    @Override // com.bytedance.android.live_settings.Monitor
    public void reportException(String scene, String msg) {
        o.LJIIIZ(scene, "scene");
        o.LJIIIZ(msg, "msg");
        if (!this.isDebug) {
        } else {
            throw new Throwable(C00F.LIZIZ(scene, ' ', msg));
        }
    }
}
