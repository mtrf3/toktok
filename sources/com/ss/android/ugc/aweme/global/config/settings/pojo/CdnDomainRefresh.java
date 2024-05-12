package com.ss.android.ugc.aweme.global.config.settings.pojo;

import X.C158056If;
import X.InterfaceC65349Pkn;

/* loaded from: classes3.dex */
public class CdnDomainRefresh {

    @InterfaceC65349Pkn("keepalive_timeout")
    public Integer keepaliveTimeout;

    @InterfaceC65349Pkn("refresh_interval")
    public Integer refreshInterval;

    @InterfaceC65349Pkn("refresh_switch")
    public Boolean refreshSwitch;

    public Integer getKeepaliveTimeout() {
        Integer num = this.keepaliveTimeout;
        if (num != null) {
            return num;
        }
        throw new C158056If();
    }

    public Integer getRefreshInterval() {
        Integer num = this.refreshInterval;
        if (num != null) {
            return num;
        }
        throw new C158056If();
    }

    public Boolean getRefreshSwitch() {
        Boolean bool = this.refreshSwitch;
        if (bool != null) {
            return bool;
        }
        throw new C158056If();
    }
}
