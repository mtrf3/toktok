package X;

import kotlin.jvm.internal.o;

/* renamed from: X.IdL, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47051IdL extends C47048IdI {
    public long LJ;
    public long LJFF;
    public String LJI;

    @Override // X.C47048IdI, X.InterfaceC46895Iap
    public final void LJIIZILJ() {
        if (this.LJ > 0 && LIZLLL()) {
            this.LJI = "Short-Pause";
        }
    }

    @Override // X.C47048IdI, X.InterfaceC46895Iap
    public final void LJIJ() {
        if (this.LJ > 0 && LIZLLL()) {
            C47048IdI.LIZIZ("ShortPlayAnalyzer", new C46690IUc("Short-Pause"), this.LIZJ);
        }
    }

    @Override // X.C47048IdI, X.InterfaceC46895Iap
    public final void LJIJJ() {
        if (this.LJ > 0 && LIZLLL()) {
            C47048IdI.LIZIZ("ShortPlayAnalyzer", new C46690IUc("Short-Stop"), this.LIZJ);
        }
    }

    @Override // X.C47048IdI, X.InterfaceC46895Iap
    public final void LJIL() {
        String str = this.LJI;
        if (str == null || LIZLLL()) {
            return;
        }
        LIZJ(this.LIZJ, str);
    }

    @Override // X.C47048IdI, X.InterfaceC46895Iap
    public final void LJJII() {
        if (this.LJ > 0 && LIZLLL()) {
            LIZJ(this.LIZJ, "Short-Stop");
        }
    }

    @Override // X.InterfaceC46895Iap
    public final void LIZ() {
        this.LJ = System.currentTimeMillis();
    }

    public final boolean LIZLLL() {
        if (System.currentTimeMillis() - this.LJFF < this.LIZIZ) {
            return true;
        }
        return false;
    }

    @Override // X.C47048IdI, X.InterfaceC46895Iap
    public final void LJIILLIIL() {
        this.LJFF = System.currentTimeMillis();
        this.LJ = 0L;
        this.LJI = null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C47051IdL(C46894Iao playEvent) {
        super(playEvent);
        o.LJIIIZ(playEvent, "playEvent");
    }
}
