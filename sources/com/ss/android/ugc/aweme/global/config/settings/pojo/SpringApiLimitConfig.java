package com.ss.android.ugc.aweme.global.config.settings.pojo;

import X.C158056If;
import X.InterfaceC65349Pkn;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes14.dex */
public class SpringApiLimitConfig {

    @InterfaceC65349Pkn("batch_event_interval")
    public Long batchEventInterval;

    @InterfaceC65349Pkn("config_list")
    public List<ApiConfigEntity> configList = new ArrayList();

    @InterfaceC65349Pkn("disable_fetch_setting")
    public Boolean disableFetchSetting;

    @InterfaceC65349Pkn("enable_delay_applog")
    public Boolean enableDelayApplog;

    @InterfaceC65349Pkn("end_time")
    public Long endTime;

    @InterfaceC65349Pkn("limit_end_time")
    public Long limitEndTime;

    @InterfaceC65349Pkn("limit_start_time")
    public Long limitStartTime;

    @InterfaceC65349Pkn("send_launch_timely")
    public Integer sendLaunchTimely;

    @InterfaceC65349Pkn("start_time")
    public Long startTime;

    public Long getBatchEventInterval() {
        Long l = this.batchEventInterval;
        if (l != null) {
            return l;
        }
        throw new C158056If();
    }

    public Boolean getDisableFetchSetting() {
        Boolean bool = this.disableFetchSetting;
        if (bool != null) {
            return bool;
        }
        throw new C158056If();
    }

    public Boolean getEnableDelayApplog() {
        Boolean bool = this.enableDelayApplog;
        if (bool != null) {
            return bool;
        }
        throw new C158056If();
    }

    public Long getEndTime() {
        Long l = this.endTime;
        if (l != null) {
            return l;
        }
        throw new C158056If();
    }

    public Long getLimitEndTime() {
        Long l = this.limitEndTime;
        if (l != null) {
            return l;
        }
        throw new C158056If();
    }

    public Long getLimitStartTime() {
        Long l = this.limitStartTime;
        if (l != null) {
            return l;
        }
        throw new C158056If();
    }

    public Integer getSendLaunchTimely() {
        Integer num = this.sendLaunchTimely;
        if (num != null) {
            return num;
        }
        throw new C158056If();
    }

    public Long getStartTime() {
        Long l = this.startTime;
        if (l != null) {
            return l;
        }
        throw new C158056If();
    }

    public List<ApiConfigEntity> getConfigList() {
        return this.configList;
    }
}
