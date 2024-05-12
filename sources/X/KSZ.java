package X;

import com.bytedance.bpea.cert.token.TokenCert;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT;

/* loaded from: classes9.dex */
public final class KSZ {
    public static final TokenCert LIZ;
    public static final TokenCert LIZIZ;
    public static final TokenCert LIZJ;

    static {
        TokenCert.Companion companion = TokenCert.Companion;
        TokenCert with = companion.with("bpea-search_poi_decrypt_location");
        with.auth("mckd");
        LIZ = with;
        TokenCert with2 = companion.with("bpea-search_result_poi_location_decrypt");
        with2.auth("mckd");
        LIZIZ = with2;
        TokenCert with3 = companion.with("bpea-search_poi_fetch_location");
        with3.auth("nany");
        LIZJ = with3;
        companion.with("bpea-search_poi_last_location").auth("inti");
    }

    public static TokenCert LIZ(boolean z) {
        if (((ILocationBaseServiceForMT) ServiceManager.get().getService(ILocationBaseServiceForMT.class)).isSupportedPreciseGps() && z) {
            return TokenCert.Companion.with("bpea-search_poi_precise_permission");
        }
        return TokenCert.Companion.with("bpea-search_poi_coarse_permission");
    }
}
