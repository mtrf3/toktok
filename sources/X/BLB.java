package X;

import android.os.HandlerThread;
import android.os.SystemClock;
import java.util.Enumeration;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class BLB {
    public Object LIZ;
    public final Object LIZIZ;
    public final Object LIZJ;

    public /* synthetic */ BLB(InterfaceC28615BKx interfaceC28615BKx) {
        this.LIZ = interfaceC28615BKx;
        HandlerThread LJIJJ = B4U.LIZ().LJIJJ();
        this.LIZIZ = LJIJJ;
        this.LIZJ = new C28601BKj(LJIJJ);
    }

    public final void LIZ(java.util.Map map) {
        C28601BKj c28601BKj = (C28601BKj) this.LIZJ;
        if (c28601BKj != null) {
            JSONArray jSONArray = new JSONArray();
            Enumeration<String> keys = c28601BKj.LIZJ.keys();
            o.LJIIIIZZ(keys, "loadingStateRecords.keys()");
            C37497End c37497End = new C37497End(keys);
            while (c37497End.hasNext()) {
                Object next = c37497End.next();
                BLA bla = c28601BKj.LIZJ.get(next);
                if (bla != null) {
                    synchronized (bla) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("room_id", String.valueOf(bla.LIZLLL));
                        jSONObject.put("stream_url", next);
                        c28601BKj.LIZLLL.remove(next);
                        long j = bla.LIZIZ;
                        if (j > 0) {
                            long j2 = bla.LIZ;
                            if (j > j2) {
                                long j3 = (j - j2) + 0 + bla.LIZJ;
                                bla.LIZJ = 0L;
                                c28601BKj.LIZJ.remove(next);
                                c28601BKj.LJ.remove(Long.valueOf(bla.LIZLLL));
                                jSONObject.put("loading_duration", j3);
                                int i = bla.LJ + 1;
                                bla.LJ = i;
                                jSONObject.put("loading_cnt", i);
                            }
                        } else {
                            long elapsedRealtime = SystemClock.elapsedRealtime();
                            long j4 = bla.LIZ;
                            if (elapsedRealtime > j4) {
                                long j5 = (elapsedRealtime - j4) + 0 + bla.LIZJ;
                                bla.LIZJ = 0L;
                                bla.LIZ = elapsedRealtime;
                                jSONObject.put("loading_duration", j5);
                                int i2 = bla.LJ + 1;
                                bla.LJ = i2;
                                jSONObject.put("loading_cnt", i2);
                                bla.LJ = 0;
                            }
                        }
                        jSONArray.put(jSONObject);
                    }
                }
            }
            Enumeration<String> keys2 = c28601BKj.LIZLLL.keys();
            o.LJIIIIZZ(keys2, "streamRecords.keys()");
            C37497End c37497End2 = new C37497End(keys2);
            while (c37497End2.hasNext()) {
                Object next2 = c37497End2.next();
                Long l = c28601BKj.LIZLLL.get(next2);
                if (l != null) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("room_id", l.longValue());
                    jSONObject2.put("stream_url", next2);
                    jSONObject2.put("loading_duration", 0);
                    jSONObject2.put("loading_cnt", 0);
                    jSONArray.put(jSONObject2);
                }
            }
            c28601BKj.LIZLLL.clear();
            String jSONArray2 = jSONArray.toString();
            o.LJIIIIZZ(jSONArray2, "jsonArr.toString()");
            ((ConcurrentHashMap) map).put("loading", jSONArray2);
        }
    }

    public /* synthetic */ BLB(String str) {
        this.LIZ = str;
        this.LIZIZ = null;
        this.LIZJ = null;
    }
}
