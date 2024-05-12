package com.ss.android.ugc.aweme.im.service.appsettings;

import X.F9E;
import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCoverMinSizeSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LivePreviewNetworkSpeedThresholdSetting;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class ActivityStatusConfig extends F9E {

    @InterfaceC65349Pkn("active_threshold")
    public final long active_threshold;

    @InterfaceC65349Pkn("activity_status_accuracy_analytics_enable")
    public final boolean activityStatusAccuracyAnalyticsEnable;

    @InterfaceC65349Pkn("activity_status_chatpage_check_sampling_rate")
    public final double activityStatusChatPageCheckSamplingRate;

    @InterfaceC65349Pkn("inactive_threshold")
    public final long inactive_threshold;

    @InterfaceC65349Pkn("max_cache_size")
    public final int maxCacheSize;

    @InterfaceC65349Pkn("muf_local_manage_limit")
    public final int mufLocalManageLimit;

    @InterfaceC65349Pkn("num_of_inbox_sky_light_status_limit_count")
    public final int num_of_inbox_sky_light_status_limit_count;

    @InterfaceC65349Pkn("num_of_friend_to_fetch_status")
    public final int remoteBatchSize;

    @InterfaceC65349Pkn("status_cache_offline_status_expire_threshold")
    public final long status_cache_offline_status_expire_threshold;

    @InterfaceC65349Pkn("status_cache_online_status_expire_threshold")
    public final long status_cache_online_status_expire_threshold;

    @InterfaceC65349Pkn("status_cache_request_debounce_interval")
    public final long status_cache_request_debounce_interval;

    @InterfaceC65349Pkn("status_cache_unavailable_status_expire_threshold")
    public final long status_cache_unavailable_status_expire_threshold;

    @InterfaceC65349Pkn("status_copy_display_date_threshold")
    public final long status_copy_display_date_threshold;

    @InterfaceC65349Pkn("status_copy_display_hour_threshold")
    public final long status_copy_display_hour_threshold;

    @InterfaceC65349Pkn("status_copy_display_min_threshold")
    public final long status_copy_display_min_threshold;

    @InterfaceC65349Pkn("status_copy_display_msg_time_threshold")
    public final long status_copy_display_msg_time_threshold;

    @InterfaceC65349Pkn("status_report_interval")
    public final long status_report_interval;

    @InterfaceC65349Pkn("status_report_request_debounce_interval")
    public final long status_report_request_debounce_interval;

    @InterfaceC65349Pkn("ui_high_priority_refresh_status_interval")
    public final long ui_high_priority_refresh_status_interval;

    @InterfaceC65349Pkn("ui_refresh_status_interval")
    public final long ui_refresh_status_interval;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ActivityStatusConfig() {
        /*
            r38 = this;
            r1 = 0
            r4 = 0
            r32 = 0
            r36 = 1048575(0xfffff, float:1.469367E-39)
            r37 = 0
            r0 = r38
            r2 = r1
            r3 = r1
            r6 = r4
            r8 = r4
            r10 = r4
            r12 = r4
            r14 = r4
            r16 = r4
            r18 = r4
            r20 = r4
            r22 = r4
            r24 = r4
            r26 = r4
            r28 = r4
            r30 = r4
            r34 = r1
            r35 = r1
            r0.<init>(r1, r2, r3, r4, r6, r8, r10, r12, r14, r16, r18, r20, r22, r24, r26, r28, r30, r32, r34, r35, r36, r37)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.service.appsettings.ActivityStatusConfig.<init>():void");
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.maxCacheSize), Integer.valueOf(this.remoteBatchSize), Integer.valueOf(this.num_of_inbox_sky_light_status_limit_count), Long.valueOf(this.ui_refresh_status_interval), Long.valueOf(this.ui_high_priority_refresh_status_interval), Long.valueOf(this.active_threshold), Long.valueOf(this.status_copy_display_date_threshold), Long.valueOf(this.status_copy_display_hour_threshold), Long.valueOf(this.status_copy_display_min_threshold), Long.valueOf(this.status_copy_display_msg_time_threshold), Long.valueOf(this.status_report_interval), Long.valueOf(this.status_report_request_debounce_interval), Long.valueOf(this.status_cache_offline_status_expire_threshold), Long.valueOf(this.status_cache_online_status_expire_threshold), Long.valueOf(this.status_cache_unavailable_status_expire_threshold), Long.valueOf(this.status_cache_request_debounce_interval), Long.valueOf(this.inactive_threshold), Double.valueOf(this.activityStatusChatPageCheckSamplingRate), Boolean.valueOf(this.activityStatusAccuracyAnalyticsEnable), Integer.valueOf(this.mufLocalManageLimit)};
    }

    public ActivityStatusConfig(int i, int i2, int i3, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, double d, boolean z, int i4) {
        this.maxCacheSize = i;
        this.remoteBatchSize = i2;
        this.num_of_inbox_sky_light_status_limit_count = i3;
        this.ui_refresh_status_interval = j;
        this.ui_high_priority_refresh_status_interval = j2;
        this.active_threshold = j3;
        this.status_copy_display_date_threshold = j4;
        this.status_copy_display_hour_threshold = j5;
        this.status_copy_display_min_threshold = j6;
        this.status_copy_display_msg_time_threshold = j7;
        this.status_report_interval = j8;
        this.status_report_request_debounce_interval = j9;
        this.status_cache_offline_status_expire_threshold = j10;
        this.status_cache_online_status_expire_threshold = j11;
        this.status_cache_unavailable_status_expire_threshold = j12;
        this.status_cache_request_debounce_interval = j13;
        this.inactive_threshold = j14;
        this.activityStatusChatPageCheckSamplingRate = d;
        this.activityStatusAccuracyAnalyticsEnable = z;
        this.mufLocalManageLimit = i4;
    }

    public /* synthetic */ ActivityStatusConfig(int i, int i2, int i3, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, double d, boolean z, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? LiveCoverMinSizeSetting.DEFAULT : i, (i5 & 2) != 0 ? 50 : i2, (i5 & 4) != 0 ? 40 : i3, (i5 & 8) != 0 ? LivePreviewNetworkSpeedThresholdSetting.DEFAULT : j, (i5 & 16) != 0 ? 10000L : j2, (i5 & 32) != 0 ? 600000L : j3, (i5 & 64) != 0 ? 86400000L : j4, (i5 & 128) != 0 ? 25200000L : j5, (i5 & 256) != 0 ? 3600000L : j6, (i5 & 512) != 0 ? 1800000L : j7, (i5 & 1024) != 0 ? 270000L : j8, (i5 & 2048) != 0 ? 500L : j9, (i5 & 4096) != 0 ? 5000L : j10, (i5 & FileUtils.BUFFER_SIZE) != 0 ? 180000L : j11, (i5 & 16384) == 0 ? j12 : 10000L, (32768 & i5) == 0 ? j13 : 500L, (65536 & i5) == 0 ? j14 : 180000L, (131072 & i5) != 0 ? 0.1d : d, (262144 & i5) != 0 ? false : z, (i5 & 524288) != 0 ? 100 : i4);
    }
}
