package com.ss.android.ugc.aweme.feed.model;

import X.C70657RoD;
import X.InterfaceC65349Pkn;
import X.JBR;
import X.Q89;
import X.X1D;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import defpackage.b0;
import defpackage.q;
import java.io.Serializable;
import java.util.Arrays;

/* loaded from: classes13.dex */
public class AwemeStatus implements Serializable, Cloneable {

    @InterfaceC65349Pkn("aid")
    public String aid;

    @InterfaceC65349Pkn("allow_comment")
    public boolean allowComment;

    @InterfaceC65349Pkn("video_hide_search")
    public int allowRecommend;

    @InterfaceC65349Pkn("allow_share")
    public boolean allowShare;

    @InterfaceC65349Pkn("download_status")
    public int downloadStatus;

    @InterfaceC65349Pkn("dont_share_status")
    public int excludeStatus;

    @InterfaceC65349Pkn("in_reviewing")
    public boolean inReviewing;

    @InterfaceC65349Pkn("is_delete")
    public boolean isDelete;

    @InterfaceC65349Pkn("is_prohibited")
    public boolean isProhibited;

    @InterfaceC65349Pkn("tiktok_music_edit_status")
    public int musicEditStatus;

    @InterfaceC65349Pkn("private_status")
    public int privateStatus;

    @InterfaceC65349Pkn("review_result")
    public ReviewResult reviewResult;

    @InterfaceC65349Pkn("reviewed")
    public int reviewed;

    @InterfaceC65349Pkn("self_see")
    public boolean selfSee;

    @InterfaceC65349Pkn("show_good_delay_time")
    public int showGoodDelayTime = LiveNetAdaptiveHurryTimeSetting.DEFAULT;

    @InterfaceC65349Pkn("video_mute")
    public VideoMuteInfo videoMuteInfo;

    /* loaded from: classes13.dex */
    public class ReviewResult implements Serializable {

        @InterfaceC65349Pkn("cover_notice")
        public String coverNotice;

        @InterfaceC65349Pkn("detail_url")
        public String detailUrl;

        @InterfaceC65349Pkn("review_status")
        public int reviewStatus;

        @InterfaceC65349Pkn("should_tell")
        public boolean shouldTell;

        @InterfaceC65349Pkn("video_detail_notice")
        public String videoDetailNotice;

        @InterfaceC65349Pkn("video_detail_notice_bottom")
        public String videoDetailNoticeBottom;

        public int hashCode() {
            return Arrays.hashCode(new Object[]{Integer.valueOf(this.reviewStatus), Boolean.valueOf(this.shouldTell), this.detailUrl});
        }

        public String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("review_result{review_status=");
            LIZ.append(this.reviewStatus);
            LIZ.append("should_tell=");
            LIZ.append(this.shouldTell);
            LIZ.append("detail_url=");
            return JBR.LJFF(LIZ, this.detailUrl, "}", LIZ);
        }

        public String getCoverNotice() {
            return this.coverNotice;
        }

        public String getDetailUrl() {
            return this.detailUrl;
        }

        public int getReviewStatus() {
            return this.reviewStatus;
        }

        public boolean getShouldTell() {
            return this.shouldTell;
        }

        public String getVideoDetailNotice() {
            return this.videoDetailNotice;
        }

        public String getVideoDetailNoticeBottom() {
            return this.videoDetailNoticeBottom;
        }

