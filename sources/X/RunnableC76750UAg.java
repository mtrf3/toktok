package X;

import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.realx.base.NetworkTypeUtils;

/* renamed from: X.UAg, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class RunnableC76750UAg implements Runnable {
    public final /* synthetic */ U66 LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ long LJLJI;
    public final /* synthetic */ long LJLJJI;

    public RunnableC76750UAg(long j, long j2, U66 u66, String str) {
        this.LJLIL = u66;
        this.LJLILLLLZI = str;
        this.LJLJI = j;
        this.LJLJJI = j2;
    }

    public final void LIZ() {
        UA9.LJFF().LIZIZ(new RunnableC76749UAf(this.LJLIL, this.LJLILLLLZI, UC0.LJIJI(this.LJLIL), C31012CFc.LIZIZ(), System.currentTimeMillis(), this.LJLJI, NetworkTypeUtils.isNetworkAvailable(((IHostAppContext) CN1.LIZ(IHostAppContext.class)).context()), this.LJLJJI));
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
