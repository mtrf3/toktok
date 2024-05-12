package X;

import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.realx.base.NetworkTypeUtils;
import org.json.JSONObject;

/* renamed from: X.UAc, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class RunnableC76746UAc implements Runnable {
    public final /* synthetic */ U66 LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ int LJLJJI;
    public final /* synthetic */ long LJLJJL;
    public final /* synthetic */ boolean LJLJJLL;
    public final /* synthetic */ String LJLJL;

    public RunnableC76746UAc(U66 u66, String str, String str2, int i, long j, boolean z, String str3) {
        this.LJLIL = u66;
        this.LJLILLLLZI = str;
        this.LJLJI = str2;
        this.LJLJJI = i;
        this.LJLJJL = j;
        this.LJLJJLL = z;
        this.LJLJL = str3;
    }

    public final void LIZ() {
        JSONObject LJIJI = UC0.LJIJI(this.LJLIL);
        UA9.LJFF().LIZIZ(new UAT(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, C31012CFc.LIZIZ(), LJIJI, System.currentTimeMillis(), NetworkTypeUtils.isNetworkAvailable(((IHostAppContext) CN1.LIZ(IHostAppContext.class)).context()), this.LJLJJL, this.LJLJJLL, this.LJLJL));
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
