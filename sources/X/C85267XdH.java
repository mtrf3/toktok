package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.bpea.basics.Cert;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.poi.api.PoiSearchApi;
import com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.XdH, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85267XdH {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZJ(String message) {
        o.LJIIIZ(message, "message");
    }

    public static boolean LIZ(C85268XdI poiSearchQuery) {
        boolean z;
        o.LJIIIZ(poiSearchQuery, "poiSearchQuery");
        ILocationBaseServiceForMT iLocationBaseServiceForMT = (ILocationBaseServiceForMT) ServiceManager.get().getService(ILocationBaseServiceForMT.class);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("checkDoClientRank: scenario: ");
        LIZ2.append(poiSearchQuery.LJFF);
        LIZ2.append("; keywords: ");
        LIZ2.append(poiSearchQuery.LJ);
        LIZ2.append("; experiment: ");
        if (C00F.LIZ(31744, 0, "poi_use_client_recommendation_rank", false) == 1) {
            z = true;
        } else {
            z = false;
        }
        LIZ2.append(z);
        LIZ2.append("; lat: ");
        LIZ2.append(poiSearchQuery.LIZIZ);
        LIZ2.append("; lng: ");
        LIZ2.append(poiSearchQuery.LIZ);
        LIZ2.append("; systemPrecise: ");
        LIZ2.append(iLocationBaseServiceForMT.isSystemPrecise(EF7.LIZIZ()));
        LIZ2.append("; inAppPrecise: ");
        LIZ2.append(iLocationBaseServiceForMT.isInAppPrecise());
        LIZJ(X1D.LIZIZ(LIZ2));
        FFL.LJIIIZ().getClass();
        if (FFL.LJIIJ(31744, 0, "poi_use_client_recommendation_rank", false) != 1 || C78685UuP.LJJJZ(poiSearchQuery.LJ)) {
            return false;
        }
        if (poiSearchQuery.LIZIZ == LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX && poiSearchQuery.LIZ == LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) {
            return false;
        }
        if (iLocationBaseServiceForMT.isSystemPrecise(EF7.LIZIZ()) && iLocationBaseServiceForMT.isInAppPrecise()) {
            return false;
        }
        return true;
    }

    public static void LIZLLL(long j, long j2, long j3, String str) {
        StringBuilder LIZJ = C06490Nh.LIZJ("mobClientRank, request_type: ", str, "; request_duration: ", j);
        C0MT.LIZLLL(LIZJ, "; parse_duration: ", j2, "; rank_duration: ");
        LIZJ.append(j3);
        LIZJ(X1D.LIZIZ(LIZJ));
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("request_type", str);
        c188727au.LJ(j, "request_duration");
        c188727au.LJ(j2, "parse_duration");
        c188727au.LJ(j3, "rank_duration");
        FMX.LJIIL("poi_search_client_recommend_rank_performance", c188727au.LIZ);
    }

    public static C73390SrC LIZIZ(String business, String scene, PoiSearchApi.PoiSearchRecallResult poiSearchRecallResult, Cert bpeaCert, Cert decryptCert) {
        o.LJIIIZ(business, "business");
        o.LJIIIZ(scene, "scene");
        o.LJIIIZ(bpeaCert, "bpeaCert");
        o.LJIIIZ(decryptCert, "decryptCert");
        List<PoiSearchApi.PoiGroup> poiGroup = poiSearchRecallResult.getPoiGroup();
        if (poiGroup == null || poiGroup.isEmpty()) {
            return null;
        }
        try {
            return AbstractC73672Svk.LJIIJ(new C85266XdG(business, scene, bpeaCert, decryptCert, poiSearchRecallResult, poiGroup));
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("chooseSuitablePoiGroupAndTransformToSearchResultWrapper has error: ");
            LIZ2.append(e);
            LIZJ(X1D.LIZIZ(LIZ2));
            return null;
        }
    }
}
