package com.bytedance.crash.heaptracker;

import X.C16880lQ;
import X.C63986P9i;
import X.C64241PJd;
import X.C64246PJi;
import X.C77357UXp;
import X.FPX;
import X.PJV;
import X.PJY;
import X.PJZ;
import X.PK0;
import X.PK8;
import X.PKN;
import X.X1D;
import android.content.Context;
import com.bytedance.crash.entity.Header;
import com.bytedance.mt.protector.impl.PatternProtector;
import defpackage.a1;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.regex.Matcher;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class NativeHeapTracker {
    public static int LJIIJJI = 0;
    public static int LJIIL = 0;
    public static boolean LJIILIIL = false;
    public static boolean LJIILJJIL = false;
    public static String LJIILL = null;
    public static String LJIILLIIL = null;
    public static String LJIIZILJ = "None";
    public static String LJIJ = "None";
    public int LIZ;
    public boolean LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final int LJ;
    public final File LJFF;
    public final String LJI;
    public boolean LJII;
    public final boolean LJIIIIZZ;
    public final boolean LJIIIZ;
    public final Context LJIIJ;

    public static native int nativeDoCommnad(int i);

    public static native long nativeGetHeapLeakSize();

    public static native long nativeGetHeapSize();

    public static native int nativeInit(int i, int i2, int i3, String str);

    public static native void nativeMinSizeByte(long j);

    public static native void nativeNeedDumpMemInfo(int i);

    public static native void nativeSetDumpThreshold(long j);

    public final void LIZJ() {
        if (this.LJIIIZ) {
            C77357UXp.LJJII();
        }
        int nativeDoCommnad = nativeDoCommnad(3);
        if (nativeDoCommnad != 0) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("dumpNative ret=");
            LIZ.append(nativeDoCommnad);
            X1D.LIZIZ(LIZ);
            C77357UXp.LJJII();
            this.LIZIZ = true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0196  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL() {
        /*
            Method dump skipped, instructions count: 424
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.heaptracker.NativeHeapTracker.LIZLLL():void");
    }

    public final void LJ() {
        if (this.LJIIIZ) {
            C77357UXp.LJJII();
        }
        int nativeDoCommnad = nativeDoCommnad(4);
        if (nativeDoCommnad != 0) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("exitNative ret=");
            LIZ.append(nativeDoCommnad);
            X1D.LIZIZ(LIZ);
            C77357UXp.LJJII();
            this.LIZIZ = true;
        }
    }

    public final String LJI() {
        int i = this.LIZ;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                return "[STATEE_UNKNOWN]";
                            }
                            return "[STATE_EXIT]";
                        }
                        return "[STATE_WAIT]";
                    }
                    return "[STATE_TRACK]";
                }
                return "[STATE_OBSERV]";
            }
            return "[STATE_PREPARE]";
        }
        return "[STATE_INIT]";
    }

    public final void LJIIIIZZ() {
        if (this.LJIIIZ) {
            C77357UXp.LJJII();
        }
        int nativeDoCommnad = nativeDoCommnad(1);
        if (nativeDoCommnad != 0) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("trackNative ret=");
            LIZ.append(nativeDoCommnad);
            X1D.LIZIZ(LIZ);
            C77357UXp.LJJII();
            this.LIZIZ = true;
        }
    }

    public final void LJIIJ() {
        if (this.LJIIIZ) {
            C77357UXp.LJJII();
        }
        int nativeDoCommnad = nativeDoCommnad(2);
        if (nativeDoCommnad != 0) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("waitNative ret=");
            LIZ.append(nativeDoCommnad);
            X1D.LIZIZ(LIZ);
            C77357UXp.LJJII();
            this.LIZIZ = true;
        }
    }

    public static String LIZ(String str) {
        long longValue = Long.decode(str.substring(0, str.indexOf("MB"))).longValue();
        if (longValue >= 1 && longValue <= 5) {
            return "1MB~5MB";
        }
        if (longValue > 5 && longValue <= 10) {
            return "5MB~10MB";
        }
        if (longValue > 10 && longValue <= 20) {
            return "10MB~20MB";
        }
        if (longValue > 20 && longValue <= 30) {
            return "20MB~30MB";
        }
        if (longValue > 30 && longValue <= 40) {
            return "3MB~40MB";
        }
        if (longValue > 40 && longValue <= 50) {
            return "40MB~50MB";
        }
        if (longValue > 50 && longValue <= 60) {
            return "50MB~60MB";
        }
        if (longValue > 60 && longValue <= 70) {
            return "60MB~70MB";
        }
        if (longValue > 70 && longValue <= 80) {
            return "=70MB~80MB";
        }
        if (longValue > 80 && longValue <= 90) {
            return "80MB~90MB";
        }
        if (longValue > 90 && longValue <= 100) {
            return "90MB~100MB";
        }
        if (longValue > 100 && longValue <= 250) {
            return "100MB~250MB";
        }
        if (longValue > 250 && longValue <= 350) {
            return "250MB~350MB";
        }
        if (longValue > 350 && longValue <= 450) {
            return "350MB~450MB";
        }
        if (longValue > 450 && longValue <= 550) {
            return "450MB~550MB";
        }
        if (longValue > 550 && longValue <= 650) {
            return "550MB~650MB";
        }
        if (longValue > 650 && longValue <= 750) {
            return "650MB~750MB";
        }
        if (longValue > 750 && longValue <= 850) {
            return "750MB~850MB";
        }
        if (longValue > 850 && longValue <= 950) {
            return "850MB~950MB";
        }
        if (longValue > 950 && longValue <= 1050) {
            return "950MB~1050MB";
        }
        if (longValue > 1050 && longValue <= 1250) {
            return "1050MB~1250MB";
        }
        if (longValue > 1250 && longValue <= 1450) {
            return "1250MB~1450MB";
        }
        if (longValue > 1450 && longValue <= 1650) {
            return "1450MB~1650MB";
        }
        if (longValue > 1650 && longValue <= 1850) {
            return "1650MB~1850MB";
        }
        if (longValue > 1850 && longValue <= 2050) {
            return "1850MB~2050MB";
        }
        return ">2.3G";
    }

    public static String LIZIZ(String str) {
        StringBuilder sb = new StringBuilder();
        try {
            if (str.length() < 16) {
                sb.append(str);
            } else {
                sb.append(str.charAt(6));
                sb.append(str.charAt(7));
                sb.append(str.charAt(4));
                sb.append(str.charAt(5));
                sb.append(str.charAt(2));
                sb.append(str.charAt(3));
                sb.append(str.charAt(0));
                sb.append(str.charAt(1));
                sb.append(str.charAt(10));
                sb.append(str.charAt(11));
                sb.append(str.charAt(8));
                sb.append(str.charAt(9));
                sb.append(str.charAt(14));
                sb.append(str.charAt(15));
                sb.append(str.charAt(12));
                sb.append(str.charAt(13));
                if (str.length() >= 32) {
                    sb.append((CharSequence) str, 16, 32);
                    sb.append('0');
                }
            }
        } catch (Throwable unused) {
        }
        return sb.toString().toUpperCase();
    }

    public static void LJIIIZ(File file) {
        File file2 = new File(file, "tombstone.txt");
        PKN pkn = new PKN();
        try {
            try {
                JSONArray LJIIIIZZ = PK8.LJIIIIZZ(file2.getAbsolutePath());
                if (LJIIIIZZ == null) {
                    PK8.LIZJ(file);
                    return;
                }
                int LJFF = LJFF(LJIIIIZZ, 0, "pid:");
                if (LJFF < 0) {
                    PK8.LIZJ(file);
                    return;
                }
                String str = null;
                String[] split = LJIIIIZZ.optString(LJFF, null).trim().split("\\s");
                for (int i = 0; i < split.length; i++) {
                    try {
                        String str2 = split[i];
                        if ("pid:".equals(str2)) {
                            pkn.LJIIJJI("pid", Long.decode(split[i + 1].substring(0, r15.length() - 1)));
                        } else if ("tid:".equals(str2)) {
                            String str3 = split[i + 1];
                            pkn.LJIIJJI("tid", Long.decode(str3.substring(0, str3.length() - 1)));
                        } else if ("name:".equals(str2)) {
                            int i2 = i + 1;
                            pkn.LJIIJJI("crash_thread_name", split[i2].substring(0, r15.length() - 1));
                            String str4 = split[i2];
                            str = str4.substring(0, str4.length() - 1);
                        }
                    } catch (Throwable th) {
                        th = th;
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("Throwable:");
                        LIZ.append(th);
                        X1D.LIZIZ(LIZ);
                        C77357UXp.LJIIJ();
                        PK8.LIZJ(file);
                        return;
                    }
                }
                pkn.LJIIJJI("process_name", split[split.length - 2]);
                StringBuilder sb = new StringBuilder();
                int LJFF2 = LJFF(LJIIIIZZ, LJFF + 1, "Signal ");
                if (LJFF2 < 0) {
                    PK8.LIZJ(file);
                    return;
                }
                String optString = LJIIIIZZ.optString(LJFF2, null);
                LJIIZILJ = optString;
                sb.append(optString);
                sb.append('\n');
                try {
                    if (LJIIZILJ.startsWith("Signal 6(SIGABRT)")) {
                        Matcher matcher = PatternProtector.compile("Code -\\d+\\(([^\\)]+)\\)").matcher(LJIIZILJ);
                        if (matcher.find()) {
                            LJIJ = matcher.group(1);
                        }
                    }
                } catch (Throwable unused) {
                }
                int LJFF3 = LJFF(LJIIIIZZ, LJFF2 + 1, "Abort message:");
                if (LJFF3 < 0) {
                    PK8.LIZJ(file);
                    return;
                }
                String replace = LJIIIIZZ.optString(LJFF3, null).replace("Abort message:", "abort message:");
                sb.append(replace);
                sb.append('\n');
                try {
                    if (LJIILL == null && LJIILLIIL == null && replace.startsWith("abort message:")) {
                        String[] split2 = replace.trim().split(":");
                        String[] split3 = split2[2].trim().split(",");
                        if (split2.length >= 4) {
                            LJIILL = split2[1];
                            if ("SI_LARGE_MEM".equals(LJIJ)) {
                                LJIILLIIL = LIZ(split3[0].substring(split3[0].indexOf("(") + 1, split3[0].indexOf(")")));
                            } else {
                                LJIILLIIL = LIZ(split3[0]);
                            }
                        }
                    }
                } catch (Throwable unused2) {
                }
                int LJFF4 = LJFF(LJIIIIZZ, LJFF3 + 1, "backtrace:");
                if (LJFF4 < 0) {
                    PK8.LIZJ(file);
                    return;
                }
                int i3 = LJFF4 + 1;
                while (i3 < LJIIIIZZ.length()) {
                    String optString2 = LJIIIIZZ.optString(i3, null);
                    if (!optString2.startsWith("    #")) {
                        break;
                    }
                    sb.append(optString2.trim());
                    sb.append('\n');
                    i3++;
                }
                String sb2 = sb.toString();
                int LJFF5 = LJFF(LJIIIIZZ, i3, "build id:");
                if (LJFF5 > 0) {
                    JSONArray jSONArray = new JSONArray();
                    for (int i4 = LJFF5 + 1; i4 < LJIIIIZZ.length(); i4++) {
                        String optString3 = LJIIIIZZ.optString(i4, null);
                        if (optString3.startsWith("    /")) {
                            String[] split4 = optString3.trim().split("\\s");
                            if (split4.length >= 3) {
                                String str5 = split4[0];
                                jSONArray.put(new JSONObject().put("lib_name", str5.substring(str5.lastIndexOf(47) + 1)).put("lib_uuid", LIZIZ(split4[split4.length - 1].substring(0, split4[split4.length - 1].length() - 1))));
                            }
                        }
                    }
                    pkn.LJIIJJI("crash_lib_uuid", jSONArray);
                }
                pkn.LJIIJJI("data", sb.toString());
                Header LIZLLL = Header.LIZLLL();
                try {
                    LIZLLL.LIZ.put("aid", 4444);
                } catch (JSONException unused3) {
                }
                pkn.LJIIZILJ(LIZLLL);
                pkn.LJIIJJI("is_native_crash", 1);
                pkn.LJIIJJI("crash_time", Long.valueOf(System.currentTimeMillis()));
                pkn.LJFF("native_oom_app", PK0.LIZ.getPackageName());
                String str6 = "true";
                pkn.LJFF("has_native_oom", "true");
                if (LJIILL != null && LJIILLIIL != null) {
                    if ("SI_LARGE_MEM".equals(LJIJ)) {
                        pkn.LJFF("native_large_mem", LJIILL);
                    } else {
                        pkn.LJFF("native_oom_lib", LJIILL);
                    }
                    pkn.LJFF("native_oom_size", LJIILLIIL);
                    LJIILJJIL = true;
                }
                try {
                    pkn.LJFF("native_oom_lib", LJIILL);
                    pkn.LJFF("native_oom_size", LJIILLIIL);
                    pkn.LJFF("is_64_devices", String.valueOf(Header.LJIIIIZZ()));
                    pkn.LJFF("is_x86_devices", String.valueOf(Header.LJIIIZ()));
                    pkn.LJFF("native_oom_sigcode", LJIJ);
                    try {
                        FPX.LIZIZ(new BufferedWriter(new FileWriter(new File(file, "tombstone.txt").getAbsolutePath(), true)));
                    } catch (IOException e) {
                        C16880lQ.LLLLIIL(e);
                    }
                    LJII(pkn, file);
                } catch (Throwable unused4) {
                }
                if (sb2 != null && str != null) {
                    try {
                        String str7 = LJIILLIIL;
                        if (str7 != null && LJIILL != null) {
                            C64246PJi LJJII = C64246PJi.LJJII(null, sb2, str7, str, "1");
                            LJJII.LJFF("native_oom_size", LJIILLIIL);
                            LJJII.LJFF("native_oom_lib", LJIILL);
                            LJJII.LJFF("native_oom_sigcode", LJIJ);
                            if (!LJIILJJIL) {
                                str6 = "false";
                            }
                            LJJII.LJFF("has_native_oom", str6);
                            LJJII.LJFF("is_64_devices", String.valueOf(Header.LJIIIIZZ()));
                            LJJII.LJFF("is_x86_devices", String.valueOf(Header.LJIIIZ()));
                            C64241PJd.LJI(LJJII, PJV.LIZIZ, System.currentTimeMillis(), file);
                        }
                    } catch (Throwable unused5) {
                        PK8.LIZJ(file);
                        return;
                    }
                }
                if (C63986P9i.LJIIIZ(PK0.LJIIIIZZ.getNativeCrashUploadUrl(), pkn.LIZ.toString(), file, null).LIZ()) {
                    PK8.LIZJ(file);
                }
            } catch (IOException unused6) {
                PK8.LIZJ(file);
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static void LJII(PKN pkn, File file) {
        BufferedReader bufferedReader;
        File file2 = new File(file, "logcat.txt");
        if (!file2.exists()) {
            return;
        }
        JSONArray jSONArray = new JSONArray();
        try {
            bufferedReader = new BufferedReader(new FileReader(file2));
            try {
                if (file2.length() > 512000) {
                    bufferedReader.skip(file2.length() - 512000);
                }
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    } else {
                        jSONArray.put(readLine);
                    }
                }
            } catch (Throwable th) {
                th = th;
                try {
                    PJZ.LIZ.getClass();
                    PJY.LIZ("NPTH_CATCH", th);
                    FPX.LIZIZ(bufferedReader);
                    pkn.LJIIJJI("logcat", jSONArray);
                } catch (Throwable th2) {
                    FPX.LIZIZ(bufferedReader);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            th = th3;
            bufferedReader = null;
        }
        FPX.LIZIZ(bufferedReader);
        pkn.LJIIJJI("logcat", jSONArray);
    }

    public static int LJFF(JSONArray jSONArray, int i, String str) {
        while (i < jSONArray.length()) {
            String optString = jSONArray.optString(i, null);
            if (optString != null && optString.startsWith(str)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public NativeHeapTracker(JSONArray jSONArray, String str, File file, Context context) {
        if (jSONArray != null && jSONArray.length() > 0) {
            this.LJ = jSONArray.optInt(0);
            this.LIZJ = jSONArray.optInt(1);
            this.LIZLLL = jSONArray.optInt(2);
            this.LJIIIIZZ = jSONArray.optBoolean(3);
            this.LJIIIZ = jSONArray.optBoolean(4);
            LJIIJJI = jSONArray.optInt(5);
            LJIIL = jSONArray.optInt(6);
        } else {
            this.LIZJ = 30;
            this.LIZLLL = 150;
            this.LJ = 1;
            this.LJIIIIZZ = false;
            this.LJIIIZ = true;
            LJIIJJI = 2;
            LJIIL = 1;
        }
        this.LIZ = 0;
        this.LIZIZ = false;
        LJIILJJIL = false;
        this.LJIIJ = context;
        this.LJFF = file;
        this.LJI = a1.LJ("/", str, ".guard");
    }
}
