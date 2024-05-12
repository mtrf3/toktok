package X;

import org.json.JSONObject;

/* renamed from: X.OOk, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61830OOk extends F9E {
    public final android.net.Uri LJLIL;
    public final JSONObject LJLILLLLZI;
    public final long LJLJI;
    public final int LJLJJI;
    public final String LJLJJL;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, Long.valueOf(this.LJLJI), Integer.valueOf(this.LJLJJI), this.LJLJJL};
    }

    public C61830OOk(android.net.Uri uri, JSONObject jSONObject, long j, int i, String str) {
        this.LJLIL = uri;
        this.LJLILLLLZI = jSONObject;
        this.LJLJI = j;
        this.LJLJJI = i;
        this.LJLJJL = str;
    }
}
