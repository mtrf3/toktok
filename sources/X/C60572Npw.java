package X;

import org.json.JSONObject;

/* renamed from: X.Npw, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60572Npw implements F22 {
    public final Object LJLIL;

    @Override // X.F22
    public final String getName() {
        return "bulletOnSoftInputChangedAction";
    }

    @Override // X.F22
    public final Object getParams() {
        return this.LJLIL;
    }

    public C60572Npw(C60562Npm c60562Npm, int i) {
        boolean z;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("containerID", c60562Npm.LIZIZ.wl());
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        jSONObject.put("keyboardShow", z);
        this.LJLIL = jSONObject;
    }
}
