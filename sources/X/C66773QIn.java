package X;

import org.json.JSONObject;

/* renamed from: X.QIn, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66773QIn implements J2V {
    public final /* synthetic */ String LIZ;
    public final /* synthetic */ String LIZIZ;
    public final /* synthetic */ String LIZJ;
    public final /* synthetic */ C66771QIl LIZLLL;

    @Override // X.J2V
    public final Object LIZ() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("appId", this.LIZLLL.LIZ.LIZLLL.LJIIIZ);
            jSONObject.put("did", this.LIZ);
            jSONObject.put("installId", this.LIZIZ);
            jSONObject.put("ssid", this.LIZJ);
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    public C66773QIn(C66771QIl c66771QIl, String str, String str2, String str3) {
        this.LIZLLL = c66771QIl;
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
    }
}
