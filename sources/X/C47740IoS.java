package X;

import org.json.JSONObject;

/* renamed from: X.IoS, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47740IoS implements InterfaceC47746IoY {
    public final /* synthetic */ String LIZ;
    public final /* synthetic */ String LIZIZ;
    public final /* synthetic */ C47739IoR LIZJ;

    public final void LIZ(JSONObject jSONObject, Error error) {
        if (error != null) {
            this.LIZJ.LIZ(this.LIZ, this.LIZIZ);
            return;
        }
        if (jSONObject == null) {
            this.LIZJ.LIZ(this.LIZ, this.LIZIZ);
            return;
        }
        C47739IoR c47739IoR = this.LIZJ;
        System.currentTimeMillis();
        c47739IoR.getClass();
        if (this.LIZJ.LIZIZ) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("fetch suc, fetch count = ");
            LIZ.append(this.LIZJ.LJ);
            LIZ.append(", response = ");
            LIZ.append(jSONObject.toString());
            X1D.LIZIZ(LIZ);
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("data");
        InterfaceC47747IoZ interfaceC47747IoZ = this.LIZJ.LIZ;
        if (interfaceC47747IoZ != null) {
            ((C47738IoQ) interfaceC47747IoZ).LIZ(jSONObject.optInt("code"), jSONObject.optString("msg"), this.LIZ, this.LIZIZ, optJSONObject);
        }
    }

    public C47740IoS(C47739IoR c47739IoR, String str, String str2) {
        this.LIZJ = c47739IoR;
        this.LIZ = str;
        this.LIZIZ = str2;
    }
}
