package X;

import java.lang.ref.WeakReference;

/* loaded from: classes9.dex */
public final class K37 extends C0CJ {
    public final WeakReference<C74053T4n> LJLIL;
    public int LJLILLLLZI;
    public int LJLJI;

    public K37(C74053T4n c74053T4n) {
        this.LJLIL = new WeakReference<>(c74053T4n);
    }

    @Override // X.C0CJ
    public final void LIZ(int i) {
        this.LJLILLLLZI = this.LJLJI;
        this.LJLJI = i;
    }

    @Override // X.C0CJ
    public final void LIZJ(int i) {
        boolean z;
        C74053T4n c74053T4n = this.LJLIL.get();
        if (c74053T4n != null && c74053T4n.getSelectedTabPosition() != i && i < c74053T4n.getTabCount()) {
            int i2 = this.LJLJI;
            if (i2 == 0 || (i2 == 2 && this.LJLILLLLZI == 0)) {
                z = true;
            } else {
                z = false;
            }
            c74053T4n.LJIIJJI(c74053T4n.LJI(i), z);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        r5.LJIILIIL(r7, r8, r1, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0020, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0016, code lost:
    
        if (r4 == 2) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001a, code lost:
    
        if (r6.LJLILLLLZI != 0) goto L12;
     */
    @Override // X.C0CJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(int r7, float r8, int r9) {
        /*
            r6 = this;
            java.lang.ref.WeakReference<X.T4n> r0 = r6.LJLIL
            java.lang.Object r5 = r0.get()
            X.T4n r5 = (X.C74053T4n) r5
            if (r5 == 0) goto L20
            int r4 = r6.LJLJI
            r3 = 0
            r1 = 1
            r2 = 2
            if (r4 != r2) goto L15
            int r0 = r6.LJLILLLLZI
            if (r0 != r1) goto L21
        L15:
            r1 = 1
            if (r4 != r2) goto L1c
        L18:
            int r0 = r6.LJLILLLLZI
            if (r0 == 0) goto L1d
        L1c:
            r3 = 1
        L1d:
            r5.LJIILIIL(r7, r8, r1, r3)
        L20:
            return
        L21:
            r1 = 0
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: X.K37.LIZIZ(int, float, int):void");
    }
}
