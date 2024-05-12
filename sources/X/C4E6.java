package X;

import kotlin.jvm.internal.o;

/* renamed from: X.4E6, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4E6 extends AbstractC65781Prl implements InterfaceC88472Yns<C105934Dt, C105934Dt> {
    public final /* synthetic */ float LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4E6(float f) {
        super(1);
        this.LJLIL = f;
    }

    @Override // X.InterfaceC88472Yns
    public final C105934Dt invoke(C105934Dt c105934Dt) {
        C4E2 c4e2;
        C105934Dt setState = c105934Dt;
        o.LJIIIZ(setState, "$this$setState");
        if (this.LJLIL > 0.2d) {
            c4e2 = C4E2.HIGH_VOLUME;
        } else {
            c4e2 = C4E2.LOW_VOLUME;
        }
        return C105934Dt.LIZ(setState, false, null, null, null, c4e2, 15);
    }
}
