package com.ss.android.ugc.aweme.property.bytebench;

import X.C05090Hx;
import X.InterfaceC09240Xw;
import com.google.gson.Gson;

/* loaded from: classes8.dex */
public class CanvasByteBenchStrategy$$Imp implements CanvasByteBenchStrategy {
    public Gson mGson = new Gson();
    public int mRepoName = 0;
    public InterfaceC09240Xw mStrategyImp;

    @Override // com.ss.android.ugc.aweme.property.bytebench.CanvasByteBenchStrategy, X.InterfaceC44790Hhy
    public boolean enableCanvasDynamicResolution() {
        try {
            return C05090Hx.LIZJ.LIZ(this.mRepoName, "canvas_enable_dynamic_resolution", false);
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.ss.android.ugc.aweme.property.bytebench.CanvasByteBenchStrategy, X.InterfaceC44790Hhy
    public boolean enableStoryCanvas1080p() {
        try {
            return C05090Hx.LIZJ.LIZ(this.mRepoName, "story_canvas_enable_1080p", false);
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.ss.android.ugc.aweme.property.bytebench.CanvasByteBenchStrategy
    public void updateValue() {
    }

    @Override // com.ss.android.ugc.aweme.property.bytebench.CanvasByteBenchStrategy, X.InterfaceC09230Xv
    public void setByteBenchStrategy(InterfaceC09240Xw interfaceC09240Xw) {
        this.mRepoName = interfaceC09240Xw.getRepoName();
        this.mStrategyImp = interfaceC09240Xw;
    }
}
