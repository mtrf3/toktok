package X;

import com.ss.android.ugc.bytex.pthread.base.proxy.PThreadPoolExecutor;
import com.ss.android.ugc.bytex.thread_rename.base.DefaultThreadFactory;
import java.util.ArrayDeque;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* renamed from: X.NhR, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60045NhR {
    public final ArrayDeque<AbstractAsyncTaskC60035NhH> LIZIZ = new ArrayDeque<>();
    public AbstractAsyncTaskC60035NhH LIZJ = null;
    public final PThreadPoolExecutor LIZ = new PThreadPoolExecutor(1, 1, 1, TimeUnit.SECONDS, new LinkedBlockingQueue(), new DefaultThreadFactory("e/walking/a/c"));
}
