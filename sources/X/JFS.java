package X;

import com.ss.android.ugc.bytex.pthread.base.proxy.PThreadPoolExecutor;
import com.ss.android.ugc.bytex.thread_rename.base.DefaultThreadFactory;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.TimeUnit;

/* loaded from: classes9.dex */
public class JFS extends JFP<ExecutorService> {
    @Override // X.JFP
    public final ExecutorService LIZ(Object[] objArr) {
        return new PThreadPoolExecutor(0, Integer.MAX_VALUE, 5L, TimeUnit.SECONDS, new SynchronousQueue(), new DefaultThreadFactory("xecutorUtil$2"));
    }
}
