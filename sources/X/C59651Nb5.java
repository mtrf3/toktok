package X;

/* renamed from: X.Nb5, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59651Nb5 implements InterfaceC77682UeE {
    public final /* synthetic */ C59650Nb4 LIZ;

    @Override // X.InterfaceC77682UeE
    public final void LIZIZ(int i, int i2, String str) {
    }

    public C59651Nb5(C59650Nb4 c59650Nb4) {
        this.LIZ = c59650Nb4;
    }

    @Override // X.InterfaceC77682UeE
    public final void LIZ(Exception exc) {
        this.LIZ.LJLIL.onFail();
    }

    @Override // X.InterfaceC77682UeE
    public final void onSuccess(long j) {
        this.LIZ.LJLIL.onSuccess();
    }
}
