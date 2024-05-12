package com.ss.android.ugc.aweme.music.model;

import X.C16880lQ;
import X.C72112SRw;
import X.InterfaceC65349Pkn;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.share.ShareInfo;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.discover.model.Position;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.search.HighlightInfo;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.playerkit.simapicommon.model.SimBitRate;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes13.dex */
public class Music implements Serializable {

    @InterfaceC65349Pkn("album")
    public String album;

    @InterfaceC65349Pkn("audition_duration")
    public int auditionDuration;

    @InterfaceC65349Pkn("author")
    public String authorName;

    @InterfaceC65349Pkn("avatar_thumb")
    public UrlModel avatarThumb;

    @InterfaceC65349Pkn("beat_info")
    public MusicBeat beatInfo;

    @InterfaceC65349Pkn("billboard_rank")
    public int billboardRank;

    @InterfaceC65349Pkn("binded_challenge_id")
    public Long bindChallengeId;

    @InterfaceC65349Pkn("can_not_reuse")
    public boolean canNotReuse;

    @InterfaceC65349Pkn("challenge")
    public Challenge challenge;

    @InterfaceC65349Pkn("challenge_name")
    public String challengeName;

    @InterfaceC65349Pkn("collect_stat")
    public int collectStatus;

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

    @InterfaceC65349Pkn("duration_high_precision")
    public MusicHighPrecisionDuration durationHighPrecision;

    @InterfaceC65349Pkn("effects_data")
    public UrlModel effectsData;

    @InterfaceC65349Pkn("external_song_subtitle")
    public String exclusiveSubTitle;

    @InterfaceC65349Pkn("extra")
    public String extra;
    public List<MusicOwnerInfo> highlightMusicOwnerInfo;

    @InterfaceC65349Pkn("id")
    public long id;

    @InterfaceC65349Pkn("id_str")
    public String idStr;

    @InterfaceC65349Pkn("is_author_artist")
    public boolean isArtistMusic;

    @InterfaceC65349Pkn("author_deleted")
    public boolean isAuthorDeleted;

    @InterfaceC65349Pkn("is_commerce_music")
    public boolean isCommercialMusic;

    @InterfaceC65349Pkn("is_matched_metadata")
    public boolean isMatchMetadata;

    @InterfaceC65349Pkn("is_original")
    public boolean isOriginMusic;

    @InterfaceC65349Pkn("is_original_sound")
    public boolean isOriginalSound;

    @InterfaceC65349Pkn("is_pgc")
    public boolean isPgc;

    @InterfaceC65349Pkn("is_shooting_allow")
    public Boolean isShootingAllowed;

    @InterfaceC65349Pkn("local_music_id")
    public int localMusicId;

    @InterfaceC65349Pkn("log_extra")
    public String logExtra;
    public HashMap<String, String> logExtraMap;

    @InterfaceC65349Pkn("lyric_type")
    public int lrcType;

    @InterfaceC65349Pkn("lyric_url")
    public String lrcUrl;

    @InterfaceC65349Pkn("lyric_short")
    public String lyricShort;

    @InterfaceC65349Pkn("lyric_short_position")
    public List<Position> lyricShortPosition;

    @InterfaceC65349Pkn("external_song_info")
    public List<ExternalMusicInfo> mExternalMusicInfos;
    public C72112SRw mExtraParamFromPretreatment;

    @InterfaceC65349Pkn("search_highlight")
    public List<HighlightInfo> mHighlightInfoList;

    @InterfaceC65349Pkn("matched_song")
    public MatchedSoundInfo mMatchedSongInfo;

    @InterfaceC65349Pkn("artists")
    public List<MusicOwnerInfo> mMusicOwnerInfos;

    @InterfaceC65349Pkn("owner_ban_show_info")
    public String mOwnerBanShowInfo;

    @InterfaceC65349Pkn("search_music_desc")
    public String mSearchMusicDesc;

    @InterfaceC65349Pkn("search_music_name")
    public String mSearchMusicName;
    public int mSoundsListType;

    @InterfaceC65349Pkn("matched_pgc_sound")
    public MatchedPGCSoundInfo matchedPGCSoundInfo;

