package X;

import com.bytedance.bpea.cert.token.TokenCert;
import com.ss.android.ugc.aweme.poi.detail.discovery.PoiDetailDiscoveryViewModel;
import com.ss.android.ugc.tiktok.location.serviceimpl.LocationServiceImpl;

/* renamed from: X.XcS, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85216XcS implements InterfaceC54674Ld0 {
    public final /* synthetic */ PoiDetailDiscoveryViewModel LIZ;

    @Override // X.InterfaceC54674Ld0
    public final void LIZ() {
        PoiDetailDiscoveryViewModel poiDetailDiscoveryViewModel = this.LIZ;
        poiDetailDiscoveryViewModel.getClass();
        if (!LocationServiceImpl.LJIJJ().LJIJ("android.permission.ACCESS_COARSE_LOCATION")) {
            return;
        }
        String str = poiDetailDiscoveryViewModel.LJLIL;
        if (str != null) {
            C2U8.LIZ(new IHN(str, true));
        }
        TokenCert with = TokenCert.Companion.with("bpea-poi_detail_discovery_fetch_gps");
        with.auth("sgix");
        C51733KSb.LIZ("poi", "anchor", with, null, new C85217XcT(poiDetailDiscoveryViewModel), 32);
    }

    public C85216XcS(PoiDetailDiscoveryViewModel poiDetailDiscoveryViewModel) {
        this.LIZ = poiDetailDiscoveryViewModel;
    }

    @Override // X.InterfaceC54674Ld0
    public final void LIZJ(int i) {
    }

    @Override // X.InterfaceC54674Ld0
    public final void LIZIZ(int i, String str) {
    }
}
