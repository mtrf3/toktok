package X;

import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class NVK implements F22 {
    public final Object LJLIL;

    @Override // X.F22
    public final String getName() {
        return "notification";
    }

    @Override // X.F22
    public final Object getParams() {
        return this.LJLIL;
    }

    public NVK(JSONObject jSONObject) {
        this.LJLIL = jSONObject;
    }
}
