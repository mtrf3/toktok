package com.ss.android.ugc.aweme.global.config.settings.pojo;

import X.C158056If;
import X.InterfaceC65349Pkn;

/* loaded from: classes5.dex */
public class ContactUploadUiLimits {

    @InterfaceC65349Pkn("max_close_times")
    public Integer maxCloseTimes;

    @InterfaceC65349Pkn("max_display_times")
    public Integer maxDisplayTimes;

    public Integer getMaxCloseTimes() {
        Integer num = this.maxCloseTimes;
        if (num != null) {
            return num;
        }
        throw new C158056If();
    }

    public Integer getMaxDisplayTimes() {
        Integer num = this.maxDisplayTimes;
        if (num != null) {
            return num;
        }
        throw new C158056If();
    }
}
