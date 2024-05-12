package com.bytedance.android.livesdk.model.message;

import X.InterfaceC65349Pkn;
import com.bytedance.android.live.base.model.user.User;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes14.dex */
public final class OptPairInfo {

    @InterfaceC65349Pkn("button_notice_type")
    public int buttonNoticeType;

    @InterfaceC65349Pkn("display_user_list")
    public List<OptPairUser> displayUserList = new ArrayList();

    @InterfaceC65349Pkn("expected_time_sec")
    public long expectedTimeSec;

    @InterfaceC65349Pkn("mapping_id")
    public long mappingId;

    /* loaded from: classes14.dex */
    public static final class OptPairUser {

        @InterfaceC65349Pkn("room_id")
        public long roomId;

        @InterfaceC65349Pkn("user")
        public User user;
    }
}
