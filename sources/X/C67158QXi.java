package X;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.PowerManager;
import android.os.SystemClock;
import android.os.WorkSource;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.QXi, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67158QXi {
    public static final long LJIIL = TimeUnit.DAYS.toMillis(366);
    public static volatile ScheduledExecutorService LJIILIIL = null;
    public static final Object LJIILJJIL = new Object();
    public final Object LIZ;
    public final PowerManager.WakeLock LIZIZ;
    public int LIZJ;
    public Future<?> LIZLLL;
    public long LJ;
    public final java.util.Set<ZEX> LJFF;
    public boolean LJI;
    public C67162QXm LJII;
    public final C67688QhQ LJIIIIZZ;
    public final java.util.Map<String, C67161QXl> LJIIIZ;
    public final AtomicInteger LJIIJ;
    public final ScheduledExecutorService LJIIJJI;

    public final boolean LIZIZ() {
        boolean z;
        synchronized (this.LIZ) {
            if (this.LIZJ > 0) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    public final void LIZJ() {
        C67161QXl c67161QXl;
        this.LJIIJ.decrementAndGet();
        synchronized (this.LIZ) {
            if (this.LJI) {
                TextUtils.isEmpty(null);
            }
            if (((HashMap) this.LJIIIZ).containsKey(null) && (c67161QXl = (C67161QXl) ((HashMap) this.LJIIIZ).get(null)) != null) {
                int i = c67161QXl.LIZ - 1;
                c67161QXl.LIZ = i;
                if (i == 0) {
                    ((HashMap) this.LJIIIZ).remove(null);
                }
            }
            LJ();
        }
    }

    public final void LIZLLL() {
        if (((HashSet) this.LJFF).isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(this.LJFF);
        ((HashSet) this.LJFF).clear();
        if (arrayList.size() <= 0) {
            return;
        }
        ListProtector.get(arrayList, 0);
        throw null;
    }

    public final void LJ() {
        synchronized (this.LIZ) {
            if (!LIZIZ()) {
                return;
            }
            if (this.LJI) {
                int i = this.LIZJ - 1;
                this.LIZJ = i;
                if (i > 0) {
                    return;
                }
            } else {
                this.LIZJ = 0;
            }
            LIZLLL();
            Iterator it = ((HashMap) this.LJIIIZ).values().iterator();
            while (it.hasNext()) {
                ((C67161QXl) it.next()).LIZ = 0;
            }
            ((HashMap) this.LJIIIZ).clear();
            Future<?> future = this.LIZLLL;
            if (future != null) {
                future.cancel(false);
                this.LIZLLL = null;
                this.LJ = 0L;
            }
            try {
                if (this.LIZIZ.isHeld()) {
                    try {
                        this.LIZIZ.release();
                        if (this.LJII != null) {
                            this.LJII = null;
                        }
                    } catch (RuntimeException e) {
                        if (e.getClass().equals(RuntimeException.class)) {
                            if (this.LJII != null) {
                                this.LJII = null;
                            }
                        } else {
                            throw e;
                        }
                    }
                }
            } catch (Throwable th) {
                if (this.LJII != null) {
                    this.LJII = null;
                }
                throw th;
            }
        }
    }

    public C67158QXi(Context context) {
        String packageName = context.getPackageName();
        this.LIZ = new Object();
        this.LIZJ = 0;
        this.LJFF = new HashSet();
        this.LJI = true;
        this.LJIIIIZZ = C67688QhQ.LIZ;
        this.LJIIIZ = new HashMap();
        this.LJIIJ = new AtomicInteger(0);
        QH7.LJFF("WakeLock: wakeLockName must not be empty", "wake:com.google.firebase.iid.WakeLockHolder");
        C16880lQ.LLLLL(context);
        this.LJII = null;
        if (!"com.google.android.gms".equals(context.getPackageName()) && "wake:com.google.firebase.iid.WakeLockHolder".length() != 0) {
            "*gcore*:".concat("wake:com.google.firebase.iid.WakeLockHolder");
        }
        PowerManager powerManager = (PowerManager) C16880lQ.LLILL(context, "power");
        if (powerManager != null) {
            this.LIZIZ = powerManager.newWakeLock(1, "wake:com.google.firebase.iid.WakeLockHolder");
            if (context.getPackageManager() != null) {
                if (QCX.LIZ(context).LIZ.getPackageManager().checkPermission("android.permission.UPDATE_DEVICE_STATS", context.getPackageName()) == 0) {
                    packageName = QH6.LIZ(packageName) ? context.getPackageName() : packageName;
                    if (context.getPackageManager() != null && packageName != null) {
                        try {
                            ApplicationInfo LIZ = QCX.LIZ(context).LIZ(0, packageName);
                            if (LIZ == null) {
                                if (packageName.length() != 0) {
                                    "Could not get applicationInfo from package: ".concat(packageName);
                                }
                            } else {
                                int i = LIZ.uid;
                                WorkSource workSource = new WorkSource();
                                Method method = C47706Inu.LIZIZ;
                                if (method != null) {
                                    try {
                                        C47706Inu.LIZ(workSource, method, new Object[]{Integer.valueOf(i), packageName});
                                    } catch (Exception e) {
                                        android.util.Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e);
                                    }
                                } else {
                                    Method method2 = C47706Inu.LIZ;
                                    if (method2 != null) {
                                        try {
                                            C47706Inu.LIZ(workSource, method2, new Object[]{Integer.valueOf(i)});
                                        } catch (Exception e2) {
                                            android.util.Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e2);
                                        }
                                    }
                                }
                                try {
                                    this.LIZIZ.setWorkSource(workSource);
                                } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e3) {
                                    android.util.Log.wtf("WakeLock", e3.toString());
                                }
                            }
                        } catch (PackageManager.NameNotFoundException unused) {
                            if (packageName.length() != 0) {
                                "Could not find package: ".concat(packageName);
                            }
                        }
                    }
                }
            }
            ScheduledExecutorService scheduledExecutorService = LJIILIIL;
            if (scheduledExecutorService == null) {
                synchronized (LJIILJJIL) {
                    scheduledExecutorService = LJIILIIL;
                    if (scheduledExecutorService == null) {
                        scheduledExecutorService = Executors.unconfigurableScheduledExecutorService(C16880lQ.LLLLZIL(1));
                        LJIILIIL = scheduledExecutorService;
                    }
                }
            }
            this.LJIIJJI = scheduledExecutorService;
            return;
        }
        StringBuilder sb = new StringBuilder(29);
        sb.append((CharSequence) "expected a non-null reference", 0, 29);
        throw new C67160QXk(sb.toString());
    }

    public final void LIZ(long j) {
        this.LJIIJ.incrementAndGet();
        long j2 = Long.MAX_VALUE;
        long max = Math.max(Math.min(Long.MAX_VALUE, LJIIL), 1L);
        if (j > 0) {
            max = Math.min(j, max);
        }
        synchronized (this.LIZ) {
            if (!LIZIZ()) {
                this.LJII = C67162QXm.LJLIL;
                this.LIZIZ.acquire();
                this.LJIIIIZZ.getClass();
                SystemClock.elapsedRealtime();
            }
            this.LIZJ++;
            if (this.LJI) {
                TextUtils.isEmpty(null);
            }
            C67161QXl c67161QXl = (C67161QXl) ((HashMap) this.LJIIIZ).get(null);
            if (c67161QXl == null) {
                c67161QXl = new C67161QXl(0);
                ((HashMap) this.LJIIIZ).put(null, c67161QXl);
            }
            c67161QXl.LIZ++;
            this.LJIIIIZZ.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (Long.MAX_VALUE - elapsedRealtime > max) {
                j2 = elapsedRealtime + max;
            }
            if (j2 > this.LJ) {
                this.LJ = j2;
                Future<?> future = this.LIZLLL;
                if (future != null) {
                    future.cancel(false);
                }
                this.LIZLLL = this.LJIIJJI.schedule(new RunnableC67190QYo(2, this), max, TimeUnit.MILLISECONDS);
            }
        }
    }
}
