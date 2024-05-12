package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C113554cx;
import X.C65378PlG;
import X.C65430Pm6;
import X.C66532Q9g;
import X.C66606QCc;
import X.C76800UCe;
import X.C85999Xp5;
import X.InterfaceC65784Pro;
import X.InterfaceC88471Ynr;
import X.OSZ;
import android.content.Context;
import com.kakao.sdk.auth.model.CertTokenInfo;
import java.util.List;

/* loaded from: classes12.dex */
public class AqS0S2600000_11 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public Object l2;
    public Object l3;
    public Object l4;
    public Object l5;
    public Object l6;
    public Object l7;
    public String s0;
    public String s1;

    @Override // X.InterfaceC65784Pro
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS0S2600000_11 aqS0S2600000_11) {
        ((C65378PlG) aqS0S2600000_11.l2).LIZ.loginWithKakaoAccount((Context) aqS0S2600000_11.l3, (List) aqS0S2600000_11.l4, aqS0S2600000_11.s0, aqS0S2600000_11.s1, (List) aqS0S2600000_11.l5, (List) aqS0S2600000_11.l6, new AqS193S0100000_11((InterfaceC88471Ynr) aqS0S2600000_11.l7, (InterfaceC88471Ynr<? super CertTokenInfo, ? super Throwable, C76800UCe>) 8));
        return C66532Q9g.LIZ(C76800UCe.LIZ);
    }

    public static final Object invoke$1(AqS0S2600000_11 aqS0S2600000_11) {
        return C85999Xp5.LIZLLL("Kakao", "loginWithKakaoAccount", C113554cx.LJJL(new OSZ("prompts", (List) aqS0S2600000_11.l2), new OSZ("loginHint", aqS0S2600000_11.s0), new OSZ("nonce", aqS0S2600000_11.s1), new OSZ("channelPublicIds", (List) aqS0S2600000_11.l3), new OSZ("serviceTerms", (List) aqS0S2600000_11.l4)), C66606QCc.LJLIL, new AqS0S2600000_11((Context) aqS0S2600000_11.l6, (C65378PlG) aqS0S2600000_11.l5, aqS0S2600000_11.s0, aqS0S2600000_11.s1, (List) aqS0S2600000_11.l2, (List) aqS0S2600000_11.l3, (List) aqS0S2600000_11.l4, (InterfaceC88471Ynr) aqS0S2600000_11.l7, 0));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS0S2600000_11(Context context, C65378PlG c65378PlG, String str, String str2, List list, List list2, List list3, C65430Pm6 c65430Pm6, int i) {
        super(0);
        this.$t = i;
        this.l2 = list;
        this.s0 = str;
        this.s1 = str2;
        this.l3 = list2;
        this.l4 = list3;
        this.l5 = c65378PlG;
        this.l6 = context;
        this.l7 = c65430Pm6;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS0S2600000_11(Context context, C65378PlG c65378PlG, String str, String str2, List list, List list2, List list3, InterfaceC88471Ynr interfaceC88471Ynr, int i) {
        super(0);
        this.$t = i;
        this.l2 = c65378PlG;
        this.l3 = context;
        this.l4 = list;
        this.s0 = str;
        this.s1 = str2;
        this.l5 = list2;
        this.l6 = list3;
        this.l7 = interfaceC88471Ynr;
    }
}
