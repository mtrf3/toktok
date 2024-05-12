package X;

/* renamed from: X.Syi, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73856Syi extends AbstractC73437Srx {
    public final /* synthetic */ C73853Syf LJLILLLLZI;

    @Override // X.InterfaceC73442Ss2
    public final void onComplete() {
        this.LJLILLLLZI.LJLILLLLZI.lazySet(EnumC73857Syj.LJLIL);
        EnumC73858Syk.LIZJ(this.LJLILLLLZI.LJLIL);
    }

    public C73856Syi(C73853Syf c73853Syf) {
        this.LJLILLLLZI = c73853Syf;
    }

    @Override // X.InterfaceC73442Ss2
    public final void onError(Throwable th) {
        this.LJLILLLLZI.LJLILLLLZI.lazySet(EnumC73857Syj.LJLIL);
        this.LJLILLLLZI.onError(th);
    }
}
