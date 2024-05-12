package com.ss.android.ugc.aweme.property.bytebench;

import X.C05090Hx;
import X.InterfaceC09240Xw;
import com.google.gson.Gson;

/* loaded from: classes8.dex */
public class RecodeByteBenchStrategy$$Imp implements RecodeByteBenchStrategy {
    public Gson mGson = new Gson();
    public int mRepoName = 0;
    public InterfaceC09240Xw mStrategyImp;

    @Override // com.ss.android.ugc.aweme.property.bytebench.RecodeByteBenchStrategy
    public void updateValue() {
    }

    @Override // com.ss.android.ugc.aweme.property.bytebench.RecodeByteBenchStrategy, X.InterfaceC44791Hhz
    public int hdRecodeBitrateThreshold() {
        try {
            return C05090Hx.LIZJ.LIZLLL(this.mRepoName, "high_quality_bitrate_of_recode_threshold", 10000000);
        } catch (Exception unused) {
            return 10000000;
        }
    }

    @Override // com.ss.android.ugc.aweme.property.bytebench.RecodeByteBenchStrategy, X.InterfaceC44791Hhz
    public int recodeBitrateThreshold() {
        try {
            return C05090Hx.LIZJ.LIZLLL(this.mRepoName, "bitrate_of_recode_threshold", 10000000);
        } catch (Exception unused) {
            return 10000000;
        }
    }

    @Override // com.ss.android.ugc.aweme.property.bytebench.RecodeByteBenchStrategy, X.InterfaceC09230Xv
    public void setByteBenchStrategy(InterfaceC09240Xw interfaceC09240Xw) {
        this.mRepoName = interfaceC09240Xw.getRepoName();
        this.mStrategyImp = interfaceC09240Xw;
    }
}
