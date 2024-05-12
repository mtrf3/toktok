package com.ss.android.ugc.aweme.search.pages.result.easteregg.core.config;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class Settings {

    @InterfaceC65349Pkn("enabled")
    public final Integer enabled;

    @InterfaceC65349Pkn("lynx_channel")
    public final String lynxTemplateChannel;

    @InterfaceC65349Pkn("preload_interval_ms")
    public final Long preloadIntervalMillis;

    @InterfaceC65349Pkn("resource_channel")
    public final String resourceChannel;

    /* JADX WARN: Multi-variable type inference failed */
    public Settings() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Settings)) {
            return false;
        }
        Settings settings = (Settings) obj;
        return o.LJ(this.enabled, settings.enabled) && o.LJ(this.preloadIntervalMillis, settings.preloadIntervalMillis) && o.LJ(this.resourceChannel, settings.resourceChannel) && o.LJ(this.lynxTemplateChannel, settings.lynxTemplateChannel);
    }

    public final int hashCode() {
        Integer num = this.enabled;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Long l = this.preloadIntervalMillis;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.resourceChannel;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.lynxTemplateChannel;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Settings(enabled=");
        LIZ.append(this.enabled);
        LIZ.append(", preloadIntervalMillis=");
        LIZ.append(this.preloadIntervalMillis);
        LIZ.append(", resourceChannel=");
        LIZ.append(this.resourceChannel);
        LIZ.append(", lynxTemplateChannel=");
        return q.LIZIZ(LIZ, this.lynxTemplateChannel, ')', LIZ);
    }

    public Settings(Integer num, Long l, String str, String str2) {
        this.enabled = num;
        this.preloadIntervalMillis = l;
        this.resourceChannel = str;
        this.lynxTemplateChannel = str2;
    }

    public /* synthetic */ Settings(Integer num, Long l, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : l, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2);
    }
}
