package X;

import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class E30 implements Runnable {
    public final String LJLIL;
    public final JSONObject LJLILLLLZI;
    public final long LJLJI;

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            try {
                E32.LIZ(this.LJLIL, this.LJLJI, this.LJLILLLLZI);
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public E30(String str, long j, JSONObject jSONObject) {
        this.LJLIL = str;
        this.LJLILLLLZI = jSONObject;
        this.LJLJI = j;
    }
}
