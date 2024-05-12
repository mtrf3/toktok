package com.ss.android.ugc.aweme.global.config.settings.pojo;

import X.C158056If;
import X.InterfaceC65349Pkn;

/* loaded from: classes11.dex */
public class CompleteProfilePolicy {

    @InterfaceC65349Pkn("interval")
    public Integer interval;

    @InterfaceC65349Pkn("times")
    public Integer times;

    public Integer getInterval() {
        Integer num = this.interval;
        if (num != null) {
            return num;
        }
        throw new C158056If();
    }

    public Integer getTimes() {
        Integer num = this.times;
        if (num != null) {
            return num;
        }
        throw new C158056If();
    }
}
