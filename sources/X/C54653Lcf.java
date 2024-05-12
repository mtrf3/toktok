package X;

import com.ss.android.ugc.aweme.placediscovery.param.MapBounds;
import com.ss.android.ugc.aweme.placediscovery2.api.DiscoveryPoiListApi;
import com.ss.android.ugc.aweme.placediscovery2.model.DiscoverMapResponse;
import com.ss.android.ugc.aweme.placediscovery2.model.MapCenter;
import kotlin.jvm.internal.o;

/* renamed from: X.Lcf, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54653Lcf implements InterfaceC54655Lch {
    @Override // X.InterfaceC54655Lch
    public final Object LJJLIIIJJI(C54654Lcg c54654Lcg, InterfaceC67352kd<? super DiscoverMapResponse> interfaceC67352kd) {
        Object obj;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7 = com.ss.android.ugc.aweme.app.api.Api.LIZ;
        InterfaceC789838c LJI = C79061V1d.LJI(str7, "API_URL_PREFIX_SI", str7);
        if (LJI != null) {
            obj = LJI.create(DiscoveryPoiListApi.class);
        } else {
            obj = null;
        }
        o.LJI(obj);
        DiscoveryPoiListApi discoveryPoiListApi = (DiscoveryPoiListApi) obj;
        String str8 = c54654Lcg.LIZ;
        String str9 = c54654Lcg.LIZIZ;
        int i = c54654Lcg.LIZJ;
        String str10 = c54654Lcg.LJI;
        int i2 = c54654Lcg.LIZLLL;
        int i3 = c54654Lcg.LJ;
        String str11 = c54654Lcg.LJIIJ;
        String str12 = c54654Lcg.LJIIIZ;
        MapBounds mapBounds = c54654Lcg.LJFF;
        if (mapBounds != null) {
            str = mapBounds.getMaxLng();
        } else {
            str = null;
        }
        MapBounds mapBounds2 = c54654Lcg.LJFF;
        if (mapBounds2 != null) {
            str2 = mapBounds2.getMinLng();
        } else {
            str2 = null;
        }
        MapBounds mapBounds3 = c54654Lcg.LJFF;
        if (mapBounds3 != null) {
            str3 = mapBounds3.getMaxLat();
        } else {
            str3 = null;
        }
        MapBounds mapBounds4 = c54654Lcg.LJFF;
        if (mapBounds4 != null) {
            str4 = mapBounds4.getMinLat();
        } else {
            str4 = null;
        }
        boolean z = c54654Lcg.LJIIIIZZ;
        MapCenter mapCenter = c54654Lcg.LJII;
        if (mapCenter != null) {
            str5 = mapCenter.getCenterLng();
        } else {
            str5 = null;
        }
        MapCenter mapCenter2 = c54654Lcg.LJII;
        if (mapCenter2 != null) {
            str6 = mapCenter2.getCenterLat();
        } else {
            str6 = null;
        }
        return discoveryPoiListApi.getPoiCategoryList(str8, str9, new Integer(i), new Integer(i2), i3, str12, str11, str, str3, str2, str4, str10, str5, str6, Boolean.valueOf(z), interfaceC67352kd);
    }
}
