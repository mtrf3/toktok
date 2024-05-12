package X;

import kotlin.jvm.internal.o;

/* renamed from: X.IdJ, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47049IdJ extends C47048IdI {
    public long LJ;
    public long LJFF;
    public String LJI;

    public final boolean LIZLLL() {
        if (this.LJFF > 0 && this.LJ == 0) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC46895Iap
    public final void LIZ() {
        this.LJ = System.currentTimeMillis();
    }

    @Override // X.C47048IdI, X.InterfaceC46895Iap
    public final void LJIILLIIL() {
        this.LJFF = System.currentTimeMillis();
    }

    @Override // X.C47048IdI, X.InterfaceC46895Iap
    public final void LJIIZILJ() {
        if (LIZLLL()) {
            this.LJI = "Pause-B4-Render";
        }
    }

    @Override // X.C47048IdI, X.InterfaceC46895Iap
    public final void LJIJ() {
        if (LIZLLL()) {
            C47048IdI.LIZIZ("StartInterruptAnalyzer", new C46690IUc("Pause-B4-Render"), o.LJIILLIIL(Long.valueOf(System.currentTimeMillis() - this.LJFF), "durationFromStart:"), this.LIZJ);
        }
    }

    @Override // X.C47048IdI, X.InterfaceC46895Iap
    public final void LJIJJ() {
        if (LIZLLL()) {
            C47048IdI.LIZIZ("StartInterruptAnalyzer", new C46690IUc("Stop-B4-Render"), o.LJIILLIIL(Long.valueOf(System.currentTimeMillis() - this.LJFF), "durationFromStart:"), this.LIZJ);
        }
    }

    @Override // X.C47048IdI, X.InterfaceC46895Iap
    public final void LJIL() {
        if (System.currentTimeMillis() - this.LJFF > this.LIZIZ) {
            String str = this.LJI;
            if (str != null) {
                LIZJ(this.LIZJ, str);
            }
            if (this.LJ == 0) {
                LIZJ(this.LIZJ, "Not-Render");
            }
        }
        this.LJ = 0L;
        this.LJFF = 0L;
    }

    @Override // X.C47048IdI, X.InterfaceC46895Iap
    public final void LJJII() {
        if (LIZLLL()) {
            LIZJ(this.LIZJ, "Stop-B4-Render");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C47049IdJ(C46894Iao playEvent) {
        super(playEvent);
        o.LJIIIZ(playEvent, "playEvent");
    }
}
