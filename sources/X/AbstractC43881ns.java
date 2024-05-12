package X;

import X.AbstractC24300xO;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.1ns, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC43881ns<T extends AbstractC24300xO> extends AbstractC35391aB<T> {
    public volatile int LJ;
    public long LJFF;
    public int LJI;
    public long LJII;

    public AbstractC43881ns() {
        super("power");
    }

    @Override // X.InterfaceC23150vX
    public final void LIZIZ() {
        if (this.LJ > 0) {
            long currentTimeMillis = System.currentTimeMillis();
            long j = currentTimeMillis - this.LJII;
            F9U.LIZ.LIZJ(new RunnableC23130vV(this, this.LIZJ, j));
            this.LJII = currentTimeMillis;
        }
        this.LIZJ = true;
    }

    @Override // X.InterfaceC23150vX
    public final void LJI() {
        if (this.LJ > 0 && this.LJII > 0) {
            long currentTimeMillis = System.currentTimeMillis();
            long j = currentTimeMillis - this.LJII;
            F9U.LIZ.LIZJ(new RunnableC23130vV(this, this.LIZJ, j));
            this.LJII = currentTimeMillis;
        }
        this.LIZJ = false;
    }

    @Override // X.AbstractC35391aB
    public final void LJII(long j, long j2) {
        int i = 0;
        this.LJI = 0;
        this.LJFF = 0L;
        if (this.LJ > 0 && this.LJII > 0) {
            long currentTimeMillis = System.currentTimeMillis();
            F9U.LIZ.LIZJ(new RunnableC23130vV(this, this.LIZJ, currentTimeMillis - this.LJII));
            this.LJII = currentTimeMillis;
        }
        super.LJII(j, j2);
        long currentTimeMillis2 = System.currentTimeMillis();
        double d = this.LJFF;
        double d2 = currentTimeMillis2 - this.LIZIZ;
        double d3 = (d / d2) * 60000.0d * 10.0d;
        double d4 = (this.LJI / d2) * 60000.0d * 10.0d;
        if (d3 >= MPE.LJLJJI) {
            i = 17;
        }
        if (d4 >= MPE.LJLJI) {
            i |= 18;
        }
        if (i == 0) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("issue_type", i).put("total_hold_time", d3).put("total_acquire_count", d4);
            ConcurrentHashMap<Integer, T> concurrentHashMap = this.LIZLLL;
            if (concurrentHashMap != null && concurrentHashMap.size() > 0) {
                JSONArray jSONArray = new JSONArray();
                Iterator<T> it = this.LIZLLL.values().iterator();
                while (it.hasNext()) {
                    jSONArray.put(((C35771an) it.next()).LIZIZ());
                }
                jSONObject.put("detail", jSONArray);
            }
            PED.LIZ(jSONObject);
            C64089PDh.LJIIJ().LIZLLL(new PEE("battery_trace", jSONObject));
        } catch (Throwable unused) {
        }
    }

    @Override // X.AbstractC35391aB
    public final void LJFF(T t, long j, long j2) {
        this.LJI++;
        long j3 = t.LIZ;
        if (j3 >= j) {
            j = j3;
        }
        long j4 = t.LIZIZ;
        if (j4 > 0 && j2 >= j4) {
            j2 = j4;
        }
        long j5 = j2 - j3;
        C35771an c35771an = (C35771an) t;
        if (j5 >= MPE.LJLILLLLZI) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("event_type", "battery_trace");
                jSONObject.put("issue_type", 16).put("single_hold_time", j5).put("wake_lock_info", c35771an.toString());
                PED.LIZ(jSONObject);
                C64089PDh.LJIIJ().LIZLLL(new PEE("battery_trace", jSONObject));
            } catch (JSONException unused) {
            }
        }
        long j6 = j2 - j;
        if (j6 > 0) {
            this.LJFF += j6;
        }
    }
}
