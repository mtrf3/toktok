package com.ss.android.ugc.aweme.bytebench;

import X.C05090Hx;
import X.InterfaceC09240Xw;
import com.google.gson.Gson;

/* loaded from: classes8.dex */
public class PublishDowngradeOptiStrategy$$Imp implements PublishDowngradeOptiStrategy {
    public Gson mGson = new Gson();
    public int mRepoName = 0;
    public InterfaceC09240Xw mStrategyImp;

    @Override // com.ss.android.ugc.aweme.bytebench.PublishDowngradeOptiStrategy
    public boolean hitEnvironmentV1() {
        try {
            return C05090Hx.LIZJ.LIZ(this.mRepoName, "bytebench_creative_tools_pre_publish_memory_limit_v1", false);
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.ss.android.ugc.aweme.bytebench.PublishDowngradeOptiStrategy
    public boolean hitEnvironmentV2() {
        try {
            return C05090Hx.LIZJ.LIZ(this.mRepoName, "bytebench_creative_tools_pre_publish_memory_limit_v2", false);
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.ss.android.ugc.aweme.bytebench.PublishDowngradeOptiStrategy
    public boolean hitEnvironmentV3() {
        try {
            return C05090Hx.LIZJ.LIZ(this.mRepoName, "bytebench_creative_tools_pre_publish_memory_limit_v3", false);
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.ss.android.ugc.aweme.bytebench.PublishDowngradeOptiStrategy
    public void updateValue() {
    }

    @Override // com.ss.android.ugc.aweme.bytebench.PublishDowngradeOptiStrategy, X.InterfaceC09230Xv
    public void setByteBenchStrategy(InterfaceC09240Xw interfaceC09240Xw) {
        this.mRepoName = interfaceC09240Xw.getRepoName();
        this.mStrategyImp = interfaceC09240Xw;
    }
}
