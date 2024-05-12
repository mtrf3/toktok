package X;

import com.bytedance.bdlocation.BDLocation;
import com.bytedance.bdlocation.exception.BDLocationException;
import com.ss.android.ugc.aweme.poi.GuitarBundle;
import com.ss.android.ugc.aweme.poi.PokerBundle;
import com.ss.android.ugc.tiktok.location_api.service.proxy.BDLocationProxy;
import kotlin.jvm.internal.o;

/* renamed from: X.XfW, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85406XfW implements InterfaceC56182M3e {
    public final /* synthetic */ ICY LIZ;
    public final /* synthetic */ int LIZIZ;

    @Override // X.InterfaceC56182M3e
    public final void LIZ(J0X j0x) {
        this.LIZ.LJFF(this.LIZIZ, j0x);
    }

    @Override // X.InterfaceC56182M3e
    public final void LIZIZ(BDLocationProxy bDLocationProxy) {
        try {
            if (bDLocationProxy != null) {
                GuitarBundle guitarBundle = new GuitarBundle(bDLocationProxy.getLatitude(), bDLocationProxy.getLongitude());
                String geoNameID = bDLocationProxy.getGeoNameID();
                String str = "";
                if (geoNameID == null) {
                    geoNameID = "";
                }
                String district = bDLocationProxy.getDistrict();
                if (district == null) {
                    district = "";
                }
                String country = bDLocationProxy.getCountry();
                if (country == null) {
                    country = "";
                }
                String administrativeArea = bDLocationProxy.getAdministrativeArea();
                if (administrativeArea == null) {
                    administrativeArea = "";
                }
                String city = bDLocationProxy.getCity();
                if (city != null) {
                    str = city;
                }
                PokerBundle pokerBundle = new PokerBundle(geoNameID, district, country, administrativeArea, str);
                ICY icy = this.LIZ;
                long j = this.LIZIZ;
                String jSONObject = icy.LJ(guitarBundle.getLongitude(), guitarBundle.getLatitude(), 0).toString();
                o.LJIIIIZZ(jSONObject, "generateResponse(\n      …             ).toString()");
                icy.LIZLLL(j, jSONObject);
                EHH.LIZ.put(EHH.LIZ(Double.valueOf(guitarBundle.getLongitude()), Double.valueOf(guitarBundle.getLatitude())), pokerBundle);
                ICY.LIZLLL = true;
                return;
            }
            throw new IllegalAccessException("IPoiService fetchGuitar return null");
        } catch (IllegalAccessException e) {
            this.LIZ.LJFF(this.LIZIZ, e);
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

    public C85406XfW(ICY icy, int i) {
        this.LIZ = icy;
        this.LIZIZ = i;
    }
}
