package X;

/* renamed from: X.Qph, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68201Qph extends AbstractRunnableC68155Qox {
    public final /* synthetic */ String LJLJJL;
    public final /* synthetic */ String LJLJJLL;
    public final /* synthetic */ boolean LJLJL;
    public final /* synthetic */ BinderC68193QpZ LJLJLJ;
    public final /* synthetic */ C68074Qne LJLJLLL;

    @Override // X.AbstractRunnableC68155Qox
    public final void LIZ() {
        InterfaceC68207Qpn interfaceC68207Qpn = this.LJLJLLL.LJI;
        QH7.LJIIIIZZ(interfaceC68207Qpn);
        interfaceC68207Qpn.getUserProperties(this.LJLJJL, this.LJLJJLL, this.LJLJL, this.LJLJLJ);
    }

    @Override // X.AbstractRunnableC68155Qox
    public final void LIZIZ() {
        this.LJLJLJ.LJJJZ(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C68201Qph(C68074Qne c68074Qne, String str, String str2, boolean z, BinderC68193QpZ binderC68193QpZ) {
        super(c68074Qne, true);
        this.LJLJLLL = c68074Qne;
        this.LJLJJL = str;
        this.LJLJJLL = str2;
        this.LJLJL = z;
        this.LJLJLJ = binderC68193QpZ;
    }
}
