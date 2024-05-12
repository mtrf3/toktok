package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Llb, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55207Llb extends AbstractC65781Prl implements InterfaceC88472Yns<C55127LkJ, Boolean> {
    public static final C55207Llb LJLIL = new C55207Llb();

    public C55207Llb() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Boolean invoke(C55127LkJ c55127LkJ) {
        boolean z;
        C55127LkJ it = c55127LkJ;
        o.LJIIIZ(it, "it");
        if (it.LIZ.getAwemeType() == 101 && Z9N.LIZIZ.LLL(it.LIZJ)) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
