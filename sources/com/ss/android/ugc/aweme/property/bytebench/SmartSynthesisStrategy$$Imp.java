package com.ss.android.ugc.aweme.property.bytebench;

import X.C05090Hx;
import X.C44795Hi3;
import X.InterfaceC09240Xw;
import X.InterfaceC09250Xx;
import com.google.gson.Gson;

/* loaded from: classes8.dex */
public class SmartSynthesisStrategy$$Imp implements SmartSynthesisStrategy {
    public InterfaceC09240Xw mStrategyImp;
    public Gson mGson = new Gson();
    public int mRepoName = 0;
    public InterfaceC09250Xx mDefaultCreate = new C44795Hi3();

    @Override // com.ss.android.ugc.aweme.property.bytebench.SmartSynthesisStrategy
    public void updateValue() {
    }

    @Override // com.ss.android.ugc.aweme.property.bytebench.SmartSynthesisStrategy, X.HIW
    public String getModelPath() {
        try {
            String LJ = C05090Hx.LIZJ.LJ(this.mRepoName, "studio_smart_synthesis_model_path");
            return LJ != null ? LJ : "";
        } catch (Exception unused) {
            return "";
        }
    }

    @Override // com.ss.android.ugc.aweme.property.bytebench.SmartSynthesisStrategy, X.InterfaceC09230Xv
    public void setByteBenchStrategy(InterfaceC09240Xw interfaceC09240Xw) {
        this.mRepoName = interfaceC09240Xw.getRepoName();
        this.mStrategyImp = interfaceC09240Xw;
    }
}
