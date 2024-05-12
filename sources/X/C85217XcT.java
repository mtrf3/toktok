package X;

import com.bytedance.bdlocation.BDLocation;
import com.bytedance.bdlocation.exception.BDLocationException;
import com.ss.android.ugc.aweme.poi.detail.discovery.PoiDetailDiscoveryViewModel;
import com.ss.android.ugc.tiktok.location_api.service.proxy.BDLocationProxy;

/* renamed from: X.XcT, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85217XcT implements InterfaceC56182M3e {
    public final /* synthetic */ PoiDetailDiscoveryViewModel LIZ;

    public C85217XcT(PoiDetailDiscoveryViewModel poiDetailDiscoveryViewModel) {
        this.LIZ = poiDetailDiscoveryViewModel;
    }

    @Override // X.InterfaceC56182M3e
    public final void LIZ(J0X j0x) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("GPS - locationGPS onLocationError ");
        LIZ.append(j0x);
        C188447aS.LIZ(X1D.LIZIZ(LIZ));
        String str = this.LIZ.LJLIL;
        if (str != null) {
            C2U8.LIZ(new IHN(str, false));
        }
    }

    @Override // X.InterfaceC56182M3e
    public final void LIZIZ(BDLocationProxy bDLocationProxy) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("GPS - locationGPS onLocationDataChanged location=");
        LIZ.append(bDLocationProxy);
        C188447aS.LIZ(X1D.LIZIZ(LIZ));
        PoiDetailDiscoveryViewModel poiDetailDiscoveryViewModel = this.LIZ;
        String str = poiDetailDiscoveryViewModel.LJLIL;
        if (str != null) {
            poiDetailDiscoveryViewModel.LJLJJL = true;
            poiDetailDiscoveryViewModel.gv0(str);
        }
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
