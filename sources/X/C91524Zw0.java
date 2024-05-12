package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Zw0, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91524Zw0 extends AbstractC65781Prl implements InterfaceC88472Yns<InterfaceC91289ZsD, C76800UCe> {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ int LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C91524Zw0(int i, int i2) {
        super(1);
        this.LJLIL = i;
        this.LJLILLLLZI = i2;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(InterfaceC91289ZsD interfaceC91289ZsD) {
        InterfaceC91289ZsD it = interfaceC91289ZsD;
        o.LJIIIZ(it, "it");
        it.onVideoSizeChanged(this.LJLIL, this.LJLILLLLZI);
        return C76800UCe.LIZ;
    }
}
