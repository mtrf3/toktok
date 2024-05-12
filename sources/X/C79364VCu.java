package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveGiftNewGifterBadgeSetting;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.VCu, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79364VCu extends C79360VCq {
    public int LJ;
    public String LIZ = LiveGiftNewGifterBadgeSetting.DEFAULT;
    public String LIZIZ = LiveGiftNewGifterBadgeSetting.DEFAULT;
    public String LIZJ = LiveGiftNewGifterBadgeSetting.DEFAULT;
    public String LIZLLL = LiveGiftNewGifterBadgeSetting.DEFAULT;
    public long LJFF = -1;
    public long LJI = -1;

    @Override // X.C79360VCq
    public final JSONObject createCategory() {
        try {
            return new JSONObject().put("table_name", this.LIZ).put("operate", this.LIZIZ).put("operate_info", this.LIZJ).put("index", this.LJ).put("is_success", this.LJI).put("extra_info", this.LIZLLL);
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
            return null;
        }
    }

    @Override // X.C79360VCq
    public final JSONObject createMetric() {
        try {
            return new JSONObject().put("operate_cost", this.LJFF);
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
            return null;
        }
    }

    public C79364VCu() {
        this.mServiceName = "live_stream_strategy_sqlite_data_monitor";
    }

    public final void LIZ(String str, String str2, String str3, String str4, long j, long j2) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LJ++;
        this.LJI = j;
        this.LJFF = System.currentTimeMillis() - j2;
        this.LIZLLL = str4;
    }
}
