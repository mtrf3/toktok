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
public class AqS1S1501000_11 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public int i6;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public Object l5;
    public String s0;

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

    public static final Object invoke$0(AqS1S1501000_11 aqS1S1501000_11) {
        ((C65378PlG) aqS1S1501000_11.l1).LIZ.loginWithKakaoTalk((Context) aqS1S1501000_11.l2, aqS1S1501000_11.i6, aqS1S1501000_11.s0, (List) aqS1S1501000_11.l3, (List) aqS1S1501000_11.l4, new AqS193S0100000_11((InterfaceC88471Ynr) aqS1S1501000_11.l5, (InterfaceC88471Ynr<? super CertTokenInfo, ? super Throwable, C76800UCe>) 9));
        return C66532Q9g.LIZ(C76800UCe.LIZ);
    }

    public static final Object invoke$1(AqS1S1501000_11 aqS1S1501000_11) {
        return C85999Xp5.LIZLLL("Kakao", "loginWithKakaoTalk", C113554cx.LJJL(new OSZ("nonce", aqS1S1501000_11.s0), new OSZ("channelPublicIds", (List) aqS1S1501000_11.l1), new OSZ("serviceTerms", (List) aqS1S1501000_11.l2)), C66606QCc.LJLIL, new AqS1S1501000_11(aqS1S1501000_11.i6, (Context) aqS1S1501000_11.l4, (C65378PlG) aqS1S1501000_11.l3, aqS1S1501000_11.s0, (List) aqS1S1501000_11.l1, (List) aqS1S1501000_11.l2, (InterfaceC88471Ynr) aqS1S1501000_11.l5, 0));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS1S1501000_11(int i, Context context, C65378PlG c65378PlG, String str, List list, List list2, C65430Pm6 c65430Pm6, int i2) {
        super(0);
        this.$t = i2;
        this.s0 = str;
        this.l1 = list;
        this.l2 = list2;
        this.l3 = c65378PlG;
        this.l4 = context;
        this.i6 = i;
        this.l5 = c65430Pm6;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS1S1501000_11(int i, Context context, C65378PlG c65378PlG, String str, List list, List list2, InterfaceC88471Ynr interfaceC88471Ynr, int i2) {
        super(0);
        this.$t = i2;
        this.l1 = c65378PlG;
        this.l2 = context;
        this.i6 = i;
        this.s0 = str;
        this.l3 = list;
        this.l4 = list2;
        this.l5 = interfaceC88471Ynr;
    }
}
