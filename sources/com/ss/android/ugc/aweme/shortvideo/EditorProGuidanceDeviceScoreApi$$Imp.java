package com.ss.android.ugc.aweme.shortvideo;

import X.C05090Hx;
import X.InterfaceC09240Xw;
import com.google.gson.Gson;

/* loaded from: classes8.dex */
public class EditorProGuidanceDeviceScoreApi$$Imp implements EditorProGuidanceDeviceScoreApi {
    public Gson mGson = new Gson();
    public int mRepoName = 0;
    public InterfaceC09240Xw mStrategyImp;

    @Override // com.ss.android.ugc.aweme.shortvideo.EditorProGuidanceDeviceScoreApi
    public int getValue() {
        try {
            return C05090Hx.LIZJ.LIZLLL(this.mRepoName, "bytebench_editor_pro_guide_device_score", 0);
        } catch (Exception unused) {
            return 0;
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.EditorProGuidanceDeviceScoreApi
    public void updateValue() {
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.EditorProGuidanceDeviceScoreApi, X.InterfaceC09230Xv
    public void setByteBenchStrategy(InterfaceC09240Xw interfaceC09240Xw) {
        this.mRepoName = interfaceC09240Xw.getRepoName();
        this.mStrategyImp = interfaceC09240Xw;
    }
}
