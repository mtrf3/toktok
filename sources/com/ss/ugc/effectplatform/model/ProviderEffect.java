package com.ss.ugc.effectplatform.model;

import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public class ProviderEffect {
    public AuthorBean author;
    public String click_url;
    public Long duration;
    public String extra;
    public String height;
    public String id;
    public Integer library_material_type;
    public String material_description;
    public String material_mp4_url;
    public String media_source;
    public String path;
    public String preview_webp;
    public StickerBean sticker;
    public StickerBean thumbnail_sticker;
    public String title;
    public String user_name;
    public Video video;
    public String width;

    /* JADX WARN: Multi-variable type inference failed */
    public ProviderEffect() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 262143, 0 == true ? 1 : 0);
    }

    /* loaded from: classes8.dex */
    public static class AuthorBean {
        public String avatar_url;
        public String display_name;
        public String profile_url;
        public String username;

        /* JADX WARN: Multi-variable type inference failed */
        public AuthorBean() {
            this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0);
        }

        public String getAvatar_url() {
            return this.avatar_url;
        }

        public String getDisplay_name() {
            return this.display_name;
        }

        public String getProfile_url() {
            return this.profile_url;
        }

        public String getUsername() {
            return this.username;
        }

        public void setAvatar_url(String str) {
            this.avatar_url = str;
        }

        public void setDisplay_name(String str) {
            this.display_name = str;
        }

        public void setProfile_url(String str) {
            this.profile_url = str;
        }

        public void setUsername(String str) {
            this.username = str;
        }

        public AuthorBean(String str, String str2, String str3, String str4) {
            this.avatar_url = str;
            this.profile_url = str2;
            this.username = str3;
            this.display_name = str4;
        }

        public /* synthetic */ AuthorBean(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
        }
    }

    /* loaded from: classes16.dex */
    public static class StickerBean {
        public String height;
        public String size;
        public String url;
        public String width;

        /* JADX WARN: Multi-variable type inference failed */
        public StickerBean() {
            this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0);
        }

        public String getHeight() {
            return this.height;
        }

        public String getSize() {
            return this.size;
        }

        public String getUrl() {
            return this.url;
        }

        public String getWidth() {
            return this.width;
        }

        public void setHeight(String str) {
            this.height = str;
        }

        public void setSize(String str) {
            this.size = str;
        }

        public void setUrl(String str) {
            this.url = str;
        }

        public void setWidth(String str) {
            this.width = str;
        }

        public StickerBean(String str, String str2, String str3, String str4) {
            this.url = str;
            this.width = str2;
            this.height = str3;
            this.size = str4;
        }

        public /* synthetic */ StickerBean(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
        }
    }

    /* loaded from: classes16.dex */
    public static final class Video {
        public String video_1080p_url;
        public String video_360p_url;
        public String video_480p_url;
        public String video_4k_url;
        public String video_720p_url;
        public String video_toptiktok_url;

        /* JADX WARN: Multi-variable type inference failed */
        public Video() {
            this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 63, 0 == true ? 1 : 0);
        }

        public String getVideo_1080p_url() {
            return this.video_1080p_url;
        }

        public String getVideo_360p_url() {
            return this.video_360p_url;
        }

        public String getVideo_480p_url() {
            return this.video_480p_url;
        }

        public String getVideo_4k_url() {
            return this.video_4k_url;
        }

        public String getVideo_720p_url() {
            return this.video_720p_url;
        }

        public String getVideo_toptiktok_url() {
            return this.video_toptiktok_url;
        }

        public void setVideo_1080p_url(String str) {
            this.video_1080p_url = str;
        }

        public void setVideo_360p_url(String str) {
            this.video_360p_url = str;
        }

        public void setVideo_480p_url(String str) {
            this.video_480p_url = str;
        }

        public void setVideo_4k_url(String str) {
            this.video_4k_url = str;
        }

        public void setVideo_720p_url(String str) {
            this.video_720p_url = str;
        }

        public void setVideo_toptiktok_url(String str) {
            this.video_toptiktok_url = str;
        }

        public Video(String str, String str2, String str3, String str4, String str5, String str6) {
            this.video_360p_url = str;
            this.video_480p_url = str2;
            this.video_720p_url = str3;
            this.video_1080p_url = str4;
            this.video_4k_url = str5;
            this.video_toptiktok_url = str6;
        }

        public /* synthetic */ Video(String str, String str2, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) == 0 ? str6 : null);
        }
    }

    public AuthorBean getAuthor() {
        return this.author;
    }

    public String getClick_url() {
        return this.click_url;
    }

    public Long getDuration() {
        return this.duration;
    }

    public String getExtra() {
        return this.extra;
    }

    public String getHeight() {
        return this.height;
    }

    public String getId() {
        return this.id;
    }

    public Integer getLibrary_material_type() {
        return this.library_material_type;
    }

    public String getMaterial_description() {
        return this.material_description;
    }

    public String getMaterial_mp4_url() {
        return this.material_mp4_url;
    }

    public String getMedia_source() {
        return this.media_source;
    }

    public String getPath() {
        return this.path;
    }

    public String getPreview_webp() {
        return this.preview_webp;
    }

    public final StickerBean getSticker_info() {
        return this.sticker;
    }

    public StickerBean getThumbnail_sticker() {
        return this.thumbnail_sticker;
    }

    public String getTitle() {
        return this.title;
    }

    public String getUser_name() {
        return this.user_name;
    }

    public Video getVideo() {
        return this.video;
    }

    public String getWidth() {
        return this.width;
    }

    public void setAuthor(AuthorBean authorBean) {
        this.author = authorBean;
    }

    public void setClick_url(String str) {
        this.click_url = str;
    }

    public void setDuration(Long l) {
        this.duration = l;
    }

    public void setExtra(String str) {
        this.extra = str;
    }

    public void setHeight(String str) {
        this.height = str;
    }

    public void setId(String str) {
        o.LJIIJ(str, "<set-?>");
        this.id = str;
    }

    public void setLibrary_material_type(Integer num) {
        this.library_material_type = num;
    }

    public void setMaterial_description(String str) {
        this.material_description = str;
    }

    public void setMaterial_mp4_url(String str) {
        this.material_mp4_url = str;
    }

    public void setMedia_source(String str) {
        this.media_source = str;
    }

    public void setPath(String str) {
        this.path = str;
    }

    public void setPreview_webp(String str) {
        this.preview_webp = str;
    }

    public final void setSticker_info(StickerBean stickerBean) {
        this.sticker = stickerBean;
    }

    public void setThumbnail_sticker(StickerBean stickerBean) {
        this.thumbnail_sticker = stickerBean;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setUser_name(String str) {
        this.user_name = str;
    }

    public void setVideo(Video video) {
        this.video = video;
    }

    public void setWidth(String str) {
        this.width = str;
    }

    public ProviderEffect(String id, String str, String str2, StickerBean stickerBean, StickerBean stickerBean2, String str3, String str4, String str5, String str6, String str7, Integer num, Video video, AuthorBean authorBean, Long l, String str8, String str9, String str10, String str11) {
        o.LJIIJ(id, "id");
        this.id = id;
        this.title = str;
        this.user_name = str2;
        this.thumbnail_sticker = stickerBean;
        this.sticker = stickerBean2;
        this.preview_webp = str3;
        this.height = str4;
        this.width = str5;
        this.material_description = str6;
        this.material_mp4_url = str7;
        this.library_material_type = num;
        this.video = video;
        this.author = authorBean;
        this.duration = l;
        this.media_source = str8;
        this.click_url = str9;
        this.path = str10;
        this.extra = str11;
    }

    public /* synthetic */ ProviderEffect(String str, String str2, String str3, StickerBean stickerBean, StickerBean stickerBean2, String str4, String str5, String str6, String str7, String str8, Integer num, Video video, AuthorBean authorBean, Long l, String str9, String str10, String str11, String str12, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : stickerBean, (i & 16) != 0 ? null : stickerBean2, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : str5, (i & 128) != 0 ? null : str6, (i & 256) != 0 ? null : str7, (i & 512) != 0 ? null : str8, (i & 1024) != 0 ? null : num, (i & 2048) != 0 ? null : video, (i & 4096) != 0 ? null : authorBean, (i & FileUtils.BUFFER_SIZE) != 0 ? null : l, (i & 16384) != 0 ? null : str9, (32768 & i) != 0 ? null : str10, (65536 & i) != 0 ? null : str11, (i & 131072) != 0 ? null : str12);
    }
}
