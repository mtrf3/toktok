package X;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.gson.Gson;
import com.google.gson.j;
import java.util.HashMap;

/* renamed from: X.Ee3, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36903Ee3 {
    public static volatile C36903Ee3 LJFF;
    public SharedPreferences LIZ;
    public Integer LIZIZ = 0;
    public HashMap<String, Object> LIZJ = null;
    public final HashMap<String, Object> LIZLLL = new HashMap<>();
    public Context LJ = null;

    public static C36903Ee3 LIZJ() {
        if (LJFF == null) {
            synchronized (C36903Ee3.class) {
                if (LJFF == null) {
                    LJFF = new C36903Ee3();
                }
            }
        }
        return LJFF;
    }

    public final HashMap<String, Object> LJ() {
        SharedPreferences sharedPreferences = this.LIZ;
        if (sharedPreferences == null || !sharedPreferences.contains("vmsdk_settings")) {
            return null;
        }
        String string = this.LIZ.getString("vmsdk_settings", "");
        if (this.LIZ.contains("vmsdk_settings_time")) {
            this.LIZIZ = Integer.valueOf(this.LIZ.getInt("vmsdk_settings_time", 0));
        } else {
            this.LIZIZ = 0;
        }
        try {
            Gson gson = new Gson();
            j jVar = (j) gson.LJI(string, j.class);
            if (jVar != null) {
                return (HashMap) gson.LIZJ(jVar.LJIIZILJ(), HashMap.class);
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0074, code lost:
    
        if (r1 == null) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0048 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0049 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZ(java.lang.String r12) {
        /*
            r11 = this;
            java.lang.String r3 = ""
            boolean r0 = android.text.TextUtils.isEmpty(r12)
            r8 = 0
            if (r0 == 0) goto La
            return r8
        La:
            r10 = 0
            java.util.HashMap<java.lang.String, java.lang.Object> r0 = r11.LIZLLL     // Catch: java.lang.Throwable -> L39
            java.lang.Object r1 = r0.getOrDefault(r12, r10)     // Catch: java.lang.Throwable -> L39
            if (r1 != 0) goto L3a
            X.Ee4 r2 = new X.Ee4     // Catch: java.lang.Throwable -> L38
            java.lang.Class r0 = r3.getClass()     // Catch: java.lang.Throwable -> L38
            r2.<init>(r12, r0)     // Catch: java.lang.Throwable -> L38
            r9 = 1
            java.lang.String r4 = r2.LIZIZ     // Catch: java.lang.Throwable -> L38
            java.lang.reflect.Type r5 = r2.LIZJ     // Catch: java.lang.Throwable -> L38
            T r6 = r2.LIZLLL     // Catch: java.lang.Throwable -> L38
            boolean r7 = r2.LIZ     // Catch: java.lang.Throwable -> L38
            java.lang.Object r2 = X.C38686FGg.LIZJ(r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L38
            if (r2 == 0) goto L34
            java.util.HashMap<java.lang.String, java.lang.Object> r0 = r11.LIZLLL     // Catch: java.lang.Throwable -> L32
            r0.put(r12, r2)     // Catch: java.lang.Throwable -> L32
            r1 = r2
            goto L3a
        L32:
            r10 = r2
            goto L39
        L34:
            kotlin.jvm.internal.o.LJIIZILJ()     // Catch: java.lang.Throwable -> L38
            throw r10     // Catch: java.lang.Throwable -> L38
        L38:
            r10 = r1
        L39:
            r1 = r10
        L3a:
            java.lang.String r5 = "true"
            if (r1 == 0) goto L44
            boolean r0 = r1.equals(r3)
            if (r0 == 0) goto L76
        L44:
            java.util.HashMap<java.lang.String, java.lang.Object> r2 = r11.LIZJ
            if (r2 != 0) goto L49
            return r8
        L49:
            java.lang.String r0 = "vmsdk_common"
            java.lang.Object r0 = r2.get(r0)     // Catch: java.lang.Throwable -> L74
            java.util.Map r0 = (java.util.Map) r0     // Catch: java.lang.Throwable -> L74
            if (r0 == 0) goto L74
            java.lang.Object r4 = r0.get(r12)     // Catch: java.lang.Throwable -> L74
            if (r4 == 0) goto L74
            java.lang.String r2 = "all"
            java.lang.String r0 = r4.toString()     // Catch: java.lang.Throwable -> L74
            boolean r0 = r2.equalsIgnoreCase(r0)     // Catch: java.lang.Throwable -> L74
            if (r0 != 0) goto L6f
            java.lang.String r0 = r4.toString()     // Catch: java.lang.Throwable -> L74
            boolean r0 = r5.equalsIgnoreCase(r0)     // Catch: java.lang.Throwable -> L74
            if (r0 == 0) goto L72
        L6f:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L74
            goto L74
        L72:
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L74
        L74:
            if (r1 == 0) goto L7c
        L76:
            boolean r0 = r1.equals(r3)
            if (r0 == 0) goto L7d
        L7c:
            return r8
        L7d:
            java.lang.String r0 = r1.toString()
            boolean r0 = r5.equalsIgnoreCase(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C36903Ee3.LIZ(java.lang.String):boolean");
    }

    public final void LIZIZ(Context context) {
        synchronized (this) {
            if (context != null) {
                this.LJ = context;
                SharedPreferences sharedPreferences = this.LIZ;
                if (sharedPreferences == null) {
                    sharedPreferences = F9J.LIZIZ(context, 0, "vmsdk_settings_manager_sp");
                }
                this.LIZ = sharedPreferences;
            }
            this.LIZJ = LJ();
        }
    }

    public final void LIZLLL(Context context, Integer num, String str) {
        try {
            Gson gson = new Gson();
            j jVar = (j) gson.LJI(str, j.class);
            if (jVar != null) {
                this.LIZJ = (HashMap) gson.LIZJ(jVar.LJIIZILJ(), HashMap.class);
            }
        } catch (Throwable unused) {
        }
        if (this.LJ == null && context != null) {
            this.LJ = context;
        }
        if (this.LJ == null) {
            return;
        }
        synchronized (this) {
            this.LIZIZ = num;
            if (this.LIZ == null) {
                Context context2 = this.LJ;
                this.LJ = context2;
                this.LIZ = F9J.LIZIZ(context2, 0, "vmsdk_settings_manager_sp");
            }
            this.LIZ.edit().putString("vmsdk_settings", str).apply();
            this.LIZ.edit().putInt("vmsdk_settings_time", this.LIZIZ.intValue()).apply();
        }
    }
}
