package com.ss.android.ugc.aweme.shortvideo.model;

import X.C16880lQ;
import X.C72112SRw;
import X.C78540Us4;
import X.V0N;
import android.net.Uri;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import com.ss.android.ugc.aweme.discover.model.Position;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.music.model.MatchedPGCSoundInfo;
import com.ss.android.ugc.aweme.music.model.MatchedSoundInfo;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicBeat;
import com.ss.android.ugc.aweme.music.model.MusicHighPrecisionDuration;
import com.ss.android.ugc.aweme.music.model.MusicReleaseInfo;
import com.ss.android.ugc.aweme.music.model.MusicTag;
import com.ss.android.ugc.aweme.music.model.TT2DSPSongInfo;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes13.dex */
public class MusicModel implements Serializable, Cloneable {
    public static final long serialVersionUID = -8201137807648519242L;
    public String album;
    public String allRate;
    public int auditionDuration;
    public String awemeId;
    public MusicBeat beatInfo;
    public int billboardRank;
    public String bindChallengeId;
    public String categoryID;
    public int challengeUserCount;
    public CollectionType collectionType;
    public int comeFromForMod;
    public int commercialRightType;
    public int dataType;
    public boolean dmvAutoShow;
    public int duration;
    public MusicHighPrecisionDuration durationHighPrecision;
    public String extra;
    public long id;
    public boolean isArtist;
    public boolean isChallengeMusic;
    public boolean isCommerceMusic;
    public boolean isMvThemeMusic;
    public boolean isOriginal;
    public boolean isOriginalSound;
    public boolean isPgc;
    public long localMusicDuration;
    public int localMusicId;
    public String localPath;
    public String localThumbPath;
    public LogPbBean logPb;
    public int lrcType;
    public String lrcUrl;
    public String lyricShort;
    public List<Position> lyricShortPosition;
    public DynamicPatch mDynamicPatch;
    public C72112SRw mExtraParamFromPretreatment;
    public MatchedSoundInfo mMatchedSongInfo;
    public int mSoundsListType;
    public MatchedPGCSoundInfo matchedPGCSoundInfo;
    public Music music;
    public int musicBeginTime;
    public String musicEditFrom;
    public String musicEffectsUrl;
    public int musicEndFromCut;
    public int musicEndTime;
    public String musicId;
    public long musicRecommendStatus;
    public MusicReleaseInfo musicReleaseInfo;
    public int musicStartFromCut;
    public int musicStatus;
    public List<MusicTag> musicTags;
    public MusicType musicType;
    public String musicVolumeInfo;
    public MusicWaveBean musicWaveBean;
    public boolean muteShare;
    public String name;
    public boolean needSetCookie;
    public String offlineDesc;
    public String picBig;
    public String picHuge;
    public String picPremium;
    public String picSmall;
    public int pinnedVideoStatus;
    public UrlModel playUrl;
    public boolean preventDownload;
    public float previewStartTime;
    public String recommendSourceFrom;
    public String recommendTag;
    public UrlModel reuseAudioPlayUrl;
    public String searchId;
    public String searchKeyWords;
    public int shootDuration;
    public boolean showDetail;
    public int similarTag;
    public String singer;
    public String songId;
    public int sourcePlatform;
    public UrlModel strongBeatUrl;
    public List<TT2DSPSongInfo> tt2DSPSongInfos;
    public int userCount;
    public int videoDuration;
    public CardType cardType = CardType.AWESearchMusicCardSinger;
    public String enterPosition = "";
    public String searchResultId = "";
    public String listItemId = "";
    public Long dateLastModified = 0L;
    public FromSection fromSection = FromSection.OTHER;
    public MusicItemType musicItemType = MusicItemType.ORIGIN;
    public int eventPosition = -1;
    public boolean needRecordConsumption = false;
    public int mFromCollectionType = 0;
    public boolean isPropOrChallenge = false;
    public boolean musicDetailFetched = false;
    public boolean downloadComplete = false;

