package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Xad, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85103Xad extends AbstractC65781Prl implements InterfaceC88472Yns<InterfaceC85091XaR, C76800UCe> {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ int LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C85103Xad(int i, int i2) {
        super(1);
        this.LJLIL = i;
        this.LJLILLLLZI = i2;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(InterfaceC85091XaR interfaceC85091XaR) {
        InterfaceC85091XaR it = interfaceC85091XaR;
        o.LJIIIZ(it, "it");
        it.onVideoSizeChanged(this.LJLIL, this.LJLILLLLZI);
        return C76800UCe.LIZ;
    }
}
