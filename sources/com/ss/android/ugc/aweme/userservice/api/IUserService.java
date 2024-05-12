package com.ss.android.ugc.aweme.userservice.api;

import X.AYX;
import X.AbstractC73672Svk;
import X.C35794E3a;
import X.C73422Sri;
import X.C73460SsK;
import com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData;
import com.ss.android.ugc.aweme.profile.model.BlockStatus;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.Map;

/* loaded from: classes5.dex */
public interface IUserService {
    C73422Sri LIZJ(String str, String str2);

    AbstractC73672Svk<C35794E3a<User>> LIZLLL(String str);

    AYX LJ();

    NextLiveData<FollowStatus> LJFF();

    C73460SsK LJI(int i, int i2, int i3, int i4, String str, String str2, String str3, String str4);

    NextLiveData<BlockStatus> LJII();

    FollowStatus LJIIIIZZ(int i, String str, String str2);

    FollowStatus LJIIIZ(int i, int i2, int i3, int i4, String str, String str2, String str3, String str4, String str5, Map map);
}
