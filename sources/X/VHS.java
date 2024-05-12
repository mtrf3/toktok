package X;

import com.google.gson.g;
import com.ss.android.ugc.aweme.request_combine.common.ServerPortraitCollections;
import com.ss.android.ugc.aweme.requestcombine.IServerPortraitService;
import java.util.ArrayList;

/* loaded from: classes15.dex */
public final class VHS extends C48378Iyk {
    public VHN LIZ;
    public final IServerPortraitService LIZIZ = ServerPortraitCollections.LIZJ();

    @Override // com.ss.android.ugc.aweme.simkit.api.IDimensionBitrateFilterConfig
    public final VHN config() {
        g gVar;
        VHN vhn;
        if (this.LIZ == null) {
            int i = 0;
            if (C48381Iyn.LIZ.booleanValue()) {
                VHV vhv = new VHV();
                vhv.LIZ = C79474VHa.LIZ;
                vhv.LIZIZ = VHZ.LIZ;
                vhv.LIZJ = this.LIZIZ.LIZIZ();
                InterfaceC79472VGy[] interfaceC79472VGyArr = C46430IKc.LIZ;
                int length = interfaceC79472VGyArr.length;
                while (i < length) {
                    InterfaceC79472VGy interfaceC79472VGy = interfaceC79472VGyArr[i];
                    if (!((ArrayList) vhv.LIZLLL).contains(interfaceC79472VGy)) {
                        ((ArrayList) vhv.LIZLLL).add(interfaceC79472VGy);
                    }
                    i++;
                }
                vhn = new VHN(vhv.LIZ, vhv.LIZIZ, vhv.LIZJ, vhv.LIZLLL);
            } else {
                VHR vhr = new VHR();
                vhr.LIZ = C56225M4v.LIZ;
                vhr.LIZIZ = C56224M4u.LIZ;
                vhr.LIZJ = this.LIZIZ.LIZIZ();
                InterfaceC79472VGy[] interfaceC79472VGyArr2 = C46430IKc.LIZ;
                int length2 = interfaceC79472VGyArr2.length;
                while (i < length2) {
                    InterfaceC79472VGy interfaceC79472VGy2 = interfaceC79472VGyArr2[i];
                    if (!((ArrayList) vhr.LIZLLL).contains(interfaceC79472VGy2)) {
                        ((ArrayList) vhr.LIZLLL).add(interfaceC79472VGy2);
                    }
                    i++;
                }
                g gVar2 = vhr.LIZ;
                if ((gVar2 == null || gVar2.size() == 0) && (gVar = vhr.LIZIZ) != null) {
                    gVar.size();
                }
                vhn = new VHN(vhr.LIZ, vhr.LIZIZ, vhr.LIZJ, null, vhr.LIZLLL);
            }
            this.LIZ = vhn;
        }
        this.LIZ.LIZJ = this.LIZIZ.LIZIZ();
        return this.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.simkit.api.IDimensionBitrateFilterConfig
    public final boolean enable() {
        return C51933KZt.LIZ;
    }
}
