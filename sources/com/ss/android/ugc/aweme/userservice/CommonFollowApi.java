package com.ss.android.ugc.aweme.userservice;

import X.AbstractC73672Svk;
import X.C2YJ;
import X.C55888Lwa;
import X.C76L;
import X.E8L;
import X.InterfaceC36228EJs;
import X.InterfaceC64986Pew;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.services.MainServiceImpl;
import com.ss.android.ugc.aweme.services.RetrofitService;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes10.dex */
public final class CommonFollowApi {
    public static final FollowService LIZ = (FollowService) RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit(MainServiceImpl.createIMainServicebyMonsterPlugin(false).getApiUrlPrefix()).create(FollowService.class);

    /* loaded from: classes10.dex */
    public interface FollowService {
        @E8L("/aweme/v3/f2f/follow/")
        C76L<FollowStatus> face2FaceFollow(@InterfaceC64986Pew("user_id") String str, @InterfaceC64986Pew("sec_user_id") String str2);

        @E8L("/aweme/v1/commit/follow/user/")
        C76L<FollowStatus> follow(@InterfaceC36228EJs Map<String, String> map);

        @E8L("/aweme/v1/remove/follower/")
        AbstractC73672Svk<BaseResponse> remove(@InterfaceC64986Pew("user_id") String str, @InterfaceC64986Pew("sec_user_id") String str2);
    }

    public static FollowStatus LIZ(int i, int i2, int i3, int i4, String str, String str2, String str3, String str4, String str5, Map map) {
        Integer secIdSwitch;
        HashMap hashMap = new HashMap();
        if (TextUtils.isEmpty(str2) || ((secIdSwitch = C2YJ.LIZIZ.LIZ.getSecIdSwitch()) != null && secIdSwitch.intValue() == 0)) {
            hashMap.put("user_id", str);
        }
        if (!TextUtils.isEmpty(str2)) {
            hashMap.put("sec_user_id", str2);
        }
        hashMap.put("type", String.valueOf(i));
        hashMap.put("channel_id", String.valueOf(i3));
        hashMap.put("city", str4);
        if (i2 != -1) {
            hashMap.put("from", String.valueOf(i2));
            if (i == 1) {
                hashMap.put("from_pre", C55888Lwa.LIZIZ.LJII(String.valueOf(i2), String.valueOf(i4)));
            } else {
                hashMap.put("from_pre", String.valueOf(i4));
            }
        }
        if (!TextUtils.isEmpty(str3)) {
            hashMap.put("item_id", str3);
        }
        if (!TextUtils.isEmpty(str5)) {
            hashMap.put("rec_type", str5);
        }
        if (map != null) {
            hashMap.putAll(map);
        }
        FollowStatus followStatus = LIZ.follow(hashMap).get();
        followStatus.secUserId = str2;
        followStatus.userId = str;
        return followStatus;
    }
}
