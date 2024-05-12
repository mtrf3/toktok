package X;

import com.bytedance.bdlocation.BDLocation;
import com.bytedance.bdlocation.exception.BDLocationException;
import com.ss.android.ugc.tiktok.location_api.service.proxy.BDLocationProxy;

/* renamed from: X.LbW, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54582LbW implements InterfaceC56182M3e {
    @Override // X.InterfaceC56182M3e
    public final void LIZ(J0X j0x) {
        if (j0x != null) {
            j0x.toString();
        }
    }

    @Override // X.InterfaceC56182M3e
    public final void LIZIZ(BDLocationProxy bDLocationProxy) {
        if (bDLocationProxy != null) {
            bDLocationProxy.toString();
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
