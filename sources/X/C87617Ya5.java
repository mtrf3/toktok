package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Ya5, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C87617Ya5 extends AbstractC65781Prl implements InterfaceC88472Yns<C41875Gc3, C76800UCe> {
    public final /* synthetic */ C87618Ya6 LJLIL;
    public final /* synthetic */ Throwable LJLILLLLZI;
    public final /* synthetic */ int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C87617Ya5(C87618Ya6 c87618Ya6, Throwable th, int i) {
        super(1);
        this.LJLIL = c87618Ya6;
        this.LJLILLLLZI = th;
        this.LJLJI = i;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C41875Gc3 c41875Gc3) {
        C41875Gc3 it = c41875Gc3;
        o.LJIIIZ(it, "it");
        this.LJLIL.LIZ.LJI.LJIIJJI(new C42360Gjs(this.LJLIL.LIZ.LJII, this.LJLILLLLZI, this.LJLJI, null, 8, null), it);
        return C76800UCe.LIZ;
    }
}
