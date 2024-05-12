package X;

import org.json.JSONObject;

/* renamed from: X.NLk, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59204NLk implements F22 {
    public final JSONObject LJLIL;

    @Override // X.F22
    public final String getName() {
        return "onDCViewSize";
    }

    @Override // X.F22
    public final /* bridge */ /* synthetic */ Object getParams() {
        return this.LJLIL;
    }

    public C59204NLk(int i, int i2) {
        this.LJLIL = new JSONObject().put("viewPortWidth", i).put("viewPortHeight", i2);
    }
}
