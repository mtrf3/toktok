package com.ss.android.ugc.aweme.services;

import X.C38300F1k;
import X.C38341F2z;
import X.C38891fp;
import X.C46104I7o;
import X.C58096Mr6;
import X.C66619QCp;
import X.C76L;
import X.E8L;
import X.E8M;
import X.InterfaceC195747mE;
import X.InterfaceC195757mF;
import X.InterfaceC36229EJt;
import X.InterfaceC37276Ek4;
import X.QJY;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.framework.services.IApiNetworkServiceForAccount;
import com.ss.android.ugc.aweme.profile.UserResponse;
import com.ss.android.ugc.aweme.profile.model.AvatarUri;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class ApiNetworkServiceForAccount implements IApiNetworkServiceForAccount {
    public AccountApi mApi = (AccountApi) C46104I7o.LJIIZILJ(Api.LIZ, AccountApi.class);

    /* loaded from: classes7.dex */
    public interface AccountApi {
        @E8L
        InterfaceC37276Ek4<String> doGet(@InterfaceC195747mE String str);

        @E8M
        @InterfaceC195757mF
        InterfaceC37276Ek4<String> doPost(@InterfaceC195747mE String str, @InterfaceC36229EJt Map<String, String> map);

        @E8M
        @InterfaceC195757mF
        C76L<UserResponse> postUserResponse(@InterfaceC195747mE String str, @InterfaceC36229EJt Map<String, String> map);
    }

    public static IApiNetworkServiceForAccount createIApiNetworkServiceForAccountbyMonsterPlugin(boolean z) {
        Object LIZ = C58096Mr6.LIZ(IApiNetworkServiceForAccount.class, z);
        if (LIZ != null) {
            return (IApiNetworkServiceForAccount) LIZ;
        }
        if (C58096Mr6.y5 == null) {
            synchronized (IApiNetworkServiceForAccount.class) {
                if (C58096Mr6.y5 == null) {
                    C58096Mr6.y5 = new ApiNetworkServiceForAccount();
                }
            }
        }
        return C58096Mr6.y5;
    }

    @Override // com.ss.android.ugc.aweme.framework.services.IApiNetworkServiceForAccount
    public void executeGetForCheck(String str) {
        Api.LIZ(this.mApi.doGet(str).execute().LIZIZ, str);
    }

    @Override // com.ss.android.ugc.aweme.framework.services.IApiNetworkServiceForAccount
    public User executeGetJSONObject(String str) {
        String str2 = this.mApi.doGet(str).execute().LIZIZ;
        JSONObject jSONObject = new JSONObject(str2);
        Api.LIZIZ(str2, str, jSONObject);
        return (User) GsonProtectorUtils.fromJson(GsonHolder.LIZLLL().LIZ(), jSONObject.opt("user").toString(), User.class);
    }

    @Override // com.ss.android.ugc.aweme.framework.services.IApiNetworkServiceForAccount
    public User executePostJSONObjectForUser(String str, List<C66619QCp> list) {
        HashMap hashMap = new HashMap();
        if (!C38891fp.LJJI(list)) {
            for (C66619QCp c66619QCp : list) {
                hashMap.put(c66619QCp.LJLIL, c66619QCp.LJLILLLLZI);
            }
            QJY.LJI(hashMap, true);
        }
        String str2 = this.mApi.doPost(str, hashMap).execute().LIZIZ;
        JSONObject jSONObject = new JSONObject(str2);
        Api.LIZIZ(str2, str, jSONObject);
        return (User) GsonProtectorUtils.fromJson(GsonHolder.LIZLLL().LIZ(), jSONObject.opt("user").toString(), User.class);
    }

    @Override // com.ss.android.ugc.aweme.framework.services.IApiNetworkServiceForAccount
    public UserResponse executePostJSONObjectForUserResponse(String str, List<C66619QCp> list) {
        HashMap hashMap = new HashMap();
        if (!C38891fp.LJJI(list)) {
            for (C66619QCp c66619QCp : list) {
                hashMap.put(c66619QCp.LJLIL, c66619QCp.LJLILLLLZI);
            }
            QJY.LJI(hashMap, true);
        }
        return this.mApi.postUserResponse(str, hashMap).get();
    }

    @Override // com.ss.android.ugc.aweme.framework.services.IApiNetworkServiceForAccount
    public void registerNotice(String str, int i) {
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("phone_number", str);
        }
        hashMap.put("login_type", String.valueOf(i));
        QJY.LJI(hashMap, true);
        AccountApi accountApi = this.mApi;
        String str2 = Api.LIZLLL;
        Api.LIZ(accountApi.doPost(str2, hashMap).execute().LIZIZ, str2);
    }

    @Override // com.ss.android.ugc.aweme.framework.services.IApiNetworkServiceForAccount
    public AvatarUri uploadAvatar(String str, int i, String str2, List<C66619QCp> list) {
        Object LJ;
        if (list == null) {
            if (String.class.equals(AvatarUri.class)) {
                LJ = Api.LJ(str, i, str2, C38300F1k.LIZ, "data");
            } else {
                LJ = Api.LJ(str, i, str2, new C38341F2z(AvatarUri.class), "data");
            }
            return (AvatarUri) LJ;
        }
        return (AvatarUri) Api.LJFF(str, i, str2, AvatarUri.class, "data", list);
    }
}
