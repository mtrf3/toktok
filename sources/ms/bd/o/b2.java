package ms.bd.o;

import X.C16880lQ;
import X.C39232FaW;
import android.content.Context;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import ms.bd.o.b;
import org.json.JSONArray;

/* loaded from: classes7.dex */
public class b2 {
    public static volatile boolean LIZ;
    public static final Map<String, c0> LIZIZ = new ConcurrentHashMap();

    /* loaded from: classes12.dex */
    public interface a {
        void LIZ(String str);

        void LIZIZ(String str);

        void LIZJ(String str);

        void LIZLLL(String str);

        void LJ(String str);

        void LJFF(int i);

        void LJI(int i);

        Map<String, String> frameSign(String str, int i);
    }

    public static synchronized a2 LIZ(String str) {
        synchronized (b2.class) {
            if (str != null) {
                if (!LIZ) {
                    return null;
                }
                Object a2 = k.a(67108866, 0, 0L, str, null);
                if (a2 == null) {
                    return null;
                }
                c0 c0Var = (c0) ((ConcurrentHashMap) LIZIZ).get(str);
                if (c0Var == null) {
                    return null;
                }
                return new a2(c0Var, ms.bd.o.a.LIZIZ.LIZ, ((Long) a2).longValue());
            }
            throw new NullPointerException("appID must be set");
        }
    }

    public static synchronized boolean LIZJ(Context context, c0 c0Var) {
        String str;
        synchronized (b2.class) {
            if (context != null) {
                if (c0Var != null) {
                    String str2 = c0Var.LIZ;
                    if (str2 != null && str2.length() > 0) {
                        str = c0Var.LIZ;
                    } else {
                        str = c0Var.LJI;
                    }
                    if (str != null && str.length() > 0) {
                        LIZIZ(context, "metasec_ov", "ms_sensor_ov");
                        if (((ConcurrentHashMap) LIZIZ).containsKey(str)) {
                            return false;
                        }
                        JSONArray jSONArray = new JSONArray();
                        jSONArray.put(c0.LIZ(c0Var.LIZ));
                        jSONArray.put(c0.LIZ(c0Var.LJII));
                        jSONArray.put(c0.LIZ(c0Var.LJI));
                        jSONArray.put(c0.LIZ(c0Var.LJIIIIZZ));
                        jSONArray.put(c0.LIZ(u2.LIZ));
                        jSONArray.put(c0.LIZ(c0Var.LIZIZ));
                        jSONArray.put(c0.LIZ(c0Var.LIZJ));
                        jSONArray.put(c0.LIZ(c0Var.LIZLLL));
                        jSONArray.put(c0.LIZ(c0Var.LJ));
                        jSONArray.put(c0.LIZ(c0Var.LJFF));
                        jSONArray.put(String.valueOf(c0Var.LJIIIZ));
                        jSONArray.put(String.valueOf(c0Var.LJIIJ));
                        jSONArray.put(String.valueOf(c0Var.LJIIJJI));
                        JSONArray jSONArray2 = new JSONArray();
                        for (Map.Entry entry : ((HashMap) c0Var.LJIIL).entrySet()) {
                            if (!TextUtils.isEmpty((CharSequence) entry.getKey())) {
                                jSONArray2.put(c0.LIZ(entry.getKey()));
                                jSONArray2.put(c0.LIZ(entry.getValue()));
                            }
                        }
                        jSONArray.put(jSONArray2);
                        JSONArray jSONArray3 = new JSONArray();
                        for (Map.Entry entry2 : ((HashMap) c0Var.LJIILIIL).entrySet()) {
                            if (!TextUtils.isEmpty((CharSequence) entry2.getKey())) {
                                jSONArray3.put(c0.LIZ(entry2.getKey()));
                                jSONArray3.put(c0.LIZ(entry2.getValue()));
                            }
                        }
                        jSONArray.put(jSONArray3);
                        if (!((Boolean) k.a(67108865, 0, 0L, jSONArray.toString(), null)).booleanValue()) {
                            return false;
                        }
                        ((ConcurrentHashMap) LIZIZ).put(str, c0Var);
                        return true;
                    }
                    throw new NullPointerException("appID must be set");
                }
                throw new NullPointerException("config could not be null");
            }
            throw new NullPointerException("context could not be null");
        }
    }

