package com.ss.android.ugc.bytebench;

import X.C05090Hx;
import X.InterfaceC09240Xw;
import com.google.gson.Gson;

/* loaded from: classes8.dex */
public class EditorDowngradeOptiStrategy$$Imp implements EditorDowngradeOptiStrategy {
    public Gson mGson = new Gson();
    public int mRepoName = 0;
    public InterfaceC09240Xw mStrategyImp;

    @Override // com.ss.android.ugc.bytebench.EditorDowngradeOptiStrategy, X.InterfaceC44997HlJ
    public boolean isDowngrade() {
        try {
            return C05090Hx.LIZJ.LIZ(this.mRepoName, "bytebench_creative_tools_sticker_downgrade_opti", false);
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.ss.android.ugc.bytebench.EditorDowngradeOptiStrategy
    public void updateValue() {
    }

    @Override // com.ss.android.ugc.bytebench.EditorDowngradeOptiStrategy, X.InterfaceC09230Xv
    public void setByteBenchStrategy(InterfaceC09240Xw interfaceC09240Xw) {
        this.mRepoName = interfaceC09240Xw.getRepoName();
        this.mStrategyImp = interfaceC09240Xw;
    }
}
