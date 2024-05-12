package X;

import kotlin.jvm.internal.o;

/* renamed from: X.MnU, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57872MnU extends AbstractC65781Prl implements InterfaceC88472Yns<C57866MnO, C76800UCe> {
    public static final C57872MnU LJLIL = new C57872MnU();

    public C57872MnU() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C57866MnO c57866MnO) {
        C57866MnO configApi = c57866MnO;
        o.LJIIIZ(configApi, "$this$configApi");
        configApi.LIZ(EnumC57876MnY.TT_SEARCH_PAGE);
        configApi.LIZJ = 30;
        configApi.LIZLLL = 30;
        return C76800UCe.LIZ;
    }
}
