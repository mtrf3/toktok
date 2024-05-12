package webcast.im;

import X.InterfaceC65349Pkn;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.chatroom.model.interact.TopHostInfo;
import com.bytedance.android.livesdk.model.Hashtag;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes14.dex */
public final class JoinGroupMessageExtra {

    @InterfaceC65349Pkn("extra")
    public RivalExtra extra;

    @InterfaceC65349Pkn("other_users")
    public List<RivalExtra> otherUsers = new ArrayList();

    @InterfaceC65349Pkn("source_type")
    public long sourceType;

    /* loaded from: classes14.dex */
    public static final class RivalExtra {

        @InterfaceC65349Pkn("authentication_info")
        public AuthenticationInfo authenticationInfo;

        @InterfaceC65349Pkn("avatar_thumb")
        public ImageModel avatarThumb;

        @InterfaceC65349Pkn("follow_status")
        public long followStatus;

        @InterfaceC65349Pkn("hashtag")
        public Hashtag hashtag;

        @InterfaceC65349Pkn("is_best_teammate")
        public boolean isBestTeammate;

        @InterfaceC65349Pkn("top_host_info")
        public TopHostInfo topHostInfo;

        @InterfaceC65349Pkn("user_count")
        public long userCount;

        @InterfaceC65349Pkn("user_id")
        public long userId;

        @InterfaceC65349Pkn("display_id")
        public String displayId = "";

        @InterfaceC65349Pkn("nickname")
        public String nickname = "";

        /* loaded from: classes14.dex */
        public static final class AuthenticationInfo {

            @InterfaceC65349Pkn("authentication_badge")
            public ImageModel authenticationBadge;

            @InterfaceC65349Pkn("custom_verify")
            public String customVerify = "";

            @InterfaceC65349Pkn("enterprise_verify_reason")
            public String enterpriseVerifyReason = "";
        }
    }
}
