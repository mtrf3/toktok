package X;

import Y.ARunnableS44S0100000_8;
import android.os.Handler;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: X.Iow, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class RunnableC47770Iow implements Runnable {
    public final C47761Ion LJLIL;
    public final Handler LJLILLLLZI = new Handler(C16880lQ.LLJJJJ());
    public final C47781Ip7 LJLJI;

    public final void LIZ() {
        if (this.LJLIL == null) {
            return;
        }
        C47781Ip7 c47781Ip7 = this.LJLJI;
        HashMap hashMap = new HashMap();
        C60903NvH.LJJIJ(c47781Ip7.LIZ, "local_time_ms", hashMap);
        C60903NvH.LJJIIZI(c47781Ip7.LIZIZ, "is_abr", hashMap);
        C60903NvH.LJJIJIIJI("vtype", c47781Ip7.LJJIL, hashMap);
        C60903NvH.LJJIIZI(c47781Ip7.LIZJ, "sample_interval", hashMap);
        C60903NvH.LJJIIZI(c47781Ip7.LIZLLL, "video_sample_count", hashMap);
        C60903NvH.LJJIJIIJIL(hashMap, "video_sample_interval", c47781Ip7.LJ);
        C60903NvH.LJJIJIIJIL(hashMap, "video_network_speed_sampling_set", c47781Ip7.LJFF);
        C60903NvH.LJJIJIIJIL(hashMap, "video_network_speed_sampling_load_types", c47781Ip7.LJI);
        C60903NvH.LJJIJIIJIL(hashMap, "video_network_speed_predict_set", c47781Ip7.LJII);
        C60903NvH.LJJIJIIJIL(hashMap, "video_network_speed_predict_load_types", c47781Ip7.LJIIIIZZ);
        C60903NvH.LJJIJIIJIL(hashMap, "video_play_bitrate_set", c47781Ip7.LJIIIZ);
        C60903NvH.LJJIJIIJIL(hashMap, "video_download_bitrate_set", c47781Ip7.LJIIJ);
        C60903NvH.LJJIJIIJIL(hashMap, "video_download_size_set", c47781Ip7.LJIIJJI);
        C60903NvH.LJJIJIIJIL(hashMap, "video_download_costtime_set", c47781Ip7.LJIIL);
        C60903NvH.LJJIJIIJIL(hashMap, "video_tcpInfo_rtt_set", c47781Ip7.LJIILIIL);
        C60903NvH.LJJIJIIJIL(hashMap, "video_tcpInfo_lastRecvDate", c47781Ip7.LJIILJJIL);
        C60903NvH.LJJIJIIJIL(hashMap, "video_mdl_loader_type", c47781Ip7.LJIILL);
        C60903NvH.LJJIIZI(c47781Ip7.LJIILLIIL, "audio_sample_count", hashMap);
        C60903NvH.LJJIJIIJIL(hashMap, "audio_sample_interval", c47781Ip7.LJIIZILJ);
        C60903NvH.LJJIJIIJIL(hashMap, "audio_network_speed_sampling_set", c47781Ip7.LJIJ);
        C60903NvH.LJJIJIIJIL(hashMap, "audio_network_speed_sampling_load_types", c47781Ip7.LJIJI);
        C60903NvH.LJJIJIIJIL(hashMap, "audio_network_speed_predict_set", c47781Ip7.LJIJJ);
        C60903NvH.LJJIJIIJIL(hashMap, "audio_network_speed_predict_load_types", c47781Ip7.LJIJJLI);
        C60903NvH.LJJIJIIJIL(hashMap, "audio_play_bitrate_set", c47781Ip7.LJIL);
        C60903NvH.LJJIJIIJIL(hashMap, "audio_download_bitrate_set", c47781Ip7.LJJ);
        C60903NvH.LJJIJIIJIL(hashMap, "audio_download_size_set", c47781Ip7.LJJI);
        C60903NvH.LJJIJIIJIL(hashMap, "audio_download_costtime_set", c47781Ip7.LJJIFFI);
        C60903NvH.LJJIJIIJIL(hashMap, "audio_tcpInfo_rtt_set", c47781Ip7.LJJII);
        C60903NvH.LJJIJIIJIL(hashMap, "audio_tcpInfo_lastRecvDate", c47781Ip7.LJJIII);
        C60903NvH.LJJIJIIJIL(hashMap, "audio_mdl_loader_type", c47781Ip7.LJJIIJ);
        C60903NvH.LJJIJIIJIL(hashMap, "buffer_len_set", c47781Ip7.LJJIIJZLJL);
        C60903NvH.LJJIJIIJIL(hashMap, "play_speed_set", c47781Ip7.LJJIIZ);
        C60903NvH.LJJIJIIJIL(hashMap, "play_pos_set", c47781Ip7.LJJIIZI);
        C60903NvH.LJJIIZI(c47781Ip7.LJJIJ, "index", hashMap);
        C60903NvH.LJJIJIIJI("player_sessionid", c47781Ip7.LJJIJIIJI, hashMap);
        C60903NvH.LJJIJIIJI("video_id", c47781Ip7.LJJIJIIJIL, hashMap);
        C60903NvH.LJJIJIIJIL(hashMap, "video_bitrate_set", c47781Ip7.LJJIJIL);
        C60903NvH.LJJIJIIJIL(hashMap, "audio_bitrate_set", c47781Ip7.LJJIJL);
        C60903NvH.LJJIIZI(c47781Ip7.LJJIZ, "is_multi_dimensions", hashMap);
        C60903NvH.LJJIIZI(c47781Ip7.LJJJ, "is_multi_dimensions_input", hashMap);
        JSONObject jSONObject = new JSONObject(hashMap);
        try {
            jSONObject.put("bitrate_map_table", c47781Ip7.LJJIJLIJ);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
        Handler handler = this.LJLILLLLZI;
        if (handler == null || handler.getLooper() == null) {
            EnumC47567Ilf.instance.addEventV2(true, jSONObject, "videoplayer_sample");
        } else {
            this.LJLILLLLZI.post(new ARunnableS44S0100000_8(jSONObject, 138));
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

    public RunnableC47770Iow(C47761Ion c47761Ion, C47781Ip7 c47781Ip7) {
        this.LJLIL = c47761Ion;
        this.LJLJI = c47781Ip7;
    }
}
