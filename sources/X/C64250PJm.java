package X;

import android.content.Context;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.PJm, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64250PJm {
    public static C64250PJm LJII;
    public static boolean LJIIIIZZ;
    public final Context LIZ;
    public final HashMap<String, Long> LIZIZ;
    public int LIZJ = 50;
    public int LIZLLL = 100;
    public int LJ = 100;
    public int LJFF = 2;
    public int LJI = 5;

    public static C64250PJm LJI() {
        if (LJII == null) {
            LJII = new C64250PJm(PK0.LIZ);
        }
        return LJII;
    }

    public final void LJII() {
        this.LIZJ = PJA.LJIIIIZZ(this.LIZJ, "custom_event_settings", "npth_simple_setting", "crash_limit_issue");
        this.LIZLLL = PJA.LJIIIIZZ(this.LIZLLL, "custom_event_settings", "npth_simple_setting", "crash_limit_all");
        this.LJ = PJA.LJIIIIZZ(this.LJ, "custom_event_settings", "npth_simple_setting", "crash_limit_exception");
        this.LJI = PJA.LJIIIIZZ(this.LJI, "custom_event_settings", "npth_simple_setting", "crash_limit_exception_md5");
        this.LJFF = PJA.LJIIIIZZ(this.LJFF, "custom_event_settings", "npth_simple_setting", "crash_limit_exception_stack");
    }

    public final void LJIIIZ() {
        HashMap<String, Long> hashMap = this.LIZIZ;
        Long remove = hashMap.remove("time");
        if (remove == null) {
            PJY pjy = PJZ.LIZ;
            RuntimeException runtimeException = new RuntimeException("err times, no time");
            pjy.getClass();
            PJY.LIZ("NPTH_CATCH", runtimeException);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(remove);
        sb.append('\n');
        for (Map.Entry<String, Long> entry : hashMap.entrySet()) {
            sb.append(entry.getKey());
            sb.append(' ');
            sb.append(entry.getValue());
            sb.append('\n');
        }
        try {
            PK8.LJIILJJIL(C78596Usy.LJIILJJIL(this.LIZ), sb.toString(), false);
        } catch (IOException unused) {
        }
        hashMap.put("time", remove);
    }

    public C64250PJm(Context context) {
        this.LIZ = context;
        File LJIILJJIL = C78596Usy.LJIILJJIL(context);
        HashMap<String, Long> hashMap = new HashMap<>();
        hashMap.put("time", Long.valueOf(System.currentTimeMillis()));
        try {
            JSONArray LJIIIIZZ2 = PK8.LJIIIIZZ(LJIILJJIL.getAbsolutePath());
            if (!PJC.LJI(LJIIIIZZ2)) {
                Long decode = Long.decode(LJIIIIZZ2.optString(0, null));
                if (System.currentTimeMillis() - decode.longValue() > 86400000) {
                    LJFF(LJIILJJIL);
                } else {
                    hashMap.put("time", decode);
                    for (int i = 1; i < LJIIIIZZ2.length(); i++) {
                        String[] split = LJIIIIZZ2.optString(i, "").split(" ");
                        if (split.length == 2) {
                            hashMap.put(split[0], Long.decode(split[1]));
                        }
                    }
                }
            }
        } catch (IOException unused) {
        } catch (Throwable unused2) {
            PK8.LIZJ(LJIILJJIL);
        }
        this.LIZIZ = hashMap;
        LJII();
        C64251PJn c64251PJn = new C64251PJn(this);
        PJA.LIZ.add(c64251PJn);
        if (PJA.LIZIZ) {
            c64251PJn.LIZ();
            c64251PJn.LIZIZ();
        }
    }

    public static void LJ(boolean z) {
        if (!z && !LJIIIIZZ) {
            LJIIIIZZ = true;
            JSONObject jSONObject = new JSONObject();
            PJC.LJIIJ(jSONObject, "crash_type", "exception");
            PJD.LIZIZ("crash_limit_exceed", jSONObject, null);
        }
    }

    public static void LJIIIIZZ(File file) {
        try {
            if (!file.getName().contains("deleted")) {
                String parent = file.getParent();
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(file.getName());
                LIZ.append("deleted");
                file.renameTo(new File(parent, X1D.LIZIZ(LIZ)));
            }
            if (!new File(file, "deleted").exists()) {
                new File(file, "deleted").createNewFile();
            }
        } catch (Throwable unused) {
        }
    }

    public final boolean LIZIZ(String str) {
        if (LIZ(this.LIZJ, str, true) && LIZ(this.LIZJ, "all", true)) {
            return true;
        }
        return false;
    }

    public final void LJFF(File file) {
        File file2 = new File(C78596Usy.LJJIIJ(this.LIZ), "issueCrashTimes");
        file.renameTo(new File(file2, String.valueOf(System.currentTimeMillis())));
        String[] list = file2.list();
        if (list != null && list.length > 5) {
            Arrays.sort(list);
            C16880lQ.LLLZZIL(new File(file2, list[0]));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0019, code lost:
    
        if (r0 != false) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZJ(java.lang.String r5, java.lang.String r6) {
        /*
            r4 = this;
            int r0 = r4.LJFF
            long r0 = (long) r0
            r2 = 0
            boolean r0 = r4.LIZ(r0, r5, r2)
            LJ(r0)
            if (r0 == 0) goto L4a
            if (r6 == 0) goto L1b
            int r0 = r4.LJI
            long r0 = (long) r0
            boolean r0 = r4.LIZ(r0, r6, r2)
            LJ(r0)
            if (r0 == 0) goto L4a
        L1b:
            int r0 = r4.LJ
            long r0 = (long) r0
            java.lang.String r3 = "exception"
            boolean r0 = r4.LIZ(r0, r3, r2)
            LJ(r0)
            if (r0 == 0) goto L4a
            int r0 = r4.LJFF
            long r0 = (long) r0
            r2 = 1
            boolean r0 = r4.LIZ(r0, r5, r2)
            LJ(r0)
            if (r6 == 0) goto L40
            int r0 = r4.LJI
            long r0 = (long) r0
            boolean r0 = r4.LIZ(r0, r6, r2)
            LJ(r0)
        L40:
            int r0 = r4.LJ
            long r0 = (long) r0
            boolean r0 = r4.LIZ(r0, r3, r2)
            LJ(r0)
        L4a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64250PJm.LIZJ(java.lang.String, java.lang.String):boolean");
    }

    public final boolean LIZLLL(String str, String str2) {
        boolean LIZ = LIZ(this.LJFF, str, false);
        LJ(LIZ);
        if (!LIZ) {
            return false;
        }
        if (str2 != null) {
            boolean LIZ2 = LIZ(this.LJI, str2, false);
            LJ(LIZ2);
            if (!LIZ2) {
                return false;
            }
        }
        return true;
    }

    public final synchronized boolean LIZ(long j, String str, boolean z) {
        long j2;
        boolean z2;
        if (str == null) {
            str = "default";
        }
        HashMap<String, Long> hashMap = this.LIZIZ;
        if (z) {
            j2 = 1;
        } else {
            j2 = 0;
        }
        Long valueOf = Long.valueOf(j2);
        if (hashMap == null) {
            valueOf = -1L;
        } else {
            Long l = hashMap.get(str);
            if (l != null) {
                valueOf = Long.valueOf(valueOf.longValue() + l.longValue());
            }
            hashMap.put(str, valueOf);
        }
        if (valueOf.longValue() < j) {
            z2 = true;
        } else {
            z2 = false;
        }
        return z2;
    }
}
