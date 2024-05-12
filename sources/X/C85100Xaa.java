package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Xaa, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85100Xaa extends AbstractC65781Prl implements InterfaceC88472Yns<InterfaceC85091XaR, C76800UCe> {
    public final /* synthetic */ float LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C85100Xaa(float f) {
        super(1);
        this.LJLIL = f;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(InterfaceC85091XaR interfaceC85091XaR) {
        InterfaceC85091XaR it = interfaceC85091XaR;
        o.LJIIIZ(it, "it");
        it.onBufferingUpdate(this.LJLIL);
        return C76800UCe.LIZ;
    }
}
