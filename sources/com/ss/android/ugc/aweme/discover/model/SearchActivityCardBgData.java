package com.ss.android.ugc.aweme.discover.model;

import X.InterfaceC65349Pkn;
import java.io.Serializable;

/* loaded from: classes9.dex */
public final class SearchActivityCardBgData implements Serializable {

    @InterfaceC65349Pkn("activity_bg_color")
    public String activityBgColor;

    @InterfaceC65349Pkn("activity_bg_range")
    public Integer activityBgRange;

    @InterfaceC65349Pkn("bg_color_mode")
    public Integer bgColorMode;

    public final String getActivityBgColor() {
        return this.activityBgColor;
    }

    public final Integer getActivityBgRange() {
        return this.activityBgRange;
    }

    public final Integer getBgColorMode() {
        return this.bgColorMode;
    }

    public final void setActivityBgColor(String str) {
        this.activityBgColor = str;
    }

    public final void setActivityBgRange(Integer num) {
        this.activityBgRange = num;
    }

    public final void setBgColorMode(Integer num) {
        this.bgColorMode = num;
    }
}
