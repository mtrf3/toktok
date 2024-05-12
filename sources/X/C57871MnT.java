package X;

import kotlin.jvm.internal.o;

/* renamed from: X.MnT, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57871MnT extends AbstractC65781Prl implements InterfaceC88472Yns<C57866MnO, C76800UCe> {
    public static final C57871MnT LJLIL = new C57871MnT();

    public C57871MnT() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C57866MnO c57866MnO) {
        C57866MnO configApi = c57866MnO;
        o.LJIIIZ(configApi, "$this$configApi");
        configApi.LIZ(EnumC57876MnY.INBOX_PAGE);
        configApi.LJIIJJI = "inbox_shared_source";
        configApi.LJIIIZ = "inbox_shared_source";
        configApi.LJIIJ = true;
        return C76800UCe.LIZ;
    }
}
