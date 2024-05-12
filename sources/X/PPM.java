package X;

import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class PPM implements J2V {
    public final /* synthetic */ String LIZ;
    public final /* synthetic */ int LIZIZ;
    public final /* synthetic */ byte[] LIZJ;
    public final /* synthetic */ String LIZLLL;
    public final /* synthetic */ long LJ;
    public final /* synthetic */ QH8 LJFF;

    @Override // X.J2V
    public final Object LIZ() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("appId", this.LJFF.LIZIZ.LJIIIZ);
            jSONObject.put("nid", this.LIZ);
            jSONObject.put("statusCode", this.LIZIZ);
            jSONObject.put("responseByte", this.LIZJ);
            jSONObject.put("responseString", this.LIZLLL);
            jSONObject.put("time", this.LJ);
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    public PPM(QH8 qh8, String str, int i, byte[] bArr, String str2, long j) {
        this.LJFF = qh8;
        this.LIZ = str;
        this.LIZIZ = i;
        this.LIZJ = bArr;
        this.LIZLLL = str2;
        this.LJ = j;
    }
}
