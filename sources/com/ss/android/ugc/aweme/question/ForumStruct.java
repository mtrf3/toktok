package com.ss.android.ugc.aweme.question;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.share.ShareInfo;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class ForumStruct implements Serializable {
    public Boolean LJLIL;

    @InterfaceC65349Pkn("collect_status")
    public Integer collectStatus;

    @InterfaceC65349Pkn("collection_category")
    public final Integer collectionCategory;

    @InterfaceC65349Pkn("content")
    public String content;

    @InterfaceC65349Pkn("create_time")
    public final Long createTime;

    @InterfaceC65349Pkn("creator")
    public final User creator;

    @InterfaceC65349Pkn("id")
    public final Long id;

    @InterfaceC65349Pkn("invite_info")
    public final InviteInfo inviteInfo;

    @InterfaceC65349Pkn("invite_share_info")
    public final ShareInfo inviteShareInfo;

    @InterfaceC65349Pkn("language")
    public final String language;

    @InterfaceC65349Pkn("share_info")
    public final ShareInfo shareInfo;

    @InterfaceC65349Pkn("video")
    public final Aweme video;

    @InterfaceC65349Pkn("videos_count")
    public final Integer videosCount;

    /* JADX WARN: Multi-variable type inference failed */
    public ForumStruct() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 8191, 0 == true ? 1 : 0);
    }

    public final ForumStruct clone() {
        return new ForumStruct(this.id, this.creator, this.video, this.content, this.videosCount, this.collectStatus, this.shareInfo, this.inviteInfo, this.language, this.createTime, this.inviteShareInfo, this.collectionCategory, this.LJLIL);
    }

    public final Integer getAnswerCount() {
        Integer num = this.videosCount;
        if (num != null) {
            num.intValue();
            if (o.LJ(getQuestionType(), "video")) {
                this.videosCount.intValue();
            }
        }
        return this.videosCount;
    }

    public final String getQuestionType() {
        if (this.video == null) {
            return "textual";
        }
        return "video";
    }

    public final boolean isCollected() {
        Integer num = this.collectStatus;
        if (num == null || num.intValue() != 1) {
            return false;
        }
        return true;
    }

    public final Integer getCollectStatus() {
        return this.collectStatus;
    }

    public final Integer getCollectionCategory() {
        return this.collectionCategory;
    }

    public final String getContent() {
        return this.content;
    }

    public final Long getCreateTime() {
        return this.createTime;
    }

    public final User getCreator() {
        return this.creator;
    }

    public final Long getId() {
        return this.id;
    }

    public final InviteInfo getInviteInfo() {
        return this.inviteInfo;
    }

    public final ShareInfo getInviteShareInfo() {
        return this.inviteShareInfo;
    }

    public final String getLanguage() {
        return this.language;
    }

    public final ShareInfo getShareInfo() {
        return this.shareInfo;
    }

    public final Aweme getVideo() {
        return this.video;
    }

    public final Integer getVideosCount() {
        return this.videosCount;
    }

    public final Boolean isTranslated() {
        return this.LJLIL;
    }

    public final void setCollectStatus(int i) {
        this.collectStatus = Integer.valueOf(i);
    }

    public final void setContent(String str) {
        this.content = str;
    }

    public final void setTranslated(Boolean bool) {
        this.LJLIL = bool;
    }

    public final void setCollectStatus(Integer num) {
        this.collectStatus = num;
    }

    public ForumStruct(Long l, User user, Aweme aweme, String str, Integer num, Integer num2, ShareInfo shareInfo, InviteInfo inviteInfo, String str2, Long l2, ShareInfo shareInfo2, Integer num3, Boolean bool) {
        this.id = l;
        this.creator = user;
        this.video = aweme;
        this.content = str;
        this.videosCount = num;
        this.collectStatus = num2;
        this.shareInfo = shareInfo;
        this.inviteInfo = inviteInfo;
        this.language = str2;
        this.createTime = l2;
        this.inviteShareInfo = shareInfo2;
        this.collectionCategory = num3;
        this.LJLIL = bool;
    }

    public /* synthetic */ ForumStruct(Long l, User user, Aweme aweme, String str, Integer num, Integer num2, ShareInfo shareInfo, InviteInfo inviteInfo, String str2, Long l2, ShareInfo shareInfo2, Integer num3, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : user, (i & 4) != 0 ? null : aweme, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : num, (i & 32) != 0 ? null : num2, (i & 64) != 0 ? null : shareInfo, (i & 128) != 0 ? null : inviteInfo, (i & 256) != 0 ? null : str2, (i & 512) != 0 ? null : l2, (i & 1024) != 0 ? null : shareInfo2, (i & 2048) == 0 ? num3 : null, (i & 4096) != 0 ? Boolean.FALSE : bool);
    }
}
