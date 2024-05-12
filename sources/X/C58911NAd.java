package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.NAd, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58911NAd {
    public static final JSONObject LJFF;
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final boolean LIZLLL;
    public final JSONArray LJ;

    static {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("apiVersion", 2);
        jSONObject.put("apiVersionMinor", 0);
        LJFF = jSONObject;
    }

    public final JSONObject LIZ(List<String> list) {
        List<String> list2;
        JSONArray jSONArray;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("allowedAuthMethods", this.LJ);
        String lowerCase = this.LIZJ.toLowerCase(Locale.ROOT);
        o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        if (o.LJ(lowerCase, "br")) {
            list2 = N2C.LIZIZ;
        } else {
            list2 = N2C.LIZ;
        }
        if (list == null || list.isEmpty()) {
            jSONArray = new JSONArray((Collection) list2);
        } else {
            ArrayList arrayList = new ArrayList();
            for (String str : list2) {
                if (list.contains(str)) {
                    arrayList.add(str);
                }
            }
            jSONArray = new JSONArray((Collection) arrayList);
        }
        jSONObject2.put("allowedCardNetworks", jSONArray);
        jSONObject2.put("assuranceDetailsRequired", true);
        jSONObject.put("type", "CARD");
        jSONObject.put("parameters", jSONObject2);
        return jSONObject;
    }

    public C58911NAd(String gatewayMerchantID, String country, boolean z) {
        o.LJIIIZ(gatewayMerchantID, "gatewayMerchantID");
        o.LJIIIZ(country, "country");
        this.LIZ = gatewayMerchantID;
        this.LIZIZ = "pipo";
        this.LIZJ = country;
        this.LIZLLL = z;
        this.LJ = new JSONArray((Collection) N2C.LIZJ);
    }
}
