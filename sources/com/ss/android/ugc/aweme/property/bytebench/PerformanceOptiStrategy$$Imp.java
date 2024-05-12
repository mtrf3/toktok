package com.ss.android.ugc.aweme.property.bytebench;

import X.C05090Hx;
import X.InterfaceC09240Xw;
import com.google.gson.Gson;

/* loaded from: classes8.dex */
public class PerformanceOptiStrategy$$Imp implements PerformanceOptiStrategy {
    public Gson mGson = new Gson();
    public int mRepoName = 0;
    public InterfaceC09240Xw mStrategyImp;

    @Override // com.ss.android.ugc.aweme.property.bytebench.PerformanceOptiStrategy, X.InterfaceC44948HkW
    public int getOpenAlbumOptiGroup() {
        try {
            return C05090Hx.LIZJ.LIZLLL(this.mRepoName, "bytebench_creative_tools_album_opti_2021_10", 0);
        } catch (Exception unused) {
            return 0;
        }
    }

    @Override // com.ss.android.ugc.aweme.property.bytebench.PerformanceOptiStrategy, X.InterfaceC44948HkW
    public boolean isOpenAlbumThreeColumnsOpti() {
        try {
            return C05090Hx.LIZJ.LIZ(this.mRepoName, "bytebench_creative_tools_three_columns", false);
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.ss.android.ugc.aweme.property.bytebench.PerformanceOptiStrategy, X.InterfaceC44948HkW
    public boolean isOpenStopVideoPlayerOpti() {
        try {
            return C05090Hx.LIZJ.LIZ(this.mRepoName, "bytebench_creative_tools_stop_video_player", false);
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.ss.android.ugc.aweme.property.bytebench.PerformanceOptiStrategy, X.InterfaceC44948HkW
    public boolean isOpenTaskDegradationOpti() {
        try {
            return C05090Hx.LIZJ.LIZ(this.mRepoName, "bytebench_creative_tools_task_degradation_opti", true);
        } catch (Exception unused) {
            return true;
        }
    }

    @Override // com.ss.android.ugc.aweme.property.bytebench.PerformanceOptiStrategy
    public void updateValue() {
    }

    @Override // com.ss.android.ugc.aweme.property.bytebench.PerformanceOptiStrategy, X.InterfaceC09230Xv
    public void setByteBenchStrategy(InterfaceC09240Xw interfaceC09240Xw) {
        this.mRepoName = interfaceC09240Xw.getRepoName();
        this.mStrategyImp = interfaceC09240Xw;
    }
}
