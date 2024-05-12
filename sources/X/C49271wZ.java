package X;

import kotlin.jvm.internal.o;

/* renamed from: X.1wZ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C49271wZ extends AbstractC65781Prl implements InterfaceC88472Yns<InterfaceC07280Qi, C76800UCe> {
    public final /* synthetic */ float LJLIL;
    public final /* synthetic */ InterfaceC78843Uwx<Float> LJLILLLLZI;
    public final /* synthetic */ int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C49271wZ(float f, InterfaceC78843Uwx<Float> interfaceC78843Uwx, int i) {
        super(1);
        this.LJLIL = f;
        this.LJLILLLLZI = interfaceC78843Uwx;
        this.LJLJI = i;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(InterfaceC07280Qi interfaceC07280Qi) {
        InterfaceC07280Qi semantics = interfaceC07280Qi;
        o.LJIIIZ(semantics, "$this$semantics");
        C07260Qg.LIZIZ.LIZ(semantics, C07260Qg.LIZ[1], new C0QU(((Number) C78842Uww.LJIILJJIL(Float.valueOf(this.LJLIL), this.LJLILLLLZI)).floatValue(), this.LJLILLLLZI, this.LJLJI));
        return C76800UCe.LIZ;
    }
}
