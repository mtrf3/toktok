package X;

import com.bytedance.bdlocation.BDLocation;
import com.bytedance.bdlocation.callback.BDLocationCallback;
import com.bytedance.bdlocation.exception.BDLocationException;

/* renamed from: X.ZoS, reason: case insensitive filesystem */
/* loaded from: classes24.dex */
public final class C91056ZoS implements BDLocationCallback {
    public final /* synthetic */ BDLocationCallback LIZ = null;

    @Override // com.bytedance.bdlocation.callback.BDLocationCallback
    public final void onError(BDLocationException bDLocationException) {
        BDLocationCallback bDLocationCallback = this.LIZ;
        if (bDLocationCallback != null) {
            bDLocationCallback.onError(bDLocationException);
        }
    }

    @Override // com.bytedance.bdlocation.callback.BDLocationCallback
    public final void onLocationChanged(BDLocation bDLocation) {
        BDLocationCallback bDLocationCallback = this.LIZ;
        if (bDLocationCallback != null) {
            bDLocationCallback.onLocationChanged(bDLocation);
        }
    }
}
