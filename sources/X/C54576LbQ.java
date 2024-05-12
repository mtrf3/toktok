package X;

import com.bytedance.bpea.cert.token.TokenCert;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT;

/* renamed from: X.LbQ, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54576LbQ {
    public static TokenCert LIZ() {
        if (((ILocationBaseServiceForMT) ServiceManager.get().getService(ILocationBaseServiceForMT.class)).isSupportedPreciseGps()) {
            return TokenCert.Companion.with("bpea-nearby_unnecessary_enter_for_precise");
        }
        return TokenCert.Companion.with("bpea-nearby_unnecessary_enter_v2");
    }

    public static TokenCert LIZIZ() {
        if (((ILocationBaseServiceForMT) ServiceManager.get().getService(ILocationBaseServiceForMT.class)).isSupportedPreciseGps()) {
            return TokenCert.Companion.with("bpea-nearby_unnecessary_turn_on_for_precise");
        }
        return TokenCert.Companion.with("bpea-nearby_unnecessary_turn_on_v2");
    }
}
