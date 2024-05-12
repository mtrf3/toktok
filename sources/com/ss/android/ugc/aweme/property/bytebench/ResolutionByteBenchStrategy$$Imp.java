package com.ss.android.ugc.aweme.property.bytebench;

import X.C05090Hx;
import X.C44789Hhx;
import X.InterfaceC09240Xw;
import X.InterfaceC09250Xx;
import com.google.gson.Gson;

/* loaded from: classes8.dex */
public class ResolutionByteBenchStrategy$$Imp implements ResolutionByteBenchStrategy {
    public InterfaceC09240Xw mStrategyImp;
    public Gson mGson = new Gson();
    public int mRepoName = 0;
    public InterfaceC09250Xx mDefaultCreate = new C44789Hhx();

    @Override // com.ss.android.ugc.aweme.property.bytebench.ResolutionByteBenchStrategy
    public void updateValue() {
    }

    @Override // com.ss.android.ugc.aweme.property.bytebench.ResolutionByteBenchStrategy, X.InterfaceC44776Hhk
    public int uploadVideoSizeIndex() {
        try {
            return C05090Hx.LIZJ.LIZLLL(this.mRepoName, "upload_video_size_index", 0);
        } catch (Exception unused) {
            return 0;
        }
    }

    @Override // com.ss.android.ugc.aweme.property.bytebench.ResolutionByteBenchStrategy, X.InterfaceC44776Hhk
    public int videoSizeIndex() {
        try {
            return C05090Hx.LIZJ.LIZLLL(this.mRepoName, "video_size_index", 0);
        } catch (Exception unused) {
            return 0;
        }
    }

    @Override // com.ss.android.ugc.aweme.property.bytebench.ResolutionByteBenchStrategy, X.InterfaceC44776Hhk
    public int compileVideoSizeIndex() {
        try {
            return C05090Hx.LIZJ.LIZLLL(this.mRepoName, "compile_video_size_index", 99);
        } catch (Exception unused) {
            return 99;
        }
    }

    @Override // com.ss.android.ugc.aweme.property.bytebench.ResolutionByteBenchStrategy, X.InterfaceC44776Hhk
    public int hdCompileVideoSizeIndex() {
        try {
            return C05090Hx.LIZJ.LIZLLL(this.mRepoName, "high_quality_compile_video_size_index", 99);
        } catch (Exception unused) {
            return 99;
        }
    }

    @Override // com.ss.android.ugc.aweme.property.bytebench.ResolutionByteBenchStrategy, X.InterfaceC44776Hhk
    public int staticVideoSizeIndex() {
        try {
            return this.mStrategyImp.LJFF();
        } catch (Exception unused) {
            return 0;
        }
    }

    @Override // com.ss.android.ugc.aweme.property.bytebench.ResolutionByteBenchStrategy, X.InterfaceC44776Hhk
    public String veCameraPreviewSize() {
        try {
            String LJ = C05090Hx.LIZJ.LJ(this.mRepoName, "ve_camera_preview_size");
            return LJ != null ? LJ : "";
        } catch (Exception unused) {
            return "";
        }
    }

    @Override // com.ss.android.ugc.aweme.property.bytebench.ResolutionByteBenchStrategy, X.InterfaceC09230Xv
    public void setByteBenchStrategy(InterfaceC09240Xw interfaceC09240Xw) {
        this.mRepoName = interfaceC09240Xw.getRepoName();
        this.mStrategyImp = interfaceC09240Xw;
    }
}
