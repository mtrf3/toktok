package com.ss.android.ugc.aweme.emoji.stickerstore.model;

import X.C07670Rv;
import X.C32V;
import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class VideoSticker implements C32V, Serializable {

    @InterfaceC65349Pkn("animated_urls")
    public final StickerUrlStruct animateUrl;

    @InterfaceC65349Pkn("creator_avatar_thumb")
    public final UrlModel creatorAvatarThumb;

    @InterfaceC65349Pkn("creator_nickname")
    public final String creatorNickName;

    @InterfaceC65349Pkn("creator_sec_uid")
    public final String creatorSecUid;

    @InterfaceC65349Pkn("creator_uid")
    public final Long creatorUid;

    @InterfaceC65349Pkn("creator_uniq_id")
    public final String creatorUniqueId;

    @InterfaceC65349Pkn("have_favorite")
    public final Integer haveFavorite;

    @InterfaceC65349Pkn("origin_video_id")
    public final Long originVideoId;

    @InterfaceC65349Pkn("origin_video_user_id")
    public final Long originVideoUserId;

    @InterfaceC65349Pkn("review_msg")
    public final String reviewMsg;

    @InterfaceC65349Pkn("static_urls")
    public final StickerUrlStruct staticUrl;

    @InterfaceC65349Pkn("status")
    public final Integer status;

    @InterfaceC65349Pkn("sticker_type")
    public final Integer stickerType;

    @InterfaceC65349Pkn("id")
    public final Long videoStickerId;

    /* JADX WARN: Multi-variable type inference failed */
    public VideoSticker() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 16383, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ VideoSticker copy$default(VideoSticker videoSticker, Long l, Long l2, Long l3, Long l4, String str, Integer num, Integer num2, StickerUrlStruct stickerUrlStruct, StickerUrlStruct stickerUrlStruct2, Integer num3, String str2, String str3, UrlModel urlModel, String str4, int i, Object obj) {
        Long l5 = l;
        Long l6 = l2;
        Long l7 = l3;
        Long l8 = l4;
        String str5 = str;
        Integer num4 = num;
        Integer num5 = num2;
        StickerUrlStruct stickerUrlStruct3 = stickerUrlStruct;
        StickerUrlStruct stickerUrlStruct4 = stickerUrlStruct2;
        Integer num6 = num3;
        String str6 = str2;
        String str7 = str3;
        UrlModel urlModel2 = urlModel;
        String str8 = str4;
        if ((i & 1) != 0) {
            l5 = videoSticker.videoStickerId;
        }
        if ((i & 2) != 0) {
            l6 = videoSticker.originVideoId;
        }
        if ((i & 4) != 0) {
            l7 = videoSticker.originVideoUserId;
        }
        if ((i & 8) != 0) {
            l8 = videoSticker.creatorUid;
        }
        if ((i & 16) != 0) {
            str5 = videoSticker.creatorSecUid;
        }
        if ((i & 32) != 0) {
            num4 = videoSticker.status;
        }
        if ((i & 64) != 0) {
            num5 = videoSticker.stickerType;
        }
        if ((i & 128) != 0) {
            stickerUrlStruct3 = videoSticker.staticUrl;
        }
        if ((i & 256) != 0) {
            stickerUrlStruct4 = videoSticker.animateUrl;
        }
        if ((i & 512) != 0) {
            num6 = videoSticker.haveFavorite;
        }
        if ((i & 1024) != 0) {
            str6 = videoSticker.reviewMsg;
        }
        if ((i & 2048) != 0) {
            str7 = videoSticker.creatorNickName;
        }
        if ((i & 4096) != 0) {
            urlModel2 = videoSticker.creatorAvatarThumb;
        }
        if ((i & FileUtils.BUFFER_SIZE) != 0) {
            str8 = videoSticker.creatorUniqueId;
        }
        return videoSticker.copy(l5, l6, l7, l8, str5, num4, num5, stickerUrlStruct3, stickerUrlStruct4, num6, str6, str7, urlModel2, str8);
    }

    public final VideoSticker copy(Long l, Long l2, Long l3, Long l4, String str, Integer num, Integer num2, StickerUrlStruct stickerUrlStruct, StickerUrlStruct stickerUrlStruct2, Integer num3, String str2, String str3, UrlModel urlModel, String str4) {
        return new VideoSticker(l, l2, l3, l4, str, num, num2, stickerUrlStruct, stickerUrlStruct2, num3, str2, str3, urlModel, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoSticker)) {
            return false;
        }
        VideoSticker videoSticker = (VideoSticker) obj;
        return o.LJ(this.videoStickerId, videoSticker.videoStickerId) && o.LJ(this.originVideoId, videoSticker.originVideoId) && o.LJ(this.originVideoUserId, videoSticker.originVideoUserId) && o.LJ(this.creatorUid, videoSticker.creatorUid) && o.LJ(this.creatorSecUid, videoSticker.creatorSecUid) && o.LJ(this.status, videoSticker.status) && o.LJ(this.stickerType, videoSticker.stickerType) && o.LJ(this.staticUrl, videoSticker.staticUrl) && o.LJ(this.animateUrl, videoSticker.animateUrl) && o.LJ(this.haveFavorite, videoSticker.haveFavorite) && o.LJ(this.reviewMsg, videoSticker.reviewMsg) && o.LJ(this.creatorNickName, videoSticker.creatorNickName) && o.LJ(this.creatorAvatarThumb, videoSticker.creatorAvatarThumb) && o.LJ(this.creatorUniqueId, videoSticker.creatorUniqueId);
    }

    public int hashCode() {
        Long l = this.videoStickerId;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.originVideoId;
        int hashCode2 = (hashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.originVideoUserId;
        int hashCode3 = (hashCode2 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.creatorUid;
        int hashCode4 = (hashCode3 + (l4 == null ? 0 : l4.hashCode())) * 31;
        String str = this.creatorSecUid;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.status;
        int hashCode6 = (hashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.stickerType;
        int hashCode7 = (hashCode6 + (num2 == null ? 0 : num2.hashCode())) * 31;
        StickerUrlStruct stickerUrlStruct = this.staticUrl;
        int hashCode8 = (hashCode7 + (stickerUrlStruct == null ? 0 : stickerUrlStruct.hashCode())) * 31;
        StickerUrlStruct stickerUrlStruct2 = this.animateUrl;
        int hashCode9 = (hashCode8 + (stickerUrlStruct2 == null ? 0 : stickerUrlStruct2.hashCode())) * 31;
        Integer num3 = this.haveFavorite;
        int hashCode10 = (hashCode9 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str2 = this.reviewMsg;
        int hashCode11 = (hashCode10 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.creatorNickName;
        int hashCode12 = (hashCode11 + (str3 == null ? 0 : str3.hashCode())) * 31;
        UrlModel urlModel = this.creatorAvatarThumb;
        int hashCode13 = (hashCode12 + (urlModel == null ? 0 : urlModel.hashCode())) * 31;
        String str4 = this.creatorUniqueId;
        return hashCode13 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("VideoSticker(videoStickerId=");
        sb.append(this.videoStickerId);
        sb.append(", originVideoId=");
        sb.append(this.originVideoId);
        sb.append(", originVideoUserId=");
        sb.append(this.originVideoUserId);
        sb.append(", creatorUid=");
        sb.append(this.creatorUid);
        sb.append(", creatorSecUid=");
        sb.append(this.creatorSecUid);
        sb.append(", status=");
        sb.append(this.status);
        sb.append(", stickerType=");
        sb.append(this.stickerType);
        sb.append(", staticUrl=");
        sb.append(this.staticUrl);
        sb.append(", animateUrl=");
        sb.append(this.animateUrl);
        sb.append(", haveFavorite=");
        sb.append(this.haveFavorite);
        sb.append(", reviewMsg=");
        sb.append(this.reviewMsg);
        sb.append(", creatorNickName=");
        sb.append(this.creatorNickName);
        sb.append(", creatorAvatarThumb=");
        sb.append(this.creatorAvatarThumb);
        sb.append(", creatorUniqueId=");
        return C07670Rv.LIZIZ(sb, this.creatorUniqueId, ')');
    }

    public final StickerUrlStruct getAnimateUrl() {
        return this.animateUrl;
    }

    public final UrlModel getCreatorAvatarThumb() {
        return this.creatorAvatarThumb;
    }

    public final String getCreatorNickName() {
        return this.creatorNickName;
    }

    public final String getCreatorSecUid() {
        return this.creatorSecUid;
    }

    public final Long getCreatorUid() {
        return this.creatorUid;
    }

    public final String getCreatorUniqueId() {
        return this.creatorUniqueId;
    }

    public final Integer getHaveFavorite() {
        return this.haveFavorite;
    }

    public final Long getOriginVideoId() {
        return this.originVideoId;
    }

    public final Long getOriginVideoUserId() {
        return this.originVideoUserId;
    }

    public final String getReviewMsg() {
        return this.reviewMsg;
    }

    public final StickerUrlStruct getStaticUrl() {
        return this.staticUrl;
    }

    public final Integer getStatus() {
        return this.status;
    }

    public final Integer getStickerType() {
        return this.stickerType;
    }

    public final Long getVideoStickerId() {
        return this.videoStickerId;
    }

    public VideoSticker(Long l, Long l2, Long l3, Long l4, String str, Integer num, Integer num2, StickerUrlStruct stickerUrlStruct, StickerUrlStruct stickerUrlStruct2, Integer num3, String str2, String str3, UrlModel urlModel, String str4) {
        this.videoStickerId = l;
        this.originVideoId = l2;
        this.originVideoUserId = l3;
        this.creatorUid = l4;
        this.creatorSecUid = str;
        this.status = num;
        this.stickerType = num2;
        this.staticUrl = stickerUrlStruct;
        this.animateUrl = stickerUrlStruct2;
        this.haveFavorite = num3;
        this.reviewMsg = str2;
        this.creatorNickName = str3;
        this.creatorAvatarThumb = urlModel;
        this.creatorUniqueId = str4;
    }

    public /* synthetic */ VideoSticker(Long l, Long l2, Long l3, Long l4, String str, Integer num, Integer num2, StickerUrlStruct stickerUrlStruct, StickerUrlStruct stickerUrlStruct2, Integer num3, String str2, String str3, UrlModel urlModel, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : l2, (i & 4) != 0 ? null : l3, (i & 8) != 0 ? null : l4, (i & 16) != 0 ? null : str, (i & 32) != 0 ? null : num, (i & 64) != 0 ? null : num2, (i & 128) != 0 ? null : stickerUrlStruct, (i & 256) != 0 ? null : stickerUrlStruct2, (i & 512) != 0 ? null : num3, (i & 1024) != 0 ? null : str2, (i & 2048) != 0 ? null : str3, (i & 4096) != 0 ? null : urlModel, (i & FileUtils.BUFFER_SIZE) == 0 ? str4 : null);
    }
}
