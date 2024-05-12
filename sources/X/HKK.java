package X;

import com.bytedance.ies.nle.editor_jni.LogLevel;

/* loaded from: classes8.dex */
public final class HKK implements HKP {
    public final /* synthetic */ HKO LIZ;
    public final /* synthetic */ HKJ LIZIZ;

    public HKK(HKO hko, HKJ hkj) {
        this.LIZ = hko;
        this.LIZIZ = hkj;
    }

    @Override // X.HKP
    public final void LIZIZ(C43645HAz c43645HAz, boolean z) {
        HKO hko = this.LIZ;
        if (hko != null) {
            hko.LIZIZ(c43645HAz, z);
        }
    }

    @Override // X.HKP
    public final void LIZLLL(C43611H9r c43611H9r, boolean z) {
        C45049Hm9.LIZ(LogLevel.LEVEL_INFO, "AutoCutTemplateComp preDownload success");
        HKO hko = this.LIZ;
        if (hko != null) {
            hko.LIZLLL(c43611H9r, z);
        }
    }

    @Override // X.HKP
    public final void LIZ(String str, String str2, boolean z) {
        HKO hko = this.LIZ;
        if (hko != null) {
            hko.LIZ(str, str2, z);
        }
    }

    @Override // X.HKP
    public final void LJFF(int i, String str, boolean z) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AutoCutTemplateComp preDownload failure: errCode = ");
        LIZ.append(i);
        LIZ.append(", errMsg = ");
        LIZ.append(str);
        C45049Hm9.LIZ(LogLevel.LEVEL_INFO, X1D.LIZIZ(LIZ));
        HKO hko = this.LIZ;
        if (hko != null) {
            hko.LJFF(i, str, z);
        }
        HKQ hkq = this.LIZIZ.LJJZZI().LJIIIIZZ;
        if (hkq != null) {
            hkq.LJI(null);
        }
    }
}
