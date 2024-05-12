package X;

import android.content.Context;
import android.content.SharedPreferences;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadTimer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.IoO, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47736IoO {
    public static C47736IoO LJIIJJI;
    public final HashMap<String, C47737IoP> LJ;
    public final ReentrantReadWriteLock LIZ = new ReentrantReadWriteLock();
    public final ArrayList<InterfaceC47537IlB> LIZIZ = new ArrayList<>();
    public Context LIZJ = null;
    public C47739IoR LIZLLL = null;
    public boolean LJFF = true;
    public long LJI = 0;
    public int LJII = 600;
    public long LJIIIIZZ = 0;
    public PthreadTimer LJIIIZ = null;
    public C47742IoU LJIIJ = null;

    public static synchronized C47736IoO LJ() {
        C47736IoO c47736IoO;
        synchronized (C47736IoO.class) {
            if (LJIIJJI == null) {
                LJIIJJI = new C47736IoO();
            }
            c47736IoO = LJIIJJI;
        }
        return c47736IoO;
    }

    public C47736IoO() {
        HashMap<String, C47737IoP> hashMap = new HashMap<>();
        this.LJ = hashMap;
        hashMap.put("vod", new C47737IoP("vod", 3));
        hashMap.put("mdl", new C47737IoP("mdl", 3));
        hashMap.put("upload", new C47737IoP("upload", 3));
        hashMap.put("common", new C47737IoP("common", 2));
    }

    public final void LIZ(String str) {
        C47737IoP c47737IoP = this.LJ.get(str);
        if (c47737IoP.LJI(C16880lQ.LLLLL(this.LIZJ))) {
            if (this.LJFF) {
                LIZIZ(str);
            } else {
                c47737IoP.LJFF();
            }
        }
    }

    public final void LIZIZ(String str) {
        this.LIZ.readLock().lock();
        Iterator<InterfaceC47537IlB> it = this.LIZIZ.iterator();
        while (it.hasNext()) {
            it.next().LIZ(str);
        }
        this.LIZ.readLock().unlock();
    }

    public final synchronized void LIZJ(long j) {
        long j2 = j;
        synchronized (this) {
            C47742IoU c47742IoU = this.LJIIJ;
            if (c47742IoU != null) {
                c47742IoU.cancel();
            }
            this.LJIIJ = new C47742IoU(this);
            PthreadTimer pthreadTimer = this.LJIIIZ;
            if (pthreadTimer != null) {
                pthreadTimer.purge();
            } else {
                this.LJIIIZ = new PthreadTimer("SettingsManager", true);
            }
            if (j2 * 1000 < 1000) {
                j2 = 86400;
            }
            try {
                long j3 = j2 * 1000;
                this.LJIIIZ.schedule(this.LJIIJ, j3, j3);
            } catch (Throwable th) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("reset schedule fail. ");
                LIZ.append(th.toString());
                X1D.LIZIZ(LIZ);
            }
        }
    }

    public final void LIZLLL(String str, String str2, JSONObject jSONObject) {
        boolean z;
        SharedPreferences sharedPreferences;
        if (jSONObject != null) {
            C47737IoP c47737IoP = this.LJ.get(str);
            JSONObject LIZIZ = c47737IoP.LIZIZ();
            if (LIZIZ == null || !LIZIZ.toString().equals(jSONObject.toString())) {
                if (str2 != null) {
                    z = true;
                } else {
                    z = false;
                }
                c47737IoP.LJI(c47737IoP.LIZJ);
                c47737IoP.LIZ.writeLock().lock();
                try {
                    try {
                    } catch (JSONException e) {
                        C16880lQ.LLLLIIL(e);
                        e.toString();
                    }
                    if (c47737IoP.LIZIZ != null && z) {
                        Iterator<String> keys = jSONObject.keys();
                        while (keys.hasNext()) {
                            String next = keys.next();
                            c47737IoP.LIZIZ.putOpt(next, jSONObject.opt(next));
                            StringBuilder LIZ = X1D.LIZ();
                            LIZ.append("update json, key = ");
                            LIZ.append(next);
                            LIZ.append(", value = ");
                            LIZ.append(jSONObject.opt(next));
                            X1D.LIZIZ(LIZ);
                        }
                        if ((c47737IoP.LJ & 2) > 0 && (sharedPreferences = c47737IoP.LJFF) != null) {
                            SharedPreferences.Editor edit = sharedPreferences.edit();
                            StringBuilder LIZ2 = X1D.LIZ();
                            LIZ2.append(c47737IoP.LJI);
                            LIZ2.append("_whole");
                            edit.putString(X1D.LIZIZ(LIZ2), c47737IoP.LIZIZ.toString());
                            edit.apply();
                        }
                        c47737IoP.LIZ.writeLock().unlock();
                        LIZIZ(str);
                    }
                    c47737IoP.LIZIZ = jSONObject;
                    if ((c47737IoP.LJ & 2) > 0) {
                        SharedPreferences.Editor edit2 = sharedPreferences.edit();
                        StringBuilder LIZ22 = X1D.LIZ();
                        LIZ22.append(c47737IoP.LJI);
                        LIZ22.append("_whole");
                        edit2.putString(X1D.LIZIZ(LIZ22), c47737IoP.LIZIZ.toString());
                        edit2.apply();
                    }
                    c47737IoP.LIZ.writeLock().unlock();
                    LIZIZ(str);
                } catch (Throwable th) {
                    c47737IoP.LIZ.writeLock().unlock();
                    throw th;
                }
            }
        }
    }
}
