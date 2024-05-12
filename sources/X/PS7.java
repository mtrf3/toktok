package X;

import android.os.Process;
import com.bytedance.android.livesdk.livesetting.performance.LiveApmInhibitionSettings;
import java.util.LinkedHashMap;
import java.util.concurrent.ThreadFactory;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class PS7 extends C39050FUg {
    public final int LJLJJL;

    @Override // X.C39050FUg, java.util.concurrent.ThreadPoolExecutor
    public final void beforeExecute(Thread t, Runnable r) {
        Integer remove;
        o.LJIIIZ(t, "t");
        o.LJIIIZ(r, "r");
        if (PSA.LIZ) {
            if (LiveApmInhibitionSettings.INSTANCE.isThreadPriorityEnable()) {
                java.util.Map<Thread, Integer> map = PSA.LIZIZ;
                if (((LinkedHashMap) map).get(t) == null) {
                    map.put(t, Integer.valueOf(Process.getThreadPriority(Process.myTid())));
                }
                Process.setThreadPriority(this.LJLJJL);
            }
            PS4.LIZJ(getQueue().size());
        } else if (LiveApmInhibitionSettings.INSTANCE.isThreadPriorityEnable() && (remove = PSA.LIZIZ.remove(t)) != null) {
            Process.setThreadPriority(remove.intValue());
        }
        super.beforeExecute(t, r);
    }

    public PS7(int i, ThreadFactory threadFactory, int i2) {
        super(i, threadFactory);
        this.LJLJJL = i2;
    }
}
