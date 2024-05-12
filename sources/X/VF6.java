package X;

import org.json.JSONObject;

/* loaded from: classes15.dex */
public final class VF6 extends F9E {
    public final String LJLIL;
    public long LJLILLLLZI = 0;
    public long LJLJI = 0;
    public int LJLJJI = 0;
    public int LJLJJL = 0;
    public int LJLJJLL = 0;
    public boolean LJLJL = false;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, Long.valueOf(this.LJLILLLLZI), Long.valueOf(this.LJLJI), Integer.valueOf(this.LJLJJI), Integer.valueOf(this.LJLJJL), Integer.valueOf(this.LJLJJLL), Boolean.valueOf(this.LJLJL)};
    }

    public final JSONObject LJJIII() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("is_success", this.LJLJJLL);
        jSONObject.put("type", this.LJLIL);
        jSONObject.put("duration", this.LJLJI - this.LJLILLLLZI);
        jSONObject.put("width", this.LJLJJI);
        jSONObject.put("height", this.LJLJJL);
        return jSONObject;
    }

    public VF6(String str) {
        this.LJLIL = str;
    }
}
