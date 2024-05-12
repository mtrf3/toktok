package X;

import org.json.JSONObject;

/* renamed from: X.F0i, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38272F0i implements InterfaceC38012Evw {
    public final InterfaceC38276F0m LJLIL;

    public C38272F0i(InterfaceC38276F0m interfaceC38276F0m) {
        this.LJLIL = interfaceC38276F0m;
    }

    @Override // X.InterfaceC38012Evw
    public final void call(C38048EwW c38048EwW, JSONObject jSONObject) {
        InterfaceC38276F0m interfaceC38276F0m = this.LJLIL;
        if (interfaceC38276F0m != null) {
            interfaceC38276F0m.putAdInfoFromAweme(jSONObject);
        }
    }
}
