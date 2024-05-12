package webcast.data;

import X.InterfaceC65349Pkn;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.BadgeStruct;
import com.bytedance.android.live.base.model.user.PrivilegeLogExtra;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes17.dex */
public final class RankUser {

    @InterfaceC65349Pkn("avatar_thumb")
    public ImageModel avatarThumb;

    @InterfaceC65349Pkn("border")
    public Border border;

    @InterfaceC65349Pkn("follow_info")
    public FollowInfo followInfo;

    @InterfaceC65349Pkn("follow_status")
    public long followStatus;

    @InterfaceC65349Pkn("id")
    public long id;

    @InterfaceC65349Pkn("secret")
    public int secret;

    @InterfaceC65349Pkn("nickname")
    public String nickname = "";

    @InterfaceC65349Pkn("display_id")
    public String displayId = "";

    @InterfaceC65349Pkn("badge_list")
    public List<BadgeStruct> badgeList = new ArrayList();

    @InterfaceC65349Pkn("id_str")
    public String idStr = "";

    /* loaded from: classes17.dex */
    public static final class Border {

        @InterfaceC65349Pkn("border_privilege_log_extra")
        public PrivilegeLogExtra borderPrivilegeLogExtra;

        @InterfaceC65349Pkn("icon")
        public ImageModel icon;

        @InterfaceC65349Pkn("level")
        public long level;

        @InterfaceC65349Pkn("profile_decoration_ribbon")
        public ImageModel profileDecorationRibbon;

        @InterfaceC65349Pkn("profile_privilege_log_extra")
        public PrivilegeLogExtra profilePrivilegeLogExtra;

        @InterfaceC65349Pkn("source")
        public String source = "";
    }

    /* loaded from: classes17.dex */
    public static final class FollowInfo {

        @InterfaceC65349Pkn("follow_status")
        public long followStatus;

        @InterfaceC65349Pkn("follower_count")
        public long followerCount;

        @InterfaceC65349Pkn("following_count")
        public long followingCount;

        @InterfaceC65349Pkn("push_status")
        public long pushStatus;
    }
}
