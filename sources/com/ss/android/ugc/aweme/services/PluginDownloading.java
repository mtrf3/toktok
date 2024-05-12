package com.ss.android.ugc.aweme.services;

import X.C78966Uyw;
import java.util.Objects;

/* loaded from: classes5.dex */
public final class PluginDownloading extends PluginState {
    public final long currentDownload;
    public final long total;

    public static /* synthetic */ PluginDownloading copy$default(PluginDownloading pluginDownloading, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = pluginDownloading.currentDownload;
        }
        if ((i & 2) != 0) {
            j2 = pluginDownloading.total;
        }
        return pluginDownloading.copy(j, j2);
    }

    private Object[] getObjects() {
        return new Object[]{Long.valueOf(this.currentDownload), Long.valueOf(this.total)};
    }

    public final PluginDownloading copy(long j, long j2) {
        return new PluginDownloading(j, j2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PluginDownloading) {
            return C78966Uyw.LJIIIZ(((PluginDownloading) obj).getObjects(), getObjects());
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(getObjects());
    }

    public String toString() {
        return C78966Uyw.LJJJLL("PluginDownloading:%s,%s", getObjects());
    }

    public final long getCurrentDownload() {
        return this.currentDownload;
    }

    public final long getTotal() {
        return this.total;
    }

    public PluginDownloading(long j, long j2) {
        this.currentDownload = j;
        this.total = j2;
    }
}
