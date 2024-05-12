package X;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class O7A {
    public static volatile O7A LJIIIIZZ;
    public volatile int LIZ = -1;
    public final AtomicInteger LIZIZ = new AtomicInteger();
    public AtomicInteger LIZJ = new AtomicInteger();
    public int LIZLLL = 0;
    public final List<java.util.Map<String, String>> LJ = FII.LIZ();
    public volatile long LJFF = 0;
    public long LJI = -1;
    public boolean LJII = false;

    public static O7A LIZ() {
        if (LJIIIIZZ == null) {
            synchronized (O7A.class) {
                if (LJIIIIZZ == null) {
                    LJIIIIZZ = new O7A();
                }
            }
        }
        return LJIIIIZZ;
    }

    public final void LIZIZ(long j) {
        if (j == -1) {
            this.LJI = -1L;
            C1DJ.LJIJJ(" time valid, reset remote time ");
        } else {
            if (this.LJI != -1) {
                return;
            }
            O76.LJI().LJIIJJI(j);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(" time valid, saving remote time: ");
            LIZ.append(j);
            C1DJ.LJIJJ(X1D.LIZIZ(LIZ));
            this.LJI = j;
        }
    }

    public final void LIZJ(AtomicInteger atomicInteger) {
        JSONObject jSONObject;
        this.LIZJ = atomicInteger;
        if (this.LIZLLL == atomicInteger.get()) {
            JSONObject jSONObject2 = new JSONObject();
            JSONObject jSONObject3 = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            try {
                synchronized (this.LJ) {
                    Iterator<java.util.Map<String, String>> it = this.LJ.iterator();
                    while (it.hasNext()) {
                        JSONObject jSONObject4 = new JSONObject();
                        for (Map.Entry<String, String> entry : it.next().entrySet()) {
                            jSONObject4.putOpt(entry.getKey(), entry.getValue());
                        }
                        jSONArray.put(jSONObject4);
                    }
                }
                jSONObject2.put("udp_addrs", jSONArray);
                jSONObject3.putOpt("log_extra", O7I.LIZIZ().LIZJ());
                jSONObject3.putOpt("ad_extra_data", jSONObject2);
                jSONObject3.putOpt("is_ad_event", "1");
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("UDPClient. sendStopShowingEvent:\n");
                LIZ.append(jSONObject3.toString());
                X1D.LIZIZ(LIZ);
                jSONObject = jSONObject3;
            } catch (JSONException e) {
                C16880lQ.LLLLIIL(e);
                jSONObject = null;
            }
            O79.LIZIZ().LIZLLL("splash_ad", "splash_init_monitor_all", jSONObject, 84378473382L);
        }
    }

    public final void LIZLLL(int i) {
        UC7.LIZLLL("UDPClient. setUDPSwitchResult: ", i);
        this.LIZ = i;
    }
}
