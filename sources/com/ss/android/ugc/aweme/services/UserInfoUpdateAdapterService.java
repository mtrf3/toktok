package com.ss.android.ugc.aweme.services;

import X.C40532FvU;
import X.C58096Mr6;
import X.YNP;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.framework.services.IAccountInfoUpdateAdapterService;
import com.ss.android.ugc.aweme.profile.model.User;

/* loaded from: classes7.dex */
public final class UserInfoUpdateAdapterService implements IAccountInfoUpdateAdapterService {
    @Override // com.ss.android.ugc.aweme.framework.services.IAccountInfoUpdateAdapterService
    public int userDefaultAllowStatus() {
        return 1;
    }

    @Override // com.ss.android.ugc.aweme.framework.services.IAccountInfoUpdateAdapterService
    public User getUser() {
        User LIZ;
        C40532FvU c40532FvU = new C40532FvU();
        String string = c40532FvU.LIZIZ.getString("user_info", "");
        try {
            if (!TextUtils.isEmpty(string)) {
                LIZ = (User) c40532FvU.LIZ.LJI(string, User.class);
            } else {
                LIZ = new YNP().LIZ();
            }
            return LIZ;
        } catch (Exception unused) {
            return new User();
        }
    }

    public static IAccountInfoUpdateAdapterService createIAccountInfoUpdateAdapterServicebyMonsterPlugin(boolean z) {
        Object LIZ = C58096Mr6.LIZ(IAccountInfoUpdateAdapterService.class, z);
        if (LIZ != null) {
            return (IAccountInfoUpdateAdapterService) LIZ;
        }
        if (C58096Mr6.f6 == null) {
            synchronized (IAccountInfoUpdateAdapterService.class) {
                if (C58096Mr6.f6 == null) {
                    C58096Mr6.f6 = new UserInfoUpdateAdapterService();
                }
            }
        }
        return C58096Mr6.f6;
    }
}
