package X;

import Y.ARunnableS14S0110000_8;
import android.os.Handler;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.ttvideoengine.TTVideoEngine;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: X.Iom, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class RunnableC47760Iom implements Runnable {
    public final C47762Ioo LJLIL;
    public final Handler LJLILLLLZI = new Handler(C16880lQ.LLJJJJ());
    public final C47752Ioe LJLJI;
    public final C47794IpK LJLJJI;

    public final void LIZ() {
        boolean z;
        if (this.LJLIL == null) {
            return;
        }
        C47752Ioe c47752Ioe = this.LJLJI;
        if (c47752Ioe != null) {
            c47752Ioe.LJIIL();
            this.LJLJI.LJJJJZI = C47752Ioe.LJIIIZ();
        }
        C47752Ioe c47752Ioe2 = this.LJLJI;
        if (c47752Ioe2 != null && c47752Ioe2.LJJZZI) {
            z = true;
        } else {
            z = false;
        }
        C47762Ioo c47762Ioo = this.LJLIL;
        C47794IpK c47794IpK = this.LJLJJI;
        c47762Ioo.getClass();
        HashMap hashMap = new HashMap();
        if (c47752Ioe2 != null) {
            C60903NvH.LJJIJIIJI("player_sessionid", c47752Ioe2.LJIILL, hashMap);
            String str = c47752Ioe2.LJIJ;
            if (str == null || str.isEmpty()) {
                C60903NvH.LJJIJIIJI("cdn_url", c47752Ioe2.LJIILLIIL, hashMap);
            } else {
                C60903NvH.LJJIJIIJI("cdn_url", c47752Ioe2.LJIJ, hashMap);
            }
            String str2 = c47752Ioe2.LJIJI;
            if (str2 == null || str2.isEmpty()) {
                C60903NvH.LJJIJIIJI("cdn_ip", c47752Ioe2.LJIIZILJ, hashMap);
            } else {
                C60903NvH.LJJIJIIJI("cdn_ip", c47752Ioe2.LJIJI, hashMap);
            }
            C60903NvH.LJJIJIIJI("source_type", c47752Ioe2.LJJII, hashMap);
            C60903NvH.LJJIJIIJI("v", c47752Ioe2.LJJI, hashMap);
            C60903NvH.LJJIJIIJI("pv", c47752Ioe2.LJ, hashMap);
            C60903NvH.LJJIJIIJI("pc", c47752Ioe2.LJFF, hashMap);
            C60903NvH.LJJIJIIJI("sv", c47752Ioe2.LJI, hashMap);
            C60903NvH.LJJIJIIJI("sdk_version", c47752Ioe2.LJIIIIZZ, hashMap);
            C60903NvH.LJJIJIIJI("vtype", c47752Ioe2.LJJIJLIJ, hashMap);
            C60903NvH.LJJIJIIJI("tag", c47752Ioe2.LJJJIL, hashMap);
            C60903NvH.LJJIJIIJI("subtag", c47752Ioe2.LJJJJ, hashMap);
            C60903NvH.LJJIIZI(LiveLayoutPreloadThreadPriority.DEFAULT, "p2p_cdn_type", hashMap);
            C60903NvH.LJJIJIIJI("codec", c47752Ioe2.LJJIJ, hashMap);
            C60903NvH.LJJIIZI(c47752Ioe2.LJJIJIL, "video_codec_nameid", hashMap);
            C60903NvH.LJJIIZI(c47752Ioe2.LJJIJIIJIL, "audio_codec_nameid", hashMap);
            C60903NvH.LJJIIZI(c47752Ioe2.LJJIJL, "format_type", hashMap);
            C60903NvH.LJJIIZI(c47752Ioe2.LJJJJI, "drm_type", hashMap);
            C60903NvH.LJJIIZI(c47752Ioe2.LJJLIIIJILLIZJL.LJI, "mdl_speed", hashMap);
            C60903NvH.LJJIJIIJI("net_type", c47752Ioe2.LJJJJZI, hashMap);
            C60903NvH.LJJIIZI(LiveLayoutPreloadThreadPriority.DEFAULT, "reuse_socket", hashMap);
            C60903NvH.LJJIJIIJI("mdl_version", c47752Ioe2.LJJJLL, hashMap);
            C60903NvH.LJJIIZI(c47752Ioe2.LJJZ, "enable_mdl", hashMap);
            c47752Ioe2.LJJLIIIJILLIZJL.getClass();
            C60903NvH.LJJIJ(-2147483648L, "mdl_req_t", hashMap);
            C60903NvH.LJJIJ(c47752Ioe2.LJJLIIIJILLIZJL.LJIIIZ, "mdl_end_t", hashMap);
            C60903NvH.LJJIJ(c47752Ioe2.LJJLIIIJILLIZJL.LJIIJ, "mdl_dns_t", hashMap);
            c47752Ioe2.LJJLIIIJILLIZJL.getClass();
            C60903NvH.LJJIJ(-2147483648L, "mdl_tcp_start_t", hashMap);
            c47752Ioe2.LJJLIIIJILLIZJL.getClass();
            C60903NvH.LJJIJ(-2147483648L, "mdl_tcp_end_t", hashMap);
            c47752Ioe2.LJJLIIIJILLIZJL.getClass();
            C60903NvH.LJJIJ(-2147483648L, "mdl_ttfp", hashMap);
            c47752Ioe2.LJJLIIIJILLIZJL.getClass();
            C60903NvH.LJJIJ(-2147483648L, "mdl_httpfb", hashMap);
            C60903NvH.LJJIJIIJI("mdl_cur_ip", c47752Ioe2.LJJLIIIJILLIZJL.LIZIZ, hashMap);
            C60903NvH.LJJIIZI(c47752Ioe2.LJJLIIIJILLIZJL.LIZ, "mdl_cache_type", hashMap);
            C60903NvH.LJJIJ(c47752Ioe2.LJJLIIIJILLIZJL.LJ, "mdl_reply_size", hashMap);
            C60903NvH.LJJIIZI(c47752Ioe2.LJJLIIIJILLIZJL.LJFF, "mdl_error_code", hashMap);
            c47752Ioe2.LJJLIIIJILLIZJL.getClass();
            C60903NvH.LJJIIZI(LiveLayoutPreloadThreadPriority.DEFAULT, "mdl_http_code", hashMap);
            C60903NvH.LJJIJIIJI("mdl_ip_list", c47752Ioe2.LJJLIIIJILLIZJL.LJIILJJIL, hashMap);
            C60903NvH.LJJIJIIJI("mdl_blocked_ips", c47752Ioe2.LJJLIIIJILLIZJL.LJIILL, hashMap);
            c47752Ioe2.LJJLIIIJJI.getClass();
            C60903NvH.LJJIJ(-2147483648L, "a_mdl_req_t", hashMap);
            C60903NvH.LJJIJ(c47752Ioe2.LJJLIIIJJI.LJIIIZ, "a_mdl_end_t", hashMap);
            C60903NvH.LJJIJ(c47752Ioe2.LJJLIIIJJI.LJIIJ, "a_mdl_dns_t", hashMap);
            c47752Ioe2.LJJLIIIJJI.getClass();
            C60903NvH.LJJIJ(-2147483648L, "a_mdl_tcp_start_t", hashMap);
            c47752Ioe2.LJJLIIIJJI.getClass();
            C60903NvH.LJJIJ(-2147483648L, "a_mdl_tcp_end_t", hashMap);
            c47752Ioe2.LJJLIIIJJI.getClass();
            C60903NvH.LJJIJ(-2147483648L, "a_mdl_ttfp", hashMap);
            c47752Ioe2.LJJLIIIJJI.getClass();
            C60903NvH.LJJIJ(-2147483648L, "a_mdl_httpfb", hashMap);
            C60903NvH.LJJIJIIJI("a_mdl_cur_ip", c47752Ioe2.LJJLIIIJJI.LIZIZ, hashMap);
            C60903NvH.LJJIIZI(c47752Ioe2.LJJLIIIJJI.LIZ, "a_mdl_cache_type", hashMap);
            C60903NvH.LJJIJ(c47752Ioe2.LJJLIIIJJI.LJ, "a_mdl_reply_size", hashMap);
            C60903NvH.LJJIIZI(c47752Ioe2.LJJLIIIJJI.LJFF, "a_mdl_error_code", hashMap);
            c47752Ioe2.LJJLIIIJJI.getClass();
            C60903NvH.LJJIIZI(LiveLayoutPreloadThreadPriority.DEFAULT, "a_mdl_http_code", hashMap);
            C60903NvH.LJJIJIIJI("a_mdl_ip_list", c47752Ioe2.LJJLIIIJJI.LJIILJJIL, hashMap);
        }
        C60903NvH.LJJIJIIJI("opera_type", c47794IpK.LIZ, hashMap);
        C60903NvH.LJJIJIIJI("state_before", c47794IpK.LIZIZ, hashMap);
        C60903NvH.LJJIJIIJI("state_after", c47794IpK.LIZJ, hashMap);
        C60903NvH.LJJIJ(c47794IpK.LIZLLL, "cost_time", hashMap);
        C60903NvH.LJJIJIIJI("end_type", c47794IpK.LJ, hashMap);
        C60903NvH.LJJIIZI(c47794IpK.LJIILIIL, "index", hashMap);
        C60903NvH.LJJIJ(c47794IpK.LJIJ, "last_interval", hashMap);
        C60903NvH.LJJIIZI(c47794IpK.LJII, "retry_count", hashMap);
        C60903NvH.LJJIIZI(c47794IpK.LJIIIIZZ, "is_seek_in_buffer", hashMap);
        C60903NvH.LJJIJ(c47794IpK.LJIIIZ, "video_len_after", hashMap);
        C60903NvH.LJJIJ(c47794IpK.LJIIJ, "audio_len_after", hashMap);
        C60903NvH.LJJIJ(c47794IpK.LJIIJJI, "video_len_before", hashMap);
        C60903NvH.LJJIJ(c47794IpK.LJIIL, "audio_len_before", hashMap);
        C60903NvH.LJJIIZI(c47794IpK.LJIJI, "loadtype_when_seek", hashMap);
        C60903NvH.LJJIJ(c47794IpK.LJFF, "st", hashMap);
        C60903NvH.LJJIJ(c47794IpK.LJI, "et", hashMap);
        C60903NvH.LJJIJIIJI("resolution_before", c47794IpK.LJIILJJIL, hashMap);
        C60903NvH.LJJIJIIJI("resolution_after", c47794IpK.LJIILL, hashMap);
        C60903NvH.LJJIIZI(c47794IpK.LJIILLIIL, "bitrate_before", hashMap);
        C60903NvH.LJJIIZI(c47794IpK.LJIIZILJ, "bitrate_after", hashMap);
        C60903NvH.LJJIJ(c47794IpK.LJJ, "s_looper_t", hashMap);
        C60903NvH.LJJIJ(c47794IpK.LJJI, "s_operate_t", hashMap);
        C60903NvH.LJJIJ(c47794IpK.LJJIFFI, "s_exe_begin_t", hashMap);
        C60903NvH.LJJIJ(c47794IpK.LJJII, "s_avformat_seek_t", hashMap);
        C60903NvH.LJJIJ(c47794IpK.LJJIII, "s_c_complete_t", hashMap);
        C60903NvH.LJJIJ(c47794IpK.LJIJJ, "s_complete_t", hashMap);
        C60903NvH.LJJIJ(c47794IpK.LJJIIJ, "s_re_f_packet_t", hashMap);
        C60903NvH.LJJIJ(c47794IpK.LJJIIJZLJL, "s_de_f_audiopacket_t", hashMap);
        C60903NvH.LJJIJ(c47794IpK.LJJIIZ, "s_de_f_audioframe_t", hashMap);
        C60903NvH.LJJIJ(c47794IpK.LJIJJLI, "s_loading_begin_t", hashMap);
        C60903NvH.LJJIJ(c47794IpK.LJIL, "s_loading_end_t", hashMap);
        C60903NvH.LJJIJ(c47794IpK.LJJIIZI, "s_render_f_t", hashMap);
        C60903NvH.LJJIJ(c47762Ioo.LIZLLL, "last_buf_start_t", hashMap);
        C60903NvH.LJJIJ(c47762Ioo.LJ, "last_buf_end_t", hashMap);
        if (TTVideoEngine.LJIIZILJ == 0) {
            C60903NvH.LJJIJIIJI("a_mdl_blocked_ips", c47752Ioe2.LJJLIIIJJI.LJIILL, hashMap);
            c47752Ioe2.LJJLIIIJILLIZJL.getClass();
            C60903NvH.LJJIJ(-2147483648L, "mdl_cur_req_pos", hashMap);
            c47752Ioe2.LJJLIIIJILLIZJL.getClass();
            C60903NvH.LJJIJ(-2147483648L, "mdl_cur_end_pos", hashMap);
            c47752Ioe2.LJJLIIIJJI.getClass();
            C60903NvH.LJJIJ(-2147483648L, "a_mdl_cur_req_pos", hashMap);
            c47752Ioe2.LJJLIIIJJI.getClass();
            C60903NvH.LJJIJ(-2147483648L, "a_mdl_cur_end_pos", hashMap);
            c47752Ioe2.LJJLIIIJILLIZJL.getClass();
            C60903NvH.LJJIJ(-2147483648L, "mdl_cur_cache_pos", hashMap);
            c47752Ioe2.LJJLIIIJJI.getClass();
            C60903NvH.LJJIJ(-2147483648L, "a_mdl_cur_cache_pos", hashMap);
            c47752Ioe2.LJJLIIIJILLIZJL.getClass();
            C60903NvH.LJJIJ(-2147483648L, "mdl_down_pos", hashMap);
            c47752Ioe2.LJJLIIIJJI.getClass();
            C60903NvH.LJJIJ(-2147483648L, "a_mdl_down_pos", hashMap);
        }
        JSONObject jSONObject = new JSONObject(hashMap);
        Handler handler = this.LJLILLLLZI;
        if (handler == null) {
            EnumC47567Ilf.instance.addEventV2(z, jSONObject, "videoplayer_oneopera");
        } else {
            handler.post(new ARunnableS14S0110000_8(z, jSONObject, 8));
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

    public RunnableC47760Iom(C47762Ioo c47762Ioo, C47752Ioe c47752Ioe, C47794IpK c47794IpK) {
        this.LJLIL = c47762Ioo;
        this.LJLJI = c47752Ioe;
        this.LJLJJI = c47794IpK;
    }
}
