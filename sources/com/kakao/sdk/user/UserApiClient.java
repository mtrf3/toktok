package com.kakao.sdk.user;

import X.C221108m2;
import X.C5H3;
import X.C65352Pkq;
import X.C76800UCe;
import X.InterfaceC74236TBo;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.TBT;
import android.content.Context;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import com.kakao.sdk.auth.AuthApiClient;
import com.kakao.sdk.auth.AuthCodeClient;
import com.kakao.sdk.auth.TokenManagerProvider;
import com.kakao.sdk.auth.model.CertTokenInfo;
import com.kakao.sdk.auth.model.OAuthToken;
import com.kakao.sdk.auth.model.Prompt;
import com.kakao.sdk.common.util.KakaoJson;
import com.kakao.sdk.network.ApiCallback;
import com.kakao.sdk.user.UserApi;
import com.kakao.sdk.user.model.AccessTokenInfo;
import com.kakao.sdk.user.model.ScopeInfo;
import com.kakao.sdk.user.model.User;
import com.kakao.sdk.user.model.UserServiceTerms;
import com.kakao.sdk.user.model.UserShippingAddresses;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS44S1300000_11;
import kotlin.jvm.internal.AqS86S1100000_11;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class UserApiClient {
    public static final Companion Companion = new Companion();
    public static final C5H3<UserApiClient> instance$delegate = C221108m2.LIZIZ(UserApiClient$Companion$instance$2.INSTANCE);
    public final TokenManagerProvider tokenManagerProvider;
    public final UserApi userApi;

    /* loaded from: classes12.dex */
    public static final class Companion {
        public static final /* synthetic */ InterfaceC74236TBo<Object>[] $$delegatedProperties;

        static {
            TBT tbt = new TBT(C65352Pkq.LIZ(Companion.class), "instance", "getInstance()Lcom/kakao/sdk/user/UserApiClient;");
            C65352Pkq.LIZ.getClass();
            $$delegatedProperties = new InterfaceC74236TBo[]{tbt};
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void getInstance$annotations() {
        }

        public final UserApiClient getInstance() {
            return UserApiClient.instance$delegate.getValue();
        }

        public Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UserApiClient() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static final UserApiClient getInstance() {
        return Companion.getInstance();
    }

    public final void certLoginWithKakaoAccount(Context context, InterfaceC88471Ynr<? super CertTokenInfo, ? super Throwable, C76800UCe> callback) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(callback, "callback");
        certLoginWithKakaoAccount$default(this, context, null, null, null, null, null, null, callback, 126, null);
    }

    public final void certLoginWithKakaoAccount(Context context, List<? extends Prompt> list, InterfaceC88471Ynr<? super CertTokenInfo, ? super Throwable, C76800UCe> callback) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(callback, "callback");
        certLoginWithKakaoAccount$default(this, context, list, null, null, null, null, null, callback, 124, null);
    }

    public final void certLoginWithKakaoAccount(Context context, List<? extends Prompt> list, String str, InterfaceC88471Ynr<? super CertTokenInfo, ? super Throwable, C76800UCe> callback) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(callback, "callback");
        certLoginWithKakaoAccount$default(this, context, list, str, null, null, null, null, callback, LiveTryModeCountDownThresholdSetting.DEFAULT, null);
    }

    public final void certLoginWithKakaoAccount(Context context, List<? extends Prompt> list, String str, String str2, InterfaceC88471Ynr<? super CertTokenInfo, ? super Throwable, C76800UCe> callback) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(callback, "callback");
        certLoginWithKakaoAccount$default(this, context, list, str, str2, null, null, null, callback, 112, null);
    }

    public final void certLoginWithKakaoAccount(Context context, List<? extends Prompt> list, String str, String str2, List<String> list2, InterfaceC88471Ynr<? super CertTokenInfo, ? super Throwable, C76800UCe> callback) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(callback, "callback");
        certLoginWithKakaoAccount$default(this, context, list, str, str2, list2, null, null, callback, 96, null);
    }

    public final void certLoginWithKakaoAccount(Context context, List<? extends Prompt> list, String str, String str2, List<String> list2, List<String> list3, InterfaceC88471Ynr<? super CertTokenInfo, ? super Throwable, C76800UCe> callback) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(callback, "callback");
        certLoginWithKakaoAccount$default(this, context, list, str, str2, list2, list3, null, callback, 64, null);
    }

    public final void certLoginWithKakaoTalk(Context context, InterfaceC88471Ynr<? super CertTokenInfo, ? super Throwable, C76800UCe> callback) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(callback, "callback");
        certLoginWithKakaoTalk$default(this, context, null, null, 0, null, null, null, callback, 126, null);
    }

    public final void certLoginWithKakaoTalk(Context context, List<? extends Prompt> list, InterfaceC88471Ynr<? super CertTokenInfo, ? super Throwable, C76800UCe> callback) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(callback, "callback");
        certLoginWithKakaoTalk$default(this, context, list, null, 0, null, null, null, callback, 124, null);
    }

    public final void certLoginWithKakaoTalk(Context context, List<? extends Prompt> list, String str, int i, InterfaceC88471Ynr<? super CertTokenInfo, ? super Throwable, C76800UCe> callback) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(callback, "callback");
        certLoginWithKakaoTalk$default(this, context, list, str, i, null, null, null, callback, 112, null);
    }

    public final void certLoginWithKakaoTalk(Context context, List<? extends Prompt> list, String str, int i, String str2, InterfaceC88471Ynr<? super CertTokenInfo, ? super Throwable, C76800UCe> callback) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(callback, "callback");
        certLoginWithKakaoTalk$default(this, context, list, str, i, str2, null, null, callback, 96, null);
    }

    public final void certLoginWithKakaoTalk(Context context, List<? extends Prompt> list, String str, int i, String str2, List<String> list2, InterfaceC88471Ynr<? super CertTokenInfo, ? super Throwable, C76800UCe> callback) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(callback, "callback");
        certLoginWithKakaoTalk$default(this, context, list, str, i, str2, list2, null, callback, 64, null);
    }

    public final void certLoginWithKakaoTalk(Context context, List<? extends Prompt> list, String str, InterfaceC88471Ynr<? super CertTokenInfo, ? super Throwable, C76800UCe> callback) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(callback, "callback");
        certLoginWithKakaoTalk$default(this, context, list, str, 0, null, null, null, callback, LiveTryModeCountDownThresholdSetting.DEFAULT, null);
    }

    public final void loginWithKakaoAccount(Context context, InterfaceC88471Ynr<? super OAuthToken, ? super Throwable, C76800UCe> callback) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(callback, "callback");
        loginWithKakaoAccount$default(this, context, null, null, null, null, null, callback, 62, null);
    }

    public final void loginWithKakaoAccount(Context context, List<? extends Prompt> list, InterfaceC88471Ynr<? super OAuthToken, ? super Throwable, C76800UCe> callback) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(callback, "callback");
        loginWithKakaoAccount$default(this, context, list, null, null, null, null, callback, 60, null);
    }

    public final void loginWithKakaoAccount(Context context, List<? extends Prompt> list, String str, InterfaceC88471Ynr<? super OAuthToken, ? super Throwable, C76800UCe> callback) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(callback, "callback");
        loginWithKakaoAccount$default(this, context, list, str, null, null, null, callback, 56, null);
    }

    public final void loginWithKakaoAccount(Context context, List<? extends Prompt> list, String str, String str2, InterfaceC88471Ynr<? super OAuthToken, ? super Throwable, C76800UCe> callback) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(callback, "callback");
        loginWithKakaoAccount$default(this, context, list, str, str2, null, null, callback, 48, null);
    }

    public final void loginWithKakaoAccount(Context context, List<? extends Prompt> list, String str, String str2, List<String> list2, InterfaceC88471Ynr<? super OAuthToken, ? super Throwable, C76800UCe> callback) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(callback, "callback");
        loginWithKakaoAccount$default(this, context, list, str, str2, list2, null, callback, 32, null);
    }

    public final void loginWithKakaoTalk(Context context, int i, InterfaceC88471Ynr<? super OAuthToken, ? super Throwable, C76800UCe> callback) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(callback, "callback");
        loginWithKakaoTalk$default(this, context, i, null, null, null, callback, 28, null);
    }

    public final void loginWithKakaoTalk(Context context, int i, String str, InterfaceC88471Ynr<? super OAuthToken, ? super Throwable, C76800UCe> callback) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(callback, "callback");
        loginWithKakaoTalk$default(this, context, i, str, null, null, callback, 24, null);
    }

    public final void loginWithKakaoTalk(Context context, int i, String str, List<String> list, InterfaceC88471Ynr<? super OAuthToken, ? super Throwable, C76800UCe> callback) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(callback, "callback");
        loginWithKakaoTalk$default(this, context, i, str, list, null, callback, 16, null);
    }

    public final void loginWithKakaoTalk(Context context, InterfaceC88471Ynr<? super OAuthToken, ? super Throwable, C76800UCe> callback) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(callback, "callback");
        loginWithKakaoTalk$default(this, context, 0, null, null, null, callback, 30, null);
    }

    public final void me(InterfaceC88471Ynr<? super User, ? super Throwable, C76800UCe> callback) {
        o.LJIIIZ(callback, "callback");
        me$default(this, false, callback, 1, null);
    }

    public final void shippingAddresses(InterfaceC88471Ynr<? super UserShippingAddresses, ? super Throwable, C76800UCe> callback) {
        o.LJIIIZ(callback, "callback");
        shippingAddresses$default(this, null, null, callback, 3, null);
    }

    public final void shippingAddresses(Date date, InterfaceC88471Ynr<? super UserShippingAddresses, ? super Throwable, C76800UCe> callback) {
        o.LJIIIZ(callback, "callback");
        shippingAddresses$default(this, date, null, callback, 2, null);
    }

    private final List<Prompt> makeCertPrompts(List<? extends Prompt> list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            arrayList.addAll(list);
        }
        arrayList.add(Prompt.CERT);
        return arrayList;
    }

    public final void accessTokenInfo(final InterfaceC88471Ynr<? super AccessTokenInfo, ? super Throwable, C76800UCe> callback) {
        o.LJIIIZ(callback, "callback");
        this.userApi.accessTokenInfo().LLLZ(new ApiCallback<AccessTokenInfo>() { // from class: com.kakao.sdk.user.UserApiClient$accessTokenInfo$1
            @Override // com.kakao.sdk.network.ApiCallback
            public void onComplete(AccessTokenInfo accessTokenInfo, Throwable th) {
                callback.invoke(accessTokenInfo, th);
            }
        });
    }

    public final boolean isKakaoTalkLoginAvailable(Context context) {
        o.LJIIIZ(context, "context");
        return AuthCodeClient.Companion.getInstance().isKakaoTalkLoginAvailable(context);
    }

    public final void logout(final InterfaceC88472Yns<? super Throwable, C76800UCe> callback) {
        o.LJIIIZ(callback, "callback");
        this.userApi.logout().LLLZ(new ApiCallback<C76800UCe>() { // from class: com.kakao.sdk.user.UserApiClient$logout$1
            @Override // com.kakao.sdk.network.ApiCallback
            public void onComplete(C76800UCe c76800UCe, Throwable th) {
                UserApiClient.this.tokenManagerProvider.getManager().clear();
                callback.invoke(th);
            }
        });
    }

    public final void unlink(final InterfaceC88472Yns<? super Throwable, C76800UCe> callback) {
        o.LJIIIZ(callback, "callback");
        this.userApi.unlink().LLLZ(new ApiCallback<C76800UCe>() { // from class: com.kakao.sdk.user.UserApiClient$unlink$1
            @Override // com.kakao.sdk.network.ApiCallback
            public void onComplete(C76800UCe c76800UCe, Throwable th) {
                if (th == null) {
                    UserApiClient.this.tokenManagerProvider.getManager().clear();
                }
                callback.invoke(th);
            }
        });
    }

    public UserApiClient(UserApi userApi, TokenManagerProvider tokenManagerProvider) {
        o.LJIIIZ(userApi, "userApi");
        o.LJIIIZ(tokenManagerProvider, "tokenManagerProvider");
        this.userApi = userApi;
        this.tokenManagerProvider = tokenManagerProvider;
    }

    public final void me(boolean z, final InterfaceC88471Ynr<? super User, ? super Throwable, C76800UCe> callback) {
        o.LJIIIZ(callback, "callback");
        UserApi.DefaultImpls.me$default(this.userApi, z, null, 2, null).LLLZ(new ApiCallback<User>() { // from class: com.kakao.sdk.user.UserApiClient$me$1
            @Override // com.kakao.sdk.network.ApiCallback
            public void onComplete(User user, Throwable th) {
                callback.invoke(user, th);
            }
        });
    }

    public final void revokeScopes(List<String> scopes, final InterfaceC88471Ynr<? super ScopeInfo, ? super Throwable, C76800UCe> callback) {
        o.LJIIIZ(scopes, "scopes");
        o.LJIIIZ(callback, "callback");
        this.userApi.revokeScopes(KakaoJson.INSTANCE.toJson(scopes)).LLLZ(new ApiCallback<ScopeInfo>() { // from class: com.kakao.sdk.user.UserApiClient$revokeScopes$1
            @Override // com.kakao.sdk.network.ApiCallback
            public void onComplete(ScopeInfo scopeInfo, Throwable th) {
                callback.invoke(scopeInfo, th);
            }
        });
    }

    public final void scopes(List<String> list, final InterfaceC88471Ynr<? super ScopeInfo, ? super Throwable, C76800UCe> callback) {
        String json;
        o.LJIIIZ(callback, "callback");
        UserApi userApi = this.userApi;
        if (list == null) {
            json = null;
        } else {
            json = KakaoJson.INSTANCE.toJson(list);
        }
        userApi.scopes(json).LLLZ(new ApiCallback<ScopeInfo>() { // from class: com.kakao.sdk.user.UserApiClient$scopes$1
            @Override // com.kakao.sdk.network.ApiCallback
            public void onComplete(ScopeInfo scopeInfo, Throwable th) {
                callback.invoke(scopeInfo, th);
            }
        });
    }

    public final void serviceTerms(String str, final InterfaceC88471Ynr<? super UserServiceTerms, ? super Throwable, C76800UCe> callback) {
        o.LJIIIZ(callback, "callback");
        this.userApi.serviceTerms(str).LLLZ(new ApiCallback<UserServiceTerms>() { // from class: com.kakao.sdk.user.UserApiClient$serviceTerms$1
            @Override // com.kakao.sdk.network.ApiCallback
            public void onComplete(UserServiceTerms userServiceTerms, Throwable th) {
                callback.invoke(userServiceTerms, th);
            }
        });
    }

    public final void shippingAddresses(long j, final InterfaceC88471Ynr<? super UserShippingAddresses, ? super Throwable, C76800UCe> callback) {
        o.LJIIIZ(callback, "callback");
        UserApi.DefaultImpls.shippingAddresses$default(this.userApi, Long.valueOf(j), null, null, 6, null).LLLZ(new ApiCallback<UserShippingAddresses>() { // from class: com.kakao.sdk.user.UserApiClient$shippingAddresses$2
            @Override // com.kakao.sdk.network.ApiCallback
            public void onComplete(UserShippingAddresses userShippingAddresses, Throwable th) {
                callback.invoke(userShippingAddresses, th);
            }
        });
    }

    public final void signup(Map<String, String> map, final InterfaceC88472Yns<? super Throwable, C76800UCe> callback) {
        o.LJIIIZ(callback, "callback");
        this.userApi.signup(map).LLLZ(new ApiCallback<C76800UCe>() { // from class: com.kakao.sdk.user.UserApiClient$signup$1
            @Override // com.kakao.sdk.network.ApiCallback
            public void onComplete(C76800UCe c76800UCe, Throwable th) {
                callback.invoke(th);
            }
        });
    }

    public final void updateProfile(Map<String, String> properties, final InterfaceC88472Yns<? super Throwable, C76800UCe> callback) {
        o.LJIIIZ(properties, "properties");
        o.LJIIIZ(callback, "callback");
        this.userApi.updateProfile(properties).LLLZ(new ApiCallback<C76800UCe>() { // from class: com.kakao.sdk.user.UserApiClient$updateProfile$1
            @Override // com.kakao.sdk.network.ApiCallback
            public void onComplete(C76800UCe c76800UCe, Throwable th) {
                callback.invoke(th);
            }
        });
    }

    public final void shippingAddresses(Date date, Integer num, final InterfaceC88471Ynr<? super UserShippingAddresses, ? super Throwable, C76800UCe> callback) {
        o.LJIIIZ(callback, "callback");
        UserApi.DefaultImpls.shippingAddresses$default(this.userApi, null, date, num, 1, null).LLLZ(new ApiCallback<UserShippingAddresses>() { // from class: com.kakao.sdk.user.UserApiClient$shippingAddresses$1
            @Override // com.kakao.sdk.network.ApiCallback
            public void onComplete(UserShippingAddresses userShippingAddresses, Throwable th) {
                callback.invoke(userShippingAddresses, th);
            }
        });
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ UserApiClient(com.kakao.sdk.user.UserApi r3, com.kakao.sdk.auth.TokenManagerProvider r4, int r5, kotlin.jvm.internal.DefaultConstructorMarker r6) {
        /*
            r2 = this;
            r0 = r5 & 1
            if (r0 == 0) goto L17
            com.kakao.sdk.network.ApiFactory r0 = com.kakao.sdk.network.ApiFactory.INSTANCE
            X.PfS r1 = com.kakao.sdk.auth.network.ApiFactoryKt.getKapiWithOAuth(r0)
            java.lang.Class<com.kakao.sdk.user.UserApi> r0 = com.kakao.sdk.user.UserApi.class
            java.lang.Object r3 = r1.LIZIZ(r0)
            java.lang.String r0 = "ApiFactory.kapiWithOAuth.create(UserApi::class.java)"
            kotlin.jvm.internal.o.LJIIIIZZ(r3, r0)
            com.kakao.sdk.user.UserApi r3 = (com.kakao.sdk.user.UserApi) r3
        L17:
            r0 = r5 & 2
            if (r0 == 0) goto L21
            com.kakao.sdk.auth.TokenManagerProvider$Companion r0 = com.kakao.sdk.auth.TokenManagerProvider.Companion
            com.kakao.sdk.auth.TokenManagerProvider r4 = r0.getInstance()
        L21:
            r2.<init>(r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kakao.sdk.user.UserApiClient.<init>(com.kakao.sdk.user.UserApi, com.kakao.sdk.auth.TokenManagerProvider, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final void loginWithNewScopes(Context context, List<String> scopes, String str, InterfaceC88471Ynr<? super OAuthToken, ? super Throwable, C76800UCe> callback) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(scopes, "scopes");
        o.LJIIIZ(callback, "callback");
        AuthApiClient.Companion.getInstance().agt(new AqS44S1300000_11((InterfaceC88471Ynr) callback, (InterfaceC88471Ynr<? super OAuthToken, ? super Throwable, C76800UCe>) context, (Context) scopes, (List<String>) str, (String) 1));
    }

    public static /* synthetic */ void me$default(UserApiClient userApiClient, boolean z, InterfaceC88471Ynr interfaceC88471Ynr, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        userApiClient.me(z, interfaceC88471Ynr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void scopes$default(UserApiClient userApiClient, List list, InterfaceC88471Ynr interfaceC88471Ynr, int i, Object obj) {
        if ((i & 1) != 0) {
            list = null;
        }
        userApiClient.scopes(list, interfaceC88471Ynr);
    }

    public static /* synthetic */ void serviceTerms$default(UserApiClient userApiClient, String str, InterfaceC88471Ynr interfaceC88471Ynr, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        userApiClient.serviceTerms(str, interfaceC88471Ynr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void signup$default(UserApiClient userApiClient, Map map, InterfaceC88472Yns interfaceC88472Yns, int i, Object obj) {
        if ((i & 1) != 0) {
            map = null;
        }
        userApiClient.signup(map, interfaceC88472Yns);
    }

    public static /* synthetic */ void shippingAddresses$default(UserApiClient userApiClient, Date date, Integer num, InterfaceC88471Ynr interfaceC88471Ynr, int i, Object obj) {
        if ((i & 1) != 0) {
            date = null;
        }
        if ((i & 2) != 0) {
            num = null;
        }
        userApiClient.shippingAddresses(date, num, interfaceC88471Ynr);
    }

    public final void loginWithKakaoTalk(Context context, int i, String str, List<String> list, List<String> list2, InterfaceC88471Ynr<? super OAuthToken, ? super Throwable, C76800UCe> callback) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(callback, "callback");
        AuthCodeClient.Companion companion = AuthCodeClient.Companion;
        String codeVerifier = companion.codeVerifier();
        companion.getInstance().authorizeWithKakaoTalk(context, null, null, i, str, list, list2, codeVerifier, new AqS86S1100000_11(callback, codeVerifier, 3));
    }

    public static /* synthetic */ void loginWithNewScopes$default(UserApiClient userApiClient, Context context, List list, String str, InterfaceC88471Ynr interfaceC88471Ynr, int i, Object obj) {
        if ((i & 4) != 0) {
            str = null;
        }
        userApiClient.loginWithNewScopes(context, list, str, interfaceC88471Ynr);
    }

    public final void loginWithKakaoAccount(Context context, List<? extends Prompt> list, String str, String str2, List<String> list2, List<String> list3, InterfaceC88471Ynr<? super OAuthToken, ? super Throwable, C76800UCe> callback) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(callback, "callback");
        AuthCodeClient.Companion companion = AuthCodeClient.Companion;
        String codeVerifier = companion.codeVerifier();
        AuthCodeClient.authorizeWithKakaoAccount$default(companion.getInstance(), context, list, null, null, str2, null, list2, list3, false, str, null, codeVerifier, null, null, new AqS86S1100000_11(callback, codeVerifier, 2), 13612, null);
    }

    public final void certLoginWithKakaoAccount(Context context, List<? extends Prompt> list, String str, String str2, List<String> list2, List<String> list3, String str3, InterfaceC88471Ynr<? super CertTokenInfo, ? super Throwable, C76800UCe> callback) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(callback, "callback");
        AuthCodeClient.Companion companion = AuthCodeClient.Companion;
        String codeVerifier = companion.codeVerifier();
        AuthCodeClient.authorizeWithKakaoAccount$default(companion.getInstance(), context, makeCertPrompts(list), str, null, str2, null, list2, list3, false, str3, null, codeVerifier, null, null, new AqS86S1100000_11(callback, codeVerifier, 0), 13608, null);
    }

    public final void certLoginWithKakaoTalk(Context context, List<? extends Prompt> list, String str, int i, String str2, List<String> list2, List<String> list3, InterfaceC88471Ynr<? super CertTokenInfo, ? super Throwable, C76800UCe> callback) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(callback, "callback");
        AuthCodeClient.Companion companion = AuthCodeClient.Companion;
        String codeVerifier = companion.codeVerifier();
        companion.getInstance().authorizeWithKakaoTalk(context, makeCertPrompts(list), str, i, str2, list2, list3, codeVerifier, new AqS86S1100000_11(callback, codeVerifier, 1));
    }

    public static /* synthetic */ void loginWithKakaoTalk$default(UserApiClient userApiClient, Context context, int i, String str, List list, List list2, InterfaceC88471Ynr interfaceC88471Ynr, int i2, Object obj) {
        List list3 = list;
        int i3 = i;
        String str2 = str;
        if ((i2 & 2) != 0) {
            i3 = 10012;
        }
        List list4 = null;
        if ((i2 & 4) != 0) {
            str2 = null;
        }
        if ((i2 & 8) != 0) {
            list3 = null;
        }
        if ((i2 & 16) == 0) {
            list4 = list2;
        }
        userApiClient.loginWithKakaoTalk(context, i3, str2, list3, list4, interfaceC88471Ynr);
    }

    public static /* synthetic */ void loginWithKakaoAccount$default(UserApiClient userApiClient, Context context, List list, String str, String str2, List list2, List list3, InterfaceC88471Ynr interfaceC88471Ynr, int i, Object obj) {
        String str3 = str;
        List list4 = list;
        String str4 = str2;
        List list5 = list2;
        List list6 = null;
        if ((i & 2) != 0) {
            list4 = null;
        }
        if ((i & 4) != 0) {
            str3 = null;
        }
        if ((i & 8) != 0) {
            str4 = null;
        }
        if ((i & 16) != 0) {
            list5 = null;
        }
        if ((i & 32) == 0) {
            list6 = list3;
        }
        userApiClient.loginWithKakaoAccount(context, list4, str3, str4, list5, list6, interfaceC88471Ynr);
    }

    public static /* synthetic */ void certLoginWithKakaoAccount$default(UserApiClient userApiClient, Context context, List list, String str, String str2, List list2, List list3, String str3, InterfaceC88471Ynr interfaceC88471Ynr, int i, Object obj) {
        String str4 = str;
        List list4 = list;
        String str5 = str2;
        List list5 = list2;
        List list6 = list3;
        String str6 = null;
        if ((i & 2) != 0) {
            list4 = null;
        }
        if ((i & 4) != 0) {
            str4 = null;
        }
        if ((i & 8) != 0) {
            str5 = null;
        }
        if ((i & 16) != 0) {
            list5 = null;
        }
        if ((i & 32) != 0) {
            list6 = null;
        }
        if ((i & 64) == 0) {
            str6 = str3;
        }
        userApiClient.certLoginWithKakaoAccount(context, list4, str4, str5, list5, list6, str6, interfaceC88471Ynr);
    }

    public static /* synthetic */ void certLoginWithKakaoTalk$default(UserApiClient userApiClient, Context context, List list, String str, int i, String str2, List list2, List list3, InterfaceC88471Ynr interfaceC88471Ynr, int i2, Object obj) {
        String str3 = str;
        List list4 = list;
        int i3 = i;
        String str4 = str2;
        List list5 = list2;
        List list6 = null;
        if ((i2 & 2) != 0) {
            list4 = null;
        }
        if ((i2 & 4) != 0) {
            str3 = null;
        }
        if ((i2 & 8) != 0) {
            i3 = 10012;
        }
        if ((i2 & 16) != 0) {
            str4 = null;
        }
        if ((i2 & 32) != 0) {
            list5 = null;
        }
        if ((i2 & 64) == 0) {
            list6 = list3;
        }
        userApiClient.certLoginWithKakaoTalk(context, list4, str3, i3, str4, list5, list6, interfaceC88471Ynr);
    }
}
