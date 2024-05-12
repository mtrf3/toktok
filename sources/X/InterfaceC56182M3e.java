package X;

import com.bytedance.bdlocation.BDLocation;
import com.bytedance.bdlocation.callback.BDLocationCallback;
import com.bytedance.bdlocation.exception.BDLocationException;
import com.ss.android.ugc.tiktok.location_api.service.proxy.BDLocationProxy;

/* renamed from: X.M3e, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public interface InterfaceC56182M3e extends BDLocationCallback {
    void LIZ(J0X j0x);

    void LIZIZ(BDLocationProxy bDLocationProxy);

    @Override // com.bytedance.bdlocation.callback.BDLocationCallback
    void onError(BDLocationException bDLocationException);

    @Override // com.bytedance.bdlocation.callback.BDLocationCallback
    void onLocationChanged(BDLocation bDLocation);
}
