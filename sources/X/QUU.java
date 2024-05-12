package X;

import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class QUU implements QUP {
    public static final QUV LIZ = new QUV();

    public static QUP LIZJ() {
        return (QUP) LIZ.LIZLLL(new Object[0]);
    }

    @Override // X.QUP
    public final void LIZIZ(boolean z) {
        JSONObject jSONObject = new JSONObject();
        C77413UZt.LJJII(z ? 1 : 0, "login", jSONObject);
        PV6.LIZ("sync_account_status", jSONObject, null, null);
    }

    @Override // X.QUP
    public final void LIZ(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        C77413UZt.LJJIII("config", str, jSONObject);
        C77413UZt.LJJIII("error", str2, jSONObject);
        PV6.LIZ("sync_config", jSONObject, null, null);
    }

    @Override // X.QUP
    public final void ensureNotReachHere(Throwable th, String str) {
        PV6.LIZJ(str, th);
    }
}
