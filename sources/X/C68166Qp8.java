package X;

/* renamed from: X.Qp8, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68166Qp8 implements InterfaceC67979Qm7 {
    public final /* synthetic */ C68164Qp6 LIZ;

    public C68166Qp8(C68164Qp6 c68164Qp6) {
        this.LIZ = c68164Qp6;
    }

    @Override // X.InterfaceC67979Qm7
    public final void LIZ(C67964Qls c67964Qls) {
        if (c67964Qls.LIZ == EnumC67961Qlp.LaunchActivityError) {
            C78983UzD.LJIILL("GooglePay LaunchActivityError");
        }
        this.LIZ.LIZLLL.invoke(c67964Qls);
    }

    @Override // X.InterfaceC67979Qm7
    public final void LIZIZ(boolean z) {
        this.LIZ.LIZ.set(z);
        this.LIZ.LJ.invoke(Boolean.valueOf(z));
    }
}
