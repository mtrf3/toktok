package X;

import Y.ARunnableS13S0000000_6;
import com.ss.android.ugc.bytex.pthread.base.proxy.PThreadPoolExecutor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class FUA {
    public static final CopyOnWriteArrayList<Runnable> LIZ = new CopyOnWriteArrayList<>();
    public static final List<String> LIZIZ = new ArrayList();
    public static final PThreadPoolExecutor LIZJ = new PThreadPoolExecutor(1, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(128), new ThreadFactoryC39010FSs(), new ThreadPoolExecutor.DiscardOldestPolicy());

    public static void LIZ(C39033FTp c39033FTp) {
        C09820a2.LIZIZ(c39033FTp.LIZ());
        synchronized (FUA.class) {
            CopyOnWriteArrayList<Runnable> copyOnWriteArrayList = LIZ;
            if (copyOnWriteArrayList != null) {
                Iterator<Runnable> it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    LIZJ.submit(it.next());
                }
                LIZ.clear();
            }
            LIZJ.submit(new ARunnableS13S0000000_6(44));
        }
    }

    public static synchronized void LJI(Runnable runnable) {
        synchronized (FUA.class) {
            if (!OIO.LIZ.LJLJL || FUE.LIZ == null) {
                CopyOnWriteArrayList<Runnable> copyOnWriteArrayList = LIZ;
                copyOnWriteArrayList.add(runnable);
                if (copyOnWriteArrayList.size() >= 200) {
                    LIZJ.submit(new ARunnableS13S0000000_6(43));
                }
            } else {
                LIZJ.submit(runnable);
            }
        }
    }

    public static void LIZJ(String str, JSONObject jSONObject) {
        if (((Boolean) C35044DpA.LIZJ.getValue()).booleanValue()) {
            LIZLLL(str, jSONObject, null, true);
        } else {
            LIZLLL(str, jSONObject, null, false);
        }
    }

    public static void LIZIZ(String str, String str2, JSONObject jSONObject) {
        if (((Boolean) C35044DpA.LIZJ.getValue()).booleanValue()) {
            LIZLLL(str, jSONObject, str2, true);
        } else {
            LIZLLL(str, jSONObject, str2, false);
        }
    }

    public static void LJ(String str, String str2, float f) {
        if (C35032Doy.LIZ()) {
            C64235PIx.LIZIZ(str, str2, f);
        } else {
            LJI(new FUB(str, str2, f));
        }
    }

    public static void LJFF(String str, String str2, float f) {
        if (C35032Doy.LIZ()) {
            return;
        }
        LJI(new FUD(str, str2, f));
    }

    public static void LIZLLL(String str, JSONObject jSONObject, String str2, boolean z) {
        String jSONObject2;
        JSONObject jSONObject3 = null;
        try {
            if (jSONObject == null) {
                if (C35032Doy.LIZ()) {
                    C09900aA.LJ(str, null);
                } else {
                    LJI(new FUC(str));
                }
            } else if (C35032Doy.LIZ()) {
                C09900aA.LJ(str, jSONObject);
            } else {
                if (PCE.LJI(Boolean.FALSE, str, jSONObject)) {
                    return;
                }
                if (z) {
                    jSONObject2 = null;
                    jSONObject3 = C43001GuD.LJIJJLI(jSONObject);
                } else {
                    jSONObject2 = jSONObject.toString();
                }
                LJI(new C36M(jSONObject3, z, jSONObject2, str2, str));
            }
        } catch (Exception unused) {
        }
    }
}
