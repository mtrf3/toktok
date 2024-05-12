package X;

import Y.ACallableS33S1100000_6;
import Y.ACallableS5S1000000_6;
import android.os.SystemClock;
import com.tiktok.zero.rating.manager.ZeroRatingApi;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class F7O {
    public volatile int LIZ;
    public volatile int LIZIZ;

    public final void LIZ(String mccMnc, String enterFrom) {
        o.LJIIJ(mccMnc, "mccMnc");
        o.LJIIJ(enterFrom, "enterFrom");
        E8G.LIZ("fetch_msisdn_start_request", C113554cx.LJJL(new OSZ("mcc_mnc", mccMnc), new OSZ("enter_from", enterFrom)), null);
        C10K.LIZJ(new ACallableS5S1000000_6(mccMnc, 2)).LIZLLL(new F7P(this, mccMnc, enterFrom, SystemClock.elapsedRealtime()));
    }

    public final void LIZIZ(String mccMnc, ZeroRatingApi.FetchMsisdnResponse fetchMsisdnResponse, String enterFrom) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        o.LJIIJ(mccMnc, "mccMnc");
        o.LJIIJ(enterFrom, "enterFrom");
        E8G.LIZ("msisdn_binding_start_request", C113554cx.LJJL(new OSZ("mcc_mnc", mccMnc), new OSZ("enter_from", enterFrom)), null);
        C10K.LIZJ(new ACallableS33S1100000_6(fetchMsisdnResponse, mccMnc, 3)).LIZLLL(new F7N(this, mccMnc, enterFrom, elapsedRealtime, fetchMsisdnResponse));
    }
}
