package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.creative.model.common.LogPbBean;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicReleaseInfo;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class I9Q implements InterfaceC65644PpY<MusicModel, AVMusic> {
    public static final /* synthetic */ int LJLIL = 0;

    public static final AVMusic LIZ(MusicModel musicModel) {
        String str;
        boolean z;
        UrlModel url;
        String str2 = null;
        if (musicModel == null) {
            return null;
        }
        AVMusic aVMusic = new AVMusic();
        Music convertToMusic = musicModel.convertToMusic();
        aVMusic.id = convertToMusic.getId();
        aVMusic.setCommerceMusic(convertToMusic.isCommercialMusic());
        aVMusic.setOriginalSound(convertToMusic.isOriginalSound());
        aVMusic.musicName = convertToMusic.getMusicName();
        aVMusic.album = convertToMusic.getAlbum();
        boolean z2 = false;
        if (TextUtils.isEmpty(musicModel.getLocalPath())) {
            if (musicModel.isPlayUrlValid()) {
                if (musicModel.getMusicType() == MusicModel.MusicType.REUSE_AUDIO) {
                    url = musicModel.getReuseAudioPlayUrl();
                } else {
                    url = musicModel.getUrl();
                }
                aVMusic.path = (String) ListProtector.get(url.getUrlList(), 0);
            }
        } else {
            aVMusic.path = musicModel.getLocalPath();
        }
        aVMusic.authorName = convertToMusic.getAuthorName();
        aVMusic.playUrl = convertToMusic.getPlayUrl();
        aVMusic.reuseAudioPlayUrl = convertToMusic.getReuseAudioPlayUrl();
        aVMusic.coverThumb = convertToMusic.getCoverThumb();
        aVMusic.coverMedium = convertToMusic.getCoverMedium();
        aVMusic.coverLarge = convertToMusic.getCoverLarge();
        aVMusic.setDuration(convertToMusic.getDuration());
        aVMusic.setShootDuration(convertToMusic.getShootDuration());
        aVMusic.setAuditionDuration(convertToMusic.getAuditionDuration());
        aVMusic.durationHighPrecision = convertToMusic.getDurationHighPrecision();
        aVMusic.musicType = musicModel.getMusicType().ordinal();
        aVMusic.offlineDesc = musicModel.getOfflineDesc();
        aVMusic.musicStatus = convertToMusic.getMusicStatus();
        if (convertToMusic.getChallenge() != null) {
            new HWE();
            aVMusic.challenge = HWE.LIZ(convertToMusic.getChallenge());
        }
        aVMusic.strongBeatUrl = convertToMusic.getStrongBeatUrl();
        aVMusic.setLrcUrl(convertToMusic.getLrcUrl());
        aVMusic.setLrcType(convertToMusic.getLrcType());
        aVMusic.userCount = convertToMusic.getUserCount();
        aVMusic.setMusicTags(convertToMusic.getMusicTags());
        Integer num = convertToMusic.getsimilarTag();
        o.LJIIIIZZ(num, "music.getsimilarTag()");
        aVMusic.similarTag = num.intValue();
        aVMusic.recommendSourceFrom = convertToMusic.getRecommendSourceFrom();
        aVMusic.setPreviewStartTime(convertToMusic.getPreviewStartTime());
        aVMusic.setPreventDownload(musicModel.isPreventDownload());
        if (musicModel.getMusicWaveBean() != null) {
            aVMusic.setMusicWaveData(musicModel.getMusicWaveBean().getMusicWavePointArray());
        }
        aVMusic.setMvThemeMusic(musicModel.isMvThemeMusic());
        LogPbBean logPbBean = new LogPbBean();
        com.ss.android.ugc.aweme.feed.model.LogPbBean logPb = musicModel.getLogPb();
        if (logPb != null) {
            str = logPb.getImprId();
        } else {
            str = null;
        }
        logPbBean.setImprId(str);
        aVMusic.setLogPb(logPbBean);
        aVMusic.setComeFromForMod(musicModel.getComeFromForMod());
        aVMusic.setCategoryID(musicModel.getCategoryID());
        aVMusic.setSearchKeyWords(musicModel.getSearchKeyWords());
        aVMusic.setSongId(musicModel.getSongId());
        aVMusic.extra = musicModel.getExtra();
        aVMusic.setDmvAutoShow(musicModel.getDmvAutoShow());
        if (musicModel.getCollectionType() == MusicModel.CollectionType.COLLECTED) {
            z = true;
        } else {
            z = false;
        }
        aVMusic.setCollected(z);
        if (TextUtils.isEmpty(aVMusic.extra)) {
            Music music = musicModel.getMusic();
            if (music != null) {
                str2 = music.getExtra();
            }
            aVMusic.extra = str2;
        }
        aVMusic.setNeedSetCookie(musicModel.isNeedSetCookie());
        aVMusic.setVideoDuration(musicModel.getVideoDuration());
        aVMusic.setPgc(musicModel.isPgc());
        aVMusic.setMusicBeat(musicModel.getBeatInfo());
        aVMusic.setLocalMusicDuration(musicModel.getLocalMusicDuration());
        aVMusic.setLocalMusicId(musicModel.getLocalMusicId());
        aVMusic.setMuteShare(musicModel.isMuteShare());
        aVMusic.setMusicStartFromCut(musicModel.getMusicStartFromCut());
        aVMusic.setMusicEndFromCut(musicModel.getMusicEndFromCut());
        aVMusic.setEditFrom(musicModel.getEditFrom());
        aVMusic.setMusicBeginTime(musicModel.getMusicBeginTime());
        aVMusic.setMusicEndTime(musicModel.getMusicEndTime());
        aVMusic.setFromSection(musicModel.getFromSection());
        aVMusic.setCommercialRightType(musicModel.getCommercialRightType());
        aVMusic.setLocalThumbPath(musicModel.getLocalThumbPath());
        MusicReleaseInfo musicReleaseInfo = musicModel.getMusicReleaseInfo();
        if (musicReleaseInfo != null) {
            z2 = musicReleaseInfo.isNewReleaseSong();
        }
        aVMusic.setIsNewReleaseMusic(z2);
        return aVMusic;
    }

    @Override // X.InterfaceC65644PpY
    public final /* bridge */ /* synthetic */ AVMusic apply(MusicModel musicModel) {
        return LIZ(musicModel);
    }
}
