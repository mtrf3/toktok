package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Xac, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85102Xac extends AbstractC65781Prl implements InterfaceC88472Yns<InterfaceC85091XaR, C76800UCe> {
    public final /* synthetic */ long LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C85102Xac(long j) {
        super(1);
        this.LJLIL = j;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(InterfaceC85091XaR interfaceC85091XaR) {
        InterfaceC85091XaR it = interfaceC85091XaR;
        o.LJIIIZ(it, "it");
        it.onPlaybackTimeChanged(this.LJLIL);
        return C76800UCe.LIZ;
    }
}
