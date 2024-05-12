package X;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Ehm, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC37134Ehm {
    public static final /* synthetic */ int LJIILL = 0;
    public final String LIZ;
    public final String LIZIZ;
    public final boolean LIZJ;
    public InterfaceC37135Ehn LIZLLL;
    public final boolean LJ;
    public boolean LJFF;
    public F5R LJI;
    public F6E LJII;
    public int LJIIIIZZ;
    public F5Y LJIIIZ;
    public long LJIIJ;
    public long LJIIJJI;
    public long LJIIL;
    public long LJIILIIL;
    public final long LJIILJJIL;

    public abstract boolean LIZJ();

    public abstract boolean LIZLLL();

    public abstract void LJFF(java.util.Map<String, String> map);

    public final java.util.Map<String, String> LJ() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("task_type", String.valueOf(this.LJIIIIZZ));
        LJFF(linkedHashMap);
        return linkedHashMap;
    }

    public final int hashCode() {
        return this.LIZ.hashCode() + C79062V1e.LJ(this.LIZIZ, 527, 31);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(int r6) {
        /*
            r5 = this;
            long r1 = java.lang.System.currentTimeMillis()
            long r3 = r5.LJIILJJIL
            long r1 = r1 - r3
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: java.lang.Exception -> L25
            java.util.Map r0 = r5.LJ()     // Catch: java.lang.Exception -> L25
            r4.<init>(r0)     // Catch: java.lang.Exception -> L25
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Exception -> L25
            r3.<init>()     // Catch: java.lang.Exception -> L25
            java.lang.String r0 = "reason"
            r4.put(r0, r6)     // Catch: java.lang.Exception -> L25
            java.lang.String r0 = "duration"
            r3.put(r0, r1)     // Catch: java.lang.Exception -> L25
            java.lang.String r1 = "df_install_success"
            r0 = 0
            X.C09900aA.LJI(r1, r4, r3, r0)     // Catch: java.lang.Exception -> L25
        L25:
            int r1 = r5.LJIIIIZZ
            if (r1 == 0) goto L35
            r0 = 1
            if (r1 == r0) goto L30
            r0 = 2
            if (r1 == r0) goto L3b
        L2f:
            return
        L30:
            X.F5R r0 = r5.LJI
            boolean r0 = r0.LJIIJJI
            goto L39
        L35:
            X.F5R r0 = r5.LJI
            boolean r0 = r0.LJIIL
        L39:
            if (r0 == 0) goto L2f
        L3b:
            X.Ehn r1 = r5.LIZLLL
            if (r1 == 0) goto L2f
            java.lang.String r0 = r5.LIZIZ
            r1.LIZIZ(r0)
            goto L2f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC37134Ehm.LIZIZ(int):void");
    }

    public final void LJI(F5Y f5y) {
        o.LJIIIZ(f5y, "<set-?>");
        this.LJIIIZ = f5y;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof AbstractC37134Ehm) {
            AbstractC37134Ehm abstractC37134Ehm = (AbstractC37134Ehm) obj;
            if (o.LJ(this.LIZIZ, abstractC37134Ehm.LIZIZ) && o.LJ(this.LIZ, abstractC37134Ehm.LIZ)) {
                return true;
            }
            return false;
        }
        return super.equals(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(int r6, int r7) {
        /*
            r5 = this;
            long r1 = java.lang.System.currentTimeMillis()
            long r3 = r5.LJIILJJIL
            long r1 = r1 - r3
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: java.lang.Exception -> L25
            java.util.Map r0 = r5.LJ()     // Catch: java.lang.Exception -> L25
            r4.<init>(r0)     // Catch: java.lang.Exception -> L25
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Exception -> L25
            r3.<init>()     // Catch: java.lang.Exception -> L25
            java.lang.String r0 = "reason"
            r4.put(r0, r6)     // Catch: java.lang.Exception -> L25
            java.lang.String r0 = "duration"
            r3.put(r0, r1)     // Catch: java.lang.Exception -> L25
            java.lang.String r1 = "df_install_failed"
            r0 = 0
            X.C09900aA.LJI(r1, r4, r3, r0)     // Catch: java.lang.Exception -> L25
        L25:
            if (r7 == 0) goto L33
            r0 = 1
            if (r7 == r0) goto L2e
            r0 = 2
            if (r7 == r0) goto L39
        L2d:
            return
        L2e:
            X.F5R r0 = r5.LJI
            boolean r0 = r0.LJIIJJI
            goto L37
        L33:
            X.F5R r0 = r5.LJI
            boolean r0 = r0.LJIIL
        L37:
            if (r0 == 0) goto L2d
        L39:
            X.Ehn r1 = r5.LIZLLL
            if (r1 == 0) goto L2d
            java.lang.String r0 = r5.LIZIZ
            r1.LIZ(r6, r0)
            goto L2d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC37134Ehm.LIZ(int, int):void");
    }

    public AbstractC37134Ehm(String moduleName, String packageName, boolean z, boolean z2, InterfaceC37135Ehn interfaceC37135Ehn, F5R downloadConfig, boolean z3) {
        int i;
        o.LJIIIZ(moduleName, "moduleName");
        o.LJIIIZ(packageName, "packageName");
        o.LJIIIZ(downloadConfig, "downloadConfig");
        this.LIZ = moduleName;
        this.LIZIZ = packageName;
        this.LIZJ = z2;
        this.LIZLLL = interfaceC37135Ehn;
        this.LJ = z3;
        this.LJFF = z;
        this.LJI = downloadConfig;
        this.LJIIIZ = F5Y.UNKNOWN;
        if (z2) {
            i = 0;
        } else if (z) {
            i = 1;
        } else {
            i = 2;
        }
        this.LJIIIIZZ = i;
        this.LJIILJJIL = System.currentTimeMillis();
    }
}
