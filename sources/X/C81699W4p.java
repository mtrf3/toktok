package X;

/* JADX INFO: Add missing generic type declarations: [T] */
/* renamed from: X.W4p, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C81699W4p<T> implements IHD<T> {
    public final /* synthetic */ C81697W4n LIZ;

    @Override // X.IHD
    public final void LIZJ(AbstractC48384Iyq abstractC48384Iyq) {
    }

    public C81699W4p(C81697W4n c81697W4n) {
        this.LIZ = c81697W4n;
    }

    @Override // X.IHD
    public final void LIZ(W4W<T> w4w) {
        this.LIZ.LJIILLIIL(w4w);
    }

    @Override // X.IHD
    public final void LIZIZ(AbstractC48384Iyq abstractC48384Iyq) {
        this.LIZ.LJIIJJI(Math.max(this.LIZ.LIZ(), abstractC48384Iyq.LIZ()));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0037  */
    @Override // X.IHD
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(X.W4W<T> r5) {
        /*
            r4 = this;
            boolean r0 = r5.LIZJ()
            if (r0 == 0) goto L29
            X.W4n r3 = r4.LIZ
            r3.getClass()
            boolean r2 = r5.LIZIZ()
            monitor-enter(r3)
            X.W4W<T> r0 = r3.LJII     // Catch: java.lang.Throwable -> L26
            r1 = 0
            if (r5 != r0) goto L19
            X.W4W<T> r0 = r3.LJIIIIZZ     // Catch: java.lang.Throwable -> L26
            if (r5 != r0) goto L1b
        L19:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L26
            goto L3a
        L1b:
            if (r0 == 0) goto L22
            if (r2 == 0) goto L20
            goto L22
        L20:
            r0 = r1
            goto L24
        L22:
            r3.LJIIIIZZ = r5     // Catch: java.lang.Throwable -> L26
        L24:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L26
            goto L35
        L26:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L26
            throw r0
        L29:
            boolean r0 = r5.LIZIZ()
            if (r0 == 0) goto L47
            X.W4n r0 = r4.LIZ
            r0.LJIILLIIL(r5)
            goto L47
        L35:
            if (r0 == 0) goto L3a
            r0.close()
        L3a:
            X.W4W r0 = r3.LJIILL()
            if (r5 != r0) goto L47
            boolean r0 = r5.LIZIZ()
            r3.LJIIL(r1, r0)
        L47:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C81699W4p.LIZLLL(X.W4W):void");
    }
}
