package X;

import com.bytedance.bdlocation.BDLocation;
import com.bytedance.bdlocation.exception.BDLocationException;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.ss.android.ugc.tiktok.location_api.service.proxy.BDLocationProxy;

/* renamed from: X.XfV, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85405XfV implements InterfaceC56182M3e {
    public final /* synthetic */ CompletionBlock<OK9> LIZ;

    public C85405XfV(C37356ElM c37356ElM) {
        this.LIZ = c37356ElM;
    }

    @Override // X.InterfaceC56182M3e
    public final void LIZ(J0X j0x) {
        C31626Cb8.LIZ(this.LIZ, 0, "XGetCurrentLocation fetch location fail", 4);
    }

    @Override // X.InterfaceC56182M3e
    public final void LIZIZ(BDLocationProxy bDLocationProxy) {
        Double d;
        CompletionBlock<OK9> completionBlock = this.LIZ;
        Double d2 = null;
        XBaseModel LIZJ = ED5.LIZJ(OK9.class, null);
        OK9 ok9 = (OK9) LIZJ;
        if (bDLocationProxy != null) {
            d = Double.valueOf(bDLocationProxy.getLongitude());
        } else {
            d = null;
        }
        ok9.setLongitude(d);
        if (bDLocationProxy != null) {
            d2 = Double.valueOf(bDLocationProxy.getLatitude());
        }
        ok9.setLatitude(d2);
        completionBlock.onSuccess((XBaseResultModel) LIZJ, "");
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
