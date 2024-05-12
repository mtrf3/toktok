package X;

import android.view.View;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class O5E extends AbstractC61294O3u {
    @Override // X.AbstractC61294O3u
    public final void LIZIZ(String str, java.util.Map<String, ? extends java.util.Map<String, ? extends Object>> map, java.util.Map<String, ? extends Object> extra, C61295O3v response) {
        o.LJIIJ(extra, "extra");
        o.LJIIJ(response, "response");
        Object obj = extra.get("rl_container_uuid");
        View view = null;
        if (!(obj instanceof String)) {
            obj = null;
        }
        String str2 = (String) obj;
        if (str2 != null) {
            OFH ofh = OFH.LIZLLL;
            JSONObject jSONObject = new JSONObject(map);
            ofh.getClass();
            OFH.LIZ.getClass();
            COL LJ = OFI.LJ(str2);
            OFM LJFF = OFH.LJFF(LJ);
            if (LJFF != null) {
                if (LJ != null) {
                    view = LJ.LIZ();
                }
                LJFF.handleNativeInfo(view, str, jSONObject);
            }
        }
    }

    @Override // X.AbstractC61294O3u
    public final void LIZ(String str, String url, String str2, JSONObject category, JSONObject jSONObject, JSONObject jSONObject2, int i) {
        o.LJIIJ(url, "url");
        o.LJIIJ(category, "category");
        C79605VMb c79605VMb = new C79605VMb(str);
        c79605VMb.LIZIZ = null;
        c79605VMb.LIZ = url;
        c79605VMb.LJIIIIZZ = str2;
        c79605VMb.LIZLLL = category;
        c79605VMb.LJ = jSONObject;
        c79605VMb.LJFF = jSONObject2;
        c79605VMb.LIZIZ(i);
        C79604VMa LIZ = c79605VMb.LIZ();
        OFH.LIZLLL.getClass();
        OFH.LIZLLL(LIZ);
    }
}
