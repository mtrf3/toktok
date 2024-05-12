package X;

import com.ss.android.ugc.aweme.ecommerce.eventcenter.EventCenter;

/* loaded from: classes5.dex */
public final class B0A extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public static final B0A LJLIL = new B0A();

    public B0A() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        EventCenter.LJ().LIZ("ec_refresh_awaiting_payment", "{}");
        return C76800UCe.LIZ;
    }
}
