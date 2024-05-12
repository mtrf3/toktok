package X;

import com.bytedance.android.livesdkapi.host.IHostAppContext;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public final class UAL implements Runnable {
    public final /* synthetic */ U66 LJLIL;
    public final /* synthetic */ C76762UAs LJLILLLLZI;
    public final /* synthetic */ long LJLJI;
    public final /* synthetic */ long LJLJJI;
    public final /* synthetic */ OSZ<Long, String> LJLJJL;
    public final /* synthetic */ String LJLJJLL;
    public final /* synthetic */ String LJLJL;
    public final /* synthetic */ int LJLJLJ;

    public UAL(U6D u6d, C76762UAs c76762UAs, long j, long j2, OSZ osz, String str, String str2, int i) {
        this.LJLIL = u6d;
        this.LJLILLLLZI = c76762UAs;
        this.LJLJI = j;
        this.LJLJJI = j2;
        this.LJLJJL = osz;
        this.LJLJJLL = str;
        this.LJLJL = str2;
        this.LJLJLJ = i;
    }

    public final void LIZ() {
        boolean z;
        JSONObject LJIJI = UC0.LJIJI(this.LJLIL);
        long currentTimeMillis = System.currentTimeMillis();
        ((IHostAppContext) CN1.LIZ(IHostAppContext.class)).context();
        try {
            z = C2NU.LIZ.LIZIZ();
        } catch (Exception unused) {
            z = false;
        }
        C76762UAs c76762UAs = this.LJLILLLLZI;
        c76762UAs.LIZLLL.LIZIZ(new UAJ(c76762UAs, this.LJLIL, this.LJLJI, this.LJLJJI, LJIJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, z, currentTimeMillis, this.LJLJLJ));
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }
}
