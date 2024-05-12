package X;

import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class NLS implements F22 {
    public final String LJLIL;
    public final JSONObject LJLILLLLZI;

    @Override // X.F22
    public final String getName() {
        return this.LJLIL;
    }

    @Override // X.F22
    public final /* bridge */ /* synthetic */ Object getParams() {
        return this.LJLILLLLZI;
    }

    public NLS(String str, JSONObject jSONObject) {
        this.LJLIL = str;
        this.LJLILLLLZI = jSONObject;
    }
}
