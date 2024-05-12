package com.ss.android.ugc.tiktok.location_api.service;

import X.AbstractC73672Svk;
import X.ActivityC45651qj;
import X.C164906da;
import X.C188727au;
import X.C47261Igj;
import X.C51556KLg;
import X.C58204Msq;
import X.C58607MzL;
import X.C76800UCe;
import X.C85258Xd8;
import X.C85296Xdk;
import X.E8H;
import X.EF7;
import X.FMX;
import X.InterfaceC54674Ld0;
import X.InterfaceC57784Mm4;
import X.InterfaceC65784Pro;
import X.InterfaceC88472Yns;
import X.M3Z;
import X.OHI;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.bdlocation.init.LocationInitConfig;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.pumbaa.bpea.adapter.BPEAServiceImp;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.poi.model.PoiSearchRequestBody;
import com.ss.android.ugc.aweme.poi_api.service.IPoiService;
import com.ss.android.ugc.tiktok.location.serviceimpl.LocationServiceImpl;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class LocationServiceForM implements ILocationBaseServiceForMT {
    public static final C58204Msq Companion = new C58204Msq();

    @Override // com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT
    public void doAfterRequestPermissions(List<C164906da> results) {
        o.LJIIIZ(results, "results");
    }

    @Override // com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT
    public View getGpsBannerHeaderConvertedView(Context context, ViewGroup viewGroup, InterfaceC65784Pro<C76800UCe> click) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(viewGroup, "viewGroup");
        o.LJIIIZ(click, "click");
        return null;
    }

    @Override // com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT
    public Class<? extends PowerCell<?>> getLocationAccuracySettingCell() {
        return null;
    }

    @Override // com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT
    public InterfaceC57784Mm4 getLocationAccuracySettingItem() {
        return null;
    }

    @Override // com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT
    public boolean inAppPreciseUnknown() {
        return false;
    }

    @Override // com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT
    public void initPermissionAccuracyAndGPSProvider(LocationInitConfig.Builder builder) {
        o.LJIIIZ(builder, "builder");
    }

    @Override // com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT
    public void injectMobParams(Context context, Map<String, String> params) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(params, "params");
    }

    @Override // com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT
    public boolean isInAppPrecise() {
        return false;
    }

    @Override // com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT
    public boolean isSupportedPreciseGps() {
        return false;
    }

    @Override // com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT
    public boolean isSystemPrecise(Context context) {
        o.LJIIIZ(context, "context");
        return false;
    }

    @Override // com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT
    public boolean needShowAccuracySettingCell(Context context) {
        return false;
    }

    @Override // com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT
    public void requestSystemConversionPopup(String business, String scene, Cert cert, ActivityC45651qj activity, C85258Xd8 c85258Xd8, InterfaceC54674Ld0 interfaceC54674Ld0, boolean z, boolean z2) {
        o.LJIIIZ(business, "business");
        o.LJIIIZ(scene, "scene");
        o.LJIIIZ(cert, "cert");
        o.LJIIIZ(activity, "activity");
    }

    @Override // com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT
    public AbstractC73672Svk<String> searchPoi(String contentType, String signature, String biz, PoiSearchRequestBody body) {
        o.LJIIIZ(contentType, "contentType");
        o.LJIIIZ(signature, "signature");
        o.LJIIIZ(biz, "biz");
        o.LJIIIZ(body, "body");
        return null;
    }

    @Override // com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT
    public void updateInAppPrecise(boolean z) {
    }

    @Override // com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT
    public void uploadInAppPreciseStatusAfterAppLaunch() {
    }

    @Override // com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT
    public Map<String, String> getLocationCommonParamsIfHave() {
        String str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C85296Xdk.LIZ.getClass();
        if (!C85296Xdk.LJFF()) {
            PermissionCache.LJLIL.getClass();
            if (PermissionCache.LIZIZ("android.permission.ACCESS_COARSE_LOCATION")) {
                str = "1";
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            linkedHashMap.put("enable_location", str);
        }
        return linkedHashMap;
    }

    @Override // com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT
    public List<String> locationPermissions() {
        return C47261Igj.LJJIJIL("android.permission.ACCESS_COARSE_LOCATION");
    }

    @Override // com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT
    public void bindAccuracyFetcher() {
        BPEAServiceImp.LIZJ().LIZ(new C58607MzL());
    }

    @Override // com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT
    public String getPermissionPopupHintViewTitle(Context context) {
        o.LJIIIZ(context, "context");
        String string = context.getString(R.string.ill);
        o.LJIIIIZZ(string, "context.getString(R.string.nearbytab_gps_title)");
        return string;
    }

    @Override // com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT
    public void mobLocationStatus(boolean z, InterfaceC88472Yns<? super Boolean, C76800UCe> block) {
        boolean z2;
        String str;
        o.LJIIIZ(block, "block");
        Context LIZIZ = EF7.LIZIZ();
        try {
            OHI.LIZ.getClass();
            z2 = OHI.LJ(LIZIZ, "android.permission.ACCESS_COARSE_LOCATION");
        } catch (Exception e) {
            e.getMessage();
            z2 = false;
        }
        block.invoke(Boolean.valueOf(z2));
        C188727au c188727au = new C188727au();
        if (z2) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c188727au.LJIIIZ("is_open", str);
        FMX.LJIIL("location_status", c188727au.LIZ);
        C51556KLg.LIZ.getClass();
        IPoiService LIZ = C51556KLg.LIZ();
        M3Z m3z = new M3Z("diff_nearby_tab_config_with_location_config");
        m3z.LIZ(z ? 1L : 0L);
        LIZ.LJJLIIIJ(m3z);
    }

    @Override // com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT
    public View getGpsBannerHeaderView(Context context, ViewGroup viewGroup, InterfaceC88472Yns<? super Boolean, C76800UCe> clickOnCoarse, InterfaceC65784Pro<C76800UCe> clickOnPrecise, InterfaceC65784Pro<C76800UCe> hasPermission) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(viewGroup, "viewGroup");
        o.LJIIIZ(clickOnCoarse, "clickOnCoarse");
        o.LJIIIZ(clickOnPrecise, "clickOnPrecise");
        o.LJIIIZ(hasPermission, "hasPermission");
        ILocationService LJIJJ = LocationServiceImpl.LJIJJ();
        if (!LJIJJ.LJFF() && !LJIJJ.LJ()) {
            return null;
        }
        View LJIIJ = LJIJJ.LJIIJ(context, viewGroup);
        if (LJIIJ != null) {
            OHI.LIZ.getClass();
            if (!OHI.LJ(context, "android.permission.ACCESS_COARSE_LOCATION")) {
                LJIJJ.LJIIL(context, LJIIJ, new AqS158S0100000_8(clickOnCoarse, (InterfaceC88472Yns<? super Boolean, C76800UCe>) 418));
            } else {
                hasPermission.invoke();
            }
        }
        return LJIIJ;
    }

    @Override // com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT
    public void requestInAppConversionPopup(String enterFrom, String str, ActivityC45651qj activity, E8H e8h, Cert cert, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro2, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro3, String str2) {
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(cert, "cert");
        if (interfaceC65784Pro3 != null) {
            interfaceC65784Pro3.invoke();
        }
    }
}
