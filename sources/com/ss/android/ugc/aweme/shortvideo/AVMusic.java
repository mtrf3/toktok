package com.ss.android.ugc.aweme.shortvideo;

import X.C16880lQ;
import X.GPV;
import X.InterfaceC65349Pkn;
import X.TNW;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.creative.model.common.LogPbBean;
import com.ss.android.ugc.aweme.creative.model.music.StickPointMusicAlg;
import com.ss.android.ugc.aweme.music.model.MusicBeat;
import com.ss.android.ugc.aweme.music.model.MusicHighPrecisionDuration;
import com.ss.android.ugc.aweme.music.model.MusicTag;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.io.Serializable;
import java.util.List;

/* loaded from: classes8.dex */
public class AVMusic implements Serializable, Cloneable, TNW {

    @InterfaceC65349Pkn("album")
    public String album;

    @InterfaceC65349Pkn("audition_duration")
    public int auditionDuration;

    @InterfaceC65349Pkn("author")
    public String authorName;

    @InterfaceC65349Pkn("cancel_able_in_shoot")
    public boolean cancelAbleInShoot;

    @InterfaceC65349Pkn("category_id")
    public String categoryID;

    @GPV
    public Integer ccTemplateMusicStartTime;

    @InterfaceC65349Pkn("challenge")
    public AVChallenge challenge;

    @InterfaceC65349Pkn(alternate = {"x"}, value = "collected")
    public boolean collected;

    @InterfaceC65349Pkn("come_from_for_mod")
    public int comeFromForMod;

    @InterfaceC65349Pkn("commercial_right_type")
    public int commercialRightType;

    @InterfaceC65349Pkn("cover_large")
    public UrlModel coverLarge;

    @InterfaceC65349Pkn("cover_medium")
    public UrlModel coverMedium;

    @InterfaceC65349Pkn("cover_thumb")
    public UrlModel coverThumb;

    @InterfaceC65349Pkn("dmv_auto_show")
    public boolean dmvAutoShow;

    @InterfaceC65349Pkn("duration")
    public int duration;

    @InterfaceC65349Pkn("duration_highPrecision")
    public MusicHighPrecisionDuration durationHighPrecision;

    @InterfaceC65349Pkn("extra")
    public String extra;

    @InterfaceC65349Pkn("id")
    public long id;

    @InterfaceC65349Pkn("is_commerce_music")
    public boolean isCommerceMusic;

    @InterfaceC65349Pkn("is_mv_theme_music")
    public boolean isMvThemeMusic;

    @InterfaceC65349Pkn("is_original_sound")
    public boolean isOriginalSound;

    @InterfaceC65349Pkn("is_pgc")
    public boolean isPgc;

    @InterfaceC65349Pkn("localmusic_duration")
    public long localMusicDuration;

    @InterfaceC65349Pkn("local_music_id")
    public int localMusicId;

    @InterfaceC65349Pkn("log_pb")
    public LogPbBean logPb;

    @InterfaceC65349Pkn("lyric_type")
    public int lrcType;

    @InterfaceC65349Pkn("lyric_url")
    public String lrcUrl;

    @InterfaceC65349Pkn("beat_info")
    public MusicBeat musicBeat;

    @InterfaceC65349Pkn("music_edit_from")
    public String musicEditFrom;

    @InterfaceC65349Pkn("music_end_from_cut")
    public int musicEndFromCut;

    @InterfaceC65349Pkn("title")
    public String musicName;

    @InterfaceC65349Pkn("music_priority")
    public int musicPriority;

    @InterfaceC65349Pkn("music_start_from_cut")
    public int musicStartFromCut;

    @InterfaceC65349Pkn("status")
    public int musicStatus;

    @InterfaceC65349Pkn("tag_list")
    public List<MusicTag> musicTags;

    @InterfaceC65349Pkn("music_type")
    public int musicType;

    @InterfaceC65349Pkn("music_wave_data")
    public float[] musicWaveData;

    @InterfaceC65349Pkn("mute_share")
    public boolean muteShare;

    @InterfaceC65349Pkn(alternate = {"y"}, value = "needSetCookie")
    public boolean needSetCookie;

