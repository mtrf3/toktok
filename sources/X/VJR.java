package X;

import com.ss.android.ugc.bytex.pthread.base.proxy.PThreadPoolExecutor;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class VJR extends PThreadPoolExecutor {
    public final LinkedList<VJO> LJLIL;
    public final java.util.Set<Integer> LJLILLLLZI;
    public final java.util.Map<Integer, Integer> LJLJI;

    @Override // com.ss.android.ugc.bytex.pthread.base.proxy.PThreadPoolExecutor, java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.Executor
    public final void execute(Runnable command) {
        int i;
        o.LJIIJ(command, "command");
        if (command instanceof VJO) {
            VJO vjo = (VJO) command;
            synchronized (VJO.class) {
                VJO.LJLJJLL++;
                vjo.LJLILLLLZI = VJO.LJLJJLL;
                java.util.Map<Integer, Integer> map = VJO.LJLJJL;
                Integer num = (Integer) ((LinkedHashMap) map).get(Integer.valueOf(vjo.LJLJJI));
                if (num != null) {
                    i = num.intValue();
                } else {
                    i = 0;
                }
                vjo.LJLJI = i + 1;
                map.put(Integer.valueOf(vjo.LJLJJI), Integer.valueOf(vjo.LJLJI));
            }
            command = new VJT(this, vjo);
        }
        super.execute(command);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final Future<?> submit(Runnable task) {
        o.LJIIJ(task, "task");
        throw new UnsupportedOperationException("Only support function execute!");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VJR(TimeUnit unit, OAL oal) {
        super(3, 3, 5L, unit, new LinkedBlockingQueue(), oal);
        o.LJIIJ(unit, "unit");
        this.LJLIL = new LinkedList<>();
        this.LJLILLLLZI = new LinkedHashSet();
        this.LJLJI = new LinkedHashMap();
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final <T> Future<T> submit(Runnable task, T t) {
        o.LJIIJ(task, "task");
        throw new UnsupportedOperationException("Only support function execute!");
    }
}
