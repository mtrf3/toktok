package X;

import org.json.JSONObject;

/* renamed from: X.Jju, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50006Jju extends AbstractC50008Jjw {
    @Override // X.AbstractC50008Jjw
    public final String LIZ() {
        return "loadMoreLive";
    }

    @Override // X.AbstractC50008Jjw
    public final void LIZIZ(JSONObject jSONObject, C50007Jjv c50007Jjv) {
        try {
            C2U8.LIZ(new IKT());
        } catch (Exception e) {
            c50007Jjv.LIZ(e.getMessage());
        }
        c50007Jjv.LIZ.LIZ(1, "success", C770830u.LIZLLL("code", 1));
    }
}
