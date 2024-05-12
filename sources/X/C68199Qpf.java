package X;

/* renamed from: X.Qpf, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68199Qpf extends AbstractRunnableC68155Qox {
    public final /* synthetic */ BinderC68193QpZ LJLJJL;
    public final /* synthetic */ C68074Qne LJLJJLL;

    @Override // X.AbstractRunnableC68155Qox
    public final void LIZ() {
        InterfaceC68207Qpn interfaceC68207Qpn = this.LJLJJLL.LJI;
        QH7.LJIIIIZZ(interfaceC68207Qpn);
        interfaceC68207Qpn.getCurrentScreenName(this.LJLJJL);
    }

    @Override // X.AbstractRunnableC68155Qox
    public final void LIZIZ() {
        this.LJLJJL.LJJJZ(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C68199Qpf(C68074Qne c68074Qne, BinderC68193QpZ binderC68193QpZ) {
        super(c68074Qne, true);
        this.LJLJJLL = c68074Qne;
        this.LJLJJL = binderC68193QpZ;
    }
}
