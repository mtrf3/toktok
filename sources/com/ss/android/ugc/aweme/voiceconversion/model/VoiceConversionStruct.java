package com.ss.android.ugc.aweme.voiceconversion.model;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class VoiceConversionStruct {

    @InterfaceC65349Pkn("creator_user_id")
    public final Long creatorUserId;

    @InterfaceC65349Pkn("creator_user_name")
    public final String creatorUserName;

    @InterfaceC65349Pkn("video_list_next_offset")
    public final Long cursor;

    @InterfaceC65349Pkn("description")
    public final String description;

    @InterfaceC65349Pkn("video_list_has_more")
    public Integer hasMore;

    @InterfaceC65349Pkn("icon_url")
    public final UrlStruct iconUrl;

    @InterfaceC65349Pkn("preview_audio_url")
    public final UrlStruct previewAudioUrl;

    @InterfaceC65349Pkn("should_show_creator_profile_entrance")
    public final boolean showCreatorProfile;

    @InterfaceC65349Pkn("total_video_count")
    public final Long videoCount;

    @InterfaceC65349Pkn("video_list")
    public List<Aweme> videoList;

    @InterfaceC65349Pkn("vc_filter_id")
    public final String voiceId;

    /* JADX WARN: Multi-variable type inference failed */
    public VoiceConversionStruct() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, false, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 2047, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VoiceConversionStruct)) {
            return false;
        }
        VoiceConversionStruct voiceConversionStruct = (VoiceConversionStruct) obj;
        return o.LJ(this.voiceId, voiceConversionStruct.voiceId) && o.LJ(this.description, voiceConversionStruct.description) && o.LJ(this.iconUrl, voiceConversionStruct.iconUrl) && o.LJ(this.previewAudioUrl, voiceConversionStruct.previewAudioUrl) && this.showCreatorProfile == voiceConversionStruct.showCreatorProfile && o.LJ(this.creatorUserId, voiceConversionStruct.creatorUserId) && o.LJ(this.creatorUserName, voiceConversionStruct.creatorUserName) && o.LJ(this.videoCount, voiceConversionStruct.videoCount) && o.LJ(this.videoList, voiceConversionStruct.videoList) && o.LJ(this.hasMore, voiceConversionStruct.hasMore) && o.LJ(this.cursor, voiceConversionStruct.cursor);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        String str = this.voiceId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.description;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        UrlStruct urlStruct = this.iconUrl;
        int hashCode3 = (hashCode2 + (urlStruct == null ? 0 : urlStruct.hashCode())) * 31;
        UrlStruct urlStruct2 = this.previewAudioUrl;
        int hashCode4 = (hashCode3 + (urlStruct2 == null ? 0 : urlStruct2.hashCode())) * 31;
        boolean z = this.showCreatorProfile;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode4 + i) * 31;
        Long l = this.creatorUserId;
        int hashCode5 = (i2 + (l == null ? 0 : l.hashCode())) * 31;
        String str3 = this.creatorUserName;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l2 = this.videoCount;
        int hashCode7 = (hashCode6 + (l2 == null ? 0 : l2.hashCode())) * 31;
        List<Aweme> list = this.videoList;
        int hashCode8 = (hashCode7 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.hasMore;
        int hashCode9 = (hashCode8 + (num == null ? 0 : num.hashCode())) * 31;
        Long l3 = this.cursor;
        return hashCode9 + (l3 != null ? l3.hashCode() : 0);
    }

    public final String toString() {
        return "VoiceConversionStruct(voiceId=" + this.voiceId + ", description=" + this.description + ", iconUrl=" + this.iconUrl + ", previewAudioUrl=" + this.previewAudioUrl + ", showCreatorProfile=" + this.showCreatorProfile + ", creatorUserId=" + this.creatorUserId + ", creatorUserName=" + this.creatorUserName + ", videoCount=" + this.videoCount + ", videoList=" + this.videoList + ", hasMore=" + this.hasMore + ", cursor=" + this.cursor + ')';
    }

    public VoiceConversionStruct(String str, String str2, UrlStruct urlStruct, UrlStruct urlStruct2, boolean z, Long l, String str3, Long l2, List<Aweme> list, Integer num, Long l3) {
        this.voiceId = str;
        this.description = str2;
        this.iconUrl = urlStruct;
        this.previewAudioUrl = urlStruct2;
        this.showCreatorProfile = z;
        this.creatorUserId = l;
        this.creatorUserName = str3;
        this.videoCount = l2;
        this.videoList = list;
        this.hasMore = num;
        this.cursor = l3;
    }

    public /* synthetic */ VoiceConversionStruct(String str, String str2, UrlStruct urlStruct, UrlStruct urlStruct2, boolean z, Long l, String str3, Long l2, List list, Integer num, Long l3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : urlStruct, (i & 8) != 0 ? null : urlStruct2, (i & 16) != 0 ? false : z, (i & 32) != 0 ? 0L : l, (i & 64) == 0 ? str3 : "", (i & 128) != 0 ? 0L : l2, (i & 256) == 0 ? list : null, (i & 512) != 0 ? 0 : num, (i & 1024) != 0 ? 0L : l3);
    }
}
