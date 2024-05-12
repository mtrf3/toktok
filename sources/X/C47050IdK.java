package X;

import Y.ARunnableS10S0101000_6;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.o;

/* renamed from: X.IdK, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47050IdK extends C47048IdI {
    public boolean LJ;
    public final AqS158S0100000_8 LJFF;

    @Override // X.C47048IdI, X.InterfaceC46895Iap
    public final void LJIJJLI() {
        this.LJ = true;
    }

    @Override // X.C47048IdI, X.InterfaceC46895Iap
    public final void LJJ() {
        this.LJ = false;
    }

    @Override // X.InterfaceC46895Iap
    public final void LIZ() {
        if (this.LJ) {
            C46982IcE.LJ.postDelayed(new RunnableC51616KNo(8, this.LJFF), 300L);
        }
    }

    @Override // X.C47048IdI, X.InterfaceC46895Iap
    public final void LJJI() {
        C46982IcE.LJ.removeCallbacks(new ARunnableS10S0101000_6(4, this.LJFF, 14));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C47050IdK(C46894Iao playEvent) {
        super(playEvent);
        o.LJIIIZ(playEvent, "playEvent");
        this.LJFF = new AqS158S0100000_8(this, 446);
    }
}
