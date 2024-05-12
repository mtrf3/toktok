package X;

import com.ss.android.ugc.aweme.player.sdk.api.OnPreRenderListener;
import com.ss.android.ugc.playerkit.radar.SimRadar;

/* loaded from: classes9.dex */
public final class IZ3 implements InterfaceC47220Ig4 {
    public final Object LIZ;
    public Object LIZIZ;
    public Object LIZJ;

    @Override // X.InterfaceC47220Ig4
    public final void LIZLLL() {
    }

    @Override // X.InterfaceC47220Ig4
    public final void LJJIIJZLJL() {
    }

    @Override // X.InterfaceC47220Ig4
    public final void release() {
    }

    @Override // X.InterfaceC47220Ig4
    public final void resume() {
        ((IWH) this.LIZ).resume();
    }

    public /* synthetic */ IZ3(IWH iwh) {
        this.LIZ = iwh;
    }

    @Override // X.InterfaceC47220Ig4
    public final void LIZ(InterfaceC46811IYt interfaceC46811IYt) {
        IZ2 iz2 = (IZ2) this.LIZIZ;
        if (iz2 != null) {
            ((IWH) this.LIZ).setSurface(iz2.getSurface());
            if (((IZ2) this.LIZIZ).getSurface() == null) {
                SimRadar.errorScan("SurfaceBinder", "play", new C46690IUc("SurfaceBinder is null."), new Object[0]);
                IVN analyzer = SimRadar.analyzer();
                interfaceC46811IYt.getKey();
                analyzer.getClass();
                IVN.LIZIZ("SF-SurfaceBinderNull");
            } else {
                interfaceC46811IYt.LJII();
                SimRadar.keyScan("SurfaceBinder", "play", null);
            }
        } else {
            SimRadar.errorScan("SurfaceBinder", "play", new C46690IUc("PlayerHost is null."), new Object[0]);
            IVN analyzer2 = SimRadar.analyzer();
            interfaceC46811IYt.getKey();
            analyzer2.getClass();
            IVN.LIZIZ("SF-PlayHostNull");
        }
        if (this.LIZJ != null && interfaceC46811IYt.LJ() != null && interfaceC46811IYt.LJ().LIZ == null) {
            interfaceC46811IYt.LJ().LIZ = (OnPreRenderListener) this.LIZJ;
        }
        ((IWH) this.LIZ).LJIIL(C46810IYs.LIZ(interfaceC46811IYt, null));
    }

    @Override // X.InterfaceC47220Ig4
    public final void LIZIZ(IZ2 iz2) {
        this.LIZIZ = iz2;
    }

    @Override // X.InterfaceC47220Ig4
    public final void LIZJ(C47249IgX c47249IgX) {
        SimRadar.errorScan("SurfaceBinder", "preRender", new C46690IUc("Empty method!!!"), new Object[0]);
        SimRadar.analyzer().getClass();
        IVN.LIZIZ("SF-PreRenderEmpty");
    }

    @Override // X.InterfaceC47220Ig4
    public final void LJ(OnPreRenderListener onPreRenderListener) {
        this.LIZJ = onPreRenderListener;
    }

    public /* synthetic */ IZ3(Exception exc, Integer num, String str) {
        this.LIZ = num;
        this.LIZIZ = str;
        this.LIZJ = exc;
    }
}
