package X;

import com.bytedance.bdlocation.BDLocation;
import com.bytedance.bdlocation.exception.BDLocationException;
import com.ss.android.ugc.aweme.poi.videopublish.PoiPublishExtensionAssem;
import com.ss.android.ugc.tiktok.location_api.service.proxy.BDLocationProxy;

/* renamed from: X.MDc, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56440MDc implements InterfaceC56182M3e {
    public final /* synthetic */ PoiPublishExtensionAssem LIZ;

    public C56440MDc(PoiPublishExtensionAssem poiPublishExtensionAssem) {
        this.LIZ = poiPublishExtensionAssem;
    }

    @Override // X.InterfaceC56182M3e
    public final void LIZ(J0X j0x) {
        this.LIZ.Y3(null);
    }

    @Override // X.InterfaceC56182M3e
    public final void LIZIZ(BDLocationProxy bDLocationProxy) {
        Double d;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("fetcherLocationAndRetry onLocationChanged location = ");
        Double d2 = null;
        if (bDLocationProxy != null) {
            d = Double.valueOf(bDLocationProxy.getLatitude());
        } else {
            d = null;
        }
        LIZ.append(d);
        LIZ.append(',');
        if (bDLocationProxy != null) {
            d2 = Double.valueOf(bDLocationProxy.getLongitude());
        }
        LIZ.append(d2);
        X1D.LIZIZ(LIZ);
        this.LIZ.Y3(bDLocationProxy);
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
