package X;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class PNB extends AbstractC43178Gx4 {
    @Override // X.AbstractC43178Gx4
    public final boolean LIZ(String type) {
        o.LJIIIZ(type, "type");
        return false;
    }

    @Override // X.AbstractC43178Gx4
    public final String LIZJ() {
        return "abnor_traffic";
    }

    @Override // X.AbstractC43178Gx4
    public final String LIZIZ() {
        if (!((Boolean) EB7.LJ.getValue()).booleanValue()) {
            return "";
        }
        long longValue = PN9.LIZIZ.getFirst().longValue();
        long longValue2 = PN9.LIZIZ.getSecond().longValue();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("total_bytes", (PN9.LIZJ - longValue) - longValue2);
        jSONObject.put("mobile_bytes", PN9.LJ - longValue2);
        jSONObject.put("foreground_bytes", PN9.LJI);
        jSONObject.put("background_bytes", PN9.LJIIIIZZ);
        jSONObject.put("history_total_bytes", PN9.LIZJ);
        jSONObject.put("history_mobile_bytes", PN9.LJ);
        jSONObject.put("ttnet_bytes", PN9.LJIILJJIL);
        jSONObject.put("okhttp_bytes", PN9.LJIILLIIL);
        jSONObject.put("url_connection_bytes", PN9.LJIJ);
        jSONObject.put("ttnet_image_bytes", PN9.LJIL);
        jSONObject.put("ttnet_stream_bytes", PN9.LJJI);
        jSONObject.put("web_socket_bytes", PN9.LJJII);
        jSONObject.put("video_play_bytes", PN9.LJJIIJ);
        jSONObject.put("video_preload_bytes", PN9.LJJIIZ);
        jSONObject.put("live_bytes", PN9.LJJIJ);
        jSONObject.put("gecko_bytes", PN9.LJJIJIIJIL);
        String jSONObject2 = jSONObject.toString();
        o.LJIIIIZZ(jSONObject2, "metric.toString()");
        return jSONObject2;
    }

    @Override // X.AbstractC43178Gx4
    public final long LIZLLL() {
        return TimeUnit.HOURS.toMillis(2L);
    }
}
