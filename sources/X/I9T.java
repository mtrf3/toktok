package X;

import com.ss.android.ugc.aweme.commerce.tools.music.CommerceToolsMusicService;
import com.ss.android.ugc.aweme.commerce.tools.music.ICommerceToolsMusicService;
import com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel;
import com.ss.android.ugc.aweme.creative.model.music.MusicObject;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class I9T {
    public static final /* synthetic */ int LIZ = 0;

    public static final boolean LIZJ(MusicBuzModel musicBuzModel) {
        if (musicBuzModel != null) {
            return musicBuzModel.isPhotoMvModeMusic;
        }
        return false;
    }

    public static final String LIZLLL(MusicBuzModel musicBuzModel) {
        MusicObject musicObject;
        if (musicBuzModel != null && (musicObject = musicBuzModel.music) != null) {
            return MusicBeanUtilKt.getMusicId(musicObject);
        }
        return null;
    }

    public static final void LJ(MusicBuzModel musicBuzModel) {
        CommerceToolsMusicService.LIZIZ(false).iq(null, null);
        if (musicBuzModel != null) {
            MusicBeanUtilKt.updateAVMusic(musicBuzModel, null);
        }
    }

    public static final void LJFF(AVMusic aVMusic) {
        ICommerceToolsMusicService LIZIZ = CommerceToolsMusicService.LIZIZ(false);
        o.LJIIIIZZ(LIZIZ, "get().getService(ICommer…MusicService::class.java)");
        LIZIZ.iq(aVMusic, null);
    }

    public static void LJIIIIZZ(int i, MusicBuzModel musicBuzModel) {
        MusicObject musicObject;
        if (musicBuzModel == null || (musicObject = musicBuzModel.music) == null) {
            return;
        }
        musicBuzModel.music = new MusicObject(musicObject.id, musicObject.album, musicObject.authorName, i, musicObject.auditionDuration, musicObject.shootDuration, musicObject.coverLarge, musicObject.coverMedium, musicObject.coverThumb, musicObject.dmvAutoShow, musicObject.durationHighPrecision, musicObject.extra, musicObject.isCommerceMusic, musicObject.isOriginalSound, musicObject.isPgc, musicObject.localMusicId, musicObject.lrcType, musicObject.lrcUrl, musicObject.beatInfo, musicObject.musicBeginTime, musicObject.musicEndTime, musicObject.musicName, musicObject.musicStatus, musicObject.muteShare, musicObject.needSetCookie, musicObject.offlineDesc, musicObject.playUrl, musicObject.preventDownload, musicObject.previewStartTime, musicObject.reuseAudioPlayUrl, musicObject.strongBeatUrl, musicObject.userCount, musicObject.musicTags, musicObject.videoDuration, musicObject.commercialRightType, musicObject.isNewReleaseMusic);
    }

    public static final void LJI(AVMusic aVMusic, boolean z, MusicBuzModel musicBuzModel) {
        if (musicBuzModel != null) {
            MusicBeanUtilKt.updateAVMusic(musicBuzModel, aVMusic);
            musicBuzModel.isPhotoMvModeMusic = z;
        }
        ICommerceToolsMusicService LIZIZ = CommerceToolsMusicService.LIZIZ(false);
        o.LJIIIIZZ(LIZIZ, "get().getService(ICommer…MusicService::class.java)");
        LIZIZ.iq(aVMusic, null);
    }

    public static void LJII(int i, String str, MusicBuzModel musicBuzModel) {
        if (musicBuzModel == null) {
            return;
        }
        musicBuzModel.musicStartFromCut = i;
        musicBuzModel.musicEditFrom = str;
    }
}
