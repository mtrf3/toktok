package com.bytedance.android.livesdk.chatroom.model.interact;

import X.InterfaceC65349Pkn;
import com.bytedance.android.live.base.model.ImageModel;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes14.dex */
public final class TagV2 {

    @InterfaceC65349Pkn("cohost_history_day")
    public long cohostHistoryDay;

    @InterfaceC65349Pkn("second_degree_relation_content")
    public SecondDegreeRelationContent secondDegreeRelationContent;

    @InterfaceC65349Pkn("tag_classification")
    public int tagClassification;

    @InterfaceC65349Pkn("tag_type")
    public int tagType;

    @InterfaceC65349Pkn("tag_value")
    public String tagValue = "";

    @InterfaceC65349Pkn("starling_key")
    public String starlingKey = "";

    /* loaded from: classes14.dex */
    public static final class SecondDegreeRelationContent {

        @InterfaceC65349Pkn("related_users")
        public List<UserInfo> relatedUsers = new ArrayList();

        @InterfaceC65349Pkn("total_related_user_cnt")
        public long totalRelatedUserCnt;

        /* loaded from: classes14.dex */
        public static final class UserInfo {

            @InterfaceC65349Pkn("avatar_thumb")
            public ImageModel avatarThumb;

            @InterfaceC65349Pkn("nick_name")
            public String nickName = "";

            @InterfaceC65349Pkn("user_id")
            public long userId;
        }
    }
}
