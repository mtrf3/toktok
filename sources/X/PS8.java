package X;

import android.os.Process;
import com.bytedance.android.livesdk.livesetting.performance.LiveApmInhibitionSettings;
import com.ss.android.ugc.bytex.pthread.base.proxy.PThreadScheduledThreadPoolExecutor;
import java.util.LinkedHashMap;
import java.util.concurrent.ThreadFactory;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class PS8 extends PThreadScheduledThreadPoolExecutor {
    public final int LJLIL;

    @Override // java.util.concurrent.ThreadPoolExecutor
    public final void beforeExecute(Thread t, Runnable r) {
        Integer remove;
        o.LJIIIZ(t, "t");
        o.LJIIIZ(r, "r");
        if (PS9.LIZ) {
            if (LiveApmInhibitionSettings.INSTANCE.isThreadPriorityEnable()) {
                java.util.Map<Thread, Integer> map = PS9.LIZIZ;
                if (((LinkedHashMap) map).get(t) == null) {
                    map.put(t, Integer.valueOf(Process.getThreadPriority(Process.myTid())));
                }
                Process.setThreadPriority(this.LJLIL);
            }
            PS4.LIZJ(getQueue().size());
        } else if (LiveApmInhibitionSettings.INSTANCE.isThreadPriorityEnable() && (remove = PS9.LIZIZ.remove(t)) != null) {
            Process.setThreadPriority(remove.intValue());
        }
        super.beforeExecute(t, r);
    }

    public PS8(int i, ThreadFactory threadFactory, int i2) {
        super(i, threadFactory);
        this.LJLIL = i2;
    }
}
