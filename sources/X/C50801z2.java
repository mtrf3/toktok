package X;

import kotlin.jvm.internal.o;

/* renamed from: X.1z2, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C50801z2 extends AbstractC65781Prl implements InterfaceC88472Yns<C04Z, C76800UCe> {
    public final /* synthetic */ InterfaceC07740Sc LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50801z2(InterfaceC07740Sc interfaceC07740Sc, boolean z) {
        super(1);
        this.LJLIL = interfaceC07740Sc;
        this.LJLILLLLZI = z;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C04Z c04z) {
        C04Z $receiver = c04z;
        o.LJIIIZ($receiver, "$this$$receiver");
        $receiver.LIZ.LIZ("align", this.LJLIL);
        $receiver.LIZ.LIZ("unbounded", Boolean.valueOf(this.LJLILLLLZI));
        return C76800UCe.LIZ;
    }
}
