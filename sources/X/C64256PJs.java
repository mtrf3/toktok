package X;

import Y.IDComparatorS39S0000000_11;
import android.content.Context;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.PJs, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64256PJs {
    public static C64256PJs LJII;
    public final File LIZ;
    public final File LIZIZ;
    public final File LIZJ;
    public final Context LIZLLL;
    public int LJ = -1;
    public C64255PJr LJFF;
    public File[] LJI;

    public static C64256PJs LIZIZ() {
        if (LJII == null) {
            LJII = new C64256PJs(PK0.LIZ);
        }
        return LJII;
    }

    public C64256PJs(Context context) {
        String LIZJ;
        String LJJIIJ = C78596Usy.LJJIIJ(context);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("npth/RuntimeContext/");
        if (C64264PKa.LJII(context)) {
            LIZJ = "main";
        } else {
            LIZJ = C64264PKa.LIZJ(context);
        }
        LIZ.append(LIZJ.replaceAll(":", "@"));
        File file = new File(LJJIIJ, X1D.LIZIZ(LIZ));
        if (!file.exists() || (!file.isDirectory() && C16880lQ.LLLZZIL(file))) {
            file.mkdirs();
            C64269PKf.LJJIFFI = true;
        }
        this.LIZ = file;
        this.LIZIZ = new File(file.getParent(), "did");
        this.LIZJ = new File(file.getParent(), "device_uuid");
        this.LIZLLL = context;
    }

    public final void LIZLLL(long j) {
        C64255PJr LIZJ;
        Iterator<C64255PJr> it = LIZ(this.LIZ, ".allData").iterator();
        try {
            while (it.hasNext()) {
                LIZJ = it.next();
                if (j < LIZJ.LIZ || j > LIZJ.LIZIZ) {
                }
                new JSONArray(PK8.LJFF(LIZJ.LIZJ.getAbsolutePath()));
                return;
            }
            new JSONArray(PK8.LJFF(LIZJ.LIZJ.getAbsolutePath()));
            return;
        } catch (Throwable unused) {
            return;
        }
        LIZJ = LIZJ(".allData", this.LIZ, j);
        if (LIZJ == null) {
        }
    }

    public final ArrayList<C64255PJr> LIZ(File file, String str) {
        File[] listFiles = file.listFiles(new C48176IvU(str));
        ArrayList<C64255PJr> arrayList = new ArrayList<>();
        if (listFiles == null) {
            return arrayList;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("foundRuntimeContextFiles ");
        LIZ.append(listFiles.length);
        X1D.LIZIZ(LIZ);
        C78685UuP.LJJJLL();
        C64255PJr c64255PJr = null;
        for (File file2 : listFiles) {
            try {
                C64255PJr c64255PJr2 = new C64255PJr(file2);
                arrayList.add(c64255PJr2);
                if (this.LJFF == null) {
                    if (".ctx2".equals(str)) {
                        if (c64255PJr != null && c64255PJr2.LIZIZ < c64255PJr.LIZIZ) {
                        }
                        c64255PJr = c64255PJr2;
                    }
                }
            } catch (Throwable th) {
                PJZ.LIZ.getClass();
                PJY.LIZ("NPTH_CATCH", th);
            }
        }
        if (this.LJFF == null && c64255PJr != null) {
            this.LJFF = c64255PJr;
        }
        Collections.sort(arrayList, new IDComparatorS39S0000000_11(0));
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b3 A[Catch: all -> 0x00c9, LOOP:0: B:23:0x00b3->B:25:0x00bb, LOOP_START, PHI: r2
      0x00b3: PHI (r2v1 int) = (r2v0 int), (r2v2 int) binds: [B:20:0x00b0, B:25:0x00bb] A[DONT_GENERATE, DONT_INLINE], TryCatch #1 {all -> 0x00c9, blocks: (B:19:0x00a4, B:23:0x00b3, B:25:0x00bb), top: B:18:0x00a4 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ(java.util.Map<java.lang.String, java.lang.Object> r15, org.json.JSONArray r16) {
        /*
            r14 = this;
            if (r15 != 0) goto L3
            return
        L3:
            X.C39618Fgk.LIZIZ()
            java.util.Map<java.lang.String, java.lang.Object> r0 = X.C39618Fgk.LIZ
            r15.putAll(r0)
            com.bytedance.crash.entity.Header r0 = com.bytedance.crash.entity.Header.LIZJ()
            org.json.JSONObject r1 = r0.LJFF(r15)
            boolean r0 = com.bytedance.crash.entity.Header.LJIIJJI(r1)
            if (r0 == 0) goto L1a
            return
        L1a:
            X.PKN r4 = new X.PKN
            r4.<init>()
            r4.LJIJ(r1)
            X.PJt r0 = X.PK0.LIZIZ()
            com.bytedance.crash.ICommonParams r0 = r0.LIZIZ
            r4.LJIJJ(r0)
            long r8 = X.PK0.LIZJ
            long r10 = java.lang.System.currentTimeMillis()
            r7 = r14
            X.PJr r0 = r7.LJFF
            java.lang.String r1 = ".ctx2"
            if (r0 != 0) goto L3d
            java.io.File r0 = r7.LIZ
            r7.LIZ(r0, r1)
        L3d:
            X.PJr r3 = r7.LJFF
            r13 = r16
            if (r3 != 0) goto L49
            org.json.JSONObject r12 = r4.LIZ
            r7.LJFF(r8, r10, r12, r13)
            return
        L49:
            org.json.JSONObject r5 = r3.LIZ()
            org.json.JSONObject r1 = r4.LIZ
            boolean r0 = com.bytedance.crash.entity.Header.LJIIJJI(r5)
            r2 = 0
            if (r0 == 0) goto L5e
        L56:
            org.json.JSONObject r12 = r4.LIZ
            r7.LJFF(r8, r10, r12, r13)
        L5b:
            java.io.File r1 = r7.LIZ
            goto La4
        L5e:
            boolean r0 = com.bytedance.crash.entity.Header.LJIIJJI(r1)
            if (r0 == 0) goto L65
            goto L5b
        L65:
            java.lang.String r6 = "update_version_code"
            java.lang.Object r0 = r1.opt(r6)
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.Object r0 = r5.opt(r6)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L56
            boolean r0 = X.PJC.LJII(r5)
            if (r0 == 0) goto L90
        L83:
            long r8 = r3.LIZ
            org.json.JSONObject r12 = r4.LIZ
            r7.LJFF(r8, r10, r12, r13)
            java.io.File r0 = r3.LIZJ
            X.PK8.LIZJ(r0)
            goto L5b
        L90:
            java.lang.String r0 = "aid"
            java.lang.String r1 = r5.optString(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L9d
            goto L83
        L9d:
            int r0 = com.bytedance.mt.protector.impl.string2number.CastIntegerProtector.parseInt(r1)     // Catch: java.lang.Throwable -> L83
            if (r0 > 0) goto L56
            goto L83
        La4:
            java.lang.String r0 = ""
            java.util.ArrayList r3 = r7.LIZ(r1, r0)     // Catch: java.lang.Throwable -> Lc9
            int r1 = r3.size()     // Catch: java.lang.Throwable -> Lc9
            r0 = 16
            if (r1 > r0) goto Lb3
            goto Ld4
        Lb3:
            int r0 = r3.size()     // Catch: java.lang.Throwable -> Lc9
            int r0 = r0 + (-8)
            if (r2 >= r0) goto Ld4
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r3, r2)     // Catch: java.lang.Throwable -> Lc9
            X.PJr r0 = (X.C64255PJr) r0     // Catch: java.lang.Throwable -> Lc9
            java.io.File r0 = r0.LIZJ     // Catch: java.lang.Throwable -> Lc9
            X.C16880lQ.LLLZZIL(r0)     // Catch: java.lang.Throwable -> Lc9
            int r2 = r2 + 1
            goto Lb3
        Lc9:
            r1 = move-exception
            X.PJY r0 = X.PJZ.LIZ
            r0.getClass()
            java.lang.String r0 = "NPTH_CATCH"
            X.PJY.LIZ(r0, r1)
        Ld4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64256PJs.LJ(java.util.Map, org.json.JSONArray):void");
    }

    public final C64255PJr LIZJ(String str, File file, long j) {
        Iterator<C64255PJr> it = LIZ(file, str).iterator();
        C64255PJr c64255PJr = null;
        while (it.hasNext()) {
            C64255PJr next = it.next();
            long j2 = next.LIZIZ;
            if (j > j2) {
                next.LJ = j2;
                c64255PJr = next;
            } else {
                if (c64255PJr == null) {
                    next.LJ = j2;
                    return next;
                }
                return c64255PJr;
            }
        }
        return c64255PJr;
    }

    public final void LJFF(long j, long j2, JSONObject jSONObject, JSONArray jSONArray) {
        File file = this.LIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(j);
        LIZ.append("-");
        LIZ.append(j2);
        LIZ.append(".ctx2");
        File file2 = new File(file, X1D.LIZIZ(LIZ));
        File file3 = this.LIZ;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(j);
        LIZ2.append("-");
        LIZ2.append(j2);
        LIZ2.append(".allData");
        File file4 = new File(file3, X1D.LIZIZ(LIZ2));
        try {
            PK8.LJIILLIIL(file2, jSONObject);
            PK8.LJIILL(file4, jSONArray);
            this.LJFF = new C64255PJr(file2);
        } catch (Throwable th) {
            PJZ.LIZ.getClass();
            PJY.LIZ("NPTH_CATCH", th);
        }
    }
}
