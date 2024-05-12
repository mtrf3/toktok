package com.ss.android.ugc.aweme.framework.services;

import com.ss.android.ugc.aweme.profile.model.User;

/* loaded from: classes2.dex */
public interface IUserService {
    void clearUser();

    boolean getAuthGoods();

    User getCurrentUser();

    String getCurrentUserID();

    boolean isLogin();

    boolean isOldUser();

    boolean isUserEmpty(User user);

    void logout();

    void logout(String str, String str2);

    void refreshUser();

    void setBroadcasterRoomId(long j);

    void setIsOldUser(boolean z);
}
