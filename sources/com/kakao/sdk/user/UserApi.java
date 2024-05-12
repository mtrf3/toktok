package com.kakao.sdk.user;

import X.C76800UCe;
import X.E4Q;
import X.E4T;
import X.InterfaceC195787mI;
import X.InterfaceC64987Pex;
import X.InterfaceC64989Pez;
import X.InterfaceC65079PgR;
import com.kakao.sdk.common.json.IntDate;
import com.kakao.sdk.user.model.AccessTokenInfo;
import com.kakao.sdk.user.model.ScopeInfo;
import com.kakao.sdk.user.model.User;
import com.kakao.sdk.user.model.UserServiceTerms;
import com.kakao.sdk.user.model.UserShippingAddresses;
import java.util.Date;
import java.util.Map;

/* loaded from: classes12.dex */
public interface UserApi {
    @E4Q("/v1/user/access_token_info")
    InterfaceC65079PgR<AccessTokenInfo> accessTokenInfo();

    @E4T("/v1/user/logout")
    InterfaceC65079PgR<C76800UCe> logout();

    @E4Q("/v2/user/me")
    InterfaceC65079PgR<User> me(@InterfaceC64989Pez("secure_resource") boolean z, @InterfaceC64989Pez("property_keys") String str);

    @InterfaceC195787mI
    @E4T("/v2/user/revoke/scopes")
    InterfaceC65079PgR<ScopeInfo> revokeScopes(@InterfaceC64987Pex("scopes") String str);

    @E4Q("/v2/user/scopes")
    InterfaceC65079PgR<ScopeInfo> scopes(@InterfaceC64989Pez("scopes") String str);

    @E4Q("/v1/user/service/terms")
    InterfaceC65079PgR<UserServiceTerms> serviceTerms(@InterfaceC64989Pez("extra") String str);

    @E4Q("/v1/user/shipping_address")
    InterfaceC65079PgR<UserShippingAddresses> shippingAddresses(@InterfaceC64989Pez("address_id") Long l, @InterfaceC64989Pez("from_updated_at") @IntDate Date date, @InterfaceC64989Pez("page_size") Integer num);

    @InterfaceC195787mI
    @E4T("/v1/user/signup")
    InterfaceC65079PgR<C76800UCe> signup(@InterfaceC64987Pex("properties") Map<String, String> map);

    @E4T("/v1/user/unlink")
    InterfaceC65079PgR<C76800UCe> unlink();

    @InterfaceC195787mI
    @E4T("/v1/user/update_profile")
    InterfaceC65079PgR<C76800UCe> updateProfile(@InterfaceC64987Pex("properties") Map<String, String> map);

    /* loaded from: classes12.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ InterfaceC65079PgR scopes$default(UserApi userApi, String str, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    str = null;
                }
                return userApi.scopes(str);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: scopes");
        }

        public static /* synthetic */ InterfaceC65079PgR serviceTerms$default(UserApi userApi, String str, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    str = null;
                }
                return userApi.serviceTerms(str);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: serviceTerms");
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ InterfaceC65079PgR signup$default(UserApi userApi, Map map, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    map = null;
                }
                return userApi.signup(map);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: signup");
        }

        public static /* synthetic */ InterfaceC65079PgR me$default(UserApi userApi, boolean z, String str, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    z = true;
                }
                if ((i & 2) != 0) {
                    str = null;
                }
                return userApi.me(z, str);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: me");
        }

        public static /* synthetic */ InterfaceC65079PgR shippingAddresses$default(UserApi userApi, Long l, Date date, Integer num, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    l = null;
                }
                if ((i & 2) != 0) {
                    date = null;
                }
                if ((i & 4) != 0) {
                    num = null;
                }
                return userApi.shippingAddresses(l, date, num);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: shippingAddresses");
        }
    }
}
