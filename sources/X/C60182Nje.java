package X;

import org.json.JSONObject;

/* renamed from: X.Nje, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60182Nje implements F22 {
    public final Object LJLIL;

    @Override // X.F22
    public final String getName() {
        return "bulletOnBackPressAction";
    }

    @Override // X.F22
    public final Object getParams() {
        return this.LJLIL;
    }

    public C60182Nje(AbstractActivityC60177NjZ abstractActivityC60177NjZ) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("containerID", abstractActivityC60177NjZ.LLFII().getReactId());
        this.LJLIL = jSONObject;
    }
}
