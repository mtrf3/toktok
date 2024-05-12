package X;

import kotlin.jvm.internal.o;

/* renamed from: X.LlR, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55197LlR extends AbstractC65781Prl implements InterfaceC88472Yns<C55127LkJ, Boolean> {
    public static final C55197LlR LJLIL = new C55197LlR();

    public C55197LlR() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Boolean invoke(C55127LkJ c55127LkJ) {
        boolean z;
        C55127LkJ it = c55127LkJ;
        o.LJIIIZ(it, "it");
        if (it.LIZ.getAwemeType() == 501) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
