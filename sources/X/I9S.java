package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.creative.model.common.LogPbBean;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class I9S {
    public static MusicModel LIZ(AVMusic avMusic) {
        MusicModel.CollectionType collectionType;
        o.LJIIIZ(avMusic, "avMusic");
        MusicModel musicModel = new MusicModel();
        musicModel.setMusicId(avMusic.getMusicId());
        musicModel.setId(avMusic.getId());
        musicModel.setAlbum(avMusic.getAlbum());
        musicModel.setName(avMusic.getMusicName());
        musicModel.setAlbum(avMusic.getAlbum());
        if (avMusic.getCoverMedium() != null && !C79004UzY.LJJIFFI(avMusic.getCoverMedium().getUrlList())) {
            musicModel.setPicPremium((String) ListProtector.get(avMusic.getCoverMedium().getUrlList(), 0));
        }
        if (avMusic.getCoverThumb() != null && !C79004UzY.LJJIFFI(avMusic.getCoverThumb().getUrlList())) {
            musicModel.setPicSmall((String) ListProtector.get(avMusic.getCoverThumb().getUrlList(), 0));
        }
        musicModel.setLocalPath(avMusic.getPath());
        musicModel.setSinger(avMusic.getSinger());
        int musicType = avMusic.getMusicType();
        MusicModel.MusicType musicType2 = MusicModel.MusicType.ONLINE;
        if (musicType == musicType2.ordinal()) {
            musicModel.setUrl(avMusic.getPlayUrl());
        }
        int musicType3 = avMusic.getMusicType();
        MusicModel.MusicType musicType4 = MusicModel.MusicType.REUSE_AUDIO;
        if (musicType3 == musicType4.ordinal()) {
            musicModel.setReuseAudioPlayUrl(avMusic.getReuseAudioPlayUrl());
        }
        musicModel.setDuration(avMusic.getDuration());
        musicModel.setShootDuration(Integer.valueOf(avMusic.getShootDuration()));
        musicModel.setAuditionDuration(Integer.valueOf(avMusic.getAuditionDuration()));
        musicModel.setDurationHighPrecision(avMusic.durationHighPrecision);
        if (avMusic.isLocalMusic()) {
            musicModel.setMusicType(MusicModel.MusicType.values()[avMusic.getMusicType()]);
        }
        if (avMusic.getMusicType() == musicType2.ordinal()) {
            musicModel.setMusicType(musicType2);
        }
        if (avMusic.getMusicType() == musicType4.ordinal()) {
            musicModel.setMusicType(musicType4);
        }
        musicModel.setOfflineDesc(avMusic.getOfflineDesc());
        musicModel.setMusicStatus(avMusic.getMusicStatus());
        musicModel.setStrongBeatUrl(avMusic.getStrongBeatUrl());
        musicModel.setLrcUrl(avMusic.getLrcUrl());
        musicModel.setLrcType(avMusic.getLrcType());
        musicModel.setUserCount(avMusic.userCount);
        musicModel.setMusicTags(avMusic.getMusicTags());
        musicModel.setSimilarTag(Integer.valueOf(avMusic.similarTag));
        musicModel.setRecommendSourceFrom(avMusic.recommendSourceFrom);
        musicModel.setPreviewStartTime(avMusic.getPreviewStartTime());
        musicModel.setExtra(avMusic.extra);
        if (avMusic.isCollected()) {
            collectionType = MusicModel.CollectionType.COLLECTED;
        } else {
            collectionType = MusicModel.CollectionType.NOT_COLLECTED;
        }
        musicModel.setCollectionType(collectionType);
        musicModel.setNeedSetCookie(avMusic.isNeedSetCookie());
        musicModel.setVideoDuration(avMusic.getVideoDuration());
        musicModel.setPgc(avMusic.isPgc());
        musicModel.setBeatInfo(avMusic.getMusicBeat());
        musicModel.setLocalMusicDuration(avMusic.getLocalMusicDuration());
        musicModel.setLocalMusicId(avMusic.getLocalMusicId());
        musicModel.setMuteShare(avMusic.isMuteShare());
        LogPbBean logPb = avMusic.getLogPb();
        String str = null;
        if (logPb != null && logPb.getImprId() != null) {
            com.ss.android.ugc.aweme.feed.model.LogPbBean logPbBean = new com.ss.android.ugc.aweme.feed.model.LogPbBean();
            LogPbBean logPb2 = avMusic.getLogPb();
            if (logPb2 != null) {
                str = logPb2.getImprId();
            }
            logPbBean.setImprId(str);
            musicModel.setLogPb(logPbBean);
        }
        musicModel.setMusicStartFromCut(avMusic.getMusicStartFromCut());
        musicModel.setMusicEndFromCut(avMusic.getMusicEndFromCut());
        musicModel.setEditFrom(avMusic.getEditFrom());
        musicModel.setMusicBeginTime(avMusic.getMusicBeginTime());
        musicModel.setMusicEndTime(avMusic.getMusicEndTime());
        musicModel.setFromSection(avMusic.getFromSection());
        musicModel.setCommerceMusic(avMusic.isCommerceMusic());
        musicModel.setCommercialRightType(avMusic.getCommercialRightType());
        musicModel.setLocalThumbPath(avMusic.getLocalThumbPath());
        return musicModel;
    }

    public static ArrayList LIZIZ(List list) {
        if (list == null || list.isEmpty()) {
            return new ArrayList();
        }
        return C65661Ppp.LIZ(C65661Ppp.LIZLLL(list, new I9Q()));
    }
}
