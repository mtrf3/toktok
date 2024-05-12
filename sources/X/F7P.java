package X;

import Y.AgS48S1100000_6;
import android.os.SystemClock;
import com.tiktok.zero.rating.manager.ZeroRatingApi;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class F7P implements C10I {
    public final /* synthetic */ F7O LIZ;
    public final /* synthetic */ String LIZIZ;
    public final /* synthetic */ String LIZJ;
    public final /* synthetic */ long LIZLLL;

    public F7P(F7O f7o, String str, String str2, long j) {
        this.LIZ = f7o;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = j;
    }

    @Override // X.C10I
    public final Object then(C10K task) {
        int i;
        o.LJFF(task, "task");
        ZeroRatingApi.FetchMsisdnResponse fetchMsisdnResponse = (ZeroRatingApi.FetchMsisdnResponse) task.LJIIJJI();
        if (task.LJIILJJIL()) {
            i = -111;
        } else if (fetchMsisdnResponse != null) {
            i = fetchMsisdnResponse.statusCode;
        } else {
            i = -112;
        }
        String mccMnc = this.LIZIZ;
        String enterFrom = this.LIZJ;
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.LIZLLL;
        o.LJIIJ(mccMnc, "mccMnc");
        o.LJIIJ(enterFrom, "enterFrom");
        E8G.LIZ("fetch_msisdn_result", C113554cx.LJJL(new OSZ("mcc_mnc", mccMnc), new OSZ("enter_from", enterFrom), new OSZ("status_code", String.valueOf(i))), C51029K0z.LJJIIZI(new OSZ("duration", Integer.valueOf((int) elapsedRealtime))));
        if (task.LJIILJJIL()) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("associateMsisdn error:");
            LIZ.append(task.LJIIJ());
            String message = X1D.LIZIZ(LIZ);
            o.LJIIJ(message, "message");
            F7O f7o = this.LIZ;
            String str = this.LIZIZ;
            if (f7o.LIZ < 3) {
                f7o.LIZ++;
                C10K.LJII(1500L).LIZLLL(new AgS48S1100000_6(f7o, str, 0));
            }
        } else if (fetchMsisdnResponse == null || fetchMsisdnResponse.statusCode != 0) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("associateMsisdn response error:");
            LIZ2.append(fetchMsisdnResponse);
            String message2 = X1D.LIZIZ(LIZ2);
            o.LJIIJ(message2, "message");
            F7O f7o2 = this.LIZ;
            String str2 = this.LIZIZ;
            if (f7o2.LIZ < 3) {
                f7o2.LIZ++;
                C10K.LJII(1500L).LIZLLL(new AgS48S1100000_6(f7o2, str2, 0));
            }
        } else {
            this.LIZ.LIZIZ(this.LIZIZ, fetchMsisdnResponse, this.LIZJ);
        }
        return C76800UCe.LIZ;
    }
}
