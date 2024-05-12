package X;

import java.lang.ref.WeakReference;

/* renamed from: X.Vln, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80699Vln implements C0C3 {
    public final WeakReference<C80695Vlj> LJLIL;
    public int LJLILLLLZI;
    public int LJLJI;
    public int LJLJJI;
    public final boolean LJLJJL;

    public C80699Vln(C80698Vlm c80698Vlm) {
        this.LJLIL = new WeakReference<>(c80698Vlm);
        this.LJLJJL = C16310kV.LIZLLL(c80698Vlm) == 1;
    }

    @Override // X.C0C3
    public final void onPageScrollStateChanged(int i) {
        this.LJLILLLLZI = this.LJLJI;
        this.LJLJI = i;
    }

    @Override // X.C0C3
    public final void onPageSelected(int i) {
        boolean z;
        C80695Vlj c80695Vlj = this.LJLIL.get();
        if (c80695Vlj != null && c80695Vlj.getSelectedTabPosition() != i && i < c80695Vlj.getTabCount()) {
            int i2 = this.LJLJI;
            if (i2 == 0 || (i2 == 2 && this.LJLILLLLZI == 0)) {
                z = true;
            } else {
                z = false;
            }
            c80695Vlj.LJIIZILJ(c80695Vlj.LJIIJJI(i), z, true);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x001c, code lost:
    
        if (r3 == 2) goto L12;
     */
    @Override // X.C0C3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onPageScrolled(final int r11, float r12, int r13) {
        /*
            r10 = this;
            r4 = r10
            java.lang.ref.WeakReference<X.Vlj> r0 = r4.LJLIL
            java.lang.Object r7 = r0.get()
            X.Vlj r7 = (X.C80695Vlj) r7
            int r0 = r4.LJLJJI
            r6 = r11
            if (r0 != r6) goto Lf
            return
        Lf:
            if (r7 == 0) goto L49
            int r3 = r4.LJLJI
            r2 = 1
            r1 = 2
            if (r3 != r1) goto L1b
            int r0 = r4.LJLILLLLZI
            if (r0 != r2) goto L4c
        L1b:
            r8 = 1
            if (r3 != r1) goto L22
        L1e:
            int r0 = r4.LJLILLLLZI
            if (r0 == 0) goto L4a
        L22:
            r9 = 1
        L23:
            float[] r0 = new float[r1]
            r0 = {x004e: FILL_ARRAY_DATA , data: [0, 1065353216} // fill-array
            android.animation.ValueAnimator r2 = android.animation.ValueAnimator.ofFloat(r0)
            r0 = 200(0xc8, double:9.9E-322)
            android.animation.ValueAnimator r1 = r2.setDuration(r0)
            int r5 = r4.LJLJJI
            X.Vlp r3 = new X.Vlp
            r3.<init>()
            r1.addUpdateListener(r3)
            r4.LJLJJI = r6
            X.Vlt r0 = new X.Vlt
            r0.<init>(r7, r6, r8, r9)
            r1.addListener(r0)
            r1.start()
        L49:
            return
        L4a:
            r9 = 0
            goto L23
        L4c:
            r8 = 0
            goto L1e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C80699Vln.onPageScrolled(int, float, int):void");
    }
}
