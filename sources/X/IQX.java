package X;

import com.ss.android.ugc.playerkit.simapicommon.reporter.IEvent;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class IQX {
    public static final /* synthetic */ int LIZIZ = 0;
    public IQY LIZ;

    public final void LIZ() {
        IQY iqy = this.LIZ;
        if (iqy == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("group_id", (Object) null);
            jSONObject.put("play_url", (Object) null);
            jSONObject.put("play_sess", (Object) null);
            jSONObject.put("video_size", iqy.LIZIZ);
            jSONObject.put("player_type", (Object) null);
            jSONObject.put("vduration", iqy.LIZJ);
            jSONObject.put("pre_cache_size", iqy.LIZ);
            jSONObject.put("internet_speed", (Object) null);
            for (String str : iqy.LIZLLL.keySet()) {
                jSONObject.put(str, iqy.LIZLLL.get(str));
            }
        } catch (JSONException unused) {
        }
        IEvent LIZJ = C46982IcE.LIZJ();
        if (LIZJ != null) {
            LIZJ.onEvent("video_play_finish", jSONObject);
        }
        C79146V4k.LJJJJIZL();
    }
}
