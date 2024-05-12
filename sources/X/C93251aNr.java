package X;

import Y.IDRunnableS90S0100000_32;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.bytedance.pitaya.feature.ApplicationLifecycleWatcher;
import com.bytedance.pitaya.inner.api.bean.SetupInfo;
import com.bytedance.pitaya.log.PitayaLogger;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.lang.reflect.Method;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.aNr, reason: case insensitive filesystem */
/* loaded from: classes30.dex */
public final class C93251aNr {
    public static final float LJIIZILJ = Runtime.getRuntime().availableProcessors();
    public final Context LIZ;
    public final String LIZLLL;
    public String LJFF;
    public String LJI;
    public final long LJII;
    public final int LJIIIIZZ;
    public final Object LJIIIZ;
    public final Method LJIIJ;
    public final Method LJIIJJI;
    public volatile float[] LJIIL;
    public volatile float[] LJIILIIL;
    public volatile float[] LJIILJJIL;
    public volatile float[] LJIILL;
    public final C93252aNs LJIILLIIL;
    public final String LIZIZ = Build.BRAND.concat(" ").concat(Build.MODEL);
    public final String LIZJ = Build.VERSION.RELEASE;
    public final long LJ = LIZLLL(0);

    public static Object LIZ(Object obj, Method method, Object[] objArr) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(110000, "java/lang/reflect/Method", "invoke", method, new Object[]{obj, objArr}, "java.lang.Object", new C65300Pk0(true, "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "6723463803557443084"));
        return LIZJ.LIZ ? LIZJ.LIZIZ : method.invoke(obj, objArr);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DeviceInfo{mContext=");
        LIZ.append(this.LIZ);
        LIZ.append(", deviceType='");
        LIZ.append(this.LIZIZ);
        LIZ.append('\'');
        LIZ.append(", osVersion='");
        LIZ.append(this.LIZJ);
        LIZ.append('\'');
        LIZ.append(", resolution='");
        LIZ.append(this.LIZLLL);
        LIZ.append('\'');
        LIZ.append(", diskTotal=");
        LIZ.append(this.LJ);
        LIZ.append(", cpuType='");
        LIZ.append(this.LJFF);
        LIZ.append('\'');
        LIZ.append(", totalMem=");
        LIZ.append(this.LJII);
        LIZ.append('}');
        return X1D.LIZIZ(LIZ);
    }

    public C93251aNr(Context context) {
        String str;
        long j;
        String settings;
        this.LIZ = context;
        try {
            WindowManager windowManager = (WindowManager) C16880lQ.LLILL(context, "window");
            DisplayMetrics displayMetrics = new DisplayMetrics();
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
            str = String.valueOf(displayMetrics.heightPixels).concat("*").concat(String.valueOf(displayMetrics.widthPixels));
        } catch (Throwable unused) {
            str = "0x0";
        }
        this.LIZLLL = str;
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("/proc/cpuinfo"));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                String[] split = readLine.split(":");
                if (split.length > 1) {
                    String replace = split[0].trim().replace(" ", "_");
                    int hashCode = replace.hashCode();
                    if (hashCode != 181553672) {
                        if (hashCode == 909208690 && replace.equals("Processor")) {
                            this.LJFF = split[1].trim();
                        }
                    } else if (replace.equals("Hardware")) {
                        String[] split2 = split[1].split(" ");
                        this.LJI = split2[split2.length - 1];
                    }
                }
            }
            bufferedReader.close();
        } catch (Exception e) {
            PitayaLogger.LIZLLL("", "", e);
        }
        try {
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            ((ActivityManager) C16880lQ.LLILL(this.LIZ, "activity")).getMemoryInfo(memoryInfo);
            j = (memoryInfo.totalMem / 1024) / 1024;
        } catch (Throwable th) {
            PitayaLogger.LIZLLL("", "", th);
            j = 0;
        }
        this.LJII = j;
        this.LJIIIIZZ = Runtime.getRuntime().availableProcessors();
        try {
            Class<?> cls = Class.forName("com.bytedance.apm6.cpu.ApmCpuManager");
            this.LJIIIZ = cls.getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
            this.LJIIJ = cls.getDeclaredMethod("getCpuRate", new Class[0]);
            this.LJIIJJI = cls.getDeclaredMethod("getCpuSpeed", new Class[0]);
        } catch (Throwable th2) {
            PitayaLogger.LJFF("CFM", "", "", th2);
        }
        SetupInfo setupInfo = C93318aOw.LIZ;
        if (setupInfo == null || (settings = setupInfo.getSettings("pitaya_general_settings.content.pitaya_global.enable_sensor", 1)) == null) {
            return;
        }
        try {
            if (!new JSONObject(settings).optBoolean("rst")) {
                return;
            }
            this.LJIILLIIL = new C93252aNs(context);
            C93247aNn c93247aNn = new C93247aNn(this);
            C93248aNo c93248aNo = new C93248aNo(this);
            C93249aNp c93249aNp = new C93249aNp(this);
            C93250aNq c93250aNq = new C93250aNq(this);
            ApplicationLifecycleWatcher applicationLifecycleWatcher = ApplicationLifecycleWatcher.LJLJI;
            C93324aP2 c93324aP2 = new C93324aP2(this, c93247aNn, c93248aNo, c93249aNp, c93250aNq);
            applicationLifecycleWatcher.getClass();
            ExecutorC93235aNb.LIZIZ(new IDRunnableS90S0100000_32(c93324aP2, 1));
        } catch (JSONException e2) {
            PitayaLogger.LIZLLL("", "", e2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0089 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long LIZJ(int r13) {
        /*
            r12 = this;
            android.content.Context r1 = r12.LIZ
            java.lang.String r0 = "storage"
            java.lang.Object r0 = X.C16880lQ.LLILL(r1, r0)
            android.os.storage.StorageManager r0 = (android.os.storage.StorageManager) r0
            java.util.List r0 = r0.getStorageVolumes()
            java.util.Iterator r11 = r0.iterator()
            r9 = 0
        L14:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L93
            java.lang.Object r3 = r11.next()
            android.os.storage.StorageVolume r3 = (android.os.storage.StorageVolume) r3
            boolean r0 = r3.isPrimary()
            if (r0 == 0) goto L4d
            android.content.Context r1 = r12.LIZ     // Catch: java.lang.Throwable -> L7b
            java.lang.String r0 = "storagestats"
            java.lang.Object r2 = X.C16880lQ.LLILL(r1, r0)     // Catch: java.lang.Throwable -> L7b
            android.app.usage.StorageStatsManager r2 = (android.app.usage.StorageStatsManager) r2     // Catch: java.lang.Throwable -> L7b
            java.lang.String r1 = r3.getUuid()     // Catch: java.lang.Throwable -> L7b
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L7b
            if (r0 == 0) goto L41
            java.util.UUID r0 = android.os.storage.StorageManager.UUID_DEFAULT     // Catch: java.lang.Throwable -> L7b
        L3c:
            long r3 = r2.getFreeBytes(r0)     // Catch: java.lang.Throwable -> L7b
            goto L46
        L41:
            java.util.UUID r0 = java.util.UUID.fromString(r1)     // Catch: java.lang.Throwable -> L7b
            goto L3c
        L46:
            long r5 = r2.getTotalBytes(r0)     // Catch: java.lang.Throwable -> L4b
            goto L87
        L4b:
            r2 = move-exception
            goto L7e
        L4d:
            android.content.Context r0 = r12.LIZ
            java.io.File[] r8 = X.C04260Es.LIZ(r0)
            int r7 = r8.length
            r5 = 0
            r3 = 0
            r2 = 0
        L59:
            if (r2 >= r7) goto L87
            r0 = r8[r2]
            if (r0 != 0) goto L69
            java.lang.String r1 = "CFM"
            java.lang.String r0 = "invalid file path!"
            com.bytedance.pitaya.log.PitayaLogger.LIZIZ(r1, r0)
        L66:
            int r2 = r2 + 1
            goto L59
        L69:
            android.os.StatFs r1 = new android.os.StatFs
            java.lang.String r0 = r0.getPath()
            r1.<init>(r0)
            long r3 = r1.getFreeBytes()
            long r5 = r1.getTotalBytes()
            goto L66
        L7b:
            r2 = move-exception
            r3 = 0
        L7e:
            java.lang.String r1 = "Get Storage"
            java.lang.String r0 = ""
            com.bytedance.pitaya.log.PitayaLogger.LIZLLL(r1, r0, r2)
            r5 = 0
        L87:
            if (r13 != 0) goto L8b
        L89:
            long r9 = r9 + r5
            goto L14
        L8b:
            r0 = 1
            if (r13 != r0) goto L90
            r5 = r3
            goto L89
        L90:
            r5 = 0
            goto L89
        L93:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C93251aNr.LIZJ(int):long");
    }

    public final long LIZLLL(int i) {
        long j;
        long LIZIZ;
        File LLLLLLLLLL;
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                j = LIZJ(i);
            } else {
                File dataDirectory = Environment.getDataDirectory();
                long j2 = -1;
                if (dataDirectory == null) {
                    LIZIZ = -1;
                } else {
                    LIZIZ = LIZIZ(dataDirectory, i);
                }
                if ("mounted".equals(C16880lQ.LLLLLLLZIL()) && (LLLLLLLLLL = C16880lQ.LLLLLLLLLL()) != null) {
                    j2 = LIZIZ(LLLLLLLLLL, i);
                }
                j = LIZIZ + j2;
            }
        } catch (Exception e) {
            PitayaLogger.LIZLLL("", "", e);
            j = 0;
        }
        return (j / 1024) / 1024;
    }

    public static long LIZIZ(File file, int i) {
        StatFs statFs = new StatFs(file.getPath());
        long blockSizeLong = statFs.getBlockSizeLong();
        long blockCountLong = statFs.getBlockCountLong();
        long j = blockSizeLong * blockCountLong;
        long availableBlocksLong = blockCountLong * statFs.getAvailableBlocksLong();
        if (i == 0) {
            return j;
        }
        if (i == 1) {
            return availableBlocksLong;
        }
        return 0L;
    }
}
