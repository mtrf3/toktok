package X;

import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class O7G {
    public List<String> LIZ;
    public List<String> LIZIZ;
    public List<String> LIZJ;
    public String LIZLLL;
    public int LJ;
    public int LJFF;
    public String LJI;
    public long LJII;

    public final boolean LIZJ() {
        if (C78886Uxe.LJJIIZI(this.LIZLLL) || this.LJ <= 0 || C30591Hz.LJIILLIIL(this.LIZJ) || C78886Uxe.LJJIIZI((String) ListProtector.get(this.LIZJ, 0))) {
            return false;
        }
        return true;
    }

    public final String LIZIZ() {
        StringBuilder LIZ = X1D.LIZ();
        return JBR.LJFF(LIZ, this.LIZLLL, "_encrypt", LIZ);
    }

    public final void LIZ(JSONObject jSONObject) {
        int i;
        JSONArray optJSONArray = jSONObject.optJSONArray("play_track_url_list");
        if (optJSONArray != null && optJSONArray.length() != 0) {
            this.LIZ = new ArrayList();
            for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                try {
                    this.LIZ.add(JSONArrayProtectorUtils.getString(optJSONArray, i2));
                } catch (JSONException e) {
                    C16880lQ.LLLLIIL(e);
                }
            }
        }
        JSONArray optJSONArray2 = jSONObject.optJSONArray("playover_track_url_list");
        if (optJSONArray2 != null && optJSONArray2.length() != 0) {
            this.LIZIZ = new ArrayList();
            for (int i3 = 0; i3 < optJSONArray2.length(); i3++) {
                try {
                    this.LIZIZ.add(JSONArrayProtectorUtils.getString(optJSONArray2, i3));
                } catch (Exception e2) {
                    C16880lQ.LLLLIIL(e2);
                }
            }
        }
        JSONArray optJSONArray3 = jSONObject.optJSONArray("video_url_list");
        if (optJSONArray3 != null && optJSONArray3.length() != 0) {
            this.LIZJ = new ArrayList();
            for (int i4 = 0; i4 < optJSONArray3.length(); i4++) {
                try {
                    this.LIZJ.add(JSONArrayProtectorUtils.getString(optJSONArray3, i4));
                } catch (Exception e3) {
                    C16880lQ.LLLLIIL(e3);
                }
            }
        }
        this.LIZLLL = jSONObject.optString("video_id");
        jSONObject.optLong("video_group_id");
        jSONObject.optBoolean("voice_switch");
        this.LJII = jSONObject.optLong("video_duration_ms");
        String optString = jSONObject.optString("video_density");
        this.LJI = jSONObject.optString("secret_key");
        int indexOf = optString.indexOf("x");
        if (indexOf < 0 || (i = indexOf + 1) >= optString.length()) {
            return;
        }
        this.LJFF = CastIntegerProtector.parseInt(optString.substring(0, indexOf));
        this.LJ = CastIntegerProtector.parseInt(optString.substring(i));
    }
}
