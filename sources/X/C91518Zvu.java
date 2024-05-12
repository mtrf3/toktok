package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Zvu, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91518Zvu extends AbstractC65781Prl implements InterfaceC88472Yns<InterfaceC91289ZsD, C76800UCe> {
    public final /* synthetic */ float LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C91518Zvu(float f) {
        super(1);
        this.LJLIL = f;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(InterfaceC91289ZsD interfaceC91289ZsD) {
        InterfaceC91289ZsD it = interfaceC91289ZsD;
        o.LJIIIZ(it, "it");
        it.onBufferingUpdate(this.LJLIL);
        return C76800UCe.LIZ;
    }
}
