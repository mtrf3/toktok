package X;

/* renamed from: X.QFu, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66702QFu extends QGP<QG0> {
    public final QGA LIZ;
    public String LIZIZ;

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("use fetcher: ");
        LIZ.append(this.LIZIZ);
        return X1D.LIZIZ(LIZ);
    }

    public C66702QFu(QGA qga) {
        this.LIZ = qga;
    }

    @Override // X.QGP, X.QGQ
    public final void LIZJ(QGS qgs) {
        Runnable runnable = ((QG0) qgs).LJI.LJI;
        if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    @Override // X.QGP, X.QGQ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map LIZ(X.QGS r12, int r13) {
        /*
            r11 = this;
            X.QG0 r12 = (X.QG0) r12
            java.util.HashMap r2 = new java.util.HashMap
            r0 = 5
            r2.<init>(r0)
            X.QFy r3 = r12.LJI
            long r5 = r3.LIZIZ
            java.lang.String r1 = "queue_time"
            r9 = -1
            r7 = 0
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 == 0) goto L1c
            long r3 = r3.LIZ
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r0 != 0) goto Lcc
        L1c:
            java.lang.String r0 = java.lang.Long.toString(r9)
            r2.put(r1, r0)
        L23:
            X.QFy r3 = r12.LJI
            long r5 = r3.LIZJ
            java.lang.String r1 = "fetch_time"
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 == 0) goto L33
            long r3 = r3.LIZIZ
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r0 != 0) goto Lc2
        L33:
            java.lang.String r0 = java.lang.Long.toString(r9)
            r2.put(r1, r0)
        L3a:
            X.QFy r3 = r12.LJI
            long r5 = r3.LIZJ
            java.lang.String r1 = "total_time"
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 == 0) goto L4a
            long r3 = r3.LIZ
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r0 != 0) goto Lb9
        L4a:
            java.lang.String r0 = java.lang.Long.toString(r9)
            r2.put(r1, r0)
        L51:
            java.lang.String r1 = "image_size"
            java.lang.String r0 = java.lang.Integer.toString(r13)
            r2.put(r1, r0)
            X.QFy r0 = r12.LJI
            boolean r0 = r0.LJ
            if (r0 == 0) goto Lb6
            java.lang.String r1 = "1"
        L62:
            java.lang.String r0 = "hit_cdn_cache"
            r2.put(r0, r1)
            X.QFy r0 = r12.LJI
            boolean r0 = r0.LJ
            if (r0 == 0) goto Lb3
            java.lang.String r1 = "hit"
        L6f:
            java.lang.String r0 = "x_response_cache"
            r2.put(r0, r1)
            X.QFy r0 = r12.LJI
            long r0 = r0.LJIIIZ
            java.lang.String r1 = java.lang.Long.toString(r0)
            java.lang.String r0 = "content_length"
            r2.put(r0, r1)
            X.QFy r0 = r12.LJI
            r0.getClass()
            r1 = 0
            java.lang.String r0 = "x-imagex-extra"
            r2.put(r0, r1)
            X.QFy r0 = r12.LJI
            java.lang.String r1 = r0.LJIIJ
            java.lang.String r0 = "imagex_demotion"
            r2.put(r0, r1)
            X.QFy r0 = r12.LJI
            java.lang.String r1 = r0.LJIIJJI
            java.lang.String r0 = "imagex_want_fmt"
            r2.put(r0, r1)
            X.QFy r0 = r12.LJI
            java.lang.String r1 = r0.LJIIL
            java.lang.String r0 = "imagex_true_fmt"
            r2.put(r0, r1)
            X.QFy r0 = r12.LJI
            java.lang.String r1 = r0.LJIILIIL
            java.lang.String r0 = "imagex_consistency"
            r2.put(r0, r1)
            return r2
        Lb3:
            java.lang.String r1 = "miss"
            goto L6f
        Lb6:
            java.lang.String r1 = "0"
            goto L62
        Lb9:
            long r5 = r5 - r3
            java.lang.String r0 = java.lang.Long.toString(r5)
            r2.put(r1, r0)
            goto L51
        Lc2:
            long r5 = r5 - r3
            java.lang.String r0 = java.lang.Long.toString(r5)
            r2.put(r1, r0)
            goto L3a
        Lcc:
            long r5 = r5 - r3
            java.lang.String r0 = java.lang.Long.toString(r5)
            r2.put(r1, r0)
            goto L23
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66702QFu.LIZ(X.QGS, int):java.util.Map");
    }

    @Override // X.QGQ
    public final void LIZIZ(QGS qgs, W7U w7u) {
        QG0 qg0 = (QG0) qgs;
        if (qg0 == null) {
            return;
        }
        QG6 qg6 = new QG6(w7u);
        qg0.LJI.LJFF = qg0.LIZJ();
        qg0.LJI.getClass();
        qg0.LJI.LIZLLL = qg0.LIZ();
        C66706QFy c66706QFy = qg0.LJI;
        qg0.LIZIZ.LJ().getClass();
        c66706QFy.getClass();
        qg0.LJI.LJIIIIZZ = qg0.LIZIZ.LJ().LJIL;
        QGE qge = C78886Uxe.LJLJI;
        if (qge != null) {
            qg0.LJI.LJII = qge.LIZIZ;
        }
        AbstractC66705QFx LIZ = this.LIZ.LIZ();
        this.LIZIZ = LIZ.getClass().getName();
        LIZ.LIZJ(qg0.LJI, qg6);
        qg0.LIZIZ.LIZLLL(new QG5(LIZ));
        LIZ.LIZ(qg0.LJI, qg6);
    }

    @Override // X.QGQ
    public final QGS LJ(W7F w7f, InterfaceC81770W7i interfaceC81770W7i) {
        QG0 qg0 = new QG0(w7f, interfaceC81770W7i);
        qg0.LJI = new C66706QFy();
        return qg0;
    }
}
