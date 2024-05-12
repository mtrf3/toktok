package X;

import Y.ARunnableS14S0110000_8;
import android.os.Handler;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.ttvideoengine.TTVideoEngine;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: X.Iog, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class RunnableC47754Iog implements Runnable {
    public final C47759Iol LJLIL;
    public final Handler LJLILLLLZI = new Handler(C16880lQ.LLJJJJ());
    public final C47752Ioe LJLJI;
    public final C47785IpB LJLJJI;

    public final void LIZ() {
        boolean z;
        long j;
        long j2;
        C47759Iol c47759Iol = this.LJLIL;
        if (c47759Iol == null) {
            return;
        }
        C47752Ioe c47752Ioe = this.LJLJI;
        if (c47752Ioe != null && c47752Ioe.LJJZZI) {
            z = true;
        } else {
            z = false;
        }
        C47785IpB c47785IpB = this.LJLJJI;
        HashMap hashMap = new HashMap();
        if (c47752Ioe != null) {
            C60903NvH.LJJIJIIJI("player_sessionid", c47752Ioe.LJIILL, hashMap);
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
            C60903NvH.LJJIJIIJI("resolution", c47752Ioe.LJJJ, hashMap);
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
            C60903NvH.LJJIIZI(LiveLayoutPreloadThreadPriority.DEFAULT, "reuse_socket", hashMap);
            C60903NvH.LJJIIZI(c47752Ioe.LJJLIIIJJIZ, "cur_task_num", hashMap);
            C60903NvH.LJJIIZI(c47752Ioe.LJJLIIIJL, "mdl_conc_count", hashMap);
            C60903NvH.LJJIJ(c47752Ioe.LJJLIIIJILLIZJL.LJIIJ, "mdl_dns_t", hashMap);
            C60903NvH.LJJIIZI(c47752Ioe.LJJLIIIJILLIZJL.LJJII, "mdl_downloading", hashMap);
            C60903NvH.LJJIJ(c47752Ioe.LJJLIIIJILLIZJL.LJJI, "mdl_last_read_time", hashMap);
            C60903NvH.LJJIIZI(c47752Ioe.LJJLIIIJILLIZJL.LJJ, "mdl_cdn_type", hashMap);
            C60903NvH.LJJIIZI(c47752Ioe.LJJLIIIJILLIZJL.LJIJI, "mdl_mem_buffer_len", hashMap);
            C60903NvH.LJJIJ(c47752Ioe.LJJLIIIJILLIZJL.LJIJJ, "mdl_disk_buffer_len", hashMap);
            C60903NvH.LJJIJ(c47752Ioe.LJJLIIIJILLIZJL.LJIJJLI, "mdl_send_offset", hashMap);
            C60903NvH.LJJIJ(c47752Ioe.LJJLIIIJILLIZJL.LJIL, "mdl_last_req_offset", hashMap);
            C60903NvH.LJJIIZI(c47752Ioe.LJJLIIIJILLIZJL.LIZ, "cache_type", hashMap);
            C60903NvH.LJJIJIIJI("cur_ip", c47752Ioe.LJJLIIIJILLIZJL.LIZIZ, hashMap);
            C60903NvH.LJJIJIIJI("cur_host", c47752Ioe.LJJLIIIJILLIZJL.LIZJ, hashMap);
            C60903NvH.LJJIJ(c47752Ioe.LJJLIIIJILLIZJL.LJ, "reply_size", hashMap);
            C60903NvH.LJJIIZI(c47752Ioe.LJJLIIIJILLIZJL.LJFF, "mdl_ec", hashMap);
            C60903NvH.LJJIIZI(c47752Ioe.LJJLIIIJILLIZJL.LJI, "mdl_speed", hashMap);
            C60903NvH.LJJIJIIJI("mdl_file_key", c47752Ioe.LJJLIIIJILLIZJL.LJII, hashMap);
            C60903NvH.LJJIJIIJI("mdl_re_url", c47752Ioe.LJJLIIIJILLIZJL.LJIIIIZZ, hashMap);
            C60903NvH.LJJIJ(c47752Ioe.LJJLIIIJILLIZJL.LJIIJJI, "mdl_tbs", hashMap);
            C60903NvH.LJJIJ(c47752Ioe.LJJLIIIJILLIZJL.LJIIL, "mdl_lbs", hashMap);
            C60903NvH.LJJIJIIJI("mdl_response_cache", c47752Ioe.LJJLIIIJILLIZJL.LJIILLIIL, hashMap);
            C60903NvH.LJJIJIIJI("mdl_response_cinfo", c47752Ioe.LJJLIIIJILLIZJL.LJIIZILJ, hashMap);
            C60903NvH.LJJIIZI(c47752Ioe.LJJLIIIJJI.LIZ, "a_cache_type", hashMap);
            C60903NvH.LJJIJIIJI("a_cur_ip", c47752Ioe.LJJLIIIJJI.LIZIZ, hashMap);
            C60903NvH.LJJIJIIJI("a_cur_host", c47752Ioe.LJJLIIIJJI.LIZJ, hashMap);
            C60903NvH.LJJIIZI(c47752Ioe.LJJLIIIJJI.LJI, "a_mdl_speed", hashMap);
            C60903NvH.LJJIJ(c47752Ioe.LJJLIIIJJI.LJIIJJI, "a_mdl_tbs", hashMap);
            C60903NvH.LJJIJ(c47752Ioe.LJJLIIIJJI.LJIIL, "a_mdl_lbs", hashMap);
            C60903NvH.LJJIJIIJI("a_mdl_response_cache", c47752Ioe.LJJLIIIJJI.LJIILLIIL, hashMap);
            C60903NvH.LJJIJIIJI("a_mdl_response_cinfo", c47752Ioe.LJJLIIIJJI.LJIIZILJ, hashMap);
            C60903NvH.LJJIIZI(c47752Ioe.LJJLIIIJJI.LJIJI, "a_mdl_mem_buffer_len", hashMap);
            C60903NvH.LJJIJ(c47752Ioe.LJJLIIIJJI.LJIJJ, "a_mdl_disk_buffer_len", hashMap);
            C60903NvH.LJJIJ(c47752Ioe.LJJLIIIJJI.LJIJJLI, "a_mdl_send_offset", hashMap);
            C60903NvH.LJJIJ(c47752Ioe.LJJLIIIJJI.LJIL, "a_mdl_last_req_offset", hashMap);
            C60903NvH.LJJIIZI(c47752Ioe.LJJLIIIJJI.LJJ, "a_mdl_cdn_type", hashMap);
            C60903NvH.LJJIJ(c47752Ioe.LJJLIIIJJI.LJJI, "a_mdl_last_read_time", hashMap);
            C60903NvH.LJJIIZI(c47752Ioe.LJJLIIIJJI.LJJII, "a_mdl_downloading", hashMap);
            C60903NvH.LJJIJ(c47752Ioe.LJJLIIIJJI.LJIIJ, "a_mdl_dns_t", hashMap);
        }
        C60903NvH.LJJIJIIJI("event_type", c47785IpB.LIZ, hashMap);
        C60903NvH.LJJIJ(c47785IpB.LIZIZ, "cost_time", hashMap);
        C60903NvH.LJJIJIIJI("end_type", c47785IpB.LIZJ, hashMap);
        C60903NvH.LJJIIZI(c47785IpB.LJIILL, "index", hashMap);
        long j3 = c47759Iol.LJI;
        long j4 = -1;
        if (j3 > 0) {
            j = c47785IpB.LJFF - j3;
        } else {
            j = -1;
        }
        C60903NvH.LJJIJ(j, "first_frame_interval", hashMap);
        long j5 = c47785IpB.LJII;
        if (j5 > 0) {
            j2 = c47785IpB.LJFF - j5;
        } else {
            j2 = -1;
        }
        C60903NvH.LJJIJ(j2, "last_seek_interval", hashMap);
        if (c47759Iol.LIZJ.containsKey(c47785IpB.LIZ)) {
            long longValue = ((Long) c47759Iol.LIZJ.get(c47785IpB.LIZ)).longValue();
            if (longValue > 0) {
                j4 = c47785IpB.LJFF - longValue;
            }
        }
        C60903NvH.LJJIJ(j4, "last_event_interval", hashMap);
        C60903NvH.LJJIIZI(-1, "last_switch_interval", hashMap);
        C60903NvH.LJJIIZI(c47785IpB.LJIIIIZZ, "video_pos", hashMap);
        C60903NvH.LJJIIZI(c47785IpB.LJIIIZ, "retry_count", hashMap);
        C60903NvH.LJJIJ(c47785IpB.LJIILJJIL, "read_count_mdl", hashMap);
        C60903NvH.LJJIJ(c47785IpB.LJIIJJI, "audio_len_before", hashMap);
        C60903NvH.LJJIJ(c47785IpB.LJIIJ, "video_len_before", hashMap);
        C60903NvH.LJJIJ(c47785IpB.LJIILIIL, "audio_len_after", hashMap);
        C60903NvH.LJJIJ(c47785IpB.LJIIL, "video_len_after", hashMap);
        C60903NvH.LJJIJ(c47785IpB.LJIILLIIL, "vlen_dec_before", hashMap);
        C60903NvH.LJJIJ(c47785IpB.LJIJJ, "vlen_base_before", hashMap);
        C60903NvH.LJJIJ(c47785IpB.LJIJ, "alen_dec_before", hashMap);
        C60903NvH.LJJIJ(c47785IpB.LJIL, "alen_base_before", hashMap);
        C60903NvH.LJJIJ(c47785IpB.LJIIZILJ, "vlen_dec_after", hashMap);
        C60903NvH.LJJIJ(c47785IpB.LJIJJLI, "vlen_base_after", hashMap);
        C60903NvH.LJJIJ(c47785IpB.LJIJI, "alen_dec_after", hashMap);
        C60903NvH.LJJIJ(c47785IpB.LJJ, "alen_base_after", hashMap);
        C60903NvH.LJJIJ(c47785IpB.LJJI, "vlen_only_before", hashMap);
        C60903NvH.LJJIJ(c47785IpB.LJJIFFI, "alen_only_before", hashMap);
        C60903NvH.LJJIJ(c47785IpB.LJJII, "player_req_offset", hashMap);
        C60903NvH.LJJIJ(c47785IpB.LJJIII, "a_player_req_offset", hashMap);
        C60903NvH.LJJIJ(c47785IpB.LJJIIJ, "player_read_state", hashMap);
        C60903NvH.LJJIJ(c47785IpB.LJJIIJZLJL, "av_gap", hashMap);
        C60903NvH.LJJIIZI(c47785IpB.LJ, "buffer_reason", hashMap);
        C60903NvH.LJJIJ(c47785IpB.LIZLLL, "pst", hashMap);
        C60903NvH.LJJIJ(c47785IpB.LJFF, "st", hashMap);
        C60903NvH.LJJIJ(c47785IpB.LJI, "et", hashMap);
        C60903NvH.LJJIJIIJI("resolution_before", c47785IpB.LJJIIZ, hashMap);
        C60903NvH.LJJIJIIJI("resolution_after", c47785IpB.LJJIIZI, hashMap);
        C60903NvH.LJJIIZI(c47785IpB.LJJIJ, "bitrate_before", hashMap);
        C60903NvH.LJJIIZI(c47785IpB.LJJIJIIJI, "bitrate_after", hashMap);
        C60903NvH.LJJIIZI(c47785IpB.LJJIJIIJIL, "is_abr", hashMap);
        C60903NvH.LJJIJIIJI("quality_desc_before", c47785IpB.LJJIJIL, hashMap);
        C60903NvH.LJJIJIIJI("quality_desc_after", c47785IpB.LJJIJL, hashMap);
        C60903NvH.LJJIIZI(c47759Iol.LJII, "bad_interlaced", hashMap);
        C60903NvH.LJJIIZ((float) c47785IpB.LJJIJLIJ, "cpu_rate", hashMap);
        C60903NvH.LJJIIZ((float) c47785IpB.LJJIL, "cpu_speed", hashMap);
        C60903NvH.LJJIIZI(c47785IpB.LJJIZ, "power_save_mode", hashMap);
        C60903NvH.LJJIIZ(c47785IpB.LJJJ, "battery_current", hashMap);
        C47578Ilq.LIZ().getClass();
        C60903NvH.LJJIIZI(-1, "network_score", hashMap);
        C47578Ilq.LIZ().getClass();
        C60903NvH.LJJIIZ((float) C47578Ilq.LIZJ, "target_bitrate", hashMap);
        C47529Il3 c47529Il3 = C47147Iet.LIZ;
        String str3 = c47752Ioe.LJJJJLI;
        c47529Il3.LJIIZILJ.getClass();
        java.util.Map LIZJ = C47524Iky.LIZJ(1, str3);
        if (LIZJ != null && !((HashMap) LIZJ).isEmpty()) {
            hashMap.putAll(LIZJ);
        }
        if (TTVideoEngine.LJIIZILJ == 0) {
            C60903NvH.LJJIJIIJI("mdl_last_ip_list", c47752Ioe.LJJLIIIJILLIZJL.LJJIFFI, hashMap);
            C60903NvH.LJJIJIIJI("a_mdl_last_ip_list", c47752Ioe.LJJLIIIJJI.LJJIFFI, hashMap);
            c47752Ioe.LJJLIIIJJI.getClass();
            C60903NvH.LJJIJ(-2147483648L, "a_cur_req_pos", hashMap);
            c47752Ioe.LJJLIIIJJI.getClass();
            C60903NvH.LJJIJ(-2147483648L, "a_cur_end_pos", hashMap);
            c47752Ioe.LJJLIIIJJI.getClass();
            C60903NvH.LJJIJ(-2147483648L, "a_cur_cache_pos", hashMap);
            C60903NvH.LJJIJ(c47752Ioe.LJJLIIIJJI.LJ, "a_reply_size", hashMap);
            c47752Ioe.LJJLIIIJJI.getClass();
            C60903NvH.LJJIJ(-2147483648L, "a_down_pos", hashMap);
            c47752Ioe.LJJLIIIJJI.getClass();
            C60903NvH.LJJIJ(-2147483648L, "a_player_wait_time", hashMap);
            c47752Ioe.LJJLIIIJJI.getClass();
            C60903NvH.LJJIIZI(LiveLayoutPreloadThreadPriority.DEFAULT, "a_player_wait_num", hashMap);
            C60903NvH.LJJIJIIJI("a_mdl_file_key", c47752Ioe.LJJLIIIJJI.LJII, hashMap);
            c47752Ioe.LJJLIIIJJI.getClass();
            C60903NvH.LJJIIZI(LiveLayoutPreloadThreadPriority.DEFAULT, "a_mdl_is_socrf", hashMap);
            c47752Ioe.LJJLIIIJJI.getClass();
            C60903NvH.LJJIIZI(LiveLayoutPreloadThreadPriority.DEFAULT, "a_mdl_req_num", hashMap);
            c47752Ioe.LJJLIIIJJI.getClass();
            C60903NvH.LJJIIZI(LiveLayoutPreloadThreadPriority.DEFAULT, "a_mdl_url_index", hashMap);
            C60903NvH.LJJIJIIJI("a_mdl_re_url", c47752Ioe.LJJLIIIJJI.LJIIIIZZ, hashMap);
            c47752Ioe.LJJLIIIJJI.getClass();
            C60903NvH.LJJIIZI(LiveLayoutPreloadThreadPriority.DEFAULT, "a_mdl_cur_source", hashMap);
            c47752Ioe.LJJLIIIJJI.getClass();
            C60903NvH.LJJIJIIJI("a_mdl_extra_info", "", hashMap);
            c47752Ioe.LJJLIIIJJI.getClass();
            C60903NvH.LJJIJ(-2147483648L, "a_mdl_fs", hashMap);
            C60903NvH.LJJIIZI(c47752Ioe.LJJLIIIJJI.LJFF, "a_mdl_ec", hashMap);
            c47752Ioe.LJJLIIIJJI.getClass();
            C60903NvH.LJJIIZI(LiveLayoutPreloadThreadPriority.DEFAULT, "a_mdl_stage", hashMap);
            c47752Ioe.LJJLIIIJJI.getClass();
            C60903NvH.LJJIIZI(LiveLayoutPreloadThreadPriority.DEFAULT, "a_mdl_p2p_sp", hashMap);
            c47752Ioe.LJJLIIIJILLIZJL.getClass();
            C60903NvH.LJJIJ(-2147483648L, "cur_req_pos", hashMap);
            c47752Ioe.LJJLIIIJILLIZJL.getClass();
            C60903NvH.LJJIJ(-2147483648L, "cur_end_pos", hashMap);
            c47752Ioe.LJJLIIIJILLIZJL.getClass();
            C60903NvH.LJJIJ(-2147483648L, "cur_cache_pos", hashMap);
            c47752Ioe.LJJLIIIJILLIZJL.getClass();
            C60903NvH.LJJIJ(-2147483648L, "down_pos", hashMap);
            c47752Ioe.LJJLIIIJILLIZJL.getClass();
            C60903NvH.LJJIJ(-2147483648L, "player_wait_time", hashMap);
            c47752Ioe.LJJLIIIJILLIZJL.getClass();
            C60903NvH.LJJIIZI(LiveLayoutPreloadThreadPriority.DEFAULT, "player_wait_num", hashMap);
            c47752Ioe.LJJLIIIJILLIZJL.getClass();
            C60903NvH.LJJIIZI(LiveLayoutPreloadThreadPriority.DEFAULT, "mdl_is_socrf", hashMap);
            c47752Ioe.LJJLIIIJILLIZJL.getClass();
            C60903NvH.LJJIIZI(LiveLayoutPreloadThreadPriority.DEFAULT, "mdl_stage", hashMap);
            c47752Ioe.LJJLIIIJILLIZJL.getClass();
            C60903NvH.LJJIIZI(LiveLayoutPreloadThreadPriority.DEFAULT, "mdl_req_num", hashMap);
            c47752Ioe.LJJLIIIJILLIZJL.getClass();
            C60903NvH.LJJIIZI(LiveLayoutPreloadThreadPriority.DEFAULT, "mdl_url_index", hashMap);
            c47752Ioe.LJJLIIIJILLIZJL.getClass();
            C60903NvH.LJJIIZI(LiveLayoutPreloadThreadPriority.DEFAULT, "mdl_cur_source", hashMap);
            c47752Ioe.LJJLIIIJILLIZJL.getClass();
            C60903NvH.LJJIJIIJI("mdl_extra_info", "", hashMap);
            c47752Ioe.LJJLIIIJILLIZJL.getClass();
            C60903NvH.LJJIJ(-2147483648L, "mdl_fs", hashMap);
            c47752Ioe.LJJLIIIJILLIZJL.getClass();
            C60903NvH.LJJIIZI(LiveLayoutPreloadThreadPriority.DEFAULT, "mdl_p2p_sp", hashMap);
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("OneEvent:");
        LIZ.append(hashMap);
        TTVideoEngineLog.d("VideoEventOneEvent", X1D.LIZIZ(LIZ));
        JSONObject jSONObject = new JSONObject(hashMap);
        Handler handler = this.LJLILLLLZI;
        if (handler == null || handler.getLooper() == null) {
            EnumC47567Ilf.instance.addEventV2(z, jSONObject, "videoplayer_oneevent");
            return;
        }
        this.LJLILLLLZI.post(new ARunnableS14S0110000_8(z, jSONObject, 6));
        synchronized (this.LJLIL.LIZJ) {
            this.LJLIL.LIZJ.remove(this.LJLJJI.LIZ);
            HashMap hashMap2 = this.LJLIL.LIZJ;
            C47785IpB c47785IpB2 = this.LJLJJI;
            hashMap2.put(c47785IpB2.LIZ, Long.valueOf(c47785IpB2.LJI));
        }
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

    public RunnableC47754Iog(C47759Iol c47759Iol, C47752Ioe c47752Ioe, C47785IpB c47785IpB) {
        this.LJLIL = c47759Iol;
        this.LJLJI = c47752Ioe;
        this.LJLJJI = c47785IpB;
    }
}
