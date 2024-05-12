package Y;

import X.C2NU;
import X.C48603J5r;
import X.C48774JCg;
import X.EnumC111394Yt;
import X.EnumC48779JCl;
import com.bytedance.keva.Keva;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public class ARunnableS3S2100000_8 implements Runnable {
    public final int $t;
    public Object l2;
    public String s0;
    public String s1;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            case 2:
                run$2(this);
                return;
            default:
                return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00a9, code lost:
    
        if (r2 != null) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ$0() {
        /*
            r8 = this;
            java.lang.String r6 = r8.s0
            java.lang.String r5 = r8.s1
            java.lang.Object r2 = r8.l2
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            X.Iv5 r7 = new X.Iv5
            java.lang.String r1 = "tag="
            java.lang.String r0 = " message="
            java.lang.String r0 = X.C0ON.LIZJ(r1, r6, r0, r5)
            r7.<init>(r0, r2)
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: java.lang.Throwable -> Lc4
            r4.<init>()     // Catch: java.lang.Throwable -> Lc4
            java.lang.String r1 = "event_type"
            java.lang.String r0 = "exception"
            r4.put(r1, r0)     // Catch: java.lang.Throwable -> Lc4
            java.lang.String r2 = "timestamp"
            long r0 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> Lc4
            r4.put(r2, r0)     // Catch: java.lang.Throwable -> Lc4
            java.lang.String r3 = "stack"
            java.io.StringWriter r2 = new java.io.StringWriter     // Catch: java.lang.Throwable -> Lc4
            r2.<init>()     // Catch: java.lang.Throwable -> Lc4
            java.io.PrintWriter r1 = new java.io.PrintWriter     // Catch: java.lang.Throwable -> Lc4
            r1.<init>(r2)     // Catch: java.lang.Throwable -> Lc4
            r7.printStackTrace(r1)     // Catch: java.lang.Throwable -> Lc4
            java.lang.Throwable r0 = r7.getCause()     // Catch: java.lang.Throwable -> Lc4
            if (r0 == 0) goto L4b
            r0.printStackTrace(r1)     // Catch: java.lang.Throwable -> Lc4
            java.lang.Throwable r0 = r0.getCause()     // Catch: java.lang.Throwable -> Lc4
            if (r0 == 0) goto L4b
            r0.printStackTrace(r1)     // Catch: java.lang.Throwable -> Lc4
        L4b:
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> Lc4
            r1.close()     // Catch: java.lang.Throwable -> Lc4
            r4.put(r3, r0)     // Catch: java.lang.Throwable -> Lc4
            java.lang.String r1 = "exception_type"
            r0 = 1
            r4.put(r1, r0)     // Catch: java.lang.Throwable -> Lc4
            java.lang.String r2 = "message"
            java.lang.StringBuilder r1 = X.X1D.LIZ()     // Catch: java.lang.Throwable -> Lc4
            r1.append(r6)     // Catch: java.lang.Throwable -> Lc4
            java.lang.String r0 = "_"
            r1.append(r0)     // Catch: java.lang.Throwable -> Lc4
            r1.append(r5)     // Catch: java.lang.Throwable -> Lc4
            java.lang.String r0 = X.X1D.LIZIZ(r1)     // Catch: java.lang.Throwable -> Lc4
            r4.put(r2, r0)     // Catch: java.lang.Throwable -> Lc4
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Throwable -> Lc4
            r2.<init>()     // Catch: java.lang.Throwable -> Lc4
            java.lang.String r1 = "apm_sdk"
            java.lang.String r0 = "apm6_error"
            r2.put(r1, r0)     // Catch: java.lang.Throwable -> Lc4
            java.lang.String r0 = "filters"
            r4.put(r0, r2)     // Catch: java.lang.Throwable -> Lc4
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Throwable -> Lc4
            r3.<init>()     // Catch: java.lang.Throwable -> Lc4
            org.json.JSONArray r1 = new org.json.JSONArray     // Catch: java.lang.Throwable -> Lc4
            r1.<init>()     // Catch: java.lang.Throwable -> Lc4
            r1.put(r4)     // Catch: java.lang.Throwable -> Lc4
            java.lang.String r0 = "data"
            r3.put(r0, r1)     // Catch: java.lang.Throwable -> Lc4
            org.json.JSONObject r2 = X.C63985P9h.LIZJ()     // Catch: java.lang.Throwable -> Lc4
            if (r2 != 0) goto L9e
            r2 = 0
            goto Lb2
        L9e:
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Exception -> La9 java.lang.Throwable -> Lc4
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Exception -> La9 java.lang.Throwable -> Lc4
            r1.<init>(r0)     // Catch: java.lang.Exception -> La9 java.lang.Throwable -> Lc4
            r2 = r1
            goto Lab
        La9:
            if (r2 == 0) goto Lb2
        Lab:
            java.lang.String r1 = "aid"
            java.lang.String r0 = "44444"
            r2.put(r1, r0)     // Catch: java.lang.Throwable -> Lc4
        Lb2:
            java.lang.String r0 = "header"
            r3.put(r0, r2)     // Catch: java.lang.Throwable -> Lc4
            java.lang.String r1 = X.C48660J7w.LIZJ     // Catch: java.lang.Throwable -> Lc4
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Throwable -> Lc4
            byte[] r0 = r0.getBytes()     // Catch: java.lang.Throwable -> Lc4
            X.C48660J7w.LIZIZ(r1, r0)     // Catch: java.lang.Throwable -> Lc4
        Lc4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS3S2100000_8.LIZ$0():void");
    }

    public final void LIZ$1() {
        if (o.LJ(((C48774JCg) this.l2).LJLLLL, this.s0)) {
            ((C48774JCg) this.l2).LJIJI().LJIIIIZZ(this.s1);
            if (C2NU.LIZ.LIZJ == EnumC111394Yt.AVAILABLE) {
                return;
            }
            ((C48774JCg) this.l2).LJIL().gv0(EnumC48779JCl.NET_ERROR);
        }
    }

    public static final void run$0(ARunnableS3S2100000_8 aRunnableS3S2100000_8) {
        boolean LIZ;
        try {
            aRunnableS3S2100000_8.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS3S2100000_8 aRunnableS3S2100000_8) {
        boolean LIZ;
        try {
            if (aRunnableS3S2100000_8.s0 == null) {
                Keva LIZIZ = ((C48603J5r) aRunnableS3S2100000_8.l2).LIZIZ();
                if (LIZIZ != null) {
                    LIZIZ.erase(aRunnableS3S2100000_8.s1);
                }
            } else {
                Keva LIZIZ2 = ((C48603J5r) aRunnableS3S2100000_8.l2).LIZIZ();
                if (LIZIZ2 != null) {
                    LIZIZ2.storeString(aRunnableS3S2100000_8.s1, aRunnableS3S2100000_8.s0);
                }
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(ARunnableS3S2100000_8 aRunnableS3S2100000_8) {
        boolean LIZ;
        try {
            aRunnableS3S2100000_8.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS3S2100000_8(String str, Object obj, String str2, int i) {
        this.$t = i;
        this.s0 = str;
        this.l2 = obj;
        this.s1 = str2;
    }
}
