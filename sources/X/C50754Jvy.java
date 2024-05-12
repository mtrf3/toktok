package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Jvy, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50754Jvy extends AbstractC65781Prl implements InterfaceC88472Yns<C50650JuI, Object> {
    public static final C50754Jvy LJLIL = new C50754Jvy();

    public C50754Jvy() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Object invoke(C50650JuI c50650JuI) {
        C50650JuI it = c50650JuI;
        o.LJIIIZ(it, "it");
        Long searchSessionId = it.getSearchSessionModel().getSearchSessionId();
        if (searchSessionId == null) {
            return 0;
        }
        return searchSessionId;
    }
}
