package com.ss.android.ugc.aweme.services;

import X.C58096Mr6;
import X.HG3;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.profile.model.User;

/* loaded from: classes5.dex */
public class BaseUserService implements IUserService {
    @Override // com.ss.android.ugc.aweme.framework.services.IUserService
    public void clearUser() {
    }

    @Override // com.ss.android.ugc.aweme.framework.services.IUserService
    public void refreshUser() {
    }

    @Override // com.ss.android.ugc.aweme.framework.services.IUserService
    public boolean getAuthGoods() {
        return HG3.LJIILL().getAuthGoods();
    }

    @Override // com.ss.android.ugc.aweme.framework.services.IUserService
    public User getCurrentUser() {
        return HG3.LJIILL().getCurUser();
    }

    @Override // com.ss.android.ugc.aweme.framework.services.IUserService
    public String getCurrentUserID() {
        return HG3.LJIILL().getCurUserId();
    }

    @Override // com.ss.android.ugc.aweme.framework.services.IUserService
    public boolean isLogin() {
        return HG3.LJIILL().isLogin();
    }

    @Override // com.ss.android.ugc.aweme.framework.services.IUserService
    public boolean isOldUser() {
        return SharePrefCache.inst().getIsOldUser().LIZ().booleanValue();
    }

    @Override // com.ss.android.ugc.aweme.framework.services.IUserService
    public void logout() {
        HG3.LJIIIIZZ().logout("expired_logout", "sdk_expired_logout");
    }

    public static IUserService createIUserServicebyMonsterPlugin(boolean z) {
        Object LIZ = C58096Mr6.LIZ(IUserService.class, z);
        if (LIZ != null) {
            return (IUserService) LIZ;
        }
        if (C58096Mr6.A5 == null) {
            synchronized (IUserService.class) {
                if (C58096Mr6.A5 == null) {
                    C58096Mr6.A5 = new BaseUserService();
                }
            }
        }
        return C58096Mr6.A5;
    }

    @Override // com.ss.android.ugc.aweme.framework.services.IUserService
    public boolean isUserEmpty(User user) {
        return HG3.LJIILL().isUserEmpty(user);
    }

    @Override // com.ss.android.ugc.aweme.framework.services.IUserService
    public void setBroadcasterRoomId(long j) {
        HG3.LJIILL().getCurUser().setBroadcasterRoomId(j);
    }

    @Override // com.ss.android.ugc.aweme.framework.services.IUserService
    public void setIsOldUser(boolean z) {
        SharePrefCache.inst().getIsOldUser().LIZLLL(Boolean.valueOf(z));
    }

    @Override // com.ss.android.ugc.aweme.framework.services.IUserService
    public void logout(String str, String str2) {
        HG3.LJIIIIZZ().logout(str, str2);
    }
}
