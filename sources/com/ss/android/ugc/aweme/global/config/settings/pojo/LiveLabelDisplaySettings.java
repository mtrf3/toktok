package com.ss.android.ugc.aweme.global.config.settings.pojo;

import X.C158056If;
import X.InterfaceC65349Pkn;

/* loaded from: classes4.dex */
public class LiveLabelDisplaySettings {

    @InterfaceC65349Pkn("display_duration")
    public Long displayDuration;

    @InterfaceC65349Pkn("display_intervals")
    public Long displayIntervals;

    @InterfaceC65349Pkn("most_display_times")
    public Integer mostDisplayTimes;

    public Long getDisplayDuration() {
        Long l = this.displayDuration;
        if (l != null) {
            return l;
        }
        throw new C158056If();
    }

    public Long getDisplayIntervals() {
        Long l = this.displayIntervals;
        if (l != null) {
            return l;
        }
        throw new C158056If();
    }

    public Integer getMostDisplayTimes() {
        Integer num = this.mostDisplayTimes;
        if (num != null) {
            return num;
        }
        throw new C158056If();
    }
}
