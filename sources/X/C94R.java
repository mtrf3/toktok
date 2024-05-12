package X;

import com.bytedance.assem.arch.core.UIAssem;
import com.ss.android.ugc.profile.platform.business.header.business.cta.business.recommendbutton.ICTARecommendButtonAbility;
import kotlin.jvm.internal.o;

/* renamed from: X.94R, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C94R extends AbstractC65781Prl implements InterfaceC88471Ynr<UIAssem, Integer, C76800UCe> {
    public static final C94R LJLIL = new C94R();

    public C94R() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(UIAssem uIAssem, Integer num) {
        UIAssem selectSubscribe = uIAssem;
        int intValue = num.intValue();
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        ICTARecommendButtonAbility iCTARecommendButtonAbility = (ICTARecommendButtonAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(selectSubscribe), ICTARecommendButtonAbility.class, null);
        if (iCTARecommendButtonAbility != null) {
            iCTARecommendButtonAbility.xx(intValue);
        }
        return C76800UCe.LIZ;
    }
}
