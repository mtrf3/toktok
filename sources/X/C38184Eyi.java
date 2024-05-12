package X;

import org.json.JSONObject;

/* renamed from: X.Eyi, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38184Eyi {
    public long LIZ;
    public long LIZIZ;
    public long LIZJ;
    public long LIZLLL;
    public long LJ;
    public long LJFF;
    public long LJI;

    public final boolean LIZ() {
        if (this.LIZ > 0 && this.LIZIZ > 0 && this.LIZJ > 0 && this.LIZLLL > 0 && this.LJ > 0 && this.LJFF > 0 && this.LJI > 0) {
            return true;
        }
        return false;
    }

    public final JSONObject LIZLLL() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("on_call_from_js", this.LIZIZ - this.LIZ);
            jSONObject.put("on_decode_end", this.LIZJ - this.LIZ);
            jSONObject.put("on_method_call", this.LIZLLL - this.LIZ);
            jSONObject.put("on_callback_start", this.LJ - this.LIZ);
            jSONObject.put("on_encode_end", this.LJFF - this.LIZ);
            C3C5.m7constructorimpl(jSONObject.put("on_callback_end", this.LJI - this.LIZ));
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
        return jSONObject;
    }

    public static void LIZIZ(C38184Eyi c38184Eyi) {
        c38184Eyi.getClass();
        c38184Eyi.LJ = System.currentTimeMillis();
    }

    public static void LIZJ(C38184Eyi c38184Eyi) {
        c38184Eyi.getClass();
        c38184Eyi.LJFF = System.currentTimeMillis();
    }
}
