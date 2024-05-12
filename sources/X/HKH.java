package X;

import com.bytedance.ies.nle.editor_jni.LogLevel;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HKH implements HKP {
    public final /* synthetic */ HKJ LIZ;
    public final /* synthetic */ List<HJU> LIZIZ;
    public final /* synthetic */ int LIZJ;
    public final /* synthetic */ HKO LIZLLL;

    @Override // X.HKP
    public final void LIZ(String str, String str2, boolean z) {
    }

    @Override // X.HKP
    public final void LIZIZ(C43645HAz c43645HAz, boolean z) {
        if (c43645HAz == null) {
            return;
        }
        String str = c43645HAz.LIZ;
        if (o.LJ(str, "stage_download_music")) {
            this.LIZ.LJLL.LJLIL = c43645HAz.LIZIZ;
        } else if (o.LJ(str, "stage_download_template")) {
            this.LIZ.LJLL.LJLJI = c43645HAz.LIZIZ;
        }
        this.LIZ.LJJLIIIJILLIZJL();
    }

    @Override // X.HKP
    public final void LIZLLL(C43611H9r c43611H9r, boolean z) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AutoCutTemplateComp downloadTemplate success: ");
        LIZ.append(c43611H9r);
        C45049Hm9.LIZ(LogLevel.LEVEL_INFO, X1D.LIZIZ(LIZ));
        if (c43611H9r != null) {
            HKJ hkj = this.LIZ;
            c43611H9r.LIZIZ = hkj.LJJLI(c43611H9r.LIZ, hkj.LJJLL(this.LIZIZ, this.LIZJ));
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("AutoCutTemplateComp buildNLEModel: clipNum = ");
        LIZ2.append(this.LIZJ);
        LIZ2.append(", compressedMediaList = ");
        C45243HpH.LIZIZ(LIZ2, ORZ.LLD(this.LIZIZ, null, null, null, C43675HCd.LJLIL, 31), LIZ2);
        this.LIZ.LJLJJL(null, null, null, null, null);
        HKO hko = this.LIZLLL;
        if (hko != null) {
            hko.LIZLLL(c43611H9r, z);
        }
    }

    @Override // X.HKP
    public final void LJFF(int i, String str, boolean z) {
        StringBuilder LIZ = C06830Op.LIZ("AutoCutTemplateComp downloadTemplate failure: errCode = ", i, ", errMsg = ", str, ", reCallback = ");
        LIZ.append(z);
        C45049Hm9.LIZ(LogLevel.LEVEL_INFO, X1D.LIZIZ(LIZ));
        this.LIZ.LJLJJL(null, null, null, null, null);
        HKO hko = this.LIZLLL;
        if (hko != null) {
            hko.LJFF(i, str, z);
        }
        this.LIZ.LJJZZIII();
    }

    public HKH(HKJ hkj, List<HJU> list, int i, HKO hko) {
        this.LIZ = hkj;
        this.LIZIZ = list;
        this.LIZJ = i;
        this.LIZLLL = hko;
    }
}
