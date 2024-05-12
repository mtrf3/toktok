package X;

import Y.ARunnableS14S0110000_8;
import android.os.Handler;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: X.Iok, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class RunnableC47758Iok implements Runnable {
    public final C47774Ip0 LJLIL;
    public final Handler LJLILLLLZI = new Handler(C16880lQ.LLJJJJ());
    public final C47752Ioe LJLJI;
    public final C47784IpA LJLJJI;

    public final void LIZ() {
        boolean z;
        long j;
        C47774Ip0 c47774Ip0 = this.LJLIL;
        if (c47774Ip0 == null) {
            return;
        }
        C47752Ioe c47752Ioe = this.LJLJI;
        if (c47752Ioe != null && c47752Ioe.LJJZZI) {
            z = true;
        } else {
            z = false;
        }
        C47784IpA c47784IpA = this.LJLJJI;
        c47774Ip0.getClass();
        HashMap hashMap = new HashMap();
        C60903NvH.LJJIJIIJI("event_type", "av_norender", hashMap);
        if (c47752Ioe != null) {
            C60903NvH.LJJIJIIJI("player_sessionid", c47752Ioe.LJIILL, hashMap);
            C60903NvH.LJJIJIIJI("sdk_version", c47752Ioe.LJIIIIZZ, hashMap);
        }
        C60903NvH.LJJIJIIJI("r_stage_errcs", c47784IpA.LJIIJ, hashMap);
        C60903NvH.LJJIJ(c47784IpA.LIZJ, "video_len_before", hashMap);
        C60903NvH.LJJIJ(c47784IpA.LIZLLL, "audio_len_before", hashMap);
        C60903NvH.LJJIJ(c47784IpA.LJ, "vlen_dec_before", hashMap);
        C60903NvH.LJJIJ(c47784IpA.LJFF, "alen_dec_before", hashMap);
        C60903NvH.LJJIJ(c47784IpA.LJI, "vlen_base_before", hashMap);
        C60903NvH.LJJIJ(c47784IpA.LJII, "alen_base_before", hashMap);
        C60903NvH.LJJIJ(c47784IpA.LJIIIZ, "cost_time", hashMap);
        C60903NvH.LJJIIZI(c47774Ip0.LIZLLL, "index", hashMap);
        C60903NvH.LJJIIZI(c47784IpA.LIZ, "norender_type", hashMap);
        C60903NvH.LJJIIZI(c47784IpA.LIZIZ, "reason", hashMap);
        if (c47752Ioe != null) {
            String str = c47752Ioe.LJIJ;
            if (str == null || str.isEmpty()) {
                C60903NvH.LJJIJIIJI("cdn_url", c47752Ioe.LJIILLIIL, hashMap);
            } else {
                C60903NvH.LJJIJIIJI("cdn_url", c47752Ioe.LJIJ, hashMap);
            }
            C60903NvH.LJJIJIIJI("source_type", c47752Ioe.LJJII, hashMap);
            C60903NvH.LJJIJIIJI("v", c47752Ioe.LJJI, hashMap);
            C60903NvH.LJJIJIIJI("vtype", c47752Ioe.LJJIJLIJ, hashMap);
            C60903NvH.LJJIJIIJI("tag", c47752Ioe.LJJJIL, hashMap);
            C60903NvH.LJJIJIIJI("subtag", c47752Ioe.LJJJJ, hashMap);
            C60903NvH.LJJIJIIJI("codec", c47752Ioe.LJJIJ, hashMap);
            C60903NvH.LJJIIZI(c47752Ioe.LJJIJIL, "video_codec_nameid", hashMap);
            C60903NvH.LJJIIZI(c47752Ioe.LJJIJIIJIL, "audio_codec_nameid", hashMap);
            C60903NvH.LJJIIZI(c47752Ioe.LJJIJL, "format_type", hashMap);
            C60903NvH.LJJIIZI(c47752Ioe.LJJJJI, "drm_type", hashMap);
            C60903NvH.LJJIIZ(c47752Ioe.LJJJJJ, "play_speed", hashMap);
            C60903NvH.LJJIIZI(c47752Ioe.LJJZ, "enable_mdl", hashMap);
            C60903NvH.LJJIIZI(c47752Ioe.LJJIII, "video_hw", hashMap);
            C60903NvH.LJJIIZI(c47752Ioe.LJJIIJ, "user_hw", hashMap);
        }
        C60903NvH.LJJIJ(c47784IpA.LJIIIIZZ, "st", hashMap);
        C60903NvH.LJJIJ(c47784IpA.LJIIJJI, "et", hashMap);
        C60903NvH.LJJIJIIJI("end_type", c47784IpA.LJIIZILJ, hashMap);
        C60903NvH.LJJIJIIJI("resolution_before", c47784IpA.LJIIL, hashMap);
        C60903NvH.LJJIIZI(c47784IpA.LJIJJ, "radio_mode", hashMap);
        C60903NvH.LJJIIZI(c47784IpA.LJJIIJZLJL, "setvalidsurface_timeout", hashMap);
        C60903NvH.LJJIJ(c47784IpA.LJIJJLI, "last_av_switch_interval", hashMap);
        C60903NvH.LJJIJ(c47784IpA.LJIL, "last_res_switch_interval", hashMap);
        C60903NvH.LJJIIZI(c47784IpA.LJJ, "headset", hashMap);
        C60903NvH.LJJIIZI(c47784IpA.LJJI, "bt", hashMap);
        C60903NvH.LJJIJ(c47784IpA.LJJIFFI, "last_headset_switch_interval", hashMap);
        C60903NvH.LJJIIZI(c47784IpA.LJJII, "is_background", hashMap);
        C60903NvH.LJJIJ(c47784IpA.LJJIII, "last_foreback_switch_interval", hashMap);
        C60903NvH.LJJIJ(c47784IpA.LJJIIJ, "last_setsurfacenull_interval", hashMap);
        long j2 = c47774Ip0.LJ;
        if (j2 > 0) {
            j = c47784IpA.LJIIIIZZ - j2;
        } else {
            j = -1;
        }
        C60903NvH.LJJIJ(j, "first_frame_interval", hashMap);
        C60903NvH.LJJIIZI(c47784IpA.LJIILL, "begin_pos", hashMap);
        C60903NvH.LJJIIZI(c47784IpA.LJIILLIIL, "end_pos", hashMap);
        long j3 = c47784IpA.LJIILIIL;
        if (j3 > 0) {
            C60903NvH.LJJIJ(c47784IpA.LJIIIIZZ - j3, "last_rebuf_interval", hashMap);
        }
        long j4 = c47784IpA.LJIILJJIL;
        if (j4 > 0) {
            C60903NvH.LJJIJ(c47784IpA.LJIIIIZZ - j4, "last_seek_interval", hashMap);
        }
        C60903NvH.LJJIIZI(c47784IpA.LJIJ, "is_abr", hashMap);
        C60903NvH.LJJIJIIJI("quality_desc_before", c47784IpA.LJIJI, hashMap);
        C60903NvH.LJJIIZI(c47774Ip0.LJFF, "bad_interlaced", hashMap);
        C60903NvH.LJJIIZI(c47784IpA.LJJIIZ, "enable_global_mute_feature", hashMap);
        C60903NvH.LJJIIZI(c47784IpA.LJJIIZI, "global_mute", hashMap);
        C60903NvH.LJJIIZ((float) c47784IpA.LJJIJ, "cpu_rate", hashMap);
        C60903NvH.LJJIIZ((float) c47784IpA.LJJIJIIJI, "cpu_speed", hashMap);
        C60903NvH.LJJIIZI(c47784IpA.LJJIJIIJIL, "power_save_mode", hashMap);
        C60903NvH.LJJIIZ(c47784IpA.LJJIJIL, "battery_current", hashMap);
        C60903NvH.LJJIJ(c47784IpA.LJJIJL, "queue_input_buffer_in_start", hashMap);
        C60903NvH.LJJIJ(c47784IpA.LJJIZ, "queue_input_buffer_in_end", hashMap);
        C60903NvH.LJJIJ(c47784IpA.LJJIJLIJ, "dequeue_output_buffer_in_start", hashMap);
        C60903NvH.LJJIJ(c47784IpA.LJJJ, "dequeue_output_buffer_in_end", hashMap);
        C60903NvH.LJJIIZI(c47784IpA.LJJIL, "mc_monitor_queue_in_start", hashMap);
        C60903NvH.LJJIIZI(c47784IpA.LJJJI, "mc_monitor_queue_in_end", hashMap);
        this.LJLILLLLZI.post(new ARunnableS14S0110000_8(z, new JSONObject(hashMap), 7));
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

    public RunnableC47758Iok(C47774Ip0 c47774Ip0, C47752Ioe c47752Ioe, C47784IpA c47784IpA) {
        this.LJLIL = c47774Ip0;
        this.LJLJI = c47752Ioe;
        this.LJLJJI = c47784IpA;
    }
}
