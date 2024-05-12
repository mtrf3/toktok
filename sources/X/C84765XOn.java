package X;

/* renamed from: X.XOn, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84765XOn implements InterfaceC64592gB<C78495UrL> {
    public boolean LJLIL;
    public boolean LJLILLLLZI;

    @Override // X.InterfaceC64592gB
    public final void accept(C78495UrL c78495UrL) {
        C78495UrL c78495UrL2 = c78495UrL;
        if (c78495UrL2 != null) {
            if (c78495UrL2.LIZIZ) {
                this.LJLIL = true;
            } else {
                if (!this.LJLIL) {
                    return;
                }
                this.LJLIL = false;
                this.LJLILLLLZI = true;
            }
        }
    }
}