    @InterfaceC65349Pkn("offline_desc")
    public String offlineDesc;

    @InterfaceC65349Pkn("path")
    public String path;

    @InterfaceC65349Pkn("play_url")
    public UrlModel playUrl;

    @InterfaceC65349Pkn("prevent_download")
    public boolean preventDownload;

    @InterfaceC65349Pkn("preview_start_time")
    public float previewStartTime;

    @InterfaceC65349Pkn("recommend_source_from")
    public String recommendSourceFrom;

    @InterfaceC65349Pkn("reuse_audio_play_url")
    public UrlModel reuseAudioPlayUrl;

    @InterfaceC65349Pkn("search_key_words")
    public String searchKeyWords;

    @InterfaceC65349Pkn("shoot_duration")
    public int shootDuration;

    @GPV
    public int similarTag;

    @InterfaceC65349Pkn("song_id")
    public String songId;

    @InterfaceC65349Pkn("sound_filter_id")
    public String soundFilterId;

    @InterfaceC65349Pkn("strong_beat_url")
    public UrlModel strongBeatUrl;

    @InterfaceC65349Pkn("user_count")
    public int userCount;

    @InterfaceC65349Pkn("video_duration")
    public int videoDuration;

    @InterfaceC65349Pkn("sound_speed")
    public Float soundSpeed = Float.valueOf(1.0f);

    @InterfaceC65349Pkn("change_tone")
    public Boolean changeTone = Boolean.TRUE;

    @InterfaceC65349Pkn("ignore_reuse_audio")
    public boolean ignoreReuseAudio = false;

    @InterfaceC65349Pkn("stick_point_music_alg")
    public StickPointMusicAlg stickPointMusicAlg = new StickPointMusicAlg();

    @InterfaceC65349Pkn("music_begin_time")
    public int musicBeginTime = 0;

    @InterfaceC65349Pkn("music_end_time")
    public int musicEndTime = 0;

    @InterfaceC65349Pkn("from_section")
    public MusicModel.FromSection fromSection = MusicModel.FromSection.OTHER;

    @InterfaceC65349Pkn("should_show_commerce_tips")
    public boolean shouldShowCommerceTips = false;

    @InterfaceC65349Pkn("local_music_thumb")
    public String localThumbPath = null;

    @InterfaceC65349Pkn("is_new_release_music")
    public Boolean isNewReleaseMusic = Boolean.FALSE;

    public int getAuditionDuration() {
        MusicHighPrecisionDuration musicHighPrecisionDuration = this.durationHighPrecision;
        if (musicHighPrecisionDuration != null && musicHighPrecisionDuration.checkDataValidate(musicHighPrecisionDuration.getAuditionDurationPrecision())) {
            MusicHighPrecisionDuration musicHighPrecisionDuration2 = this.durationHighPrecision;
            return musicHighPrecisionDuration2.convertS2MS(musicHighPrecisionDuration2.getAuditionDurationPrecision().floatValue());
        }
        return this.auditionDuration;
    }

    public int getDuration() {
        MusicHighPrecisionDuration musicHighPrecisionDuration = this.durationHighPrecision;
        if (musicHighPrecisionDuration != null && musicHighPrecisionDuration.checkDataValidate(musicHighPrecisionDuration.getDurationPrecision())) {
            MusicHighPrecisionDuration musicHighPrecisionDuration2 = this.durationHighPrecision;
            return musicHighPrecisionDuration2.convertS2MS(musicHighPrecisionDuration2.getDurationPrecision().floatValue());
        }
        return this.duration;
    }

    public boolean getIsNewReleaseMusic() {
        return this.isNewReleaseMusic.booleanValue();
    }

    public String getMid() {
        return String.valueOf(this.id);
    }

    @Override // X.TNW
    public String getMusicId() {
        return String.valueOf(this.id);
    }

    public String getPicBig() {
        UrlModel urlModel = this.coverLarge;
        if (urlModel == null || urlModel.getUrlList() == null || this.coverLarge.getUrlList().isEmpty()) {
            return null;
        }
        return (String) ListProtector.get(this.coverLarge.getUrlList(), 0);
    }

