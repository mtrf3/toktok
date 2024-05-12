package com.ss.android.ugc.aweme.account.profilebadge;

import X.AbstractC73672Svk;
import X.C68920R3c;
import X.E8L;

/* loaded from: classes12.dex */
public interface UserGetApi {
    public static final C68920R3c LIZ = C68920R3c.LIZ;

    @E8L("/aweme/v1/user/profile/self/")
    AbstractC73672Svk<UserGetResponse> getSelf();
}
