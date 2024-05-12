package X;

/* renamed from: X.Qow, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68154Qow extends AbstractRunnableC68155Qox {
    public final /* synthetic */ String LJLJJL;
    public final /* synthetic */ Object LJLJJLL;
    public final /* synthetic */ C68074Qne LJLJL;

    @Override // X.AbstractRunnableC68155Qox
    public final void LIZ() {
        InterfaceC68207Qpn interfaceC68207Qpn = this.LJLJL.LJI;
        QH7.LJIIIIZZ(interfaceC68207Qpn);
        interfaceC68207Qpn.logHealthData(5, this.LJLJJL, new BinderC68153Qov(this.LJLJJLL), new BinderC68153Qov(null), new BinderC68153Qov(null));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C68154Qow(C68074Qne c68074Qne, String str, Object obj) {
        super(c68074Qne, false);
        this.LJLJL = c68074Qne;
        this.LJLJJL = str;
        this.LJLJJLL = obj;
    }
}
