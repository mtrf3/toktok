package X;

import androidx.lifecycle.Lifecycle;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.bdlocation.BDLocation;
import com.bytedance.bdlocation.exception.BDLocationException;
import com.ss.android.ugc.aweme.poi.search.PoiSearchAssem;
import com.ss.android.ugc.aweme.poi.search.PoiSearchVM;
import com.ss.android.ugc.tiktok.location.serviceimpl.LocationServiceImpl;
import com.ss.android.ugc.tiktok.location_api.service.proxy.BDLocationProxy;

/* renamed from: X.XcV, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85219XcV implements InterfaceC56182M3e {
    public final /* synthetic */ PoiSearchAssem LIZ;

    public C85219XcV(PoiSearchAssem poiSearchAssem) {
        this.LIZ = poiSearchAssem;
    }

    @Override // X.InterfaceC56182M3e
    public final void LIZ(J0X j0x) {
        if (this.LIZ.getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED) {
            return;
        }
        PoiSearchVM A3 = this.LIZ.A3();
        boolean LJIJ = LocationServiceImpl.LJIJJ().LJIJ("android.permission.ACCESS_COARSE_LOCATION");
        A3.LJLJLLL = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
        A3.LJLL = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
        A3.LJLLI = LJIJ;
        this.LIZ.Gj(null, true);
    }

    @Override // X.InterfaceC56182M3e
    public final void LIZIZ(BDLocationProxy bDLocationProxy) {
        double d;
        if (this.LIZ.getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED) {
            return;
        }
        PoiSearchVM A3 = this.LIZ.A3();
        double d2 = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
        if (bDLocationProxy != null) {
            d = bDLocationProxy.getLatitude();
            d2 = bDLocationProxy.getLongitude();
        } else {
            d = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
        }
        boolean LJIJ = LocationServiceImpl.LJIJJ().LJIJ("android.permission.ACCESS_COARSE_LOCATION");
        A3.LJLJLLL = d;
        A3.LJLL = d2;
        A3.LJLLI = LJIJ;
        this.LIZ.Gj(null, true);
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
