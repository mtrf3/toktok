package X;

import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes15.dex */
public final class VDW {
    public final int LIZ;
    public final JSONObject LIZIZ;
    public final String LIZJ;
    public final int LIZLLL;
    public final boolean LJ;
    public final boolean LJFF;

    public VDW(JSONObject jSONObject) {
        this.LIZLLL = 300;
        try {
            int i = JSONObjectProtectorUtils.getInt(jSONObject, "StatusCode");
            this.LIZ = i;
            JSONObjectProtectorUtils.getString(jSONObject, "StatusMessage");
            if (i == 0) {
                this.LIZIZ = JSONObjectProtectorUtils.getJSONObject(jSONObject, "IpMap");
                this.LIZJ = JSONObjectProtectorUtils.getString(jSONObject, "Symbol");
            }
            this.LIZLLL = JSONObjectProtectorUtils.getInt(jSONObject, "DnsTTL");
            this.LJ = JSONObjectProtectorUtils.getBoolean(jSONObject, "EnableIpSettings");
            this.LJFF = JSONObjectProtectorUtils.getBoolean(jSONObject, "EnablePing");
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
    }
}
