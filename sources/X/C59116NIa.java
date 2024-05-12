package X;

/* renamed from: X.NIa, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59116NIa implements InterfaceC59389NSn {
    public final /* synthetic */ NIV LIZ;

    @Override // X.InterfaceC59389NSn
    public final long getCurrentPosition() {
        NIV niv = this.LIZ;
        if (niv.LJIIJ) {
            niv.LJIIJ = false;
            return 0L;
        }
        return niv.LJJIJL();
    }

    public C59116NIa(NIV niv) {
        this.LIZ = niv;
    }
}
