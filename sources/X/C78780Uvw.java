package X;

import com.bytedance.ies.android.base.runtime.depend.IThreadPoolExecutorDepend;
import java.util.concurrent.ExecutorService;

/* renamed from: X.Uvw, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78780Uvw extends AbstractC65781Prl implements InterfaceC65784Pro<ExecutorService> {
    public static final C78780Uvw LJLIL = new C78780Uvw();

    public C78780Uvw() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final ExecutorService invoke() {
        ExecutorService normalThreadExecutor;
        IThreadPoolExecutorDepend iThreadPoolExecutorDepend = (IThreadPoolExecutorDepend) C59835Ne3.LJ.LIZ();
        if (iThreadPoolExecutorDepend != null && (normalThreadExecutor = iThreadPoolExecutorDepend.getNormalThreadExecutor()) != null) {
            return normalThreadExecutor;
        }
        return C38016Ew0.LIZ;
    }
}
