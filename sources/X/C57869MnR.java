package X;

import kotlin.jvm.internal.o;

/* renamed from: X.MnR, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57869MnR extends AbstractC65781Prl implements InterfaceC88472Yns<C57866MnO, C76800UCe> {
    public static final C57869MnR LJLIL = new C57869MnR();

    public C57869MnR() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C57866MnO c57866MnO) {
        C57866MnO configApi = c57866MnO;
        o.LJIIIZ(configApi, "$this$configApi");
        configApi.LIZ(EnumC57876MnY.LEGACY_DM_LIST);
        configApi.LIZLLL = 30;
        configApi.LIZJ = 30;
        configApi.LIZIZ = 1;
        return C76800UCe.LIZ;
    }
}
