package com.ss.android.ugc.aweme.trace;

import X.InterfaceC65349Pkn;
import X.UC7;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class TraceLogConfig {

    @InterfaceC65349Pkn("api_log_blacklist")
    public final List<String> apiLogBlacklist;

    @InterfaceC65349Pkn("api_log_trace_expire_ts")
    public final Long apiLogTraceExpireTs;

    @InterfaceC65349Pkn("api_log_whitelist")
    public final List<String> apiLogWhitelist;

    @InterfaceC65349Pkn("app_log_to_apm_event")
    public final Boolean appLogToApmEvent;

    @InterfaceC65349Pkn("btm_page_event_auto_trace_whitelist")
    public final List<String> btmPageEventAutoTraceWhitelist;

    @InterfaceC65349Pkn("is_check_and_report_log")
    public final Boolean checkAndReportLog;

    @InterfaceC65349Pkn("global_enable")
    public final Boolean globalEnable;

    @InterfaceC65349Pkn("log_error_report_flag")
    public final Integer logErrorReportFlag;

    @InterfaceC65349Pkn("log_event_blacklist")
    public final List<String> logEventBlacklist;

    @InterfaceC65349Pkn("log_force_trace_enable")
    public final Boolean logForceTraceEnable;

    @InterfaceC65349Pkn("log_max_span_count")
    public final Integer logMaxSpanCount;

    @InterfaceC65349Pkn("log_reset_check_point_ts")
    public final Long logResetCheckPointTs;

    @InterfaceC65349Pkn("log_trace_delay_ts")
    public final Long logTraceDelayTs;

    @InterfaceC65349Pkn("unsampled_max_disk_cache_size")
    public final Integer unsampledMaxDiskCacheSize;

    @InterfaceC65349Pkn("unsampled_max_log_size")
    public final Integer unsampledMaxLogSize;

    @InterfaceC65349Pkn("unsampled_once_span_count")
    public final Integer unsampledOnceSpanCount;

    @InterfaceC65349Pkn("unsampled_per_size")
    public final Integer unsampledPerSize;

    @InterfaceC65349Pkn("unsampled_single_param_max_size")
    public final Integer unsampledSingleParamMaxSize;

    @InterfaceC65349Pkn("unsampled_time_gap")
    public final Long unsampledTimeGap;

    @InterfaceC65349Pkn("unsampled_trace_control_flag")
    public final Integer unsampledTraceControlFlag;

    /* JADX WARN: Multi-variable type inference failed */
    public TraceLogConfig() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 1048575, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TraceLogConfig)) {
            return false;
        }
        TraceLogConfig traceLogConfig = (TraceLogConfig) obj;
        return o.LJ(this.globalEnable, traceLogConfig.globalEnable) && o.LJ(this.logForceTraceEnable, traceLogConfig.logForceTraceEnable) && o.LJ(this.logTraceDelayTs, traceLogConfig.logTraceDelayTs) && o.LJ(this.logEventBlacklist, traceLogConfig.logEventBlacklist) && o.LJ(this.logMaxSpanCount, traceLogConfig.logMaxSpanCount) && o.LJ(this.logResetCheckPointTs, traceLogConfig.logResetCheckPointTs) && o.LJ(this.logErrorReportFlag, traceLogConfig.logErrorReportFlag) && o.LJ(this.apiLogWhitelist, traceLogConfig.apiLogWhitelist) && o.LJ(this.apiLogBlacklist, traceLogConfig.apiLogBlacklist) && o.LJ(this.apiLogTraceExpireTs, traceLogConfig.apiLogTraceExpireTs) && o.LJ(this.appLogToApmEvent, traceLogConfig.appLogToApmEvent) && o.LJ(this.checkAndReportLog, traceLogConfig.checkAndReportLog) && o.LJ(this.btmPageEventAutoTraceWhitelist, traceLogConfig.btmPageEventAutoTraceWhitelist) && o.LJ(this.unsampledTraceControlFlag, traceLogConfig.unsampledTraceControlFlag) && o.LJ(this.unsampledMaxLogSize, traceLogConfig.unsampledMaxLogSize) && o.LJ(this.unsampledPerSize, traceLogConfig.unsampledPerSize) && o.LJ(this.unsampledMaxDiskCacheSize, traceLogConfig.unsampledMaxDiskCacheSize) && o.LJ(this.unsampledOnceSpanCount, traceLogConfig.unsampledOnceSpanCount) && o.LJ(this.unsampledTimeGap, traceLogConfig.unsampledTimeGap) && o.LJ(this.unsampledSingleParamMaxSize, traceLogConfig.unsampledSingleParamMaxSize);
    }

    public final int hashCode() {
        Boolean bool = this.globalEnable;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.logForceTraceEnable;
        int hashCode2 = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Long l = this.logTraceDelayTs;
        int hashCode3 = (hashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        List<String> list = this.logEventBlacklist;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.logMaxSpanCount;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Long l2 = this.logResetCheckPointTs;
        int hashCode6 = (hashCode5 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Integer num2 = this.logErrorReportFlag;
        int hashCode7 = (hashCode6 + (num2 == null ? 0 : num2.hashCode())) * 31;
        List<String> list2 = this.apiLogWhitelist;
        int hashCode8 = (hashCode7 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<String> list3 = this.apiLogBlacklist;
        int hashCode9 = (hashCode8 + (list3 == null ? 0 : list3.hashCode())) * 31;
        Long l3 = this.apiLogTraceExpireTs;
        int hashCode10 = (hashCode9 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Boolean bool3 = this.appLogToApmEvent;
        int hashCode11 = (hashCode10 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.checkAndReportLog;
        int hashCode12 = (hashCode11 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        List<String> list4 = this.btmPageEventAutoTraceWhitelist;
        int hashCode13 = (hashCode12 + (list4 == null ? 0 : list4.hashCode())) * 31;
        Integer num3 = this.unsampledTraceControlFlag;
        int hashCode14 = (hashCode13 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.unsampledMaxLogSize;
        int hashCode15 = (hashCode14 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.unsampledPerSize;
        int hashCode16 = (hashCode15 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.unsampledMaxDiskCacheSize;
        int hashCode17 = (hashCode16 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.unsampledOnceSpanCount;
        int hashCode18 = (hashCode17 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Long l4 = this.unsampledTimeGap;
        int hashCode19 = (hashCode18 + (l4 == null ? 0 : l4.hashCode())) * 31;
        Integer num8 = this.unsampledSingleParamMaxSize;
        return hashCode19 + (num8 != null ? num8.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TraceLogConfig(globalEnable=");
        sb.append(this.globalEnable);
        sb.append(", logForceTraceEnable=");
        sb.append(this.logForceTraceEnable);
        sb.append(", logTraceDelayTs=");
        sb.append(this.logTraceDelayTs);
        sb.append(", logEventBlacklist=");
        sb.append(this.logEventBlacklist);
        sb.append(", logMaxSpanCount=");
        sb.append(this.logMaxSpanCount);
        sb.append(", logResetCheckPointTs=");
        sb.append(this.logResetCheckPointTs);
        sb.append(", logErrorReportFlag=");
        sb.append(this.logErrorReportFlag);
        sb.append(", apiLogWhitelist=");
        sb.append(this.apiLogWhitelist);
        sb.append(", apiLogBlacklist=");
        sb.append(this.apiLogBlacklist);
        sb.append(", apiLogTraceExpireTs=");
        sb.append(this.apiLogTraceExpireTs);
        sb.append(", appLogToApmEvent=");
        sb.append(this.appLogToApmEvent);
        sb.append(", checkAndReportLog=");
        sb.append(this.checkAndReportLog);
        sb.append(", btmPageEventAutoTraceWhitelist=");
        sb.append(this.btmPageEventAutoTraceWhitelist);
        sb.append(", unsampledTraceControlFlag=");
        sb.append(this.unsampledTraceControlFlag);
        sb.append(", unsampledMaxLogSize=");
        sb.append(this.unsampledMaxLogSize);
        sb.append(", unsampledPerSize=");
        sb.append(this.unsampledPerSize);
        sb.append(", unsampledMaxDiskCacheSize=");
        sb.append(this.unsampledMaxDiskCacheSize);
        sb.append(", unsampledOnceSpanCount=");
        sb.append(this.unsampledOnceSpanCount);
        sb.append(", unsampledTimeGap=");
        sb.append(this.unsampledTimeGap);
        sb.append(", unsampledSingleParamMaxSize=");
        return UC7.LIZ(sb, this.unsampledSingleParamMaxSize, ')');
    }

    public TraceLogConfig(Boolean bool, Boolean bool2, Long l, List<String> list, Integer num, Long l2, Integer num2, List<String> list2, List<String> list3, Long l3, Boolean bool3, Boolean bool4, List<String> list4, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Long l4, Integer num8) {
        this.globalEnable = bool;
        this.logForceTraceEnable = bool2;
        this.logTraceDelayTs = l;
        this.logEventBlacklist = list;
        this.logMaxSpanCount = num;
        this.logResetCheckPointTs = l2;
        this.logErrorReportFlag = num2;
        this.apiLogWhitelist = list2;
        this.apiLogBlacklist = list3;
        this.apiLogTraceExpireTs = l3;
        this.appLogToApmEvent = bool3;
        this.checkAndReportLog = bool4;
        this.btmPageEventAutoTraceWhitelist = list4;
        this.unsampledTraceControlFlag = num3;
        this.unsampledMaxLogSize = num4;
        this.unsampledPerSize = num5;
        this.unsampledMaxDiskCacheSize = num6;
        this.unsampledOnceSpanCount = num7;
        this.unsampledTimeGap = l4;
        this.unsampledSingleParamMaxSize = num8;
    }

    public /* synthetic */ TraceLogConfig(Boolean bool, Boolean bool2, Long l, List list, Integer num, Long l2, Integer num2, List list2, List list3, Long l3, Boolean bool3, Boolean bool4, List list4, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Long l4, Integer num8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Boolean.FALSE : bool, (i & 2) != 0 ? Boolean.FALSE : bool2, (i & 4) != 0 ? null : l, (i & 8) != 0 ? null : list, (i & 16) != 0 ? null : num, (i & 32) != 0 ? null : l2, (i & 64) != 0 ? null : num2, (i & 128) != 0 ? null : list2, (i & 256) != 0 ? null : list3, (i & 512) != 0 ? null : l3, (i & 1024) != 0 ? null : bool3, (i & 2048) != 0 ? null : bool4, (i & 4096) != 0 ? null : list4, (i & FileUtils.BUFFER_SIZE) != 0 ? null : num3, (i & 16384) != 0 ? null : num4, (32768 & i) != 0 ? null : num5, (65536 & i) != 0 ? null : num6, (131072 & i) != 0 ? null : num7, (262144 & i) != 0 ? null : l4, (i & 524288) != 0 ? null : num8);
    }
}
