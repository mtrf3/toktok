package X;

import com.bytedance.bdlocation.BDLocation;
import com.bytedance.bdlocation.exception.BDLocationException;
import com.ss.android.ugc.tiktok.location_api.service.proxy.BDLocationProxy;

/* renamed from: X.AnM, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27288AnM implements InterfaceC56182M3e {
    @Override // X.InterfaceC56182M3e
    public final void LIZ(J0X j0x) {
    }

    @Override // X.InterfaceC56182M3e
    public final void LIZIZ(BDLocationProxy bDLocationProxy) {
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