    public static synchronized void LIZIZ(Context context, String str, String str2) {
        Context context2;
        b.a f2Var;
        b.a f2Var2;
        synchronized (b2.class) {
            if (!LIZ) {
                Context LLLLL = C16880lQ.LLLLL(context);
                ms.bd.o.a aVar = ms.bd.o.a.LIZIZ;
                if (LLLLL != null) {
                    aVar.getClass();
                    context2 = C16880lQ.LLLLL(LLLLL);
                } else {
                    context2 = null;
                }
                aVar.LIZ = context2;
                try {
                    Class.forName("com.bytedance.mobsec.sensor.ml.MSB");
                    u.LIZ(LLLLL, str2);
                } catch (Throwable unused) {
                }
                u.LIZ(LLLLL, str);
                b.LIZ(16777218, new n0());
                b.LIZ(16777217, new y0());
                b.LIZ(16777219, new j1());
                b.LIZ(16777221, new u1());
                b.LIZ(16777222, new v1());
                b.LIZ(16777258, new w1());
                b.LIZ(16777260, new x1());
                b.LIZ(16777273, new y1());
                b.LIZ(16777261, new z1());
                b.LIZ(16777262, new d0());
                b.LIZ(16777263, new e0());
                b.LIZ(16777264, new f0());
                b.LIZ(16777265, new g0());
                b.LIZ(16777271, new h0());
                b.LIZ(16777272, new i0());
                b.LIZ(16777270, new j0());
                b.LIZ(16777259, new k0());
                b.LIZ(16777223, new l0());
                b.LIZ(16777224, new m0());
                b.LIZ(16777225, new o0());
                b.LIZ(16777226, new p0());
                b.LIZ(16777228, new q0());
                b.LIZ(16777232, new r0());
                b.LIZ(16777233, new s0());
                b.LIZ(16777235, new t0());
                b.LIZ(16777238, new u0());
                b.LIZ(16777239, new v0());
                b.LIZ(16777241, new w0());
                b.LIZ(16777242, new x0());
                b.LIZ(16777243, new z0());
                b.LIZ(16777244, new a1());
                b.LIZ(16777245, new b1());
                b.LIZ(16777246, new c1());
                b.LIZ(16777247, new d1());
                b.LIZ(16777248, new e1());
                b.LIZ(16777249, new f1());
                b.LIZ(16777250, new g1());
                b.LIZ(16777251, new h1());
                b.LIZ(16777240, new i1());
                b.LIZ(16777252, new k1());
                b.LIZ(16777253, new l1());
                b.LIZ(16777254, new m1());
                b.LIZ(16777255, new n1());
                b.LIZ(16777256, new o1());
                b.LIZ(16777257, new p1());
                b.LIZ(16777266, new q1());
                b.LIZ(16777267, new r1());
                b.LIZ(16777268, new s1());
                b.LIZ(16777269, new t1());
                if (y.LIZJ()) {
                    f2Var = new h2();
                } else {
                    f2Var = new f2();
                }
                b.LIZ(33554433, f2Var);
                if (y.LIZJ()) {
                    f2Var2 = new i2();
                } else {
                    f2Var2 = new f2();
                }
                b.LIZ(33554434, f2Var2);
                b.LIZ(50331649, new j2());
                j.LIZ();
                C39232FaW.LIZ();
                k.a(16777219, 0, 0L, null, LLLLL);
                k.a(16777220, 0, 0L, null, null);
                LIZ = true;
            }
        }
    }
}
