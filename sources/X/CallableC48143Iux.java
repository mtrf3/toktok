package X;

import android.content.Context;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* renamed from: X.Iux, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class CallableC48143Iux<V> implements Callable {
    public final /* synthetic */ Context LJLIL;
    public final /* synthetic */ Aweme LJLILLLLZI;
    public final /* synthetic */ long LJLJI;
    public final /* synthetic */ long LJLJJI;
    public final /* synthetic */ C68322mC<Long> LJLJJL;

    public CallableC48143Iux(Context context, Aweme aweme, long j, long j2, C68322mC<Long> c68322mC) {
        this.LJLIL = context;
        this.LJLILLLLZI = aweme;
        this.LJLJI = j;
        this.LJLJJI = j2;
        this.LJLJJL = c68322mC;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i;
        Context context = this.LJLIL;
        Aweme aweme = this.LJLILLLLZI;
        long j = this.LJLJI;
        if (C63081OpJ.LLIIII(aweme) && AnonymousClass906.LIZJ != 0) {
            if (!AnonymousClass906.LJ) {
                i = 2;
            } else {
                i = 1;
            }
            AnonymousClass906.LIZJ = 0L;
            HashMap hashMap = new HashMap();
            hashMap.put("splashduration", String.valueOf(j));
            hashMap.put("awemelaunch", String.valueOf(i));
            HashMap hashMap2 = new HashMap();
            hashMap2.put("ad_extra_data", GsonProtectorUtils.toJson(new Gson(), hashMap));
            NN1.LJJJJI(context, "splash_show", aweme, NN1.LJIIL(context, aweme, false, hashMap2));
            C58655N0h LIZLLL = C58704N2e.LIZLLL("draw_ad", "feed_show", aweme.getAwemeRawAd());
            LIZLLL.LIZIZ(Long.valueOf(j), "splashduration");
            LIZLLL.LIZIZ(Integer.valueOf(i), "awemelaunch");
            LIZLLL.LJII();
        }
        AwemeRawAd awemeRawAd = null;
        if (AnonymousClass906.LJ) {
            if (!AnonymousClass906.LIZLLL && ((Number) AnonymousClass906.LIZ.getValue()).longValue() == 0) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("error_reason", "first_view_start_time_zero");
                FMX.LJIILJJIL("topview_error", jSONObject);
            }
            Context context2 = this.LJLIL;
            Aweme aweme2 = this.LJLILLLLZI;
            long j2 = this.LJLJJI;
            if (C63081OpJ.LLIIII(aweme2)) {
                if (!AnonymousClass906.LIZLLL) {
                    AnonymousClass906.LIZLLL = true;
                    if (NN1.LJIJ(context2, aweme2)) {
                        JSONObject LIZLLL2 = NN1.LIZLLL(j2);
                        NN1.LJIIJJI(context2, aweme2, LIZLLL2);
                        NN1.LJJJJI(context2, "first_view", aweme2, LIZLLL2);
                        C58655N0h LIZLLL3 = C58704N2e.LIZLLL("draw_ad", "first_view", aweme2.getAwemeRawAd());
                        LIZLLL3.LIZIZ(Long.valueOf(j2), "launchduration");
                        LIZLLL3.LJII();
                        long currentTimeMillis = System.currentTimeMillis();
                        IFT.LIZ = j2;
                        IFT.LJ = 1;
                        IFT.LIZIZ = currentTimeMillis;
                    }
                }
            } else if (!AnonymousClass906.LIZLLL) {
                AnonymousClass906.LIZLLL = true;
                NN1.LIZJ(0L, context2, "splash_ad", "first_view", "-1", NN1.LIZLLL(j2));
                C58655N0h LJ = C58704N2e.LJ("splash_ad", "first_view", "-1", null, CardStruct.IStatusCode.DEFAULT);
                LJ.LIZIZ(Long.valueOf(j2), "launchduration");
                LJ.LJII();
            }
        }
        Long l = this.LJLJJL.element;
        if (l != null) {
            Aweme aweme3 = this.LJLILLLLZI;
            long longValue = l.longValue();
            if (AnonymousClass906.LJ) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("error_reason", "first_view_cold_state_error");
                FMX.LJIILJJIL("topview_error", jSONObject2);
            }
            if (aweme3 != null) {
                awemeRawAd = aweme3.getAwemeRawAd();
            }
            C58655N0h LIZLLL4 = C58704N2e.LIZLLL("draw_ad", "topview_warm_first_view", awemeRawAd);
            LIZLLL4.LIZIZ(Long.valueOf(longValue), "launchduration");
            LIZLLL4.LJI();
        }
        return C76800UCe.LIZ;
    }
}
