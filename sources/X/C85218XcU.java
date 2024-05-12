package X;

import com.bytedance.bdlocation.BDLocation;
import com.bytedance.bdlocation.exception.BDLocationException;
import com.ss.android.ugc.tiktok.location_api.service.proxy.BDLocationProxy;

/* renamed from: X.XcU, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85218XcU implements InterfaceC56182M3e {
    @Override // X.InterfaceC56182M3e
    public final void LIZ(J0X j0x) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("GPS - locationGPS onLocationError ");
        LIZ.append(j0x);
        C188447aS.LIZ(X1D.LIZIZ(LIZ));
    }

    @Override // X.InterfaceC56182M3e
    public final void LIZIZ(BDLocationProxy bDLocationProxy) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("GPS - locationGPS onLocationDataChanged location=");
        LIZ.append(bDLocationProxy);
        C188447aS.LIZ(X1D.LIZIZ(LIZ));
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
