package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Llk, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55216Llk extends AbstractC65781Prl implements InterfaceC88472Yns<C55127LkJ, Boolean> {
    public static final C55216Llk LJLIL = new C55216Llk();

    public C55216Llk() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Boolean invoke(C55127LkJ c55127LkJ) {
        boolean z;
        C55127LkJ typeParams = c55127LkJ;
        o.LJIIIZ(typeParams, "typeParams");
        if (typeParams.LIZ.getAwemeType() == 101 && !Z9N.LIZIZ.LJJIJLIJ(typeParams.LIZJ)) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
