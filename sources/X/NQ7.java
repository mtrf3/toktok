package X;

import com.ss.android.ugc.bytex.pthread.base.proxy.PThreadScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes11.dex */
public final class NQ7 extends AbstractC73391SrD<Boolean> {
    public final /* synthetic */ NQ1 LJLILLLLZI;

    @Override // X.InterfaceC116954iR
    public final void onComplete() {
    }

    @Override // X.InterfaceC116954iR
    public final void onError(Throwable th) {
    }

    public NQ7(NQ1 nq1) {
        this.LJLILLLLZI = nq1;
    }

    @Override // X.InterfaceC116954iR
    public final void onNext(Object obj) {
        RunnableC31793Cdp runnableC31793Cdp;
        if (((Boolean) obj).booleanValue()) {
            this.LJLILLLLZI.LLIFFJFJJ = true;
            return;
        }
        NQ1 nq1 = this.LJLILLLLZI;
        PThreadScheduledThreadPoolExecutor pThreadScheduledThreadPoolExecutor = nq1.LLI;
        if (pThreadScheduledThreadPoolExecutor != null && (runnableC31793Cdp = nq1.LLFZ) != null && nq1.LLIFFJFJJ) {
            pThreadScheduledThreadPoolExecutor.remove(runnableC31793Cdp);
            NQ1 nq12 = this.LJLILLLLZI;
            nq12.LLI.schedule(nq12.LLFZ, 100L, TimeUnit.MILLISECONDS);
        }
        this.LJLILLLLZI.LLIFFJFJJ = false;
    }
}
