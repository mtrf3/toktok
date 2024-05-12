package X;

import java.io.File;

/* renamed from: X.Eef, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36941Eef implements InterfaceC36737EbN {
    public final /* synthetic */ java.util.Map LIZ;
    public final /* synthetic */ File LIZIZ;

    /* JADX WARN: Removed duplicated region for block: B:12:0x003f  */
    @Override // X.InterfaceC36737EbN
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<java.lang.String> LIZ() {
        /*
            r9 = this;
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Map r0 = r9.LIZ
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r8 = r0.iterator()
        Lf:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto Lad
            java.lang.Object r5 = r8.next()
            java.lang.String r5 = (java.lang.String) r5
            java.io.File r7 = new java.io.File
            java.io.File r0 = r9.LIZIZ
            r7.<init>(r0, r5)
            boolean r0 = r7.exists()
            if (r0 != 0) goto L29
            goto Lf
        L29:
            java.util.Map r0 = r9.LIZ
            java.lang.Object r0 = r0.get(r5)
            if (r0 == 0) goto La8
            java.util.List r0 = (java.util.List) r0
            java.util.Iterator r6 = r0.iterator()
        L37:
            boolean r0 = r6.hasNext()
            java.lang.String r4 = "prefetch.json"
            if (r0 == 0) goto L70
            java.lang.Object r0 = r6.next()
            java.lang.String r0 = (java.lang.String) r0
            java.io.File r2 = new java.io.File
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            r1.append(r0)
            java.lang.String r0 = java.io.File.separator
            java.lang.String r0 = X.JBR.LJFF(r1, r0, r4, r1)
            r2.<init>(r7, r0)
            boolean r0 = r2.exists()
            if (r0 != 0) goto L5e
            goto L37
        L5e:
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L37
            java.io.FileReader r0 = new java.io.FileReader     // Catch: java.lang.Throwable -> L37
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L37
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L37
            java.lang.String r0 = X.C77321UWf.LJIILJJIL(r1)     // Catch: java.lang.Throwable -> L37
            r3.add(r0)     // Catch: java.lang.Throwable -> L37
            goto L37
        L70:
            X.O2H r2 = new X.O2H     // Catch: java.lang.Throwable -> Lf
            r2.<init>()     // Catch: java.lang.Throwable -> Lf
            java.lang.String r1 = "offlineX"
            java.lang.String r0 = "gecko_hybrid_prefetch_config"
            java.lang.String r0 = r2.LIZJ(r1, r5, r0)     // Catch: java.lang.Throwable -> Lf
            java.io.File r2 = new java.io.File     // Catch: java.lang.Throwable -> Lf
            java.lang.StringBuilder r1 = X.X1D.LIZ()     // Catch: java.lang.Throwable -> Lf
            r1.append(r0)     // Catch: java.lang.Throwable -> Lf
            java.lang.String r0 = java.io.File.separator     // Catch: java.lang.Throwable -> Lf
            r1.append(r0)     // Catch: java.lang.Throwable -> Lf
            r1.append(r4)     // Catch: java.lang.Throwable -> Lf
            java.lang.String r0 = X.X1D.LIZIZ(r1)     // Catch: java.lang.Throwable -> Lf
            r2.<init>(r0)     // Catch: java.lang.Throwable -> Lf
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> Lf
            java.io.FileReader r0 = new java.io.FileReader     // Catch: java.lang.Throwable -> Lf
            r0.<init>(r2)     // Catch: java.lang.Throwable -> Lf
            r1.<init>(r0)     // Catch: java.lang.Throwable -> Lf
            java.lang.String r0 = X.C77321UWf.LJIILJJIL(r1)     // Catch: java.lang.Throwable -> Lf
            r3.add(r0)     // Catch: java.lang.Throwable -> Lf
            goto Lf
        La8:
            kotlin.jvm.internal.o.LJIIZILJ()
            r0 = 0
            throw r0
        Lad:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C36941Eef.LIZ():java.util.List");
    }

    public C36941Eef(File file, java.util.Map map) {
        this.LIZ = map;
        this.LIZIZ = file;
    }
}
