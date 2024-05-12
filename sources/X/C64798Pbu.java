package X;

import android.os.SystemClock;
import com.bytedance.retrofit2.SsHttpCall;
import java.util.concurrent.Executor;

/* renamed from: X.Pbu, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64798Pbu implements InterfaceRunnableC64808Pc4 {
    public final /* synthetic */ InterfaceC37346ElC LJLIL;
    public final /* synthetic */ Executor LJLILLLLZI;
    public final /* synthetic */ Runnable LJLJI;
    public final /* synthetic */ SsHttpCall LJLJJI;

    @Override // X.InterfaceRunnableC64808Pc4
    public final int LJJIIZI() {
        return 0;
    }

    @Override // X.InterfaceRunnableC64808Pc4
    public final boolean isStreaming() {
        return this.LJLJJI.requestFactory.isResponseStreaming;
    }

    @Override // X.InterfaceRunnableC64808Pc4
    public final int priority() {
        return this.LJLJJI.requestFactory.priorityLevel;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            SsHttpCall ssHttpCall = this.LJLJJI;
            if (ssHttpCall.originalRequest == null) {
                C64738Paw c64738Paw = ssHttpCall.httpCallMetrics;
                c64738Paw.LJIJ = SystemClock.uptimeMillis();
                SsHttpCall ssHttpCall2 = this.LJLJJI;
                ssHttpCall2.originalRequest = ssHttpCall2.requestFactory.toRequest(this.LJLIL, ssHttpCall2.args);
                c64738Paw.LJIJI = SystemClock.uptimeMillis();
            }
        } catch (Throwable th) {
            this.LJLJJI.preBuildURLException = th;
        }
        this.LJLILLLLZI.execute(this.LJLJI);
    }

    public C64798Pbu(SsHttpCall ssHttpCall, InterfaceC37346ElC interfaceC37346ElC, Executor executor, C64796Pbs c64796Pbs) {
        this.LJLJJI = ssHttpCall;
        this.LJLIL = interfaceC37346ElC;
        this.LJLILLLLZI = executor;
        this.LJLJI = c64796Pbs;
    }
}
