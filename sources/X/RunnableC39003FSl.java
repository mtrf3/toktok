package X;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import org.json.JSONObject;

/* renamed from: X.FSl, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class RunnableC39003FSl implements Runnable {
    public final /* synthetic */ C39004FSm LJLIL;

    public final void LIZ() {
        if (!C38995FSd.LIZIZ.LJFF()) {
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        ArrayList arrayList = new ArrayList();
        this.LJLIL.LIZJ.lock();
        try {
            try {
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
            if (((WeakHashMap) this.LJLIL.LIZIZ).size() <= 0) {
                return;
            }
            Iterator it = ((WeakHashMap) this.LJLIL.LIZIZ).entrySet().iterator();
            while (it.hasNext()) {
                RunnableC39002FSk runnableC39002FSk = (RunnableC39002FSk) ((Map.Entry) it.next()).getKey();
                if (uptimeMillis - runnableC39002FSk.LJLJI >= C38995FSd.LIZ.LJFF) {
                    arrayList.add(runnableC39002FSk);
                    it.remove();
                }
            }
            this.LJLIL.LIZJ.unlock();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                RunnableC39002FSk runnableC39002FSk2 = (RunnableC39002FSk) it2.next();
                JSONObject jSONObject = new JSONObject();
                try {
                    String LIZJ = C39015FSx.LIZJ(runnableC39002FSk2.LJLIL);
                    if (!C38995FSd.LJI(LIZJ)) {
                        jSONObject.put("task_name", LIZJ);
                        jSONObject.put("pool_type", runnableC39002FSk2.LJLILLLLZI.LJLIL.name());
                        jSONObject.put("pool_size", runnableC39002FSk2.LJLILLLLZI.getPoolSize());
                        jSONObject.put("queue_size", runnableC39002FSk2.LJLILLLLZI.getQueue().size());
                        jSONObject.put("duration", uptimeMillis - runnableC39002FSk2.LJLJI);
                        Thread thread = runnableC39002FSk2.LJLJJI;
                        if (thread != null) {
                            jSONObject.put("task_stack", C39015FSx.LIZIZ(thread.getStackTrace()));
                        }
                        C38995FSd.LIZIZ.LJ(jSONObject);
                    }
                } catch (Exception e2) {
                    C16880lQ.LLLLIIL(e2);
                }
            }
            arrayList.clear();
        } finally {
            this.LJLIL.LIZJ.unlock();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }

    public RunnableC39003FSl(C39004FSm c39004FSm) {
        this.LJLIL = c39004FSm;
    }
}
