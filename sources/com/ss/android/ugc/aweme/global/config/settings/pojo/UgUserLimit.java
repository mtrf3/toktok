package com.ss.android.ugc.aweme.global.config.settings.pojo;

import X.C158056If;
import X.InterfaceC65349Pkn;

/* loaded from: classes7.dex */
public class UgUserLimit {

    @InterfaceC65349Pkn("active_days")
    public Integer activeDays;

    @InterfaceC65349Pkn("show_for_active")
    public Boolean showForActive;

    public Integer getActiveDays() {
        Integer num = this.activeDays;
        if (num != null) {
            return num;
        }
        throw new C158056If();
    }

    public Boolean getShowForActive() {
        Boolean bool = this.showForActive;
        if (bool != null) {
            return bool;
        }
        throw new C158056If();
    }
}
