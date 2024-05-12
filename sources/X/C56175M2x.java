package X;

import com.bytedance.bpea.cert.token.TokenCert;
import com.ss.android.ugc.aweme.app.host.AwemeHostApplication;
import com.ss.android.ugc.aweme.placediscovery.model.PoiCategory;
import com.ss.android.ugc.aweme.placediscovery.param.MapBounds;
import com.ss.android.ugc.aweme.placediscovery.param.PoiDiscoveryLandingPageParams;
import com.ss.android.ugc.aweme.placediscovery2.vm.DiscoveryLandingMapVM;
import com.ss.android.ugc.tiktok.location_api.service.LocationRegion;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS140S0200000_9;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.AqS175S0100000_9;
import kotlin.jvm.internal.o;

/* renamed from: X.M2x, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56175M2x {
    public static final /* synthetic */ int LJI = 0;
    public InterfaceC56168M2q LIZ;
    public C8DU LIZIZ;
    public DiscoveryLandingMapVM LIZJ;
    public final InterfaceC56171M2t[] LIZLLL = {new M30(), new M31(), new C78842Uww()};
    public InterfaceC56171M2t LJ = new M30();
    public XKQ LJFF;

    public final void LIZIZ() {
        C191427fG c191427fG;
        MapBounds mapBounds;
        M3B LJIIJJI;
        DiscoveryLandingMapVM discoveryLandingMapVM = this.LIZJ;
        if (discoveryLandingMapVM != null) {
            C53748L7o c53748L7o = discoveryLandingMapVM.LJLJI;
            if (c53748L7o != null) {
                c191427fG = c53748L7o.LIZ;
            } else {
                c191427fG = null;
            }
            if (c191427fG != null) {
                C8DU c8du = this.LIZIZ;
                if (c8du != null) {
                    Float valueOf = Float.valueOf(c8du.LJJJJL());
                    M3P m3p = new M3P();
                    m3p.LIZ = true;
                    m3p.LIZJ = new AqS159S0100000_9(this, 823);
                    m3p.LIZLLL = new AqS159S0100000_9(this, 824);
                    c8du.LJJJ(c191427fG, valueOf, m3p);
                    return;
                }
                return;
            }
            if (discoveryLandingMapVM == null || (mapBounds = discoveryLandingMapVM.LJLJJLL) == null || (LJIIJJI = C78948Uye.LJIIJJI(mapBounds)) == null) {
                return;
            }
            C8DU c8du2 = this.LIZIZ;
            C191427fG c191427fG2 = new C191427fG(LJIIJJI.getMaxLat(), LJIIJJI.getMinLng());
            C191427fG c191427fG3 = new C191427fG(LJIIJJI.getMinLat(), LJIIJJI.getMaxLng());
            if (c8du2 == null) {
                return;
            }
            M3P m3p2 = new M3P();
            m3p2.LIZ = true;
            m3p2.LIZJ = new AqS159S0100000_9(this, 821);
            m3p2.LIZLLL = new AqS159S0100000_9(this, 822);
            c8du2.LJJJJ(c191427fG2, c191427fG3, m3p2);
        }
    }

    public final void LIZJ() {
        DiscoveryLandingMapVM discoveryLandingMapVM = this.LIZJ;
        XKQ xkq = null;
        if (discoveryLandingMapVM != null) {
            xkq = discoveryLandingMapVM.gv0(new C56174M2w(M3A.FIND_PLACES_NEARBY, null, null, 6));
        }
        this.LJFF = xkq;
    }

    public final void LIZLLL() {
        InterfaceC56168M2q interfaceC56168M2q = this.LIZ;
        if (interfaceC56168M2q != null) {
            interfaceC56168M2q.LJFF();
        }
        InterfaceC56168M2q interfaceC56168M2q2 = this.LIZ;
        if (interfaceC56168M2q2 != null) {
            interfaceC56168M2q2.LJII();
        }
        InterfaceC56168M2q interfaceC56168M2q3 = this.LIZ;
        if (interfaceC56168M2q3 != null) {
            interfaceC56168M2q3.LJ(true);
        }
    }

    public final void LJFF() {
        C53748L7o c53748L7o;
        XKQ xkq = this.LJFF;
        if (xkq != null) {
            xkq.LIZIZ(null);
        }
        InterfaceC56168M2q interfaceC56168M2q = this.LIZ;
        if (interfaceC56168M2q != null) {
            interfaceC56168M2q.LIZIZ();
        }
        InterfaceC56168M2q interfaceC56168M2q2 = this.LIZ;
        if (interfaceC56168M2q2 != null) {
            interfaceC56168M2q2.LIZLLL();
        }
        DiscoveryLandingMapVM discoveryLandingMapVM = this.LIZJ;
        if (discoveryLandingMapVM != null) {
            discoveryLandingMapVM.setState(new AqS175S0100000_9(new ArrayList(), (List<PoiCategory>) 543));
        }
        DiscoveryLandingMapVM discoveryLandingMapVM2 = this.LIZJ;
        if (discoveryLandingMapVM2 == null || (c53748L7o = discoveryLandingMapVM2.LJLJI) == null || !o.LJ(c53748L7o.LIZIZ, Boolean.FALSE)) {
            C78948Uye.LJIJ(M3D.LIZJ, M3D.LJIIIIZZ, new AqS175S0100000_9(this, 429), new AqS175S0100000_9(this, 430));
        } else {
            LIZIZ();
        }
    }

    public C56175M2x() {
        LIZ();
    }

    public final void LIZ() {
        InterfaceC56171M2t interfaceC56171M2t;
        if (C56156M2e.LIZ()) {
            interfaceC56171M2t = this.LIZLLL[2];
        } else {
            OHI ohi = OHI.LIZ;
            AwemeHostApplication LIZ = FKM.LIZ();
            ohi.getClass();
            if (OHI.LJ(LIZ, "android.permission.ACCESS_COARSE_LOCATION")) {
                interfaceC56171M2t = this.LIZLLL[1];
            } else {
                interfaceC56171M2t = this.LIZLLL[0];
            }
        }
        if (!o.LJ(this.LJ.getClass(), interfaceC56171M2t.getClass())) {
            XKQ xkq = this.LJFF;
            if (xkq != null) {
                xkq.LIZIZ(null);
            }
            this.LJ.LIZLLL(this);
            this.LJ = interfaceC56171M2t;
            interfaceC56171M2t.LIZIZ(this);
        }
    }

    public final void LJ(TokenCert cert) {
        LocationRegion locationRegion;
        PoiDiscoveryLandingPageParams poiDiscoveryLandingPageParams;
        o.LJIIIZ(cert, "cert");
        InterfaceC56168M2q interfaceC56168M2q = this.LIZ;
        if (interfaceC56168M2q != null) {
            interfaceC56168M2q.LIZIZ();
        }
        InterfaceC56168M2q interfaceC56168M2q2 = this.LIZ;
        if (interfaceC56168M2q2 != null) {
            interfaceC56168M2q2.LIZLLL();
        }
        InterfaceC56168M2q interfaceC56168M2q3 = this.LIZ;
        if (interfaceC56168M2q3 != null) {
            interfaceC56168M2q3.LJ(false);
        }
        DiscoveryLandingMapVM discoveryLandingMapVM = this.LIZJ;
        if (discoveryLandingMapVM != null && (poiDiscoveryLandingPageParams = discoveryLandingMapVM.LJLILLLLZI) != null) {
            locationRegion = poiDiscoveryLandingPageParams.getCurrentRegion();
        } else {
            locationRegion = null;
        }
        C78948Uye.LJIJ(cert, M3D.LJIIIIZZ, new AqS140S0200000_9(this, locationRegion, 60), new AqS175S0100000_9(this, 431));
    }
}
