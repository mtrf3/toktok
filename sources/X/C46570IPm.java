package X;

import com.ss.android.ugc.aweme.playereventreporter.VideoInfo;
import com.ss.android.ugc.aweme.simreporter.callback.UpdateCallback;
import com.ss.android.ugc.playerkit.simapicommon.reporter.IEvent;
import com.ss.android.ugc.playerkit.simapicommon.reporter.IMonitor;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.IPm, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C46570IPm {
    public static final /* synthetic */ int LJI = 0;
    public String LIZIZ;
    public UpdateCallback LIZLLL;
    public VideoInfo LJ;
    public C46554IOw LJFF;
    public long LIZ = -1;
    public boolean LIZJ = true;

    public final void LIZ() {
        VideoInfo videoInfo;
        String str;
        IMonitor LJI2;
        String str2;
        Object obj;
        C46554IOw c46554IOw = this.LJFF;
        if (c46554IOw == null || (videoInfo = this.LJ) == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("group_id", videoInfo.getAid());
            jSONObject.put("end_type", this.LIZIZ);
            jSONObject.put("duration", this.LIZ);
            jSONObject.put("vduration", Float.valueOf(videoInfo.getDuration()));
            jSONObject.put("position", c46554IOw.LIZJ);
            jSONObject.put("is_cache", c46554IOw.LIZ);
            jSONObject.put("is_bytevc1", videoInfo.isBytevc1());
            jSONObject.put("video_size", videoInfo.getVideoSize());
            jSONObject.put("play_sess", c46554IOw.LJII);
            jSONObject.put("block_type", c46554IOw.LIZLLL);
            jSONObject.put("bitrate_set", videoInfo.getBitRateSet());
            jSONObject.put("video_bitrate", videoInfo.getVideoBitrate());
            jSONObject.put("video_quality", videoInfo.getVideoQuality());
            jSONObject.put("audio_bitrate", videoInfo.getAudioBitrate());
            jSONObject.put("audio_quality", videoInfo.getAudioQuality());
            jSONObject.put("cache_size", videoInfo.getPreCacheSize());
            jSONObject.put("player_type", c46554IOw.LJIIIIZZ);
            jSONObject.put("pre_cache_size", videoInfo.getPreCacheSize());
            jSONObject.put("enable_hdr", videoInfo.getEnableHdr());
            jSONObject.put("internet_speed", c46554IOw.LJ);
            jSONObject.put("is_start", -1);
            if (!this.LIZJ) {
                jSONObject.put("drop_cnt", -1);
            } else {
                jSONObject.put("request_info", (Object) null);
            }
            for (String str3 : c46554IOw.LJIILIIL.keySet()) {
                jSONObject.put(str3, c46554IOw.LJIILIIL.get(str3));
            }
        } catch (JSONException unused) {
        }
        IEvent LIZJ = C46982IcE.LIZJ();
        String str4 = "video_block";
        if (LIZJ != null) {
            if (this.LIZJ) {
                str = "video_block";
            } else {
                str = "video_decoder_block";
            }
            LIZJ.onEvent(str, jSONObject);
        }
        if (this.LIZLLL != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (this.LIZJ) {
                obj = "video_block";
            } else {
                obj = "video_decoder_block";
            }
            linkedHashMap.put("video_block_key", obj);
            if (!this.LIZJ) {
                str4 = "video_decoder_block";
            }
            linkedHashMap.put(str4, jSONObject);
            UpdateCallback updateCallback = this.LIZLLL;
            o.LJI(updateCallback);
            updateCallback.update(3, linkedHashMap);
        }
        if (!IZ8.LJIIIZ() && (LJI2 = C46982IcE.LJI()) != null) {
            if (this.LIZJ) {
                str2 = "aweme_block_bitrate_netspeed_log";
            } else {
                str2 = "aweme_block_decoder_log";
            }
            LJI2.monitorCommonLog(str2, jSONObject);
        }
        C79146V4k.LJJJJIZL();
    }
}
