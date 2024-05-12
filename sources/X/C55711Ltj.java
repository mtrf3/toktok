package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Ltj, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55711Ltj extends AbstractC65781Prl implements InterfaceC88472Yns<C55127LkJ, Boolean> {
    public static final C55711Ltj LJLIL = new C55711Ltj();

    public C55711Ltj() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Boolean invoke(C55127LkJ c55127LkJ) {
        boolean z;
        C55127LkJ typeParams = c55127LkJ;
        o.LJIIIZ(typeParams, "typeParams");
        if (C195937mX.LJII(typeParams.LIZ) && !C55697LtV.LIZ(typeParams.LIZ) && C195937mX.LJFF(typeParams.LIZ)) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
