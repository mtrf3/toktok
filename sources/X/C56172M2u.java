package X;

import com.bytedance.bdlocation.BDLocation;
import com.bytedance.bdlocation.exception.BDLocationException;
import com.ss.android.ugc.tiktok.location_api.service.proxy.BDLocationProxy;

/* renamed from: X.M2u, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56172M2u implements InterfaceC56182M3e {
    public final /* synthetic */ InterfaceC88472Yns<BDLocationProxy, C76800UCe> LIZ;
    public final /* synthetic */ InterfaceC88472Yns<J0X, C76800UCe> LIZIZ;

    @Override // X.InterfaceC56182M3e
    public final void LIZ(J0X j0x) {
        InterfaceC88472Yns<J0X, C76800UCe> interfaceC88472Yns = this.LIZIZ;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(j0x);
        }
    }

    @Override // X.InterfaceC56182M3e
    public final void LIZIZ(BDLocationProxy bDLocationProxy) {
        InterfaceC88472Yns<BDLocationProxy, C76800UCe> interfaceC88472Yns = this.LIZ;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(bDLocationProxy);
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

    /* JADX WARN: Multi-variable type inference failed */
    public C56172M2u(InterfaceC88472Yns<? super BDLocationProxy, C76800UCe> interfaceC88472Yns, InterfaceC88472Yns<? super J0X, C76800UCe> interfaceC88472Yns2) {
        this.LIZ = interfaceC88472Yns;
        this.LIZIZ = interfaceC88472Yns2;
    }
}
