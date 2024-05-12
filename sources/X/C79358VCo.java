package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveGiftNewGifterBadgeSetting;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.VCo, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79358VCo extends C79360VCq {
    public int LJFF;
    public int LIZ = -1;
    public int LIZIZ = -1;
    public int LIZJ = -1;
    public int LIZLLL = -1;
    public String LJ = LiveGiftNewGifterBadgeSetting.DEFAULT;
    public String LJI = LiveGiftNewGifterBadgeSetting.DEFAULT;
    public String LJII = LiveGiftNewGifterBadgeSetting.DEFAULT;

    @Override // X.C79360VCq
    public final JSONObject createCategory() {
        try {
            return new JSONObject().put("enable_force_refresh", this.LIZ).put("enable_localDNS_timeout", this.LIZIZ).put("enable_httpdns", this.LIZJ).put("httpdns_type", this.LIZLLL).put("error_domain", this.LJ).put("index", this.LJFF).put("error_info", this.LJII).put("request_id", this.LJI);
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
            return null;
        }
    }

    public C79358VCo() {
        this.mServiceName = "live_stream_strategy_dns_error_monitor";
    }
}
