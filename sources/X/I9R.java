package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;

/* loaded from: classes8.dex */
public final class I9R implements InterfaceC65644PpY<MusicModel, AVMusic> {
    public static final AVMusic LIZ(MusicModel musicModel) {
        AVMusic aVMusic = new AVMusic();
        Music convertToMusic = musicModel.convertToMusic();
        aVMusic.setCommerceMusic(musicModel.isCommerceMusic());
        aVMusic.setOriginalSound(musicModel.isOriginalSound());
        aVMusic.id = convertToMusic.getId();
        aVMusic.musicName = convertToMusic.getMusicName();
        aVMusic.album = convertToMusic.getAlbum();
        aVMusic.path = musicModel.getLocalPath();
        if (TextUtils.isEmpty(musicModel.getLocalPath())) {
            if (musicModel.isPlayUrlValid()) {
                aVMusic.path = (String) ListProtector.get(musicModel.getUrl().getUrlList(), 0);
            }
        } else {
            aVMusic.path = musicModel.getLocalPath();
        }
        aVMusic.authorName = convertToMusic.getAuthorName();
        aVMusic.playUrl = convertToMusic.getPlayUrl();
        aVMusic.coverThumb = convertToMusic.getCoverThumb();
        aVMusic.coverMedium = convertToMusic.getCoverMedium();
        aVMusic.coverLarge = convertToMusic.getCoverLarge();
        aVMusic.setDuration(convertToMusic.getDuration());
        aVMusic.setShootDuration(convertToMusic.getShootDuration());
        aVMusic.setAuditionDuration(convertToMusic.getAuditionDuration());
        aVMusic.musicType = musicModel.getMusicType().ordinal();
        aVMusic.offlineDesc = musicModel.getOfflineDesc();
        aVMusic.musicStatus = convertToMusic.getMusicStatus();
        aVMusic.userCount = musicModel.getUserCount();
        aVMusic.setMusicTags(musicModel.getMusicTags());
        aVMusic.similarTag = musicModel.getSimilarTag().intValue();
        aVMusic.recommendSourceFrom = musicModel.getRecommendSourceFrom();
        if (convertToMusic.getChallenge() != null) {
            new HWD();
            aVMusic.challenge = HWD.LIZ(convertToMusic.getChallenge());
        }
        aVMusic.strongBeatUrl = convertToMusic.getStrongBeatUrl();
        aVMusic.setLrcUrl(convertToMusic.getLrcUrl());
        aVMusic.setLrcType(convertToMusic.getLrcType());
        aVMusic.setPreviewStartTime(convertToMusic.getPreviewStartTime());
        aVMusic.setPreventDownload(musicModel.isPreventDownload());
        if (musicModel.getMusicWaveBean() != null) {
            aVMusic.setMusicWaveData(musicModel.getMusicWaveBean().getMusicWavePointArray());
        }
        aVMusic.setNeedSetCookie(musicModel.isNeedSetCookie());
        aVMusic.setVideoDuration(musicModel.getVideoDuration());
        aVMusic.setMusicBeat(musicModel.getBeatInfo());
        aVMusic.setLocalMusicDuration(musicModel.getLocalMusicDuration());
        aVMusic.setLocalMusicId(musicModel.getLocalMusicId());
        aVMusic.setMuteShare(musicModel.isMuteShare());
        aVMusic.setMusicBeginTime(musicModel.getMusicBeginTime());
        aVMusic.setMusicEndTime(musicModel.getMusicEndTime());
        return aVMusic;
    }

    @Override // X.InterfaceC65644PpY
    public final /* bridge */ /* synthetic */ AVMusic apply(MusicModel musicModel) {
        return LIZ(musicModel);
    }
}
