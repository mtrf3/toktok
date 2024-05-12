package com.ss.android.ugc.aweme.legoImp.task.pumbaa.settings;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes9.dex */
public final class PLNetMonitorConfig extends F9E {

    @InterfaceC65349Pkn("activity_trace_length")
    public final int activityTraceLength;

    @InterfaceC65349Pkn("enable")
    public final boolean enable;

    @InterfaceC65349Pkn("fragment_trace_length")
    public final int fragmentTraceLength;

    /* JADX WARN: Multi-variable type inference failed */
    public PLNetMonitorConfig() {
        this(false, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, null);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.enable), Integer.valueOf(this.activityTraceLength), Integer.valueOf(this.fragmentTraceLength)};
    }

    public PLNetMonitorConfig(boolean z, int i, int i2) {
        this.enable = z;
        this.activityTraceLength = i;
        this.fragmentTraceLength = i2;
    }

    public /* synthetic */ PLNetMonitorConfig(boolean z, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? false : z, (i3 & 2) != 0 ? 3 : i, (i3 & 4) != 0 ? 5 : i2);
    }
}
