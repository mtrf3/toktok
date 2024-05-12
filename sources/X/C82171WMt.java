package X;

import Y.ARunnableS50S0100000_14;
import android.view.View;

/* renamed from: X.WMt, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82171WMt extends WMK {
    public final int LJIIJ;
    public final String LJIIJJI;
    public final WN1 LJIIL;

    @Override // X.WMK
    public final void LIZIZ(boolean z) {
        WN3 LIZ;
        View view;
        if (!z || (LIZ = this.LJIIL.LIZ()) == null || (view = this.LIZ.mView) == null) {
            return;
        }
        LIZ.LIZ(new ARunnableS50S0100000_14(this, 22));
        WMJ.LJII.put(this.LIZ, new C82175WMx(LIZ));
        LIZ.LJ(view);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C82171WMt(X.WMJ r12, int r13, X.WM7 r14, java.lang.String r15, X.WN1 r16) {
        /*
            r11 = this;
            X.WME r7 = X.WME.RESUMED
            r3 = r12
            X.WMH r0 = r3.LIZ
            X.WME r2 = r0.mState
            int r1 = r7.value
            int r0 = r2.value
            if (r1 >= r0) goto L20
        Ld:
            r8 = 1
            r9 = 0
            r2 = r11
            r5 = r13
            r4 = r14
            r6 = r15
            r10 = r9
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            r2.LJIIJ = r5
            r2.LJIIJJI = r6
            r0 = r16
            r2.LJIIL = r0
            return
        L20:
            r7 = r2
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C82171WMt.<init>(X.WMJ, int, X.WM7, java.lang.String, X.WN1):void");
    }
}