    @InterfaceC65349Pkn("multi_bit_rate_play_info")
    public List<SimBitRate> multiBitRatePlayInfo;

    @InterfaceC65349Pkn("title")
    public String musicName;

    @InterfaceC65349Pkn("recommend_status")
    public long musicRecommendStatus;

    @InterfaceC65349Pkn("music_release_info")
    public MusicReleaseInfo musicReleaseInfo;

    @InterfaceC65349Pkn("status")
    public int musicStatus;

    @InterfaceC65349Pkn("tag_list")
    public List<MusicTag> musicTags;

    @InterfaceC65349Pkn("vid_volume_info")
    public String musicVolumeInfo;

    @InterfaceC65349Pkn("mute_share")
    public boolean muteShare;

    @InterfaceC65349Pkn("is_audio_url_with_cookie")
    public boolean needSetCookie;

    @InterfaceC65349Pkn("offline_desc")
    public String offlineDesc;

    @InterfaceC65349Pkn("owner_handle")
    public String ownerHandle;

    @InterfaceC65349Pkn("owner_id")
    public String ownerId;

    @InterfaceC65349Pkn("owner_nickname")
    public String ownerNickName;
    public String path;

    @InterfaceC65349Pkn("pinned_video_status")
    public int pinnedVideoStatus;

    @InterfaceC65349Pkn("play_url")
    public UrlModel playUrl;

    @InterfaceC65349Pkn("position")
    public List<Position> positions;

    @InterfaceC65349Pkn("prevent_download")
    public boolean preventDownload;

    @InterfaceC65349Pkn("preview_end_time")
    public float previewEndTime;

    @InterfaceC65349Pkn("preview_page_show_mode")
    public int previewPageShowMode;

    @InterfaceC65349Pkn("preview_start_time")
    public float previewStartTime;

    @InterfaceC65349Pkn("recommend_source_from")
    public String recommendSourceFrom;

    @InterfaceC65349Pkn("recommend_tag")
    public String recommendTag;
    public String requestId;

    @InterfaceC65349Pkn("reuse_audio_play_url")
    public UrlModel reuseAudioPlayUrl;

    @InterfaceC65349Pkn("search_id")
    public String searchId;

    @InterfaceC65349Pkn("sec_uid")
    public String secUid;

    @InterfaceC65349Pkn("share_info")
    public ShareInfo shareInfo;

    @InterfaceC65349Pkn("shoot_duration")
    public int shootDuration;
    public int similarTag;

    @InterfaceC65349Pkn("strong_beat_url")
    public UrlModel strongBeatUrl;

    @InterfaceC65349Pkn("tt_to_dsp_song_infos")
    public List<TT2DSPSongInfo> tt2DSPSongInfos;

    @InterfaceC65349Pkn("ttm_music_info")
    public TTMMusicInfo ttmInfo;

    @InterfaceC65349Pkn("user_count")
    public int userCount;

    @InterfaceC65349Pkn("video_duration")
    public int videoDuration;

    @InterfaceC65349Pkn("related_musics")
    public List<Music> relatedMusics = new ArrayList();

    @InterfaceC65349Pkn("music_begin_time_in_ms")
    public int musicBeginTime = 0;

    @InterfaceC65349Pkn("music_end_time_in_ms")
    public int musicEndTime = 0;

    @InterfaceC65349Pkn("search_result_id")
    public String searchResultId = "";

    @InterfaceC65349Pkn("list_item_id")
    public String listItemId = "";

    @InterfaceC65349Pkn("enter_position")
    public String enterPosition = "";
    public boolean isFriendTagVisible = false;
    public boolean isFollowerTagVisible = false;

