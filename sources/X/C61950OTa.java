package X;

import com.ss.android.ugc.aweme.authorize.BaseI18nAuthorizedFragment;
import kotlin.jvm.internal.o;

/* renamed from: X.OTa, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61950OTa extends AbstractC65781Prl implements InterfaceC88472Yns<ARN, C76800UCe> {
    public static final C61950OTa LJLIL = new C61950OTa();

    public C61950OTa() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(ARN it) {
        o.LJIIIZ(it, "it");
        InterfaceC36571c5 interfaceC36571c5 = BaseI18nAuthorizedFragment.LLD;
        if (interfaceC36571c5 instanceof InterfaceC61966OTq) {
            o.LJII(interfaceC36571c5, "null cannot be cast to non-null type com.ss.android.ugc.aweme.authorize.api.II18nAuthorizeAccountSwitchHandler");
            ((InterfaceC61966OTq) interfaceC36571c5).P2("auth_error_switch_account");
        }
        return C76800UCe.LIZ;
    }
}
