package X;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.entity.Header;
import com.bytedance.crash.util.NativeTools;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import java.io.File;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class PKM {
    public static Boolean LIZJ;
    public C64289PKz LIZ;
    public C39620Fgm LIZIZ;

    public static boolean LIZIZ() {
        Boolean bool = LIZJ;
        if (bool != null) {
            return bool.booleanValue();
        }
        String[] strArr = {"/data/local/su", "/data/local/bin/su", "/data/local/xbin/su", "/system/xbin/su", "/system/bin/su", "/system/bin/.ext/su", "/system/bin/failsafe/su", "/system/sd/xbin/su", "/system/usr/we-need-root/su", "/sbin/su", "/su/bin/su"};
        int i = 0;
        do {
            try {
                if (new File(strArr[i]).exists()) {
                    LIZJ = Boolean.TRUE;
                    return true;
                }
            } catch (Throwable th) {
                PJZ.LIZ.getClass();
                PJY.LIZ("NPTH_CATCH", th);
            }
            i++;
        } while (i < 11);
        LIZJ = Boolean.FALSE;
        return false;
    }

    public final String LIZLLL() {
        C64289PKz c64289PKz = this.LIZ;
        if (c64289PKz != null) {
            String LIZJ2 = c64289PKz.LIZ.LIZJ();
            if (LIZJ2 == null || LIZJ2.isEmpty()) {
                return (String) ((java.util.Map) this.LIZ.LIZIZ.LIZ).get("signal_line");
            }
            return LIZJ2;
        }
        return null;
    }

    public final boolean LJIILIIL() {
        return PK8.LIZJ(this.LIZ.LIZJ);
    }

    public static long LJ() {
        if (NativeTools.LJIILJJIL().LJJIIZ()) {
            return Long.MAX_VALUE;
        }
        if (Header.LJIIIIZZ()) {
            return 3891200L;
        }
        return 2867200L;
    }

    public PKM(Context context) {
    }

    public final void LIZ(JSONObject jSONObject) {
        Pair pair;
        PKX pkx = this.LIZ.LIZ;
        String str = pkx.LIZJ;
        String str2 = pkx.LJ;
        String str3 = pkx.LIZLLL;
        JSONArray optJSONArray = jSONObject.optJSONArray("native_log");
        if (optJSONArray == null) {
            pair = new Pair("unknown_err", "1");
        } else if (pkx.LJFF) {
            pair = new Pair("normal", "1");
        } else {
            int i = 0;
            while (true) {
                if (i >= optJSONArray.length()) {
                    break;
                }
                String optString = optJSONArray.optString(i);
                if (optString.endsWith(")") && optString.contains("[xcrash] child terminated by a signal")) {
                    String substring = optString.substring(optString.lastIndexOf(40) + 1, optString.length() - 1);
                    if (substring != null) {
                        pair = new Pair("xcrash_crash", substring);
                    }
                } else {
                    i++;
                }
            }
            if (PJC.LJIIIIZZ("[xcrash] enter", optJSONArray) && !PJC.LJIIIIZZ("[xcrash] exit", optJSONArray)) {
                pair = new Pair("xcrash_block", "1");
            } else {
                String[] split = str2.split("\n");
                int i2 = 0;
                for (String str4 : split) {
                    if (str4.trim().startsWith("#")) {
                        i2++;
                    }
                }
                if (i2 <= 1) {
                    pair = new Pair("backtrace_err", "1");
                } else if (str.contains("SIGABRT") && TextUtils.isEmpty(str3)) {
                    pair = new Pair("abort_nomsg", "1");
                } else {
                    pair = new Pair("normal", "1");
                }
            }
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put((String) pair.first, pair.second);
            jSONObject2.put("signal", str);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("native_crash_watch: ");
            LIZ.append((String) pair.first);
            X1D.LIZIZ(LIZ);
            C78685UuP.LJJJLL();
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        PKN.LJIILIIL(pair.first, "filters", "native_crash_watch", jSONObject);
        PKN.LJIILIIL(String.valueOf(pair.second), "filters", "native_crash_watch_value", jSONObject);
        PJD.LIZIZ("testEvent", jSONObject2, null);
    }

    public final void LIZJ(PKN pkn) {
        try {
            C64289PKz c64289PKz = this.LIZ;
            if (c64289PKz != null) {
                try {
                    PKX pkx = c64289PKz.LIZ;
                    String str = pkx.LIZIZ;
                    if (str != null && pkx.LJ != null && str.contains("XAsanTracker")) {
                        if (c64289PKz.LIZ.LJ.contains("libnpth_xasan")) {
                            File file = new File(C78596Usy.LJJIIJ(PK0.LIZ), "npth/configCrash/configFile");
                            File file2 = new File(C78596Usy.LJJIIJ(PK0.LIZ), "npth/configCrash/configInvalid");
                            pkn.LJIIJJI("config_crash", "gwp_asan");
                            file.renameTo(new File(C78596Usy.LJJIIJ(PK0.LIZ), "npth/configCrash/oldConfigFile"));
                            PK8.LJIIL(file);
                            PK8.LIZJ(file2);
                        }
                    }
                } catch (Throwable th) {
                    PJZ.LIZ.getClass();
                    PJY.LIZ("NPTH_CATCH", th);
                }
            }
        } catch (Throwable th2) {
            PJZ.LIZ.getClass();
            PJY.LIZ("NPTH_CATCH", th2);
        }
    }

    public final void LJFF(PKN pkn) {
        C39620Fgm c39620Fgm = this.LIZIZ;
        if (c39620Fgm == null) {
            return;
        }
        try {
            c39620Fgm.getClass();
            long j = this.LIZIZ.LIZIZ;
            if (j != 0) {
                pkn.LJIIJJI("crash_time", Long.valueOf(j));
            }
            String str = this.LIZIZ.LIZ;
            if (str == null) {
                pkn.LJIIJJI("data", "AsanReport is Null\n");
            } else {
                pkn.LJIIJJI("data", str);
            }
            pkn.LJIIJJI("crash_type", CrashType.ASAN.toString());
            pkn.LJIIJJI("commit_id", "1");
            pkn.LJIIJJI("jenkins_job_id", "1");
        } catch (Throwable th) {
            PJZ.LIZ.getClass();
            PJY.LIZ("NPTH_CATCH", th);
        }
    }

    public final void LJI(PKN pkn) {
        pkn.LJIIJJI("is_native_crash", 1);
        pkn.LJIIJJI("repack_time", Long.valueOf(System.currentTimeMillis()));
        pkn.LJIIJJI("crash_uuid", this.LIZ.LIZJ.getName());
        pkn.LJIIJJI("jiffy", Long.valueOf(PLY.LIZ()));
    }

    public final void LJII(PKN pkn) {
        boolean z;
        if (PK8.LJIIJJI(pkn, this.LIZ.LIZJ) != -1) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            PKN.LJIJJLI(pkn.LIZ, PIW.LIZ());
            pkn.LJFF("has_callback", "false");
        } else {
            pkn.LJFF("has_callback", "true");
        }
        if (pkn.LIZ.opt("storage") == null) {
            PKN.LJIJJLI(pkn.LIZ, PIW.LIZ());
        }
        Header header = new Header();
        header.LJI(pkn.LIZ.optJSONObject("header"));
        pkn.LJIIZILJ(header);
        Header.LIZ(header);
        PKN LIZIZ = Header.LIZIZ(pkn.LIZ.optLong("app_start_time", 0L), pkn.LIZ.optLong("crash_time", 0L), pkn.LIZ.optString("process_name"));
        if (PJC.LJII(header.LIZ)) {
            pkn.LJIJ(LIZIZ.LJIIIIZZ().LIZ);
        } else {
            PJC.LIZIZ(header.LIZ, LIZIZ.LJIIIIZZ().LIZ);
        }
        PJC.LIZIZ(pkn.LJII(), LIZIZ.LJII());
        if (header.LIZ.has("params_err")) {
            PKN.LJIILIIL(header.LIZ.optString("params_err"), "filters", "params_err", pkn.LIZ);
        }
        C78915Uy7.LJJIIJ(pkn, header, CrashType.NATIVE);
    }

    public final void LJIIIIZZ(PKN pkn) {
        java.util.Map map;
        C64289PKz c64289PKz = this.LIZ;
        if (c64289PKz != null && (map = (java.util.Map) c64289PKz.LIZIZ.LIZ) != null) {
            Object obj = map.get("process_name");
            if (obj != null) {
                pkn.LJIIJJI("process_name", obj);
            }
            String str = (String) map.get("start_time");
            if (str != null) {
                try {
                    pkn.LJIILL(Long.decode(str).longValue(), 0L);
                } catch (Throwable th) {
                    PJZ.LIZ.getClass();
                    PJY.LIZ("NPTH_CATCH", th);
                }
            }
            String str2 = (String) map.get("pid");
            if (str2 != null) {
                try {
                    pkn.LJIIJJI("pid", Long.decode(str2));
                } catch (Throwable th2) {
                    PJZ.LIZ.getClass();
                    PJY.LIZ("NPTH_CATCH", th2);
                }
            }
            String str3 = (String) map.get("start_pid");
            if (str3 != null) {
                try {
                    pkn.LJIIJJI("start_pid", Long.decode(str3));
                } catch (Throwable th3) {
                    PJZ.LIZ.getClass();
                    PJY.LIZ("NPTH_CATCH", th3);
                }
            }
            Object obj2 = map.get("crash_thread_name");
            if (obj2 != null) {
                pkn.LJIIJJI("crash_thread_name", obj2);
            }
            String str4 = (String) map.get("crash_time");
            if (str4 != null) {
                try {
                    pkn.LJIIJJI("crash_time", Long.decode(str4));
                } catch (Throwable th4) {
                    PJZ.LIZ.getClass();
                    PJY.LIZ("NPTH_CATCH", th4);
                }
            }
            pkn.LJIIJJI("data", LIZLLL());
        }
    }

    public final void LJIIIZ(PKN pkn) {
        C64254PJq.LIZ(pkn.LIZ);
        HashMap hashMap = new HashMap();
        if (LIZIZ()) {
            hashMap.put("is_root", "true");
            pkn.LJIIJJI("is_root", "true");
        } else {
            hashMap.put("is_root", "false");
            pkn.LJIIJJI("is_root", "false");
        }
        File[] listFiles = this.LIZ.LIZJ.listFiles();
        int length = listFiles.length;
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            File file = listFiles[i];
            try {
                if (!file.isDirectory() && file.getName().contains("asan_report")) {
                    hashMap.put("has_asan", "true");
                    if (this.LIZIZ != null) {
                        hashMap.put("has_asan_file", "true");
                    }
                }
            } catch (Throwable th) {
                PJZ.LIZ.getClass();
                PJY.LIZ("NPTH_CATCH", th);
                PK8.LIZJ(file);
            }
            i++;
        }
        JSONObject optJSONObject = pkn.LIZ.optJSONObject("header");
        String str = null;
        if (optJSONObject != null) {
            String optString = optJSONObject.optString("sdk_version_name", null);
            if (optString == null) {
                optString = "3.1.7-rc.51.oversea";
            }
            hashMap.put("sdk_version", optString);
        }
        if (pkn.LIZ.opt("java_data") != null) {
            z = true;
        }
        hashMap.put("has_java_stack", String.valueOf(z));
        pkn.LJFF("is_64_devices", String.valueOf(Header.LJIIIIZZ()));
        pkn.LJFF("is_64_runtime", String.valueOf(NativeTools.LJIILJJIL().LJJIIZ()));
        pkn.LJFF("is_x86_devices", String.valueOf(Header.LJIIIZ()));
        try {
            str = System.getProperty("os.version");
        } catch (Throwable unused) {
        }
        pkn.LJFF("kernel_version", str);
        pkn.LJFF("is_hm_os", String.valueOf(PC9.LIZIZ()));
        pkn.LJIILLIIL(hashMap);
        PK0.LJIIIZ.addPluginVersion(pkn.LIZ);
    }

    public final void LJIIJ(PKN pkn) {
        File file = new File(this.LIZ.LIZJ, "flog.txt");
        if (!file.exists()) {
            return;
        }
        try {
            String LJFF = PK8.LJFF(file.getAbsolutePath());
            JSONArray jSONArray = new JSONArray();
            if (LJFF != null) {
                for (String str : LJFF.split("\n")) {
                    jSONArray.put(str);
                }
            }
            pkn.LJIIJJI("native_log", jSONArray);
            for (int i = 0; i < jSONArray.length(); i++) {
                String string = JSONArrayProtectorUtils.getString(jSONArray, i);
                if (!string.equals("")) {
                    int indexOf = string.indexOf("allow_resume_cb:");
                    if (indexOf != -1) {
                        String[] split = string.substring(indexOf).split(" ");
                        if (split.length == 2) {
                            pkn.LJFF("allow_resume_cb", split[1]);
                            return;
                        }
                        return;
                    }
                } else {
                    return;
                }
            }
        } catch (Throwable th) {
            PJZ.LIZ.getClass();
            PJY.LIZ("NPTH_CATCH", th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b9 A[Catch: all -> 0x00bf, TRY_LEAVE, TryCatch #4 {all -> 0x00bf, blocks: (B:39:0x00b3, B:41:0x00b9), top: B:38:0x00b3 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x003b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIJJI(X.PKN r10) {
        /*
            r9 = this;
            java.lang.String r6 = "\n"
            X.PKz r0 = r9.LIZ
            java.io.File r2 = r0.LIZJ
            java.io.File r1 = new java.io.File
            java.lang.String r0 = "javastack.txt"
            r1.<init>(r2, r0)
            boolean r0 = r1.exists()
            java.lang.String r5 = ""
            java.lang.String r2 = "NPTH_CATCH"
            if (r0 == 0) goto L29
            java.lang.String r0 = r1.getAbsolutePath()     // Catch: java.lang.Throwable -> L20
            java.lang.String r4 = X.PKW.LIZLLL(r0)     // Catch: java.lang.Throwable -> L20
            goto L2a
        L20:
            r1 = move-exception
            X.PJY r0 = X.PJZ.LIZ
            r0.getClass()
            X.PJY.LIZ(r2, r1)
        L29:
            r4 = r5
        L2a:
            X.PKz r0 = r9.LIZ
            java.io.File r3 = r0.LIZJ
            java.io.File r1 = new java.io.File
            java.lang.String r0 = "abortmsg.txt"
            r1.<init>(r3, r0)
            boolean r0 = r1.exists()
            if (r0 == 0) goto Lb3
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L94
            java.io.FileReader r0 = new java.io.FileReader     // Catch: java.lang.Throwable -> L94
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L94
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L94
            java.lang.String r8 = r3.readLine()     // Catch: java.lang.Throwable -> L92
            if (r8 != 0) goto L4c
            goto L9e
        L4c:
            java.lang.String r0 = "[FATAL:"
            boolean r0 = r8.startsWith(r0)     // Catch: java.lang.Throwable -> L92
            if (r0 == 0) goto L9e
            java.lang.String r0 = "Please include Java exception stack in crash report ttwebview:"
            boolean r0 = r8.contains(r0)     // Catch: java.lang.Throwable -> L92
            if (r0 == 0) goto L9e
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L92
            r7.<init>()     // Catch: java.lang.Throwable -> L92
            java.lang.String r0 = " ttwebview:"
            int r1 = r8.indexOf(r0)     // Catch: java.lang.Throwable -> L92
            java.lang.String r0 = "Caused by: "
            r7.append(r0)     // Catch: java.lang.Throwable -> L92
            java.lang.String r0 = "Please include Java exception stack in crash report"
            r7.append(r0)     // Catch: java.lang.Throwable -> L92
            r7.append(r6)     // Catch: java.lang.Throwable -> L92
            int r0 = r1 + 11
            java.lang.String r0 = r8.substring(r0)     // Catch: java.lang.Throwable -> L92
            r7.append(r0)     // Catch: java.lang.Throwable -> L92
            r7.append(r6)     // Catch: java.lang.Throwable -> L92
        L80:
            java.lang.String r0 = r3.readLine()     // Catch: java.lang.Throwable -> L92
            if (r0 == 0) goto L8d
            r7.append(r0)     // Catch: java.lang.Throwable -> L92
            r7.append(r6)     // Catch: java.lang.Throwable -> L92
            goto L80
        L8d:
            java.lang.String r5 = r7.toString()     // Catch: java.lang.Throwable -> L92
            goto L9e
        L92:
            r1 = move-exception
            goto L96
        L94:
            r1 = move-exception
            r3 = 0
        L96:
            X.PJY r0 = X.PJZ.LIZ     // Catch: java.lang.Throwable -> Lae
            r0.getClass()     // Catch: java.lang.Throwable -> Lae
            X.PJY.LIZ(r2, r1)     // Catch: java.lang.Throwable -> Lae
        L9e:
            X.FPX.LIZIZ(r3)
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto Lac
            java.lang.String r4 = defpackage.a1.LJ(r4, r6, r5)
            goto Lb3
        Lac:
            r4 = r5
            goto Lb3
        Lae:
            r0 = move-exception
            X.FPX.LIZIZ(r3)
            throw r0
        Lb3:
            boolean r0 = r4.isEmpty()     // Catch: java.lang.Throwable -> Lbf
            if (r0 != 0) goto Lc8
            java.lang.String r0 = "java_data"
            r10.LJIIJJI(r0, r4)     // Catch: java.lang.Throwable -> Lbf
            goto Lc8
        Lbf:
            r1 = move-exception
            X.PJY r0 = X.PJZ.LIZ
            r0.getClass()
            X.PJY.LIZ(r2, r1)
        Lc8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.PKM.LJIIJJI(X.PKN):void");
    }

    public static void LJIIL(PKN pkn, java.util.Map map) {
        HashMap hashMap = (HashMap) map;
        if (hashMap.isEmpty()) {
            return;
        }
        JSONArray jSONArray = new JSONArray();
        for (Object obj : hashMap.keySet()) {
            String LIZLLL = NativeTools.LIZLLL((String) hashMap.get(obj));
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("lib_name", obj);
                jSONObject.put("lib_uuid", LIZLLL);
                jSONArray.put(jSONObject);
            } catch (JSONException e) {
                PJZ.LIZ.getClass();
                PJY.LIZ("NPTH_CATCH", e);
            }
        }
        pkn.LJIIJJI("crash_lib_uuid", jSONArray);
    }
}
