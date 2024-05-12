package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C65375PlD;
import X.C66497Q7x;
import X.C68517Qun;
import X.C76800UCe;
import X.InterfaceC65784Pro;
import X.InterfaceC88471Ynr;
import com.kakao.sdk.auth.model.CertTokenInfo;
import com.kakao.sdk.auth.model.OAuthToken;
import com.kakao.sdk.user.model.AccessTokenInfo;
import com.ss.android.ugc.aweme.shortvideo.network.ToolsInterceptor;

/* loaded from: classes12.dex */
public class AqS193S0100000_11 extends AbstractC65781Prl implements InterfaceC88471Ynr {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC88471Ynr
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            case 2:
                return invoke$2(this, obj, obj2);
            case 3:
                return invoke$3(this, obj, obj2);
            case 4:
                return invoke$4(this, obj, obj2);
            case 5:
                return invoke$5(this, obj, obj2);
            case 6:
                return invoke$6(this, obj, obj2);
            case 7:
                return invoke$7(this, obj, obj2);
            case 8:
                return invoke$8(this, obj, obj2);
            case 9:
                return invoke$9(this, obj, obj2);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS193S0100000_11(InterfaceC65784Pro interfaceC65784Pro, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro2) {
        super(2);
        this.$t = interfaceC65784Pro2;
        this.l0 = interfaceC65784Pro;
    }

    public final void invoke$0(CertTokenInfo certTokenInfo, Throwable th) {
        ((InterfaceC88471Ynr) this.l0).invoke(certTokenInfo, th);
    }

    public final void invoke$1(CertTokenInfo certTokenInfo, Throwable th) {
        ((InterfaceC88471Ynr) this.l0).invoke(certTokenInfo, th);
    }

    public final void invoke$2(OAuthToken oAuthToken, Throwable th) {
        ((InterfaceC88471Ynr) this.l0).invoke(oAuthToken, th);
    }

    public final void invoke$3(OAuthToken oAuthToken, Throwable th) {
        ((InterfaceC88471Ynr) this.l0).invoke(oAuthToken, th);
    }

    public final void invoke$4(OAuthToken oAuthToken, Throwable th) {
        ((InterfaceC88471Ynr) this.l0).invoke(oAuthToken, th);
    }

    public final void invoke$5(String uid, String token) {
        o.LJIIIZ(uid, "uid");
        o.LJIIIZ(token, "token");
        ((InterfaceC65784Pro) this.l0).invoke();
        C68517Qun.LIZ.LIZLLL(uid, token, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS193S0100000_11(C66497Q7x c66497Q7x, int i) {
        super(2);
        this.$t = i;
        this.l0 = c66497Q7x;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS193S0100000_11(InterfaceC88471Ynr interfaceC88471Ynr, InterfaceC88471Ynr<? super CertTokenInfo, ? super Throwable, C76800UCe> interfaceC88471Ynr2) {
        super(2);
        this.$t = interfaceC88471Ynr2;
        this.l0 = interfaceC88471Ynr;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS193S0100000_11(ToolsInterceptor toolsInterceptor, int i) {
        super(2);
        this.$t = i;
        this.l0 = toolsInterceptor;
    }

    public static /* bridge */ /* synthetic */ Object invoke$0(AqS193S0100000_11 aqS193S0100000_11, Object obj, Object obj2) {
        aqS193S0100000_11.invoke$0((CertTokenInfo) obj, (Throwable) obj2);
        return C76800UCe.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$1(AqS193S0100000_11 aqS193S0100000_11, Object obj, Object obj2) {
        aqS193S0100000_11.invoke$1((CertTokenInfo) obj, (Throwable) obj2);
        return C76800UCe.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$2(AqS193S0100000_11 aqS193S0100000_11, Object obj, Object obj2) {
        aqS193S0100000_11.invoke$2((OAuthToken) obj, (Throwable) obj2);
        return C76800UCe.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$3(AqS193S0100000_11 aqS193S0100000_11, Object obj, Object obj2) {
        aqS193S0100000_11.invoke$3((OAuthToken) obj, (Throwable) obj2);
        return C76800UCe.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$4(AqS193S0100000_11 aqS193S0100000_11, Object obj, Object obj2) {
        aqS193S0100000_11.invoke$4((OAuthToken) obj, (Throwable) obj2);
        return C76800UCe.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$5(AqS193S0100000_11 aqS193S0100000_11, Object obj, Object obj2) {
        aqS193S0100000_11.invoke$5((String) obj, (String) obj2);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$6(AqS193S0100000_11 aqS193S0100000_11, Object obj, Object obj2) {
        ((ToolsInterceptor) aqS193S0100000_11.l0).LJLIL = ((Boolean) obj).booleanValue();
        ((ToolsInterceptor) aqS193S0100000_11.l0).LJLILLLLZI = (String) obj2;
        return C76800UCe.LIZ;
    }

    public static final Object invoke$7(AqS193S0100000_11 aqS193S0100000_11, Object obj, Object obj2) {
        AccessTokenInfo accessTokenInfo = (AccessTokenInfo) obj;
        if (accessTokenInfo == null) {
            ((InterfaceC88471Ynr) aqS193S0100000_11.l0).invoke(null, obj2);
        } else {
            ((InterfaceC88471Ynr) aqS193S0100000_11.l0).invoke(new com.bytedance.tpsw.bpea.kakao.auth.model.AccessTokenInfo(accessTokenInfo), obj2);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$8(AqS193S0100000_11 aqS193S0100000_11, Object obj, Object obj2) {
        OAuthToken oAuthToken = (OAuthToken) obj;
        if (oAuthToken == null) {
            ((InterfaceC88471Ynr) aqS193S0100000_11.l0).invoke(null, obj2);
        } else {
            ((InterfaceC88471Ynr) aqS193S0100000_11.l0).invoke(new C65375PlD(oAuthToken), obj2);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$9(AqS193S0100000_11 aqS193S0100000_11, Object obj, Object obj2) {
        OAuthToken oAuthToken = (OAuthToken) obj;
        if (oAuthToken == null) {
            ((InterfaceC88471Ynr) aqS193S0100000_11.l0).invoke(null, obj2);
        } else {
            ((InterfaceC88471Ynr) aqS193S0100000_11.l0).invoke(new C65375PlD(oAuthToken), obj2);
        }
        return C76800UCe.LIZ;
    }
}
