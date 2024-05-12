package com.ss.android.ugc.aweme.global.config.settings.pojo;

import X.C158056If;
import X.InterfaceC65349Pkn;

/* loaded from: classes4.dex */
public class HotSearchDisplay {

    @InterfaceC65349Pkn("most_display_times")
    public Integer mostDisplayTimes;

    @InterfaceC65349Pkn("one_display_intervals")
    public Long oneDisplayIntervals;

    @InterfaceC65349Pkn("op_most_display_times")
    public Integer opMostDisplayTimes;

    @InterfaceC65349Pkn("op_one_display_intervals")
    public Long opOneDisplayIntervals;

    public Integer getMostDisplayTimes() {
        Integer num = this.mostDisplayTimes;
        if (num != null) {
            return num;
        }
        throw new C158056If();
    }

    public Long getOneDisplayIntervals() {
        Long l = this.oneDisplayIntervals;
        if (l != null) {
            return l;
        }
        throw new C158056If();
    }

    public Integer getOpMostDisplayTimes() {
        Integer num = this.opMostDisplayTimes;
        if (num != null) {
            return num;
        }
        throw new C158056If();
    }

    public Long getOpOneDisplayIntervals() {
        Long l = this.opOneDisplayIntervals;
        if (l != null) {
            return l;
        }
        throw new C158056If();
    }
}
