package X;

import android.content.Context;
import com.bytedance.bdlocation.BDLocation;
import com.bytedance.bdlocation.exception.BDLocationException;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.roaming.NearbyRegionListFragment;
import com.ss.android.ugc.aweme.roaming.RegionSearchViewModel;
import com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT;
import com.ss.android.ugc.tiktok.location_api.service.proxy.BDLocationProxy;
import kotlin.jvm.internal.o;

/* renamed from: X.LbU, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54580LbU implements InterfaceC56182M3e {
    public final /* synthetic */ NearbyRegionListFragment LIZ;

    public C54580LbU(NearbyRegionListFragment nearbyRegionListFragment) {
        this.LIZ = nearbyRegionListFragment;
    }

    @Override // X.InterfaceC56182M3e
    public final void LIZ(J0X j0x) {
        this.LIZ.vl().gv0(null, null, false);
    }

    @Override // X.InterfaceC56182M3e
    public final void LIZIZ(BDLocationProxy bDLocationProxy) {
        String str;
        String str2;
        boolean z;
        if (bDLocationProxy != null) {
            str = bDLocationProxy.getEncryptedLat();
            str2 = bDLocationProxy.getEncryptedLng();
        } else {
            str = null;
            str2 = null;
        }
        boolean isInAppPrecise = ((ILocationBaseServiceForMT) ServiceManager.get().getService(ILocationBaseServiceForMT.class)).isInAppPrecise();
        C73305Spp c73305Spp = this.LIZ.LJLIL;
        if (c73305Spp != null) {
            Context context = c73305Spp.getContext();
            boolean z2 = false;
            if (context != null) {
                z = ((ILocationBaseServiceForMT) ServiceManager.get().getService(ILocationBaseServiceForMT.class)).isSystemPrecise(context);
            } else {
                z = false;
            }
            RegionSearchViewModel vl = this.LIZ.vl();
            if (!isInAppPrecise || !z) {
                z2 = true;
            }
            vl.gv0(str, str2, z2);
            return;
        }
        o.LJIJI("statusView");
        throw null;
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
