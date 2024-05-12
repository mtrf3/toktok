package X;

/* renamed from: X.Sym, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73860Sym extends AbstractC73437Srx {
    public final /* synthetic */ C73855Syh LJLILLLLZI;

    @Override // X.InterfaceC73442Ss2
    public final void onComplete() {
        this.LJLILLLLZI.LJLILLLLZI.lazySet(EnumC73857Syj.LJLIL);
        EnumC73857Syj.LIZJ(this.LJLILLLLZI.LJLIL);
    }

    public C73860Sym(C73855Syh c73855Syh) {
        this.LJLILLLLZI = c73855Syh;
    }

    @Override // X.InterfaceC73442Ss2
    public final void onError(Throwable th) {
        this.LJLILLLLZI.LJLILLLLZI.lazySet(EnumC73857Syj.LJLIL);
        this.LJLILLLLZI.onError(th);
    }
}
