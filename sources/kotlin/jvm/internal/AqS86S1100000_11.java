package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C76800UCe;
import X.InterfaceC88471Ynr;
import com.kakao.sdk.auth.AuthApiClient;
import com.kakao.sdk.auth.model.CertTokenInfo;

/* loaded from: classes12.dex */
public class AqS86S1100000_11 extends AbstractC65781Prl implements InterfaceC88471Ynr {
    public final int $t;
    public Object l1;
    public String s0;

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
            default:
                return null;
        }
    }

    public final void invoke$0(String str, Throwable th) {
        if (th != null) {
            ((InterfaceC88471Ynr) this.l1).invoke(null, th);
            return;
        }
        AuthApiClient companion = AuthApiClient.Companion.getInstance();
        o.LJI(str);
        companion.issueAccessTokenWithCert(str, this.s0, new AqS193S0100000_11((InterfaceC88471Ynr) this.l1, (InterfaceC88471Ynr<? super CertTokenInfo, ? super Throwable, C76800UCe>) 0));
    }

    public final void invoke$1(String str, Throwable th) {
        if (th != null) {
            ((InterfaceC88471Ynr) this.l1).invoke(null, th);
            return;
        }
        AuthApiClient companion = AuthApiClient.Companion.getInstance();
        o.LJI(str);
        companion.issueAccessTokenWithCert(str, this.s0, new AqS193S0100000_11((InterfaceC88471Ynr) this.l1, (InterfaceC88471Ynr<? super CertTokenInfo, ? super Throwable, C76800UCe>) 1));
    }

    public final void invoke$2(String str, Throwable th) {
        if (th != null) {
            ((InterfaceC88471Ynr) this.l1).invoke(null, th);
            return;
        }
        AuthApiClient companion = AuthApiClient.Companion.getInstance();
        o.LJI(str);
        companion.issueAccessToken(str, this.s0, new AqS193S0100000_11((InterfaceC88471Ynr) this.l1, (InterfaceC88471Ynr<? super CertTokenInfo, ? super Throwable, C76800UCe>) 2));
    }

    public final void invoke$3(String str, Throwable th) {
        if (th != null) {
            ((InterfaceC88471Ynr) this.l1).invoke(null, th);
            return;
        }
        AuthApiClient companion = AuthApiClient.Companion.getInstance();
        o.LJI(str);
        companion.issueAccessToken(str, this.s0, new AqS193S0100000_11((InterfaceC88471Ynr) this.l1, (InterfaceC88471Ynr<? super CertTokenInfo, ? super Throwable, C76800UCe>) 3));
    }

    public final void invoke$4(String str, Throwable th) {
        if (th != null) {
            ((InterfaceC88471Ynr) this.l1).invoke(null, th);
            return;
        }
        AuthApiClient companion = AuthApiClient.Companion.getInstance();
        o.LJI(str);
        companion.issueAccessToken(str, this.s0, new AqS193S0100000_11((InterfaceC88471Ynr) this.l1, (InterfaceC88471Ynr<? super CertTokenInfo, ? super Throwable, C76800UCe>) 4));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS86S1100000_11(InterfaceC88471Ynr interfaceC88471Ynr, InterfaceC88471Ynr<? super CertTokenInfo, ? super Throwable, C76800UCe> interfaceC88471Ynr2, String str) {
        super(2);
        this.$t = str;
        this.l1 = interfaceC88471Ynr;
        this.s0 = interfaceC88471Ynr2;
    }

    public static /* bridge */ /* synthetic */ Object invoke$0(AqS86S1100000_11 aqS86S1100000_11, Object obj, Object obj2) {
        aqS86S1100000_11.invoke$0((String) obj, (Throwable) obj2);
        return C76800UCe.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$1(AqS86S1100000_11 aqS86S1100000_11, Object obj, Object obj2) {
        aqS86S1100000_11.invoke$1((String) obj, (Throwable) obj2);
        return C76800UCe.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$2(AqS86S1100000_11 aqS86S1100000_11, Object obj, Object obj2) {
        aqS86S1100000_11.invoke$2((String) obj, (Throwable) obj2);
        return C76800UCe.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$3(AqS86S1100000_11 aqS86S1100000_11, Object obj, Object obj2) {
        aqS86S1100000_11.invoke$3((String) obj, (Throwable) obj2);
        return C76800UCe.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$4(AqS86S1100000_11 aqS86S1100000_11, Object obj, Object obj2) {
        aqS86S1100000_11.invoke$4((String) obj, (Throwable) obj2);
        return C76800UCe.LIZ;
    }
}
