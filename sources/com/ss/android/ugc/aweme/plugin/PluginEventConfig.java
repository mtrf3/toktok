package com.ss.android.ugc.aweme.plugin;

import X.InterfaceC65349Pkn;
import X.JBR;
import X.X1D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class PluginEventConfig {

    @InterfaceC65349Pkn("enabled")
    public final boolean enabled;

    @InterfaceC65349Pkn("max_queue_size")
    public final int maxQueueSize;

    @InterfaceC65349Pkn("missed_et_track_window")
    public final Long missedEtTrackingWindowMs;

    public static /* synthetic */ PluginEventConfig copy$default(PluginEventConfig pluginEventConfig, boolean z, int i, Long l, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = pluginEventConfig.enabled;
        }
        if ((i2 & 2) != 0) {
            i = pluginEventConfig.maxQueueSize;
        }
        if ((i2 & 4) != 0) {
            l = pluginEventConfig.missedEtTrackingWindowMs;
        }
        return pluginEventConfig.copy(z, i, l);
    }

    public final PluginEventConfig copy(boolean z, int i, Long l) {
        return new PluginEventConfig(z, i, l);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PluginEventConfig)) {
            return false;
        }
        PluginEventConfig pluginEventConfig = (PluginEventConfig) obj;
        return this.enabled == pluginEventConfig.enabled && this.maxQueueSize == pluginEventConfig.maxQueueSize && o.LJ(this.missedEtTrackingWindowMs, pluginEventConfig.missedEtTrackingWindowMs);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    public int hashCode() {
        boolean z = this.enabled;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = ((r0 * 31) + this.maxQueueSize) * 31;
        Long l = this.missedEtTrackingWindowMs;
        return i + (l == null ? 0 : l.hashCode());
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PluginEventConfig(enabled=");
        LIZ.append(this.enabled);
        LIZ.append(", maxQueueSize=");
        LIZ.append(this.maxQueueSize);
        LIZ.append(", missedEtTrackingWindowMs=");
        return JBR.LJ(LIZ, this.missedEtTrackingWindowMs, ')', LIZ);
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final int getMaxQueueSize() {
        return this.maxQueueSize;
    }

    public final Long getMissedEtTrackingWindowMs() {
        return this.missedEtTrackingWindowMs;
    }

    public PluginEventConfig(boolean z, int i, Long l) {
        this.enabled = z;
        this.maxQueueSize = i;
        this.missedEtTrackingWindowMs = l;
    }

    public /* synthetic */ PluginEventConfig(boolean z, int i, Long l, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, i, (i2 & 4) != 0 ? null : l);
    }
}