    public String getPicMedium() {
        UrlModel urlModel = this.coverMedium;
        if (urlModel == null || urlModel.getUrlList() == null || this.coverMedium.getUrlList().isEmpty()) {
            return null;
        }
        return (String) ListProtector.get(this.coverMedium.getUrlList(), 0);
    }

    public String getPicSmall() {
        UrlModel urlModel = this.coverThumb;
        if (urlModel == null || urlModel.getUrlList() == null || this.coverThumb.getUrlList().isEmpty()) {
            return null;
        }
        return (String) ListProtector.get(this.coverThumb.getUrlList(), 0);
    }

    public int getShootDuration() {
        MusicHighPrecisionDuration musicHighPrecisionDuration = this.durationHighPrecision;
        if (musicHighPrecisionDuration != null && musicHighPrecisionDuration.checkDataValidate(musicHighPrecisionDuration.getShootDurationPrecision())) {
            MusicHighPrecisionDuration musicHighPrecisionDuration2 = this.durationHighPrecision;
            return musicHighPrecisionDuration2.convertS2MS(musicHighPrecisionDuration2.getShootDurationPrecision().floatValue());
        }
        return this.shootDuration;
    }

    public int getTrimmedMusicDuration() {
        int i = this.musicBeginTime;
        int i2 = this.duration;
        if (i > i2) {
            return 0;
        }
        int i3 = this.musicEndTime;
        if (i3 == 0) {
            return i2 - i;
        }
        return i3 - i;
    }

    public int getVideoDuration() {
        MusicHighPrecisionDuration musicHighPrecisionDuration = this.durationHighPrecision;
        if (musicHighPrecisionDuration != null && musicHighPrecisionDuration.checkDataValidate(musicHighPrecisionDuration.getVideoDurationPrecision())) {
            MusicHighPrecisionDuration musicHighPrecisionDuration2 = this.durationHighPrecision;
            return musicHighPrecisionDuration2.convertS2MS(musicHighPrecisionDuration2.getVideoDurationPrecision().floatValue());
        }
        return this.videoDuration;
    }

    public boolean isLocalMusic() {
        if (this.musicType == MusicModel.MusicType.LOCAL_SCAN.ordinal() || this.musicType == MusicModel.MusicType.VIDEO_EXTRACT.ordinal() || this.musicType == MusicModel.MusicType.SPEECH2SONG.ordinal() || this.musicType == MusicModel.MusicType.SPEECH_MUSIC.ordinal()) {
            return true;
        }
        return false;
    }

    public boolean isNeedReuse() {
        if (this.musicType != 2 && getTrimmedMusicDuration() >= 1000 && getDuration() - getTrimmedMusicDuration() > 100) {
            return true;
        }
        return false;
    }

