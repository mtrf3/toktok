package X;

import java.lang.ref.WeakReference;

/* renamed from: X.ZtZ, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91373ZtZ implements C0C3 {
    public final WeakReference<C91171ZqJ> LJLIL;
    public int LJLILLLLZI;
    public int LJLJI;

    public C91373ZtZ(C91171ZqJ c91171ZqJ) {
        this.LJLIL = new WeakReference<>(c91171ZqJ);
    }

    @Override // X.C0C3
    public final void onPageScrollStateChanged(int i) {
        this.LJLILLLLZI = this.LJLJI;
        this.LJLJI = i;
    }

    @Override // X.C0C3
    public final void onPageSelected(int i) {
        boolean z;
        C91171ZqJ c91171ZqJ = this.LJLIL.get();
        if (c91171ZqJ != null) {
            c91171ZqJ.setTabBarrierColor(i);
            if (c91171ZqJ.getSelectedTabPosition() != i && i < c91171ZqJ.getTabCount()) {
                int i2 = this.LJLJI;
                if (i2 == 0 || (i2 == 2 && this.LJLILLLLZI == 0)) {
                    z = true;
                } else {
                    z = false;
                }
                c91171ZqJ.LJII(c91171ZqJ.LJFF(i), z);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0016, code lost:
    
        if (r4 == 2) goto L10;
     */
    @Override // X.C0C3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onPageScrolled(int r7, float r8, int r9) {
        /*
            r6 = this;
            java.lang.ref.WeakReference<X.ZqJ> r0 = r6.LJLIL
            java.lang.Object r5 = r0.get()
            X.ZqJ r5 = (X.C91171ZqJ) r5
            if (r5 == 0) goto L33
            int r4 = r6.LJLJI
            r3 = 0
            r2 = 2
            r1 = 1
            if (r4 != r2) goto L15
            int r0 = r6.LJLILLLLZI
            if (r0 != r1) goto L36
        L15:
            r1 = 1
            if (r4 != r2) goto L1c
        L18:
            int r0 = r6.LJLILLLLZI
            if (r0 == 0) goto L34
        L1c:
            r0 = 1
        L1d:
            r5.LJIIIIZZ(r7, r8, r1, r0)
            X.ZtY r1 = r5.LJLJI
            int r0 = r6.LJLJI
            if (r0 != r2) goto L2a
            int r0 = r6.LJLILLLLZI
            if (r0 == 0) goto L2b
        L2a:
            r3 = 1
        L2b:
            r1.setMIsDragged(r3)
            X.ZtY r0 = r5.LJLJI
            X.C16300kU.LJIIJ(r0)
        L33:
            return
        L34:
            r0 = 0
            goto L1d
        L36:
            r1 = 0
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C91373ZtZ.onPageScrolled(int, float, int):void");
    }
}
