package com.ss.android.ugc.aweme.property;

import X.C05090Hx;
import X.InterfaceC09240Xw;
import com.google.gson.Gson;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes8.dex */
public class FastImport4kHighRes50FpsInBenchmarkStrategy$$Imp implements FastImport4kHighRes50FpsInBenchmarkStrategy {
    public Gson mGson = new Gson();
    public int mRepoName = 0;
    public final ConcurrentHashMap<String, Object> mStickyStrategy = new ConcurrentHashMap<>();
    public InterfaceC09240Xw mStrategyImp;

    @Override // com.ss.android.ugc.aweme.property.FastImport4kHighRes50FpsInBenchmarkStrategy
    public void updateValue() {
    }

    @Override // com.ss.android.ugc.aweme.property.FastImport4kHighRes50FpsInBenchmarkStrategy
    public boolean getEnable() {
        boolean LIZ;
        Object obj = this.mStickyStrategy.get("high_res_high40_50_benchmark_enable");
        if (obj != null) {
            return ((Boolean) obj).booleanValue();
        }
        try {
            synchronized (this) {
                if (this.mStickyStrategy.contains("high_res_high40_50_benchmark_enable")) {
                    LIZ = ((Boolean) this.mStickyStrategy.get("high_res_high40_50_benchmark_enable")).booleanValue();
                } else {
                    LIZ = C05090Hx.LIZJ.LIZ(this.mRepoName, "high_res_high40_50_benchmark_enable", false);
                    this.mStickyStrategy.put("high_res_high40_50_benchmark_enable", Boolean.valueOf(LIZ));
                }
            }
            return LIZ;
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.ss.android.ugc.aweme.property.FastImport4kHighRes50FpsInBenchmarkStrategy, X.InterfaceC09230Xv
    public void setByteBenchStrategy(InterfaceC09240Xw interfaceC09240Xw) {
        this.mRepoName = interfaceC09240Xw.getRepoName();
        this.mStrategyImp = interfaceC09240Xw;
    }
}
