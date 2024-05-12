package X;

import com.ss.android.ugc.bytex.pthread.base.proxy.PThreadPoolExecutor;
import com.ss.android.ugc.bytex.thread_rename.base.DefaultThreadFactory;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: X.VVp, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79853VVp extends AbstractC65781Prl implements InterfaceC65784Pro<ThreadPoolExecutor> {
    public static final C79853VVp LJLIL = new C79853VVp();

    public C79853VVp() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final ThreadPoolExecutor invoke() {
        return new PThreadPoolExecutor(2, 4, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new DefaultThreadFactory("DefaultExecutor$threadPool$2"));
    }
}