        public ReviewResult() {
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ReviewResult)) {
                return false;
            }
            ReviewResult reviewResult = (ReviewResult) obj;
            if (this.reviewStatus == reviewResult.reviewStatus && this.shouldTell == reviewResult.shouldTell && C70657RoD.LJII(this.detailUrl, reviewResult.detailUrl)) {
                return true;
            }
            return false;
        }

        public void setCoverNotice(String str) {
            this.coverNotice = str;
        }

        public void setDetailUrl(String str) {
            this.detailUrl = str;
        }

        public void setReviewStatus(int i) {
            this.reviewStatus = i;
        }

        public void setShouldTell(boolean z) {
            this.shouldTell = z;
        }

        public void setVideoDetailNotice(String str) {
            this.videoDetailNotice = str;
        }

        public void setVideoDetailNoticeBottom(String str) {
            this.videoDetailNoticeBottom = str;
        }
    }

    /* loaded from: classes9.dex */
    public class VideoMuteInfo implements Serializable {

        @InterfaceC65349Pkn("audio_change_status")
        public int audioChangeStatus;

        @InterfaceC65349Pkn("is_copyright_violation")
        public boolean isCopyrightViolation;

        @InterfaceC65349Pkn("is_mute")
        public boolean isMute;

        @InterfaceC65349Pkn("mute_desc")
        public String muteDesc;

        @InterfaceC65349Pkn("mute_detail_notice_bottom")
        public String muteDetailNotice;

        @InterfaceC65349Pkn("mute_detail_url")
        public String muteDetailUrl;

        public int hashCode() {
            return Arrays.hashCode(new Object[]{Boolean.valueOf(this.isMute), this.muteDesc});
        }

        public String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("VideoMuteInfo{isCopyrightViolation=");
            LIZ.append(this.isCopyrightViolation);
            LIZ.append("audioChangeStatus=");
            LIZ.append(this.audioChangeStatus);
            LIZ.append("isMute=");
            LIZ.append(this.isMute);
            LIZ.append(", muteDesc='");
            Q89.LIZIZ(LIZ, this.muteDesc, '\'', ", muteDetailUrl=");
            LIZ.append(this.muteDetailUrl);
            LIZ.append(", muteDetailNotice");
            return q.LIZIZ(LIZ, this.muteDetailNotice, '}', LIZ);
        }

        public int getAudioChangeStatus() {
            return this.audioChangeStatus;
        }

        public boolean getIsCopyrightViolation() {
            return this.isCopyrightViolation;
        }

        public String getMuteDesc() {
            return this.muteDesc;
        }

        public String getMuteDetailNotice() {
            return this.muteDetailNotice;
        }

        public String getMuteDetailUrl() {
            return this.muteDetailUrl;
        }

        public boolean isMute() {
            return this.isMute;
        }

        public VideoMuteInfo() {
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof VideoMuteInfo)) {
                return false;
            }
            VideoMuteInfo videoMuteInfo = (VideoMuteInfo) obj;
            if (this.isMute == videoMuteInfo.isMute && C70657RoD.LJII(this.muteDesc, videoMuteInfo.muteDesc)) {
                return true;
            }
            return false;
        }

        public void setAudioChangeStatus(int i) {
            this.audioChangeStatus = i;
        }

        public void setCopyrightViolation(boolean z) {
            this.isCopyrightViolation = z;
        }

        public void setIsMute(Boolean bool) {
            this.isMute = bool.booleanValue();
        }

        public void setMuteDesc(String str) {
            this.muteDesc = str;
        }
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public AwemeStatus m116clone() {
        AwemeStatus awemeStatus = new AwemeStatus();
        awemeStatus.aid = this.aid;
        awemeStatus.isDelete = this.isDelete;
        awemeStatus.allowShare = this.allowShare;
        awemeStatus.allowComment = this.allowComment;
        awemeStatus.privateStatus = this.privateStatus;
        awemeStatus.showGoodDelayTime = this.showGoodDelayTime;
        awemeStatus.inReviewing = this.inReviewing;
        awemeStatus.reviewed = this.reviewed;
        awemeStatus.selfSee = this.selfSee;
        awemeStatus.isProhibited = this.isProhibited;
        awemeStatus.downloadStatus = this.downloadStatus;
        awemeStatus.reviewResult = this.reviewResult;
        awemeStatus.excludeStatus = this.excludeStatus;
        awemeStatus.allowRecommend = this.allowRecommend;
        awemeStatus.videoMuteInfo = this.videoMuteInfo;
        awemeStatus.musicEditStatus = this.musicEditStatus;
        return awemeStatus;
    }

    public String getReviewDetailUrl() {
        ReviewResult reviewResult = this.reviewResult;
        if (reviewResult == null || TextUtils.isEmpty(reviewResult.detailUrl)) {
            return "";
        }
        return this.reviewResult.detailUrl;
    }

    public int getReviewStatus() {
        ReviewResult reviewResult = this.reviewResult;
        if (reviewResult != null) {
            return reviewResult.reviewStatus;
        }
        return 0;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.aid, Boolean.valueOf(this.isDelete), Boolean.valueOf(this.allowShare), Boolean.valueOf(this.allowComment), Integer.valueOf(this.privateStatus), Integer.valueOf(this.showGoodDelayTime), Boolean.valueOf(this.inReviewing), Integer.valueOf(this.reviewed), Boolean.valueOf(this.selfSee), Boolean.valueOf(this.isProhibited), Integer.valueOf(this.downloadStatus), this.reviewResult, Integer.valueOf(this.allowRecommend), Integer.valueOf(this.excludeStatus), this.videoMuteInfo});
    }

    public boolean isPrivate() {
        if (this.privateStatus == 1) {
            return true;
        }
        return false;
    }

    public boolean isProhibitedAndShouldTell() {
        ReviewResult reviewResult = this.reviewResult;
        if (reviewResult != null && reviewResult.reviewStatus == 1 && reviewResult.shouldTell) {
            return true;
        }
        return false;
    }

    public boolean isReviewed() {
        if (this.reviewed == 1) {
            return true;
        }
        return false;
    }

    public boolean isSelfSeeAndShouldTell() {
        ReviewResult reviewResult = this.reviewResult;
        if (reviewResult != null && reviewResult.reviewStatus == 2 && reviewResult.shouldTell) {
            return true;
        }
        return false;
    }

    public boolean shouldShowReviewStatus() {
        ReviewResult reviewResult = this.reviewResult;
        if (reviewResult != null && reviewResult.reviewStatus != 0) {
            return true;
        }
        return false;
    }

    public String toString() {
        String str;
        ReviewResult reviewResult = this.reviewResult;
        if (reviewResult != null) {
            str = reviewResult.toString();
        } else {
            str = "";
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AwemeStatus{aid='");
        Q89.LIZIZ(LIZ, this.aid, '\'', ", isDelete=");
        LIZ.append(this.isDelete);
        LIZ.append(", allowShare=");
        LIZ.append(this.allowShare);
        LIZ.append(", allowComment=");
        LIZ.append(this.allowComment);
        LIZ.append(", privateStatus=");
        LIZ.append(this.privateStatus);
        LIZ.append(", showGoodDelayTime=");
        LIZ.append(this.showGoodDelayTime);
        LIZ.append(", inReviewing=");
        LIZ.append(this.inReviewing);
        LIZ.append(", reviewed=");
        LIZ.append(this.reviewed);
        LIZ.append(", selfSee=");
        LIZ.append(this.selfSee);
        LIZ.append(", isProhibited=");
        LIZ.append(this.isProhibited);
        LIZ.append(", downloadStatus=");
        LIZ.append(this.downloadStatus);
        LIZ.append(", reviewStatus=");
        LIZ.append(str);
        LIZ.append(", excludeStatus=");
        LIZ.append(this.excludeStatus);
        LIZ.append(", allowRecommend=");
        LIZ.append(this.allowRecommend);
        LIZ.append(", videoMuteInfo=");
        LIZ.append(this.videoMuteInfo);
        LIZ.append(", musicEditStatus=");
        return b0.LIZJ(LIZ, this.musicEditStatus, '}', LIZ);
    }

    public String getAid() {
        return this.aid;
    }

    public int getAllowRecommend() {
        return this.allowRecommend;
    }

    public int getDownloadStatus() {
        return this.downloadStatus;
    }

    public int getExcludeStatus() {
        return this.excludeStatus;
    }

    public int getMusicEditStatus() {
        return this.musicEditStatus;
    }

    public int getPrivateStatus() {
        return this.privateStatus;
    }

    public ReviewResult getReviewResult() {
        return this.reviewResult;
    }

    public int getShowGoodDelayTime() {
        return this.showGoodDelayTime;
    }

    public VideoMuteInfo getVideoMuteInfo() {
        return this.videoMuteInfo;
    }

    public boolean isAllowComment() {
        return this.allowComment;
    }

    public boolean isAllowShare() {
        return this.allowShare;
    }

    public boolean isDelete() {
        return this.isDelete;
    }

    public boolean isInReviewing() {
        return this.inReviewing;
    }

    public boolean isProhibited() {
        return this.isProhibited;
    }

    public boolean isSelfSee() {
        return this.selfSee;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AwemeStatus)) {
            return false;
        }
        AwemeStatus awemeStatus = (AwemeStatus) obj;
        if (this.isDelete == awemeStatus.isDelete && this.allowShare == awemeStatus.allowShare && this.allowComment == awemeStatus.allowComment && this.privateStatus == awemeStatus.privateStatus && this.showGoodDelayTime == awemeStatus.showGoodDelayTime && this.inReviewing == awemeStatus.inReviewing && this.reviewed == awemeStatus.reviewed && this.selfSee == awemeStatus.selfSee && this.isProhibited == awemeStatus.isProhibited && this.downloadStatus == awemeStatus.downloadStatus && C70657RoD.LJII(this.aid, awemeStatus.aid) && C70657RoD.LJII(this.reviewResult, awemeStatus.reviewResult) && this.allowRecommend == awemeStatus.allowRecommend && this.excludeStatus == awemeStatus.excludeStatus && C70657RoD.LJII(this.videoMuteInfo, awemeStatus.videoMuteInfo) && this.musicEditStatus == awemeStatus.musicEditStatus) {
            return true;
        }
        return false;
    }

    public void setAid(String str) {
        this.aid = str;
    }

    public void setAllowComment(boolean z) {
        this.allowComment = z;
    }

    public void setAllowRecommend(int i) {
        this.allowRecommend = i;
    }

    public void setAllowShare(boolean z) {
        this.allowShare = z;
    }

    public void setDelete(boolean z) {
        this.isDelete = z;
    }

    public void setDownloadStatus(int i) {
        this.downloadStatus = i;
    }

    public void setExcludeStatus(int i) {
        this.excludeStatus = i;
    }

    public void setInReviewing(boolean z) {
        this.inReviewing = z;
    }

    public void setPrivate(boolean z) {
        if (z) {
            this.privateStatus = 1;
        } else {
            this.privateStatus = 0;
        }
    }

    public void setPrivateStatus(int i) {
        this.privateStatus = i;
    }

    public void setProhibited(boolean z) {
        this.isProhibited = z;
    }

    public void setReviewResult(ReviewResult reviewResult) {
        this.reviewResult = reviewResult;
    }

    public void setSelfSee(boolean z) {
        this.selfSee = z;
    }
}
