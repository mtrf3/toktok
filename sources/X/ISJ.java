package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.simreporter.callback.UpdateCallback;
import com.ss.android.ugc.playerkit.simapicommon.reporter.IEvent;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class ISJ {
    public static boolean LIZJ = true;
    public UpdateCallback LIZ;
    public ISM LIZIZ;

    public final void LIZIZ() {
        JSONObject LIZ;
        IEvent LIZJ2;
        ISM ism = this.LIZIZ;
        String str = null;
        if (ism == null) {
            return;
        }
        if (!IZ8.LJIJJ()) {
            LIZ = LIZ(ism);
        } else {
            LIZ = LIZ(ism);
        }
        if (LIZ == null) {
            return;
        }
        if (IZ8.LJIJJ()) {
            ISM ism2 = this.LIZIZ;
            if (ism2 != null) {
                str = ism2.LJFF;
            }
            String jSONObject = LIZ.toString();
            o.LJIIIIZZ(jSONObject, "videoRequestJsonObject.toString()");
            if (IZ8.LJIJ() && LIZJ) {
                LIZJ = false;
                if (IZ8.LJIJ() && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(jSONObject)) {
                    ISV.LIZJ.put(str, jSONObject);
                }
            } else {
                ISW.LIZJ();
                ((ISZ) ISV.LIZIZ()).LJ(ISQ.VIDEO_REQUEST, str, jSONObject);
            }
            if (IZ8.LJIILJJIL() && (LIZJ2 = C46982IcE.LIZJ()) != null) {
                LIZJ2.onEvent("video_request", LIZ);
            }
        } else {
            IEvent LIZJ3 = C46982IcE.LIZJ();
            if (LIZJ3 != null) {
                LIZJ3.onEvent("video_request", LIZ);
            }
        }
        if (this.LIZ != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("video_request", LIZ);
            UpdateCallback updateCallback = this.LIZ;
            o.LJI(updateCallback);
            updateCallback.update(4, linkedHashMap);
        }
        C79146V4k.LJJJJIZL();
    }

    public static JSONObject LIZ(ISM ism) {
        JSONObject jSONObject = new JSONObject();
        ILN iln = ism.LJIJJ;
        try {
            jSONObject.put("access", ism.LJI);
            jSONObject.put("group_id", ism.LIZIZ);
            jSONObject.put("play_sess", ism.LJFF);
            jSONObject.put("vduration", ism.LIZLLL);
            jSONObject.put("preloader_type", ism.LJ);
            if (ILN.T_LITE_FEED == iln) {
                jSONObject.put("cache_completed", ism.LJIIIIZZ);
            }
            if (ILN.DEFAULT == iln || ILN.D_FEED == iln) {
                jSONObject.put("is_hit_cache", ism.LJII);
                jSONObject.put("pre_cache_size", ism.LJIIIZ);
            }
            if (IZ8.LJIJJ()) {
                jSONObject.put("vps_timestamp", System.currentTimeMillis());
            }
            for (String str : ism.LJIJI.keySet()) {
                o.LJIIIIZZ(str, "keys.next()");
                String str2 = str;
                Object obj = ism.LJIJI.get(str2);
                if (obj != null) {
                    jSONObject.put(str2, obj);
                }
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }
}
