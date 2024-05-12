package X;

import Y.ARunnableS46S0100000_10;
import android.content.Context;
import java.util.concurrent.ExecutorService;
import org.json.JSONObject;

/* renamed from: X.O6l, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61363O6l {
    public static volatile boolean LIZ;

    public static void LIZ(Context context, C61362O6k c61362O6k) {
        C61359O6h.LJIILL = C16880lQ.LLLLL(context);
        if (c61362O6k != null) {
            QXX qxx = c61362O6k.LJII;
            if (C61359O6h.LJIIJJI == null) {
                C61359O6h.LJIIJJI = new O7O();
            }
            C61359O6h.LJJJI = qxx;
            C61359O6h.LJJJLIIL = O7N.LIZ(c61362O6k.LJIIIIZZ);
            C61359O6h.LJIIL = c61362O6k.LJ;
            ExecutorService executorService = c61362O6k.LIZ;
            if (executorService == null) {
                executorService = C16880lQ.LLLLZLLIL();
            }
            C61359O6h.LJ = executorService;
            ExecutorService executorService2 = c61362O6k.LIZIZ;
            if (executorService2 == null) {
                executorService2 = C16880lQ.LLLLZLLIL();
            }
            C61359O6h.LJFF = executorService2;
            ExecutorService executorService3 = c61362O6k.LIZJ;
            if (executorService3 == null) {
                executorService3 = C16880lQ.LLLLZLLIL();
            }
            C61359O6h.LJI = executorService3;
            C61373O6v LIZ2 = C61373O6v.LIZ();
            ExecutorService executorService4 = c61362O6k.LIZLLL;
            if (executorService4 != null) {
                LIZ2.LIZ = executorService4;
            } else {
                LIZ2.getClass();
            }
            C61359O6h.LJJIIZI = c61362O6k.LJFF;
            C61359O6h.LJJIJLIJ = false;
            C61359O6h.LJJIL = c61362O6k.LJI;
            C61359O6h.LJJIZ = false;
            C61359O6h.LJJJ = false;
            C61359O6h.LJJJIL = false;
        } else {
            C61359O6h.LJ = C16880lQ.LLLLZLLIL();
            C61359O6h.LJFF = C16880lQ.LLLLZLLIL();
            C61359O6h.LJI = C16880lQ.LLLLZLLIL();
        }
        if (C61359O6h.LJJIL) {
            C61375O6x.LIZ().getClass();
            if (C61364O6m.LIZ == null) {
                synchronized (C61364O6m.class) {
                    if (C61364O6m.LIZ == null) {
                        C61364O6m.LIZ = new C61364O6m();
                    }
                }
            }
            C61364O6m c61364O6m = C61364O6m.LIZ;
            c61364O6m.getClass();
            if (!C61359O6h.LJJ) {
                C61359O6h.LJJ = true;
                ARunnableS46S0100000_10 aRunnableS46S0100000_10 = new ARunnableS46S0100000_10(c61364O6m, 108);
                if (C61359O6h.LJJIZ) {
                    C61359O6h.LJFF.execute(aRunnableS46S0100000_10);
                } else {
                    aRunnableS46S0100000_10.run();
                }
            }
            C61352O6a LIZ3 = C61352O6a.LIZ();
            LIZ3.getClass();
            LIZ3.LIZ = System.currentTimeMillis();
            LIZ3.LIZIZ = true;
        }
    }

    public static void LIZIZ(Context context, C61362O6k c61362O6k) {
        String str;
        if (!LIZ) {
            synchronized (C61363O6l.class) {
                if (!LIZ) {
                    long currentTimeMillis = System.currentTimeMillis();
                    LIZ(C16880lQ.LLLLL(context), c61362O6k);
                    LIZ = true;
                    long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("SDK init duration: ");
                    LIZ2.append(currentTimeMillis2);
                    X1D.LIZIZ(LIZ2);
                    JSONObject jSONObject = new JSONObject();
                    try {
                        if (C61359O6h.LJJJ) {
                            str = "dur_use_file";
                        } else {
                            str = "dur_use_sp";
                        }
                        jSONObject.put(str, currentTimeMillis2);
                    } catch (Exception unused) {
                    }
                    O8O.LIZLLL().LJIIIIZZ("service_sdk_init_duration", 0, jSONObject, null);
                }
            }
        }
    }
}
