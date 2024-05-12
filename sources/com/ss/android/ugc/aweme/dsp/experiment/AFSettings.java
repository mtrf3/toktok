package com.ss.android.ugc.aweme.dsp.experiment;

import X.InterfaceC65349Pkn;

/* loaded from: classes13.dex */
public final class AFSettings {

    @InterfaceC65349Pkn("enable_probabilistic")
    public final boolean enableProbabilistic;

    @InterfaceC65349Pkn("enable_replace_entry_name")
    public final boolean enableReplaceEntryName = true;

    @InterfaceC65349Pkn("enable_click")
    public final boolean enableClick = true;

    @InterfaceC65349Pkn("enable_show")
    public final boolean enableShow = true;

    @InterfaceC65349Pkn("enable_gaid")
    public final boolean enableGaid = true;

    @InterfaceC65349Pkn("enable_referrer")
    public final boolean enableReferrer = true;

    @InterfaceC65349Pkn("music_dsp_af_report_num")
    public final int afReportNum = 1;

    @InterfaceC65349Pkn("report_delay")
    public final long reportDelay = 3;

    public final int getAfReportNum() {
        return this.afReportNum;
    }

    public final boolean getEnableClick() {
        return this.enableClick;
    }

    public final boolean getEnableGaid() {
        return this.enableGaid;
    }

    public final boolean getEnableProbabilistic() {
        return this.enableProbabilistic;
    }

    public final boolean getEnableReferrer() {
        return this.enableReferrer;
    }

    public final boolean getEnableReplaceEntryName() {
        return this.enableReplaceEntryName;
    }

    public final boolean getEnableShow() {
        return this.enableShow;
    }

    public final long getReportDelay() {
        return this.reportDelay;
    }
}