    public MusicModel convertToMusicModel() {
        MusicModel musicModel = new MusicModel();
        musicModel.setMusic(this);
        if (getCoverMedium() != null && getCoverMedium().getUrlList() != null && getCoverMedium().getUrlList().size() > 0) {
            musicModel.setPicPremium((String) ListProtector.get(getCoverMedium().getUrlList(), 0));
        }
        if (getCoverThumb() != null && getCoverThumb().getUrlList() != null && getCoverThumb().getUrlList().size() > 0) {
            musicModel.setPicSmall((String) ListProtector.get(getCoverThumb().getUrlList(), 0));
        }
        if (getCoverLarge() != null && getCoverLarge().getUrlList() != null && getCoverLarge().getUrlList().size() > 0) {
            musicModel.setPicBig((String) ListProtector.get(getCoverLarge().getUrlList(), 0));
        }
        if (getCollectStatus() == 1) {
            musicModel.setCollectionType(MusicModel.CollectionType.COLLECTED);
        } else {
            musicModel.setCollectionType(MusicModel.CollectionType.NOT_COLLECTED);
        }
        MusicModel.MusicType musicType = MusicModel.MusicType.ONLINE;
        musicModel.setSinger(getAuthorName());
        musicModel.setUrl(getPlayUrl());
        musicModel.setMusicType(musicType);
        musicModel.setName(getMusicName());
        musicModel.setMusicId(getMid());
        musicModel.setDuration(getDuration() * 1000);
        musicModel.setShootDuration(Integer.valueOf(getShootDuration() * 1000));
        musicModel.setAuditionDuration(Integer.valueOf(getAuditionDuration() * 1000));
        musicModel.setDurationHighPrecision(this.durationHighPrecision);
        musicModel.setOfflineDesc(getOfflineDesc());
        musicModel.setMusicStatus(getMusicStatus());
        musicModel.setMusicRecommendStatus(getMusicRecommendStatus());
        musicModel.setUserCount(this.userCount);
        musicModel.setOriginal(isOriginMusic());
        musicModel.setArtist(isArtistMusic());
        musicModel.setBillboardRank(getBillboardRank());
        musicModel.setId(getId());
        musicModel.setLrcUrl(this.lrcUrl);
        musicModel.setLrcType(this.lrcType);
        musicModel.setPreviewStartTime(this.previewStartTime);
        musicModel.setCommerceMusic(this.isCommercialMusic);
        musicModel.setOriginalSound(this.isOriginalSound);
        musicModel.setLyricShort(this.lyricShort);
        musicModel.setLyricShortPosition(this.lyricShortPosition);
        musicModel.setEnterPosition(this.enterPosition);
        musicModel.setMusicTags(this.musicTags);
        musicModel.setSimilarTag(Integer.valueOf(this.similarTag));
        musicModel.setRecommendSourceFrom(this.recommendSourceFrom);
        if (getEffectsData() != null && getEffectsData().getUrlList() != null && !getEffectsData().getUrlList().isEmpty()) {
            musicModel.setMusicEffects((String) ListProtector.get(getEffectsData().getUrlList(), 0));
        }
        musicModel.setStrongBeatUrl(this.strongBeatUrl);
        musicModel.setPreventDownload(isPreventDownload());
        musicModel.setDmvAutoShow(this.dmvAutoShow);
        musicModel.setNeedSetCookie(isNeedSetCookie());
        musicModel.setBindChallengeId(getBindChallengeId());
        musicModel.setMatchedPGCSoundInfo(this.matchedPGCSoundInfo);
        musicModel.setVideoDuration(this.videoDuration);
        musicModel.setPgc(this.isPgc);
        musicModel.setBeatInfo(this.beatInfo);
        musicModel.setMatchedSoundInfo(this.mMatchedSongInfo);
        musicModel.setExtraParamFromPretreatment(this.mExtraParamFromPretreatment);
        musicModel.setSoundsListType(this.mSoundsListType);
        musicModel.setLocalMusicId(this.localMusicId);
        musicModel.setMuteShare(this.muteShare);
        musicModel.setMusicBeginTime(this.musicBeginTime);
        musicModel.setMusicEndTime(this.musicEndTime);
        musicModel.setCommercialRightType(this.commercialRightType);
        musicModel.setRecommendTag(this.recommendTag);
        if (!TextUtils.isEmpty(this.searchId)) {
            LogPbBean logPb = musicModel.getLogPb();
            if (logPb == null) {
                logPb = new LogPbBean();
                musicModel.setLogPb(logPb);
            }
            logPb.setImprId(this.searchId);
        }
        musicModel.setSearchResultId(this.searchResultId);
        musicModel.setListItemId(this.listItemId);
        musicModel.setPinnedVideoStatus(this.pinnedVideoStatus);
        musicModel.setMusicReleaseInfo(this.musicReleaseInfo);
        musicModel.setTT2DSPSongInfos(this.tt2DSPSongInfos);
        musicModel.setMusicVolumeInfo(this.musicVolumeInfo);
        return musicModel;
    }

