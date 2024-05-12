package com.ss.android.ugc.aweme.property.bytebench;

import X.C05090Hx;
import X.InterfaceC09240Xw;
import com.google.gson.Gson;

/* loaded from: classes8.dex */
public class FrontFlashByteBenchStrategy$$Imp implements FrontFlashByteBenchStrategy {
    public Gson mGson = new Gson();
    public int mRepoName = 0;
    public InterfaceC09240Xw mStrategyImp;

    @Override // com.ss.android.ugc.aweme.property.bytebench.FrontFlashByteBenchStrategy
    public int frontFlashStyle() {
        try {
            return C05090Hx.LIZJ.LIZLLL(this.mRepoName, "studio_front_flash_style", 1);
        } catch (Exception unused) {
            return 1;
        }
    }

    @Override // com.ss.android.ugc.aweme.property.bytebench.FrontFlashByteBenchStrategy
    public void updateValue() {
    }

    @Override // com.ss.android.ugc.aweme.property.bytebench.FrontFlashByteBenchStrategy, X.InterfaceC09230Xv
    public void setByteBenchStrategy(InterfaceC09240Xw interfaceC09240Xw) {
        this.mRepoName = interfaceC09240Xw.getRepoName();
        this.mStrategyImp = interfaceC09240Xw;
    }
}
