package com.ss.android.ugc.gamora.editorpro.dynamic;

import X.C05090Hx;
import X.C44794Hi2;
import X.InterfaceC09240Xw;
import X.InterfaceC09250Xx;
import com.google.gson.Gson;

/* loaded from: classes8.dex */
public class EditorProStrategyApi$$Imp implements EditorProStrategyApi {
    public InterfaceC09240Xw mStrategyImp;
    public Gson mGson = new Gson();
    public int mRepoName = 0;
    public InterfaceC09250Xx mDefaultCreate = new C44794Hi2();

    @Override // com.ss.android.ugc.gamora.editorpro.dynamic.EditorProStrategyApi
    public void updateValue() {
    }

    @Override // com.ss.android.ugc.gamora.editorpro.dynamic.EditorProStrategyApi
    public PipLimit pipTrackLimit() {
        try {
            C05090Hx c05090Hx = C05090Hx.LIZJ;
            String LJ = c05090Hx.LJ(this.mRepoName, "bytebench_creative_tools_editorpro_pip_track_limit_strategy");
            if (LJ != null) {
                return (PipLimit) this.mGson.LJI(LJ, PipLimit.class);
            }
            return (PipLimit) c05090Hx.LIZIZ(PipLimit.class, this.mDefaultCreate);
        } catch (Exception unused) {
            return (PipLimit) C05090Hx.LIZJ.LIZIZ(PipLimit.class, this.mDefaultCreate);
        }
    }

    @Override // com.ss.android.ugc.gamora.editorpro.dynamic.EditorProStrategyApi, X.InterfaceC09230Xv
    public void setByteBenchStrategy(InterfaceC09240Xw interfaceC09240Xw) {
        this.mRepoName = interfaceC09240Xw.getRepoName();
        this.mStrategyImp = interfaceC09240Xw;
    }
}
