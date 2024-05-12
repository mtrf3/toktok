package X;

import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.playereventreporter.VideoInfo;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.ISs, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C46654ISs {
    public static final /* synthetic */ int LIZJ = 0;
    public VideoInfo LIZ;
    public C46648ISm LIZIZ;

    /* JADX WARN: Code restructure failed: missing block: B:114:0x022a, code lost:
    
        if (r1.LJLJI < 0) goto L104;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ() {
        /*
            Method dump skipped, instructions count: 564
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C46654ISs.LIZIZ():void");
    }

    public static JSONObject LIZ(VideoInfo videoInfo, C46648ISm c46648ISm) {
        int i;
        int i2;
        Object obj;
        int i3;
        int i4;
        long videoBitrate;
        Object valueOf;
        JSONObject jSONObject = new JSONObject();
        ILN iln = c46648ISm.LJJIIZI;
        try {
            jSONObject.put("group_id", videoInfo.getAid());
            jSONObject.put("access2", videoInfo.getAccess2());
            jSONObject.put("vduration", Float.valueOf(videoInfo.getDuration()));
            jSONObject.put("play_sess", c46648ISm.LJIIJJI);
            jSONObject.put("cache_size", c46648ISm.LIZLLL);
            jSONObject.put("play_duration", c46648ISm.LIZJ);
            jSONObject.put("wait_duration", c46648ISm.LJ);
            if (videoInfo.getPlayBitrate() > 0) {
                jSONObject.put("cur_cache_duration", (long) (((c46648ISm.LIZLLL * 8.0d) / videoInfo.getPlayBitrate()) * 1000));
            }
            jSONObject.put("is_bytevc1", videoInfo.isBytevc1());
            jSONObject.put("is_success", c46648ISm.LIZ);
            jSONObject.put("codec_id", videoInfo.getCodecId());
            jSONObject.put("codec_name", videoInfo.getCodecName());
            jSONObject.put("play_bitrate", videoInfo.getPlayBitrate());
            jSONObject.put("video_quality", videoInfo.getVideoQuality());
            jSONObject.put("video_bitrate", videoInfo.getVideoBitrate());
            jSONObject.put("audio_quality", videoInfo.getAudioQuality());
            jSONObject.put("audio_bitrate", videoInfo.getAudioBitrate());
            jSONObject.put("pt_predictL", videoInfo.getPtPredictL());
            jSONObject.put("internet_speed", videoInfo.getInternetSpeed());
            jSONObject.put("network_lib_type", c46648ISm.LJIIJ);
            jSONObject.put("sr_fail_reason", c46648ISm.LJII);
            jSONObject.put("is_super_resolution", c46648ISm.LJFF);
            jSONObject.put("super_resolution_type", Float.valueOf(c46648ISm.LJI));
            i = -1;
            jSONObject.put("playOrder", -1);
            jSONObject.put("traffic_economy_mode", -1);
            if (c46648ISm.LJIIIZ) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            jSONObject.put("buffering", i2);
            obj = c46648ISm.LJIILLIIL.get("total_net_buffer_time");
        } catch (JSONException unused) {
        }
        if (obj != null) {
            jSONObject.put("buffer_time", ((Long) obj).longValue());
            Object obj2 = c46648ISm.LJIILLIIL.get("total_net_buffer_count");
            if (obj2 != null) {
                jSONObject.put("buffer_count", ((Integer) obj2).intValue());
                jSONObject.put("enable_hdr", videoInfo.getEnableHdr());
                if (ILN.DEFAULT == iln || ILN.D_FEED == iln) {
                    jSONObject.put("seek_cnt", c46648ISm.LJIIZILJ);
                    jSONObject.put("loop_cnt", c46648ISm.LJIJ);
                    jSONObject.put("bitrate_set", c46648ISm.LJIILL);
                    jSONObject.put("hw_codec_name", videoInfo.getCodecNameStr());
                    jSONObject.put("play_leave_position", c46648ISm.LJIJI);
                    jSONObject.put("is_battery_saver", videoInfo.isBatterySaver());
                }
                if (ILN.T_LITE_FEED == iln) {
                    jSONObject.put("bitrate_set", c46648ISm.LJIILL);
                }
                if (IZ8.LJIJJ()) {
                    jSONObject.put("vpe_internet_speed", videoInfo.getInternetSpeed());
                    jSONObject.put("vpe_timestamp", System.currentTimeMillis());
                }
                ITD itd = new ITD(c46648ISm);
                long j = c46648ISm.LJIJJ;
                long j2 = c46648ISm.LJIJJLI;
                int i5 = c46648ISm.LJIL;
                int i6 = c46648ISm.LJJ;
                if (j > 0 && j2 > 0 && j2 >= j) {
                    i3 = (int) (j2 - j);
                } else {
                    i3 = -1;
                }
                if (i5 > 0 && i6 > 0 && i5 >= i6) {
                    i4 = i5 - i6;
                } else {
                    i4 = -1;
                }
                if (i6 > 0) {
                    i = i6;
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("prepare_stage_1", i3);
                jSONObject2.put("prepare_stage_2", i4);
                jSONObject2.put("prepare_stage_3", i);
                Iterator<String> keys = jSONObject2.keys();
                o.LJIIIIZZ(keys, "pStageCost.keys()");
                while (keys.hasNext()) {
                    String next = keys.next();
                    jSONObject.put(next, jSONObject2.get(next));
                }
                JSONObject LIZIZ = itd.LIZIZ();
                Iterator<String> keys2 = LIZIZ.keys();
                o.LJIIIIZZ(keys2, "kStageCost.keys()");
                while (keys2.hasNext()) {
                    String next2 = keys2.next();
                    jSONObject.put(next2, LIZIZ.get(next2));
                }
                if (c46648ISm.LJIILIIL != null) {
                    List<C87748YcC> list = c46648ISm.LJIILIIL;
                    o.LJI(list);
                    JSONObject LIZ = new C87747YcB(list, c46648ISm.LJIILLIIL, c46648ISm.LJIILJJIL).LIZ();
                    Iterator<String> keys3 = LIZ.keys();
                    o.LJIIIIZZ(keys3, "riJson.keys()");
                    while (keys3.hasNext()) {
                        String next3 = keys3.next();
                        jSONObject.put(next3, LIZ.get(next3));
                    }
                }
                if (c46648ISm.LJIILLIIL.containsKey("video_cache_size")) {
                    String str = (String) C113554cx.LJJJLL("video_cache_size", c46648ISm.LJIILLIIL);
                    if (videoInfo.getPlayBitrate() > 0) {
                        videoBitrate = videoInfo.getPlayBitrate();
                    } else {
                        videoBitrate = videoInfo.getVideoBitrate();
                    }
                    double d = ((c46648ISm.LIZJ / 1000.0d) * videoBitrate) / 8.0d;
                    long parseLong = CastLongProtector.parseLong(str);
                    if (parseLong > 0) {
                        double d2 = parseLong;
                        if (d > d2) {
                            valueOf = 0;
                        } else {
                            valueOf = Double.valueOf(1 - (d / d2));
                        }
                        jSONObject.put("client_waste_rate", valueOf);
                    }
                }
                for (String str2 : c46648ISm.LJIILLIIL.keySet()) {
                    jSONObject.put(str2, c46648ISm.LJIILLIIL.get(str2));
                }
                return jSONObject;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Long");
    }
}
