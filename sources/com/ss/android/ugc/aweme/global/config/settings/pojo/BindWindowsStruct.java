package com.ss.android.ugc.aweme.global.config.settings.pojo;

import X.C158056If;
import X.InterfaceC65349Pkn;

/* loaded from: classes5.dex */
public class BindWindowsStruct {

    @InterfaceC65349Pkn("bind_desc")
    public String bindDesc;

    @InterfaceC65349Pkn("bind_title")
    public String bindTitle;

    @InterfaceC65349Pkn("interval")
    public Integer interval;

    @InterfaceC65349Pkn("login_platform")
    public Integer loginPlatform;

    @InterfaceC65349Pkn("open_window")
    public Boolean openWindow;

    @InterfaceC65349Pkn("total_times")
    public Integer totalTimes;

    public String getBindDesc() {
        String str = this.bindDesc;
        if (str != null) {
            return str;
        }
        throw new C158056If();
    }

    public String getBindTitle() {
        String str = this.bindTitle;
        if (str != null) {
            return str;
        }
        throw new C158056If();
    }

    public Integer getInterval() {
        Integer num = this.interval;
        if (num != null) {
            return num;
        }
        throw new C158056If();
    }

    public Integer getLoginPlatform() {
        Integer num = this.loginPlatform;
        if (num != null) {
            return num;
        }
        throw new C158056If();
    }

    public Boolean getOpenWindow() {
        Boolean bool = this.openWindow;
        if (bool != null) {
            return bool;
        }
        throw new C158056If();
    }

    public Integer getTotalTimes() {
        Integer num = this.totalTimes;
        if (num != null) {
            return num;
        }
        throw new C158056If();
    }
}
