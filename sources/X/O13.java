package X;

import com.bytedance.router.SmartRoute;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class O13 extends AbstractC65781Prl implements InterfaceC88472Yns<SmartRoute, C76800UCe> {
    public static final O13 LJLIL = new O13();

    public O13() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(SmartRoute smartRoute) {
        SmartRoute $receiver = smartRoute;
        o.LJIIIZ($receiver, "$this$$receiver");
        $receiver.withParam("url", "https://www.tiktok.com/tpp/account/delete/unregistered-user");
        $receiver.withParam("hide_nav_bar", true);
        return C76800UCe.LIZ;
    }
}
