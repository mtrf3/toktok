package X;

import com.bytedance.bdlocation.BDLocation;
import com.bytedance.bdlocation.exception.BDLocationException;
import com.ss.android.ugc.tiktok.location_api.service.proxy.BDLocationProxy;

/* renamed from: X.M3d, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56181M3d {
    public static void LIZ(InterfaceC56182M3e interfaceC56182M3e, BDLocationException bDLocationException) {
        if (bDLocationException != null) {
            interfaceC56182M3e.LIZ(new J0X(bDLocationException));
        } else {
            interfaceC56182M3e.LIZ(null);
        }
    }

    public static void LIZIZ(InterfaceC56182M3e interfaceC56182M3e, BDLocation bDLocation) {
        if (bDLocation != null) {
            interfaceC56182M3e.LIZIZ(new BDLocationProxy(bDLocation));
        } else {
            interfaceC56182M3e.LIZIZ(null);
        }
    }
}
