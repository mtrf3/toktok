package X;

import androidx.lifecycle.LifecycleOwner;
import com.bytedance.bdlocation.BDLocation;
import com.bytedance.bdlocation.exception.BDLocationException;
import com.ss.android.ugc.aweme.poi.videopublish.v2.PoiPublishExtensionVMV2;
import com.ss.android.ugc.tiktok.location_api.service.proxy.BDLocationProxy;

/* renamed from: X.Xd7, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85257Xd7 implements InterfaceC56182M3e {
    public final /* synthetic */ PoiPublishExtensionVMV2 LIZ;
    public final /* synthetic */ LifecycleOwner LIZIZ;

    @Override // X.InterfaceC56182M3e
    public final void LIZ(J0X j0x) {
        this.LIZ.hv0(null, this.LIZIZ);
    }

    @Override // X.InterfaceC56182M3e
    public final void LIZIZ(BDLocationProxy bDLocationProxy) {
        Double d;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("fetchLocationAndRetry onLocationChanged location = ");
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
        this.LIZ.hv0(bDLocationProxy, this.LIZIZ);
    }

    @Override // X.InterfaceC56182M3e, com.bytedance.bdlocation.callback.BDLocationCallback
    public final void onError(BDLocationException bDLocationException) {
        C56181M3d.LIZ(this, bDLocationException);
    }

    @Override // X.InterfaceC56182M3e, com.bytedance.bdlocation.callback.BDLocationCallback
    public final void onLocationChanged(BDLocation bDLocation) {
        C56181M3d.LIZIZ(this, bDLocation);
    }

    public C85257Xd7(PoiPublishExtensionVMV2 poiPublishExtensionVMV2, LifecycleOwner lifecycleOwner) {
        this.LIZ = poiPublishExtensionVMV2;
        this.LIZIZ = lifecycleOwner;
    }
}
