package com.ss.android.ugc.aweme.property.bytebench;

import X.C05090Hx;
import X.C44788Hhw;
import X.InterfaceC09240Xw;
import X.InterfaceC09250Xx;
import com.google.gson.Gson;

/* loaded from: classes8.dex */
public class PhotoMVByteBenchStrategy$$Imp implements PhotoMVByteBenchStrategy {
    public InterfaceC09240Xw mStrategyImp;
    public Gson mGson = new Gson();
    public int mRepoName = 0;
    public InterfaceC09250Xx mDefaultCreate = new C44788Hhw();

    @Override // com.ss.android.ugc.aweme.property.bytebench.PhotoMVByteBenchStrategy, X.InterfaceC44777Hhl
    public boolean enableMvBindingHDSwitch() {
        try {
            return C05090Hx.LIZJ.LIZ(this.mRepoName, "mv_enable_binding_hd_switch", false);
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.ss.android.ugc.aweme.property.bytebench.PhotoMVByteBenchStrategy, X.InterfaceC44777Hhl
    public boolean enableSynthesisMvTo1080p() {
        try {
            return C05090Hx.LIZJ.LIZ(this.mRepoName, "enable_1080p_photo_to_video", false);
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.ss.android.ugc.aweme.property.bytebench.PhotoMVByteBenchStrategy, X.InterfaceC44777Hhl
    public int mvDynamicResolutionStrategy() {
        try {
            return C05090Hx.LIZJ.LIZLLL(this.mRepoName, "tool_photo_to_video_resolution_strategy", 0);
        } catch (Exception unused) {
            return 0;
        }
    }

    @Override // com.ss.android.ugc.aweme.property.bytebench.PhotoMVByteBenchStrategy, X.InterfaceC44777Hhl
    public int mvFastImportStrategy() {
        try {
            return C05090Hx.LIZJ.LIZLLL(this.mRepoName, "mv_photo_resize_strategy", 0);
        } catch (Exception unused) {
            return 0;
        }
    }

    @Override // com.ss.android.ugc.aweme.property.bytebench.PhotoMVByteBenchStrategy
    public void updateValue() {
    }

    @Override // com.ss.android.ugc.aweme.property.bytebench.PhotoMVByteBenchStrategy, X.InterfaceC44777Hhl
    public String mvSynthesisSettingsFor1080p() {
        try {
            String LJ = C05090Hx.LIZJ.LJ(this.mRepoName, "avtools_1080p_mv_photo_ve_synthesis_settings");
            return LJ != null ? LJ : "";
        } catch (Exception unused) {
            return "";
        }
    }

    @Override // com.ss.android.ugc.aweme.property.bytebench.PhotoMVByteBenchStrategy, X.InterfaceC09230Xv
    public void setByteBenchStrategy(InterfaceC09240Xw interfaceC09240Xw) {
        this.mRepoName = interfaceC09240Xw.getRepoName();
        this.mStrategyImp = interfaceC09240Xw;
    }
}
