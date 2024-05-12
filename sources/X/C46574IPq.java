package X;

import com.ss.android.ugc.playerkit.simapicommon.reporter.IEvent;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.IPq, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C46574IPq {
    public static final /* synthetic */ int LIZIZ = 0;
    public C46575IPr LIZ;

    public final void LIZ() {
        C46575IPr c46575IPr = this.LIZ;
        if (c46575IPr == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("group_id", (Object) null);
            jSONObject.put("play_url", (Object) null);
            jSONObject.put("play_sess", (Object) null);
            jSONObject.put("video_size", c46575IPr.LIZIZ);
            jSONObject.put("player_type", (Object) null);
            jSONObject.put("vduration", c46575IPr.LIZJ);
            jSONObject.put("pre_cache_size", c46575IPr.LIZ);
            jSONObject.put("internet_speed", (Object) null);
            for (String str : c46575IPr.LIZLLL.keySet()) {
                jSONObject.put(str, c46575IPr.LIZLLL.get(str));
            }
        } catch (JSONException unused) {
        }
        IEvent LIZJ = C46982IcE.LIZJ();
        if (LIZJ != null) {
            LIZJ.onEvent("play_time", jSONObject);
        }
        C79146V4k.LJJJJIZL();
    }
}
