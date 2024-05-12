package com.ss.android.ugc.aweme.ttsvoice.model;

import X.C08880Wm;
import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class TTSVoiceStruct {

    @InterfaceC65349Pkn("creator_user_id")
    public final String creatorUserId;

    @InterfaceC65349Pkn("creator_user_name")
    public final String creatorUserName;

    @InterfaceC65349Pkn("video_list_next_offset")
    public final Integer cursor;

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
    public final Integer videoCount;

    @InterfaceC65349Pkn("video_list")
    public List<Aweme> videoList;

    @InterfaceC65349Pkn("tts_voice_id")
    public final String voiceId;

    /* JADX WARN: Multi-variable type inference failed */
    public TTSVoiceStruct() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, false, 2047, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TTSVoiceStruct)) {
            return false;
        }
        TTSVoiceStruct tTSVoiceStruct = (TTSVoiceStruct) obj;
        return o.LJ(this.voiceId, tTSVoiceStruct.voiceId) && o.LJ(this.description, tTSVoiceStruct.description) && o.LJ(this.iconUrl, tTSVoiceStruct.iconUrl) && o.LJ(this.previewAudioUrl, tTSVoiceStruct.previewAudioUrl) && o.LJ(this.videoCount, tTSVoiceStruct.videoCount) && o.LJ(this.videoList, tTSVoiceStruct.videoList) && o.LJ(this.hasMore, tTSVoiceStruct.hasMore) && o.LJ(this.cursor, tTSVoiceStruct.cursor) && o.LJ(this.creatorUserId, tTSVoiceStruct.creatorUserId) && o.LJ(this.creatorUserName, tTSVoiceStruct.creatorUserName) && this.showCreatorProfile == tTSVoiceStruct.showCreatorProfile;
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
        Integer num = this.videoCount;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        List<Aweme> list = this.videoList;
        int hashCode6 = (hashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num2 = this.hasMore;
        int hashCode7 = (hashCode6 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.cursor;
        int hashCode8 = (hashCode7 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str3 = this.creatorUserId;
        int hashCode9 = (hashCode8 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.creatorUserName;
        int hashCode10 = (hashCode9 + (str4 != null ? str4.hashCode() : 0)) * 31;
        boolean z = this.showCreatorProfile;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode10 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TTSVoiceStruct(voiceId=");
        sb.append(this.voiceId);
        sb.append(", description=");
        sb.append(this.description);
        sb.append(", iconUrl=");
        sb.append(this.iconUrl);
        sb.append(", previewAudioUrl=");
        sb.append(this.previewAudioUrl);
        sb.append(", videoCount=");
        sb.append(this.videoCount);
        sb.append(", videoList=");
        sb.append(this.videoList);
        sb.append(", hasMore=");
        sb.append(this.hasMore);
        sb.append(", cursor=");
        sb.append(this.cursor);
        sb.append(", creatorUserId=");
        sb.append(this.creatorUserId);
        sb.append(", creatorUserName=");
        sb.append(this.creatorUserName);
        sb.append(", showCreatorProfile=");
        return C08880Wm.LIZJ(sb, this.showCreatorProfile, ')');
    }

    public TTSVoiceStruct(String str, String str2, UrlStruct urlStruct, UrlStruct urlStruct2, Integer num, List<Aweme> list, Integer num2, Integer num3, String str3, String str4, boolean z) {
        this.voiceId = str;
        this.description = str2;
        this.iconUrl = urlStruct;
        this.previewAudioUrl = urlStruct2;
        this.videoCount = num;
        this.videoList = list;
        this.hasMore = num2;
        this.cursor = num3;
        this.creatorUserId = str3;
        this.creatorUserName = str4;
        this.showCreatorProfile = z;
    }

    public /* synthetic */ TTSVoiceStruct(String str, String str2, UrlStruct urlStruct, UrlStruct urlStruct2, Integer num, List list, Integer num2, Integer num3, String str3, String str4, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : urlStruct, (i & 8) != 0 ? null : urlStruct2, (i & 16) != 0 ? 0 : num, (i & 32) == 0 ? list : null, (i & 64) != 0 ? 0 : num2, (i & 128) != 0 ? 0 : num3, (i & 256) != 0 ? "" : str3, (i & 512) == 0 ? str4 : "", (i & 1024) == 0 ? z : false);
    }
}
