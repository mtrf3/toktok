package X;

import androidx.lifecycle.LiveData;
import com.ss.android.vesdk.VEEditor;

/* renamed from: X.6lb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C169876lb implements InterfaceC170186m6 {
    public VEEditor.VEState LIZ;
    public final /* synthetic */ C169776lR LIZIZ;

    public C169876lb(C169776lR c169776lR) {
        this.LIZIZ = c169776lR;
    }

    @Override // X.InterfaceC170186m6
    public final void LIZ(int i, int i2, int i3) {
        C5MM c5mm;
        C169776lR c169776lR = this.LIZIZ;
        if (c169776lR.LJJIIJZLJL != null && i2 == 1) {
            long j = i;
            long LIZ = c169776lR.LJJIIZ.LIZ(j);
            if (i3 == 1) {
                this.LIZ = this.LIZIZ.LJJIIJZLJL.getState();
                ((LiveData) this.LIZIZ.LJJJLIIL.LJZ.getValue()).setValue(Boolean.TRUE);
                c5mm = C5MM.LIZIZ(LIZ);
            } else if (i3 == 3) {
                c5mm = C5MM.LIZIZ(LIZ);
            } else if (i3 == 2) {
                c5mm = new C5MM(3, LIZ, new InterfaceC133865Ne() { // from class: X.6lq
                    @Override // X.InterfaceC133865Ne
                    public final void LIZ(int i4) {
                        ((LiveData) C169876lb.this.LIZIZ.LJJJLIIL.LJZ.getValue()).postValue(Boolean.FALSE);
                    }
                });
            } else {
                throw new AssertionError();
            }
            this.LIZIZ.LIZLLL.setValue(c5mm);
            C169776lR c169776lR2 = this.LIZIZ;
            C170006lo c170006lo = c169776lR2.LJJJJIZL;
            c170006lo.LIZIZ = LIZ;
            c170006lo.LIZJ = j;
            if (i3 == 2 && this.LIZ == VEEditor.VEState.STARTED) {
                c169776lR2.LJIIJJI();
                this.LIZ = null;
            }
            if (this.LIZIZ.LJJIIZ.LIZJ()) {
                this.LIZIZ.LJJJLIIL.LJZL = true;
            } else {
                this.LIZIZ.LJJJLIIL.LJZL = false;
            }
        }
    }
}
