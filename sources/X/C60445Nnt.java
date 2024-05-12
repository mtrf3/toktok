package X;

import android.os.Bundle;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import org.json.JSONObject;

/* renamed from: X.Nnt, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60445Nnt {
    public Object LIZ;
    public Object LIZIZ;
    public Object LIZJ;

    public /* synthetic */ C60445Nnt() {
        this.LIZ = new Bundle();
        this.LIZJ = new C60446Nnu();
    }

    public /* synthetic */ C60445Nnt(JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = JSONObjectProtectorUtils.getJSONObject(JSONObjectProtectorUtils.getJSONObject(jSONObject, "options"), "default_quality");
            this.LIZ = JSONObjectProtectorUtils.getString(jSONObject2, "name");
            this.LIZIZ = JSONObjectProtectorUtils.getString(jSONObject2, "sdk_key");
            this.LIZJ = new VAM(new JSONObject(JSONObjectProtectorUtils.getString(jSONObject, "stream_data")));
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }
}
