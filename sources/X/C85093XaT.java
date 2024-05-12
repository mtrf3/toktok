package X;

/* renamed from: X.XaT, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85093XaT extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ C85069Xa5 LJLIL;
    public final /* synthetic */ long LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C85093XaT(C85069Xa5 c85069Xa5, long j) {
        super(0);
        this.LJLIL = c85069Xa5;
        this.LJLILLLLZI = j;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        this.LJLIL.LIZ.onPlaybackTimeChanged(this.LJLILLLLZI);
        return C76800UCe.LIZ;
    }
}
