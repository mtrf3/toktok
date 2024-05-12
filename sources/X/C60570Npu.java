package X;

import org.json.JSONObject;

/* renamed from: X.Npu, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60570Npu implements F22 {
    public final Object LJLIL;

    @Override // X.F22
    public final String getName() {
        return "bulletOnBackPressAction";
    }

    @Override // X.F22
    public final Object getParams() {
        return this.LJLIL;
    }

    public C60570Npu(DialogC60568Nps dialogC60568Nps) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("containerID", dialogC60568Nps.LJLJI.wl());
        this.LJLIL = jSONObject;
    }
}
