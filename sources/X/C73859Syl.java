package X;

/* renamed from: X.Syl, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73859Syl extends AbstractC73437Srx {
    public final /* synthetic */ C73854Syg LJLILLLLZI;

    @Override // X.InterfaceC73442Ss2
    public final void onComplete() {
        this.LJLILLLLZI.LJLILLLLZI.lazySet(EnumC73857Syj.LJLIL);
        EnumC73857Syj.LIZJ(this.LJLILLLLZI.LJLIL);
    }

    public C73859Syl(C73854Syg c73854Syg) {
        this.LJLILLLLZI = c73854Syg;
    }

    @Override // X.InterfaceC73442Ss2
    public final void onError(Throwable th) {
        this.LJLILLLLZI.LJLILLLLZI.lazySet(EnumC73857Syj.LJLIL);
        this.LJLILLLLZI.onError(th);
    }
}
