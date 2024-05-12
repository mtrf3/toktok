package X;

/* renamed from: X.1nx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C43931nx extends AbstractC35411aD {
    public C43931nx() {
        throw null;
    }

    public C43931nx(boolean z, float f, InterfaceC35811ar interfaceC35811ar) {
        super(z, f, interfaceC35811ar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x007c, code lost:
    
        if (r1 == X.C24500xi.LIZIZ) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a4, code lost:
    
        if (r8 == null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d8, code lost:
    
        if (r3 == X.C24500xi.LIZIZ) goto L29;
     */
    @Override // X.AbstractC35411aD
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.AbstractC35421aE LIZIZ(X.C0X9 r10, boolean r11, float r12, X.InterfaceC35811ar r13, X.InterfaceC35811ar r14, X.InterfaceC24520xk r15) {
        /*
            r9 = this;
            java.lang.String r0 = "interactionSource"
            kotlin.jvm.internal.o.LJIIIZ(r10, r0)
            r0 = 331259447(0x13be9e37, float:4.8118755E-27)
            r15.LJJIIJ(r0)
            r0 = -1737891121(0xffffffff9869e2cf, float:-3.0229053E-24)
            r15.LJJIIJ(r0)
            X.1o7 r0 = X.C04Q.LJI
            java.lang.Object r3 = r15.LJIILLIIL(r0)
        L17:
            boolean r0 = r3 instanceof android.view.ViewGroup
            if (r0 != 0) goto L4b
            r0 = r3
            android.view.View r0 = (android.view.View) r0
            android.view.ViewParent r1 = r0.getParent()
            boolean r0 = r1 instanceof android.view.View
            if (r0 == 0) goto L2d
            java.lang.String r0 = "parent"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            r3 = r1
            goto L17
        L2d:
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "Couldn't find a valid parent for "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = ". Are you overriding LocalView and providing a View that is not attached to the view hierarchy?"
            r1.append(r0)
            java.lang.String r1 = X.X1D.LIZIZ(r1)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1.toString()
            r0.<init>(r1)
            throw r0
        L4b:
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            r15.LJJIJIIJIL()
            r0 = 1643267286(0x61f244d6, float:5.5863403E20)
            r15.LJJIIJ(r0)
            boolean r0 = r3.isInEditMode()
            r5 = r12
            r4 = r11
            r7 = r14
            r6 = r13
            if (r0 == 0) goto L92
            r0 = -3686552(0xffffffffffc7bf68, float:NaN)
            r15.LJJIIJ(r0)
            boolean r2 = r15.LJIJJ(r10)
            boolean r0 = r15.LJIJJ(r9)
            r2 = r2 | r0
            java.lang.Object r1 = r15.LJIILL()
            if (r2 != 0) goto L7e
            X.0xi r0 = X.InterfaceC24520xk.LIZ
            r0.getClass()
            X.0xh r0 = X.C24500xi.LIZIZ
            if (r1 != r0) goto L86
        L7e:
            X.1nw r1 = new X.1nw
            r1.<init>(r4, r5, r6, r7)
            r15.LJJIII(r1)
        L86:
            r15.LJJIJIIJIL()
            X.1aE r1 = (X.AbstractC35421aE) r1
            r15.LJJIJIIJIL()
            r15.LJJIJIIJIL()
            return r1
        L92:
            r15.LJJIJIIJIL()
            int r2 = r3.getChildCount()
            r1 = 0
        L9a:
            if (r1 >= r2) goto La6
            android.view.View r8 = r3.getChildAt(r1)
            boolean r0 = r8 instanceof X.C23210vd
            if (r0 == 0) goto Led
            if (r8 != 0) goto Lb7
        La6:
            X.0vd r8 = new X.0vd
            android.content.Context r1 = r3.getContext()
            java.lang.String r0 = "view.context"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            r8.<init>(r1)
            r3.addView(r8)
        Lb7:
            r0 = -3686095(0xffffffffffc7c131, float:NaN)
            r15.LJJIIJ(r0)
            boolean r1 = r15.LJIJJ(r10)
            boolean r0 = r15.LJIJJ(r9)
            r1 = r1 | r0
            boolean r0 = r15.LJIJJ(r8)
            r1 = r1 | r0
            java.lang.Object r3 = r15.LJIILL()
            if (r1 != 0) goto Lda
            X.0xi r0 = X.InterfaceC24520xk.LIZ
            r0.getClass()
            X.0xh r0 = X.C24500xi.LIZIZ
            if (r3 != r0) goto Le4
        Lda:
            X.1nv r3 = new X.1nv
            X.0vd r8 = (X.C23210vd) r8
            r3.<init>(r4, r5, r6, r7, r8)
            r15.LJJIII(r3)
        Le4:
            r15.LJJIJIIJIL()
            X.1aE r3 = (X.AbstractC35421aE) r3
            r15.LJJIJIIJIL()
            return r3
        Led:
            int r1 = r1 + 1
            goto L9a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C43931nx.LIZIZ(X.0X9, boolean, float, X.1ar, X.1ar, X.0xk):X.1aE");
    }
}
