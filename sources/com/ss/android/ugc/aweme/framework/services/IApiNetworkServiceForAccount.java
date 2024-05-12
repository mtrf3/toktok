package com.ss.android.ugc.aweme.framework.services;

import X.C66619QCp;
import com.ss.android.ugc.aweme.profile.UserResponse;
import com.ss.android.ugc.aweme.profile.model.AvatarUri;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;

/* loaded from: classes5.dex */
public interface IApiNetworkServiceForAccount {
    void executeGetForCheck(String str);

    User executeGetJSONObject(String str);

    User executePostJSONObjectForUser(String str, List<C66619QCp> list);

    UserResponse executePostJSONObjectForUserResponse(String str, List<C66619QCp> list);

    void registerNotice(String str, int i);

    AvatarUri uploadAvatar(String str, int i, String str2, List<C66619QCp> list);
}
