package X;

import java.lang.ref.WeakReference;

/* renamed from: X.4Xt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C111134Xt implements C0C3 {
    public final WeakReference<C80261Vej> LJLIL;
    public int LJLILLLLZI;
    public int LJLJI;

    public C111134Xt(C80261Vej c80261Vej) {
        this.LJLIL = new WeakReference<>(c80261Vej);
    }

    @Override // X.C0C3
    public final void onPageScrollStateChanged(int i) {
        this.LJLILLLLZI = this.LJLJI;
        this.LJLJI = i;
    }

    @Override // X.C0C3
    public final void onPageSelected(int i) {
        boolean z;
        C80261Vej c80261Vej = this.LJLIL.get();
        if (c80261Vej != null && c80261Vej.getSelectedTabPosition() != i && i < c80261Vej.getTabCount()) {
            int i2 = this.LJLJI;
            if (i2 == 0 || (i2 == 2 && this.LJLILLLLZI == 0)) {
                z = true;
            } else {
                z = false;
            }
            c80261Vej.selectTab(c80261Vej.getTabAt(i), z);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        r5.setScrollPosition(r7, r8, r1, r3);
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
            java.lang.ref.WeakReference<X.Vej> r0 = r6.LJLIL
            java.lang.Object r5 = r0.get()
            X.Vej r5 = (X.C80261Vej) r5
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
            r5.setScrollPosition(r7, r8, r1, r3)
        L20:
            return
        L21:
            r1 = 0
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C111134Xt.onPageScrolled(int, float, int):void");
    }
}