    public boolean isSpeechToSong() {
        if (this.musicType == 4) {
            return true;
        }
        return false;
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public AVMusic m156clone() {
        try {
            return (AVMusic) super.clone();
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public int getPresenterDuration() {
        if (getShootDuration() > 0) {
            return getShootDuration();
        }
        return getDuration();
    }

    public int getRealAuditionDuration() {
        if (getAuditionDuration() > 0) {
            return getAuditionDuration();
        }
        return getPresenterDuration();
    }

    public String getAlbum() {
        return this.album;
    }

    public String getCategoryID() {
        return this.categoryID;
    }

    public Boolean getChangeTone() {
        return this.changeTone;
    }

    public int getComeFromForMod() {
        return this.comeFromForMod;
    }

    public int getCommercialRightType() {
        return this.commercialRightType;
    }

    public UrlModel getCoverMedium() {
        return this.coverMedium;
    }

    public UrlModel getCoverThumb() {
        return this.coverThumb;
    }

    public boolean getDmvAutoShow() {
        return this.dmvAutoShow;
    }

    public String getEditFrom() {
        return this.musicEditFrom;
    }

    public MusicModel.FromSection getFromSection() {
        return this.fromSection;
    }

    public long getId() {
        return this.id;
    }

    public boolean getIgnoreReuseAudio() {
        return this.ignoreReuseAudio;
    }

    public long getLocalMusicDuration() {
        return this.localMusicDuration;
    }

    public int getLocalMusicId() {
        return this.localMusicId;
    }

    public String getLocalThumbPath() {
        return this.localThumbPath;
    }

    public LogPbBean getLogPb() {
        return this.logPb;
    }

    public int getLrcType() {
        return this.lrcType;
    }

    public String getLrcUrl() {
        return this.lrcUrl;
    }

    public MusicBeat getMusicBeat() {
        return this.musicBeat;
    }

    public int getMusicBeginTime() {
        return this.musicBeginTime;
    }

    public int getMusicEndFromCut() {
        return this.musicEndFromCut;
    }

    public int getMusicEndTime() {
        return this.musicEndTime;
    }

    public String getMusicName() {
        return this.musicName;
    }

    public int getMusicPriority() {
        return this.musicPriority;
    }

    public int getMusicStartFromCut() {
        return this.musicStartFromCut;
    }

    public int getMusicStatus() {
        return this.musicStatus;
    }

    public List<MusicTag> getMusicTags() {
        return this.musicTags;
    }

    public int getMusicType() {
        return this.musicType;
    }

    public float[] getMusicWaveData() {
        return this.musicWaveData;
    }

    public String getName() {
        return this.musicName;
    }

    public String getOfflineDesc() {
        return this.offlineDesc;
    }

    public String getPath() {
        return this.path;
    }

    public UrlModel getPlayUrl() {
        return this.playUrl;
    }

    public float getPreviewStartTime() {
        return this.previewStartTime;
    }

    public UrlModel getReuseAudioPlayUrl() {
        return this.reuseAudioPlayUrl;
    }

    public String getSearchKeyWords() {
        return this.searchKeyWords;
    }

    public String getSinger() {
        return this.authorName;
    }

    public String getSongId() {
        return this.songId;
    }

    public String getSoundFilterId() {
        return this.soundFilterId;
    }

    public Float getSoundSpeed() {
        return this.soundSpeed;
    }

    public StickPointMusicAlg getStickPointMusicAlg() {
        return this.stickPointMusicAlg;
    }

    @Override // X.TNW
    public UrlModel getStrongBeatUrl() {
        return this.strongBeatUrl;
    }

    public boolean isCancelAbleInShoot() {
        return this.cancelAbleInShoot;
    }

    public boolean isCollected() {
        return this.collected;
    }

    public boolean isCommerceMusic() {
        return this.isCommerceMusic;
    }

    public boolean isMuteShare() {
        return this.muteShare;
    }

    public boolean isMvThemeMusic() {
        return this.isMvThemeMusic;
    }

    public boolean isNeedSetCookie() {
        return this.needSetCookie;
    }

    public boolean isOriginalSound() {
        return this.isOriginalSound;
    }

    public boolean isPgc() {
        return this.isPgc;
    }

    public boolean isPreventDownload() {
        return this.preventDownload;
    }

    public boolean isShouldShowCommerceTips() {
        return this.shouldShowCommerceTips;
    }

    public void setAuditionDuration(int i) {
        MusicHighPrecisionDuration musicHighPrecisionDuration = this.durationHighPrecision;
        if (musicHighPrecisionDuration != null) {
            musicHighPrecisionDuration.setAuditionDurationPrecision(Float.valueOf(musicHighPrecisionDuration.convertMS2S(i)));
        }
        this.auditionDuration = i;
    }

    public void setCancelAbleInShoot(boolean z) {
        this.cancelAbleInShoot = z;
    }

    public void setCategoryID(String str) {
        this.categoryID = str;
    }

    public void setChangeTone(Boolean bool) {
        this.changeTone = bool;
    }

    public void setCollected(boolean z) {
        this.collected = z;
    }

    public void setComeFromForMod(int i) {
        this.comeFromForMod = i;
    }

    public void setCommerceMusic(boolean z) {
        this.isCommerceMusic = z;
    }

    public void setCommercialRightType(int i) {
        this.commercialRightType = i;
    }

    public void setDmvAutoShow(boolean z) {
        this.dmvAutoShow = z;
    }

    public void setDuration(int i) {
        MusicHighPrecisionDuration musicHighPrecisionDuration = this.durationHighPrecision;
        if (musicHighPrecisionDuration != null) {
            musicHighPrecisionDuration.setDurationPrecision(Float.valueOf(musicHighPrecisionDuration.convertMS2S(i)));
        }
        this.duration = i;
    }

    public void setEditFrom(String str) {
        this.musicEditFrom = str;
    }

    public void setFromSection(MusicModel.FromSection fromSection) {
        this.fromSection = fromSection;
    }

    public void setIsNewReleaseMusic(boolean z) {
        this.isNewReleaseMusic = Boolean.valueOf(z);
    }

    public void setLocalMusicDuration(long j) {
        this.localMusicDuration = j;
    }

    public void setLocalMusicId(int i) {
        this.localMusicId = i;
    }

    public void setLocalThumbPath(String str) {
        this.localThumbPath = str;
    }

    public void setLogPb(LogPbBean logPbBean) {
        this.logPb = logPbBean;
    }

    public void setLrcType(int i) {
        this.lrcType = i;
    }

    public void setLrcUrl(String str) {
        this.lrcUrl = str;
    }

    public void setMusicBeat(MusicBeat musicBeat) {
        this.musicBeat = musicBeat;
    }

    public void setMusicBeginTime(int i) {
        this.musicBeginTime = i;
    }

    public void setMusicEndFromCut(int i) {
        this.musicEndFromCut = i;
    }

    public void setMusicEndTime(int i) {
        this.musicEndTime = i;
    }

    public void setMusicId(String str) {
        try {
            this.id = CastLongProtector.parseLong(str);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    @Override // X.TNW
    public void setMusicPriority(int i) {
        this.musicPriority = i;
    }

    public void setMusicStartFromCut(int i) {
        this.musicStartFromCut = i;
    }

    public void setMusicTags(List<MusicTag> list) {
        this.musicTags = list;
    }

    public void setMusicWaveData(float[] fArr) {
        this.musicWaveData = fArr;
    }

    public void setMuteShare(boolean z) {
        this.muteShare = z;
    }

    public void setMvThemeMusic(boolean z) {
        this.isMvThemeMusic = z;
    }

    public void setNeedSetCookie(boolean z) {
        this.needSetCookie = z;
    }

    public void setOriginalSound(boolean z) {
        this.isOriginalSound = z;
    }

    public void setPgc(boolean z) {
        this.isPgc = z;
    }

    public void setPreventDownload(boolean z) {
        this.preventDownload = z;
    }

    public void setPreviewStartTime(float f) {
        this.previewStartTime = f;
    }

    public void setSearchKeyWords(String str) {
        this.searchKeyWords = str;
    }

    public void setShootDuration(int i) {
        MusicHighPrecisionDuration musicHighPrecisionDuration = this.durationHighPrecision;
        if (musicHighPrecisionDuration != null) {
            musicHighPrecisionDuration.setShootDurationPrecision(Float.valueOf(musicHighPrecisionDuration.convertMS2S(i)));
        }
        this.shootDuration = i;
    }

    public void setShouldShowCommerceTips(boolean z) {
        this.shouldShowCommerceTips = z;
    }

    public void setSongId(String str) {
        this.songId = str;
    }

    public void setSoundFilterId(String str) {
        this.soundFilterId = str;
    }

    public void setSoundSpeed(float f) {
        this.soundSpeed = Float.valueOf(f);
    }

    public void setStickPointMusicAlg(StickPointMusicAlg stickPointMusicAlg) {
        this.stickPointMusicAlg = stickPointMusicAlg;
    }

    public void setStrongBeatUrl(UrlModel urlModel) {
        this.strongBeatUrl = urlModel;
    }

    public void setVideoDuration(int i) {
        MusicHighPrecisionDuration musicHighPrecisionDuration = this.durationHighPrecision;
        if (musicHighPrecisionDuration != null) {
            musicHighPrecisionDuration.setVideoDurationPrecision(Float.valueOf(musicHighPrecisionDuration.convertMS2S(i)));
        }
        this.videoDuration = i;
    }
}
