package X;

/* loaded from: classes8.dex */
public final class I3M implements WSJ {
    public final /* synthetic */ I3L LIZ;

    public I3M(I3L i3l) {
        this.LIZ = i3l;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x006d, code lost:
    
        if (kotlin.jvm.internal.o.LJ(r0.LIZ(), java.lang.Boolean.TRUE) != false) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00f1  */
    @Override // X.WSJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTabSelected(X.WSF r8, X.I34 r9) {
        /*
            r7 = this;
            X.I3L r2 = r7.LIZ
            X.Wbs r1 = r2.LJLJJI
            X.TBo<java.lang.Object>[] r6 = X.I3L.LJLL
            r0 = 0
            r0 = r6[r0]
            java.lang.Object r0 = r1.LIZ(r2, r0)
            X.WLT r0 = (X.WLT) r0
            android.view.View r1 = r0.sm0()
            r0 = 1094713344(0x41400000, float:12.0)
            float r0 = X.C74275TDb.LIZ(r0)
            X.UC0.LJJJZ(r1, r0)
            X.I3L r2 = r7.LIZ
            X.Wbs r1 = r2.LJLJJLL
            r3 = 2
            r0 = r6[r3]
            java.lang.Object r0 = r1.LIZ(r2, r0)
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r0 = (com.ss.android.ugc.aweme.shortvideo.ShortVideoContext) r0
            boolean r4 = X.V16.LJJJJZ(r0)
            X.I3L r2 = r7.LIZ
            X.Wbs r1 = r2.LJLJJLL
            r0 = r6[r3]
            java.lang.Object r1 = r1.LIZ(r2, r0)
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r1 = (com.ss.android.ugc.aweme.shortvideo.ShortVideoContext) r1
            r0 = 20
            r1.shootMode = r0
            X.WS0 r0 = r9.LIZJ
            r5 = 0
            if (r0 == 0) goto Lf5
            java.lang.Object r1 = r0.LIZ
        L44:
            java.lang.String r0 = "RecordShoot180s"
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            r3 = 1
            if (r0 == 0) goto L6f
            if (r4 == 0) goto L6f
            X.I3L r2 = r7.LIZ
            X.Wbr r1 = r2.LJLJJL
            r0 = r6[r3]
            java.lang.Object r0 = r1.LIZ(r2, r0)
            X.I8W r0 = (X.I8W) r0
            if (r0 == 0) goto Lc3
            X.0IB r0 = r0.iz()
            if (r0 == 0) goto Lc3
            java.lang.Object r1 = r0.LIZ()
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 == 0) goto Lc3
        L6f:
            X.I3L r2 = r7.LIZ
            X.Wbs r1 = r2.LJLJL
            r4 = 3
            r0 = r6[r4]
            java.lang.Object r0 = r1.LIZ(r2, r0)
            X.WLB r0 = (X.WLB) r0
            X.0IB r0 = r0.J40()
            java.lang.Object r0 = r0.LIZ()
            X.I3n r0 = (X.InterfaceC45999I3n) r0
            if (r0 == 0) goto L8b
            r0.Qt0(r3)
        L8b:
            X.I3L r2 = r7.LIZ
            X.Wbs r1 = r2.LJLJL
            r0 = r6[r4]
            java.lang.Object r0 = r1.LIZ(r2, r0)
            X.WLB r0 = (X.WLB) r0
            X.0IB r0 = r0.cE()
            java.lang.Object r1 = r0.LIZ()
            X.I27 r1 = (X.I27) r1
            if (r1 == 0) goto La8
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r1.setChooseMusicVisible(r0, r5, r5)
        La8:
            X.I3L r2 = r7.LIZ
            X.Wbs r1 = r2.LJLJL
            r0 = r6[r4]
            java.lang.Object r0 = r1.LIZ(r2, r0)
            X.WLB r0 = (X.WLB) r0
            X.0IB r0 = r0.AT()
            java.lang.Object r0 = r0.LIZ()
            X.WIo r0 = (X.InterfaceC82062WIo) r0
            if (r0 == 0) goto Lc3
            r0.C10()
        Lc3:
            X.I3L r2 = r7.LIZ
            X.Wbr r1 = r2.LJLJJL
            r0 = r6[r3]
            java.lang.Object r0 = r1.LIZ(r2, r0)
            X.I8W r0 = (X.I8W) r0
            if (r0 == 0) goto Lf4
            X.0IB r0 = r0.iz()
            if (r0 == 0) goto Lf4
            java.lang.Object r1 = r0.LIZ()
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 == 0) goto Lf4
            X.I3L r2 = r7.LIZ
            X.Wbr r1 = r2.LJLJJL
            r0 = r6[r3]
            java.lang.Object r0 = r1.LIZ(r2, r0)
            X.I8W r0 = (X.I8W) r0
            if (r0 == 0) goto Lf4
            r0.Dd0()
        Lf4:
            return r3
        Lf5:
            r1 = r5
            goto L44
        */
        throw new UnsupportedOperationException("Method not decompiled: X.I3M.onTabSelected(X.WSF, X.I34):boolean");
    }

    @Override // X.WSJ
    public final boolean onTabUnselected(WSF wsf, I34 i34) {
        I3L i3l = this.LIZ;
        UC0.LJJJZ(((WLT) i3l.LJLJJI.LIZ(i3l, I3L.LJLL[0])).sm0(), C74275TDb.LIZ(0.0f));
        return true;
    }
}
