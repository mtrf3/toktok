package com.ss.android.ugc.aweme.notice.api.bean;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;

/* loaded from: classes10.dex */
public final class FollowTabInfoStruct {

    @InterfaceC65349Pkn("followee_info")
    public List<? extends User> followeeInfo;

    @InterfaceC65349Pkn("level")
    public Integer level;

    @InterfaceC65349Pkn("prioritized_item_id")
    public String prioritizedItemId;

    public FollowTabInfoStruct(Integer num, String str, List<? extends User> list) {
        this.level = num;
        this.prioritizedItemId = str;
        this.followeeInfo = list;
    }
}