    public List<MusicOwnerInfo> getArtistProfileList() {
        ArrayList arrayList = new ArrayList();
        List<MusicOwnerInfo> list = this.mMusicOwnerInfos;
        if (list == null) {
            return arrayList;
        }
        for (MusicOwnerInfo musicOwnerInfo : list) {
            if (musicOwnerInfo != null && musicOwnerInfo.getShowArtistProfileBtn()) {
                arrayList.add(musicOwnerInfo);
            }
        }
        return arrayList;
    }

    public int getAuditionDurationMs() {
        return this.auditionDuration * 1000;
    }

    public String getBindChallengeId() {
        return String.valueOf(this.bindChallengeId);
    }

    public C72112SRw getExtraParamFromPretreatment() {
        if (this.mExtraParamFromPretreatment == null) {
            this.mExtraParamFromPretreatment = new C72112SRw();
        }
        return this.mExtraParamFromPretreatment;
    }

    public Map<String, String> getLogExtraMap() {
        String str = this.logExtra;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        HashMap<String, String> hashMap = this.logExtraMap;
        if (hashMap != null) {
            return hashMap;
        }
        HashMap<String, String> hashMap2 = new HashMap<>();
        HashSet hashSet = new HashSet(Arrays.asList("meta_song_matched_type", "ttm_matched_type", "ttm_track_id", "recognized_pgc_clip_id"));
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (hashSet.contains(next) && jSONObject.has(next)) {
                    hashMap2.put(next, jSONObject.optString(next));
                }
            }
            this.logExtraMap = hashMap2;
            return hashMap2;
        } catch (JSONException unused) {
            return null;
        }
    }

    public String getMid() {
        return String.valueOf(this.id);
    }

    public int getPresenterDuration() {
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

    public Integer getsimilarTag() {
        return Integer.valueOf(this.similarTag);
    }

    public boolean isCollected() {
        if (this.collectStatus == 1) {
            return true;
        }
        return false;
    }

    public boolean isShootingAllowed() {
        Boolean bool = this.isShootingAllowed;
        if (bool != null && bool.booleanValue()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (getMid() != null) {
            return getMid().hashCode();
        }
        return 0;
    }

    public boolean isNewRelease() {
        if (getMusicReleaseInfo() != null && getMusicReleaseInfo().isNewReleaseSong()) {
            return true;
        }
        return false;
    }

    public String getAlbum() {
        return this.album;
    }

    public int getAuditionDuration() {
        return this.auditionDuration;
    }

    public String getAuthorName() {
        return this.authorName;
    }

    public UrlModel getAvatarThumb() {
        return this.avatarThumb;
    }

    public MusicBeat getBeatInfo() {
        return this.beatInfo;
    }

    public int getBillboardRank() {
        return this.billboardRank;
    }

    public Challenge getChallenge() {
        return this.challenge;
    }

    public String getChallengeName() {
        return this.challengeName;
    }

    public int getCollectStatus() {
        return this.collectStatus;
    }

    public int getCommercialRightType() {
        return this.commercialRightType;
    }

    public UrlModel getCoverLarge() {
        return this.coverLarge;
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

    public int getDuration() {
        return this.duration;
    }

    public MusicHighPrecisionDuration getDurationHighPrecision() {
        return this.durationHighPrecision;
    }

    public UrlModel getEffectsData() {
        return this.effectsData;
    }

    public String getEnterPosition() {
        return this.enterPosition;
    }

    public String getExclusiveSubTitle() {
        return this.exclusiveSubTitle;
    }

    public List<ExternalMusicInfo> getExternalMusicInfos() {
        return this.mExternalMusicInfos;
    }

    public String getExtra() {
        return this.extra;
    }

    public List<HighlightInfo> getHighlightInfoList() {
        return this.mHighlightInfoList;
    }

    public List<MusicOwnerInfo> getHighlightMusicOwnerInfo() {
        return this.highlightMusicOwnerInfo;
    }

    public long getId() {
        return this.id;
    }

    public String getIdStr() {
        return this.idStr;
    }

    public String getListItemId() {
        return this.listItemId;
    }

    public int getLocalMusicId() {
        return this.localMusicId;
    }

    public String getLogExtra() {
        return this.logExtra;
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

    public List<SimBitRate> getMultiBitRatePlayInfo() {
        return this.multiBitRatePlayInfo;
    }

    public int getMusicBeginTime() {
        return this.musicBeginTime;
    }

    public int getMusicEndTime() {
        return this.musicEndTime;
    }

    public String getMusicName() {
        return this.musicName;
    }

    public List<MusicOwnerInfo> getMusicOwnerInfos() {
        return this.mMusicOwnerInfos;
    }

    public long getMusicRecommendStatus() {
        return this.musicRecommendStatus;
    }

    public MusicReleaseInfo getMusicReleaseInfo() {
        return this.musicReleaseInfo;
    }

    public int getMusicStatus() {
        return this.musicStatus;
    }

    public List<MusicTag> getMusicTags() {
        return this.musicTags;
    }

    public String getMusicVolumeInfo() {
        return this.musicVolumeInfo;
    }

    public String getOfflineDesc() {
        return this.offlineDesc;
    }

    public String getOwnerBanShowInfo() {
        return this.mOwnerBanShowInfo;
    }

    public String getOwnerHandle() {
        return this.ownerHandle;
    }

    public String getOwnerId() {
        return this.ownerId;
    }

    public String getOwnerNickName() {
        return this.ownerNickName;
    }

    public String getPath() {
        return this.path;
    }

    public int getPinnedVideoStatus() {
        return this.pinnedVideoStatus;
    }

    public UrlModel getPlayUrl() {
        return this.playUrl;
    }

    public List<Position> getPositions() {
        return this.positions;
    }

    public float getPreviewEndTime() {
        return this.previewEndTime;
    }

    public int getPreviewPageShowMode() {
        return this.previewPageShowMode;
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

    public List<Music> getRelatedMusics() {
        return this.relatedMusics;
    }

    public String getRequestId() {
        return this.requestId;
    }

    public UrlModel getReuseAudioPlayUrl() {
        return this.reuseAudioPlayUrl;
    }

    public String getSearchId() {
        return this.searchId;
    }

    public String getSearchMusicDesc() {
        return this.mSearchMusicDesc;
    }

    public String getSearchMusicName() {
        return this.mSearchMusicName;
    }

    public String getSearchResultId() {
        return this.searchResultId;
    }

    public String getSecUid() {
        return this.secUid;
    }

    public ShareInfo getShareInfo() {
        return this.shareInfo;
    }

    public int getShootDuration() {
        return this.shootDuration;
    }

    public int getSoundsListType() {
        return this.mSoundsListType;
    }

    public UrlModel getStrongBeatUrl() {
        return this.strongBeatUrl;
    }

    public List<TT2DSPSongInfo> getTT2DSPSongInfos() {
        return this.tt2DSPSongInfos;
    }

    public TTMMusicInfo getTtmInfo() {
        return this.ttmInfo;
    }

    public int getUserCount() {
        return this.userCount;
    }

    public int getVideoDuration() {
        return this.videoDuration;
    }

    public boolean isArtistMusic() {
        return this.isArtistMusic;
    }

    public boolean isAuthorDeleted() {
        return this.isAuthorDeleted;
    }

    public boolean isCanNotReuse() {
        return this.canNotReuse;
    }

    public boolean isCommercialMusic() {
        return this.isCommercialMusic;
    }

    public boolean isMatchMetadata() {
        return this.isMatchMetadata;
    }

    public boolean isMuteShare() {
        return this.muteShare;
    }

    public boolean isNeedSetCookie() {
        return this.needSetCookie;
    }

    public boolean isOriginMusic() {
        return this.isOriginMusic;
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

    public boolean equals(Object obj) {
        if (!(obj instanceof Music)) {
            return false;
        }
        Music music = (Music) obj;
        if (!TextUtils.equals(music.getMid(), getMid()) || music.getCollectStatus() != getCollectStatus()) {
            return false;
        }
        return true;
    }

    public void setAlbum(String str) {
        this.album = str;
    }

    public void setArtistMusic(boolean z) {
        this.isArtistMusic = z;
    }

    public void setAuditionDuration(Integer num) {
        this.auditionDuration = num.intValue();
    }

    public void setAuthorDeleted(boolean z) {
        this.isAuthorDeleted = z;
    }

    public void setAuthorName(String str) {
        this.authorName = str;
    }

    public void setAvatarThumb(UrlModel urlModel) {
        this.avatarThumb = urlModel;
    }

    public void setBeatInfo(MusicBeat musicBeat) {
        this.beatInfo = musicBeat;
    }

    public void setBillboardRank(int i) {
        this.billboardRank = i;
    }

    public void setCanNotReuse(boolean z) {
        this.canNotReuse = z;
    }

    public void setChallenge(Challenge challenge) {
        this.challenge = challenge;
    }

    public void setChallengeName(String str) {
        this.challengeName = str;
    }

    public void setCollectStatus(int i) {
        this.collectStatus = i;
    }

    public void setCommercialMusic(boolean z) {
        this.isCommercialMusic = z;
    }

    public void setCommercialRightType(int i) {
        this.commercialRightType = i;
    }

    public void setCoverLarge(UrlModel urlModel) {
        this.coverLarge = urlModel;
    }

    public void setCoverMedium(UrlModel urlModel) {
        this.coverMedium = urlModel;
    }

    public void setCoverThumb(UrlModel urlModel) {
        this.coverThumb = urlModel;
    }

    public void setDmvAutoShow(boolean z) {
        this.dmvAutoShow = z;
    }

    public void setDuration(int i) {
        this.duration = i;
    }

    public void setDurationHighPrecision(MusicHighPrecisionDuration musicHighPrecisionDuration) {
        this.durationHighPrecision = musicHighPrecisionDuration;
    }

    public Music setEffectsData(UrlModel urlModel) {
        this.effectsData = urlModel;
        return this;
    }

    public void setEnterPosition(String str) {
        this.enterPosition = str;
    }

    public void setExclusiveSubTitle(String str) {
        this.exclusiveSubTitle = str;
    }

    public void setExternalMusicInfos(List<ExternalMusicInfo> list) {
        this.mExternalMusicInfos = list;
    }

    public void setExtra(String str) {
        this.extra = str;
    }

    public void setExtraParamFromPretreatment(C72112SRw c72112SRw) {
        this.mExtraParamFromPretreatment = c72112SRw;
    }

    public void setHighlightInfoList(List<HighlightInfo> list) {
        this.mHighlightInfoList = list;
    }

    public void setHighlightMusicOwnerInfo(List<MusicOwnerInfo> list) {
        this.highlightMusicOwnerInfo = list;
    }

    public void setId(long j) {
        this.id = j;
    }

    public void setIdStr(String str) {
        this.idStr = str;
    }

    public void setIsFollowerTagVisible(Boolean bool) {
        this.isFollowerTagVisible = bool.booleanValue();
    }

    public void setIsFriendTagVisible(Boolean bool) {
        this.isFriendTagVisible = bool.booleanValue();
    }

    public void setListItemId(String str) {
        this.listItemId = str;
    }

    public void setLocalMusicId(int i) {
        this.localMusicId = i;
    }

    public void setLogExtra(String str) {
        this.logExtra = str;
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

    public void setMatchMetadata(boolean z) {
        this.isMatchMetadata = z;
    }

    public void setMatchedPGCSoundInfo(MatchedPGCSoundInfo matchedPGCSoundInfo) {
        this.matchedPGCSoundInfo = matchedPGCSoundInfo;
    }

    public void setMatchedSongInfo(MatchedSoundInfo matchedSoundInfo) {
        this.mMatchedSongInfo = matchedSoundInfo;
    }

    public void setMid(String str) {
        try {
            this.id = CastLongProtector.parseLong(str);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public void setMultiBitRatePlayInfo(List<SimBitRate> list) {
        this.multiBitRatePlayInfo = list;
    }

    public void setMusicBeginTime(int i) {
        this.musicBeginTime = i;
    }

    public void setMusicEndTime(int i) {
        this.musicEndTime = i;
    }

    public void setMusicName(String str) {
        this.musicName = str;
    }

    public void setMusicOwnerInfos(List<MusicOwnerInfo> list) {
        this.mMusicOwnerInfos = list;
    }

    public void setMusicRecommendStatus(long j) {
        this.musicRecommendStatus = j;
    }

    public void setMusicReleaseInfo(MusicReleaseInfo musicReleaseInfo) {
        this.musicReleaseInfo = musicReleaseInfo;
    }

    public void setMusicStatus(int i) {
        this.musicStatus = i;
    }

    public void setMusicTags(List<MusicTag> list) {
        this.musicTags = list;
    }

    public void setMusicVolumeInfo(String str) {
        this.musicVolumeInfo = str;
    }

    public void setMuteShare(boolean z) {
        this.muteShare = z;
    }

    public void setNeedSetCookie(boolean z) {
        this.needSetCookie = z;
    }

    public void setOfflineDesc(String str) {
        this.offlineDesc = str;
    }

    public void setOriginMusic(boolean z) {
        this.isOriginMusic = z;
    }

    public void setOriginalSound(boolean z) {
        this.isOriginalSound = z;
    }

    public void setOwnerBanShowInfo(String str) {
        this.mOwnerBanShowInfo = str;
    }

    public void setOwnerHandle(String str) {
        this.ownerHandle = str;
    }

    public void setOwnerId(String str) {
        this.ownerId = str;
    }

    public void setOwnerNickName(String str) {
        this.ownerNickName = str;
    }

    public void setPath(String str) {
        this.path = str;
    }

    public void setPgc(boolean z) {
        this.isPgc = z;
    }

    public void setPinnedVideoStatus(int i) {
        this.pinnedVideoStatus = i;
    }

    public void setPlayUrl(UrlModel urlModel) {
        this.playUrl = urlModel;
    }

    public void setPreventDownload(boolean z) {
        this.preventDownload = z;
    }

    public void setPreviewEndTime(float f) {
        this.previewEndTime = f;
    }

    public void setPreviewPageShowMode(int i) {
        this.previewPageShowMode = i;
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

    public void setRelatedMusics(List<Music> list) {
        this.relatedMusics = list;
    }

    public void setRequestId(String str) {
        this.requestId = str;
    }

    public void setReuseAudioPlayUrl(UrlModel urlModel) {
        this.reuseAudioPlayUrl = urlModel;
    }

    public void setSearchId(String str) {
        this.searchId = str;
    }

    public void setSearchMusicDesc(String str) {
        this.mSearchMusicDesc = str;
    }

    public void setSearchMusicName(String str) {
        this.mSearchMusicName = str;
    }

    public void setSearchResultId(String str) {
        this.searchResultId = str;
    }

    public void setSecUid(String str) {
        this.secUid = str;
    }

    public void setShareInfo(ShareInfo shareInfo) {
        this.shareInfo = shareInfo;
    }

    public void setShootDuration(Integer num) {
        this.shootDuration = num.intValue();
    }

    public void setShootingAllowed(Boolean bool) {
        this.isShootingAllowed = bool;
    }

    public void setSimilarTag(Integer num) {
        this.similarTag = num.intValue();
    }

    public void setSoundsListType(int i) {
        this.mSoundsListType = i;
    }

    public void setStrongBeatUrl(UrlModel urlModel) {
        this.strongBeatUrl = urlModel;
    }

    public void setTT2DSPSongInfos(List<TT2DSPSongInfo> list) {
        this.tt2DSPSongInfos = list;
    }

    public void setTtmInfo(TTMMusicInfo tTMMusicInfo) {
        this.ttmInfo = tTMMusicInfo;
    }

    public void setUserCount(int i) {
        this.userCount = i;
    }

    public void setVideoDuration(int i) {
        this.videoDuration = i;
    }
}
