package X;

import com.ss.android.ugc.bytex.pthread.base.proxy.PThreadPoolExecutor;
import com.ss.android.ugc.bytex.thread_rename.base.DefaultThreadFactory;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

/* renamed from: X.It7, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48029It7 extends PThreadPoolExecutor {
    public C48029It7(TimeUnit timeUnit, BlockingQueue blockingQueue) {
        super(0, 1, 30L, timeUnit, (BlockingQueue<Runnable>) blockingQueue, new DefaultThreadFactory("analytics/zza"));
    }
}
