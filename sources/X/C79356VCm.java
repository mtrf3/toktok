package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveGiftNewGifterBadgeSetting;
import java.util.ArrayList;
import java.util.HashSet;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.VCm, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79356VCm extends C79360VCq {
    public long LIZ = -1;
    public int LIZIZ = -1;
    public int LIZJ = -1;
    public int LIZLLL = -1;
    public int LJ = -1;
    public int LJFF = -1;
    public int LJI = -1;
    public int LJII = -1;
    public int LJIIIIZZ = -1;
    public int LJIIIZ = -1;
    public String LJIIJ = LiveGiftNewGifterBadgeSetting.DEFAULT;
    public java.util.Set<String> LJIIJJI;

    @Override // X.C79360VCq
    public final JSONObject createCategory() {
        try {
            return new JSONObject().put("enable_force_refresh", this.LIZLLL).put("enable_localDNS_timeout", this.LJ).put("enable_httpdns", this.LJFF).put("enable_topn", this.LJIIIZ).put("httpdns_type", this.LJI).put("index", this.LJII).put("request_id", this.LJIIJ).put("is_timeout", this.LJIIIIZZ).put("localdns_host", this.LJIIJJI);
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
            return null;
        }
    }

    @Override // X.C79360VCq
    public final JSONObject createMetric() {
        try {
            return new JSONObject().put("cur_total_dns_cost", this.LIZ).put("cur_need_dns_total_domain_cnt", this.LIZIZ).put("cur_domain_cnt", this.LIZJ);
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
            return null;
        }
    }

    public C79356VCm() {
        new ArrayList();
        this.LJIIJJI = new HashSet();
        this.mServiceName = "live_stream_strategy_node_optimize";
    }
}
