package X;

import kotlin.jvm.internal.o;

/* renamed from: X.25J, reason: invalid class name */
/* loaded from: classes.dex */
public final class C25J extends AbstractC65781Prl implements InterfaceC88472Yns<InterfaceC33691Tx, C76800UCe> {
    public final /* synthetic */ long LJLIL;
    public final /* synthetic */ float LJLILLLLZI;
    public final /* synthetic */ long LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25J(float f, long j, long j2) {
        super(1);
        this.LJLIL = j;
        this.LJLILLLLZI = f;
        this.LJLJI = j2;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(InterfaceC33691Tx interfaceC33691Tx) {
        InterfaceC33691Tx Canvas = interfaceC33691Tx;
        o.LJIIIZ(Canvas, "$this$Canvas");
        float LIZIZ = C10430b1.LIZIZ(Canvas.LIZIZ());
        C21660t8.LIZIZ(Canvas, 1.0f, this.LJLIL, LIZIZ);
        C21660t8.LIZIZ(Canvas, this.LJLILLLLZI, this.LJLJI, LIZIZ);
        return C76800UCe.LIZ;
    }
}
