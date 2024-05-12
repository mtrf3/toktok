package X;

import org.json.JSONObject;

/* renamed from: X.Ipr, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47827Ipr implements InterfaceC47420IjI {
    public final /* synthetic */ C47804IpU LIZ;

    public C47827Ipr(C47804IpU c47804IpU) {
        this.LIZ = c47804IpU;
    }

    @Override // X.InterfaceC47420IjI
    public final void LIZIZ(JSONObject jSONObject, C47789IpF c47789IpF) {
        if (jSONObject == null) {
            if (c47789IpF != null) {
                this.LIZ.LJFF(c47789IpF);
                return;
            }
        } else if (c47789IpF != null) {
            this.LIZ.LJIILL = c47789IpF.LIZIZ;
        }
        this.LIZ.LIZJ(jSONObject, null);
    }
}
