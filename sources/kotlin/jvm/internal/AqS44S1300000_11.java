package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C68322mC;
import X.C68972R5c;
import X.C68987R5r;
import X.C76800UCe;
import X.InterfaceC88471Ynr;
import android.content.Context;
import android.view.View;
import com.kakao.sdk.auth.AuthApiClient;
import com.kakao.sdk.auth.AuthCodeClient;
import com.kakao.sdk.auth.model.OAuthToken;
import com.kakao.sdk.auth.network.RequiredScopesInterceptor$intercept$1$1$1$1;
import com.ss.android.ugc.aweme.account.login.model.BaseLoginMethod;
import com.ss.android.ugc.aweme.account.login.rememberaccount.LoginMethodListFragment;
import java.util.List;
import java.util.concurrent.CountDownLatch;

/* loaded from: classes12.dex */
public class AqS44S1300000_11 extends AbstractC65781Prl implements InterfaceC88471Ynr {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
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
            default:
                return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void invoke$0(String str, Throwable th) {
        if (th != 0) {
            ((C68322mC) this.l1).element = th;
            ((CountDownLatch) this.l2).countDown();
        } else {
            AuthApiClient companion = AuthApiClient.Companion.getInstance();
            o.LJI(str);
            companion.issueAccessToken(str, this.s0, new RequiredScopesInterceptor$intercept$1$1$1$1((C68322mC) this.l3, (C68322mC) this.l1, (CountDownLatch) this.l2));
        }
    }

    public final void invoke$1(String str, Throwable th) {
        if (th != null) {
            ((InterfaceC88471Ynr) this.l1).invoke(null, th);
            return;
        }
        AuthCodeClient.Companion companion = AuthCodeClient.Companion;
        String codeVerifier = companion.codeVerifier();
        AuthCodeClient.authorizeWithKakaoAccount$default(companion.getInstance(), (Context) this.l2, null, null, (List) this.l3, this.s0, str, null, null, false, null, null, codeVerifier, null, null, new AqS86S1100000_11((InterfaceC88471Ynr) this.l1, codeVerifier, 4), 14278, null);
    }

    public static /* bridge */ /* synthetic */ Object invoke$0(AqS44S1300000_11 aqS44S1300000_11, Object obj, Object obj2) {
        aqS44S1300000_11.invoke$0((String) obj, (Throwable) obj2);
        return C76800UCe.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$1(AqS44S1300000_11 aqS44S1300000_11, Object obj, Object obj2) {
        aqS44S1300000_11.invoke$1((String) obj, (Throwable) obj2);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS44S1300000_11 aqS44S1300000_11, Object obj, Object obj2) {
        int intValue = ((Number) obj).intValue();
        String str = (String) obj2;
        C68987R5r.LJFF(1, intValue, str);
        String str2 = aqS44S1300000_11.s0;
        LoginMethodListFragment loginMethodListFragment = (LoginMethodListFragment) aqS44S1300000_11.l1;
        C68972R5c.LJFF(false, intValue, str2, loginMethodListFragment, loginMethodListFragment.q9());
        ((LoginMethodListFragment) aqS44S1300000_11.l1).LJIJ();
        if (intValue != 1321 && intValue != 2029) {
            LoginMethodListFragment loginMethodListFragment2 = (LoginMethodListFragment) aqS44S1300000_11.l1;
            if (str == null) {
                str = "";
            }
            loginMethodListFragment2.Sg(intValue, str);
        } else {
            ((LoginMethodListFragment) aqS44S1300000_11.l1).Jl((BaseLoginMethod) aqS44S1300000_11.l3);
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS44S1300000_11(C68322mC c68322mC, C68322mC<Throwable> c68322mC2, CountDownLatch countDownLatch, String str, C68322mC<OAuthToken> c68322mC3) {
        super(2);
        this.$t = c68322mC3;
        this.l1 = c68322mC;
        this.l2 = c68322mC2;
        this.s0 = countDownLatch;
        this.l3 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS44S1300000_11(InterfaceC88471Ynr interfaceC88471Ynr, InterfaceC88471Ynr<? super OAuthToken, ? super Throwable, C76800UCe> interfaceC88471Ynr2, Context context, List<String> list, String str) {
        super(2);
        this.$t = str;
        this.l1 = interfaceC88471Ynr;
        this.l2 = interfaceC88471Ynr2;
        this.l3 = context;
        this.s0 = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS44S1300000_11(String str, LoginMethodListFragment loginMethodListFragment, View view, BaseLoginMethod baseLoginMethod, int i) {
        super(2);
        this.$t = i;
        this.s0 = str;
        this.l1 = loginMethodListFragment;
        this.l2 = view;
        this.l3 = baseLoginMethod;
    }
}
