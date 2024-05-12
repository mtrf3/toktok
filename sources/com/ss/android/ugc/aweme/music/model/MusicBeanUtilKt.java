package com.ss.android.ugc.aweme.music.model;

import X.ORY;
import com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel;
import com.ss.android.ugc.aweme.creative.model.music.MusicObject;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class MusicBeanUtilKt {
    public static final AVMusic extractAVMusic(MusicBuzModel musicBuzModel) {
        MusicObject musicObject;
        MusicModel.FromSection fromSection;
        float[] fArr = null;
        if (musicBuzModel == null || (musicObject = musicBuzModel.music) == null) {
            return null;
        }
        AVMusic aVMusic = new AVMusic();
        aVMusic.id = musicObject.id;
        aVMusic.album = musicObject.album;
        aVMusic.setAuditionDuration(musicObject.auditionDuration);
        aVMusic.authorName = musicObject.authorName;
        aVMusic.coverLarge = musicObject.coverLarge;
        aVMusic.coverMedium = musicObject.coverMedium;
        aVMusic.coverThumb = musicObject.coverThumb;
        aVMusic.setDmvAutoShow(musicObject.dmvAutoShow);
        aVMusic.setDuration(musicObject.duration);
        aVMusic.durationHighPrecision = musicObject.durationHighPrecision;
        aVMusic.extra = musicObject.extra;
        aVMusic.setCommerceMusic(musicObject.isCommerceMusic);
        aVMusic.setOriginalSound(musicObject.isOriginalSound);
        aVMusic.setPgc(musicObject.isPgc);
        aVMusic.setLrcType(musicObject.lrcType);
        aVMusic.setLrcUrl(musicObject.lrcUrl);
        aVMusic.setMusicBeat(musicObject.beatInfo);
        aVMusic.setMusicBeginTime(musicObject.musicBeginTime);
        aVMusic.setMusicEndTime(musicObject.musicEndTime);
        aVMusic.musicName = musicObject.musicName;
        aVMusic.musicStatus = musicObject.musicStatus;
        aVMusic.setMuteShare(musicObject.muteShare);
        aVMusic.setNeedSetCookie(musicObject.needSetCookie);
        aVMusic.offlineDesc = musicObject.offlineDesc;
        aVMusic.playUrl = musicObject.playUrl;
        aVMusic.setPreventDownload(musicObject.preventDownload);
        aVMusic.setPreviewStartTime(musicObject.previewStartTime);
        aVMusic.setShootDuration(musicObject.shootDuration);
        aVMusic.strongBeatUrl = musicObject.strongBeatUrl;
        aVMusic.userCount = musicObject.userCount;
        aVMusic.setMusicTags(musicObject.musicTags);
        aVMusic.setVideoDuration(musicObject.videoDuration);
        aVMusic.reuseAudioPlayUrl = musicObject.reuseAudioPlayUrl;
        aVMusic.setLocalMusicId(musicObject.localMusicId);
        aVMusic.setCommercialRightType(musicObject.commercialRightType);
        aVMusic.setIsNewReleaseMusic(musicObject.isNewReleaseMusic);
        aVMusic.setSoundSpeed(musicBuzModel.soundSpeed);
        aVMusic.setChangeTone(Boolean.valueOf(musicBuzModel.changeTone));
        musicBuzModel.stsEffectName = musicBuzModel.stsEffectName;
        aVMusic.setSoundFilterId(musicBuzModel.soundFilterId);
        aVMusic.challenge = musicBuzModel.challenge;
        aVMusic.setCategoryID(musicBuzModel.categoryID);
        musicBuzModel.cancelAbleInShoot = musicBuzModel.cancelAbleInShoot;
        aVMusic.setCollected(musicBuzModel.isCollected);
        aVMusic.setComeFromForMod(musicBuzModel.comeFromForMod);
        aVMusic.ignoreReuseAudio = musicBuzModel.ignoreReuseAudio;
        aVMusic.setMvThemeMusic(musicBuzModel.isMvThemeMusic);
        aVMusic.setLocalMusicDuration(musicBuzModel.localMusicDuration);
        aVMusic.setLogPb(musicBuzModel.logPb);
        MusicModel.FromSection[] values = MusicModel.FromSection.values();
        int i = musicBuzModel.fromSection;
        if (i >= 0 && i <= ORY.LJJJI(values)) {
            fromSection = values[i];
        } else {
            fromSection = MusicModel.FromSection.OTHER;
        }
        aVMusic.setFromSection(fromSection);
        aVMusic.setEditFrom(musicBuzModel.musicEditFrom);
        aVMusic.setMusicStartFromCut(musicBuzModel.musicStartFromCut);
        aVMusic.setMusicEndFromCut(musicBuzModel.musicEndFromCut);
        aVMusic.setMusicPriority(musicBuzModel.musicPriority);
        aVMusic.musicType = musicBuzModel.musicType;
        aVMusic.similarTag = musicBuzModel.similarTag;
        aVMusic.recommendSourceFrom = musicBuzModel.recommendSourceFrom;
        Float[] fArr2 = musicBuzModel.musicWaveData;
        if (fArr2 != null) {
            fArr = ORY.LJJLIIJ(fArr2);
        }
        aVMusic.setMusicWaveData(fArr);
        aVMusic.path = musicBuzModel.path;
        aVMusic.setSearchKeyWords(musicBuzModel.searchKeyWords);
        musicBuzModel.shouldShowCommerceTips = musicBuzModel.shouldShowCommerceTips;
        aVMusic.setStickPointMusicAlg(musicBuzModel.stickPointMusicAlg);
        aVMusic.setSongId(musicBuzModel.songId);
        aVMusic.setLocalThumbPath(musicBuzModel.localThumbPath);
        return aVMusic;
    }

    public static final MusicObject extractMusicObject(AVMusic aVMusic) {
        o.LJIIIZ(aVMusic, "<this>");
        return new MusicObject(aVMusic.id, aVMusic.album, aVMusic.authorName, aVMusic.getDuration(), aVMusic.getAuditionDuration(), aVMusic.getShootDuration(), aVMusic.coverLarge, aVMusic.coverMedium, aVMusic.coverThumb, aVMusic.getDmvAutoShow(), aVMusic.durationHighPrecision, aVMusic.extra, aVMusic.isCommerceMusic(), aVMusic.isOriginalSound(), aVMusic.isPgc(), aVMusic.getLocalMusicId(), aVMusic.getLrcType(), aVMusic.getLrcUrl(), aVMusic.getMusicBeat(), aVMusic.getMusicBeginTime(), aVMusic.getMusicEndTime(), aVMusic.musicName, aVMusic.musicStatus, aVMusic.isMuteShare(), aVMusic.isNeedSetCookie(), aVMusic.offlineDesc, aVMusic.playUrl, aVMusic.isPreventDownload(), aVMusic.getPreviewStartTime(), aVMusic.reuseAudioPlayUrl, aVMusic.strongBeatUrl, aVMusic.userCount, aVMusic.getMusicTags(), aVMusic.getVideoDuration(), aVMusic.getCommercialRightType(), aVMusic.getIsNewReleaseMusic());
    }

    public static final String getMusicId(MusicObject musicObject) {
        o.LJIIIZ(musicObject, "<this>");
        String l = Long.toString(musicObject.id);
        o.LJIIIIZZ(l, "toString(id)");
        return l;
    }

    public static final void updateAVMusic(MusicBuzModel musicBuzModel, AVMusic aVMusic) {
        o.LJIIIZ(musicBuzModel, "<this>");
        Float[] fArr = null;
        if (aVMusic == null) {
            musicBuzModel.music = null;
            musicBuzModel.soundSpeed = 1.0f;
            musicBuzModel.changeTone = true;
            musicBuzModel.stsEffectName = null;
            musicBuzModel.soundFilterId = null;
            musicBuzModel.isCollected = false;
            musicBuzModel.challenge = null;
            musicBuzModel.categoryID = null;
            musicBuzModel.comeFromForMod = 0;
            musicBuzModel.fromSection = MusicModel.FromSection.OTHER.ordinal();
            musicBuzModel.ignoreReuseAudio = false;
            musicBuzModel.isMvThemeMusic = false;
            musicBuzModel.localMusicDuration = 0L;
            musicBuzModel.logPb = null;
            musicBuzModel.musicEditFrom = null;
            musicBuzModel.musicStartFromCut = 0;
            musicBuzModel.musicEndFromCut = 0;
            musicBuzModel.musicPriority = 0;
            musicBuzModel.musicType = 0;
            musicBuzModel.similarTag = 0;
            musicBuzModel.musicWaveData = null;
            musicBuzModel.songId = null;
            musicBuzModel.searchKeyWords = null;
            musicBuzModel.shouldShowCommerceTips = false;
            musicBuzModel.stickPointMusicAlg = null;
            musicBuzModel.path = null;
            musicBuzModel.cancelAbleInShoot = false;
            musicBuzModel.localThumbPath = null;
            return;
        }
        musicBuzModel.music = extractMusicObject(aVMusic);
        Float soundSpeed = aVMusic.getSoundSpeed();
        o.LJIIIIZZ(soundSpeed, "avMusic.soundSpeed");
        musicBuzModel.soundSpeed = soundSpeed.floatValue();
        Boolean changeTone = aVMusic.getChangeTone();
        o.LJIIIIZZ(changeTone, "avMusic.changeTone");
        musicBuzModel.changeTone = changeTone.booleanValue();
        musicBuzModel.soundFilterId = aVMusic.getSoundFilterId();
        musicBuzModel.isCollected = aVMusic.isCollected();
        musicBuzModel.challenge = aVMusic.challenge;
        musicBuzModel.categoryID = aVMusic.getCategoryID();
        musicBuzModel.comeFromForMod = aVMusic.getComeFromForMod();
        musicBuzModel.fromSection = aVMusic.getFromSection().ordinal();
        musicBuzModel.ignoreReuseAudio = aVMusic.ignoreReuseAudio;
        musicBuzModel.isMvThemeMusic = aVMusic.isMvThemeMusic();
        musicBuzModel.localMusicDuration = aVMusic.getLocalMusicDuration();
        musicBuzModel.logPb = aVMusic.getLogPb();
        musicBuzModel.musicEditFrom = aVMusic.getEditFrom();
        musicBuzModel.musicStartFromCut = aVMusic.getMusicStartFromCut();
        musicBuzModel.musicEndFromCut = aVMusic.getMusicEndFromCut();
        musicBuzModel.musicPriority = aVMusic.getMusicPriority();
        musicBuzModel.musicType = aVMusic.musicType;
        musicBuzModel.similarTag = aVMusic.similarTag;
        musicBuzModel.recommendSourceFrom = aVMusic.recommendSourceFrom;
        float[] musicWaveData = aVMusic.getMusicWaveData();
        if (musicWaveData != null) {
            fArr = new Float[musicWaveData.length];
            int length = musicWaveData.length;
            for (int i = 0; i < length; i++) {
                fArr[i] = Float.valueOf(musicWaveData[i]);
            }
        }
        musicBuzModel.musicWaveData = fArr;
        musicBuzModel.songId = aVMusic.getSongId();
        musicBuzModel.searchKeyWords = aVMusic.getSearchKeyWords();
        musicBuzModel.shouldShowCommerceTips = aVMusic.isShouldShowCommerceTips();
        musicBuzModel.stickPointMusicAlg = aVMusic.getStickPointMusicAlg();
        musicBuzModel.path = aVMusic.path;
        musicBuzModel.userCount = aVMusic.userCount;
        musicBuzModel.tagList = aVMusic.getMusicTags();
        musicBuzModel.cancelAbleInShoot = aVMusic.isCancelAbleInShoot();
        musicBuzModel.localThumbPath = aVMusic.getLocalThumbPath();
    }
}
