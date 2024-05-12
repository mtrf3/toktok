package com.ss.android.ugc.playerkit.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCenterDelayLoadSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.player.LivePlayerResourceReleaseSetting;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes9.dex */
public final class PlayListWiseBitrateSelectConfig extends F9E {

    @InterfaceC65349Pkn("checking_playlist_len")
    public final int checkingPlayListLen;

    @InterfaceC65349Pkn("checking_playlist_offset")
    public final int checkingPlayListOffset;

    @InterfaceC65349Pkn("first_feed_cnt_threshold")
    public final int firstFeedCntThreshold;

    @InterfaceC65349Pkn("ladder_selection_predict_type")
    public final int ladderSelectionPredictType;

    @InterfaceC65349Pkn("max_bandwidth_usage_factor")
    public final float maxBandwidthUsageFactor;

    @InterfaceC65349Pkn("max_fd_bandwidth_usage_factor")
    public final float maxFdBandwidthUsageFactor;

    @InterfaceC65349Pkn("max_fd_internet_speed_KBps")
    public final int maxFdInternetSpeedKBps;

    @InterfaceC65349Pkn("max_nfd_internet_speed_KBps")
    public final int maxInternetSpeedKBps;

    @InterfaceC65349Pkn("max_reserved_duration_ms")
    public final long maxReservedDurationMs;

    @InterfaceC65349Pkn("min_bandwidth_usage_factor")
    public final float minBandwidthUsageFactor;

    @InterfaceC65349Pkn("min_fd_bandwidth_usage_factor")
    public final float minFdBandwidthUsageFactor;

    @InterfaceC65349Pkn("min_fd_internet_speed_KBps")
    public final int minFdInternetSpeedKBps;

    @InterfaceC65349Pkn("min_nfd_internet_speed_KBps")
    public final int minInternetSpeedKBps;

    @InterfaceC65349Pkn("safe_cache_duration_ms")
    public final long safeCacheDurationMs;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public PlayListWiseBitrateSelectConfig() {
        /*
            r19 = this;
            r1 = 0
            r2 = 0
            r8 = 0
            r17 = 16383(0x3fff, float:2.2957E-41)
            r18 = 0
            r0 = r19
            r4 = r2
            r6 = r1
            r7 = r1
            r9 = r8
            r10 = r1
            r11 = r1
            r12 = r1
            r13 = r8
            r14 = r8
            r15 = r1
            r16 = r1
            r0.<init>(r1, r2, r4, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.playerkit.model.PlayListWiseBitrateSelectConfig.<init>():void");
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.ladderSelectionPredictType), Long.valueOf(this.maxReservedDurationMs), Long.valueOf(this.safeCacheDurationMs), Integer.valueOf(this.checkingPlayListOffset), Integer.valueOf(this.checkingPlayListLen), Float.valueOf(this.maxBandwidthUsageFactor), Float.valueOf(this.minBandwidthUsageFactor), Integer.valueOf(this.maxInternetSpeedKBps), Integer.valueOf(this.minInternetSpeedKBps), Integer.valueOf(this.firstFeedCntThreshold), Float.valueOf(this.maxFdBandwidthUsageFactor), Float.valueOf(this.minFdBandwidthUsageFactor), Integer.valueOf(this.maxFdInternetSpeedKBps), Integer.valueOf(this.minFdInternetSpeedKBps)};
    }

    public PlayListWiseBitrateSelectConfig(int i, long j, long j2, int i2, int i3, float f, float f2, int i4, int i5, int i6, float f3, float f4, int i7, int i8) {
        this.ladderSelectionPredictType = i;
        this.maxReservedDurationMs = j;
        this.safeCacheDurationMs = j2;
        this.checkingPlayListOffset = i2;
        this.checkingPlayListLen = i3;
        this.maxBandwidthUsageFactor = f;
        this.minBandwidthUsageFactor = f2;
        this.maxInternetSpeedKBps = i4;
        this.minInternetSpeedKBps = i5;
        this.firstFeedCntThreshold = i6;
        this.maxFdBandwidthUsageFactor = f3;
        this.minFdBandwidthUsageFactor = f4;
        this.maxFdInternetSpeedKBps = i7;
        this.minFdInternetSpeedKBps = i8;
    }

    public /* synthetic */ PlayListWiseBitrateSelectConfig(int i, long j, long j2, int i2, int i3, float f, float f2, int i4, int i5, int i6, float f3, float f4, int i7, int i8, int i9, DefaultConstructorMarker defaultConstructorMarker) {
        this((i9 & 1) != 0 ? 0 : i, (i9 & 2) != 0 ? 5000L : j, (i9 & 4) != 0 ? 2000L : j2, (i9 & 8) == 0 ? i2 : 0, (i9 & 16) != 0 ? 4 : i3, (i9 & 32) != 0 ? 1.5f : f, (i9 & 64) != 0 ? 0.7f : f2, (i9 & 128) != 0 ? LiveCenterDelayLoadSetting.DEFAULT : i4, (i9 & 256) != 0 ? 100 : i5, (i9 & 512) != 0 ? 5 : i6, (i9 & 1024) != 0 ? 1.2f : f3, (i9 & 2048) != 0 ? 0.8f : f4, (i9 & 4096) != 0 ? LivePlayerResourceReleaseSetting.ENABLE : i7, (i9 & FileUtils.BUFFER_SIZE) != 0 ? 1000 : i8);
    }
}