    public Music convertToMusic() {
        int i;
        Music music = new Music();
        music.setMid(this.musicId);
        music.setId(this.id);
        music.setIdStr(String.valueOf(this.id));
        if (this.collectionType == CollectionType.COLLECTED) {
            i = 1;
        } else {
            i = 0;
        }
        music.setCollectStatus(i);
        music.setAlbum(this.album);
        music.setAuthorName(this.singer);
        if (getMusic() != null) {
            music.setChallenge(getMusic().getChallenge());
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.picBig);
        UrlModel urlModel = new UrlModel();
        urlModel.setUrlList(arrayList);
        urlModel.setUri(Uri.decode(this.picBig));
        music.setCoverLarge(urlModel);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(this.picPremium);
        UrlModel urlModel2 = new UrlModel();
        urlModel2.setUrlList(arrayList2);
        urlModel2.setUri(Uri.decode(this.picPremium));
        music.setCoverMedium(urlModel2);
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(this.picSmall);
        UrlModel urlModel3 = new UrlModel();
        urlModel3.setUrlList(arrayList3);
        urlModel3.setUri(Uri.decode(this.picSmall));
        music.setCoverThumb(urlModel3);
        music.setDuration(this.duration);
        music.setShootDuration(Integer.valueOf(this.shootDuration));
        music.setAuditionDuration(Integer.valueOf(this.auditionDuration));
        music.setDurationHighPrecision(this.durationHighPrecision);
        music.setMusicName(this.name);
        music.setUserCount(this.userCount);
        music.setMusicTags(this.musicTags);
        music.setSimilarTag(Integer.valueOf(this.similarTag));
        music.setRecommendSourceFrom(this.recommendSourceFrom);
        music.setBillboardRank(this.billboardRank);
        music.setCommercialMusic(this.isCommerceMusic);
        music.setOriginalSound(this.isOriginalSound);
        MusicType musicType = this.musicType;
        if (musicType == MusicType.ONLINE) {
            music.setPlayUrl(this.playUrl);
        } else if (musicType == MusicType.REUSE_AUDIO) {
            music.setReuseAudioPlayUrl(this.reuseAudioPlayUrl);
        }
        music.setOfflineDesc(this.offlineDesc);
        music.setMusicStatus(this.musicStatus);
        music.setMusicRecommendStatus(this.musicRecommendStatus);
        music.setStrongBeatUrl(this.strongBeatUrl);
        music.setLrcType(this.lrcType);
        music.setPreviewStartTime(this.previewStartTime);
        music.setLrcUrl(this.lrcUrl);
        music.setPreventDownload(isPreventDownload());
        music.setLyricShort(this.lyricShort);
        music.setLyricShortPosition(this.lyricShortPosition);
        music.setNeedSetCookie(isNeedSetCookie());
        music.setVideoDuration(this.videoDuration);
        music.setPgc(this.isPgc);
        music.setBeatInfo(this.beatInfo);
        music.setSoundsListType(this.mSoundsListType);
        music.setLocalMusicId(this.localMusicId);
        music.setMuteShare(this.muteShare);
        music.setSearchResultId(this.searchResultId);
        music.setListItemId(this.listItemId);
        music.setRecommendTag(this.recommendTag);
        music.setPinnedVideoStatus(this.pinnedVideoStatus);
        music.setMusicReleaseInfo(this.musicReleaseInfo);
        music.setTT2DSPSongInfos(this.tt2DSPSongInfos);
        music.setMusicVolumeInfo(this.musicVolumeInfo);
        return music;
    }

    public Integer getAuditionDuration() {
        return Integer.valueOf(this.auditionDuration);
    }

    public String getAwemeId() {
        String str = this.awemeId;
        if (str == null) {
            return "";
        }
        return str;
    }

    public CollectionType getCollectionType() {
        Music music = this.music;
        if (music != null) {
            if (music.getCollectStatus() != 1) {
                return CollectionType.NOT_COLLECTED;
            }
            return CollectionType.COLLECTED;
        }
        return this.collectionType;
    }

    public C72112SRw getExtraParamFromPretreatment() {
        if (this.mExtraParamFromPretreatment == null) {
            this.mExtraParamFromPretreatment = new C72112SRw();
        }
        return this.mExtraParamFromPretreatment;
    }

    public int getPresenterDuration() {
        if (this.musicType == MusicType.LOCAL_SCAN) {
            return (int) this.localMusicDuration;
        }
        int i = this.shootDuration;
        if (i > 0) {
            return i;
        }
        return this.duration;
    }

    public int getRealAuditionDuration() {
        int i = this.auditionDuration;
        if (i > 0) {
            return i;
        }
        return getPresenterDuration();
    }

    public Integer getShootDuration() {
        return Integer.valueOf(this.shootDuration);
    }

