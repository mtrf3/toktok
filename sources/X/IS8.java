package X;

import com.ss.android.ugc.aweme.playereventreporter.VideoInfo;
import com.ss.android.ugc.aweme.simreporter.callback.UpdateCallback;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class IS8 {
    public static final /* synthetic */ int LJ = 0;
    public int LIZ = -1;
    public UpdateCallback LIZIZ;
    public VideoInfo LIZJ;
    public IRV LIZLLL;

    public final void LIZIZ() {
        IRV irv;
        JSONObject LIZ;
        VideoInfo videoInfo = this.LIZJ;
        if (videoInfo == null || (irv = this.LIZLLL) == null) {
            return;
        }
        if (!IZ8.LJIJJ()) {
            LIZ = LIZ(videoInfo, irv);
        } else {
            LIZ = LIZ(videoInfo, irv);
        }
        if (LIZ == null) {
            return;
        }
        if (IZ8.LJIJJ()) {
            ISA LIZIZ = ISV.LIZIZ();
            ISQ isq = ISQ.VIDEO_REQUEST_RESPONSE;
            IRV irv2 = this.LIZLLL;
            o.LJI(irv2);
            ((ISZ) LIZIZ).LJ(isq, irv2.LIZJ, LIZ.toString());
            ISV.LIZJ();
            ISW.LIZJ();
            if (IZ8.LJIILJJIL()) {
                C46982IcE.LIZJ().onEvent("video_request_response", LIZ);
            }
        } else {
            C46982IcE.LIZJ().onEvent("video_request_response", LIZ);
        }
        if (this.LIZIZ != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("video_request_response", LIZ);
            UpdateCallback updateCallback = this.LIZIZ;
            o.LJI(updateCallback);
            updateCallback.update(2, linkedHashMap);
        }
        C79146V4k.LJJJJIZL();
    }

    public final JSONObject LIZ(VideoInfo videoInfo, IRV irv) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("group_id", videoInfo.getAid());
            jSONObject.put("duration", this.LIZ);
            jSONObject.put("is_cache", videoInfo.isHitCache());
            jSONObject.put("play_sess", irv.LIZJ);
            jSONObject.put("is_success", irv.LIZIZ);
            jSONObject.put("video_quality", videoInfo.getVideoQuality());
            jSONObject.put("internet_speed", videoInfo.getInternetSpeed());
            if (IZ8.LJIJJ()) {
                jSONObject.put("vrr_internet_speed", videoInfo.getInternetSpeed());
                jSONObject.put("vrr_timestamp", System.currentTimeMillis());
            }
            for (String str : irv.LIZLLL.keySet()) {
                o.LJIIIIZZ(str, "keys.next()");
                String str2 = str;
                Object obj = irv.LIZLLL.get(str2);
                if (obj != null) {
                    jSONObject.put(str2, obj);
                }
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }
}
