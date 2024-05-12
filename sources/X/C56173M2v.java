package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.bdlocation.BDLocation;
import com.bytedance.bdlocation.exception.BDLocationException;
import com.ss.android.ugc.aweme.placediscovery2.vm.DiscoveryLandingMapVM;
import com.ss.android.ugc.tiktok.location_api.service.proxy.BDLocationProxy;
import kotlin.jvm.internal.AqS175S0100000_9;

/* renamed from: X.M2v, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56173M2v implements InterfaceC56182M3e {
    public final /* synthetic */ DiscoveryLandingMapVM LIZ;

    public C56173M2v(DiscoveryLandingMapVM discoveryLandingMapVM) {
        this.LIZ = discoveryLandingMapVM;
    }

    @Override // X.InterfaceC56182M3e
    public final void LIZ(J0X j0x) {
        DiscoveryLandingMapVM discoveryLandingMapVM = this.LIZ;
        discoveryLandingMapVM.getClass();
        C78948Uye.LJIJ(M3D.LIZIZ, M3D.LJIIIIZZ, new AqS175S0100000_9(discoveryLandingMapVM, 541), new AqS175S0100000_9(discoveryLandingMapVM, 542));
    }

    @Override // X.InterfaceC56182M3e
    public final void LIZIZ(BDLocationProxy bDLocationProxy) {
        if (bDLocationProxy == null || (bDLocationProxy.getLatitude() == LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX && bDLocationProxy.getLongitude() == LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX)) {
            DiscoveryLandingMapVM discoveryLandingMapVM = this.LIZ;
            discoveryLandingMapVM.getClass();
            C78948Uye.LJIJ(M3D.LIZIZ, M3D.LJIIIIZZ, new AqS175S0100000_9(discoveryLandingMapVM, 541), new AqS175S0100000_9(discoveryLandingMapVM, 542));
            return;
        }
        DiscoveryLandingMapVM discoveryLandingMapVM2 = this.LIZ;
        C53748L7o c53748L7o = new C53748L7o(new C191427fG(bDLocationProxy.getLatitude(), bDLocationProxy.getLongitude()), Boolean.TRUE);
        discoveryLandingMapVM2.getClass();
        discoveryLandingMapVM2.LJLJI = c53748L7o;
        this.LIZ.kv0(true);
        C56165M2n.LIZIZ(new C56167M2p("GPS", null, C47261Igj.LJJIJ("KEY_INIT_MAP"), false, new AqS175S0100000_9(this.LIZ, 537), 48));
        this.LIZ.gv0(new C56174M2w(M3A.FIRST_LOAD, null, null, 6));
    }

    @Override // X.InterfaceC56182M3e, com.bytedance.bdlocation.callback.BDLocationCallback
    public final void onError(BDLocationException bDLocationException) {
        C56181M3d.LIZ(this, bDLocationException);
    }

    @Override // X.InterfaceC56182M3e, com.bytedance.bdlocation.callback.BDLocationCallback
    public final void onLocationChanged(BDLocation bDLocation) {
        C56181M3d.LIZIZ(this, bDLocation);
    }
}
