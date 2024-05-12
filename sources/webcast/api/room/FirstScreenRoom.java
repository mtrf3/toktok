package webcast.api.room;

import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdk.message.proto.LiveProInfo;
import com.bytedance.android.livesdk.model.Hashtag;
import com.bytedance.android.livesdk.model.InteractionQuestionInfo;
import com.bytedance.android.livesdk.model.PollInfo;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdk.model.RoomDecoration;
import com.bytedance.android.livesdk.model.RoomStats;
import com.bytedance.android.livesdk.model.TopFrameSummary;
import com.bytedance.android.livesdkapi.depend.model.live.BALinkStruct;
import com.bytedance.android.livesdkapi.depend.model.live.CommerceStruct;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
public final class FirstScreenRoom {

    @InterfaceC65349Pkn("advanced_poll_info")
    public PollInfo advancedPollInfo;

    @InterfaceC65349Pkn("anchor_live_pro_info")
    public LiveProInfo anchorLiveProInfo;

    @InterfaceC65349Pkn("anchor_tab_type")
    public int anchorTabType;

    @InterfaceC65349Pkn("ba_link_info")
    public BALinkStruct baLinkInfo;

    @InterfaceC65349Pkn("commerce_info")
    public CommerceStruct commerceInfo;

    @InterfaceC65349Pkn("hashtag")
    public Hashtag hashtag;

    @InterfaceC65349Pkn("interaction_question")
    public InteractionQuestionInfo interactionQuestion;

    @InterfaceC65349Pkn("interaction_question_version")
    public int interactionQuestionVersion;

    @InterfaceC65349Pkn("leads_gen_permission")
    public boolean leadsGenPermission;

    @InterfaceC65349Pkn("like_count")
    public long likeCount;

    @InterfaceC65349Pkn("live_sub_only")
    public long liveSubOnly;

    @InterfaceC65349Pkn("live_type_screenshot")
    public boolean liveTypeScreenshot;

    @InterfaceC65349Pkn("live_type_third_party")
    public boolean liveTypeThirdParty;

    @InterfaceC65349Pkn("multi_live_apply_permission")
    public long multiLiveApplyPermission;

    @InterfaceC65349Pkn("room_auth")
    public RoomAuthStatus roomAuth;

    @InterfaceC65349Pkn("room_layout")
    public long roomLayout;

    @InterfaceC65349Pkn("stats")
    public RoomStats stats;

    @InterfaceC65349Pkn("support_quiz")
    public long supportQuiz;

    @InterfaceC65349Pkn("top_frame_summary")
    public TopFrameSummary topFrameSummary;

    @InterfaceC65349Pkn("total_user")
    public long totalUser;

    @InterfaceC65349Pkn("user_count")
    public long userCount;

    @InterfaceC65349Pkn("with_linkmic")
    public boolean withLinkmic;

    @InterfaceC65349Pkn("leads_gen_model")
    public String leadsGenModel = "";

    @InterfaceC65349Pkn("deco_list")
    public List<RoomDecoration> decoList = new ArrayList();
}
