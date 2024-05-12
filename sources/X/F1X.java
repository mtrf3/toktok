package X;

import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class F1X implements F14 {
    public final /* synthetic */ java.util.Map<String, InterfaceC38012Evw> LIZ;
    public final /* synthetic */ C38049EwX LIZIZ;

    public F1X(java.util.Map<String, InterfaceC38012Evw> map, C38049EwX c38049EwX) {
        this.LIZ = map;
        this.LIZIZ = c38049EwX;
    }

    @Override // X.F14
    public final Object LIZ(String str, F12 f12) {
        if (str != null) {
            this.LIZ.put(str, f12);
        }
        return this.LIZ;
    }

    @Override // X.F14
    public final void LIZIZ(String str, JSONObject jSONObject) {
        this.LIZIZ.LIZLLL(str, jSONObject);
    }
}
