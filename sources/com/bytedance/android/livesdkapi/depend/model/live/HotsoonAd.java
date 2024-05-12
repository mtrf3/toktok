package com.bytedance.android.livesdkapi.depend.model.live;

import X.BLG;
import X.InterfaceC65349Pkn;
import com.bytedance.android.live.base.model.ImageModel;
import java.util.List;

/* loaded from: classes11.dex */
public class HotsoonAd implements BLG {

    @InterfaceC65349Pkn("allow_comment")
    public boolean allowComment;

    @InterfaceC65349Pkn("allow_dislike")
    public boolean allowDislike;

    @InterfaceC65349Pkn("allow_share")
    public boolean allowShare;

    @InterfaceC65349Pkn("app_name")
    public String appName;

    @InterfaceC65349Pkn("appleid")
    public String appleId;

    @InterfaceC65349Pkn("author")
    public AuthorInfo author;

    @InterfaceC65349Pkn("auto_open")
    public int autoOpen;

    @InterfaceC65349Pkn("button_text")
    public String buttonText;

    @InterfaceC65349Pkn("click_track_url_list")
    public List<String> clickTrackUrlList;

    @InterfaceC65349Pkn("digg_count")
    public long diggCount;

    @InterfaceC65349Pkn("display_type")
    public int displayType;

    @InterfaceC65349Pkn("download_url")
    public String downloadUrl;

    @InterfaceC65349Pkn("effective_play_time")
    public int effectivePlayTime;

    @InterfaceC65349Pkn("effective_play_track_url_list")
    public List<String> effectivePlayTrackUrlList;

    @InterfaceC65349Pkn("filter_words")
    public List<Object> filterWords;

    @InterfaceC65349Pkn("hide_if_exists")
    public int hideIfExists;

    @InterfaceC65349Pkn("id")
    public long id;

    @InterfaceC65349Pkn("image_list")
    public List<SimpleImage> imageList;

    @InterfaceC65349Pkn("label")
    public String label;

    @InterfaceC65349Pkn("learn_more_bg_color")
    public String learnMoreBgColor;

    @InterfaceC65349Pkn("log_extra")
    public String logExtra;

    @InterfaceC65349Pkn("open_url")
    public String openUrl;

    @InterfaceC65349Pkn("package")
    public String packages;

    @InterfaceC65349Pkn("play_track_url_list")
    public List<String> playTrackUrlList;

    @InterfaceC65349Pkn("playover_track_url_list")
    public List<String> playover_track_url_list;

    @InterfaceC65349Pkn("show_button_seconds")
    public int showButtonSeconds;

    @InterfaceC65349Pkn("show_mask_times")
    public int showMaskTimes;

    @InterfaceC65349Pkn("title")
    public String title;

    @InterfaceC65349Pkn("track_url_list")
    public List<String> trackUrlList;

    @InterfaceC65349Pkn("type")
    public String type;

    @InterfaceC65349Pkn("use_compound_land_page")
    public boolean useCompoundLandPage;

    @InterfaceC65349Pkn("video_info")
    public VideoInfo videoInfo;

    @InterfaceC65349Pkn("web_title")
    public String webTitle;

    @InterfaceC65349Pkn("web_url")
    public String webUrl;

    /* loaded from: classes11.dex */
    public static class AuthorInfo {

        @InterfaceC65349Pkn("avatar")
        public SimpleImage avatar;

        @InterfaceC65349Pkn("nickname")
        public String nickname;
    }

    /* loaded from: classes9.dex */
    public static class SimpleImage {

        @InterfaceC65349Pkn("height")
        public int height;

        @InterfaceC65349Pkn("uri")
        public String uri;

        @InterfaceC65349Pkn("url_list")
        public List<String> urlList;

        @InterfaceC65349Pkn("width")
        public int width;
    }

    /* loaded from: classes9.dex */
    public static class VideoInfo {

        @InterfaceC65349Pkn("url_list")
        public List<String> stringList;

        @InterfaceC65349Pkn("thumb_height")
        public int thumbHeight;

        @InterfaceC65349Pkn("thumb_width")
        public int thumbWidth;

        @InterfaceC65349Pkn("video_duration")
        public int videoDuration;

        @InterfaceC65349Pkn("video_id")
        public String videoId;

        @InterfaceC65349Pkn("video_transpose")
        public int videoTranspose;
    }

    @Override // X.BLG
    public final ImageModel cover() {
        return null;
    }

    @Override // X.BLG
    public final long getId() {
        return this.id;
    }
}
