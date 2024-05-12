package X;

import android.os.Handler;
import com.ss.android.ugc.tiktok.security.ClientSecurityServiceImpl;
import com.ss.android.ugc.tiktok.security.IClientSecurityService;

/* renamed from: X.Evg, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37996Evg implements InterfaceExecutorC37917EuP {
    public final Handler LJLIL = new Handler(C16880lQ.LLJJJJ());

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        IClientSecurityService LJIILIIL;
        if (runnable != null && (LJIILIIL = ClientSecurityServiceImpl.LJIILIIL()) != null) {
            LJIILIIL.LJI(runnable, new ExecutorC37998Evi(this));
        }
    }
}
