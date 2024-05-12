package X;

import org.json.JSONObject;

/* renamed from: X.aNx, reason: case insensitive filesystem */
/* loaded from: classes30.dex */
public final class RunnableC93257aNx implements Runnable {
    public final /* synthetic */ C93258aNy LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ JSONObject LJLJI;

    public RunnableC93257aNx(C93258aNy c93258aNy, String str, JSONObject jSONObject) {
        this.LJLIL = c93258aNy;
        this.LJLILLLLZI = str;
        this.LJLJI = jSONObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            this.LJLIL.LJ(this.LJLILLLLZI, this.LJLJI);
        } finally {
            if (LIZ) {
            }
        }
    }
}
