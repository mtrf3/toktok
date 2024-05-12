package com.ss.android.ugc.gamora.editorpro.dynamic;

import X.C05090Hx;
import X.InterfaceC09240Xw;
import com.google.gson.Gson;

/* loaded from: classes8.dex */
public class VideoEffectStrategyApi$$Imp implements VideoEffectStrategyApi {
    public Gson mGson = new Gson();
    public int mRepoName = 0;
    public InterfaceC09240Xw mStrategyImp;

    @Override // com.ss.android.ugc.gamora.editorpro.dynamic.VideoEffectStrategyApi
    public int trackLimit() {
        try {
            return C05090Hx.LIZJ.LIZLLL(this.mRepoName, "bytebench_creative_tools_editorpro_video_effect_limit_strategy", 5);
        } catch (Exception unused) {
            return 5;
        }
    }

    @Override // com.ss.android.ugc.gamora.editorpro.dynamic.VideoEffectStrategyApi
    public void updateValue() {
    }

    @Override // com.ss.android.ugc.gamora.editorpro.dynamic.VideoEffectStrategyApi, X.InterfaceC09230Xv
    public void setByteBenchStrategy(InterfaceC09240Xw interfaceC09240Xw) {
        this.mRepoName = interfaceC09240Xw.getRepoName();
        this.mStrategyImp = interfaceC09240Xw;
    }
}
