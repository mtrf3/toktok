package X;

import com.google.android.gms.cast.framework.CastOptions;

/* renamed from: X.ZjD, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90731ZjD extends ZYW {
    public final CastOptions LIZLLL;
    public final BinderC90889Zll LJ;

    @Override // X.ZYW
    public final boolean LIZIZ() {
        return this.LIZLLL.zze;
    }

    @Override // X.ZYW
    public final C90613ZhJ LIZ(String str) {
        return new C90613ZhJ(this.LIZ, this.LIZIZ, str, this.LIZLLL, new C90788Zk8(this.LIZ, this.LIZLLL, this.LJ));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C90731ZjD(android.content.Context r4, com.google.android.gms.cast.framework.CastOptions r5, X.BinderC90889Zll r6) {
        /*
            r3 = this;
            java.util.List r0 = r5.LJJJJL()
            boolean r0 = r0.isEmpty()
            java.lang.String r2 = "applicationId cannot be null"
            if (r0 == 0) goto L1d
            java.lang.String r1 = r5.zza
            if (r1 == 0) goto L2c
            r0 = 0
            java.lang.String r0 = X.ZWS.LIZ(r1, r0)
        L15:
            r3.<init>(r4, r0)
            r3.LIZLLL = r5
            r3.LJ = r6
            return
        L1d:
            java.lang.String r1 = r5.zza
            java.util.List r0 = r5.LJJJJL()
            if (r1 == 0) goto L3a
            if (r0 == 0) goto L32
            java.lang.String r0 = X.ZWS.LIZ(r1, r0)
            goto L15
        L2c:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r2)
            throw r0
        L32:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "namespaces cannot be null"
            r1.<init>(r0)
            throw r1
        L3a:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C90731ZjD.<init>(android.content.Context, com.google.android.gms.cast.framework.CastOptions, X.Zll):void");
    }
}
