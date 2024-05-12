package X;

import org.json.JSONObject;

/* renamed from: X.PAl, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class RunnableC64015PAl implements Runnable {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ JSONObject LJLJI;
    public final /* synthetic */ JSONObject LJLJJI;
    public final /* synthetic */ JSONObject LJLJJL;
    public final /* synthetic */ JSONObject LJLJJLL;
    public final /* synthetic */ long LJLJL;
    public final /* synthetic */ C64009PAf LJLJLJ;

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            this.LJLJLJ.LJIIL(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL);
        } finally {
            if (LIZ) {
            }
        }
    }

    public RunnableC64015PAl(C64009PAf c64009PAf, String str, int i, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, long j) {
        this.LJLJLJ = c64009PAf;
        this.LJLIL = str;
        this.LJLILLLLZI = i;
        this.LJLJI = jSONObject;
        this.LJLJJI = jSONObject2;
        this.LJLJJL = jSONObject3;
        this.LJLJJLL = jSONObject4;
        this.LJLJL = j;
    }
}
