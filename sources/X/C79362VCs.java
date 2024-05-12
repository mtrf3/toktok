package X;

import java.util.HashSet;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.VCs, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79362VCs extends C79360VCq {
    public long LIZIZ;
    public int LIZ = -1;
    public java.util.Set<String> LIZJ = new HashSet();

    @Override // X.C79360VCq
    public final JSONObject createCategory() {
        try {
            return new JSONObject().put("enable_topn", this.LIZ).put("pre_dns_host", this.LIZJ);
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
            return null;
        }
    }

    @Override // X.C79360VCq
    public final JSONObject createMetric() {
        try {
            return new JSONObject().put("pre_dns_cost", this.LIZIZ);
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
            return null;
        }
    }

    public C79362VCs() {
        this.mServiceName = "live_stream_strategy_node_optimize";
    }
}
