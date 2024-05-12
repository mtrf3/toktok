package X;

/* loaded from: classes12.dex */
public class PP6 extends PP7 {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public PP6(android.content.Context r9) {
        /*
            r8 = this;
            java.util.ArrayList r2 = new java.util.ArrayList
            java.util.LinkedHashSet r7 = new java.util.LinkedHashSet
            r7.<init>()
            android.content.res.Resources r4 = r9.getResources()
            java.lang.String r3 = r9.getPackageName()
            java.lang.String r1 = "CronetProviderClassName"
            java.lang.String r0 = "string"
            int r1 = r4.getIdentifier(r1, r0, r3)
            java.lang.String r6 = "com.ttnet.org.chromium.net.impl.NativeCronetProvider"
            java.lang.String r5 = "com.ttnet.org.chromium.net.impl.JavaCronetProvider"
            java.lang.String r4 = "com.google.android.gms.net.GmsCoreCronetProvider"
            java.lang.String r3 = "com.google.android.gms.net.PlayServicesCronetProvider"
            if (r1 != 0) goto L54
        L22:
            X.PP5.LIZ(r9, r3, r7)
            X.PP5.LIZ(r9, r4, r7)
            X.PP5.LIZ(r9, r6, r7)
            X.PP5.LIZ(r9, r5, r7)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r7)
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            r2.<init>(r0)
            int r0 = r2.size()
            if (r0 == 0) goto La4
            java.util.Iterator r1 = r2.iterator()
        L44:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L7b
            java.lang.Object r0 = r1.next()
            X.PP5 r0 = (X.PP5) r0
            r0.LJ()
            goto L44
        L54:
            android.content.res.Resources r0 = r9.getResources()
            java.lang.String r1 = r0.getString(r1)
            if (r1 == 0) goto L22
            boolean r0 = r1.equals(r3)
            if (r0 != 0) goto L22
            boolean r0 = r1.equals(r4)
            if (r0 != 0) goto L22
            boolean r0 = r1.equals(r5)
            if (r0 != 0) goto L22
            boolean r0 = r1.equals(r6)
            if (r0 == 0) goto L77
            goto L22
        L77:
            X.PP5.LIZ(r9, r1, r7)
            goto L22
        L7b:
            int r0 = r2.size()
            if (r0 == 0) goto L9c
            Y.IDComparatorS39S0000000_11 r1 = new Y.IDComparatorS39S0000000_11
            r0 = 16
            r1.<init>(r0)
            java.util.Collections.sort(r2, r1)
            r0 = 0
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r2, r0)
            X.PP5 r0 = (X.PP5) r0
            X.PP6 r0 = r0.LIZIZ()
            X.QDv r0 = r0.LIZ
            r8.<init>(r0)
            return
        L9c:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r0 = "All available Cronet providers are disabled. A provider should be enabled before it can be used."
            r1.<init>(r0)
            throw r1
        La4:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r0 = "Unable to find any Cronet provider. Have you included all necessary jars?"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.PP6.<init>(android.content.Context):void");
    }

    public PP6(QE5 qe5) {
        super(qe5);
    }
}
