package X;

import com.ss.android.ugc.bytex.pthread.base.proxy.PThreadPoolExecutor;
import com.ss.android.ugc.bytex.thread_rename.base.DefaultThreadFactory;
import java.util.concurrent.Executor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.TimeUnit;

/* loaded from: classes9.dex */
public class JFU extends JFP<Executor> {
    @Override // X.JFP
    public final Executor LIZ(Object[] objArr) {
        return new PThreadPoolExecutor(0, Integer.MAX_VALUE, 10L, TimeUnit.SECONDS, new SynchronousQueue(), new DefaultThreadFactory("xecutorUtil$1"));
    }
}
