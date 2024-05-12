package X;

import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.services.IAVSettingServiceImpl;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class G6L {
    public static boolean LIZIZ() {
        try {
            Boolean silentShareConfigurable = C2YJ.LIZIZ.LIZ.getSilentShareConfigurable();
            o.LJIIIIZZ(silentShareConfigurable, "{\n                Settin…onfigurable\n            }");
            return silentShareConfigurable.booleanValue();
        } catch (C158056If unused) {
            return true;
        }
    }

    public static boolean LIZ() {
        if (!C44739Hh9.LIZIZ() || IAVSettingServiceImpl.createIAVSettingServicebyMonsterPlugin(false).getSaveAtPost()) {
            return false;
        }
        return LIZIZ();
    }

    public static boolean LIZJ(VideoPublishEditModel videoPublishEditModel) {
        MusicBuzModel musicBuzModel;
        AVMusic extractAVMusic;
        if (videoPublishEditModel != null) {
            if (videoPublishEditModel.hasOriginalSound()) {
                return false;
            }
            CreativeModel creativeModel = videoPublishEditModel.creativeModel;
            if (creativeModel != null) {
                musicBuzModel = creativeModel.musicBuzModel;
                extractAVMusic = MusicBeanUtilKt.extractAVMusic(musicBuzModel);
                if (extractAVMusic != null || extractAVMusic.isCommerceMusic() || extractAVMusic.isOriginalSound()) {
                    return false;
                }
                return true;
            }
        }
        musicBuzModel = null;
        extractAVMusic = MusicBeanUtilKt.extractAVMusic(musicBuzModel);
        return extractAVMusic != null ? false : false;
    }
}
