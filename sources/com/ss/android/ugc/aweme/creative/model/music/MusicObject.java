package com.ss.android.ugc.aweme.creative.model.music;

import X.C08880Wm;
import X.C16880lQ;
import X.C279017q;
import X.C47959Irz;
import X.I25;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.music.model.MusicBeat;
import com.ss.android.ugc.aweme.music.model.MusicHighPrecisionDuration;
import com.ss.android.ugc.aweme.music.model.MusicTag;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class MusicObject implements Parcelable {
    public static final Parcelable.Creator<MusicObject> CREATOR = new I25();

    @InterfaceC65349Pkn("album")
    public final String album;

    @InterfaceC65349Pkn("audition_duration")
    public final int auditionDuration;

    @InterfaceC65349Pkn("author")
    public final String authorName;

    @InterfaceC65349Pkn("beat_info")
    public final MusicBeat beatInfo;

    @InterfaceC65349Pkn("commercial_right_type")
    public final int commercialRightType;

    @InterfaceC65349Pkn("cover_large")
    public final UrlModel coverLarge;

    @InterfaceC65349Pkn("cover_medium")
    public final UrlModel coverMedium;

    @InterfaceC65349Pkn("cover_thumb")
    public final UrlModel coverThumb;

    @InterfaceC65349Pkn("dmv_auto_show")
    public final boolean dmvAutoShow;

    @InterfaceC65349Pkn("duration")
    public final int duration;

    @InterfaceC65349Pkn("duration_high_precision")
    public final MusicHighPrecisionDuration durationHighPrecision;

    @InterfaceC65349Pkn("extra")
    public final String extra;

    @InterfaceC65349Pkn("id")
    public final long id;

    @InterfaceC65349Pkn("is_commerce_music")
    public final boolean isCommerceMusic;

    @InterfaceC65349Pkn("is_new_release_music")
    public final boolean isNewReleaseMusic;

    @InterfaceC65349Pkn("is_original_sound")
    public final boolean isOriginalSound;

    @InterfaceC65349Pkn("is_pgc")
    public final boolean isPgc;

    @InterfaceC65349Pkn("local_music_id")
    public final int localMusicId;

    @InterfaceC65349Pkn("lyric_type")
    public final int lrcType;

    @InterfaceC65349Pkn("lyric_url")
    public final String lrcUrl;

    @InterfaceC65349Pkn("music_begin_time_in_ms")
    public final int musicBeginTime;

    @InterfaceC65349Pkn("music_end_time_in_ms")
    public final int musicEndTime;

    @InterfaceC65349Pkn("title")
    public final String musicName;

    @InterfaceC65349Pkn("status")
    public final int musicStatus;

    @InterfaceC65349Pkn("tag_list")
    public final List<MusicTag> musicTags;

    @InterfaceC65349Pkn("mute_share")
    public final boolean muteShare;

    @InterfaceC65349Pkn("is_audio_url_with_cookie")
    public final boolean needSetCookie;

    @InterfaceC65349Pkn("offline_desc")
    public final String offlineDesc;

    @InterfaceC65349Pkn("play_url")
    public final UrlModel playUrl;

    @InterfaceC65349Pkn("prevent_download")
    public final boolean preventDownload;

    @InterfaceC65349Pkn("preview_start_time")
    public final float previewStartTime;

    @InterfaceC65349Pkn("reuse_audio_play_url")
    public final UrlModel reuseAudioPlayUrl;

    @InterfaceC65349Pkn("shoot_duration")
    public final int shootDuration;

    @InterfaceC65349Pkn("strong_beat_url")
    public final UrlModel strongBeatUrl;

    @InterfaceC65349Pkn("user_count")
    public final int userCount;

    @InterfaceC65349Pkn("video_duration")
    public final int videoDuration;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MusicObject() {
        /*
            r41 = this;
            r1 = 0
            r3 = 0
            r5 = 0
            r30 = 0
            r38 = -1
            r39 = 15
            r0 = r41
            r4 = r3
            r6 = r5
            r7 = r5
            r8 = r3
            r9 = r3
            r10 = r3
            r11 = r5
            r12 = r3
            r13 = r3
            r14 = r5
            r15 = r5
            r16 = r5
            r17 = r5
            r18 = r5
            r19 = r3
            r20 = r3
            r21 = r5
            r22 = r5
            r23 = r3
            r24 = r5
            r25 = r5
            r26 = r5
            r27 = r3
            r28 = r3
            r29 = r5
            r31 = r3
            r32 = r3
            r33 = r5
            r34 = r3
            r35 = r5
            r36 = r5
            r37 = r5
            r40 = r3
            r0.<init>(r1, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.creative.model.music.MusicObject.<init>():void");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MusicObject)) {
            return false;
        }
        MusicObject musicObject = (MusicObject) obj;
        return this.id == musicObject.id && o.LJ(this.album, musicObject.album) && o.LJ(this.authorName, musicObject.authorName) && this.duration == musicObject.duration && this.auditionDuration == musicObject.auditionDuration && this.shootDuration == musicObject.shootDuration && o.LJ(this.coverLarge, musicObject.coverLarge) && o.LJ(this.coverMedium, musicObject.coverMedium) && o.LJ(this.coverThumb, musicObject.coverThumb) && this.dmvAutoShow == musicObject.dmvAutoShow && o.LJ(this.durationHighPrecision, musicObject.durationHighPrecision) && o.LJ(this.extra, musicObject.extra) && this.isCommerceMusic == musicObject.isCommerceMusic && this.isOriginalSound == musicObject.isOriginalSound && this.isPgc == musicObject.isPgc && this.localMusicId == musicObject.localMusicId && this.lrcType == musicObject.lrcType && o.LJ(this.lrcUrl, musicObject.lrcUrl) && o.LJ(this.beatInfo, musicObject.beatInfo) && this.musicBeginTime == musicObject.musicBeginTime && this.musicEndTime == musicObject.musicEndTime && o.LJ(this.musicName, musicObject.musicName) && this.musicStatus == musicObject.musicStatus && this.muteShare == musicObject.muteShare && this.needSetCookie == musicObject.needSetCookie && o.LJ(this.offlineDesc, musicObject.offlineDesc) && o.LJ(this.playUrl, musicObject.playUrl) && this.preventDownload == musicObject.preventDownload && Float.compare(this.previewStartTime, musicObject.previewStartTime) == 0 && o.LJ(this.reuseAudioPlayUrl, musicObject.reuseAudioPlayUrl) && o.LJ(this.strongBeatUrl, musicObject.strongBeatUrl) && this.userCount == musicObject.userCount && o.LJ(this.musicTags, musicObject.musicTags) && this.videoDuration == musicObject.videoDuration && this.commercialRightType == musicObject.commercialRightType && this.isNewReleaseMusic == musicObject.isNewReleaseMusic;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        int hashCode9;
        int hashCode10;
        int hashCode11;
        int hashCode12;
        int hashCode13;
        int hashCode14;
        int LLJIJIL = C16880lQ.LLJIJIL(this.id) * 31;
        String str = this.album;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (LLJIJIL + hashCode) * 31;
        String str2 = this.authorName;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (((((((i2 + hashCode2) * 31) + this.duration) * 31) + this.auditionDuration) * 31) + this.shootDuration) * 31;
        UrlModel urlModel = this.coverLarge;
        if (urlModel == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = urlModel.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        UrlModel urlModel2 = this.coverMedium;
        if (urlModel2 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = urlModel2.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        UrlModel urlModel3 = this.coverThumb;
        if (urlModel3 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = urlModel3.hashCode();
        }
        int i6 = (i5 + hashCode5) * 31;
        boolean z = this.dmvAutoShow;
        int i7 = 1;
        int i8 = z;
        if (z != 0) {
            i8 = 1;
        }
        int i9 = (i6 + i8) * 31;
        MusicHighPrecisionDuration musicHighPrecisionDuration = this.durationHighPrecision;
        if (musicHighPrecisionDuration == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = musicHighPrecisionDuration.hashCode();
        }
        int i10 = (i9 + hashCode6) * 31;
        String str3 = this.extra;
        if (str3 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = str3.hashCode();
        }
        int i11 = (i10 + hashCode7) * 31;
        boolean z2 = this.isCommerceMusic;
        int i12 = z2;
        if (z2 != 0) {
            i12 = 1;
        }
        int i13 = (i11 + i12) * 31;
        boolean z3 = this.isOriginalSound;
        int i14 = z3;
        if (z3 != 0) {
            i14 = 1;
        }
        int i15 = (i13 + i14) * 31;
        boolean z4 = this.isPgc;
        int i16 = z4;
        if (z4 != 0) {
            i16 = 1;
        }
        int i17 = (((((i15 + i16) * 31) + this.localMusicId) * 31) + this.lrcType) * 31;
        String str4 = this.lrcUrl;
        if (str4 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = str4.hashCode();
        }
        int i18 = (i17 + hashCode8) * 31;
        MusicBeat musicBeat = this.beatInfo;
        if (musicBeat == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = musicBeat.hashCode();
        }
        int i19 = (((((i18 + hashCode9) * 31) + this.musicBeginTime) * 31) + this.musicEndTime) * 31;
        String str5 = this.musicName;
        if (str5 == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = str5.hashCode();
        }
        int i20 = (((i19 + hashCode10) * 31) + this.musicStatus) * 31;
        boolean z5 = this.muteShare;
        int i21 = z5;
        if (z5 != 0) {
            i21 = 1;
        }
        int i22 = (i20 + i21) * 31;
        boolean z6 = this.needSetCookie;
        int i23 = z6;
        if (z6 != 0) {
            i23 = 1;
        }
        int i24 = (i22 + i23) * 31;
        String str6 = this.offlineDesc;
        if (str6 == null) {
            hashCode11 = 0;
        } else {
            hashCode11 = str6.hashCode();
        }
        int i25 = (i24 + hashCode11) * 31;
        UrlModel urlModel4 = this.playUrl;
        if (urlModel4 == null) {
            hashCode12 = 0;
        } else {
            hashCode12 = urlModel4.hashCode();
        }
        int i26 = (i25 + hashCode12) * 31;
        boolean z7 = this.preventDownload;
        int i27 = z7;
        if (z7 != 0) {
            i27 = 1;
        }
        int LIZIZ = C47959Irz.LIZIZ(this.previewStartTime, (i26 + i27) * 31, 31);
        UrlModel urlModel5 = this.reuseAudioPlayUrl;
        if (urlModel5 == null) {
            hashCode13 = 0;
        } else {
            hashCode13 = urlModel5.hashCode();
        }
        int i28 = (LIZIZ + hashCode13) * 31;
        UrlModel urlModel6 = this.strongBeatUrl;
        if (urlModel6 == null) {
            hashCode14 = 0;
        } else {
            hashCode14 = urlModel6.hashCode();
        }
        int i29 = (((i28 + hashCode14) * 31) + this.userCount) * 31;
        List<MusicTag> list = this.musicTags;
        if (list != null) {
            i = list.hashCode();
        }
        int i30 = (((((i29 + i) * 31) + this.videoDuration) * 31) + this.commercialRightType) * 31;
        if (!this.isNewReleaseMusic) {
            i7 = 0;
        }
        return i30 + i7;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MusicObject(id=");
        sb.append(this.id);
        sb.append(", album=");
        sb.append(this.album);
        sb.append(", authorName=");
        sb.append(this.authorName);
        sb.append(", duration=");
        sb.append(this.duration);
        sb.append(", auditionDuration=");
        sb.append(this.auditionDuration);
        sb.append(", shootDuration=");
        sb.append(this.shootDuration);
        sb.append(", coverLarge=");
        sb.append(this.coverLarge);
        sb.append(", coverMedium=");
        sb.append(this.coverMedium);
        sb.append(", coverThumb=");
        sb.append(this.coverThumb);
        sb.append(", dmvAutoShow=");
        sb.append(this.dmvAutoShow);
        sb.append(", durationHighPrecision=");
        sb.append(this.durationHighPrecision);
        sb.append(", extra=");
        sb.append(this.extra);
        sb.append(", isCommerceMusic=");
        sb.append(this.isCommerceMusic);
        sb.append(", isOriginalSound=");
        sb.append(this.isOriginalSound);
        sb.append(", isPgc=");
        sb.append(this.isPgc);
        sb.append(", localMusicId=");
        sb.append(this.localMusicId);
        sb.append(", lrcType=");
        sb.append(this.lrcType);
        sb.append(", lrcUrl=");
        sb.append(this.lrcUrl);
        sb.append(", beatInfo=");
        sb.append(this.beatInfo);
        sb.append(", musicBeginTime=");
        sb.append(this.musicBeginTime);
        sb.append(", musicEndTime=");
        sb.append(this.musicEndTime);
        sb.append(", musicName=");
        sb.append(this.musicName);
        sb.append(", musicStatus=");
        sb.append(this.musicStatus);
        sb.append(", muteShare=");
        sb.append(this.muteShare);
        sb.append(", needSetCookie=");
        sb.append(this.needSetCookie);
        sb.append(", offlineDesc=");
        sb.append(this.offlineDesc);
        sb.append(", playUrl=");
        sb.append(this.playUrl);
        sb.append(", preventDownload=");
        sb.append(this.preventDownload);
        sb.append(", previewStartTime=");
        sb.append(this.previewStartTime);
        sb.append(", reuseAudioPlayUrl=");
        sb.append(this.reuseAudioPlayUrl);
        sb.append(", strongBeatUrl=");
        sb.append(this.strongBeatUrl);
        sb.append(", userCount=");
        sb.append(this.userCount);
        sb.append(", musicTags=");
        sb.append(this.musicTags);
        sb.append(", videoDuration=");
        sb.append(this.videoDuration);
        sb.append(", commercialRightType=");
        sb.append(this.commercialRightType);
        sb.append(", isNewReleaseMusic=");
        return C08880Wm.LIZJ(sb, this.isNewReleaseMusic, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeLong(this.id);
        out.writeString(this.album);
        out.writeString(this.authorName);
        out.writeInt(this.duration);
        out.writeInt(this.auditionDuration);
        out.writeInt(this.shootDuration);
        out.writeSerializable(this.coverLarge);
        out.writeSerializable(this.coverMedium);
        out.writeSerializable(this.coverThumb);
        out.writeInt(this.dmvAutoShow ? 1 : 0);
        out.writeParcelable(this.durationHighPrecision, i);
        out.writeString(this.extra);
        out.writeInt(this.isCommerceMusic ? 1 : 0);
        out.writeInt(this.isOriginalSound ? 1 : 0);
        out.writeInt(this.isPgc ? 1 : 0);
        out.writeInt(this.localMusicId);
        out.writeInt(this.lrcType);
        out.writeString(this.lrcUrl);
        out.writeParcelable(this.beatInfo, i);
        out.writeInt(this.musicBeginTime);
        out.writeInt(this.musicEndTime);
        out.writeString(this.musicName);
        out.writeInt(this.musicStatus);
        out.writeInt(this.muteShare ? 1 : 0);
        out.writeInt(this.needSetCookie ? 1 : 0);
        out.writeString(this.offlineDesc);
        out.writeSerializable(this.playUrl);
        out.writeInt(this.preventDownload ? 1 : 0);
        out.writeFloat(this.previewStartTime);
        out.writeSerializable(this.reuseAudioPlayUrl);
        out.writeSerializable(this.strongBeatUrl);
        out.writeInt(this.userCount);
        List<MusicTag> list = this.musicTags;
        if (list == null) {
            out.writeInt(0);
        } else {
            Iterator LIZIZ = C279017q.LIZIZ(out, 1, list);
            while (LIZIZ.hasNext()) {
                out.writeSerializable((Serializable) LIZIZ.next());
            }
        }
        out.writeInt(this.videoDuration);
        out.writeInt(this.commercialRightType);
        out.writeInt(this.isNewReleaseMusic ? 1 : 0);
    }

    public MusicObject(long j, String str, String str2, int i, int i2, int i3, UrlModel urlModel, UrlModel urlModel2, UrlModel urlModel3, boolean z, MusicHighPrecisionDuration musicHighPrecisionDuration, String str3, boolean z2, boolean z3, boolean z4, int i4, int i5, String str4, MusicBeat musicBeat, int i6, int i7, String str5, int i8, boolean z5, boolean z6, String str6, UrlModel urlModel4, boolean z7, float f, UrlModel urlModel5, UrlModel urlModel6, int i9, List<MusicTag> list, int i10, int i11, boolean z8) {
        this.id = j;
        this.album = str;
        this.authorName = str2;
        this.duration = i;
        this.auditionDuration = i2;
        this.shootDuration = i3;
        this.coverLarge = urlModel;
        this.coverMedium = urlModel2;
        this.coverThumb = urlModel3;
        this.dmvAutoShow = z;
        this.durationHighPrecision = musicHighPrecisionDuration;
        this.extra = str3;
        this.isCommerceMusic = z2;
        this.isOriginalSound = z3;
        this.isPgc = z4;
        this.localMusicId = i4;
        this.lrcType = i5;
        this.lrcUrl = str4;
        this.beatInfo = musicBeat;
        this.musicBeginTime = i6;
        this.musicEndTime = i7;
        this.musicName = str5;
        this.musicStatus = i8;
        this.muteShare = z5;
        this.needSetCookie = z6;
        this.offlineDesc = str6;
        this.playUrl = urlModel4;
        this.preventDownload = z7;
        this.previewStartTime = f;
        this.reuseAudioPlayUrl = urlModel5;
        this.strongBeatUrl = urlModel6;
        this.userCount = i9;
        this.musicTags = list;
        this.videoDuration = i10;
        this.commercialRightType = i11;
        this.isNewReleaseMusic = z8;
    }

    public /* synthetic */ MusicObject(long j, String str, String str2, int i, int i2, int i3, UrlModel urlModel, UrlModel urlModel2, UrlModel urlModel3, boolean z, MusicHighPrecisionDuration musicHighPrecisionDuration, String str3, boolean z2, boolean z3, boolean z4, int i4, int i5, String str4, MusicBeat musicBeat, int i6, int i7, String str5, int i8, boolean z5, boolean z6, String str6, UrlModel urlModel4, boolean z7, float f, UrlModel urlModel5, UrlModel urlModel6, int i9, List list, int i10, int i11, boolean z8, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? 0L : j, (i12 & 2) != 0 ? null : str, (i12 & 4) != 0 ? null : str2, (i12 & 8) != 0 ? 0 : i, (i12 & 16) != 0 ? 0 : i2, (i12 & 32) != 0 ? 0 : i3, (i12 & 64) != 0 ? null : urlModel, (i12 & 128) != 0 ? null : urlModel2, (i12 & 256) != 0 ? null : urlModel3, (i12 & 512) != 0 ? false : z, (i12 & 1024) != 0 ? null : musicHighPrecisionDuration, (i12 & 2048) != 0 ? null : str3, (i12 & 4096) != 0 ? false : z2, (i12 & FileUtils.BUFFER_SIZE) != 0 ? false : z3, (i12 & 16384) != 0 ? false : z4, (32768 & i12) != 0 ? 0 : i4, (65536 & i12) != 0 ? 0 : i5, (131072 & i12) != 0 ? null : str4, (262144 & i12) != 0 ? null : musicBeat, (524288 & i12) != 0 ? 0 : i6, (1048576 & i12) != 0 ? 0 : i7, (2097152 & i12) != 0 ? null : str5, (4194304 & i12) != 0 ? 0 : i8, (8388608 & i12) != 0 ? false : z5, (16777216 & i12) != 0 ? false : z6, (33554432 & i12) != 0 ? null : str6, (67108864 & i12) != 0 ? null : urlModel4, (134217728 & i12) != 0 ? false : z7, (268435456 & i12) != 0 ? 0.0f : f, (536870912 & i12) != 0 ? null : urlModel5, (1073741824 & i12) != 0 ? null : urlModel6, (i12 & LiveLayoutPreloadThreadPriority.DEFAULT) != 0 ? 0 : i9, (i13 & 1) != 0 ? null : list, (i13 & 2) != 0 ? 0 : i10, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? false : z8);
    }
}
