package com.ss.android.ugc.aweme.christmas;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.christmas.ActivityStruct;
import java.util.List;
import java.util.Map;

/* loaded from: classes13.dex */
public class FestivalEntity {

    @InterfaceC65349Pkn("activity_homepage_url")
    public String activityHomePageUrl;

    @InterfaceC65349Pkn("activity_id")
    public String activityId;

    @InterfaceC65349Pkn("activity_name")
    public String activityName;

    @InterfaceC65349Pkn("activity_type")
    public int activityType;

    @InterfaceC65349Pkn("avatar_page_struct")
    public AvatarDetailEntity avatarDetailEntity;

    @InterfaceC65349Pkn("detail_page_info")
    public String detailPageInfo;

    @InterfaceC65349Pkn("hashtag_ids")
    public List<String> hashTagIds;

    @InterfaceC65349Pkn("hash_tags")
    public String hashTags;

    @InterfaceC65349Pkn("in_activity")
    public boolean inActivity;

    @InterfaceC65349Pkn("detail_banner")
    public BannerDetail mBannerDetail;

    @InterfaceC65349Pkn("bonus_shoot")
    public EggShellEntity mEggShellEntity;

    @InterfaceC65349Pkn("mv_ids")
    public List<String> mvIds;

    @InterfaceC65349Pkn("mv_decorator_resource")
    public String mvResource;

    @InterfaceC65349Pkn("attributes")
    public Map<String, Object> optionalAttributes;

    @InterfaceC65349Pkn("theme_resource_struct")
    public ResEntity resEntity;

    @InterfaceC65349Pkn("show_other_banner")
    public boolean showOtherBanner;

    @InterfaceC65349Pkn("star_videos")
    public List<String> starVideos;

    @InterfaceC65349Pkn("activity_sticker_id_array")
    public List<String> stickerList;

    @InterfaceC65349Pkn("activity_sticker_tab")
    public ActivityStickerTabEntity stickerTabConfig;

    @InterfaceC65349Pkn("watermark_struct")
    public ActivityStruct.WatermarkStruct waterMark;

    /* loaded from: classes13.dex */
    public class ActivityStickerTabEntity {

        @InterfaceC65349Pkn("show_seconds")
        public int showSeconds;

        public ActivityStickerTabEntity(FestivalEntity festivalEntity) {
        }
    }

    /* loaded from: classes13.dex */
    public class BannerDetail {

        @InterfaceC65349Pkn("banner_resource")
        public String bannerResource;

        @InterfaceC65349Pkn("h5_link")
        public String h5link;

        public BannerDetail(FestivalEntity festivalEntity) {
        }
    }

    /* loaded from: classes7.dex */
    public class EggShellEntity {

        @InterfaceC65349Pkn("bonus_button")
        public String bonusButton;

        @InterfaceC65349Pkn("bonus_stickers")
        public List<Object> bonusStickers;

        @InterfaceC65349Pkn("bonus_text")
        public String bonusText;

        public EggShellEntity(FestivalEntity festivalEntity) {
        }
    }
}
