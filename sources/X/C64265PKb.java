package X;

import android.text.TextUtils;
import android.util.Pair;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.PKb, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64265PKb {
    public static JSONArray LIZJ(File file, File file2) {
        List<String> list;
        String str;
        C64311PLv c64311PLv = new C64311PLv();
        try {
            JSONArray LJIIIIZZ = PK8.LJIIIIZZ(file.getAbsolutePath());
            if (LJIIIIZZ != null) {
                for (int i = 0; i < LJIIIIZZ.length(); i++) {
                    String optString = LJIIIIZZ.optString(i);
                    if (!TextUtils.isEmpty(optString) && optString.startsWith("[tid:0") && optString.endsWith("sigstack:0x0]")) {
                        int indexOf = optString.indexOf("[routine:0x");
                        int i2 = indexOf + 11;
                        int indexOf2 = optString.indexOf(93, i2);
                        if (indexOf > 0) {
                            str = optString.substring(i2, indexOf2);
                        } else {
                            str = "unknown addr";
                        }
                        c64311PLv.getList(str).add(optString);
                    }
                }
            }
        } catch (IOException unused) {
        } catch (Throwable th) {
            PJZ.LIZ.getClass();
            PJY.LIZ("NPTH_CATCH", th);
        }
        JSONArray jSONArray = new JSONArray();
        if (!c64311PLv.isEmpty()) {
            try {
                JSONArray LJIIIIZZ2 = PK8.LJIIIIZZ(file2.getAbsolutePath());
                if (LJIIIIZZ2 != null) {
                    for (int i3 = 0; i3 < LJIIIIZZ2.length(); i3++) {
                        String optString2 = LJIIIIZZ2.optString(i3);
                        if (!TextUtils.isEmpty(optString2)) {
                            String substring = optString2.substring(2, optString2.indexOf(":"));
                            if (c64311PLv.containsKey(substring) && (list = c64311PLv.get(substring)) != null) {
                                for (String str2 : list) {
                                    StringBuilder LIZ = X1D.LIZ();
                                    LIZ.append(str2);
                                    LIZ.append(" ");
                                    LIZ.append(optString2);
                                    jSONArray.put(X1D.LIZIZ(LIZ));
                                }
                                c64311PLv.remove(substring);
                            }
                        }
                    }
                    Iterator it = c64311PLv.values().iterator();
                    while (it.hasNext()) {
                        for (String str3 : (List) it.next()) {
                            StringBuilder LIZ2 = X1D.LIZ();
                            LIZ2.append(str3);
                            LIZ2.append("  0x000000:unknown");
                            jSONArray.put(X1D.LIZIZ(LIZ2));
                        }
                    }
                }
            } catch (IOException unused2) {
            } catch (Throwable th2) {
                PJZ.LIZ.getClass();
                PJY.LIZ("NPTH_CATCH", th2);
            }
        }
        return jSONArray;
    }

    public static Pair<Long, Long> LIZLLL(File file, StringBuffer stringBuffer) {
        BufferedReader bufferedReader;
        long j;
        long j2;
        if (!file.exists()) {
            if (stringBuffer != null) {
                stringBuffer.append("file is null");
            }
            return null;
        }
        long j3 = -1;
        try {
            bufferedReader = new BufferedReader(new FileReader(file));
            j = -1;
            j2 = -1;
            long j4 = -1;
            long j5 = -1;
            while (true) {
                try {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null || (j != j3 && j2 != j3)) {
                        break;
                    }
                    String[] split = readLine.split("\\s+");
                    if (split.length < 3) {
                        break;
                    }
                    if (j == j3) {
                        if ("MemTotal:".equals(split[0])) {
                            j = Long.parseLong(split[1].trim());
                            j3 = -1;
                        } else {
                            j3 = -1;
                        }
                    }
                    if (j2 == j3) {
                        if ("MemAvailable:".equals(split[0])) {
                            j2 = Long.parseLong(split[1].trim());
                        } else {
                            if ("MemFree:".equals(split[0])) {
                                j4 = Long.parseLong(split[1].trim());
                            } else if ("Cached:".equals(split[0])) {
                                j5 = Long.parseLong(split[1].trim());
                            }
                            if (j4 != -1 && j5 != -1) {
                                j2 = j4 + j5;
                            }
                        }
                    }
                    j3 = -1;
                } catch (Throwable th) {
                    th = th;
                    if (stringBuffer != null) {
                        try {
                            try {
                                stringBuffer.append(th.getMessage());
                            } finally {
                                if (bufferedReader != null) {
                                    FPX.LIZIZ(bufferedReader);
                                }
                            }
                        } catch (Throwable unused) {
                            return null;
                        }
                    }
                    PJZ.LIZ.getClass();
                    PJY.LIZ("NPTH_CATCH", th);
                }
            }
        } catch (Throwable th2) {
            th = th2;
            bufferedReader = null;
            j = -1;
            j2 = -1;
        }
        if (j == -1 && stringBuffer != null) {
            stringBuffer.append("mMemTotal=-1");
        }
        if (j2 == -1 && stringBuffer != null) {
            stringBuffer.append("mMemAvailable=-1");
        }
        return new Pair<>(Long.valueOf(j), Long.valueOf(j2));
    }

    public static void LIZ(JSONObject jSONObject, long j, long j2) {
        boolean z;
        if (j2 != -1 && j != -1) {
            if (j2 < 10240) {
                z = true;
            } else {
                z = false;
            }
            PKN.LJIILIIL(String.valueOf(z), "filters", "low_os_mem_available", jSONObject);
            LIZIZ("os_mem_available_range", j2, jSONObject);
            LIZIZ("os_mem_used_range", j - j2, jSONObject);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZIZ(java.lang.String r11, long r12, org.json.JSONObject r14) {
        /*
            r0 = 1048576(0x100000, double:5.180654E-318)
            long r6 = r12 / r0
            java.lang.String r3 = "M"
            java.lang.String r5 = "G"
            r9 = 0
            int r0 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r0 <= 0) goto L88
            r8 = r5
        L10:
            boolean r0 = r8.equals(r5)
            r1 = 1
            if (r0 != 0) goto L61
            boolean r0 = r8.equals(r3)
            if (r0 != 0) goto L6f
            r12 = 0
        L20:
            java.lang.StringBuilder r5 = X.X1D.LIZ()
            java.lang.String r4 = ""
            int r0 = (r12 > r9 ? 1 : (r12 == r9 ? 0 : -1))
            if (r0 == 0) goto L5f
            java.lang.StringBuilder r0 = X.X1D.LIZ()
            r0.append(r12)
            r0.append(r8)
            java.lang.String r0 = X.X1D.LIZIZ(r0)
        L38:
            r5.append(r0)
            java.lang.String r0 = " - "
            r5.append(r0)
            int r0 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r0 == 0) goto L52
            java.lang.StringBuilder r0 = X.X1D.LIZ()
            r0.append(r1)
            r0.append(r3)
            java.lang.String r4 = X.X1D.LIZIZ(r0)
        L52:
            r5.append(r4)
            java.lang.String r1 = X.X1D.LIZIZ(r5)
            java.lang.String r0 = "filters"
            X.PKN.LJIILIIL(r1, r0, r11, r14)
            return
        L5f:
            r0 = r4
            goto L38
        L61:
            r3 = 5
            int r0 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r0 >= 0) goto L6a
            long r1 = r1 + r6
        L68:
            r12 = r6
            goto L7d
        L6a:
            r6 = 5
            r1 = 0
            goto L68
        L6f:
            r3 = 204800(0x32000, double:1.011846E-318)
            long r12 = r12 / r3
            r6 = 200(0xc8, double:9.9E-322)
            long r12 = r12 * r6
            int r0 = (r12 > r9 ? 1 : (r12 == r9 ? 0 : -1))
            if (r0 != 0) goto L7f
            r12 = 1
        L7c:
            r1 = r6
        L7d:
            r3 = r8
            goto L20
        L7f:
            long r6 = r6 + r12
            r3 = 1000(0x3e8, double:4.94E-321)
            int r0 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r0 <= 0) goto L7c
            r3 = r5
            goto L20
        L88:
            r0 = 1024(0x400, double:5.06E-321)
            long r1 = r12 / r0
            int r0 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r0 <= 0) goto L93
            r8 = r3
            goto L10
        L93:
            java.lang.String r8 = "K"
            goto L10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64265PKb.LIZIZ(java.lang.String, long, org.json.JSONObject):void");
    }
}
