package X;

import android.os.Handler;
import com.ss.android.ugc.tiktok.security.ClientSecurityServiceImpl;

/* renamed from: X.Ewe, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38056Ewe implements InterfaceExecutorC38087Ex9 {
    public final Handler LJLIL = new Handler(C16880lQ.LLJJJJ());

    @Override // X.InterfaceExecutorC38087Ex9
    public final void release() {
        this.LJLIL.removeCallbacksAndMessages(null);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        ClientSecurityServiceImpl.LJIILIIL().LJI(runnable, new ExecutorC38058Ewg(this));
    }
}
