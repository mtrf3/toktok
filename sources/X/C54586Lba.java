package X;

import com.bytedance.bdlocation.BDLocation;
import com.bytedance.bdlocation.exception.BDLocationException;
import com.ss.android.ugc.aweme.placediscovery.manager.NearbyCategoryTabViewModel;
import com.ss.android.ugc.aweme.placediscovery.ui.NearbyTopDrawerAssem;
import com.ss.android.ugc.tiktok.location_api.service.proxy.BDLocationProxy;

/* renamed from: X.Lba, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54586Lba implements InterfaceC56182M3e {
    public final /* synthetic */ NearbyTopDrawerAssem LIZ;
    public final /* synthetic */ ActivityC45651qj LIZIZ;

    @Override // X.InterfaceC56182M3e
    public final void LIZ(J0X j0x) {
        if (j0x != null) {
            j0x.toString();
        }
        NearbyCategoryTabViewModel H3 = this.LIZ.H3();
        LXZ.LIZ.getClass();
        H3.gv0(LXZ.LIZ(), LJ5.LJI(this.LIZIZ));
    }

    @Override // X.InterfaceC56182M3e
    public final void LIZIZ(BDLocationProxy bDLocationProxy) {
        if (bDLocationProxy != null) {
            bDLocationProxy.toString();
        }
        NearbyCategoryTabViewModel H3 = this.LIZ.H3();
        LXZ.LIZ.getClass();
        H3.gv0(LXZ.LIZ(), LJ5.LJI(this.LIZIZ));
    }

    @Override // X.InterfaceC56182M3e, com.bytedance.bdlocation.callback.BDLocationCallback
    public final void onError(BDLocationException bDLocationException) {
        C56181M3d.LIZ(this, bDLocationException);
    }

    @Override // X.InterfaceC56182M3e, com.bytedance.bdlocation.callback.BDLocationCallback
    public final void onLocationChanged(BDLocation bDLocation) {
        C56181M3d.LIZIZ(this, bDLocation);
    }

    public C54586Lba(NearbyTopDrawerAssem nearbyTopDrawerAssem, ActivityC45651qj activityC45651qj) {
        this.LIZ = nearbyTopDrawerAssem;
        this.LIZIZ = activityC45651qj;
    }
}
