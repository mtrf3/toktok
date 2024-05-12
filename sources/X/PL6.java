package X;

import com.bytedance.crash.CrashType;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public abstract class PL6 {
    public static final ConcurrentLinkedQueue<PL6> LIZ = new ConcurrentLinkedQueue<>();
    public static final LinkedList<PLH> LIZIZ = new LinkedList<>();

    public abstract void LIZ();

    public static void LIZIZ(CrashType crashType, JSONObject jSONObject) {
        LIZIZ.add(new PLH(crashType, jSONObject));
        ConcurrentLinkedQueue<PL6> concurrentLinkedQueue = LIZ;
        if (concurrentLinkedQueue == null || concurrentLinkedQueue.isEmpty()) {
            return;
        }
        Iterator<PL6> it = concurrentLinkedQueue.iterator();
        while (it.hasNext()) {
            try {
                it.next().LIZ();
            } catch (Throwable unused) {
            }
        }
    }
}
