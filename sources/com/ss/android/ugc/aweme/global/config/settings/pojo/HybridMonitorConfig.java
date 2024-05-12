package com.ss.android.ugc.aweme.global.config.settings.pojo;

import X.C158056If;
import X.InterfaceC65349Pkn;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes10.dex */
public class HybridMonitorConfig {

    @InterfaceC65349Pkn("h5_static_resource_report_enabled")
    public Boolean h5StaticResourceReportEnabled;

    @InterfaceC65349Pkn("rn_timing_interval")
    public Integer rnTimingInterval;

    @InterfaceC65349Pkn("slardar_sdk_config")
    public String slardarSdkConfig;

    @InterfaceC65349Pkn("perf_monitor_regex_list")
    public List<String> perfMonitorRegexList = new ArrayList();

    @InterfaceC65349Pkn("h5_static_resource_report_allow_list")
    public List<String> h5StaticResourceReportAllowList = new ArrayList();

    @InterfaceC65349Pkn("jsb_host_allow_list")
    public List<String> jsbHostAllowList = new ArrayList();

    @InterfaceC65349Pkn("gecko_channel_monitor_allow_list")
    public List<String> geckoChannelMonitorAllowList = new ArrayList();

    public Boolean getH5StaticResourceReportEnabled() {
        Boolean bool = this.h5StaticResourceReportEnabled;
        if (bool != null) {
            return bool;
        }
        throw new C158056If();
    }

    public Integer getRnTimingInterval() {
        Integer num = this.rnTimingInterval;
        if (num != null) {
            return num;
        }
        throw new C158056If();
    }

    public String getSlardarSdkConfig() {
        String str = this.slardarSdkConfig;
        if (str != null) {
            return str;
        }
        throw new C158056If();
    }

    public List<String> getGeckoChannelMonitorAllowList() {
        return this.geckoChannelMonitorAllowList;
    }

    public List<String> getH5StaticResourceReportAllowList() {
        return this.h5StaticResourceReportAllowList;
    }

    public List<String> getJsbHostAllowList() {
        return this.jsbHostAllowList;
    }

    public List<String> getPerfMonitorRegexList() {
        return this.perfMonitorRegexList;
    }
}
