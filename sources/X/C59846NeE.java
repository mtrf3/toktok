package X;

import com.bytedance.ies.android.base.runtime.depend.IThreadPoolExecutorDepend;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.o;

/* renamed from: X.NeE, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59846NeE implements IThreadPoolExecutorDepend {
    @Override // com.bytedance.ies.android.base.runtime.depend.IThreadPoolExecutorDepend
    public final ExecutorService getCPUThreadExecutor() {
        ExecutorService LIZJ = C38995FSd.LIZJ();
        o.LJIIIIZZ(LIZJ, "getDefaultExecutor()");
        return LIZJ;
    }

    @Override // com.bytedance.ies.android.base.runtime.depend.IThreadPoolExecutorDepend
    public final ExecutorService getIOThreadExecutor() {
        ExecutorService LIZLLL = C38995FSd.LIZLLL();
        o.LJIIIIZZ(LIZLLL, "getIOExecutor()");
        return LIZLLL;
    }

    @Override // com.bytedance.ies.android.base.runtime.depend.IThreadPoolExecutorDepend
    public final ExecutorService getNormalThreadExecutor() {
        ExecutorService LIZJ = C38995FSd.LIZJ();
        o.LJIIIIZZ(LIZJ, "getDefaultExecutor()");
        return LIZJ;
    }
}
