package com.bytedance.geckox.statistic.model;

import X.C61276O3c;
import X.InterfaceC65349Pkn;

/* loaded from: classes11.dex */
public class SyncEventModel {

    @InterfaceC65349Pkn("aid")
    public long aid;

    @InterfaceC65349Pkn("os")
    public int os;

    @InterfaceC65349Pkn("region")
    public String region;

    @InterfaceC65349Pkn("sync_stats_type")
    public int syncStatsType;

    @InterfaceC65349Pkn("sync_task_id")
    public int syncTaskId;

    @InterfaceC65349Pkn("sync_task_type")
    public int syncTaskType;

    @InterfaceC65349Pkn("params_for_special")
    public String params = "gecko";

    @InterfaceC65349Pkn("sdk_version")
    public String sdkVersion = "3.4.2.2-bugfix";

    public SyncEventModel(C61276O3c c61276O3c) {
        this.aid = c61276O3c.LJII.longValue();
        this.region = c61276O3c.LJIIJJI;
    }

    public void setSyncStatsType(int i) {
        this.syncStatsType = i;
    }

    public void setSyncTaskId(int i) {
        this.syncTaskId = i;
    }

    public void setSyncTaskType(int i) {
        this.syncTaskType = i;
    }
}
