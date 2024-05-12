package X;

import org.json.JSONObject;

/* renamed from: X.PJg, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64244PJg implements InterfaceC64239PJb {
    public final /* synthetic */ int LIZ;

    public C64244PJg(int i) {
        this.LIZ = i;
    }

    @Override // X.InterfaceC64239PJb
    public final boolean LIZ(JSONObject jSONObject) {
        String LJFF;
        C64248PJk LIZIZ = C64248PJk.LIZIZ();
        if (this.LIZ == 1) {
            LJFF = C63986P9i.LJFF(PK0.LJIIIIZZ.getEventUploadUrl(), jSONObject.optJSONObject("header"));
        } else {
            LJFF = C63986P9i.LJFF(PK0.LJIIIIZZ.getExceptionUploadUrl(), jSONObject.optJSONObject("header"));
        }
        LIZIZ.LJFF(LJFF, jSONObject);
        return true;
    }
}
