package X;

import android.os.SystemClock;
import android.text.TextUtils;
import android.webkit.WebResourceResponse;
import com.bytedance.mt.protector.impl.UriProtector;
import java.io.ByteArrayInputStream;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.FutureTask;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class FP9 {
    public final FPC LIZ = new FPC(this);
    public final ExecutorService LIZIZ = C16880lQ.LLLLZLLIL();
    public final java.util.Map<String, FutureTask<JSONObject>> LIZJ = new HashMap();
    public final ConcurrentHashMap<String, FP0> LIZLLL = new ConcurrentHashMap<>();
    public String LJ;
    public String LJFF;
    public boolean LJI;

    public final void LIZ(String str) {
        String scheme;
        if (this.LJI) {
            this.LJI = false;
            return;
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String LJIJJLI = T2R.LJIJJLI(str);
        FPC fpc = this.LIZ;
        fpc.getClass();
        if (TextUtils.isEmpty(LJIJJLI) || TextUtils.isEmpty(LJIJJLI) || (scheme = UriProtector.parse(LJIJJLI).getScheme()) == null) {
            return;
        }
        if (!scheme.equals("http") && !scheme.equals("https")) {
            return;
        }
        if (fpc.LIZ != null && fpc.LIZ.LIZIZ(LJIJJLI)) {
            return;
        }
        FP0 fp0 = new FP0();
        fp0.LIZIZ = SystemClock.uptimeMillis();
        ((ConcurrentHashMap) fp0.LIZ).put("scc_cloudservice_url", LJIJJLI);
        fpc.LIZIZ.LIZLLL.put(LJIJJLI, fp0);
        FutureTask futureTask = new FutureTask(new FP8(fpc, LJIJJLI));
        ((HashMap) fpc.LIZIZ.LIZJ).put(LJIJJLI, futureTask);
        fpc.LIZIZ.LIZIZ.execute(futureTask);
    }

    public final JSONObject LIZIZ(String str) {
        JSONObject jSONObject;
        FPC fpc = this.LIZ;
        fpc.getClass();
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String LJIJJLI = T2R.LJIJJLI(str);
        if (!((HashMap) fpc.LIZIZ.LIZJ).containsKey(LJIJJLI) || fpc.LIZ == null) {
            return null;
        }
        FutureTask futureTask = (FutureTask) ((HashMap) fpc.LIZIZ.LIZJ).get(LJIJJLI);
        C1JX.LJIIIIZZ("will wait response, url: ", LJIJJLI);
        FP0 fp0 = fpc.LIZIZ.LIZLLL.get(LJIJJLI);
        if (fp0 != null && fp0.LIZJ != 0) {
            fp0.LIZJ = SystemClock.uptimeMillis();
        }
        try {
            jSONObject = (JSONObject) futureTask.get();
            if (fp0 != null) {
                try {
                    fp0.LIZ("", true);
                } catch (Exception e) {
                    e = e;
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("getCloudServiceLabel exception! ");
                    LIZ.append(e);
                    X1D.LIZIZ(LIZ);
                    if (fp0 != null) {
                        fp0.LIZ(e.toString(), false);
                    }
                    JSONObject jSONObject2 = jSONObject;
                    fpc.LIZIZ.LIZLLL.remove(LJIJJLI);
                    jSONObject2.toString();
                    ((HashMap) fpc.LIZIZ.LIZJ).remove(LJIJJLI);
                    return jSONObject2;
                }
            }
        } catch (Exception e2) {
            e = e2;
            jSONObject = null;
        }
        JSONObject jSONObject22 = jSONObject;
        fpc.LIZIZ.LIZLLL.remove(LJIJJLI);
        jSONObject22.toString();
        ((HashMap) fpc.LIZIZ.LIZJ).remove(LJIJJLI);
        return jSONObject22;
    }

    public final void LIZJ(String str) {
        FPC fpc = this.LIZ;
        fpc.LIZIZ();
        FPA fpa = fpc.LIZ;
        fpa.getClass();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String LJIJJLI = T2R.LJIJJLI(str);
        ((ReentrantReadWriteLock) fpa.LJIIJ).writeLock().lock();
        ((ArrayDeque) fpa.LIZJ).offer(LJIJJLI);
        while (((ArrayDeque) fpa.LIZJ).size() > 10) {
            ((ArrayDeque) fpa.LIZJ).poll();
        }
        ((ReentrantReadWriteLock) fpa.LJIIJ).writeLock().unlock();
    }

    public final void LIZLLL(String str) {
        String LJIJJLI = T2R.LJIJJLI(str);
        synchronized (this) {
            this.LJFF = LJIJJLI;
        }
    }

    public final boolean LJ(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String LJIJJLI = T2R.LJIJJLI(str);
        synchronized (this) {
            if (!TextUtils.equals(this.LJFF, LJIJJLI)) {
                return false;
            }
            this.LJFF = null;
            return true;
        }
    }

    public final WebResourceResponse LJFF(String str) {
        C36608EYi c36608EYi;
        String str2;
        FPC fpc = this.LIZ;
        if (fpc.LIZ == null) {
            return null;
        }
        FPA fpa = fpc.LIZ;
        synchronized (fpa) {
            FPD fpd = fpa.LJFF;
            if (fpd != null) {
                c36608EYi = fpd.LIZIZ(str);
                fpa.LJFF.LIZJ(str);
            } else {
                c36608EYi = null;
            }
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("will use scc prefetch response: ");
        if (c36608EYi == null) {
            str2 = "null";
        } else {
            str2 = "not null";
        }
        LIZ.append(str2);
        X1D.LIZIZ(LIZ);
        if (c36608EYi == null) {
            return null;
        }
        return new WebResourceResponse("text/html", "UTF-8", new ByteArrayInputStream(c36608EYi.LIZIZ));
    }
}
