package X;

import kotlin.jvm.internal.o;

/* renamed from: X.MDq, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56454MDq extends AbstractC65781Prl implements InterfaceC88472Yns<C56455MDr, C76800UCe> {
    public static final C56454MDq LJLIL = new C56454MDq();

    public C56454MDq() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C56455MDr c56455MDr) {
        C56455MDr config = c56455MDr;
        o.LJIIIZ(config, "$this$config");
        C34429DfF callback = C34429DfF.LJLIL;
        o.LJIIIZ(callback, "callback");
        config.LIZLLL = callback;
        return C76800UCe.LIZ;
    }
}
