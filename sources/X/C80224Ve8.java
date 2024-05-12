package X;

import android.graphics.Typeface;

/* renamed from: X.Ve8, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80224Ve8 implements InterfaceC80228VeC {
    public final /* synthetic */ C80225Ve9 LIZ;

    public C80224Ve8(C80225Ve9 c80225Ve9) {
        this.LIZ = c80225Ve9;
    }

    @Override // X.InterfaceC80228VeC
    public final void LIZ(Typeface typeface) {
        C80225Ve9 c80225Ve9 = this.LIZ;
        C80227VeB c80227VeB = c80225Ve9.LJIJJLI;
        if (c80227VeB != null) {
            c80227VeB.LJLJI = true;
        }
        if (c80225Ve9.LJIJI != typeface) {
            c80225Ve9.LJIJI = typeface;
            c80225Ve9.LJIIIZ();
        }
    }
}
