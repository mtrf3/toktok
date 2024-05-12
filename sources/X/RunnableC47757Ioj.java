package X;

import Y.ARunnableS14S0110000_8;
import android.os.Handler;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.ttvideoengine.TTVideoEngine;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: X.Ioj, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class RunnableC47757Ioj implements Runnable {
    public final C47765Ior LJLIL;
    public final Handler LJLILLLLZI = new Handler(C16880lQ.LLJJJJ());
    public final C47752Ioe LJLJI;
    public final C47783Ip9 LJLJJI;

    public final void LIZ() {
        boolean z;
        long j;
        C47765Ior c47765Ior = this.LJLIL;
        if (c47765Ior == null) {
            return;
        }
        C47752Ioe c47752Ioe = this.LJLJI;
        if (c47752Ioe != null && c47752Ioe.LJJZZI) {
            z = true;
        } else {
            z = false;
        }
        C47783Ip9 c47783Ip9 = this.LJLJJI;
        HashMap hashMap = new HashMap();
        if (c47752Ioe != null) {
            C60903NvH.LJJIJIIJI("player_sessionid", c47765Ior.LIZ.LJIILL, hashMap);
            String str = c47752Ioe.LJIJ;
            if (str == null || str.isEmpty()) {
                C60903NvH.LJJIJIIJI("cdn_url", c47752Ioe.LJIILLIIL, hashMap);
            } else {
                C60903NvH.LJJIJIIJI("cdn_url", c47752Ioe.LJIJ, hashMap);
            }
            String str2 = c47752Ioe.LJIJI;
            if (str2 == null || str2.isEmpty()) {
                C60903NvH.LJJIJIIJI("cdn_ip", c47752Ioe.LJIIZILJ, hashMap);
            } else {
                C60903NvH.LJJIJIIJI("cdn_ip", c47752Ioe.LJIJI, hashMap);
            }
            C60903NvH.LJJIJIIJI("source_type", c47752Ioe.LJJII, hashMap);
            C60903NvH.LJJIJIIJI("v", c47752Ioe.LJJI, hashMap);
            C60903NvH.LJJIJIIJI("pv", c47752Ioe.LJ, hashMap);
            C60903NvH.LJJIJIIJI("pc", c47752Ioe.LJFF, hashMap);
            C60903NvH.LJJIJIIJI("sv", c47752Ioe.LJI, hashMap);
            C60903NvH.LJJIJIIJI("sdk_version", c47752Ioe.LJIIIIZZ, hashMap);
            C60903NvH.LJJIJIIJI("vtype", c47752Ioe.LJJIJLIJ, hashMap);
            C60903NvH.LJJIJIIJI("tag", c47752Ioe.LJJJIL, hashMap);
            C60903NvH.LJJIJIIJI("subtag", c47752Ioe.LJJJJ, hashMap);
            C60903NvH.LJJIIZI(LiveLayoutPreloadThreadPriority.DEFAULT, "p2p_cdn_type", hashMap);
            C60903NvH.LJJIJIIJI("codec", c47752Ioe.LJJIJ, hashMap);
            C60903NvH.LJJIIZI(c47752Ioe.LJJIJIL, "video_codec_nameid", hashMap);
            C60903NvH.LJJIIZI(c47752Ioe.LJJIJIIJIL, "audio_codec_nameid", hashMap);
            C60903NvH.LJJIIZI(c47752Ioe.LJJIJL, "format_type", hashMap);
            C60903NvH.LJJIIZI(c47752Ioe.LJJJJI, "drm_type", hashMap);
            C60903NvH.LJJIIZ(c47752Ioe.LJJJJJ, "play_speed", hashMap);
            C60903NvH.LJJIJIIJI("net_type", c47752Ioe.LJJJJZI, hashMap);
            C60903NvH.LJJIJIIJI("mdl_version", c47752Ioe.LJJJLL, hashMap);
            C60903NvH.LJJIIZI(c47752Ioe.LJJZ, "enable_mdl", hashMap);
            C60903NvH.LJJIIZI(c47752Ioe.LJJIII, "video_hw", hashMap);
            C60903NvH.LJJIIZI(c47752Ioe.LJJIIJ, "user_hw", hashMap);
        }
        C60903NvH.LJJIJIIJI("event_type", "av_outsync", hashMap);
        C60903NvH.LJJIJ(c47783Ip9.LIZ, "st", hashMap);
        C60903NvH.LJJIJ(c47783Ip9.LIZIZ, "et", hashMap);
        C60903NvH.LJJIJ(c47783Ip9.LJIJI, "cost_time", hashMap);
        C60903NvH.LJJIJIIJI("end_type", c47783Ip9.LJIJJ, hashMap);
        C60903NvH.LJJIJ(c47783Ip9.LJ, "audio_len_before", hashMap);
        C60903NvH.LJJIJ(c47783Ip9.LJFF, "video_len_before", hashMap);
        C60903NvH.LJJIJ(c47783Ip9.LJI, "alen_dec_before", hashMap);
        C60903NvH.LJJIJ(c47783Ip9.LJII, "vlen_dec_before", hashMap);
        C60903NvH.LJJIJ(c47783Ip9.LJIIIIZZ, "alen_base_before", hashMap);
        C60903NvH.LJJIJ(c47783Ip9.LJIIIZ, "vlen_base_before", hashMap);
        C60903NvH.LJJIJIIJI("resolution_before", c47783Ip9.LJIIJ, hashMap);
        C60903NvH.LJJIJIIJI("resolution_after", c47783Ip9.LJIIJJI, hashMap);
        C60903NvH.LJJIIZI(c47783Ip9.LJIIL, "bitrate_before", hashMap);
        C60903NvH.LJJIIZI(c47783Ip9.LJIILIIL, "bitrate_after", hashMap);
        C60903NvH.LJJIIZI(c47765Ior.LJ, "index", hashMap);
        C60903NvH.LJJIIZI(c47783Ip9.LJJI, "radio_mode", hashMap);
        C60903NvH.LJJIJ(c47783Ip9.LJJIFFI, "last_av_switch_interval", hashMap);
        C60903NvH.LJJIJ(c47783Ip9.LJJII, "last_res_switch_interval", hashMap);
        C60903NvH.LJJIIZI(c47783Ip9.LJJIII, "headset", hashMap);
        C60903NvH.LJJIIZI(c47783Ip9.LJJIIJ, "bt", hashMap);
        C60903NvH.LJJIJ(c47783Ip9.LJJIIJZLJL, "last_headset_switch_interval", hashMap);
        C60903NvH.LJJIIZI(c47783Ip9.LJJIIZ, "power", hashMap);
        C60903NvH.LJJIIZI(c47783Ip9.LJJIIZI, "is_charging", hashMap);
        C60903NvH.LJJIJ(c47783Ip9.LJJIJ, "max_av_diff", hashMap);
        C60903NvH.LJJIIZI(c47783Ip9.LJJIJIIJI, "is_background", hashMap);
        C60903NvH.LJJIJ(c47783Ip9.LJJIJIIJIL, "last_foreback_switch_interval", hashMap);
        long j2 = c47765Ior.LJFF;
        long j3 = -1;
        if (j2 > 0) {
            j = c47783Ip9.LIZ - j2;
        } else {
            j = -1;
        }
        C60903NvH.LJJIJ(j, "first_frame_interval", hashMap);
        long j4 = c47765Ior.LJI;
        if (j4 > 0) {
            j3 = c47783Ip9.LIZ - j4;
        }
        C60903NvH.LJJIJ(j3, "last_event_interval", hashMap);
        C60903NvH.LJJIIZI(c47783Ip9.LJIIZILJ, "begin_pos", hashMap);
        C60903NvH.LJJIIZI(c47783Ip9.LJIJ, "end_pos", hashMap);
        C60903NvH.LJJIIZI(c47783Ip9.LIZLLL, "drop_cnt", hashMap);
        long j5 = c47783Ip9.LJIILL;
        if (j5 > 0) {
            C60903NvH.LJJIJ(c47783Ip9.LIZ - j5, "last_rebuf_interval", hashMap);
        }
        long j6 = c47783Ip9.LJIILLIIL;
        if (j6 > 0) {
            C60903NvH.LJJIJ(c47783Ip9.LIZ - j6, "last_seek_interval", hashMap);
        }
        C60903NvH.LJJIIZI(c47783Ip9.LJIJJLI, "is_abr", hashMap);
        C60903NvH.LJJIJIIJI("quality_desc_before", c47783Ip9.LJIL, hashMap);
        C60903NvH.LJJIJIIJI("quality_desc_after", c47783Ip9.LJJ, hashMap);
        C60903NvH.LJJIIZI(c47765Ior.LJIIIZ, "bad_interlaced", hashMap);
        C60903NvH.LJJIJ(c47765Ior.LJII, "v_duration", hashMap);
        C60903NvH.LJJIJ(c47765Ior.LJIIIIZZ, "a_duration", hashMap);
        C60903NvH.LJJIIZ((float) c47783Ip9.LJJIJL, "cpu_rate", hashMap);
        C60903NvH.LJJIIZ((float) c47783Ip9.LJJIJLIJ, "cpu_speed", hashMap);
        C60903NvH.LJJIIZI(c47783Ip9.LJJIL, "power_save_mode", hashMap);
        C60903NvH.LJJIIZ(c47783Ip9.LJJIZ, "battery_current", hashMap);
        if (TTVideoEngine.LJIIZILJ == 0) {
            C60903NvH.LJJIJIIJI("v_dec_fps_list", c47783Ip9.LJIILJJIL, hashMap);
            C60903NvH.LJJIJIIJI("pts_list", c47783Ip9.LIZJ, hashMap);
            C60903NvH.LJJIJIIJIL(hashMap, "pause_time_list", c47783Ip9.LJJIJIL);
        }
        JSONObject jSONObject = new JSONObject(hashMap);
        Handler handler = this.LJLILLLLZI;
        if (handler == null || handler.getLooper() == null) {
            EnumC47567Ilf.instance.addEventV2(z, jSONObject, "videoplayer_oneevent");
            return;
        }
        this.LJLILLLLZI.post(new ARunnableS14S0110000_8(z, jSONObject, 9));
        this.LJLIL.LJI = this.LJLJJI.LIZIZ;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }

    public RunnableC47757Ioj(C47765Ior c47765Ior, C47752Ioe c47752Ioe, C47783Ip9 c47783Ip9) {
        this.LJLIL = c47765Ior;
        this.LJLJI = c47752Ioe;
        this.LJLJJI = c47783Ip9;
    }
}
