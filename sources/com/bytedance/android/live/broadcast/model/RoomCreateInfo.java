package com.bytedance.android.live.broadcast.model;

import X.InterfaceC65349Pkn;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.game.model.GameLiveFragment;
import com.bytedance.android.livesdk.message.proto.CppAgeVerificationInfo;
import com.bytedance.android.livesdk.message.proto.LiveProInfo;
import com.bytedance.android.livesdk.message.proto.WebcastLSAccessStatus;
import com.bytedance.android.livesdk.model.Hashtag;
import com.bytedance.android.livesdk.model.message.BannerInRoomCollection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class RoomCreateInfo {

    @InterfaceC65349Pkn("admin_ec_show_permission")
    public Map<Long, Long> adminEcShowPermission;

    @InterfaceC65349Pkn("age_restricted_config")
    public AgeRestrictedConfig ageRestrictedConfig;

    @InterfaceC65349Pkn("anchor_can_open_caption")
    public boolean anchorCanOpenCaption;

    @InterfaceC65349Pkn("star_comment_qualification")
    public boolean anchorStarCommentPermission;

    @InterfaceC65349Pkn("banner_data")
    public BannerInRoomCollection.BannerInfo bannerInfo;

    @InterfaceC65349Pkn("block_detail_url")
    public String blockDetailUrl;

    @InterfaceC65349Pkn("ban_status")
    public BlockStatus blockStatus;

    @InterfaceC65349Pkn("can_show_fragment")
    public boolean canShowFragment;

    @InterfaceC65349Pkn("cover_source")
    public String coverSource;

    @InterfaceC65349Pkn("cpp_age_verification_info")
    public CppAgeVerificationInfo cppAgeVerificationInfo;

    @InterfaceC65349Pkn("cpp_banner_info")
    public CppBannerInfo cppBannerInfo;

    @InterfaceC65349Pkn("device_level")
    public int deviceLevel;

    @InterfaceC65349Pkn("donation_sticker")
    public int donationSticker;

    @InterfaceC65349Pkn("anchor_can_pin_message")
    public boolean enablePinMessage;

    @InterfaceC65349Pkn("fold_bottom_area")
    public boolean foldBottomArea;

    @InterfaceC65349Pkn("game_live_convert_info")
    public GameLiveConvertInfo gameLiveConvertInfo;

    @InterfaceC65349Pkn("game_live_info")
    public GameLiveInfo gameLiveInfo;

    @InterfaceC65349Pkn("guide_status")
    public int guideStatus;

    @InterfaceC65349Pkn("has_fragment")
    public boolean hasFragment;

    @InterfaceC65349Pkn("hashtag")
    public Hashtag hashtag;

    @InterfaceC65349Pkn("is_new_anchor")
    public boolean isNewAnchor;

    @InterfaceC65349Pkn("last_fragment")
    public GameLiveFragment lastFragment;

    @InterfaceC65349Pkn("anchor_live_pro_info")
    public LiveProInfo liveProInfo;

    @InterfaceC65349Pkn("live_house_status")
    public Long live_house_status;

    @InterfaceC65349Pkn("live_additional_prompt")
    public String mAdditionalPrompt;

    @InterfaceC65349Pkn("anchor_fans_info")
    public AnchorFansInfo mAnchorFansInfo;

    @InterfaceC65349Pkn("anchor_prompt_type")
    public int mAnchorPromptType;

    @InterfaceC65349Pkn("live_scenario")
    public BroadcastConfig mBroadcastConfig;

    @InterfaceC65349Pkn("cover")
    public ImageModel mCover;

    @InterfaceC65349Pkn("cover_audit_status")
    public long mCoverAuditStatus;

    @InterfaceC65349Pkn("never_go_live_flag")
    public int mIsFirstBroadcastFlag;

    @InterfaceC65349Pkn("last_room_id")
    public long mLastRoomId;

    @InterfaceC65349Pkn("go_live_prompt")
    public String mPrompt;

    @InterfaceC65349Pkn("title")
    public String mTitle;

    @InterfaceC65349Pkn("perception_message")
    public CreateInfoPerceptionMessage perceptionMessage;

    @InterfaceC65349Pkn("perception_messages")
    public List<CreateInfoPerceptionMessage> perceptionMessages;

    @InterfaceC65349Pkn("permission_level_info")
    public PermissionLevelInfo permissionLevelInfo;

    @InterfaceC65349Pkn("poll_optimize_group")
    public long pollOptimizeGroup;

    @InterfaceC65349Pkn("pop_info")
    public PopMsgContainer popInfo;

    @InterfaceC65349Pkn("punishment_message")
    public CreateInfoPunishmentMessage punishmentMessage;

    @InterfaceC65349Pkn("push_stream_info")
    public Map<Long, PushStreamInfo> pushStreamInfoMap;

    @InterfaceC65349Pkn("room_auth_customizable_poll")
    public int roomAuthCustomizablePoll;

    @InterfaceC65349Pkn("last_room_gift_count")
    public long roomGiftCount;

    @InterfaceC65349Pkn("screenshot_cover_status")
    public int screenShotCoverStatus;

    @InterfaceC65349Pkn("use_avatar_as_cover")
    public boolean useAvatarAsCover;

    @InterfaceC65349Pkn("use_avatar_as_voice_cover")
    public boolean useAvatarAsVoiceCover;

    @InterfaceC65349Pkn("voice_cover")
    public ImageModel voiceCover;

    @InterfaceC65349Pkn("voice_cover_audit_status")
    public int voiceCoverAuditStatus;

    @InterfaceC65349Pkn("voice_cover_source")
    public String voiceCoverSource;

    @InterfaceC65349Pkn("voice_title")
    public String voiceTitle;

    @InterfaceC65349Pkn("webcast_ls_access_status")
    public WebcastLSAccessStatus webcastLSAccessStatus;

    @InterfaceC65349Pkn("event_info")
    public LiveEventInfo mLiveEventInfo = new LiveEventInfo();

    @InterfaceC65349Pkn("show_game_tags")
    public boolean showGameTags = false;

    @InterfaceC65349Pkn("game_guide_info")
    public List<Object> gameGuideInfo = Collections.emptyList();

    public final boolean LIZ() {
        Long l;
        Map<Long, Long> map = this.adminEcShowPermission;
        if (map == null || (l = map.get(8L)) == null || l.longValue() != 1) {
            return false;
        }
        return true;
    }

    public final boolean LIZIZ() {
        if (this.donationSticker == 1) {
            return true;
        }
        return false;
    }
}
