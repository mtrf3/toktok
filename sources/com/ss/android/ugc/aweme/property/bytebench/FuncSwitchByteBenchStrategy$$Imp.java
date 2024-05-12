package com.ss.android.ugc.aweme.property.bytebench;

import X.C05090Hx;
import X.InterfaceC09240Xw;
import com.google.gson.Gson;

/* loaded from: classes8.dex */
public class FuncSwitchByteBenchStrategy$$Imp implements FuncSwitchByteBenchStrategy {
    public Gson mGson = new Gson();
    public int mRepoName = 0;
    public InterfaceC09240Xw mStrategyImp;

    @Override // com.ss.android.ugc.aweme.property.bytebench.FuncSwitchByteBenchStrategy, X.InterfaceC44775Hhj
    public boolean enableDefaultOpenHDSwitch() {
        try {
            return C05090Hx.LIZJ.LIZ(this.mRepoName, "enable_default_open_hd_video_switch", false);
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.ss.android.ugc.aweme.property.bytebench.FuncSwitchByteBenchStrategy, X.InterfaceC44775Hhj
    public boolean enableFastImport1080pHigher() {
        try {
            return C05090Hx.LIZJ.LIZ(this.mRepoName, "fast_import_1080p_higher_benchmark_enable", false);
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.ss.android.ugc.aweme.property.bytebench.FuncSwitchByteBenchStrategy, X.InterfaceC44775Hhj
    public boolean enableFastImport1080pLower() {
        try {
            return C05090Hx.LIZJ.LIZ(this.mRepoName, "fast_import_1080p_lower_benchmark_enable", false);
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.ss.android.ugc.aweme.property.bytebench.FuncSwitchByteBenchStrategy, X.InterfaceC44775Hhj
    public boolean enableImportHD() {
        try {
            return C05090Hx.LIZJ.LIZ(this.mRepoName, "avtools_enable_hd_import_resolution", false);
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.ss.android.ugc.aweme.property.bytebench.FuncSwitchByteBenchStrategy, X.InterfaceC44775Hhj
    public boolean enableRecordHD() {
        try {
            return C05090Hx.LIZJ.LIZ(this.mRepoName, "avtools_enable_hd_record_resolution", false);
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.ss.android.ugc.aweme.property.bytebench.FuncSwitchByteBenchStrategy, X.InterfaceC44775Hhj
    public boolean showHDButton() {
        try {
            return C05090Hx.LIZJ.LIZ(this.mRepoName, "enable_high_quality_video", false);
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.ss.android.ugc.aweme.property.bytebench.FuncSwitchByteBenchStrategy
    public void updateValue() {
    }

    @Override // com.ss.android.ugc.aweme.property.bytebench.FuncSwitchByteBenchStrategy, X.InterfaceC09230Xv
    public void setByteBenchStrategy(InterfaceC09240Xw interfaceC09240Xw) {
        this.mRepoName = interfaceC09240Xw.getRepoName();
        this.mStrategyImp = interfaceC09240Xw;
    }
}
