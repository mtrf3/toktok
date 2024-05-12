package com.ss.android.ugc.aweme.global.config.settings.pojo;

import X.C158056If;
import X.InterfaceC65349Pkn;

/* loaded from: classes5.dex */
public class UgFrequentLimit {

    @InterfaceC65349Pkn("days_no_show")
    public Integer daysNoShow;

    @InterfaceC65349Pkn("days_window")
    public Integer daysWindow;

    @InterfaceC65349Pkn("max_close")
    public Integer maxClose;

    public Integer getDaysNoShow() {
        Integer num = this.daysNoShow;
        if (num != null) {
            return num;
        }
        throw new C158056If();
    }

    public Integer getDaysWindow() {
        Integer num = this.daysWindow;
        if (num != null) {
            return num;
        }
        throw new C158056If();
    }

    public Integer getMaxClose() {
        Integer num = this.maxClose;
        if (num != null) {
            return num;
        }
        throw new C158056If();
    }
}
