package X;

import org.json.JSONObject;

/* loaded from: classes16.dex */
public final class X51 {
    public final JSONObject LIZ;
    public int LIZIZ;

    public X51(JSONObject jSONObject) {
        this.LIZ = jSONObject;
    }

    public final void LIZ(int i) {
        int optInt = this.LIZ.optInt("thread_count", 4);
        if (optInt > 16) {
            optInt = 16;
        }
        if (optInt <= 0) {
            if (this.LIZ.optInt("url_balance", 2) <= 0) {
                i = 1;
            }
        } else if (this.LIZ.optInt("url_balance", 2) == 1) {
            i = Math.min(optInt, i);
        } else {
            i = optInt;
        }
        this.LIZIZ = i;
    }
}
