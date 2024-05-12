package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: X.NIt, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59135NIt {
    public final /* synthetic */ NVB LIZ;

    public C59135NIt(NVB nvb) {
        this.LIZ = nvb;
    }

    public final void LIZ(Long l, String str) {
        Aweme aweme;
        Aweme aweme2;
        NU4 nu4 = this.LIZ.LJLLJ;
        if (nu4 != null && !nu4.LIZLLL) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("light_page", 1);
        if (l != null) {
            linkedHashMap.put("duration", l);
        }
        C59127NIl LIZ = C59128NIm.LIZ();
        LIZ.LIZ = "ad_wap_stat";
        LIZ.LIZIZ = str;
        LIZ.LJ.LIZ("ad_extra_data", new JSONObject(linkedHashMap));
        NU4 params = this.LIZ.getParams();
        AwemeRawAd awemeRawAd = null;
        if (params != null) {
            aweme = params.LIZJ;
        } else {
            aweme = null;
        }
        LIZ.LJ(aweme);
        LIZ.LJIIIZ(null);
        NU4 params2 = this.LIZ.getParams();
        if (params2 != null && (aweme2 = params2.LIZJ) != null) {
            awemeRawAd = aweme2.getAwemeRawAd();
        }
        C58655N0h LIZLLL = C58704N2e.LIZLLL("ad_wap_stat", str, awemeRawAd);
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            LIZLLL.LIZIZ(entry.getValue(), (String) entry.getKey());
        }
        LIZLLL.LJII();
    }
}
