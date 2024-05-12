package com.ss.android.ugc.aweme.property.bytebench;

import X.C05090Hx;
import X.C44787Hhv;
import X.InterfaceC09240Xw;
import X.InterfaceC09250Xx;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.google.gson.Gson;

/* loaded from: classes8.dex */
public class NowVQByteBenchStrategy$$Imp implements NowVQByteBenchStrategy {
    public InterfaceC09240Xw mStrategyImp;
    public Gson mGson = new Gson();
    public int mRepoName = 0;
    public InterfaceC09250Xx mDefaultCreate = new C44787Hhv();

    @Override // com.ss.android.ugc.aweme.property.bytebench.NowVQByteBenchStrategy
    public boolean enableSplitConfig() {
        try {
            return C05090Hx.LIZJ.LIZ(this.mRepoName, "now_enable_split_config", false);
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.ss.android.ugc.aweme.property.bytebench.NowVQByteBenchStrategy
    public float sourceBitrateFactor() {
        try {
            return C05090Hx.LIZJ.LIZJ(this.mRepoName, "now_video_bitrate", Float.MIN_VALUE);
        } catch (Exception unused) {
            return Float.MIN_VALUE;
        }
    }

    @Override // com.ss.android.ugc.aweme.property.bytebench.NowVQByteBenchStrategy
    public void updateValue() {
    }

    @Override // com.ss.android.ugc.aweme.property.bytebench.NowVQByteBenchStrategy
    public String compileExternalSetting() {
        try {
            String LJ = C05090Hx.LIZJ.LJ(this.mRepoName, "now_ve_synthesis_settings");
            return LJ != null ? LJ : "invalid_str";
        } catch (Exception unused) {
            return "invalid_str";
        }
    }

    @Override // com.ss.android.ugc.aweme.property.bytebench.NowVQByteBenchStrategy
    public int compileVideoSizeIndex() {
        try {
            return C05090Hx.LIZJ.LIZLLL(this.mRepoName, "now_compile_video_size_index", LiveLayoutPreloadThreadPriority.DEFAULT);
        } catch (Exception unused) {
            return LiveLayoutPreloadThreadPriority.DEFAULT;
        }
    }

    @Override // com.ss.android.ugc.aweme.property.bytebench.NowVQByteBenchStrategy
    public String getNowTakePictureSize() {
        try {
            String LJ = C05090Hx.LIZJ.LJ(this.mRepoName, "now_ve_take_picture_size");
            return LJ != null ? LJ : "invalid_str";
        } catch (Exception unused) {
            return "invalid_str";
        }
    }

    @Override // com.ss.android.ugc.aweme.property.bytebench.NowVQByteBenchStrategy
    public int recordVideoEncodeSizeIndex() {
        try {
            return C05090Hx.LIZJ.LIZLLL(this.mRepoName, "now_video_encode_size_index", LiveLayoutPreloadThreadPriority.DEFAULT);
        } catch (Exception unused) {
            return LiveLayoutPreloadThreadPriority.DEFAULT;
        }
    }

    @Override // com.ss.android.ugc.aweme.property.bytebench.NowVQByteBenchStrategy
    public int shotScreenEncodeSizeIndex() {
        try {
            return C05090Hx.LIZJ.LIZLLL(this.mRepoName, "now_shot_screen_encode_size_index", LiveLayoutPreloadThreadPriority.DEFAULT);
        } catch (Exception unused) {
            return LiveLayoutPreloadThreadPriority.DEFAULT;
        }
    }

    @Override // com.ss.android.ugc.aweme.property.bytebench.NowVQByteBenchStrategy
    public String sourcePreviewSize() {
        try {
            String LJ = C05090Hx.LIZJ.LJ(this.mRepoName, "now_ve_camera_preview_size");
            return LJ != null ? LJ : "invalid_str";
        } catch (Exception unused) {
            return "invalid_str";
        }
    }

    @Override // com.ss.android.ugc.aweme.property.bytebench.NowVQByteBenchStrategy
    public int sourceVideoSizeIndex() {
        try {
            return C05090Hx.LIZJ.LIZLLL(this.mRepoName, "now_video_size_index", LiveLayoutPreloadThreadPriority.DEFAULT);
        } catch (Exception unused) {
            return LiveLayoutPreloadThreadPriority.DEFAULT;
        }
    }

    @Override // com.ss.android.ugc.aweme.property.bytebench.NowVQByteBenchStrategy, X.InterfaceC09230Xv
    public void setByteBenchStrategy(InterfaceC09240Xw interfaceC09240Xw) {
        this.mRepoName = interfaceC09240Xw.getRepoName();
        this.mStrategyImp = interfaceC09240Xw;
    }
}
