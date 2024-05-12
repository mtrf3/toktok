package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveGiftNewGifterBadgeSetting;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.VCe, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79348VCe extends C79360VCq {
    public int LIZ = -1;
    public int LIZIZ = -1;
    public int LIZJ = -1;
    public long LIZLLL = -1;
    public int LJ = -1;
    public int LJFF = -1;
    public int LJI = -1;
    public int LJII = -1;
    public int LJIIIIZZ = -1;
    public List<String> LJIIIZ = new ArrayList();
    public String LJIIJ = LiveGiftNewGifterBadgeSetting.DEFAULT;
    public String LJIIJJI = LiveGiftNewGifterBadgeSetting.DEFAULT;
    public String LJIIL = LiveGiftNewGifterBadgeSetting.DEFAULT;
    public String LJIILIIL = LiveGiftNewGifterBadgeSetting.DEFAULT;

    @Override // X.C79360VCq
    public final JSONObject createCategory() {
        try {
            return new JSONObject().put("is_hit", this.LIZ).put("hit_type", this.LJIIJ).put("index", this.LIZIZ).put("caller", this.LIZJ).put("domain", this.LJIIJJI).put("return_ip", this.LJIIL).put("has_domain_list", this.LJ).put("host_in_domain_list", this.LJFF).put("host_has_local_dns_result", this.LJI).put("has_reset", this.LJII).put("retry_failed", this.LJIIIIZZ).put("stream_session_vv_id", this.LJIILIIL).put("force_dns_host", this.LJIIIZ);
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
            return null;
        }
    }

    @Override // X.C79360VCq
    public final JSONObject createMetric() {
        try {
            return new JSONObject().put("sdk_start_cost", this.LIZLLL);
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
            return null;
        }
    }

    public C79348VCe() {
        this.mServiceName = "live_stream_strategy_node_optimize_service_monitor";
    }
}
