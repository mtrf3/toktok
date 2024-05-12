package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class FPA {
    public InterfaceC36611EYl LIZ;
    public String LIZIZ;
    public FPD LJFF;
    public boolean LJI;
    public String LJIIIIZZ;
    public int LJII = 1000;
    public int LJIIIZ = 3000;
    public final ReadWriteLock LJIIJ = new ReentrantReadWriteLock();
    public final java.util.Map<String, JSONObject> LJ = new HashMap();
    public final Queue<String> LIZJ = new ArrayDeque();
    public final C35735E0t LIZLLL = new C35735E0t(this, 100);

    public final void LJIIIIZZ() {
        synchronized (this) {
            try {
                notify();
            } catch (Exception unused) {
            }
        }
    }

    public final void LJI() {
        ((ReentrantReadWriteLock) this.LJIIJ).readLock().lock();
        if (!this.LJI) {
            ((ReentrantReadWriteLock) this.LJIIJ).readLock().unlock();
            synchronized (this) {
                this.LJFF = null;
            }
        } else {
            ((ReentrantReadWriteLock) this.LJIIJ).readLock().unlock();
            if (this.LJFF == null) {
                synchronized (this) {
                    if (this.LJFF == null) {
                        this.LJFF = new FPD(this);
                    }
                }
            }
        }
    }

    public static String LIZJ(C36608EYi c36608EYi) {
        java.util.Map<String, List<String>> map;
        List<String> list;
        if (c36608EYi == null || (map = c36608EYi.LIZJ) == null || map.isEmpty() || ((((list = c36608EYi.LIZJ.get("X-Tt-Logid")) == null || list.isEmpty()) && (list = c36608EYi.LIZJ.get("X-Tt-Logid".toLowerCase())) == null) || list.isEmpty())) {
            return null;
        }
        return (String) ListProtector.get(list, 0);
    }

    public final void LIZ(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String LJIJI = T2R.LJIJI(str);
        if (!TextUtils.isEmpty(LJIJI)) {
            ((ReentrantReadWriteLock) this.LJIIJ).writeLock().lock();
            this.LIZLLL.put(LJIJI, Boolean.TRUE);
            ((ReentrantReadWriteLock) this.LJIIJ).writeLock().unlock();
        }
    }

    public final boolean LIZIZ(String str) {
        boolean containsKey;
        synchronized (this) {
            containsKey = ((HashMap) this.LJ).containsKey(str);
        }
        return containsKey;
    }

    public final JSONObject LIZLLL(String str) {
        JSONObject jSONObject;
        synchronized (this) {
            jSONObject = (JSONObject) ((HashMap) this.LJ).get(str);
        }
        return jSONObject;
    }

    public final void LJFF(String str) {
        synchronized (this) {
            ((HashMap) this.LJ).remove(str);
        }
    }

    public static JSONObject LJ(long j, C36608EYi c36608EYi) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("code", -1);
            jSONObject.put("message", "fail");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("label", "notice");
            jSONObject.put("data", jSONObject2);
            jSONObject.put("scc_reason", "timeout");
            jSONObject.put("scc_passed_time", j);
            String LIZJ = LIZJ(c36608EYi);
            if (LIZJ == null) {
                LIZJ = "";
            }
            jSONObject.put("scc_logid", LIZJ);
            return jSONObject;
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("cloud service onFail catch exception: ");
            LIZ.append(e);
            X1D.LIZIZ(LIZ);
            return null;
        }
    }

    public final void LJII(String str, JSONObject jSONObject) {
        synchronized (this) {
            ((HashMap) this.LJ).put(str, jSONObject);
        }
    }
}
