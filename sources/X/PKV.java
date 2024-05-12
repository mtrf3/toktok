package X;

import android.content.Context;
import android.os.Build;
import com.bytedance.android.livesdk.livesetting.gift.LiveExchangeConfirmThreshold;
import com.bytedance.android.livesdk.livesetting.performance.LiveGiftNewGifterBadgeSetting;
import com.bytedance.crash.entity.Header;
import com.bytedance.crash.nativecrash.NativeImpl;
import com.bytedance.crash.util.NativeTools;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class PKV {
    public static int LIZ = 33280;
    public static int LIZIZ = 25600;
    public static int LIZJ = 256;
    public static volatile boolean LIZLLL;

    public static void LIZLLL() {
        File[] listFiles;
        File file = new File(C78596Usy.LJJIIJ(PK0.LIZ), "npth/RefDetector");
        String absolutePath = new File(new File(C78596Usy.LJJIIJ(PK0.LIZ), "npth/RefDetector"), PK0.LIZJ()).getAbsolutePath();
        if (!file.exists() || (listFiles = file.listFiles()) == null) {
            return;
        }
        for (File file2 : listFiles) {
            if (!absolutePath.equals(file2.getAbsolutePath())) {
                File file3 = new File(file2, "ref_table.txt");
                try {
                    C64246PJi LJJII = C64246PJi.LJJII(null, "#00 pc 000351f3  /system/lib/libnpth_ref_monitor.so ", "", "npth_ref_monitor", "1");
                    JSONObject LJII = LJJII.LJII();
                    PLL LIZJ2 = LIZJ(LJII, file3);
                    if (LIZJ2 != null) {
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("#00 pc 000351f3  /system/lib/libnpth_ref_monitor.so ");
                        LIZ2.append(LIZJ2.LIZJ);
                        LIZ2.append("\n");
                        String LIZIZ2 = X1D.LIZIZ(LIZ2);
                        StringBuilder LIZ3 = X1D.LIZ();
                        LIZ3.append("abort message: ref leak type is ");
                        LIZ3.append(LIZJ2.LIZJ);
                        LIZ3.append("\n");
                        String LIZIZ3 = X1D.LIZIZ(LIZ3);
                        StringBuilder LIZ4 = X1D.LIZ();
                        LIZ4.append("Signal 6(SIGABRT), Code -12(SI_REF_LEAK)\n");
                        LIZ4.append(LIZIZ3);
                        LIZ4.append(LIZIZ2);
                        LIZ4.append("\n");
                        String LIZIZ4 = X1D.LIZIZ(LIZ4);
                        StringBuilder LIZ5 = X1D.LIZ();
                        LIZ5.append("pid: 1234, tid: 1234, ThreadName: npth_ref_monitor  >>> com.example.crash.test <<<\n");
                        LIZ5.append("Signal 6(SIGABRT), Code -12(SI_REF_LEAK)\n");
                        LIZ5.append(LIZIZ3);
                        LIZ5.append("backtrace: \n    ");
                        LIZ5.append(LIZIZ2);
                        String LIZIZ5 = X1D.LIZIZ(LIZ5);
                        LJII.put("java_data", LIZJ2.LIZLLL);
                        LJII.put("stack", LIZIZ4);
                        LJII.put("message", LIZIZ3);
                        File file4 = new File(file2, "tombstone.txt");
                        try {
                            if (!file4.exists()) {
                                file4.createNewFile();
                            }
                            PK8.LJIILJJIL(file4, LIZIZ5, false);
                        } catch (Throwable unused) {
                        }
                    }
                    LJJII.LJFF("is_64_devices", String.valueOf(Header.LJIIIIZZ()));
                    LJJII.LJFF("is_64_runtime", String.valueOf(NativeTools.LJIILJJIL().LJJIIZ()));
                    LJJII.LJFF("is_x86_devices", String.valueOf(Header.LJIIIZ()));
                    C64241PJd.LJI(LJJII, PJV.LIZIZ, System.currentTimeMillis(), file2);
                    C78685UuP.LJIJJLI();
                } catch (Throwable unused2) {
                }
                PK8.LIZJ(file2);
            }
        }
    }

    public static String LIZIZ(int i) {
        if (i <= 100) {
            return "[0, 100]";
        }
        if (i <= 200) {
            return "(100, 200]";
        }
        if (i <= 500) {
            return "(200, 500]";
        }
        if (i <= 1000) {
            return "(500, 1000]";
        }
        if (i <= 5000) {
            return "(1000, 5000]";
        }
        if (i <= 10000) {
            return "(5000, 10000]";
        }
        int i2 = i / 10000;
        StringBuilder LJ = C7MY.LJ("(", i2, "0000, ");
        LJ.append(i2 + 1);
        LJ.append("0000]");
        return X1D.LIZIZ(LJ);
    }

    public static synchronized void LIZ(JSONArray jSONArray, int i) {
        int i2 = i;
        synchronized (PKV.class) {
            if (LIZLLL) {
                C78685UuP.LJIJJLI();
                return;
            }
            LIZLLL = true;
            Context context = PK0.LIZ;
            File file = new File(new File(C78596Usy.LJJIIJ(context), "npth/RefDetector"), PK0.LIZJ());
            if (!file.exists()) {
                file.mkdirs();
            }
            if (jSONArray == null) {
                i2 = PJA.LJIIIIZZ(0, "custom_event_settings", "npth_simple_setting", "ref_monitor_type");
                jSONArray = PJC.LIZJ(PJA.LJI(), "custom_event_settings", "npth_simple_setting", "ref_monitor_limits");
            }
            if (jSONArray != null) {
                try {
                    if (jSONArray.length() == 3) {
                        LIZ = JSONArrayProtectorUtils.getInt(jSONArray, 0);
                        LIZIZ = JSONArrayProtectorUtils.getInt(jSONArray, 1);
                        LIZJ = JSONArrayProtectorUtils.getInt(jSONArray, 2);
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("RefLeakDetector:  start monitor reference, monitorType: ");
                        LIZ2.append(i2);
                        LIZ2.append(" limit: ");
                        LIZ2.append(jSONArray);
                        X1D.LIZIZ(LIZ2);
                        C78685UuP.LJIJJLI();
                    }
                } catch (Throwable unused) {
                }
            }
            NativeImpl.LJIJI(Build.VERSION.SDK_INT, i2, file.getAbsolutePath(), LIZ, LIZIZ, LIZJ);
        }
    }

    public static PLL LIZJ(JSONObject jSONObject, File file) {
        BufferedReader bufferedReader;
        String sb;
        String str;
        int i;
        BufferedReader bufferedReader2 = null;
        PLL pll = null;
        if (!file.exists()) {
            return null;
        }
        PKN.LJIILIIL(Boolean.TRUE, "filters", "has_ref_leak_log", jSONObject);
        ArrayList arrayList = new ArrayList();
        PLL pll2 = new PLL("Total", 0, -1);
        try {
            bufferedReader = new BufferedReader(new FileReader(file));
            int i2 = 0;
            while (true) {
                try {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    if (readLine.length() > 1) {
                        int length = readLine.length();
                        char charAt = readLine.charAt(0);
                        if (charAt == '-') {
                            if (i2 == 0) {
                                while (i2 < length && readLine.charAt(i2) == '-') {
                                    i2++;
                                }
                            }
                            if (i2 * 2 < length) {
                                String[] split = readLine.substring(i2, length - i2).split(",");
                                if (split.length == 2) {
                                    pll = new PLL(split[0].split(":")[1], Integer.parseInt(split[1].split("=")[1]), arrayList.size());
                                    arrayList.add(pll);
                                }
                            }
                        } else if (pll == null) {
                            continue;
                        } else if (charAt != ' ') {
                            if (pll.LIZLLL == null && readLine.startsWith("dump class")) {
                                String[] split2 = readLine.split("=");
                                if (split2.length != 0) {
                                    StringBuilder sb2 = new StringBuilder(split2[split2.length - 1].trim());
                                    while (true) {
                                        String readLine2 = bufferedReader.readLine();
                                        if (readLine2 == null || "".equals(readLine2)) {
                                            break;
                                        }
                                        sb2.append("\n");
                                        sb2.append(readLine2);
                                    }
                                    pll.LIZLLL = sb2.toString();
                                }
                            }
                        } else if (readLine.contains("Summary")) {
                            while (true) {
                                String readLine3 = bufferedReader.readLine();
                                if (readLine3 == null) {
                                    break;
                                }
                                if (readLine3.length() > 1) {
                                    String[] split3 = readLine3.split("\\s+");
                                    if (split3.length >= 4) {
                                        pll.LIZJ = split3[3];
                                        break;
                                    }
                                }
                            }
                            if (arrayList.size() >= 3) {
                                break;
                            }
                        } else {
                            continue;
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    bufferedReader2 = bufferedReader;
                    try {
                        PJZ.LIZ.getClass();
                        PJY.LIZ("NPTH_CATCH", th);
                        return pll2;
                    } finally {
                        if (bufferedReader2 != null) {
                            FPX.LIZIZ(bufferedReader2);
                        }
                    }
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
        if (arrayList.size() == 0) {
            FPX.LIZIZ(bufferedReader);
            return null;
        }
        StringBuilder sb3 = new StringBuilder();
        int i3 = 0;
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            PLL pll3 = (PLL) arrayList.get(i4);
            String str2 = pll3.LIZ;
            int i5 = pll3.LIZIZ;
            int i6 = pll3.LJ;
            if (i6 == 0) {
                i = LIZ;
            } else if (i6 != 1) {
                if (i6 != 2) {
                    i = LiveExchangeConfirmThreshold.DEFAULT;
                } else {
                    i = LIZJ;
                }
            } else {
                i = LIZIZ;
            }
            if (i5 >= i) {
                i3 |= 1 << i4;
                if (sb3.length() == 0 && pll3.LIZLLL != null) {
                    sb3.append("\n");
                    sb3.append(pll3.LIZLLL);
                }
            }
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(str2);
            LIZ2.append("_top_type");
            PKN.LJIILIIL(pll3.LIZJ, "filters", X1D.LIZIZ(LIZ2), jSONObject);
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append(str2);
            LIZ3.append("_range");
            PKN.LJIILIIL(LIZIZ(pll3.LIZIZ), "filters", X1D.LIZIZ(LIZ3), jSONObject);
        }
        StringBuilder sb4 = new StringBuilder();
        int i7 = 0;
        do {
            if (((1 << i7) & i3) != 0) {
                if (i7 != 0) {
                    if (i7 != 1) {
                        if (i7 != 2) {
                            str = "";
                        } else {
                            str = "local";
                        }
                    } else {
                        str = "weak";
                    }
                } else {
                    str = "global";
                }
                if (sb4.length() != 0) {
                    sb4.append(" & ");
                }
                sb4.append(str);
            }
            i7++;
        } while (i7 < 3);
        if (sb4.length() == 0) {
            sb = LiveGiftNewGifterBadgeSetting.DEFAULT;
        } else {
            sb = sb4.toString();
        }
        pll2.LIZLLL = sb3.toString();
        pll2.LIZJ = sb;
        PKN.LJIILIIL(sb, "filters", "ref_leak_type", jSONObject);
        FPX.LIZIZ(bufferedReader);
        return pll2;
    }
}
