package com.ss.android.ugc.aweme.search.pages.result.topsearch.core.consume.model;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class SearchConsumeModel {
    public static final /* synthetic */ int LIZ = 0;

    @InterfaceC65349Pkn("big_screen_play")
    public Boolean bigScreenPlay;

    @InterfaceC65349Pkn("click")
    public Boolean click;

    @InterfaceC65349Pkn("comment")
    public Boolean comment;

    @InterfaceC65349Pkn("doc_id_str")
    public final String docId;

    @InterfaceC65349Pkn("enter_music")
    public Boolean enterMusic;

    @InterfaceC65349Pkn("enter_user")
    public Boolean enterUser;

    @InterfaceC65349Pkn("favorite")
    public Boolean favorite;

    @InterfaceC65349Pkn("follow")
    public Boolean follow;

    @InterfaceC65349Pkn("play_finish")
    public Boolean isPlayFinish;

    @InterfaceC65349Pkn("latest_consume_timestamp")
    public Long latestConsumeTimestamp;

    @InterfaceC65349Pkn("play_time_max")
    public Long playTimeMax;

    @InterfaceC65349Pkn("real_video_duration")
    public Long realVideoDuration;

    @InterfaceC65349Pkn("repin")
    public Boolean repin;

    @InterfaceC65349Pkn("search_keyword")
    public String searchKeyword;

    @InterfaceC65349Pkn("share")
    public Boolean share;

    @InterfaceC65349Pkn("video_total_play_time")
    public Long videoTotalPlayTime;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchConsumeModel)) {
            return false;
        }
        SearchConsumeModel searchConsumeModel = (SearchConsumeModel) obj;
        return o.LJ(this.docId, searchConsumeModel.docId) && o.LJ(this.playTimeMax, searchConsumeModel.playTimeMax) && o.LJ(this.videoTotalPlayTime, searchConsumeModel.videoTotalPlayTime) && o.LJ(this.repin, searchConsumeModel.repin) && o.LJ(this.comment, searchConsumeModel.comment) && o.LJ(this.share, searchConsumeModel.share) && o.LJ(this.follow, searchConsumeModel.follow) && o.LJ(this.favorite, searchConsumeModel.favorite) && o.LJ(this.enterMusic, searchConsumeModel.enterMusic) && o.LJ(this.enterUser, searchConsumeModel.enterUser) && o.LJ(this.click, searchConsumeModel.click) && o.LJ(this.bigScreenPlay, searchConsumeModel.bigScreenPlay) && o.LJ(this.isPlayFinish, searchConsumeModel.isPlayFinish) && o.LJ(this.searchKeyword, searchConsumeModel.searchKeyword) && o.LJ(this.realVideoDuration, searchConsumeModel.realVideoDuration) && o.LJ(this.latestConsumeTimestamp, searchConsumeModel.latestConsumeTimestamp);
    }

    public final int hashCode() {
        int hashCode = this.docId.hashCode() * 31;
        Long l = this.playTimeMax;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.videoTotalPlayTime;
        int hashCode3 = (hashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Boolean bool = this.repin;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.comment;
        int hashCode5 = (hashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.share;
        int hashCode6 = (hashCode5 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.follow;
        int hashCode7 = (hashCode6 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.favorite;
        int hashCode8 = (hashCode7 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Boolean bool6 = this.enterMusic;
        int hashCode9 = (hashCode8 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        Boolean bool7 = this.enterUser;
        int hashCode10 = (hashCode9 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
        Boolean bool8 = this.click;
        int hashCode11 = (hashCode10 + (bool8 == null ? 0 : bool8.hashCode())) * 31;
        Boolean bool9 = this.bigScreenPlay;
        int hashCode12 = (hashCode11 + (bool9 == null ? 0 : bool9.hashCode())) * 31;
        Boolean bool10 = this.isPlayFinish;
        int hashCode13 = (hashCode12 + (bool10 == null ? 0 : bool10.hashCode())) * 31;
        String str = this.searchKeyword;
        int hashCode14 = (hashCode13 + (str == null ? 0 : str.hashCode())) * 31;
        Long l3 = this.realVideoDuration;
        int hashCode15 = (hashCode14 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.latestConsumeTimestamp;
        return hashCode15 + (l4 != null ? l4.hashCode() : 0);
    }

    public final String toString() {
        return "SearchConsumeModel(docId=" + this.docId + ", playTimeMax=" + this.playTimeMax + ", videoTotalPlayTime=" + this.videoTotalPlayTime + ", repin=" + this.repin + ", comment=" + this.comment + ", share=" + this.share + ", follow=" + this.follow + ", favorite=" + this.favorite + ", enterMusic=" + this.enterMusic + ", enterUser=" + this.enterUser + ", click=" + this.click + ", bigScreenPlay=" + this.bigScreenPlay + ", isPlayFinish=" + this.isPlayFinish + ", searchKeyword=" + this.searchKeyword + ", realVideoDuration=" + this.realVideoDuration + ", latestConsumeTimestamp=" + this.latestConsumeTimestamp + ')';
    }

    public SearchConsumeModel(String docId, Long l, Long l2, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Boolean bool10, String str, Long l3, Long l4) {
        o.LJIIIZ(docId, "docId");
        this.docId = docId;
        this.playTimeMax = l;
        this.videoTotalPlayTime = l2;
        this.repin = bool;
        this.comment = bool2;
        this.share = bool3;
        this.follow = bool4;
        this.favorite = bool5;
        this.enterMusic = bool6;
        this.enterUser = bool7;
        this.click = bool8;
        this.bigScreenPlay = bool9;
        this.isPlayFinish = bool10;
        this.searchKeyword = str;
        this.realVideoDuration = l3;
        this.latestConsumeTimestamp = l4;
    }

    public /* synthetic */ SearchConsumeModel(String str, Long l, Long l2, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Boolean bool10, String str2, Long l3, Long l4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : l, (i & 4) != 0 ? null : l2, (i & 8) != 0 ? null : bool, (i & 16) != 0 ? null : bool2, (i & 32) != 0 ? null : bool3, (i & 64) != 0 ? null : bool4, (i & 128) != 0 ? null : bool5, (i & 256) != 0 ? null : bool6, (i & 512) != 0 ? null : bool7, (i & 1024) != 0 ? null : bool8, (i & 2048) != 0 ? null : bool9, (i & 4096) != 0 ? null : bool10, (i & FileUtils.BUFFER_SIZE) != 0 ? null : str2, (i & 16384) != 0 ? null : l3, (i & 32768) == 0 ? l4 : null);
    }
}
