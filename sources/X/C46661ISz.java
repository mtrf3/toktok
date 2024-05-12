package X;

import android.app.ActivityManager;
import android.os.Process;
import com.ss.android.ugc.aweme.playereventreporter.VideoInfo;
import com.ss.android.ugc.aweme.simreporter.callback.UpdateCallback;
import com.ss.android.ugc.playerkit.simapicommon.reporter.IEvent;
import com.ss.android.ugc.playerkit.simapicommon.reporter.IMonitor;
import java.util.LinkedHashMap;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.ISz, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C46661ISz {
    public static boolean LIZLLL = true;
    public VideoInfo LIZ;
    public UpdateCallback LIZIZ;
    public IT2 LIZJ;

    public final void LIZIZ() {
        JSONObject LIZ;
        IMonitor LJI;
        IEvent LIZJ;
        IT2 it2 = this.LIZJ;
        if (it2 == null) {
            return;
        }
        VideoInfo videoInfo = this.LIZ;
        if (!IZ8.LJIJJ()) {
            LIZ = LIZ(videoInfo, it2);
        } else {
            LIZ = LIZ(videoInfo, it2);
        }
        if (LIZ == null) {
            return;
        }
        if (IZ8.LJIJJ()) {
            Object value = IZ8.N0.getValue();
            o.LJIIIIZZ(value, "<get-enableFirstQualityEventNormal>(...)");
            if (((Boolean) value).booleanValue() && LIZLLL) {
                LIZLLL = false;
                IEvent LIZJ2 = C46982IcE.LIZJ();
                if (LIZJ2 != null) {
                    LIZJ2.onEvent("video_play_quality", LIZ);
                }
            } else {
                ISV.LIZJ();
                ISA LIZIZ = ISV.LIZIZ();
                ISQ isq = ISQ.VIDEO_PLAY_QUALITY;
                IT2 it22 = this.LIZJ;
                o.LJI(it22);
                ((ISZ) LIZIZ).LJ(isq, it22.LJJIJIIJI, LIZ.toString());
            }
            ISW.LIZJ();
            if (IZ8.LJIILJJIL() && (LIZJ = C46982IcE.LIZJ()) != null) {
                LIZJ.onEvent("video_play_quality", LIZ);
            }
        } else {
            IEvent LIZJ3 = C46982IcE.LIZJ();
            if (LIZJ3 != null) {
                LIZJ3.onEvent("video_play_quality", LIZ);
            }
        }
        if (this.LIZIZ != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            IT2 it23 = this.LIZJ;
            JSONObject jSONObject = new JSONObject();
            if (it23 != null) {
                try {
                    jSONObject.put("group_id", it23.LIZ);
                    jSONObject.put("bitrate_set", it23.LJIIL);
                    jSONObject.put("calc_bitrate", it23.LJIJ);
                    jSONObject.put("play_bitrate", it23.LJIILL);
                    jSONObject.put("video_bitrate", it23.LJFF);
                    jSONObject.put("audio_bitrate", it23.LJI);
                    jSONObject.put("is_surfaceview", it23.LJIILLIIL);
                    jSONObject.put("internet_speed", it23.LJIIIZ);
                } catch (JSONException unused) {
                }
            }
            linkedHashMap.put("external_log", jSONObject);
            linkedHashMap.put("video_play_quality", LIZ);
            UpdateCallback updateCallback = this.LIZIZ;
            o.LJI(updateCallback);
            updateCallback.update(1, linkedHashMap);
        }
        IT2 it24 = this.LIZJ;
        o.LJI(it24);
        String str = it24.LIZ;
        if (C46981IcD.LIZJ && str != null) {
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) C46660ISy.LIZ;
            concurrentHashMap.remove(str);
            if (C46981IcD.LIZJ && !C46981IcD.LIZ) {
                C46981IcD.LIZJ();
            }
            concurrentHashMap.put(str, new C46658ISw(new C46656ISu(C46981IcD.LIZIZ.LJLIL, C46981IcD.LIZIZ(), C46981IcD.LIZ())));
        }
        if (!IZ8.LJIIIZ() && (LJI = C46982IcE.LJI()) != null) {
            LJI.monitorCommonLog("aweme_video_bitrate_first_frame_log", LIZ);
        }
        C79146V4k.LJJJJIZL();
    }

    public static JSONObject LIZ(VideoInfo videoInfo, IT2 it2) {
        int i;
        Integer valueOf;
        float f;
        ILN iln = it2.LJJJJJL;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("qprf", it2.LIZLLL);
            jSONObject.put("access", it2.LJJIFFI);
            jSONObject.put("group_id", it2.LIZ);
            jSONObject.put("play_sess", it2.LJJIJIIJI);
            jSONObject.put("duration", it2.LJ);
            jSONObject.put("vduration", Float.valueOf(it2.LJIILJJIL));
            jSONObject.put("video_quality", it2.LJIIJ);
            jSONObject.put("pre_cache_size", it2.LJJII);
            jSONObject.put("preload_speed", it2.LJII);
            jSONObject.put("internet_speed", it2.LJIIIZ);
            jSONObject.put("video_fps", it2.LJJ);
            jSONObject.put("is_bytevc1", it2.LJJIJ);
            jSONObject.put("pt_predictL", it2.LJJIIJZLJL);
            jSONObject.put("format", it2.LJJIJLIJ);
            jSONObject.put("codec_id", it2.LJJIIZ);
            jSONObject.put("codec_name", it2.LJIJJLI);
            jSONObject.put("hw_failed_reason", it2.LJJJ);
            jSONObject.put("bitrate_set", it2.LJIIL);
            jSONObject.put("calc_bitrate", it2.LJIJ);
            jSONObject.put("sdk_select_time_float", it2.LJIJI);
            jSONObject.put("sdk_select_diff_str", it2.LJIJJ);
            jSONObject.put("play_bitrate", it2.LJIILL);
            jSONObject.put("video_bitrate", it2.LJFF);
            jSONObject.put("audio_bitrate", it2.LJI);
            jSONObject.put("audio_quality", it2.LJIIJJI);
            jSONObject.put("bitrate_values", it2.LJIILIIL);
            jSONObject.put("is_super_resolution", it2.LJJIJIIJIL);
            int i2 = 0;
            if (it2.LJJJIL) {
                i = 1;
            } else {
                i = 0;
            }
            jSONObject.put("is_async", i);
            jSONObject.put("session_cnt", it2.LJJJJJ);
            if (videoInfo == null) {
                valueOf = null;
            } else {
                valueOf = Integer.valueOf(videoInfo.getEnableHdr());
            }
            jSONObject.put("enable_hdr", valueOf);
            if (IZ8.LJJJJ()) {
                f = -1.0f;
            } else {
                try {
                    i2 = C16880lQ.LLJJL((ActivityManager) C16880lQ.LLILL(C16880lQ.LLLLJI(C46982IcE.LIZ), "activity"), new int[]{Process.myPid()})[0].getTotalPss();
                } catch (Throwable unused) {
                }
                f = i2 / 1000.0f;
            }
            if (f >= 0.0f) {
                jSONObject.put("mem_usage", Float.valueOf(f));
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("is_surfaceview=");
            LIZ.append(it2.LJIILLIIL);
            LIZ.append("&preloader_type=");
            LIZ.append(it2.LJIIZILJ);
            LIZ.append("&inner_type=");
            LIZ.append(it2.LJJIIJ);
            String LIZIZ = X1D.LIZIZ(LIZ);
            jSONObject.put("cpu_rate", it2.LJJI);
            jSONObject.put("inner_type", LIZIZ);
            jSONObject.put("had_prepare", it2.LJJIL);
            jSONObject.put("engine_state", it2.LJJIZ);
            jSONObject.put("dimension_bitrate_curve", it2.LJJJJI);
            jSONObject.put("dimension_bitrate_filter", it2.LJJJJIZL);
            jSONObject.put("bitrate_curve", it2.LJJJI);
            if (ILN.DEFAULT == iln || ILN.D_FEED == iln) {
                jSONObject.put("action_type", it2.LIZIZ);
                jSONObject.put("hw_codec_name", it2.LJIL);
                jSONObject.put("is_same_bitrate", it2.LJIIIIZZ);
            }
            jSONObject.put("preload_bitrate", it2.LJII);
            if (IZ8.LJIJJ()) {
                jSONObject.put("vpq_internet_speed", it2.LJIIIZ);
                jSONObject.put("vpq_timestamp", System.currentTimeMillis());
            }
            for (String str : it2.LJJJJ.keySet()) {
                o.LJIIIIZZ(str, "keys.next()");
                String str2 = str;
                Object obj = it2.LJJJJ.get(str2);
                if (obj != null) {
                    jSONObject.put(str2, obj);
                }
            }
        } catch (JSONException unused2) {
        }
        return jSONObject;
    }
}
