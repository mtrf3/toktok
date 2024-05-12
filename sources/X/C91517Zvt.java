package X;

/* renamed from: X.Zvt, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91517Zvt extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ C91330Zss LJLIL;
    public final /* synthetic */ long LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C91517Zvt(C91330Zss c91330Zss, long j) {
        super(0);
        this.LJLIL = c91330Zss;
        this.LJLILLLLZI = j;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        this.LJLIL.LJLIL.onPlaybackTimeChanged(this.LJLILLLLZI);
        return C76800UCe.LIZ;
    }
}
