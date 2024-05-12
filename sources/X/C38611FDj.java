package X;

import com.ss.android.ugc.bytex.pthread.base.proxy.PThreadPoolExecutor;
import com.ss.android.ugc.bytex.thread_rename.base.DefaultThreadFactory;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: X.FDj, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38611FDj extends AbstractC65781Prl implements InterfaceC65784Pro<ThreadPoolExecutor> {
    public static final C38611FDj LJLIL = new C38611FDj();

    public C38611FDj() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final ThreadPoolExecutor invoke() {
        return new PThreadPoolExecutor(0, Runtime.getRuntime().availableProcessors(), 60L, TimeUnit.SECONDS, new SynchronousQueue(), new DefaultThreadFactory("UltimateInflaterConfig$Builder$Companion$defaultExecutor$2"));
    }
}
