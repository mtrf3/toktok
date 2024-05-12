package X;

import android.os.SystemClock;
import com.tiktok.zero.rating.manager.ZeroRatingApi;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class F7N implements C10I {
    public final /* synthetic */ F7O LIZ;
    public final /* synthetic */ String LIZIZ;
    public final /* synthetic */ String LIZJ;
    public final /* synthetic */ long LIZLLL;
    public final /* synthetic */ ZeroRatingApi.FetchMsisdnResponse LJ;

    public F7N(F7O f7o, String str, String str2, long j, ZeroRatingApi.FetchMsisdnResponse fetchMsisdnResponse) {
        this.LIZ = f7o;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = j;
        this.LJ = fetchMsisdnResponse;
    }

    @Override // X.C10I
    public final Object then(C10K task) {
        int i;
        o.LJFF(task, "task");
        ZeroRatingApi.CarrierCommonResponse carrierCommonResponse = (ZeroRatingApi.CarrierCommonResponse) task.LJIIJJI();
        if (task.LJIILJJIL()) {
            i = -111;
        } else if (carrierCommonResponse != null) {
            i = carrierCommonResponse.statusCode;
        } else {
            i = -112;
        }
        String mccMnc = this.LIZIZ;
        String enterFrom = this.LIZJ;
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.LIZLLL;
        o.LJIIJ(mccMnc, "mccMnc");
        o.LJIIJ(enterFrom, "enterFrom");
        E8G.LIZ("msisdn_binding_result", C113554cx.LJJL(new OSZ("mcc_mnc", mccMnc), new OSZ("enter_from", enterFrom), new OSZ("status_code", String.valueOf(i))), C51029K0z.LJJIIZI(new OSZ("duration", Integer.valueOf((int) elapsedRealtime))));
        if (task.LJIILJJIL()) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("binding msisdn error:");
            LIZ.append(task.LJIIJ());
            String message = X1D.LIZIZ(LIZ);
            o.LJIIJ(message, "message");
            F7O f7o = this.LIZ;
            String str = this.LIZIZ;
            ZeroRatingApi.FetchMsisdnResponse fetchMsisdnResponse = this.LJ;
            if (f7o.LIZIZ < 3) {
                f7o.LIZIZ++;
                C10K.LJII(1500L).LIZLLL(new F7R(f7o, str, fetchMsisdnResponse));
            }
        } else if (carrierCommonResponse == null || carrierCommonResponse.statusCode != 0) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("binding msisdn response error:");
            LIZ2.append(carrierCommonResponse);
            String message2 = X1D.LIZIZ(LIZ2);
            o.LJIIJ(message2, "message");
            F7O f7o2 = this.LIZ;
            String str2 = this.LIZIZ;
            ZeroRatingApi.FetchMsisdnResponse fetchMsisdnResponse2 = this.LJ;
            if (f7o2.LIZIZ < 3) {
                f7o2.LIZIZ++;
                C10K.LJII(1500L).LIZLLL(new F7R(f7o2, str2, fetchMsisdnResponse2));
            }
        } else {
            C36858EdK c36858EdK = C36858EdK.LIZJ;
            int i2 = this.LJ.coolingInterval;
            c36858EdK.getClass();
            C36858EdK.LIZ().storeBoolean("key_binding_msisdn_success", true);
            if (i2 > 0) {
                C36858EdK.LIZ().storeLong("key_msisdn_expired_time", (i2 * 1000) + System.currentTimeMillis());
            }
        }
        return C76800UCe.LIZ;
    }
}
