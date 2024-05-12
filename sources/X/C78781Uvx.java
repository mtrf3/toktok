package X;

import com.bytedance.ies.android.base.runtime.depend.IThreadPoolExecutorDepend;
import java.util.concurrent.ExecutorService;

/* renamed from: X.Uvx, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78781Uvx extends AbstractC65781Prl implements InterfaceC65784Pro<ExecutorService> {
    public static final C78781Uvx LJLIL = new C78781Uvx();

    public C78781Uvx() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final ExecutorService invoke() {
        ExecutorService iOThreadExecutor;
        IThreadPoolExecutorDepend iThreadPoolExecutorDepend = (IThreadPoolExecutorDepend) C59835Ne3.LJ.LIZ();
        if (iThreadPoolExecutorDepend != null && (iOThreadExecutor = iThreadPoolExecutorDepend.getIOThreadExecutor()) != null) {
            return iOThreadExecutor;
        }
        return C38016Ew0.LIZJ;
    }
}
