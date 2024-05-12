package X;

import kotlin.jvm.internal.o;

/* renamed from: X.9LT, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C9LT extends AbstractC65781Prl implements InterfaceC88472Yns<C26231ARf, C76800UCe> {
    public static final C9LT LJLIL = new C9LT();

    public C9LT() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C26231ARf c26231ARf) {
        C26231ARf it = c26231ARf;
        o.LJIIIZ(it, "it");
        Object obj = it.LJLJL;
        if (obj == null || o.LJ(obj, 1)) {
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("object_id", ((RBX) HG3.LJIILL()).getCurUserId());
            c188727au.LJIIIZ("country_code", C85990Xow.LIZ());
            c188727au.LJIIIZ("previous_page", "account_profile_page");
            FMX.LJIIL("scm_quit", c188727au.LIZ);
        }
        return C76800UCe.LIZ;
    }
}
