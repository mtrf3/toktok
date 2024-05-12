package com.ss.android.ugc.aweme.global.config.settings.pojo;

import X.C158056If;
import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes11.dex */
public class AdLandingPageConfig {

    @InterfaceC65349Pkn("ad_landing_page_auto_jump_control_enabled")
    public Boolean adLandingPageAutoJumpControlEnabled;

    @InterfaceC65349Pkn("ad_landing_page_click_jump_control_enabled")
    public Boolean adLandingPageClickJumpControlEnabled;

    @InterfaceC65349Pkn("ad_landing_page_click_jump_interval")
    public Integer adLandingPageClickJumpInterval;

    @InterfaceC65349Pkn("ad_landing_page_click_jump_interval_tips")
    public String adLandingPageClickJumpIntervalTips;

    @InterfaceC65349Pkn("ad_landing_page_preload_cache_count")
    public Integer adLandingPagePreloadCacheCount;

    @InterfaceC65349Pkn("ad_landing_page_preload_enabled")
    public Boolean adLandingPagePreloadEnabled;

    @InterfaceC65349Pkn("ad_landing_page_report_limit_times")
    public Integer adLandingPageReportLimitTimes;

    @InterfaceC65349Pkn("ad_landing_page_report_packet_key")
    public String adLandingPageReportPacketKey;

    @InterfaceC65349Pkn("ad_landing_page_report_page_count")
    public Integer adLandingPageReportPageCount;

    @InterfaceC65349Pkn("ad_landing_page_report_url")
    public String adLandingPageReportUrl;

    @InterfaceC65349Pkn("ad_landing_page_report_wifi_only_enable")
    public Boolean adLandingPageReportWifiOnlyEnable;

    @InterfaceC65349Pkn("ad_lynx_page_preload_cache_count")
    public Integer adLynxPagePreloadCacheCount;

    @InterfaceC65349Pkn("ad_splash_page_preload_cache_count")
    public Integer adSplashPagePreloadCacheCount;

    @InterfaceC65349Pkn("analytics")
    public String analytics;

    @InterfaceC65349Pkn("enable_dynamic_navbar")
    public Boolean enableDynamicNavbar;

    @InterfaceC65349Pkn("ad_landing_page_resource_count_blacklist_regex")
    public List<String> parsePathRegex;

    @InterfaceC65349Pkn("premem_analytics")
    public String prememAnalytics;

    @InterfaceC65349Pkn("ad_landing_page_resource_count_blacklist_string")
    public List<String> resourceExcludeUrl;

    @InterfaceC65349Pkn("ad_landing_page_auto_jump_allow_list")
    public List<String> adLandingPageAutoJumpAllowList = new ArrayList();

    @InterfaceC65349Pkn("ad_landing_page_auto_jump_intercept_list")
    public List<String> adLandingPageAutoJumpInterceptList = new ArrayList();

    @InterfaceC65349Pkn("ad_landing_page_pause_list")
    public List<String> adLandingPagePauseList = new ArrayList();

    @InterfaceC65349Pkn("ad_landing_page_preload_common_channel")
    public List<String> adLandingPagePreloadCommonChannel = new ArrayList();

    @InterfaceC65349Pkn("ad_landing_page_preload_common_prefix")
    public List<String> adLandingPagePreloadCommonPrefix = new ArrayList();

    @InterfaceC65349Pkn("ad_card_preload_common_channel")
    public List<String> adCardPreloadCommonChannel = new ArrayList();

    @InterfaceC65349Pkn("ad_card_preload_common_prefix")
    public List<String> adCardPreloadCommonPrefix = new ArrayList();

    @InterfaceC65349Pkn("allow_jump_list")
    public List<String> allowJumpList = new ArrayList();

    @InterfaceC65349Pkn("allow_jump_control_enable")
    public Boolean allowJumpControlEnable = Boolean.FALSE;

    @InterfaceC65349Pkn("ad_landing_page_report_delay")
    public int adLandingPageReportDelay = LiveNetAdaptiveHurryTimeSetting.DEFAULT;

    @InterfaceC65349Pkn("enable_referer")
    public Boolean enableReferer = Boolean.TRUE;

    @InterfaceC65349Pkn("modify_xrw")
    public boolean modifyXrw = true;

    @InterfaceC65349Pkn("premem_cache_max_age_in_days")
    public int prememCacheMaxAgeInDays = 1;

    @InterfaceC65349Pkn("premem_cache_js_enable")
    public boolean prememCacheJsEnable = false;

    @InterfaceC65349Pkn("ad_hybrid_monitor_sample_rate")
    public int hybridMonitorSampleRate = 3;

    @InterfaceC65349Pkn("ad_hybrid_monitor_res_perf_enable")
    public boolean hybridMonitorResPerfEnable = false;

    public int getPrememCacheMaxAgeInDays() {
        return Math.max(0, this.prememCacheMaxAgeInDays);
    }

