package X;

import android.view.animation.AccelerateInterpolator;
import java.lang.ref.WeakReference;

/* loaded from: classes10.dex */
public final class LOR implements C0C3 {
    public final WeakReference<LOS> LJLIL;
    public int LJLILLLLZI;
    public int LJLJI;

    public LOR(LOS los) {
        new AccelerateInterpolator();
        this.LJLIL = new WeakReference<>(los);
    }

    @Override // X.C0C3
    public final void onPageScrollStateChanged(int i) {
        LOS los;
        LOW tabAnimationHelper;
        this.LJLILLLLZI = this.LJLJI;
        this.LJLJI = i;
        LOS los2 = this.LJLIL.get();
        if (los2 != null && (tabAnimationHelper = los2.getTabAnimationHelper()) != null) {
            tabAnimationHelper.onPageScrollStateChanged(i);
        }
        if (i != 1 || (los = this.LJLIL.get()) == null) {
            return;
        }
        los.LLIL = true;
    }

    @Override // X.C0C3
    public final void onPageSelected(int i) {
        boolean z;
        LOS los = this.LJLIL.get();
        if (los != null && los.getSelectedTabPosition() != i && i < los.getTabCount()) {
            int i2 = this.LJLJI;
            if (i2 == 0 || (i2 == 2 && this.LJLILLLLZI == 0)) {
                z = true;
            } else {
                z = false;
            }
            los.LJIILLIIL(los.LJIIJ(i), z);
            LOW tabAnimationHelper = los.getTabAnimationHelper();
            if (tabAnimationHelper != null) {
                tabAnimationHelper.onPageSelected(i);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0016, code lost:
    
        if (r4 == 2) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0044  */
    @Override // X.C0C3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onPageScrolled(int r12, float r13, int r14) {
        /*
            r11 = this;
            java.lang.ref.WeakReference<X.LOS> r0 = r11.LJLIL
            java.lang.Object r5 = r0.get()
            X.LOS r5 = (X.LOS) r5
            if (r5 == 0) goto L43
            int r4 = r11.LJLJI
            r3 = 2
            r2 = 0
            r1 = 1
            if (r4 != r3) goto L15
            int r0 = r11.LJLILLLLZI
            if (r0 != r1) goto L48
        L15:
            r8 = 1
            if (r4 != r3) goto L1c
        L18:
            int r0 = r11.LJLILLLLZI
            if (r0 == 0) goto L46
        L1c:
            r9 = 1
        L1d:
            int r0 = r11.LJLILLLLZI
            if (r0 == 0) goto L44
            r10 = 1
        L22:
            r6 = r12
            r7 = r13
            r5.LJIIZILJ(r6, r7, r8, r9, r10)
            X.LOU r1 = r5.LJLJI
            int r0 = r11.LJLJI
            if (r0 != r3) goto L31
            int r0 = r11.LJLILLLLZI
            if (r0 == 0) goto L32
        L31:
            r2 = 1
        L32:
            r1.setMIsDragged(r2)
            X.LOW r0 = r5.getTabAnimationHelper()
            if (r0 == 0) goto L3e
            r0.onPageScrolled(r6, r7, r14)
        L3e:
            X.LOU r0 = r5.LJLJI
            X.C16300kU.LJIIJ(r0)
        L43:
            return
        L44:
            r10 = 0
            goto L22
        L46:
            r9 = 0
            goto L1d
        L48:
            r8 = 0
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LOR.onPageScrolled(int, float, int):void");
    }
}
