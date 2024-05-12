package tikcast.api.privilege;

import X.InterfaceC65349Pkn;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes12.dex */
public final class QueryBadgeStyleRequest {

    /* loaded from: classes17.dex */
    public static final class Data {

        @InterfaceC65349Pkn("admin_param")
        public AdminParam adminParam;

        @InterfaceC65349Pkn("anchor_id")
        public long anchorId;

        @InterfaceC65349Pkn("fans_param")
        public FansParam fansParam;

        @InterfaceC65349Pkn("first_recharge_param")
        public FirstRechargeParam firstRechargeParam;

        @InterfaceC65349Pkn("logic_scene")
        public int logicScene;

        @InterfaceC65349Pkn("rank_list_param")
        public RankListParam rankListParam;

        @InterfaceC65349Pkn("room_id")
        public long roomId;

        @InterfaceC65349Pkn("subscriber_param")
        public SubscriberParam subscriberParam;

        @InterfaceC65349Pkn("user_grade_param")
        public UserGradeParam userGradeParam;

        @InterfaceC65349Pkn("user_id")
        public long userId;

        @InterfaceC65349Pkn("wanted_badge_scene_type_list")
        public List<Integer> wantedBadgeSceneTypeList = new ArrayList();
    }
}
