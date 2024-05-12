package X;

import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class O8S implements Runnable {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ JSONObject LJLJI;
    public final /* synthetic */ JSONObject LJLJJI;
    public final /* synthetic */ O8O LJLJJL;

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            this.LJLJJL.LJII(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI);
        } finally {
            if (LIZ) {
            }
        }
    }

    public O8S(O8O o8o, String str, int i, JSONObject jSONObject, JSONObject jSONObject2) {
        this.LJLJJL = o8o;
        this.LJLIL = str;
        this.LJLILLLLZI = i;
        this.LJLJI = jSONObject;
        this.LJLJJI = jSONObject2;
    }
}
