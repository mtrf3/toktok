package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.ttvideoengine.TTVideoEngine;
import org.json.JSONObject;

/* renamed from: X.Ip8, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C47782Ip8 {
    public int LIZ = LiveLayoutPreloadThreadPriority.DEFAULT;
    public String LIZIZ = "";
    public String LIZJ = "";
    public String LIZLLL = "";
    public long LJ = -2147483648L;
    public int LJFF = LiveLayoutPreloadThreadPriority.DEFAULT;
    public int LJI = LiveLayoutPreloadThreadPriority.DEFAULT;
    public String LJII = "";
    public String LJIIIIZZ = "";
    public long LJIIIZ = -2147483648L;
    public long LJIIJ = -2147483648L;
    public long LJIIJJI = -2147483648L;
    public long LJIIL = -2147483648L;
    public int LJIILIIL = LiveLayoutPreloadThreadPriority.DEFAULT;
    public String LJIILJJIL = "";
    public String LJIILL = "";
    public String LJIILLIIL = "";
    public String LJIIZILJ = "";
    public int LJIJ = LiveLayoutPreloadThreadPriority.DEFAULT;
    public int LJIJI = LiveLayoutPreloadThreadPriority.DEFAULT;
    public long LJIJJ = -2147483648L;
    public long LJIJJLI = -2147483648L;
    public long LJIL = -2147483648L;
    public int LJJ = LiveLayoutPreloadThreadPriority.DEFAULT;
    public long LJJI = -2147483648L;
    public String LJJIFFI = "";
    public int LJJII = LiveLayoutPreloadThreadPriority.DEFAULT;

    public final void LIZ(JSONObject jSONObject) {
        if (jSONObject != null) {
            if (!jSONObject.isNull("err_code")) {
                this.LJFF = ((Number) jSONObject.get("err_code")).intValue();
            }
            if (!jSONObject.isNull("reply_size")) {
                this.LJ = ((Number) jSONObject.get("reply_size")).longValue();
            }
            if (!jSONObject.isNull("cur_host")) {
                this.LIZJ = jSONObject.get("cur_host").toString();
            }
            if (!jSONObject.isNull("cur_ip")) {
                this.LIZIZ = jSONObject.get("cur_ip").toString();
            }
            if (!jSONObject.isNull("speed")) {
                this.LJI = ((Number) jSONObject.get("speed")).intValue();
            }
            if (!jSONObject.isNull("cdn_type")) {
                this.LJJ = ((Number) jSONObject.get("cdn_type")).intValue();
            }
            if (!jSONObject.isNull("url")) {
                this.LIZLLL = jSONObject.get("url").toString();
            }
            if (!jSONObject.isNull("file_key")) {
                this.LJII = jSONObject.get("file_key").toString();
            }
            if (!jSONObject.isNull("re_url")) {
                this.LJIIIIZZ = jSONObject.get("re_url").toString();
            }
            if (!jSONObject.isNull("end_t")) {
                this.LJIIIZ = ((Number) jSONObject.get("end_t")).longValue();
            }
            if (!jSONObject.isNull("dns_t")) {
                this.LJIIJ = ((Number) jSONObject.get("dns_t")).longValue();
            }
            if (!jSONObject.isNull("tbs")) {
                this.LJIIJJI = ((Number) jSONObject.get("tbs")).longValue();
            }
            if (!jSONObject.isNull("lbs")) {
                this.LJIIL = ((Number) jSONObject.get("lbs")).longValue();
            }
            if (!jSONObject.isNull("v_p2p_ier")) {
                this.LJIILIIL = ((Number) jSONObject.get("v_p2p_ier")).intValue();
            }
            if (!jSONObject.isNull("ip_list")) {
                this.LJIILJJIL = jSONObject.get("ip_list").toString();
            }
            if (!jSONObject.isNull("blocked_ip")) {
                this.LJIILL = jSONObject.get("blocked_ip").toString();
            }
            if (!jSONObject.isNull("cdn_cache")) {
                this.LJIILLIIL = jSONObject.get("cdn_cache").toString();
            }
            if (!jSONObject.isNull("client_info")) {
                this.LJIIZILJ = jSONObject.get("client_info").toString();
            }
            if (!jSONObject.isNull("disable_seek")) {
                this.LJIJ = ((Number) jSONObject.get("disable_seek")).intValue();
            }
            if (!jSONObject.isNull("mem_buffer_len")) {
                this.LJIJI = ((Number) jSONObject.get("mem_buffer_len")).intValue();
            }
            if (!jSONObject.isNull("disk_buffer_len")) {
                this.LJIJJ = ((Number) jSONObject.get("disk_buffer_len")).longValue();
            }
            if (!jSONObject.isNull("send_offset")) {
                this.LJIJJLI = ((Number) jSONObject.get("send_offset")).longValue();
            }
            if (!jSONObject.isNull("last_req_offset")) {
                this.LJIL = ((Number) jSONObject.get("last_req_offset")).longValue();
            }
            if (TTVideoEngine.LJIIZILJ == 0 && !jSONObject.isNull("last_ip_list")) {
                this.LJJIFFI = jSONObject.get("last_ip_list").toString();
            }
            if (!jSONObject.isNull("last_read_time")) {
                this.LJJI = ((Number) jSONObject.get("last_read_time")).longValue();
            }
            if (!jSONObject.isNull("downloading")) {
                this.LJJII = ((Number) jSONObject.get("downloading")).intValue();
            }
        }
    }
}
