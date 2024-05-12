package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class FrequencyReportEntry extends F9E {

    @InterfaceC65349Pkn("nid")
    public final long nid;

    @InterfaceC65349Pkn("params")
    public final BehaviorParam param;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Long.valueOf(this.nid), this.param};
    }

    public FrequencyReportEntry(long j, BehaviorParam param) {
        o.LJIIIZ(param, "param");
        this.nid = j;
        this.param = param;
    }
}
