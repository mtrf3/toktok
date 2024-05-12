package com.ss.android.ugc.aweme.profile.model;

import X.InterfaceC65349Pkn;
import java.io.Serializable;

/* loaded from: classes7.dex */
public class UserRateRemindInfo implements Serializable {

    @InterfaceC65349Pkn("detail_link")
    public String detailLink;

    @InterfaceC65349Pkn("rate_record_id")
    public long rateRecordId;

    @InterfaceC65349Pkn("remind_text")
    public String remindText;

    @InterfaceC65349Pkn("show_day_limit")
    public int showDayLimit;

    @InterfaceC65349Pkn("show_detail_count_limit")
    public int showDetailCountLimit;

    public String getDetailLink() {
        return this.detailLink;
    }

    public long getRateRecordId() {
        return this.rateRecordId;
    }

    public String getRemindText() {
        return this.remindText;
    }

    public int getShowDayLimit() {
        return this.showDayLimit;
    }

    public int getShowDetailCountLimit() {
        return this.showDetailCountLimit;
    }

    public void setDetailLink(String str) {
        this.detailLink = str;
    }

    public void setRateRecordId(long j) {
        this.rateRecordId = j;
    }

    public void setRemindText(String str) {
        this.remindText = str;
    }

    public void setShowDayLimit(int i) {
        this.showDayLimit = i;
    }

    public void setShowDetailCountLimit(int i) {
        this.showDetailCountLimit = i;
    }
}
