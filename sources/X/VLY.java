package X;

import org.json.JSONObject;

/* loaded from: classes15.dex */
public final class VLY {
    public final java.util.Map<String, VLW> LIZ = C113554cx.LJJL(new OSZ("jsbError", new VLU()), new OSZ("fetchError", new VLS()), new OSZ("nativeError", new VLV()), new OSZ("jsbPerf", new VLT()), new OSZ("custom", new VLX()));
    public JSONObject LIZIZ;
    public int LIZJ;
    public String LIZLLL;
    public String LJ;
    public InterfaceC79582VLe LJFF;

    public final void LIZ() {
        int i = this.LIZJ;
        if (i > 0) {
            C77123UOp.LJJJJLL(i, "native_repeat_count", this.LIZIZ);
            VMW.LIZJ(this.LJFF, this.LIZIZ, this.LIZLLL, this.LJ, null);
            this.LIZJ = 0;
        }
    }
}
