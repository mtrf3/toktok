package X;

import com.google.gson.g;
import com.ss.android.ugc.aweme.request_combine.common.ServerPortraitCollections;
import com.ss.android.ugc.aweme.requestcombine.IServerPortraitService;
import java.util.ArrayList;

/* loaded from: classes15.dex */
public final class VHT extends C48377Iyj {
    public VHN LIZ;
    public final IServerPortraitService LIZIZ = ServerPortraitCollections.LIZJ();

    @Override // com.ss.android.ugc.aweme.simkit.api.IDimensionBitrateCurveConfig
    public final VHN config() {
        g gVar;
        VHN vhn;
        if (this.LIZ == null) {
            int i = 0;
            if (C48381Iyn.LIZ.booleanValue()) {
                VHW vhw = new VHW();
                vhw.LIZ = VHY.LIZ;
                vhw.LIZIZ = VHX.LIZ;
                vhw.LIZJ = this.LIZIZ.LIZIZ();
                InterfaceC79472VGy[] interfaceC79472VGyArr = C46430IKc.LIZ;
                int length = interfaceC79472VGyArr.length;
                while (i < length) {
                    InterfaceC79472VGy interfaceC79472VGy = interfaceC79472VGyArr[i];
                    if (!((ArrayList) vhw.LIZLLL).contains(interfaceC79472VGy)) {
                        ((ArrayList) vhw.LIZLLL).add(interfaceC79472VGy);
                    }
                    i++;
                }
                vhn = new VHN(vhw.LIZ, vhw.LIZIZ, vhw.LIZJ, vhw.LIZLLL);
            } else {
                VHU vhu = new VHU();
                vhu.LIZ = C56222M4s.LIZ;
                vhu.LIZIZ = C56221M4r.LIZ;
                vhu.LIZJ = this.LIZIZ.LIZIZ();
                vhu.LIZLLL = C56223M4t.LIZ;
                InterfaceC79472VGy[] interfaceC79472VGyArr2 = C46430IKc.LIZ;
                int length2 = interfaceC79472VGyArr2.length;
                while (i < length2) {
                    InterfaceC79472VGy interfaceC79472VGy2 = interfaceC79472VGyArr2[i];
                    if (!((ArrayList) vhu.LJ).contains(interfaceC79472VGy2)) {
                        ((ArrayList) vhu.LJ).add(interfaceC79472VGy2);
                    }
                    i++;
                }
                g gVar2 = vhu.LIZ;
                if ((gVar2 == null || gVar2.size() == 0) && (gVar = vhu.LIZIZ) != null) {
                    gVar.size();
                }
                g gVar3 = vhu.LIZLLL;
                if (gVar3 != null) {
                    gVar3.size();
                }
                vhn = new VHN(vhu.LIZ, vhu.LIZIZ, vhu.LIZJ, vhu.LIZLLL, vhu.LJ);
            }
            this.LIZ = vhn;
        }
        this.LIZ.LIZJ = this.LIZIZ.LIZIZ();
        return this.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.simkit.api.IDimensionBitrateCurveConfig
    public final boolean enable() {
        return C51932KZs.LIZ;
    }
}
