package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Jue, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50672Jue extends AbstractC65781Prl implements InterfaceC88472Yns<String, Boolean> {
    public static final C50672Jue LJLIL = new C50672Jue();

    public C50672Jue() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Boolean invoke(String it) {
        boolean z;
        o.LJIIIZ(it, "it");
        if (C50898JyI.LIZ() == EnumC50899JyJ.DOUBLE) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
