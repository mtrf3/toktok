package X;

import com.ss.android.ugc.aweme.services.LoginMethodService;
import kotlin.jvm.internal.o;

/* renamed from: X.QvG, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68546QvG extends AbstractC65781Prl implements InterfaceC88472Yns<ARN, C76800UCe> {
    public static final C68546QvG LJLIL = new C68546QvG();

    public C68546QvG() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(ARN it) {
        o.LJIIIZ(it, "it");
        LoginMethodService LJIIIZ = R41.LIZIZ.LJIIIZ();
        o.LJIIIIZZ(LJIIIZ, "getService().loginMethodService()");
        LJIIIZ.updateAllowOneKeyLoginInfo(true, true);
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("user_id", R41.LIZIZ.LJFF().getCurUserId());
        c188727au.LJIIIZ("enter_from", "login");
        FMX.LJIIL("remember_login_info_confirm", c188727au.LIZ);
        return C76800UCe.LIZ;
    }
}
