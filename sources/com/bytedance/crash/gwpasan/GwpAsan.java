package com.bytedance.crash.gwpasan;

import X.C63986P9i;
import X.C78685UuP;
import X.PJ5;
import X.PJA;
import X.PJC;
import X.PJY;
import X.PJZ;
import X.PK0;
import X.PK8;
import X.PKN;
import X.X1D;
import android.content.Context;
import com.bytedance.android.livesdk.livesetting.performance.LivePlayEnforceIntervalSetting;
import com.bytedance.crash.entity.Header;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.io.File;
import java.io.IOException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class GwpAsan {
    public static JSONArray LIZIZ;
    public static String LIZJ;
    public static String LIZLLL;
    public static String LJ;
    public static String LJFF;
    public static String[] LJI;
    public static boolean LJII;
    public static boolean LJIIIIZZ;
    public static boolean LJIIIZ;
    public static boolean LJIIJ;
    public static boolean LJIIJJI;
    public static File LJIIL;
    public static Context LJIILIIL;
    public static File LJIILJJIL;
    public boolean LIZ;

    public static native int gwpAsanNativeInit(int i, String[] strArr);

    public static boolean LIZ(boolean z) {
        try {
            String[] strArr = new String[8];
            LJI = strArr;
            if (LIZIZ == null) {
                if (LJII) {
                    if (z) {
                        strArr[0] = CardStruct.IStatusCode.DEFAULT;
                        strArr[1] = "8192";
                        strArr[2] = "150";
                        strArr[3] = CardStruct.IStatusCode.DEFAULT;
                        strArr[4] = CardStruct.IStatusCode.DEFAULT;
                    } else {
                        strArr[0] = CardStruct.IStatusCode.DEFAULT;
                        strArr[1] = "64";
                        strArr[2] = "5000";
                        strArr[3] = CardStruct.IStatusCode.DEFAULT;
                        strArr[4] = "1";
                    }
                    C78685UuP.LJJJLZIJ();
                    return true;
                }
                Thread.sleep(LivePlayEnforceIntervalSetting.DEFAULT);
                LIZIZ = PJC.LIZJ(PJA.LJI(), "custom_event_settings", "npth_simple_setting", "gwp_asan_set_init_param");
                C78685UuP.LJJJLZIJ();
            }
            JSONArray jSONArray = LIZIZ;
            if (jSONArray != null && jSONArray.length() > 0) {
                if (!z) {
                    for (int i = 0; i < LIZIZ.length(); i++) {
                        LJI[i] = LIZIZ.optString(i);
                    }
                } else {
                    LJI[0] = LIZIZ.optString(0);
                    String[] strArr2 = LJI;
                    strArr2[1] = "8192";
                    strArr2[2] = "150";
                    strArr2[3] = LIZIZ.optString(3);
                    LJI[4] = CardStruct.IStatusCode.DEFAULT;
                }
                C78685UuP.LJJJLZIJ();
                return true;
            }
        } catch (Throwable th) {
            PJZ.LIZ.getClass();
            PJY.LIZ("NPTH_CATCH", th);
        }
        return false;
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

    public static String LIZLLL(String str) {
        int indexOf = str.indexOf("==/lib/");
        int indexOf2 = str.indexOf(".so");
        if (indexOf < 0 || indexOf2 < 0) {
            return "null";
        }
        return str.substring(indexOf, indexOf2).substring(7);
    }

    public static boolean LIZJ(File file, String str) {
        for (File file2 : file.listFiles()) {
            try {
                if (!file2.getName().isEmpty() && !file2.isDirectory() && file2.getName().equals(str) && file2.length() >= 0) {
                    LJIILJJIL = file2.getAbsoluteFile();
                    return true;
                }
            } catch (Throwable th) {
                PJZ.LIZ.getClass();
                PJY.LIZ("NPTH_CATCH", th);
            }
        }
        return false;
    }

    public static void LJFF(File file, String str) {
        String str2;
        File file2 = new File(file, "tombstone.txt");
        PKN pkn = new PKN();
        try {
            JSONArray LJIIIIZZ2 = PK8.LJIIIIZZ(file2.getAbsolutePath());
            if (LJIIIIZZ2 == null) {
                PK8.LIZJ(file);
                return;
            }
            int LJ2 = LJ(LJIIIIZZ2, 0, "pid:");
            if (LJ2 < 0) {
                PK8.LIZJ(file);
                return;
            }
            String[] split = LJIIIIZZ2.optString(LJ2, null).trim().split("\\s");
            for (int i = 0; i < split.length; i++) {
                String str3 = split[i];
                if ("pid:".equals(str3)) {
                    pkn.LJIIJJI("pid", Long.decode(split[i + 1].substring(0, r15.length() - 1)));
                } else if ("tid:".equals(str3)) {
                    String str4 = split[i + 1];
                    pkn.LJIIJJI("tid", Long.decode(str4.substring(0, str4.length() - 1)));
                } else if ("name:".equals(str3)) {
                    int i2 = i + 1;
                    pkn.LJIIJJI("crash_thread_name", split[i2].substring(0, r15.length() - 1));
                    String str5 = split[i2];
                    str5.substring(0, str5.length() - 1);
                }
            }
            pkn.LJIIJJI("process_name", split[split.length - 2]);
            StringBuilder sb = new StringBuilder();
            int LJ3 = LJ(LJIIIIZZ2, LJ2 + 1, "Signal ");
            if (LJ3 < 0) {
                PK8.LIZJ(file);
                return;
            }
            sb.append(LJIIIIZZ2.optString(LJ3, null));
            char c = '\n';
            sb.append('\n');
            int LJ4 = LJ(LJIIIIZZ2, LJ3 + 1, "GWP-ASan message:");
            if (LJ4 < 0) {
                PK8.LIZJ(file);
                return;
            }
            String replace = LJIIIIZZ2.optString(LJ4, null).replace("GWP-ASan message:", "abort message:");
            sb.append(replace);
            sb.append('\n');
            if (!replace.contains("Use After Free")) {
                if (replace.contains("Double Free")) {
                    LIZJ = "Double Free";
                } else if (replace.contains("Buffer Overflow")) {
                    LIZJ = "Buffer Overflow";
                } else if (replace.contains("Buffer Underflow")) {
                    LIZJ = "Buffer Underflow";
                } else if (replace.contains("Invalid Free")) {
                    LIZJ = "Invalid Free";
                } else {
                    LIZJ = "Unknown";
                }
            } else {
                LIZJ = "Use After Free";
            }
            pkn.LJFF("gwp_asan_type", LIZJ);
            int LJ5 = LJ(LJIIIIZZ2, LJ4 + 1, "backtrace:");
            if (LJ5 < 0) {
                PK8.LIZJ(file);
                return;
            }
            String str6 = "    #00";
            int i3 = LJ5 + 1;
            while (i3 < LJIIIIZZ2.length()) {
                String optString = LJIIIIZZ2.optString(i3, null);
                if (!optString.startsWith("    #")) {
                    break;
                }
                sb.append(optString.trim());
                sb.append(c);
                if ("Double Free".equals(LIZJ)) {
                    str6 = "    #03";
                }
                if (!optString.endsWith("libc.so") && !optString.endsWith("libc++_shared.so")) {
                    if (optString.startsWith(str6)) {
                        String str7 = LIZLLL(optString).trim().split("/")[1];
                        String substring = str7.substring(str7.lastIndexOf(47) + 1);
                        LIZLLL = substring;
                        if (substring.length() >= 1 && !LIZLLL.isEmpty()) {
                            pkn.LJFF("gwp_asan_fatal_lib", LIZLLL);
                        }
                    }
                } else if (optString.startsWith("    #01")) {
                    String str8 = LIZLLL(optString).trim().split("/")[1];
                    String substring2 = str8.substring(str8.lastIndexOf(47) + 1);
                    LIZLLL = substring2;
                    if (!substring2.isEmpty()) {
                        pkn.LJFF("gwp_asan_fatal_lib", LIZLLL);
                    }
                }
                if (str != null) {
                    if (optString.contains(str) || "all".equals(str)) {
                        LJIIJJI = true;
                    }
                } else if (optString.contains("data")) {
                    LJIIJJI = true;
                }
                i3++;
                c = '\n';
            }
            int LJ6 = LJ(LJIIIIZZ2, i3, "deallocated by thread") + 1;
            while (true) {
                if (LJ6 >= LJIIIIZZ2.length()) {
                    break;
                }
                String optString2 = LJIIIIZZ2.optString(LJ6, null);
                if ((optString2.startsWith("    #01") || optString2.startsWith("    #02")) && !optString2.endsWith("libnpth_xasan.so") && !optString2.endsWith("libc++_shared.so")) {
                    String str9 = LIZLLL(optString2).trim().split("/")[1];
                    String substring3 = str9.substring(str9.lastIndexOf(47) + 1);
                    LJ = substring3;
                    if (substring3.length() >= 1 && !LJ.isEmpty()) {
                        pkn.LJFF("gwp_asan_deallocated_lib", LJ);
                        break;
                    }
                }
                LJ6++;
            }
            int LJ7 = LJ(LJIIIIZZ2, LJ6, "allocated by thread") + 1;
            while (true) {
                if (LJ7 >= LJIIIIZZ2.length()) {
                    break;
                }
                String optString3 = LJIIIIZZ2.optString(LJ7, null);
                if ((optString3.startsWith("    #01") || optString3.startsWith("    #02")) && !optString3.endsWith("libnpth_xasan.so") && !optString3.endsWith("libc++_shared.so")) {
                    String str10 = LIZLLL(optString3).trim().split("/")[1];
                    String substring4 = str10.substring(str10.lastIndexOf(47) + 1);
                    LJFF = substring4;
                    if (substring4.length() >= 1 && !LJFF.isEmpty()) {
                        pkn.LJFF("gwp_asan_allocated_lib", LJFF);
                        break;
                    }
                }
                LJ7++;
            }
            int LJ8 = LJ(LJIIIIZZ2, LJ7, "build id:");
            if (LJ8 > 0) {
                JSONArray jSONArray = new JSONArray();
                for (int i4 = LJ8 + 1; i4 < LJIIIIZZ2.length(); i4++) {
                    String optString4 = LJIIIIZZ2.optString(i4, null);
                    if (optString4.startsWith("    /")) {
                        String[] split2 = optString4.trim().split("\\s");
                        if (split2.length >= 3) {
                            String str11 = split2[0];
                            jSONArray.put(new JSONObject().put("lib_name", str11.substring(str11.lastIndexOf(47) + 1)).put("lib_uuid", LIZIZ(split2[split2.length - 1].substring(0, split2[split2.length - 1].length() - 1))));
                        }
                    }
                }
                pkn.LJIIJJI("crash_lib_uuid", jSONArray);
            }
            pkn.LJIIJJI("data", sb.toString());
            try {
                if (LJIILIIL == null) {
                    LJIILIIL = PK0.LIZ;
                }
                Header LIZLLL2 = Header.LIZLLL();
                try {
                    LIZLLL2.LIZ.put("aid", 1314);
                } catch (JSONException e) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("upload KEY_AID JSONException:");
                    LIZ.append(e);
                    X1D.LIZIZ(LIZ);
                    C78685UuP.LJJJLZIJ();
                }
                pkn.LJIIZILJ(LIZLLL2);
                pkn.LJIIJJI("is_native_crash", 1);
                pkn.LJIIJJI("crash_time", Long.valueOf(System.currentTimeMillis()));
                pkn.LJFF("gwp_asan_app", LJIILIIL.getPackageName());
                if (LJIIJJI) {
                    LJIIJ = true;
                    try {
                        if (C63986P9i.LJIIIZ(PK0.LJIIIIZZ.getNativeCrashUploadUrl(), pkn.LIZ.toString(), file, null).LIZ()) {
                            if (LJIIJ) {
                                str2 = "true";
                            } else {
                                str2 = "false";
                            }
                            pkn.LJFF("has_gwp_asan", str2);
                            PJ5.LIZIZ();
                            PK8.LIZJ(file);
                        }
                    } catch (Throwable th) {
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("upload exception:");
                        LIZ2.append(th);
                        X1D.LIZIZ(LIZ2);
                        C78685UuP.LJJJLZIJ();
                        PK8.LIZJ(file);
                    }
                }
            } catch (Throwable th2) {
                th2.toString();
                C78685UuP.LJJJLZIJ();
                PK8.LIZJ(file);
            }
        } catch (IOException e2) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("upload IOException :");
            LIZ3.append(e2);
            X1D.LIZIZ(LIZ3);
            C78685UuP.LJJJLZIJ();
            PK8.LIZJ(file);
        } catch (Throwable th3) {
            PJZ.LIZ.getClass();
            PJY.LIZ("NPTH_CATCH", th3);
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append("upload Throwable:");
            LIZ4.append(th3);
            X1D.LIZIZ(LIZ4);
            C78685UuP.LJJJLZIJ();
            PK8.LIZJ(file);
        }
    }

    public static int LJ(JSONArray jSONArray, int i, String str) {
        while (i < jSONArray.length()) {
            String optString = jSONArray.optString(i, null);
            if (optString != null && optString.startsWith(str)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public GwpAsan(boolean z, Context context, File file, JSONArray jSONArray) {
        context = context == null ? PK0.LIZ : context;
        LJII = z;
        LJIILIIL = context;
        LJIIL = file;
        LIZIZ = jSONArray;
        LJIIJ = false;
        LJIIJJI = false;
    }
}
