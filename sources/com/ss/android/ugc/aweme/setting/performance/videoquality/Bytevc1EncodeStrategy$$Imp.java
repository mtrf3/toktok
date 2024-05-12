package com.ss.android.ugc.aweme.setting.performance.videoquality;

import X.C05090Hx;
import X.InterfaceC09240Xw;
import com.google.gson.Gson;

/* loaded from: classes8.dex */
public class Bytevc1EncodeStrategy$$Imp implements Bytevc1EncodeStrategy {
    public Gson mGson = new Gson();
    public int mRepoName = 0;
    public InterfaceC09240Xw mStrategyImp;

    @Override // com.ss.android.ugc.aweme.setting.performance.videoquality.Bytevc1EncodeStrategy, X.InterfaceC37265Ejt
    public int getMinSpeedForUsingBytevc1() {
        try {
            return C05090Hx.LIZJ.LIZLLL(this.mRepoName, "studio_upload_speed_threshold_using_bytevc1", -1);
        } catch (Exception unused) {
            return -1;
        }
    }

    @Override // com.ss.android.ugc.aweme.setting.performance.videoquality.Bytevc1EncodeStrategy, X.InterfaceC37265Ejt
    public boolean isEnableBytevc1enc8Plugin() {
        try {
            return C05090Hx.LIZJ.LIZ(this.mRepoName, "studio_is_enable_bytevc1enc8_plugin", false);
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.ss.android.ugc.aweme.setting.performance.videoquality.Bytevc1EncodeStrategy
    public void updateValue() {
    }

    @Override // com.ss.android.ugc.aweme.setting.performance.videoquality.Bytevc1EncodeStrategy, X.InterfaceC09230Xv
    public void setByteBenchStrategy(InterfaceC09240Xw interfaceC09240Xw) {
        this.mRepoName = interfaceC09240Xw.getRepoName();
        this.mStrategyImp = interfaceC09240Xw;
    }
}
