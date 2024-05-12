package X;

@InterfaceC91694Zyk("navigation")
/* renamed from: X.a60, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public class C92144a60 extends AbstractC91695Zyl<C92143a5z> {
    public final C91700Zyq LIZJ;

    @Override // X.AbstractC91695Zyl
    public final C92143a5z LIZ() {
        return new C92143a5z(this);
    }

    public C92144a60(C91700Zyq c91700Zyq) {
        this.LIZJ = c91700Zyq;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0055 A[LOOP:0: B:2:0x0004->B:9:0x0055, LOOP_END] */
    @Override // X.AbstractC91695Zyl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(java.util.List<androidx.navigation.NavBackStackEntry> r8, X.C91683ZyZ r9, X.InterfaceC91693Zyj r10) {
        /*
            r7 = this;
            java.util.Iterator r6 = r8.iterator()
        L4:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L93
            java.lang.Object r0 = r6.next()
            androidx.navigation.NavBackStackEntry r0 = (androidx.navigation.NavBackStackEntry) r0
            X.ZzA r5 = r0.LJLILLLLZI
            X.a5z r5 = (X.C92143a5z) r5
            android.os.Bundle r4 = r0.LJLJI
            int r2 = r5.LJLL
            java.lang.String r1 = r5.LJLLILLLL
            r0 = 0
            if (r2 != 0) goto L71
            if (r1 == 0) goto L79
        L1f:
            X.ZzA r3 = r5.LJIJ(r1, r0)
        L23:
            if (r3 != 0) goto L55
            java.lang.String r0 = r5.LJLLI
            if (r0 != 0) goto L35
            java.lang.String r0 = r5.LJLLILLLL
            if (r0 != 0) goto L33
            int r0 = r5.LJLL
            java.lang.String r0 = java.lang.String.valueOf(r0)
        L33:
            r5.LJLLI = r0
        L35:
            java.lang.String r3 = r5.LJLLI
            kotlin.jvm.internal.o.LJI(r3)
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "navigation destination "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = " is not a direct child of this NavGraph"
            r1.append(r0)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            r2.<init>(r0)
            throw r2
        L55:
            X.Zyq r1 = r7.LIZJ
            java.lang.String r0 = r3.LJLIL
            X.Zyl r2 = r1.LIZIZ(r0)
            X.Zys r1 = r7.LIZIZ()
            android.os.Bundle r0 = r3.LJII(r4)
            androidx.navigation.NavBackStackEntry r0 = r1.LIZ(r3, r0)
            java.util.List r0 = X.C47261Igj.LJJIJ(r0)
            r2.LIZLLL(r0, r9, r10)
            goto L4
        L71:
            if (r1 == 0) goto L74
            goto L1f
        L74:
            X.ZzA r3 = r5.LJIIZILJ(r2, r0)
            goto L23
        L79:
            int r0 = r5.LJLJJLL
            if (r0 == 0) goto L90
            java.lang.String r1 = java.lang.String.valueOf(r0)
        L81:
            java.lang.String r0 = "no start destination defined via app:startDestination for "
            java.lang.String r1 = kotlin.jvm.internal.o.LJIILLIIL(r1, r0)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1.toString()
            r0.<init>(r1)
            throw r0
        L90:
            java.lang.String r1 = "the root navigation"
            goto L81
        L93:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C92144a60.LIZLLL(java.util.List, X.ZyZ, X.Zyj):void");
    }
}
