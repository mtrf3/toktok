package X;

import Y.ARunnableS50S0100000_14;
import android.view.View;

/* renamed from: X.WMw, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82174WMw extends WMK {
    public final WN1 LJIIJ;

    @Override // X.WMK
    public final void LIZIZ(boolean z) {
        View view;
        WN3 LIZ;
        if (!z || (view = this.LIZ.mView) == null || (LIZ = this.LJIIJ.LIZ()) == null) {
            return;
        }
        LIZ.LIZ(new ARunnableS50S0100000_14(this, 24));
        WMJ.LJII.put(this.LIZ, new WN0(LIZ));
        LIZ.LJ(view);
    }

    @Override // X.WMK
    public final void LIZJ(boolean z) {
        WM7 wm7 = this.LIZ;
        if (wm7.mView == null) {
            return;
        }
        WMJ.LJIIIZ(wm7, 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C82174WMw(X.WMJ r12, X.WM7 r13, X.WN1 r14) {
        /*
            r11 = this;
            r5 = -1
            r6 = 0
            X.WME r7 = X.WME.RESUMED
            r3 = r12
            X.WMH r0 = r3.LIZ
            X.WME r2 = r0.mState
            int r1 = r7.value
            int r0 = r2.value
            if (r1 >= r0) goto L1a
        Lf:
            r8 = 1
            r9 = 0
            r4 = r13
            r2 = r11
            r10 = r9
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            r2.LJIIJ = r14
            return
        L1a:
            r7 = r2
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C82174WMw.<init>(X.WMJ, X.WM7, X.WN1):void");
    }
}
