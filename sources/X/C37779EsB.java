package X;

import org.json.JSONObject;

/* renamed from: X.EsB, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37779EsB implements F22 {
    public final String LJLIL;
    public final JSONObject LJLILLLLZI;
    public final /* synthetic */ InterfaceC78280Uns LJLJI;

    @Override // X.F22
    public final String getName() {
        return this.LJLIL;
    }

    @Override // X.F22
    public final /* bridge */ /* synthetic */ Object getParams() {
        return this.LJLILLLLZI;
    }

    public C37779EsB(InterfaceC78280Uns interfaceC78280Uns, String str) {
        JSONObject jSONObject;
        this.LJLJI = interfaceC78280Uns;
        this.LJLIL = str;
        if (interfaceC78280Uns != null) {
            jSONObject = C78501UrR.LIZIZ(interfaceC78280Uns);
        } else {
            jSONObject = new JSONObject();
        }
        this.LJLILLLLZI = jSONObject;
    }
}
