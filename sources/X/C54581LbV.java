package X;

import Y.ARunnableS45S0100000_9;
import android.content.Context;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.bdlocation.BDLocation;
import com.bytedance.bdlocation.exception.BDLocationException;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.roaming.RegionSearchViewModel;
import com.ss.android.ugc.aweme.ui.NearbyFeedContentAssem;
import com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT;
import com.ss.android.ugc.tiktok.location_api.service.proxy.BDLocationProxy;
import kotlin.jvm.internal.AqS98S0300000_9;

/* renamed from: X.LbV, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54581LbV implements InterfaceC56182M3e {
    public final /* synthetic */ NearbyFeedContentAssem LIZ;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LIZIZ;

    @Override // X.InterfaceC56182M3e
    public final void LIZ(J0X j0x) {
        this.LIZ.getContainerView().post(new ARunnableS45S0100000_9((InterfaceC65784Pro) this.LIZIZ, 110));
    }

    @Override // X.InterfaceC56182M3e
    public final void LIZIZ(BDLocationProxy bDLocationProxy) {
        Object valueOf;
        boolean z;
        Object obj = null;
        if (bDLocationProxy != null) {
            obj = bDLocationProxy.getEncryptedLat();
        }
        if (obj == null) {
            obj = Double.valueOf(LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX);
        }
        String valueOf2 = String.valueOf(obj);
        if (bDLocationProxy == null || (valueOf = bDLocationProxy.getEncryptedLng()) == null) {
            valueOf = Double.valueOf(LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX);
        }
        String valueOf3 = String.valueOf(valueOf);
        boolean isInAppPrecise = ((ILocationBaseServiceForMT) ServiceManager.get().getService(ILocationBaseServiceForMT.class)).isInAppPrecise();
        Context context = this.LIZ.getContext();
        boolean z2 = false;
        if (context != null) {
            z = ((ILocationBaseServiceForMT) ServiceManager.get().getService(ILocationBaseServiceForMT.class)).isSystemPrecise(context);
        } else {
            z = false;
        }
        RegionSearchViewModel regionSearchViewModel = (RegionSearchViewModel) this.LIZ.LJLJLJ.getValue();
        if (!isInAppPrecise || !z) {
            z2 = true;
        }
        regionSearchViewModel.gv0(valueOf2, valueOf3, z2);
    }

    @Override // X.InterfaceC56182M3e, com.bytedance.bdlocation.callback.BDLocationCallback
    public final void onError(BDLocationException bDLocationException) {
        C56181M3d.LIZ(this, bDLocationException);
    }

    @Override // X.InterfaceC56182M3e, com.bytedance.bdlocation.callback.BDLocationCallback
    public final void onLocationChanged(BDLocation bDLocation) {
        C56181M3d.LIZIZ(this, bDLocation);
    }

    public C54581LbV(NearbyFeedContentAssem nearbyFeedContentAssem, AqS98S0300000_9 aqS98S0300000_9) {
        this.LIZ = nearbyFeedContentAssem;
        this.LIZIZ = aqS98S0300000_9;
    }
}
