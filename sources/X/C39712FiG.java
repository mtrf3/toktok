package X;

import Y.ARunnableS47S0100000_11;
import android.app.ActivityManager;
import android.os.Build;
import android.os.Debug;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import java.io.File;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.FiG, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39712FiG {
    public final boolean LIZ;
    public boolean LIZIZ;
    public boolean LIZJ;
    public String LIZLLL;
    public int LJ;
    public int LJFF;
    public long LJI;
    public boolean LJII;
    public long LJIIIIZZ;
    public long LJIIIZ;
    public String LJIIJ;
    public boolean LJIIJJI;
    public long LJIIL;
    public long LJIILIIL;
    public double LJIILJJIL;
    public long LJIILL;
    public long LJIILLIIL;
    public double LJIIZILJ;
    public long LJIJ;
    public long LJIJI;
    public double LJIJJ;
    public boolean LJIJJLI;
    public boolean LJIL;

    public final void LJI() {
        String str;
        this.LJIIJJI = true;
        StatFs statFs = new StatFs(Environment.getRootDirectory().getAbsolutePath());
        if (this.LJIIJJI) {
            this.LJIILIIL = statFs.getAvailableBytes();
            this.LJIIL = statFs.getBlockCountLong() * statFs.getBlockSizeLong();
        } else {
            this.LJIILIIL = statFs.getBlockSize() * statFs.getAvailableBlocks();
            this.LJIIL = statFs.getBlockSize() * statFs.getBlockCount();
        }
        this.LJIILJJIL = LIZLLL(this.LJIILIIL, this.LJIIL);
        try {
            StatFs statFs2 = new StatFs(C16880lQ.LLIIJLIL(C09970aH.LIZ).getAbsolutePath());
            if (this.LJIIJJI) {
                this.LJIILLIIL = statFs2.getAvailableBytes();
                this.LJIILL = statFs2.getBlockSizeLong() * statFs2.getBlockCountLong();
            } else {
                this.LJIILLIIL = statFs2.getBlockSize() * statFs2.getAvailableBlocks();
                this.LJIILL = statFs2.getBlockSize() * statFs2.getBlockCount();
            }
            this.LJIIZILJ = LIZLLL(this.LJIILLIIL, this.LJIILL);
        } catch (Throwable unused) {
        }
        try {
            str = C16880lQ.LLLLLLLZIL();
        } catch (Exception unused2) {
            str = null;
        }
        boolean equals = TextUtils.equals(str, "mounted");
        this.LJIJJLI = equals;
        try {
            if (equals) {
                StatFs statFs3 = new StatFs(C16880lQ.LLLLLLLLLL().getAbsolutePath());
                if (this.LJIIJJI) {
                    this.LJIJI = statFs3.getAvailableBytes();
                    this.LJIJ = statFs3.getBlockSizeLong() * statFs3.getBlockCountLong();
                } else {
                    this.LJIJI = statFs3.getBlockSize() * statFs3.getAvailableBlocks();
                    this.LJIJ = statFs3.getBlockSize() * statFs3.getBlockCount();
                }
                this.LJIJJ = LIZLLL(this.LJIJI, this.LJIJ);
            } else {
                this.LJIJ = 0L;
            }
        } catch (Throwable unused3) {
        }
        this.LJIL = Environment.isExternalStorageRemovable();
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x00e4, code lost:
    
        if (r1.toLowerCase().startsWith("hua") != false) goto L52;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ() {
        /*
            Method dump skipped, instructions count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C39712FiG.LJ():void");
    }

    public final void LJFF() {
        ActivityManager activityManager = (ActivityManager) C16880lQ.LLILL(C09970aH.LIZ, "activity");
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        activityManager.getMemoryInfo(memoryInfo);
        this.LJFF = (int) (memoryInfo.totalMem / 536870912);
        String str = "jemalloc";
        if (Build.VERSION.SDK_INT >= 24) {
            this.LJIIJ = "jemalloc";
            return;
        }
        String string = C39714FiI.LIZ.LIZ.getString("sp_malloc_impl", null);
        if (string == null) {
            File file = new File("/system/lib/libc.so");
            if (file.exists()) {
                try {
                    if (!C39640Fh6.LIZ(file)) {
                        str = "dlmalloc";
                    }
                    string = str;
                } catch (IOException unused) {
                }
                C39714FiI.LIZ.LIZ.edit().putString("sp_malloc_impl", string).apply();
            }
            string = "unknown";
            C39714FiI.LIZ.LIZ.edit().putString("sp_malloc_impl", string).apply();
        }
        this.LJIIJ = string;
    }

    public C39712FiG() {
        if (C77357UXp.LJJIIJZLJL()) {
            F9U.LIZ.LIZJ(new ARunnableS47S0100000_11(new Throwable("Don't use DeviceInfoUtil on main thread."), 109));
        }
        boolean z = C09970aH.LJIIZILJ;
        this.LIZ = z;
        if (!z) {
            return;
        }
        try {
            LJ();
            LJFF();
            LJI();
        } catch (Throwable unused) {
        }
    }

    public final void LIZ(JSONObject jSONObject) {
        if (!this.LIZ) {
            return;
        }
        try {
            C39712FiG c39712FiG = C39715FiJ.LIZ;
            if (c39712FiG.LIZ) {
                jSONObject.put("apm_is_app_64", c39712FiG.LIZIZ);
                jSONObject.put("apm_is_device_64", c39712FiG.LIZJ);
                jSONObject.put("apm_cpu_model", c39712FiG.LIZLLL);
                int i = c39712FiG.LJ;
                if (i > 0) {
                    jSONObject.put("apm_cpu_core_num", i);
                }
            }
            if (c39712FiG.LIZ) {
                jSONObject.put("apm_physical_mem", c39712FiG.LJFF);
                jSONObject.put("apm_malloc_impl", c39712FiG.LJIIJ);
            }
            c39712FiG.LIZJ(jSONObject);
        } catch (JSONException unused) {
        }
    }

    public final void LIZIZ(JSONObject jSONObject) {
        boolean z;
        if (!this.LIZ) {
            return;
        }
        this.LJI = Debug.getNativeHeapAllocatedSize() / 1048576;
        Runtime runtime = Runtime.getRuntime();
        long maxMemory = runtime.maxMemory();
        long freeMemory = runtime.freeMemory();
        long j = runtime.totalMemory();
        this.LJIIIIZZ = maxMemory / 1048576;
        long j2 = j - freeMemory;
        this.LJIIIZ = j2 / 1048576;
        if (((float) j2) > ((float) maxMemory) * 0.95f) {
            z = true;
        } else {
            z = false;
        }
        this.LJII = z;
        jSONObject.put("apm_native_heap_size", this.LJI);
        jSONObject.put("apm_java_heap_leak", this.LJII);
        jSONObject.put("apm_java_heap_used", this.LJIIIZ);
        jSONObject.put("apm_java_heap_max", this.LJIIIIZZ);
    }

    public final void LIZJ(JSONObject jSONObject) {
        if (!this.LIZ) {
            return;
        }
        if (this.LJIIL != 0) {
            jSONObject.put("apm_sys_avail_size", this.LJIILIIL / 1048576);
            jSONObject.put("apm_sys_avail_ratio", this.LJIILJJIL);
        }
        if (this.LJIILL != 0) {
            jSONObject.put("apm_data_avail_size", this.LJIILLIIL / 1073741824);
            jSONObject.put("apm_data_avail_ratio", this.LJIIZILJ);
        }
        if (this.LJIJ != 0) {
            jSONObject.put("apm_sd_avail_size", this.LJIJI / 1073741824);
            jSONObject.put("apm_sd_avail_ratio", this.LJIJJ);
        }
        if (!this.LJIJJLI) {
            return;
        }
        jSONObject.put("apm_external_removable", this.LJIL);
    }

    public static double LIZLLL(long j, long j2) {
        if (j2 == 0) {
            return LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
        }
        return Math.round((j / j2) * 100.0d) / 100.0d;
    }
}
