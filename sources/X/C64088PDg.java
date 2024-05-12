package X;

import org.json.JSONObject;

/* renamed from: X.PDg, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64088PDg implements InterfaceC64090PDi {
    public final JSONObject LIZ;
    public final String LIZIZ;
    public final boolean LIZJ = false;
    public final String LIZLLL = "batch_tracing";
    public final boolean LJ;

    @Override // X.InterfaceC64090PDi
    public final boolean LIZJ() {
        return false;
    }

    @Override // X.InterfaceC64090PDi
    public final String LJ() {
        return "tracing";
    }

    @Override // X.InterfaceC64090PDi
    public final JSONObject LIZ() {
        return this.LIZ;
    }

    @Override // X.InterfaceC64090PDi
    public final String LIZIZ() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC64090PDi
    public final boolean LIZLLL(JSONObject jSONObject) {
        if ("app_launch_trace".equals(this.LIZIZ)) {
            return C64099PDr.LIZ("start_trace");
        }
        if (!this.LJ) {
            if (C64082PDa.LIZIZ().LIZJ(this.LIZIZ, this.LIZJ) == 0) {
                return false;
            }
        }
        return true;
    }

    public C64088PDg(String str, JSONObject jSONObject, boolean z) {
        this.LIZ = jSONObject;
        this.LIZIZ = str;
        this.LJ = z;
    }
}
