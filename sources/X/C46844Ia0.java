package X;

import android.os.Bundle;
import com.google.gson.internal.b;
import com.ss.android.ugc.playerkit.radar.SimRadar;
import com.ss.texturerender.VideoSurface;
import com.ss.ttvideoengine.TTVideoEngine;
import com.ss.ttvideoengine.TTVideoEngineImpl;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.Ia0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C46844Ia0 extends QXX implements InterfaceC46854IaA {
    public C46882Iac LJLIL;
    public String LJLILLLLZI;
    public boolean LJLJI;
    public C47172IfI LJLJJI;

    public C46844Ia0() {
        super((Object) null);
    }

    public final String toString() {
        return "VidDataSource";
    }

    @Override // X.QXX, X.IZY
    public final void LJJIJIL(java.util.Map<String, String> map) {
        C47172IfI c47172IfI;
        HashMap hashMap = (HashMap) map;
        hashMap.put("is_video_id", "1");
        if (this.LJLJI && (c47172IfI = this.LJLJJI) != null) {
            hashMap.put("vr_projection_model_type", String.valueOf(c47172IfI.LIZIZ(2)));
        }
    }

    @Override // X.QXX, X.IZY
    public final void LJJJJLI(C46882Iac c46882Iac) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VidDataSource.onRelease: isVR: ");
        LIZ.append(this.LJLJI);
        SimRadar.keyScan("TTPlayer", "EngineDataSourceHelper", X1D.LIZIZ(LIZ));
        ((List) c46882Iac.LJIJJLI.LJLIL).remove(this);
        if (this.LJLJI) {
            b.LJ(c46882Iac);
            VideoSurface videoSurface = c46882Iac.LIZ.O0;
            if (videoSurface != null) {
                videoSurface.mHeadposeChangedListener = null;
            }
            this.LJLJI = false;
            this.LJLJJI = null;
        }
    }

    @Override // X.InterfaceC46854IaA
    public final boolean onFetchedVideoInfo(C47164IfA c47164IfA) {
        boolean z;
        if (this.LJLIL == null) {
            return false;
        }
        C46914Ib8 c46914Ib8 = new C46914Ib8(c47164IfA);
        EnumC47176IfM LIZ = C47165IfB.LIZ(IUA.LIZ.LIZ().getProperResolution(this.LJLILLLLZI, c46914Ib8));
        if (LIZ == EnumC47176IfM.Undefine) {
            LIZ = TTVideoEngine.LJIIJJI(c47164IfA, EnumC47176IfM.Standard, 1);
        }
        this.LJLIL.LJII(LIZ);
        if (c47164IfA == null || c47164IfA.LJIIJ() == null || c47164IfA.LJIIJ().LIZIZ(0) != 1) {
            z = false;
        } else {
            z = true;
        }
        this.LJLJI = z;
        if (z) {
            C47172IfI LJIIJ = c47164IfA.LJIIJ();
            this.LJLJJI = LJIIJ;
            C46882Iac c46882Iac = this.LJLIL;
            Bundle bundle = new Bundle();
            if (LJIIJ != null) {
                bundle = b.LJIJJ(LJIIJ.LIZIZ(2), LJIIJ.LIZIZ(3), LJIIJ.LIZIZ(0), LJIIJ.LIZIZ(1));
            }
            b.LJJIJ(c46882Iac, bundle);
        }
        return false;
    }

    @Override // X.IZY
    public final void LJIIJ(C46882Iac c46882Iac, IXO ixo, String str, java.util.Map map) {
        EnumC47176IfM enumC47176IfM;
        this.LJLIL = c46882Iac;
        this.LJLILLLLZI = C78926UyI.LJJIIJ("group_id", map);
        c46882Iac.LJIJJLI.LIZJ(this);
        c46882Iac.LJLLLL(203, 1);
        c46882Iac.LJLLLL(160, 1);
        if (ixo.LJIILIIL) {
            c46882Iac.LJLLLL(29, 1);
            QXX.LLLLJ(c46882Iac, ixo);
        } else {
            EnumC47177IfN enumC47177IfN = ixo.LJIIIZ;
            if (enumC47177IfN != null) {
                enumC47176IfM = C47165IfB.LIZ(enumC47177IfN);
            } else {
                enumC47176IfM = EnumC47176IfM.SuperHigh;
            }
            c46882Iac.LJII(enumC47176IfM);
        }
        String str2 = ixo.LJ;
        TTVideoEngineImpl tTVideoEngineImpl = c46882Iac.LIZ;
        if (tTVideoEngineImpl.b5.LIZ(false)) {
            tTVideoEngineImpl.b5.LIZLLL(14, 0, 0, str2);
        } else {
            tTVideoEngineImpl.LJJLIIIJL(str2);
        }
        if (ixo.LJIIJJI != 0) {
            c46882Iac.LJLLLL(34, 1);
        } else {
            c46882Iac.LJLLLL(34, 0);
        }
        if (ixo.LJIIL == 0) {
            c46882Iac.LJLLLL(37, 0);
        } else {
            c46882Iac.LJLLLL(37, 1);
        }
        if (ixo.LJJI == 2) {
            c46882Iac.LLII(2, null);
            c46882Iac.LIZ.LLZIL = new C46850Ia6(ixo);
        } else {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(C16880lQ.LLLZ("https://%s/video/drm/v1/bdtoken?aid=", new Object[]{ixo.LJIILJJIL}));
            LIZ.append(ixo.LJII);
            LIZ.append("&vid=%s&kid=%s");
            c46882Iac.LLJILJIL(X1D.LIZIZ(LIZ));
            c46882Iac.LLII(1, ixo.LJFF);
            c46882Iac.LIZ.LLZIL = new C46846Ia2(ixo);
        }
        if (ixo.LJIIIIZZ) {
            c46882Iac.LJLLLL(33, 1);
            c46882Iac.LJLLLL(17, 1);
        } else {
            c46882Iac.LJLLLL(33, 0);
            c46882Iac.LJLLLL(17, 0);
        }
    }
}
