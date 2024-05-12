package X;

import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.EwS, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38044EwS implements InterfaceC37120EhY {
    public final /* synthetic */ C37948Euu LIZ;

    public C38044EwS(C37945Eur c37945Eur) {
        this.LIZ = c37945Eur;
    }

    @Override // X.InterfaceC37120EhY
    public final void LIZ(JSONObject data) {
        o.LJIIIZ(data, "data");
        this.LIZ.LIZ(1, "success", data);
    }

    @Override // X.InterfaceC37120EhY
    public final void onError(int i, String str) {
        this.LIZ.LIZ(i, str, null);
    }

    @Override // X.InterfaceC37120EhY
    public final void LIZIZ(int i, String str, JSONObject jSONObject) {
        this.LIZ.LIZ(i, str, jSONObject);
    }
}
