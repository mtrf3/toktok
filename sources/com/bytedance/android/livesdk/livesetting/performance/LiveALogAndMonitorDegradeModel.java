package com.bytedance.android.livesdk.livesetting.performance;

import X.InterfaceC65349Pkn;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class LiveALogAndMonitorDegradeModel {

    @InterfaceC65349Pkn("live_alog_degrade_allowlist")
    public List<String> aLogList;

    @InterfaceC65349Pkn("live_monitor_degrade_allowlist")
    public List<String> monitorList;

    /* JADX WARN: Multi-variable type inference failed */
    public LiveALogAndMonitorDegradeModel() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public LiveALogAndMonitorDegradeModel(List<String> aLogList, List<String> monitorList) {
        o.LJIIIZ(aLogList, "aLogList");
        o.LJIIIZ(monitorList, "monitorList");
        this.aLogList = aLogList;
        this.monitorList = monitorList;
    }

    public /* synthetic */ LiveALogAndMonitorDegradeModel(List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new ArrayList() : list, (i & 2) != 0 ? new ArrayList() : list2);
    }
}
