package X;

import org.json.JSONObject;

/* renamed from: X.IJq, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C46418IJq extends F9E {
    public final String LJLIL;
    public final JSONObject LJLILLLLZI;
    public final JSONObject LJLJI;
    public final JSONObject LJLJJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI};
    }

    public C46418IJq(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONObject jSONObject3 = new JSONObject();
        this.LJLIL = "skynet_dns_fuse_block_domain";
        this.LJLILLLLZI = jSONObject;
        this.LJLJI = jSONObject3;
        this.LJLJJI = jSONObject2;
    }
}