    public Integer getSimilarTag() {
        return Integer.valueOf(this.similarTag);
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

    public String getUri() {
        UrlModel urlModel;
        if ((this.musicType != MusicType.REUSE_AUDIO || (urlModel = this.reuseAudioPlayUrl) == null) && (urlModel = this.playUrl) == null) {
            return "";
        }
        return urlModel.getUri();
    }

    public boolean isLocalMusic() {
        MusicType musicType = this.musicType;
        if (musicType == MusicType.LOCAL_SCAN || musicType == MusicType.VIDEO_EXTRACT || musicType == MusicType.SPEECH_MUSIC || musicType == MusicType.SPEECH2SONG) {
            return true;
        }
        return false;
    }

    public boolean isPlayUrlValid() {
        UrlModel urlModel;
        if (this.musicType != MusicType.REUSE_AUDIO || (urlModel = this.reuseAudioPlayUrl) == null) {
            urlModel = this.playUrl;
        }
        if (urlModel == null || TextUtils.isEmpty(urlModel.getUri()) || C78540Us4.LJIILLIIL(urlModel.getUrlList())) {
            return false;
        }
        return true;
    }

    public Boolean isRealMusicItem() {
        boolean z;
        MusicItemType musicItemType = this.musicItemType;
        if (musicItemType == MusicItemType.ORIGIN || musicItemType == MusicItemType.RECOMMENDED_FAV_MUSIC) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public boolean isSpeechToSong() {
        if (this.musicType == MusicType.SPEECH2SONG) {
            return true;
        }
        return false;
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public MusicModel m159clone() {
        try {
            return (MusicModel) super.clone();
        } catch (CloneNotSupportedException e) {
            C16880lQ.LLLLIIL(e);
            return null;
        }
    }

    public String getAlbum() {
        return this.album;
    }

    public String getAllRate() {
        return this.allRate;
    }

    public MusicBeat getBeatInfo() {
        return this.beatInfo;
    }

    public int getBillboardRank() {
        return this.billboardRank;
    }

    public String getBindChallengeId() {
        return this.bindChallengeId;
    }

    public CardType getCardType() {
        return this.cardType;
    }

    public String getCategoryID() {
        return this.categoryID;
    }

    public int getChallengeUserCount() {
        return this.challengeUserCount;
    }

    public int getComeFromForMod() {
        return this.comeFromForMod;
    }

    public int getCommercialRightType() {
        return this.commercialRightType;
    }

    public int getDataType() {
        return this.dataType;
    }

    public Long getDateLastModified() {
        return this.dateLastModified;
    }

    public boolean getDmvAutoShow() {
        return this.dmvAutoShow;
    }

    public boolean getDownloadComplete() {
        return this.downloadComplete;
    }

    public int getDuration() {
        return this.duration;
    }

    public MusicHighPrecisionDuration getDurationHighPrecision() {
        return this.durationHighPrecision;
    }

    public DynamicPatch getDynamicPatch() {
        return this.mDynamicPatch;
    }

    public String getEditFrom() {
        return this.musicEditFrom;
    }

    public String getEnterPosition() {
        return this.enterPosition;
    }

    public int getEventPosition() {
        return this.eventPosition;
    }

    public String getExtra() {
        return this.extra;
    }

    public int getFromCollectionType() {
        return this.mFromCollectionType;
    }

    public FromSection getFromSection() {
        return this.fromSection;
    }

    public long getId() {
        return this.id;
    }

    public boolean getIsPropOrChallenge() {
        return this.isPropOrChallenge;
    }

    public String getListItemId() {
        return this.listItemId;
    }

    public long getLocalMusicDuration() {
        return this.localMusicDuration;
    }

    public int getLocalMusicId() {
        return this.localMusicId;
    }

    public String getLocalPath() {
        return this.localPath;
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

    public String getLyricShort() {
        return this.lyricShort;
    }

    public List<Position> getLyricShortPosition() {
        return this.lyricShortPosition;
    }

    public MatchedPGCSoundInfo getMatchedPGCSoundInfo() {
        return this.matchedPGCSoundInfo;
    }

    public MatchedSoundInfo getMatchedSongInfo() {
        return this.mMatchedSongInfo;
    }

    public Music getMusic() {
        return this.music;
    }

    public int getMusicBeginTime() {
        return this.musicBeginTime;
    }

    public boolean getMusicDetailFetched() {
        return this.musicDetailFetched;
    }

    public String getMusicEffects() {
        return this.musicEffectsUrl;
    }

    public int getMusicEndFromCut() {
        return this.musicEndFromCut;
    }

    public int getMusicEndTime() {
        return this.musicEndTime;
    }

    public String getMusicId() {
        return this.musicId;
    }

    public MusicItemType getMusicItemType() {
        return this.musicItemType;
    }

    public long getMusicRecommendStatus() {
        return this.musicRecommendStatus;
    }

    public MusicReleaseInfo getMusicReleaseInfo() {
        return this.musicReleaseInfo;
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

    public MusicType getMusicType() {
        return this.musicType;
    }

    public String getMusicVolumeInfo() {
        return this.musicVolumeInfo;
    }

    public MusicWaveBean getMusicWaveBean() {
        return this.musicWaveBean;
    }

    public String getName() {
        return this.name;
    }

    public boolean getNeedRecordConsumption() {
        return this.needRecordConsumption;
    }

    public String getOfflineDesc() {
        return this.offlineDesc;
    }

    public String getPicBig() {
        return this.picBig;
    }

    public String getPicHuge() {
        return this.picHuge;
    }

    public String getPicPremium() {
        return this.picPremium;
    }

    public String getPicSmall() {
        return this.picSmall;
    }

    public int getPinnedVideoStatus() {
        return this.pinnedVideoStatus;
    }

    public float getPreviewStartTime() {
        return this.previewStartTime;
    }

    public String getRecommendSourceFrom() {
        return this.recommendSourceFrom;
    }

    public String getRecommendTag() {
        return this.recommendTag;
    }

    public UrlModel getReuseAudioPlayUrl() {
        return this.reuseAudioPlayUrl;
    }

    public String getSearchId() {
        return this.searchId;
    }

    public String getSearchKeyWords() {
        return this.searchKeyWords;
    }

    public String getSearchResultId() {
        return this.searchResultId;
    }

    public String getSinger() {
        return this.singer;
    }

    public String getSongId() {
        return this.songId;
    }

    public int getSoundsListType() {
        return this.mSoundsListType;
    }

    public int getSourcePlatform() {
        return this.sourcePlatform;
    }

    public UrlModel getStrongBeatUrl() {
        return this.strongBeatUrl;
    }

    public List<TT2DSPSongInfo> getTT2DSPSongInfo() {
        return this.tt2DSPSongInfos;
    }

    public UrlModel getUrl() {
        return this.playUrl;
    }

    public int getUserCount() {
        return this.userCount;
    }

    public int getVideoDuration() {
        return this.videoDuration;
    }

    public boolean isArtist() {
        return this.isArtist;
    }

    public boolean isChallengeMusic() {
        return this.isChallengeMusic;
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

    public boolean isOriginal() {
        return this.isOriginal;
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

    /* loaded from: classes7.dex */
    public enum CardType {
        AWESearchMusicCardNone,
        AWESearchMusicCardOrdinary,
        AWESearchMusicCardDuplicated,
        AWESearchMusicCardSinger,
        AWESearchMusicCardMusicWithVideo;

        public static CardType valueOf(String str) {
            return (CardType) V0N.LJJJ(CardType.class, str);
        }
    }

    /* loaded from: classes5.dex */
    public enum CollectionType {
        NOT_COLLECTED,
        COLLECTED;

        public static CollectionType valueOf(String str) {
            return (CollectionType) V0N.LJJJ(CollectionType.class, str);
        }
    }

    /* loaded from: classes8.dex */
    public enum FromSection {
        OTHER("other"),
        CSP_BANNER("csp_banner"),
        CSP_RECOMMENDED("csp_recommended"),
        CSP_PLAYLISTS("csp_playlists"),
        CSP_UNFOLDED_PLAYLISTS("csp_unfolded_playlists"),
        CSP_VIEW_ALL_UNFOLDED_PLAYLIST("csp_view_all_unfolded_playlist"),
        SEARCH("search"),
        FAVORITE("favourite"),
        CHALLENGE("challenge"),
        EFFECT("effect"),
        NO_MUSIC("no_music");

        public final String value;

        public static FromSection valueOf(String str) {
            return (FromSection) V0N.LJJJ(FromSection.class, str);
        }

        FromSection(String str) {
            this.value = str;
        }
    }

    /* loaded from: classes16.dex */
    public enum MusicItemType {
        ORIGIN,
        MUSIC_SECTION_TITLE,
        RECOMMENDED_FAV_MUSIC,
        SEE_MORE_BUTTON,
        LOADING_VIEW;

        public static MusicItemType valueOf(String str) {
            return (MusicItemType) V0N.LJJJ(MusicItemType.class, str);
        }
    }

    /* loaded from: classes8.dex */
    public enum MusicType {
        LOCAL_SCAN,
        ONLINE,
        REUSE_AUDIO,
        VIDEO_EXTRACT,
        SPEECH2SONG,
        SPEECH_MUSIC;

        public static MusicType valueOf(String str) {
            return (MusicType) V0N.LJJJ(MusicType.class, str);
        }
    }

    public void setAlbum(String str) {
        this.album = str;
    }

    public void setAllRate(String str) {
        this.allRate = str;
    }

    public void setArtist(boolean z) {
        this.isArtist = z;
    }

    public void setAuditionDuration(Integer num) {
        this.auditionDuration = num.intValue();
    }

    public void setAwemeId(String str) {
        this.awemeId = str;
    }

    public void setBeatInfo(MusicBeat musicBeat) {
        this.beatInfo = musicBeat;
    }

    public void setBillboardRank(int i) {
        this.billboardRank = i;
    }

    public void setBindChallengeId(String str) {
        this.bindChallengeId = str;
    }

    public void setCardType(CardType cardType) {
        this.cardType = cardType;
    }

    public void setCategoryID(String str) {
        this.categoryID = str;
    }

    public void setChallengeMusic(boolean z) {
        this.isChallengeMusic = z;
    }

    public void setChallengeUserCount(int i) {
        this.challengeUserCount = i;
    }

    public void setCollectionType(CollectionType collectionType) {
        int i;
        this.collectionType = collectionType;
        Music music = this.music;
        if (music != null) {
            if (collectionType == CollectionType.NOT_COLLECTED) {
                i = 0;
            } else {
                i = 1;
            }
            music.setCollectStatus(i);
        }
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

    public void setDataType(int i) {
        this.dataType = i;
    }

    public void setDateLastModified(Long l) {
        this.dateLastModified = l;
    }

    public void setDmvAutoShow(boolean z) {
        this.dmvAutoShow = z;
    }

    public void setDownloadComplete(boolean z) {
        this.downloadComplete = z;
    }

    public void setDuration(int i) {
        this.duration = i;
    }

    public void setDurationHighPrecision(MusicHighPrecisionDuration musicHighPrecisionDuration) {
        this.durationHighPrecision = musicHighPrecisionDuration;
    }

    public void setDynamicPatch(DynamicPatch dynamicPatch) {
        this.mDynamicPatch = dynamicPatch;
    }

    public void setEditFrom(String str) {
        this.musicEditFrom = str;
    }

    public void setEnterPosition(String str) {
        this.enterPosition = str;
    }

    public void setEventPosition(int i) {
        this.eventPosition = i;
    }

    public void setExtra(String str) {
        this.extra = str;
    }

    public void setExtraParamFromPretreatment(C72112SRw c72112SRw) {
        this.mExtraParamFromPretreatment = c72112SRw;
    }

    public void setFromCollectionType(int i) {
        this.mFromCollectionType = i;
    }

    public void setFromSection(FromSection fromSection) {
        this.fromSection = fromSection;
    }

    public void setId(long j) {
        this.id = j;
    }

    public void setIsPropOrChallenge(boolean z) {
        this.isPropOrChallenge = z;
    }

    public void setListItemId(String str) {
        this.listItemId = str;
    }

    public void setLocalMusicDuration(long j) {
        this.localMusicDuration = j;
    }

    public void setLocalMusicId(int i) {
        this.localMusicId = i;
    }

    public void setLocalPath(String str) {
        this.localPath = str;
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

    public void setLyricShort(String str) {
        this.lyricShort = str;
    }

    public void setLyricShortPosition(List<Position> list) {
        this.lyricShortPosition = list;
    }

    public void setMatchedPGCSoundInfo(MatchedPGCSoundInfo matchedPGCSoundInfo) {
        this.matchedPGCSoundInfo = matchedPGCSoundInfo;
    }

    public void setMatchedSoundInfo(MatchedSoundInfo matchedSoundInfo) {
        this.mMatchedSongInfo = matchedSoundInfo;
    }

    public void setMusic(Music music) {
        this.music = music;
    }

    public void setMusicBeginTime(int i) {
        this.musicBeginTime = i;
    }

    public void setMusicDetailFetched(boolean z) {
        this.musicDetailFetched = z;
    }

    public MusicModel setMusicEffects(String str) {
        this.musicEffectsUrl = str;
        return this;
    }

    public void setMusicEndFromCut(int i) {
        this.musicEndFromCut = i;
    }

    public void setMusicEndTime(int i) {
        this.musicEndTime = i;
    }

    public void setMusicId(String str) {
        this.musicId = str;
    }

    public void setMusicItemType(MusicItemType musicItemType) {
        this.musicItemType = musicItemType;
    }

    public void setMusicRecommendStatus(long j) {
        this.musicRecommendStatus = j;
    }

    public void setMusicReleaseInfo(MusicReleaseInfo musicReleaseInfo) {
        this.musicReleaseInfo = musicReleaseInfo;
    }

    public void setMusicStartFromCut(int i) {
        this.musicStartFromCut = i;
    }

    public void setMusicStatus(int i) {
        this.musicStatus = i;
    }

    public void setMusicTags(List<MusicTag> list) {
        this.musicTags = list;
    }

    public void setMusicType(MusicType musicType) {
        this.musicType = musicType;
    }

    public void setMusicVolumeInfo(String str) {
        this.musicVolumeInfo = str;
    }

    public void setMusicWaveBean(MusicWaveBean musicWaveBean) {
        this.musicWaveBean = musicWaveBean;
    }

    public void setMuteShare(boolean z) {
        this.muteShare = z;
    }

    public void setMvThemeMusic(boolean z) {
        this.isMvThemeMusic = z;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setNeedRecordConsumption(boolean z) {
        this.needRecordConsumption = z;
    }

    public void setNeedSetCookie(boolean z) {
        this.needSetCookie = z;
    }

    public void setOfflineDesc(String str) {
        this.offlineDesc = str;
    }

    public void setOriginal(boolean z) {
        this.isOriginal = z;
    }

    public void setOriginalSound(boolean z) {
        this.isOriginalSound = z;
    }

    public void setPgc(boolean z) {
        this.isPgc = z;
    }

    public void setPicBig(String str) {
        this.picBig = str;
    }

    public void setPicHuge(String str) {
        this.picHuge = str;
    }

    public void setPicPremium(String str) {
        this.picPremium = str;
    }

    public void setPicSmall(String str) {
        this.picSmall = str;
    }

    public void setPinnedVideoStatus(int i) {
        this.pinnedVideoStatus = i;
    }

    public void setPreventDownload(boolean z) {
        this.preventDownload = z;
    }

    public void setPreviewStartTime(float f) {
        this.previewStartTime = f;
    }

    public void setRecommendSourceFrom(String str) {
        this.recommendSourceFrom = str;
    }

    public void setRecommendTag(String str) {
        this.recommendTag = str;
    }

    public void setReuseAudioPlayUrl(UrlModel urlModel) {
        this.reuseAudioPlayUrl = urlModel;
    }

    public void setSearchId(String str) {
        this.searchId = str;
    }

    public void setSearchKeyWords(String str) {
        this.searchKeyWords = str;
    }

    public void setSearchResultId(String str) {
        this.searchResultId = str;
    }

    public void setShootDuration(Integer num) {
        this.shootDuration = num.intValue();
    }

    public void setSimilarTag(Integer num) {
        this.similarTag = num.intValue();
    }

    public void setSinger(String str) {
        this.singer = str;
    }

    public void setSongId(String str) {
        this.songId = str;
    }

    public void setSoundsListType(int i) {
        this.mSoundsListType = i;
    }

    public void setSourcePlatform(int i) {
        this.sourcePlatform = i;
    }

    public void setStrongBeatUrl(UrlModel urlModel) {
        this.strongBeatUrl = urlModel;
    }

    public void setTT2DSPSongInfos(List<TT2DSPSongInfo> list) {
        this.tt2DSPSongInfos = list;
    }

    public void setUrl(UrlModel urlModel) {
        this.playUrl = urlModel;
    }

    public void setUserCount(int i) {
        this.userCount = i;
    }

    public void setVideoDuration(int i) {
        this.videoDuration = i;
    }
}
