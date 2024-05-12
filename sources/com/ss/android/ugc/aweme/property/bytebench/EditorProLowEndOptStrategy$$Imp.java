package com.ss.android.ugc.aweme.property.bytebench;

import X.C05090Hx;
import X.InterfaceC09240Xw;
import com.google.gson.Gson;

/* loaded from: classes8.dex */
public class EditorProLowEndOptStrategy$$Imp implements EditorProLowEndOptStrategy {
    public Gson mGson = new Gson();
    public int mRepoName = 0;
    public InterfaceC09240Xw mStrategyImp;

    @Override // com.ss.android.ugc.aweme.property.bytebench.EditorProLowEndOptStrategy
    public boolean enable() {
        try {
            return C05090Hx.LIZJ.LIZ(this.mRepoName, "bytebench_creative_tools_editorpro_low_end_opt", false);
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.ss.android.ugc.aweme.property.bytebench.EditorProLowEndOptStrategy
    public void updateValue() {
    }

    @Override // com.ss.android.ugc.aweme.property.bytebench.EditorProLowEndOptStrategy, X.InterfaceC09230Xv
    public void setByteBenchStrategy(InterfaceC09240Xw interfaceC09240Xw) {
        this.mRepoName = interfaceC09240Xw.getRepoName();
        this.mStrategyImp = interfaceC09240Xw;
    }
}
