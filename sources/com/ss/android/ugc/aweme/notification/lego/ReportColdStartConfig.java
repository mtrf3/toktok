package com.ss.android.ugc.aweme.notification.lego;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class ReportColdStartConfig extends F9E {

    @InterfaceC65349Pkn("interval")
    public final long interval;

    @InterfaceC65349Pkn("name")
    public final String name;

    @InterfaceC65349Pkn("version")
    public final long version;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.name, Long.valueOf(this.interval), Long.valueOf(this.version)};
    }

    public ReportColdStartConfig(String name, long j, long j2) {
        o.LJIIIZ(name, "name");
        this.name = name;
        this.interval = j;
        this.version = j2;
    }
}
