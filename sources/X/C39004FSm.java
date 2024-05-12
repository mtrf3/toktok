package X;

import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONObject;

/* renamed from: X.FSm, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39004FSm {
    public static ExecutorService LIZLLL;
    public final Object LIZ = new Object();
    public final ReentrantLock LIZJ = new ReentrantLock();
    public final java.util.Map<RunnableC39002FSk, Object> LIZIZ = new WeakHashMap();

    public C39004FSm() {
        C38027EwB c38027EwB = new C38027EwB(FSY.SCHEDULED);
        c38027EwB.LIZJ = 1;
        c38027EwB.LIZIZ = "TaskMonitor";
        ExecutorService LIZ = C37191Eih.LIZ(c38027EwB);
        LIZLLL = LIZ;
        RunnableC39003FSl runnableC39003FSl = new RunnableC39003FSl(this);
        long j = C38995FSd.LIZ.LJFF;
        ((ScheduledExecutorService) LIZ).scheduleAtFixedRate(runnableC39003FSl, j, j, TimeUnit.MILLISECONDS);
    }

    public final void LIZIZ(RunnableC39002FSk runnableC39002FSk) {
        if (!C38995FSd.LIZIZ.LJFF()) {
            return;
        }
        this.LIZJ.lock();
        try {
            ((WeakHashMap) this.LIZIZ).remove(runnableC39002FSk);
        } finally {
            this.LIZJ.unlock();
        }
    }

    public static JSONObject LIZ(WeakReference<Object> weakReference, String str, int i, int i2, long j) {
        String LIZJ;
        Object obj = weakReference.get();
        if (obj == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            LIZJ = C39015FSx.LIZJ(obj);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
        if (C38995FSd.LJI(LIZJ)) {
            return null;
        }
        jSONObject.put("task_name", LIZJ);
        jSONObject.put("pool_type", str);
        jSONObject.put("pool_size", i);
        jSONObject.put("queue_size", i2);
        jSONObject.put("duration", j);
        return jSONObject;
    }
}