    public Boolean getAdLandingPageAutoJumpControlEnabled() {
        Boolean bool = this.adLandingPageAutoJumpControlEnabled;
        if (bool != null) {
            return bool;
        }
        throw new C158056If();
    }

    public Boolean getAdLandingPageClickJumpControlEnabled() {
        Boolean bool = this.adLandingPageClickJumpControlEnabled;
        if (bool != null) {
            return bool;
        }
        throw new C158056If();
    }

    public Integer getAdLandingPageClickJumpInterval() {
        Integer num = this.adLandingPageClickJumpInterval;
        if (num != null) {
            return num;
        }
        throw new C158056If();
    }

    public String getAdLandingPageClickJumpIntervalTips() {
        String str = this.adLandingPageClickJumpIntervalTips;
        if (str != null) {
            return str;
        }
        throw new C158056If();
    }

    public Integer getAdLandingPagePreloadCacheCount() {
        Integer num = this.adLandingPagePreloadCacheCount;
        if (num != null) {
            return num;
        }
        throw new C158056If();
    }

    public Boolean getAdLandingPagePreloadEnabled() {
        Boolean bool = this.adLandingPagePreloadEnabled;
        if (bool != null) {
            return bool;
        }
        throw new C158056If();
    }

    public Integer getAdLandingPageReportLimitTimes() {
        Integer num = this.adLandingPageReportLimitTimes;
        if (num != null) {
            return num;
        }
        throw new C158056If();
    }

    public String getAdLandingPageReportPacketKey() {
        String str = this.adLandingPageReportPacketKey;
        if (str != null) {
            return str;
        }
        throw new C158056If();
    }

    public Integer getAdLandingPageReportPageCount() {
        Integer num = this.adLandingPageReportPageCount;
        if (num != null) {
            return num;
        }
        throw new C158056If();
    }

    public String getAdLandingPageReportUrl() {
        String str = this.adLandingPageReportUrl;
        if (str != null) {
            return str;
        }
        throw new C158056If();
    }

    public Boolean getAdLandingPageReportWifiOnlyEnable() {
        Boolean bool = this.adLandingPageReportWifiOnlyEnable;
        if (bool != null) {
            return bool;
        }
        throw new C158056If();
    }

    public Integer getAdLynxPagePreloadCacheCount() {
        Integer num = this.adLynxPagePreloadCacheCount;
        if (num != null) {
            return num;
        }
        throw new C158056If();
    }

    public Integer getAdSplashPagePreloadCacheCount() {
        Integer num = this.adSplashPagePreloadCacheCount;
        if (num != null) {
            return num;
        }
        throw new C158056If();
    }

    public String getAnalytics() {
        String str = this.analytics;
        if (str != null) {
            return str;
        }
        throw new C158056If();
    }

    public Boolean getEnableDynamicNavbar() {
        Boolean bool = this.enableDynamicNavbar;
        if (bool != null) {
            return bool;
        }
        throw new C158056If();
    }

    public List<String> getAdCardPreloadCommonChannel() {
        return this.adCardPreloadCommonChannel;
    }

    public List<String> getAdCardPreloadCommonPrefix() {
        return this.adCardPreloadCommonPrefix;
    }

    public List<String> getAdLandingPageAutoJumpAllowList() {
        return this.adLandingPageAutoJumpAllowList;
    }

    public List<String> getAdLandingPageAutoJumpInterceptList() {
        return this.adLandingPageAutoJumpInterceptList;
    }

    public List<String> getAdLandingPagePauseList() {
        return this.adLandingPagePauseList;
    }

    public List<String> getAdLandingPagePreloadCommonChannel() {
        return this.adLandingPagePreloadCommonChannel;
    }

    public List<String> getAdLandingPagePreloadCommonPrefix() {
        return this.adLandingPagePreloadCommonPrefix;
    }

    public int getAdLandingPageReportDelay() {
        return this.adLandingPageReportDelay;
    }

    public Boolean getAllowJumpControlEnable() {
        return this.allowJumpControlEnable;
    }

    public List<String> getAllowJumpList() {
        return this.allowJumpList;
    }

    public Boolean getEnableReferer() {
        return this.enableReferer;
    }

    public int getHybridMonitorSampleRate() {
        return this.hybridMonitorSampleRate;
    }

    public List<String> getParsePathRegex() {
        return this.parsePathRegex;
    }

    public String getPrememAnalytics() {
        return this.prememAnalytics;
    }

    public List<String> getResourceExcludeUrl() {
        return this.resourceExcludeUrl;
    }

    public boolean isHybridMonitorResPerfEnable() {
        return this.hybridMonitorResPerfEnable;
    }

    public boolean isModifyXrw() {
        return this.modifyXrw;
    }

    public boolean isPrememCacheJsEnable() {
        return this.prememCacheJsEnable;
    }
}
