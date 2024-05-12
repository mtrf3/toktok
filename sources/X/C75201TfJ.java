package X;

import kotlin.jvm.internal.o;

/* renamed from: X.TfJ, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75201TfJ extends AbstractC65781Prl implements InterfaceC88472Yns<C75198TfG, C76800UCe> {
    public static final C75201TfJ LJLIL = new C75201TfJ();

    public C75201TfJ() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C75198TfG c75198TfG) {
        C75198TfG it = c75198TfG;
        o.LJIIIZ(it, "it");
        ((C73318Sq2) it.LIZIZ.LIZ.getValue()).dispose();
        it.LIZ().onDestroy();
        return C76800UCe.LIZ;
    }
}
