package Y;

import X.C00U;
import X.C00V;
import X.C00W;
import X.C04650Gf;
import X.C09900aA;
import X.C0EG;
import X.C0GQ;
import X.C0GY;
import X.C0MT;
import X.C15070iV;
import X.C16880lQ;
import X.C22690un;
import X.C22730ur;
import X.C22740us;
import X.C23920wm;
import X.C39687Fhr;
import X.C84763XOl;
import X.F9J;
import X.FFL;
import X.V10;
import X.X1D;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.aweme.storage.CacheStrategy;
import com.aweme.storage.CompatJobService;
import com.aweme.storage.JobService;
import com.aweme.storage.experiments.StorageAutoCleanAB$Param;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Callable;
import java.util.zip.ZipInputStream;

/* loaded from: classes.dex */
public class IDCallableS414S0100000 implements Callable {
    public final int $t;
    public Object l0;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            case 2:
                return call$2(this);
            case 3:
                return call$3(this);
            case 4:
                return call$4(this);
            case 5:
                return call$5(this);
            case 6:
                return call$6(this);
            case 7:
                return call$7(this);
            default:
                return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object call$0(IDCallableS414S0100000 iDCallableS414S0100000) {
        String str;
        File file;
        C00U c00u;
        C0GQ<C0GY> LJII;
        C00W c00w = (C00W) iDCallableS414S0100000.l0;
        C00V c00v = c00w.LIZIZ;
        c00v.getClass();
        try {
            str = c00v.LIZIZ;
            File LLIIIL = C16880lQ.LLIIIL(c00v.LIZ);
            c00u = C00U.Json;
            file = new File(LLIIIL, C00V.LIZ(str, c00u, false));
        } catch (FileNotFoundException unused) {
        }
        try {
            if (!file.exists()) {
                file = new File(C16880lQ.LLIIIL(c00v.LIZ), C00V.LIZ(str, C00U.Zip, false));
                if (file.exists()) {
                }
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Animation for ");
                C0MT.LJ(LIZ, c00w.LIZ, " not found in cache. Fetching from network.", LIZ);
                return c00w.LIZIZ();
            }
            return c00w.LIZIZ();
        } catch (IOException e) {
            return new C0GQ((Throwable) e);
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        if (file.getAbsolutePath().endsWith(".zip")) {
            c00u = C00U.Zip;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("Cache hit for ");
        LIZ2.append(c00v.LIZIZ);
        LIZ2.append(" at ");
        LIZ2.append(file.getAbsolutePath());
        X1D.LIZIZ(LIZ2);
        C15070iV c15070iV = new C15070iV(c00u, fileInputStream);
        F f = c15070iV.LIZ;
        InputStream inputStream = (InputStream) c15070iV.LIZIZ;
        if (f == C00U.Zip) {
            LJII = C04650Gf.LJIIJ(new ZipInputStream(inputStream), c00w.LIZ);
        } else {
            LJII = C04650Gf.LJII(inputStream, c00w.LIZ, true);
        }
        C0GY c0gy = LJII.LIZ;
        if (c0gy != null) {
            return new C0GQ(c0gy);
        }
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("Animation for ");
        C0MT.LJ(LIZ3, c00w.LIZ, " not found in cache. Fetching from network.", LIZ3);
    }

    public static final Object call$1(IDCallableS414S0100000 iDCallableS414S0100000) {
        synchronized (((C0EG) iDCallableS414S0100000.l0)) {
            C0EG c0eg = (C0EG) iDCallableS414S0100000.l0;
            if (c0eg.LJLJLLL != null) {
                c0eg.LJIJ();
                if (((C0EG) iDCallableS414S0100000.l0).LJ()) {
                    ((C0EG) iDCallableS414S0100000.l0).LJIIL();
                    ((C0EG) iDCallableS414S0100000.l0).LJLLI = 0;
                }
                return null;
            }
            return null;
        }
    }

    public static final Object call$2(IDCallableS414S0100000 iDCallableS414S0100000) {
        return new C0GQ((C0GY) iDCallableS414S0100000.l0);
    }

    public static final Object call$3(IDCallableS414S0100000 iDCallableS414S0100000) {
        C22690un.LIZIZ((CompatJobService) iDCallableS414S0100000.l0, C09900aA.LIZJ("disk_auto_clean_monitor"));
        return null;
    }

    public static final Object call$4(IDCallableS414S0100000 iDCallableS414S0100000) {
        C22690un.LIZIZ((JobService) iDCallableS414S0100000.l0, C09900aA.LIZJ("disk_auto_clean_monitor"));
        return null;
    }

    public static final Object call$5(IDCallableS414S0100000 iDCallableS414S0100000) {
        Context context = (Context) iDCallableS414S0100000.l0;
        if (context == null) {
            return null;
        }
        try {
            File databasePath = context.getDatabasePath("storage_db.db");
            if (!databasePath.exists()) {
                return null;
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("remove cold files: ");
            LIZ.append(databasePath.getAbsolutePath());
            X1D.LIZIZ(LIZ);
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final Object call$6(IDCallableS414S0100000 iDCallableS414S0100000) {
        C22730ur c22730ur;
        long j;
        int i;
        Context context = (Context) iDCallableS414S0100000.l0;
        if (!C22690un.LIZ && context != null && (c22730ur = C22690un.LIZLLL) != null) {
            if (c22730ur.LIZ != null && C84763XOl.LJIIIIZZ() == null) {
                long j2 = F9J.LIZIZ(context, 0, "clean_storage_pref").getLong("key_clean_date", 0L);
                CacheStrategy cacheStrategy = C22690un.LIZLLL.LIZJ;
                if (cacheStrategy != null && (i = cacheStrategy.interval) >= 0) {
                    j = i * 3600000;
                } else {
                    j = 259200000;
                }
                StringBuilder LIZJ = V10.LIZJ("clean internal limit: ", j, ", last clean date: ");
                LIZJ.append(j2);
                X1D.LIZIZ(LIZJ);
                if (System.currentTimeMillis() - j2 <= j) {
                    try {
                        if (System.currentTimeMillis() - j2 > 86400000) {
                            FFL.LJIIIZ().getClass();
                            StorageAutoCleanAB$Param storageAutoCleanAB$Param = (StorageAutoCleanAB$Param) FFL.LJIJ(true, "disk_auto_clean_param", 31744, StorageAutoCleanAB$Param.class, null);
                            if (storageAutoCleanAB$Param != null && storageAutoCleanAB$Param.scene != 0) {
                                long LIZLLL = C39687Fhr.LIZLLL(context);
                                long LJFF = C39687Fhr.LJFF();
                                int i2 = storageAutoCleanAB$Param.disk_threshold;
                                if (i2 <= 0 || i2 >= LIZLLL) {
                                    if (storageAutoCleanAB$Param.scene == 3 && LJFF > 0 && LJFF < 5368709120L) {
                                    }
                                }
                            }
                        }
                    } catch (Exception e) {
                        C16880lQ.LLLLIIL(e);
                    }
                }
                C22690un.LIZ = true;
                if (Build.VERSION.SDK_INT >= 26) {
                    try {
                        if (!CompatJobService.LJLIL) {
                            CompatJobService.LJLIL = true;
                            JobInfo.Builder builder = new JobInfo.Builder(1193041, new ComponentName(context, (Class<?>) CompatJobService.class));
                            builder.setMinimumLatency(0L);
                            builder.setOverrideDeadline(3000L);
                            ((JobScheduler) C16880lQ.LLILL(context, "jobscheduler")).schedule(builder.build());
                        }
                    } catch (Exception unused) {
                    }
                } else {
                    C16880lQ.LLLL(context, new Intent(context, (Class<?>) JobService.class));
                }
            }
            if (((Boolean) C23920wm.LIZ.getValue()).booleanValue()) {
                C22740us.LIZIZ(C22690un.LIZLLL.LIZIZ, context);
            }
        }
        return null;
    }

    public static final Object call$7(IDCallableS414S0100000 iDCallableS414S0100000) {
        Context context = (Context) iDCallableS414S0100000.l0;
        if (context == null) {
            return null;
        }
        F9J.LIZIZ(context, 0, "clean_storage_pref").edit().putLong("key_clean_date", System.currentTimeMillis()).commit();
        C22690un.LIZ = false;
        return null;
    }

    public IDCallableS414S0100000(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
