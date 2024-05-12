package X;

import org.json.JSONObject;

/* renamed from: X.F0y, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38288F0y implements InterfaceC40311Frv {
    public final /* synthetic */ C38150EyA LIZ;

    public C38288F0y(C38150EyA c38150EyA) {
        this.LIZ = c38150EyA;
    }

    @Override // X.InterfaceC40311Frv
    public final void LIZ(InterfaceC78280Uns interfaceC78280Uns, String str) {
        JSONObject jSONObject = new JSONObject();
        if (interfaceC78280Uns != null) {
            jSONObject = C78501UrR.LIZIZ(interfaceC78280Uns);
        }
        C38049EwX c38049EwX = this.LIZ.LJ;
        if (c38049EwX != null) {
            c38049EwX.LJIIIIZZ(str, jSONObject);
        }
    }
}
