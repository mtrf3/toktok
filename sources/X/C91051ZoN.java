package X;

import com.bytedance.bdlocation.BDLocation;
import com.bytedance.bdlocation.callback.BDLocationCallback;
import com.bytedance.bdlocation.callback.LocateCallback;
import com.bytedance.bdlocation.client.LocationOption;
import com.bytedance.bdlocation.exception.BDLocationException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.ZoN, reason: case insensitive filesystem */
/* loaded from: classes24.dex */
public class C91051ZoN implements LocateCallback {
    public boolean LIZ;
    public LocationOption LIZIZ;
    public final List<BDLocationCallback> LIZJ = new ArrayList();

    public final synchronized void LIZIZ() {
        ((ArrayList) this.LIZJ).clear();
    }

    public final synchronized boolean LIZJ() {
        return this.LIZ;
    }

    public final synchronized void LIZ(BDLocationCallback bDLocationCallback) {
        ((ArrayList) this.LIZJ).add(bDLocationCallback);
    }

    public final boolean LIZLLL(LocationOption locationOption) {
        LocationOption locationOption2;
        if (locationOption != null && (locationOption2 = this.LIZIZ) != null && locationOption2.isLatestAdminVersion() != locationOption.isLatestAdminVersion()) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.bdlocation.callback.LocateCallback
    public final synchronized void onLocateStart(String str) {
        this.LIZ = true;
    }

    @Override // com.bytedance.bdlocation.callback.LocateCallback
    public final synchronized void onLocateStop(String str) {
        this.LIZ = false;
        this.LIZIZ = null;
    }

    @Override // com.bytedance.bdlocation.callback.LocateCallback
    public final synchronized void onLocateChange(String str, BDLocation bDLocation) {
    }

    @Override // com.bytedance.bdlocation.callback.LocateCallback
    public final synchronized void onLocateError(String str, BDLocationException bDLocationException) {
    }
}
