package com.ss.android.ugc.aweme.global.config.settings.pojo;

import X.C158056If;
import X.InterfaceC65349Pkn;

/* loaded from: classes14.dex */
public class ApiConfigEntity {

    @InterfaceC65349Pkn("api_name")
    public String apiName;

    @InterfaceC65349Pkn("delay_time")
    public Long delayTime;

    @InterfaceC65349Pkn("is_banned")
    public Boolean isBanned;

    public Long getDelayTime() {
        Long l = this.delayTime;
        if (l != null) {
            return l;
        }
        throw new C158056If();
    }

    public Boolean getIsBanned() {
        Boolean bool = this.isBanned;
        if (bool != null) {
            return bool;
        }
        throw new C158056If();
    }

    public String getApiName() {
        return this.apiName;
    }
}
