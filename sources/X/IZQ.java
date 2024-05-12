package X;

import android.os.Bundle;
import com.google.gson.internal.b;
import com.ss.android.ugc.playerkit.radar.SimRadar;
import com.ss.texturerender.VideoSurface;
import java.util.HashMap;

/* loaded from: classes9.dex */
public final class IZQ extends C46859IaF {
    public final IVW LJLJI;

    @Override // X.C46859IaF
    public final String toString() {
        return "VRUrlDataSource";
    }

    @Override // X.C46859IaF, X.IZY
    public final void LJJIJIL(java.util.Map<String, String> map) {
        ((HashMap) map).put("vr_projection_model_type", String.valueOf(this.LJLJI.getProjectionModel()));
    }

    @Override // X.C46859IaF, X.IZY
    public final void LJJJJLI(C46882Iac c46882Iac) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VRUrlDataSource: ");
        LIZ.append(this);
        LIZ.append(" onRelease: closeVR");
        SimRadar.keyScan("TTPlayer", "EngineDataSourceHelper", X1D.LIZIZ(LIZ));
        b.LJ(c46882Iac);
        VideoSurface videoSurface = c46882Iac.LIZ.O0;
        if (videoSurface != null) {
            videoSurface.mHeadposeChangedListener = null;
        }
    }

    public IZQ(InterfaceC46804IYm interfaceC46804IYm, IVW ivw) {
        super(interfaceC46804IYm);
        this.LJLJI = ivw;
    }

    @Override // X.C46859IaF, X.IZY
    public final void LJIIJ(C46882Iac c46882Iac, IXO ixo, String str, java.util.Map map) {
        super.LJIIJ(c46882Iac, ixo, str, map);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VRUrlDataSource: onPrepare: VRUtil.setVREffect: ");
        LIZ.append(this.LJLIL.getSourceId());
        SimRadar.keyScan("TTPlayer", "EngineDataSourceHelper", X1D.LIZIZ(LIZ));
        IVW ivw = this.LJLJI;
        Bundle bundle = new Bundle();
        if (ivw != null) {
            bundle = b.LJIJJ(ivw.getProjectionModel(), ivw.getViewSize(), ivw.getVideoStyle(), ivw.getDimension());
        }
        b.LJJIJ(c46882Iac, bundle);
    }
}
