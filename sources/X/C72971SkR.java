package X;

/* renamed from: X.SkR, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72971SkR implements InterfaceC15710jX {
    public final /* synthetic */ U15 LJLIL;
    public final /* synthetic */ InterfaceC73573Su9<Boolean> LJLILLLLZI;

    @Override // X.InterfaceC15710jX
    public final void onFinish(boolean z) {
        this.LJLIL.LJLJJI = z;
        InterfaceC73573Su9<Boolean> interfaceC73573Su9 = this.LJLILLLLZI;
        if (interfaceC73573Su9 != null) {
            interfaceC73573Su9.onNext(Boolean.valueOf(z));
        }
        InterfaceC73573Su9<Boolean> interfaceC73573Su92 = this.LJLILLLLZI;
        if (interfaceC73573Su92 != null) {
            interfaceC73573Su92.onComplete();
        }
    }

    public C72971SkR(U15 u15, C73433Srt c73433Srt) {
        this.LJLIL = u15;
        this.LJLILLLLZI = c73433Srt;
    }
}
