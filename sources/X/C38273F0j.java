package X;

import org.json.JSONObject;

/* renamed from: X.F0j, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38273F0j implements InterfaceC38012Evw {
    public final InterfaceC38277F0n LJLIL;

    public C38273F0j(InterfaceC38277F0n interfaceC38277F0n) {
        this.LJLIL = interfaceC38277F0n;
    }

    @Override // X.InterfaceC38012Evw
    public final void call(C38048EwW c38048EwW, JSONObject jSONObject) {
        InterfaceC38277F0n interfaceC38277F0n = this.LJLIL;
        if (interfaceC38277F0n != null) {
            interfaceC38277F0n.putAdInfo(jSONObject);
        }
    }
}
