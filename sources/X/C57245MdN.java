package X;

import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.music.model.Music;
import kotlin.jvm.internal.o;

/* renamed from: X.MdN, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57245MdN {
    public static final /* synthetic */ int LIZ = 0;

    public static Music LIZ(Aweme aweme) {
        String originVolume;
        String originVolume2;
        String musicVolume;
        String musicVolume2;
        String str;
        String str2 = null;
        if (aweme == null) {
            return null;
        }
        if (!LIZIZ(aweme.getMusic())) {
            return aweme.getMusic();
        }
        if (!aweme.isSharedStoryVisible()) {
            return null;
        }
        if (C187567Xs.LIZ() && (originVolume = aweme.getOriginVolume()) != null && originVolume.length() != 0 && (originVolume2 = aweme.getOriginVolume()) != null && CastFloatProtector.parseFloat(originVolume2) > 0.0f && (musicVolume = aweme.getMusicVolume()) != null && musicVolume.length() != 0 && (musicVolume2 = aweme.getMusicVolume()) != null && CastFloatProtector.parseFloat(musicVolume2) > 0.0f) {
            Music music = aweme.getMusic();
            if (music != null) {
                str = music.getMid();
            } else {
                str = null;
            }
            Music addedSoundMusicInfo = aweme.getAddedSoundMusicInfo();
            if (addedSoundMusicInfo != null) {
                str2 = addedSoundMusicInfo.getMid();
            }
            if (!o.LJ(str, str2)) {
                if (C187567Xs.LIZIZ() && LIZJ(aweme.getAddedSoundMusicInfo()) && LIZLLL(aweme.getAddedSoundMusicInfo())) {
                    return aweme.getAddedSoundMusicInfo();
                }
                return aweme.getMusic();
            }
        }
        Music addedSoundMusicInfo2 = aweme.getAddedSoundMusicInfo();
        if (addedSoundMusicInfo2 == null) {
            return aweme.getMusic();
        }
        return addedSoundMusicInfo2;
    }

    public static boolean LIZIZ(Music music) {
        if (music != null && (music.getMusicStatus() == 0 || music.getMusicRecommendStatus() == 255 || music.getMusicRecommendStatus() == 258 || music.getMusicRecommendStatus() == 256)) {
            return false;
        }
        return true;
    }

    public static boolean LIZJ(Music music) {
        if (music != null && (music.getMusicRecommendStatus() == 200 || music.getMusicRecommendStatus() == 170 || music.getMusicRecommendStatus() == 150)) {
            return false;
        }
        return true;
    }

    public static boolean LIZLLL(Music music) {
        if (music != null && music.getId() != 0 && LIZIZ(music)) {
            return true;
        }
        return false;
    }
}
