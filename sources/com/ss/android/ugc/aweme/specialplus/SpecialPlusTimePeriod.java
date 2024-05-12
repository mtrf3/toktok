package com.ss.android.ugc.aweme.specialplus;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class SpecialPlusTimePeriod {

    @InterfaceC65349Pkn("start_time")
    public String start = "";

    @InterfaceC65349Pkn("end_time")
    public String end = "";

    public final String getEnd() {
        return this.end;
    }

    public final String getStart() {
        return this.start;
    }

    public final void setEnd(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.end = str;
    }

    public final void setStart(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.start = str;
    }
}
