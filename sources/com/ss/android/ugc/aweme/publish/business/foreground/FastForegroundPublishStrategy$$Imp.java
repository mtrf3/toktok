package com.ss.android.ugc.aweme.publish.business.foreground;

import X.C05090Hx;
import X.InterfaceC09240Xw;
import com.google.gson.Gson;

/* loaded from: classes8.dex */
public class FastForegroundPublishStrategy$$Imp implements FastForegroundPublishStrategy {
    public Gson mGson = new Gson();
    public int mRepoName = 0;
    public InterfaceC09240Xw mStrategyImp;

    @Override // com.ss.android.ugc.aweme.publish.business.foreground.FastForegroundPublishStrategy
    public boolean getValue() {
        try {
            return C05090Hx.LIZJ.LIZ(this.mRepoName, "studio_publish_fast_foreground", false);
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.ss.android.ugc.aweme.publish.business.foreground.FastForegroundPublishStrategy
    public void updateValue() {
    }

    @Override // com.ss.android.ugc.aweme.publish.business.foreground.FastForegroundPublishStrategy, X.InterfaceC09230Xv
    public void setByteBenchStrategy(InterfaceC09240Xw interfaceC09240Xw) {
        this.mRepoName = interfaceC09240Xw.getRepoName();
        this.mStrategyImp = interfaceC09240Xw;
    }
}
