package com.bytedance.ies.ugc.aweme.commercialize.intelligence.feed.expirement;

import X.InterfaceC65349Pkn;
import com.google.gson.m;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class AdPitayaReRankClientAbModel {

    @InterfaceC65349Pkn("business_name")
    public final String businessName;

    @InterfaceC65349Pkn("core_task_name")
    public final String coreTaskName;

    @InterfaceC65349Pkn("enable_call_pitaya")
    public final boolean enableCallPitaya;

    @InterfaceC65349Pkn("enable_pitaya_rerank")
    public final boolean enablePitayaReRank;

    @InterfaceC65349Pkn("min_floor_step")
    public final int minFloorStep;

    @InterfaceC65349Pkn("min_run_interval")
    public final int minRunInterval;

    @InterfaceC65349Pkn("pitaya_re_rank_ab_params")
    public final m pitayaReRankAbParams;

    @InterfaceC65349Pkn("post_on_viewholder_selected_ms")
    public final long postOnHolderSelectedDelay;

    @InterfaceC65349Pkn("prepare_task_name")
    public final String prepareTaskName;

    @InterfaceC65349Pkn("recent_feed_count")
    public final int recentFeedCount;

    @InterfaceC65349Pkn("recent_pitaya_count")
    public final int recentPitayaCount;

    @InterfaceC65349Pkn("rerank_min_version_android")
    public final long rerankMinVersionCode;

    @InterfaceC65349Pkn("rerank_use_new_strategy")
    public final boolean rerankNewRecordStrategy;

    @InterfaceC65349Pkn("run_period")
    public final int runPeriod;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AdPitayaReRankClientAbModel() {
        /*
            r19 = this;
            r1 = 0
            r2 = 0
            r11 = 0
            r17 = 16383(0x3fff, float:2.2957E-41)
            r0 = r19
            r3 = r2
            r4 = r2
            r5 = r1
            r6 = r1
            r7 = r1
            r8 = r1
            r9 = r1
            r10 = r2
            r13 = r1
            r14 = r1
            r15 = r11
            r18 = r2
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r13, r14, r15, r17, r18)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.ugc.aweme.commercialize.intelligence.feed.expirement.AdPitayaReRankClientAbModel.<init>():void");
    }

    public AdPitayaReRankClientAbModel(boolean z, String businessName, String prepareTaskName, String coreTaskName, int i, int i2, int i3, int i4, int i5, m pitayaReRankAbParams, long j, boolean z2, boolean z3, long j2) {
        o.LJIIIZ(businessName, "businessName");
        o.LJIIIZ(prepareTaskName, "prepareTaskName");
        o.LJIIIZ(coreTaskName, "coreTaskName");
        o.LJIIIZ(pitayaReRankAbParams, "pitayaReRankAbParams");
        this.enablePitayaReRank = z;
        this.businessName = businessName;
        this.prepareTaskName = prepareTaskName;
        this.coreTaskName = coreTaskName;
        this.runPeriod = i;
        this.minRunInterval = i2;
        this.recentFeedCount = i3;
        this.recentPitayaCount = i4;
        this.minFloorStep = i5;
        this.pitayaReRankAbParams = pitayaReRankAbParams;
        this.rerankMinVersionCode = j;
        this.rerankNewRecordStrategy = z2;
        this.enableCallPitaya = z3;
        this.postOnHolderSelectedDelay = j2;
    }

    public /* synthetic */ AdPitayaReRankClientAbModel(boolean z, String str, String str2, String str3, int i, int i2, int i3, int i4, int i5, m mVar, long j, boolean z2, boolean z3, long j2, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this((i6 & 1) != 0 ? false : z, (i6 & 2) != 0 ? "tiktok_showtime_ad_gap" : str, (i6 & 4) != 0 ? "prepare_item_structure" : str2, (i6 & 8) != 0 ? "adjust_items" : str3, (i6 & 16) != 0 ? 15 : i, (i6 & 32) != 0 ? 8 : i2, (i6 & 64) != 0 ? 30 : i3, (i6 & 128) == 0 ? i4 : 30, (i6 & 256) != 0 ? 2 : i5, (i6 & 512) != 0 ? new m() : mVar, (i6 & 1024) != 0 ? 0L : j, (i6 & 2048) == 0 ? z2 : false, (i6 & 4096) != 0 ? true : z3, (i6 & FileUtils.BUFFER_SIZE) != 0 ? 350L : j2);
    }
}
