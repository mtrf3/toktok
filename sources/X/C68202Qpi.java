package X;

/* renamed from: X.Qpi, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68202Qpi extends AbstractRunnableC68155Qox {
    public final /* synthetic */ String LJLJJL;
    public final /* synthetic */ BinderC68193QpZ LJLJJLL;
    public final /* synthetic */ C68074Qne LJLJL;

    @Override // X.AbstractRunnableC68155Qox
    public final void LIZ() {
        InterfaceC68207Qpn interfaceC68207Qpn = this.LJLJL.LJI;
        QH7.LJIIIIZZ(interfaceC68207Qpn);
        interfaceC68207Qpn.getMaxUserProperties(this.LJLJJL, this.LJLJJLL);
    }

    @Override // X.AbstractRunnableC68155Qox
    public final void LIZIZ() {
        this.LJLJJLL.LJJJZ(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C68202Qpi(C68074Qne c68074Qne, String str, BinderC68193QpZ binderC68193QpZ) {
        super(c68074Qne, true);
        this.LJLJL = c68074Qne;
        this.LJLJJL = str;
        this.LJLJJLL = binderC68193QpZ;
    }
}
