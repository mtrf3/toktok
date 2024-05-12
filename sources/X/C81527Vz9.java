package X;

import java.util.HashMap;
import kotlin.jvm.internal.AqS118S0300000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.Vz9, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81527Vz9 extends AbstractC81528VzA {
    public final InterfaceC81531VzD LJIIIIZZ;

    @Override // X.AbstractC81528VzA
    public final void LIZLLL() {
        super.LIZLLL();
        this.LJIIIIZZ.LIZ();
    }

    @Override // X.AbstractC81528VzA
    public final void LJ() {
        super.LJ();
    }

    public C81527Vz9(C81525Vz7 fetchFeedDetectorCallBack) {
        o.LJIIIZ(fetchFeedDetectorCallBack, "fetchFeedDetectorCallBack");
        this.LJIIIIZZ = fetchFeedDetectorCallBack;
    }

    @Override // X.AbstractC81528VzA
    public final void LIZ(C188727au c188727au) {
        c188727au.LJ(this.LIZIZ, "feed_start");
        c188727au.LJ(System.currentTimeMillis() - this.LIZIZ, "timing_res_feed");
        Long l = this.LIZJ;
        if (l != null) {
            c188727au.LJ(l.longValue() - this.LIZIZ, "timing_no_network");
        }
    }

    @Override // X.AbstractC81528VzA
    public final void LIZJ(EnumC79770VSk networkState, HashMap<String, HashMap<String, Object>> detailMap) {
        C76800UCe c76800UCe;
        o.LJIIIZ(networkState, "networkState");
        o.LJIIIZ(detailMap, "detailMap");
        try {
            if (!detailMap.containsKey("extra_info")) {
                detailMap.put("extra_info", new HashMap<>());
            }
            HashMap<String, Object> hashMap = detailMap.get("extra_info");
            if (hashMap != null) {
                hashMap.put("start_time", Long.valueOf(this.LIZIZ));
                c76800UCe = C76800UCe.LIZ;
            } else {
                c76800UCe = null;
            }
            C3C5.m7constructorimpl(c76800UCe);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
        if (networkState == EnumC79770VSk.NETWORK_GOOD || networkState == EnumC79770VSk.UNKNOWN_STATUS) {
            new C45440HsS().LIZIZ(10000L, new AqS118S0300000_14(this, (C81527Vz9) networkState, (EnumC79770VSk) detailMap, (HashMap<String, HashMap<String, Object>>) 5));
        } else {
            this.LJIIIIZZ.LIZIZ(this, networkState, detailMap);
        }
    }
}
