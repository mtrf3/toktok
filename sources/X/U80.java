package X;

import com.bytedance.android.livesdkapi.host.IHostAppContext;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public final class U80 implements Runnable {
    public final /* synthetic */ U66 LJLIL;
    public final /* synthetic */ C76762UAs LJLILLLLZI;
    public final /* synthetic */ long LJLJI;
    public final /* synthetic */ Long LJLJJI;

    public U80(U7T u7t, C76762UAs c76762UAs, long j, Long l) {
        this.LJLIL = u7t;
        this.LJLILLLLZI = c76762UAs;
        this.LJLJI = j;
        this.LJLJJI = l;
    }

    public final void LIZ() {
        boolean z;
        JSONObject LJIJI = UC0.LJIJI(this.LJLIL);
        long LIZIZ = C31012CFc.LIZIZ();
        long currentTimeMillis = System.currentTimeMillis();
        ((IHostAppContext) CN1.LIZ(IHostAppContext.class)).context();
        try {
            z = C2NU.LIZ.LIZIZ();
        } catch (Exception unused) {
            z = false;
        }
        C76762UAs c76762UAs = this.LJLILLLLZI;
        c76762UAs.LIZLLL.LIZIZ(new UAC(c76762UAs, this.LJLIL, LIZIZ, currentTimeMillis, LJIJI, z, this.LJLJI, this.LJLJJI));
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
