package com.ss.android.ugc.aweme.creative.model.music;

import X.C1FL;
import X.C279017q;
import X.C42648GoW;
import X.GPV;
import X.InterfaceC43620HAa;
import X.InterfaceC65349Pkn;
import X.UC7;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.creative.model.common.LogPbBean;
import com.ss.android.ugc.aweme.music.model.MusicTag;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class MusicBuzModel implements Parcelable {
    public static final Parcelable.Creator<MusicBuzModel> CREATOR = new C42648GoW();

    @InterfaceC65349Pkn("amr_detect_result")
    public Boolean amrDetectResult;

    @InterfaceC65349Pkn("cancel_able_in_shoot")
    public boolean cancelAbleInShoot;

    @InterfaceC65349Pkn("category_id")
    public String categoryID;

    @InterfaceC65349Pkn("challenge")
    public AVChallenge challenge;

    @InterfaceC65349Pkn("change_tone")
    public boolean changeTone;

    @InterfaceC65349Pkn("come_from_for_mod")
    public int comeFromForMod;

    @InterfaceC65349Pkn("from_section")
    public int fromSection;

    @InterfaceC65349Pkn("ignore_reuse_audio")
    public boolean ignoreReuseAudio;

    @InterfaceC65349Pkn("is_collected")
    public boolean isCollected;

    @InterfaceC65349Pkn("is_draft_music_illegal")
    public boolean isDraftMusicIllegal;

    @InterfaceC65349Pkn("is_draft_music_valid")
    public boolean isDraftMusicValid;

    @InterfaceC65349Pkn("is_mv_theme_music")
    public boolean isMvThemeMusic;

    @GPV
    public boolean isPhotoMvModeMusic;

    @GPV
    public boolean isReuseOriginalSound;

    @InterfaceC65349Pkn("is_sound_loop")
    public Boolean isSoundLoop;

    @InterfaceC65349Pkn("is_sts_mute_original_sound")
    public boolean isStsMuteOriginalSound;

    @InterfaceC65349Pkn("use_music_before_edit")
    public boolean isUseMusicBeforeEdit;

    @InterfaceC65349Pkn("local_music_duration")
    public long localMusicDuration;

    @InterfaceC65349Pkn("local_music_thumb")
    public String localThumbPath;

    @InterfaceC65349Pkn("log_pb")
    public LogPbBean logPb;

    @GPV
    public int mCurMusicLength;

    @GPV
    public int mMusicType;

    @InterfaceC65349Pkn("music_object")
    public MusicObject music;

    @InterfaceC65349Pkn("music_edit_from")
    public String musicEditFrom;

    @InterfaceC65349Pkn("music_end")
    public int musicEnd;

    @InterfaceC65349Pkn("music_end_from_cut")
    public int musicEndFromCut;

    @InterfaceC65349Pkn("music_length")
    public int musicLength;

    @InterfaceC65349Pkn("music_origin")
    public String musicOrigin;

    @GPV
    public String musicPath;

    @InterfaceC65349Pkn("music_priority")
    public int musicPriority;

    @GPV
    public int musicRecType;

    @InterfaceC65349Pkn("music_rec_type_recent")
    public String musicRecTypeRecent;

    @InterfaceC65349Pkn("music_select_tab")
    public String musicSelectTab;

    @GPV
    public int musicShowRank;

    @InterfaceC65349Pkn("music_start")
    public int musicStart;

    @InterfaceC65349Pkn("music_start_from_cut")
    public int musicStartFromCut;

    @InterfaceC65349Pkn("music_type")
    public int musicType;

    @InterfaceC65349Pkn("music_wave_data")
    public Float[] musicWaveData;

    @GPV
    public boolean needAddRecent;

    @InterfaceC65349Pkn("path")
    public String path;

    @GPV
    public String recommendSourceFrom;

    @GPV
    public String replaceMusicId;

    @GPV
    public String reuseOriginalSoundId;

    @GPV
    public int reuseOriginalSoundLength;

    @GPV
    public UrlModel reuseOriginalSoundUrls;

    @InterfaceC65349Pkn("search_key_words")
    public String searchKeyWords;

    @InterfaceC65349Pkn("should_show_commerce_tips")
    public boolean shouldShowCommerceTips;

    @GPV
    public int similarTag;

    @InterfaceC65349Pkn("song_id")
    public String songId;

    @InterfaceC65349Pkn("sound_filter_id")
    public String soundFilterId;

    @InterfaceC65349Pkn("sound_speed")
    public float soundSpeed;

    @InterfaceC65349Pkn("stick_point_music_alg")
    public StickPointMusicAlg stickPointMusicAlg;

    @InterfaceC65349Pkn("sts_effect_name")
    public String stsEffectName;

    @InterfaceC43620HAa
    @InterfaceC65349Pkn("sts_path")
    public String stsPath;

    @InterfaceC65349Pkn("sts_record_volume")
    public float stsRecordVolume;

    @InterfaceC65349Pkn("sts_template_id")
    public String stsTemplateId;

    @InterfaceC65349Pkn("sts_voice_detect_result")
    public Boolean stsVoiceDetectResult;

    @InterfaceC65349Pkn("sts_warp")
    public List<? extends List<Float>> stsWarp;

    @InterfaceC65349Pkn("tag_list")
    public List<MusicTag> tagList;

    @InterfaceC65349Pkn("user_count")
    public int userCount;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MusicBuzModel() {
        /*
            r65 = this;
            r1 = 0
            r2 = 0
            r4 = 0
            r21 = 0
            r62 = -1
            r63 = 268435455(0xfffffff, float:2.5243547E-29)
            r0 = r65
            r3 = r2
            r5 = r1
            r6 = r2
            r7 = r2
            r8 = r2
            r9 = r1
            r10 = r2
            r11 = r4
            r12 = r2
            r13 = r2
            r14 = r1
            r15 = r2
            r16 = r2
            r17 = r1
            r18 = r1
            r19 = r1
            r20 = r1
            r23 = r1
            r24 = r2
            r25 = r2
            r26 = r2
            r27 = r1
            r28 = r1
            r29 = r1
            r30 = r1
            r31 = r2
            r32 = r2
            r33 = r2
            r34 = r1
            r35 = r2
            r36 = r2
            r37 = r1
            r38 = r1
            r39 = r2
            r40 = r1
            r41 = r1
            r42 = r2
            r43 = r1
            r44 = r2
            r45 = r1
            r46 = r1
            r47 = r1
            r48 = r2
            r49 = r1
            r50 = r1
            r51 = r1
            r52 = r1
            r53 = r2
            r54 = r1
            r55 = r1
            r56 = r2
            r57 = r2
            r58 = r2
            r59 = r1
            r60 = r2
            r61 = r2
            r64 = r2
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel.<init>():void");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeInt(this.isDraftMusicValid ? 1 : 0);
        MusicObject musicObject = this.music;
        if (musicObject == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            musicObject.writeToParcel(out, i);
        }
        out.writeString(this.soundFilterId);
        out.writeFloat(this.soundSpeed);
        out.writeInt(this.changeTone ? 1 : 0);
        out.writeString(this.stsEffectName);
        out.writeString(this.stsTemplateId);
        List<? extends List<Float>> list = this.stsWarp;
        if (list == null) {
            out.writeInt(0);
        } else {
            Iterator LIZIZ = C279017q.LIZIZ(out, 1, list);
            while (LIZIZ.hasNext()) {
                Iterator LIZJ = UC7.LIZJ((List) LIZIZ.next(), out);
                while (LIZJ.hasNext()) {
                    out.writeFloat(((Number) LIZJ.next()).floatValue());
                }
            }
        }
        out.writeInt(this.isStsMuteOriginalSound ? 1 : 0);
        Boolean bool = this.stsVoiceDetectResult;
        if (bool == null) {
            out.writeInt(0);
        } else {
            C1FL.LJ(out, 1, bool);
        }
        out.writeFloat(this.stsRecordVolume);
        out.writeString(this.stsPath);
        Boolean bool2 = this.amrDetectResult;
        if (bool2 == null) {
            out.writeInt(0);
        } else {
            C1FL.LJ(out, 1, bool2);
        }
        out.writeInt(this.isCollected ? 1 : 0);
        out.writeParcelable(this.challenge, i);
        out.writeString(this.categoryID);
        out.writeInt(this.comeFromForMod);
        out.writeInt(this.fromSection);
        out.writeInt(this.ignoreReuseAudio ? 1 : 0);
        out.writeInt(this.isMvThemeMusic ? 1 : 0);
        out.writeLong(this.localMusicDuration);
        out.writeInt(this.userCount);
        List<MusicTag> list2 = this.tagList;
        if (list2 == null) {
            out.writeInt(0);
        } else {
            Iterator LIZIZ2 = C279017q.LIZIZ(out, 1, list2);
            while (LIZIZ2.hasNext()) {
                out.writeSerializable((Serializable) LIZIZ2.next());
            }
        }
        LogPbBean logPbBean = this.logPb;
        if (logPbBean == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            logPbBean.writeToParcel(out, i);
        }
        out.writeString(this.musicEditFrom);
        out.writeInt(this.musicStartFromCut);
        out.writeInt(this.musicEndFromCut);
        out.writeInt(this.musicPriority);
        out.writeInt(this.musicType);
        Float[] fArr = this.musicWaveData;
        if (fArr == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            int length = fArr.length;
            out.writeInt(length);
            for (int i2 = 0; i2 != length; i2++) {
                out.writeFloat(fArr[i2].floatValue());
            }
        }
        out.writeString(this.songId);
        out.writeString(this.searchKeyWords);
        out.writeInt(this.shouldShowCommerceTips ? 1 : 0);
        StickPointMusicAlg stickPointMusicAlg = this.stickPointMusicAlg;
        if (stickPointMusicAlg == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            stickPointMusicAlg.writeToParcel(out, i);
        }
        out.writeString(this.path);
        out.writeInt(this.cancelAbleInShoot ? 1 : 0);
        out.writeInt(this.isPhotoMvModeMusic ? 1 : 0);
        out.writeString(this.musicOrigin);
        out.writeInt(this.isDraftMusicIllegal ? 1 : 0);
        out.writeInt(this.isReuseOriginalSound ? 1 : 0);
        out.writeString(this.reuseOriginalSoundId);
        out.writeInt(this.reuseOriginalSoundLength);
        out.writeSerializable(this.reuseOriginalSoundUrls);
        out.writeInt(this.musicLength);
        out.writeInt(this.musicStart);
        out.writeInt(this.musicEnd);
        out.writeString(this.musicPath);
        out.writeInt(this.isUseMusicBeforeEdit ? 1 : 0);
        out.writeInt(this.mCurMusicLength);
        out.writeInt(this.musicShowRank);
        out.writeInt(this.musicRecType);
        Boolean bool3 = this.isSoundLoop;
        if (bool3 == null) {
            out.writeInt(0);
        } else {
            C1FL.LJ(out, 1, bool3);
        }
        out.writeInt(this.mMusicType);
        out.writeInt(this.similarTag);
        out.writeString(this.recommendSourceFrom);
        out.writeString(this.replaceMusicId);
        out.writeString(this.localThumbPath);
        out.writeInt(this.needAddRecent ? 1 : 0);
        out.writeString(this.musicSelectTab);
        out.writeString(this.musicRecTypeRecent);
    }

    public MusicBuzModel(boolean z, MusicObject musicObject, String str, float f, boolean z2, String str2, String str3, List<? extends List<Float>> list, boolean z3, Boolean bool, float f2, String str4, Boolean bool2, boolean z4, AVChallenge aVChallenge, String str5, int i, int i2, boolean z5, boolean z6, long j, int i3, List<MusicTag> list2, LogPbBean logPbBean, String str6, int i4, int i5, int i6, int i7, Float[] fArr, String str7, String str8, boolean z7, StickPointMusicAlg stickPointMusicAlg, String str9, boolean z8, boolean z9, String str10, boolean z10, boolean z11, String str11, int i8, UrlModel urlModel, int i9, int i10, int i11, String str12, boolean z12, int i12, int i13, int i14, Boolean bool3, int i15, int i16, String str13, String str14, String str15, boolean z13, String str16, String str17) {
        this.isDraftMusicValid = z;
        this.music = musicObject;
        this.soundFilterId = str;
        this.soundSpeed = f;
        this.changeTone = z2;
        this.stsEffectName = str2;
        this.stsTemplateId = str3;
        this.stsWarp = list;
        this.isStsMuteOriginalSound = z3;
        this.stsVoiceDetectResult = bool;
        this.stsRecordVolume = f2;
        this.stsPath = str4;
        this.amrDetectResult = bool2;
        this.isCollected = z4;
        this.challenge = aVChallenge;
        this.categoryID = str5;
        this.comeFromForMod = i;
        this.fromSection = i2;
        this.ignoreReuseAudio = z5;
        this.isMvThemeMusic = z6;
        this.localMusicDuration = j;
        this.userCount = i3;
        this.tagList = list2;
        this.logPb = logPbBean;
        this.musicEditFrom = str6;
        this.musicStartFromCut = i4;
        this.musicEndFromCut = i5;
        this.musicPriority = i6;
        this.musicType = i7;
        this.musicWaveData = fArr;
        this.songId = str7;
        this.searchKeyWords = str8;
        this.shouldShowCommerceTips = z7;
        this.stickPointMusicAlg = stickPointMusicAlg;
        this.path = str9;
        this.cancelAbleInShoot = z8;
        this.isPhotoMvModeMusic = z9;
        this.musicOrigin = str10;
        this.isDraftMusicIllegal = z10;
        this.isReuseOriginalSound = z11;
        this.reuseOriginalSoundId = str11;
        this.reuseOriginalSoundLength = i8;
        this.reuseOriginalSoundUrls = urlModel;
        this.musicLength = i9;
        this.musicStart = i10;
        this.musicEnd = i11;
        this.musicPath = str12;
        this.isUseMusicBeforeEdit = z12;
        this.mCurMusicLength = i12;
        this.musicShowRank = i13;
        this.musicRecType = i14;
        this.isSoundLoop = bool3;
        this.mMusicType = i15;
        this.similarTag = i16;
        this.recommendSourceFrom = str13;
        this.replaceMusicId = str14;
        this.localThumbPath = str15;
        this.needAddRecent = z13;
        this.musicSelectTab = str16;
        this.musicRecTypeRecent = str17;
    }

    public /* synthetic */ MusicBuzModel(boolean z, MusicObject musicObject, String str, float f, boolean z2, String str2, String str3, List list, boolean z3, Boolean bool, float f2, String str4, Boolean bool2, boolean z4, AVChallenge aVChallenge, String str5, int i, int i2, boolean z5, boolean z6, long j, int i3, List list2, LogPbBean logPbBean, String str6, int i4, int i5, int i6, int i7, Float[] fArr, String str7, String str8, boolean z7, StickPointMusicAlg stickPointMusicAlg, String str9, boolean z8, boolean z9, String str10, boolean z10, boolean z11, String str11, int i8, UrlModel urlModel, int i9, int i10, int i11, String str12, boolean z12, int i12, int i13, int i14, Boolean bool3, int i15, int i16, String str13, String str14, String str15, boolean z13, String str16, String str17, int i17, int i18, DefaultConstructorMarker defaultConstructorMarker) {
        this((i17 & 1) != 0 ? false : z, (i17 & 2) != 0 ? null : musicObject, (i17 & 4) != 0 ? null : str, (i17 & 8) != 0 ? 1.0f : f, (i17 & 16) != 0 ? false : z2, (i17 & 32) != 0 ? null : str2, (i17 & 64) != 0 ? null : str3, (i17 & 128) != 0 ? null : list, (i17 & 256) != 0 ? false : z3, (i17 & 512) != 0 ? null : bool, (i17 & 1024) == 0 ? f2 : 1.0f, (i17 & 2048) != 0 ? null : str4, (i17 & 4096) != 0 ? null : bool2, (i17 & FileUtils.BUFFER_SIZE) != 0 ? false : z4, (i17 & 16384) != 0 ? null : aVChallenge, (i17 & 32768) != 0 ? null : str5, (i17 & 65536) != 0 ? 0 : i, (i17 & 131072) != 0 ? MusicModel.FromSection.OTHER.ordinal() : i2, (i17 & 262144) != 0 ? false : z5, (524288 & i17) != 0 ? false : z6, (1048576 & i17) != 0 ? 0L : j, (2097152 & i17) != 0 ? 0 : i3, (4194304 & i17) != 0 ? null : list2, (8388608 & i17) != 0 ? null : logPbBean, (16777216 & i17) != 0 ? null : str6, (33554432 & i17) != 0 ? 0 : i4, (67108864 & i17) != 0 ? 0 : i5, (134217728 & i17) != 0 ? 0 : i6, (268435456 & i17) != 0 ? 0 : i7, (536870912 & i17) != 0 ? null : fArr, (1073741824 & i17) != 0 ? null : str7, (i17 & LiveLayoutPreloadThreadPriority.DEFAULT) != 0 ? null : str8, (i18 & 1) != 0 ? false : z7, (i18 & 2) != 0 ? null : stickPointMusicAlg, (i18 & 4) != 0 ? null : str9, (i18 & 8) != 0 ? false : z8, (i18 & 16) != 0 ? false : z9, (i18 & 32) != 0 ? null : str10, (i18 & 64) != 0 ? false : z10, (i18 & 128) != 0 ? false : z11, (i18 & 256) != 0 ? null : str11, (i18 & 512) != 0 ? 0 : i8, (i18 & 1024) != 0 ? null : urlModel, (i18 & 2048) != 0 ? 0 : i9, (i18 & 4096) != 0 ? 0 : i10, (i18 & FileUtils.BUFFER_SIZE) != 0 ? 0 : i11, (i18 & 16384) != 0 ? null : str12, (i18 & 32768) != 0 ? false : z12, (i18 & 65536) != 0 ? 0 : i12, (i18 & 131072) != 0 ? 0 : i13, (i18 & 262144) != 0 ? 0 : i14, (524288 & i18) != 0 ? Boolean.FALSE : bool3, (1048576 & i18) != 0 ? 0 : i15, (2097152 & i18) != 0 ? 0 : i16, (4194304 & i18) != 0 ? null : str13, (8388608 & i18) != 0 ? "" : str14, (16777216 & i18) != 0 ? null : str15, (33554432 & i18) != 0 ? false : z13, (67108864 & i18) != 0 ? null : str16, (i18 & 134217728) != 0 ? null : str17);
    }
}
