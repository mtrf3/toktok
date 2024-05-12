package com.ss.android.ugc.aweme.property.bytebench;

import X.C05090Hx;
import X.C44786Hhu;
import X.InterfaceC09240Xw;
import X.InterfaceC09250Xx;
import com.google.gson.Gson;

/* loaded from: classes8.dex */
public class ExternalSettingByteBenchStrategy$$Imp implements ExternalSettingByteBenchStrategy {
    public InterfaceC09240Xw mStrategyImp;
    public Gson mGson = new Gson();
    public int mRepoName = 0;
    public InterfaceC09250Xx mDefaultCreate = new C44786Hhu();

    @Override // com.ss.android.ugc.aweme.property.bytebench.ExternalSettingByteBenchStrategy
    public void updateValue() {
    }

    @Override // com.ss.android.ugc.aweme.property.bytebench.ExternalSettingByteBenchStrategy, X.InterfaceC44785Hht
    public String compileExternalSettings() {
        try {
            String LJ = C05090Hx.LIZJ.LJ(this.mRepoName, "ve_synthesis_settings");
            return LJ != null ? LJ : "";
        } catch (Exception unused) {
            return "";
        }
    }

    @Override // com.ss.android.ugc.aweme.property.bytebench.ExternalSettingByteBenchStrategy, X.InterfaceC44785Hht
    public String hdCompileExternalSettings() {
        try {
            String LJ = C05090Hx.LIZJ.LJ(this.mRepoName, "high_quality_ve_synthesis_settings");
            return LJ != null ? LJ : "";
        } catch (Exception unused) {
            return "";
        }
    }

    @Override // com.ss.android.ugc.aweme.property.bytebench.ExternalSettingByteBenchStrategy, X.InterfaceC44785Hht
    public String importExternalSettings() {
        try {
            String LJ = C05090Hx.LIZJ.LJ(this.mRepoName, "import_compile_external_settings");
            return LJ != null ? LJ : "";
        } catch (Exception unused) {
            return "";
        }
    }

    @Override // com.ss.android.ugc.aweme.property.bytebench.ExternalSettingByteBenchStrategy, X.InterfaceC09230Xv
    public void setByteBenchStrategy(InterfaceC09240Xw interfaceC09240Xw) {
        this.mRepoName = interfaceC09240Xw.getRepoName();
        this.mStrategyImp = interfaceC09240Xw;
    }
}
