package com.ss.android.ugc.aweme.actionai.net;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class ServerMonitorInfo extends F9E {

    @InterfaceC65349Pkn("server_duration")
    public final float serverDuration;

    public ServerMonitorInfo() {
        this(0.0f, 1, null);
    }

    public static /* synthetic */ ServerMonitorInfo copy$default(ServerMonitorInfo serverMonitorInfo, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            f = serverMonitorInfo.serverDuration;
        }
        return serverMonitorInfo.copy(f);
    }

    public final ServerMonitorInfo copy(float f) {
        return new ServerMonitorInfo(f);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Float.valueOf(this.serverDuration)};
    }

    public final float getServerDuration() {
        return this.serverDuration;
    }

    public ServerMonitorInfo(float f) {
        this.serverDuration = f;
    }

    public /* synthetic */ ServerMonitorInfo(float f, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0.0f : f);
    }
}
