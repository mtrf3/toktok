package X;

import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;

/* renamed from: X.282, reason: invalid class name */
/* loaded from: classes.dex */
public final class AnonymousClass282 extends AbstractC65781Prl implements InterfaceC65784Pro<ExecutorService> {
    public static final AnonymousClass282 INSTANCE = new AnonymousClass282();

    public AnonymousClass282() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final ExecutorService invoke() {
        return C16880lQ.LLLLZLLLI(new ThreadFactory() { // from class: X.123
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return new PthreadThread(runnable, "LiveTriggerFrameworkThread");
            }
        });
    }
}
