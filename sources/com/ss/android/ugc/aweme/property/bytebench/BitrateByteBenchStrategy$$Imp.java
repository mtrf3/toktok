package com.ss.android.ugc.aweme.property.bytebench;

import X.C05090Hx;
import X.InterfaceC09240Xw;
import com.google.gson.Gson;

/* loaded from: classes8.dex */
public class BitrateByteBenchStrategy$$Imp implements BitrateByteBenchStrategy {
    public Gson mGson = new Gson();
    public int mRepoName = 0;
    public InterfaceC09240Xw mStrategyImp;

    @Override // com.ss.android.ugc.aweme.property.bytebench.BitrateByteBenchStrategy
    public void updateValue() {
    }

    @Override // com.ss.android.ugc.aweme.property.bytebench.BitrateByteBenchStrategy, X.InterfaceC44780Hho
    public int videoBitrateCategoryIndex() {
        try {
            return C05090Hx.LIZJ.LIZLLL(this.mRepoName, "video_bitrate_category_index", 0);
        } catch (Exception unused) {
            return 0;
        }
    }

    @Override // com.ss.android.ugc.aweme.property.bytebench.BitrateByteBenchStrategy, X.InterfaceC44780Hho
    public float syntheticVideoBitrate() {
        try {
            return C05090Hx.LIZJ.LIZJ(this.mRepoName, "synthetic_video_bitrate", 1.0f);
        } catch (Exception unused) {
            return 1.0f;
        }
    }

    @Override // com.ss.android.ugc.aweme.property.bytebench.BitrateByteBenchStrategy, X.InterfaceC44780Hho
    public float videoBitrate() {
        try {
            return C05090Hx.LIZJ.LIZJ(this.mRepoName, "video_bitrate", 1.0f);
        } catch (Exception unused) {
            return 1.0f;
        }
    }

    @Override // com.ss.android.ugc.aweme.property.bytebench.BitrateByteBenchStrategy, X.InterfaceC09230Xv
    public void setByteBenchStrategy(InterfaceC09240Xw interfaceC09240Xw) {
        this.mRepoName = interfaceC09240Xw.getRepoName();
        this.mStrategyImp = interfaceC09240Xw;
    }
}
