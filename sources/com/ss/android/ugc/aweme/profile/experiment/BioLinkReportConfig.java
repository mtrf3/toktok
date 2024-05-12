package com.ss.android.ugc.aweme.profile.experiment;

import X.InterfaceC65349Pkn;

/* loaded from: classes5.dex */
public final class BioLinkReportConfig {

    @InterfaceC65349Pkn("is_bio_link_report_show")
    public boolean isBioLinkReportShow = true;

    @InterfaceC65349Pkn("show_report_jump_time")
    public int showReportJumpTime;

    public final int getShowReportJumpTime() {
        return this.showReportJumpTime;
    }

    public final boolean isBioLinkReportShow() {
        return this.isBioLinkReportShow;
    }

    public final void setBioLinkReportShow(boolean z) {
        this.isBioLinkReportShow = z;
    }

    public final void setShowReportJumpTime(int i) {
        this.showReportJumpTime = i;
    }
}
