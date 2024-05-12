package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Jw0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50756Jw0 extends AbstractC65781Prl implements InterfaceC88472Yns<C50650JuI, Object> {
    public static final C50756Jw0 LJLIL = new C50756Jw0();

    public C50756Jw0() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Object invoke(C50650JuI c50650JuI) {
        C50650JuI it = c50650JuI;
        o.LJIIIZ(it, "it");
        String groupId = it.getSearchVideoModel().getGroupId();
        if (groupId == null) {
            return 0;
        }
        return groupId;
    }
}
