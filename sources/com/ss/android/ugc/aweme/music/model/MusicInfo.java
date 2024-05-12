package com.ss.android.ugc.aweme.music.model;

import X.C08880Wm;
import X.C79062V1e;
import X.JBR;
import X.ORY;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.io.Serializable;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class MusicInfo implements Serializable {
    public static final Companion Companion = new Companion();
    public final String artistNames;
    public final String awemeId;
    public final String buttonText;
    public String clickSource;
    public final String clipId;
    public final DspImageUrlModel cover;
    public final long duration;
    public final String entrance;
    public final boolean isPgc;
    public final TTMLink link;
    public final Map<String, String> logExtraMap;
    public final String musicTitle;
    public final Integer product;
    public final String requestId;
    public final String subtitle;
    public final String title;
    public final String trackId;

    public static /* synthetic */ MusicInfo copy$default(MusicInfo musicInfo, String str, String str2, DspImageUrlModel dspImageUrlModel, long j, String str3, TTMLink tTMLink, String str4, String str5, String str6, String str7, String str8, Integer num, String str9, String str10, String str11, Map map, boolean z, int i, Object obj) {
        long j2 = j;
        DspImageUrlModel dspImageUrlModel2 = dspImageUrlModel;
        String str12 = str;
        String str13 = str2;
        String str14 = str5;
        String str15 = str4;
        String str16 = str3;
        TTMLink tTMLink2 = tTMLink;
        Integer num2 = num;
        String str17 = str9;
        String str18 = str8;
        String str19 = str6;
        String str20 = str7;
        Map map2 = map;
        String str21 = str10;
        boolean z2 = z;
        String str22 = str11;
        if ((i & 1) != 0) {
            str12 = musicInfo.musicTitle;
        }
        if ((i & 2) != 0) {
            str13 = musicInfo.artistNames;
        }
        if ((i & 4) != 0) {
            dspImageUrlModel2 = musicInfo.cover;
        }
        if ((i & 8) != 0) {
            j2 = musicInfo.duration;
        }
        if ((i & 16) != 0) {
            str16 = musicInfo.entrance;
        }
        if ((i & 32) != 0) {
            tTMLink2 = musicInfo.link;
        }
        if ((i & 64) != 0) {
            str15 = musicInfo.clickSource;
        }
        if ((i & 128) != 0) {
            str14 = musicInfo.trackId;
        }
        if ((i & 256) != 0) {
            str19 = musicInfo.clipId;
        }
        if ((i & 512) != 0) {
            str20 = musicInfo.requestId;
        }
        if ((i & 1024) != 0) {
            str18 = musicInfo.awemeId;
        }
        if ((i & 2048) != 0) {
            num2 = musicInfo.product;
        }
        if ((i & 4096) != 0) {
            str17 = musicInfo.title;
        }
        if ((i & FileUtils.BUFFER_SIZE) != 0) {
            str21 = musicInfo.subtitle;
        }
        if ((i & 16384) != 0) {
            str22 = musicInfo.buttonText;
        }
        if ((32768 & i) != 0) {
            map2 = musicInfo.logExtraMap;
        }
        if ((i & 65536) != 0) {
            z2 = musicInfo.isPgc;
        }
        String str23 = str16;
        TTMLink tTMLink3 = tTMLink2;
        return musicInfo.copy(str12, str13, dspImageUrlModel2, j2, str23, tTMLink3, str15, str14, str19, str20, str18, num2, str17, str21, str22, map2, z2);
    }

    public final MusicInfo copy(String musicTitle, String artistNames, DspImageUrlModel cover, long j, String entrance, TTMLink link, String clickSource, String trackId, String clipId, String requestId, String awemeId, Integer num, String str, String str2, String str3, Map<String, String> map, boolean z) {
        o.LJIIIZ(musicTitle, "musicTitle");
        o.LJIIIZ(artistNames, "artistNames");
        o.LJIIIZ(cover, "cover");
        o.LJIIIZ(entrance, "entrance");
        o.LJIIIZ(link, "link");
        o.LJIIIZ(clickSource, "clickSource");
        o.LJIIIZ(trackId, "trackId");
        o.LJIIIZ(clipId, "clipId");
        o.LJIIIZ(requestId, "requestId");
        o.LJIIIZ(awemeId, "awemeId");
        return new MusicInfo(musicTitle, artistNames, cover, j, entrance, link, clickSource, trackId, clipId, requestId, awemeId, num, str, str2, str3, map, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MusicInfo)) {
            return false;
        }
        MusicInfo musicInfo = (MusicInfo) obj;
        return o.LJ(this.musicTitle, musicInfo.musicTitle) && o.LJ(this.artistNames, musicInfo.artistNames) && o.LJ(this.cover, musicInfo.cover) && this.duration == musicInfo.duration && o.LJ(this.entrance, musicInfo.entrance) && o.LJ(this.link, musicInfo.link) && o.LJ(this.clickSource, musicInfo.clickSource) && o.LJ(this.trackId, musicInfo.trackId) && o.LJ(this.clipId, musicInfo.clipId) && o.LJ(this.requestId, musicInfo.requestId) && o.LJ(this.awemeId, musicInfo.awemeId) && o.LJ(this.product, musicInfo.product) && o.LJ(this.title, musicInfo.title) && o.LJ(this.subtitle, musicInfo.subtitle) && o.LJ(this.buttonText, musicInfo.buttonText) && o.LJ(this.logExtraMap, musicInfo.logExtraMap) && this.isPgc == musicInfo.isPgc;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int LJ = C79062V1e.LJ(this.awemeId, C79062V1e.LJ(this.requestId, C79062V1e.LJ(this.clipId, C79062V1e.LJ(this.trackId, C79062V1e.LJ(this.clickSource, (this.link.hashCode() + C79062V1e.LJ(this.entrance, JBR.LIZJ(this.duration, (this.cover.hashCode() + C79062V1e.LJ(this.artistNames, this.musicTitle.hashCode() * 31, 31)) * 31, 31), 31)) * 31, 31), 31), 31), 31), 31);
        Integer num = this.product;
        int i = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i2 = (LJ + hashCode) * 31;
        String str = this.title;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str2 = this.subtitle;
        if (str2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str2.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        String str3 = this.buttonText;
        if (str3 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str3.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        Map<String, String> map = this.logExtraMap;
        if (map != null) {
            i = map.hashCode();
        }
        int i6 = (i5 + i) * 31;
        boolean z = this.isPgc;
        int i7 = z;
        if (z != 0) {
            i7 = 1;
        }
        return i6 + i7;
    }

    public final boolean isClickDisk() {
        return o.LJ(this.clickSource, "click_source_disk");
    }

    public final boolean isClickIcon() {
        return o.LJ(this.clickSource, "click_source_icon");
    }

    public final boolean isClickMusicTitle() {
        return o.LJ(this.clickSource, "click_source_music_title");
    }

    public final boolean isInExp() {
        return ORY.LJJIJIIJIL(this.entrance, new String[]{"for_you_action_sheet", "music_detail_action_sheet", "music_detail_button"});
    }

    public final boolean isTtm() {
        Integer num = this.product;
        if (num == null || num.intValue() != 2) {
            return false;
        }
        return true;
    }

    public final boolean isUX1() {
        return o.LJ(this.entrance, "for_you_action_sheet");
    }

    public final boolean isUX2() {
        return o.LJ(this.entrance, "music_detail_action_sheet");
    }

    public final boolean isUX3() {
        return o.LJ(this.entrance, "music_detail_button");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("MusicInfo(musicTitle=");
        sb.append(this.musicTitle);
        sb.append(", artistNames=");
        sb.append(this.artistNames);
        sb.append(", cover=");
        sb.append(this.cover);
        sb.append(", duration=");
        sb.append(this.duration);
        sb.append(", entrance=");
        sb.append(this.entrance);
        sb.append(", link=");
        sb.append(this.link);
        sb.append(", clickSource=");
        sb.append(this.clickSource);
        sb.append(", trackId=");
        sb.append(this.trackId);
        sb.append(", clipId=");
        sb.append(this.clipId);
        sb.append(", requestId=");
        sb.append(this.requestId);
        sb.append(", awemeId=");
        sb.append(this.awemeId);
        sb.append(", product=");
        sb.append(this.product);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", subtitle=");
        sb.append(this.subtitle);
        sb.append(", buttonText=");
        sb.append(this.buttonText);
        sb.append(", logExtraMap=");
        sb.append(this.logExtraMap);
        sb.append(", isPgc=");
        return C08880Wm.LIZJ(sb, this.isPgc, ')');
    }

    /* loaded from: classes13.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public final String getArtistNames() {
        return this.artistNames;
    }

    public final String getAwemeId() {
        return this.awemeId;
    }

    public final String getButtonText() {
        return this.buttonText;
    }

    public final String getClickSource() {
        return this.clickSource;
    }

    public final String getClipId() {
        return this.clipId;
    }

    public final DspImageUrlModel getCover() {
        return this.cover;
    }

    public final long getDuration() {
        return this.duration;
    }

    public final String getEntrance() {
        return this.entrance;
    }

    public final TTMLink getLink() {
        return this.link;
    }

    public final Map<String, String> getLogExtraMap() {
        return this.logExtraMap;
    }

    public final String getMusicTitle() {
        return this.musicTitle;
    }

    public final Integer getProduct() {
        return this.product;
    }

    public final String getRequestId() {
        return this.requestId;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getTrackId() {
        return this.trackId;
    }

    public final boolean isPgc() {
        return this.isPgc;
    }

    public final void setClickSource(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.clickSource = str;
    }

    public MusicInfo(String musicTitle, String artistNames, DspImageUrlModel cover, long j, String entrance, TTMLink link, String clickSource, String trackId, String clipId, String requestId, String awemeId, Integer num, String str, String str2, String str3, Map<String, String> map, boolean z) {
        o.LJIIIZ(musicTitle, "musicTitle");
        o.LJIIIZ(artistNames, "artistNames");
        o.LJIIIZ(cover, "cover");
        o.LJIIIZ(entrance, "entrance");
        o.LJIIIZ(link, "link");
        o.LJIIIZ(clickSource, "clickSource");
        o.LJIIIZ(trackId, "trackId");
        o.LJIIIZ(clipId, "clipId");
        o.LJIIIZ(requestId, "requestId");
        o.LJIIIZ(awemeId, "awemeId");
        this.musicTitle = musicTitle;
        this.artistNames = artistNames;
        this.cover = cover;
        this.duration = j;
        this.entrance = entrance;
        this.link = link;
        this.clickSource = clickSource;
        this.trackId = trackId;
        this.clipId = clipId;
        this.requestId = requestId;
        this.awemeId = awemeId;
        this.product = num;
        this.title = str;
        this.subtitle = str2;
        this.buttonText = str3;
        this.logExtraMap = map;
        this.isPgc = z;
    }

    public /* synthetic */ MusicInfo(String str, String str2, DspImageUrlModel dspImageUrlModel, long j, String str3, TTMLink tTMLink, String str4, String str5, String str6, String str7, String str8, Integer num, String str9, String str10, String str11, Map map, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, dspImageUrlModel, j, str3, tTMLink, (i & 64) != 0 ? "" : str4, str5, str6, str7, str8, num, (i & 4096) != 0 ? null : str9, (i & FileUtils.BUFFER_SIZE) != 0 ? null : str10, (i & 16384) != 0 ? null : str11, (32768 & i) == 0 ? map : null, (i & 65536) != 0 ? false : z);
    }
}
