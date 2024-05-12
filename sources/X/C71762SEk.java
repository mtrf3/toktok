package X;

import com.ss.android.ugc.aweme.ecommerce.eventcenter.EventCenter;
import com.ss.android.ugc.aweme.ecommerce.singpass.SingPassResponse;
import kotlin.jvm.internal.o;

/* renamed from: X.SEk, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71762SEk extends AbstractC65781Prl implements InterfaceC88472Yns<SingPassResponse, C76800UCe> {
    public static final C71762SEk LJLIL = new C71762SEk();

    public C71762SEk() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(SingPassResponse singPassResponse) {
        o.LJIIIZ(singPassResponse, "singPassResponse");
        EventCenter.LJ().LIZ("receive_singpass_user_info", C27739Aud.LJI(singPassResponse));
        return C76800UCe.LIZ;
    }
}
