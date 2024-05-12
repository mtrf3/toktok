package com.ss.android.ugc.aweme.inbox;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.o;

/* loaded from: classes17.dex */
public final class InboxRefresh {

    @InterfaceC65349Pkn("refresh_by_tab_change")
    public boolean refreshByTabChange = true;

    @InterfaceC65349Pkn("refresh_threshold_by_tab_change")
    public String refreshThresholdByTabChange = "60";

    @InterfaceC65349Pkn("refresh_threshold_by_resume")
    public String refreshThresholdByResume = "60";

    public final boolean getRefreshByTabChange() {
        return this.refreshByTabChange;
    }

    public final String getRefreshThresholdByResume() {
        return this.refreshThresholdByResume;
    }

    public final String getRefreshThresholdByTabChange() {
        return this.refreshThresholdByTabChange;
    }

    public final void setRefreshByTabChange(boolean z) {
        this.refreshByTabChange = z;
    }

    public final void setRefreshThresholdByResume(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.refreshThresholdByResume = str;
    }

    public final void setRefreshThresholdByTabChange(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.refreshThresholdByTabChange = str;
    }
}
