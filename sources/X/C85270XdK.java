package X;

import Y.AfS67S0100000_15;
import com.google.gson.internal.h;
import com.ss.android.ugc.aweme.poi.api.PoiEventApi;
import com.ss.android.ugc.aweme.poi_api.experiment.PoiEnableExperiment;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.XdK, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85270XdK {
    public static final /* synthetic */ C85270XdK LIZ = new C85270XdK();

    public static void LIZ(C85278XdS c85278XdS, InterfaceC85277XdR interfaceC85277XdR) {
        Object obj;
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        String signature = h.LJIIIIZZ(String.valueOf(EF7.LJIIIZ) + PoiEnableExperiment.LIZ().poiKey + currentTimeMillis);
        JSONArray jSONArray = new JSONArray();
        for (C79536VJk c79536VJk : (List) c85278XdS.LIZJ) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("operation", c79536VJk.LIZ.getType());
            jSONObject.put("data", c79536VJk.LIZIZ);
            jSONObject.put("timestamp", c79536VJk.LIZJ);
            jSONArray.put(jSONObject);
        }
        PoiEventApi.EventRequestBody eventRequestBody = new PoiEventApi.EventRequestBody((String) c85278XdS.LIZ, (String) c85278XdS.LIZIZ, null, jSONArray.toString(), 2, 0, EF7.LJIIIZ, null, String.valueOf(EF7.LJI()), "1.2.0-rc.5", currentTimeMillis, 132, null);
        String str = com.ss.android.ugc.aweme.app.api.Api.LIZ;
        InterfaceC789838c LJI = C79061V1d.LJI(str, "API_URL_PREFIX_SI", str);
        if (LJI != null) {
            obj = LJI.create(PoiEventApi.class);
        } else {
            obj = null;
        }
        o.LJI(obj);
        o.LJIIIIZZ(signature, "signature");
        C78540Us4.LJJIIZ(((PoiEventApi) obj).postEvent("application/json", signature, String.valueOf(EF7.LJIIIZ), eventRequestBody)).LJJJLIIL(new AfS67S0100000_15(interfaceC85277XdR, 42), new AfS67S0100000_15(interfaceC85277XdR, 43));
    }
}
