package X;

/* renamed from: X.Qpb, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68195Qpb extends AbstractRunnableC68155Qox {
    public final /* synthetic */ String LJLJJL;
    public final /* synthetic */ String LJLJJLL;
    public final /* synthetic */ BinderC68193QpZ LJLJL;
    public final /* synthetic */ C68074Qne LJLJLJ;

    @Override // X.AbstractRunnableC68155Qox
    public final void LIZ() {
        InterfaceC68207Qpn interfaceC68207Qpn = this.LJLJLJ.LJI;
        QH7.LJIIIIZZ(interfaceC68207Qpn);
        interfaceC68207Qpn.getConditionalUserProperties(this.LJLJJL, this.LJLJJLL, this.LJLJL);
    }

    @Override // X.AbstractRunnableC68155Qox
    public final void LIZIZ() {
        this.LJLJL.LJJJZ(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C68195Qpb(C68074Qne c68074Qne, String str, String str2, BinderC68193QpZ binderC68193QpZ) {
        super(c68074Qne, true);
        this.LJLJLJ = c68074Qne;
        this.LJLJJL = str;
        this.LJLJJLL = str2;
        this.LJLJL = binderC68193QpZ;
    }
}
