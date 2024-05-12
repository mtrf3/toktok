package X;

import java.lang.ref.WeakReference;

/* renamed from: X.1Gl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C30191Gl implements C0C3 {
    public final WeakReference<C0KV> LJLIL;
    public int LJLILLLLZI;
    public int LJLJI;

    public C30191Gl(C0KV c0kv) {
        this.LJLIL = new WeakReference<>(c0kv);
    }

    @Override // X.C0C3
    public final void onPageScrollStateChanged(int i) {
        this.LJLILLLLZI = this.LJLJI;
        this.LJLJI = i;
    }

    @Override // X.C0C3
    public final void onPageSelected(int i) {
        boolean z;
        C0KV c0kv = this.LJLIL.get();
        if (c0kv != null && c0kv.getSelectedTabPosition() != i && i < c0kv.getTabCount()) {
            int i2 = this.LJLJI;
            if (i2 == 0 || (i2 == 2 && this.LJLILLLLZI == 0)) {
                z = true;
            } else {
                z = false;
            }
            c0kv.LJIILJJIL(c0kv.LJIIJ(i), z);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        r5.LJIILLIIL(r7, r8, r1, r3);
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
    @Override // X.C0C3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onPageScrolled(int r7, float r8, int r9) {
        /*
            r6 = this;
            java.lang.ref.WeakReference<X.0KV> r0 = r6.LJLIL
            java.lang.Object r5 = r0.get()
            X.0KV r5 = (X.C0KV) r5
            if (r5 == 0) goto L20
            int r4 = r6.LJLJI
            r3 = 0
            r2 = 2
            r1 = 1
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
            r5.LJIILLIIL(r7, r8, r1, r3)
        L20:
            return
        L21:
            r1 = 0
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C30191Gl.onPageScrolled(int, float, int):void");
    }
}
