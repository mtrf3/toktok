package X;

/* renamed from: X.Qp3, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68161Qp3 extends AbstractRunnableC68155Qox {
    public final /* synthetic */ Boolean LJLJJL;
    public final /* synthetic */ C68074Qne LJLJJLL;

    @Override // X.AbstractRunnableC68155Qox
    public final void LIZ() {
        if (this.LJLJJL != null) {
            InterfaceC68207Qpn interfaceC68207Qpn = this.LJLJJLL.LJI;
            QH7.LJIIIIZZ(interfaceC68207Qpn);
            interfaceC68207Qpn.setMeasurementEnabled(this.LJLJJL.booleanValue(), this.LJLIL);
        } else {
            InterfaceC68207Qpn interfaceC68207Qpn2 = this.LJLJJLL.LJI;
            QH7.LJIIIIZZ(interfaceC68207Qpn2);
            interfaceC68207Qpn2.clearMeasurementEnabled(this.LJLIL);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C68161Qp3(C68074Qne c68074Qne, Boolean bool) {
        super(c68074Qne, true);
        this.LJLJJLL = c68074Qne;
        this.LJLJJL = bool;
    }
}
