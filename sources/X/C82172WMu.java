package X;

import Y.ARunnableS17S0201000_14;
import android.view.View;

/* renamed from: X.WMu, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82172WMu extends WMK {
    public final WN1 LJIIJ;

    @Override // X.WMK
    public final void LIZIZ(boolean z) {
        WN3 LIZ;
        WM7 wm7 = this.LIZ;
        View view = wm7.mView;
        if (view == null) {
            return;
        }
        WMJ.LJIIIZ(wm7, 8);
        if (!z || (LIZ = this.LJIIJ.LIZ()) == null) {
            return;
        }
        int visibility = view.getVisibility();
        view.setVisibility(0);
        LIZ.LIZ(new ARunnableS17S0201000_14(visibility, view, this, 0));
        WMJ.LJII.put(this.LIZ, new C82176WMy(LIZ));
        LIZ.LJ(this.LIZ.mView);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C82172WMu(X.WMJ r12, X.WM7 r13, X.WN1 r14) {
        /*
            r11 = this;
            r5 = -1
            r6 = 0
            X.WME r7 = X.WME.ACTIVITY_CREATED
            r3 = r12
            X.WMH r0 = r3.LIZ
            X.WME r2 = r0.mState
            int r1 = r7.value
            int r0 = r2.value
            if (r1 >= r0) goto L1a
        Lf:
            r8 = 0
            r9 = 1
            r4 = r13
            r2 = r11
            r10 = r8
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            r2.LJIIJ = r14
            return
        L1a:
            r7 = r2
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C82172WMu.<init>(X.WMJ, X.WM7, X.WN1):void");
    }
}
