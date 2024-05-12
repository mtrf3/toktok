package X;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class QNM {
    public static final ReentrantLock LIZ = new ReentrantLock();
    public static final List<JSONObject> LIZIZ = new LinkedList();

    public static void LIZ(float f, float f2, float f3, float f4, int i, long j) {
        ReentrantLock reentrantLock;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("timestamp", j);
            jSONObject.put("force", f);
            jSONObject.put("majorRadius", f2);
            jSONObject.put("phase", i);
            jSONObject.put("x", f3);
            jSONObject.put("y", f4);
            try {
                reentrantLock = LIZ;
                reentrantLock.lockInterruptibly();
                ((LinkedList) LIZIZ).add(jSONObject);
            } catch (InterruptedException unused) {
                reentrantLock = LIZ;
            } catch (Throwable th) {
                LIZ.unlock();
                throw th;
            }
            reentrantLock.unlock();
        } catch (JSONException e) {
            C61349O5x.LIZIZ(e);
        }
    }
}
