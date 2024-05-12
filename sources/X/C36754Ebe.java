package X;

import org.json.JSONObject;

/* renamed from: X.Ebe, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C36754Ebe {
    public byte[] LIZ;
    public String LIZIZ;
    public java.util.Map<String, String> LIZJ;
    public java.util.Map<String, String> LJ;
    public int LIZLLL = -1;
    public int LJFF = EnumC36761Ebl.FALLBACK.ordinal();

    public final String LIZ() {
        String str = this.LIZIZ;
        if (str != null) {
            return str;
        }
        byte[] bArr = this.LIZ;
        if (bArr != null) {
            this.LIZIZ = new String(bArr, PVC.LIZ);
        }
        return this.LIZIZ;
    }

    public final JSONObject LIZIZ() {
        Object LIZ;
        JSONObject jSONObject;
        JSONObject jSONObject2 = new JSONObject();
        try {
            String LIZ2 = LIZ();
            if (LIZ2 != null) {
                jSONObject = new JSONObject(LIZ2);
            } else {
                jSONObject = new JSONObject();
            }
            jSONObject2.put("raw", jSONObject);
            jSONObject2.put("headers", C36748EbY.LIZIZ(this.LIZJ));
            jSONObject2.put("cached", this.LJFF);
            LIZ = jSONObject2.put("status_code", this.LIZLLL);
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(LIZ);
        if (m10exceptionOrNullimpl != null) {
            C36762Ebm.LIZIZ("Format json error.", m10exceptionOrNullimpl);
        }
        return jSONObject2;
    }
}
