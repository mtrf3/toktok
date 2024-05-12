package X;

import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import ujb.o;

/* loaded from: classes8.dex */
public final class G8M {
    public static boolean LIZ(VideoPublishEditModel videoPublishEditModel) {
        MusicBuzModel musicBuzModel;
        CreativeModel creativeModel;
        if (videoPublishEditModel != null && (creativeModel = videoPublishEditModel.creativeModel) != null) {
            musicBuzModel = creativeModel.musicBuzModel;
        } else {
            musicBuzModel = null;
        }
        AVMusic extractAVMusic = MusicBeanUtilKt.extractAVMusic(musicBuzModel);
        if (extractAVMusic != null && extractAVMusic.isPreventDownload() && o.LJJJJIZL("JP", C44296Ha0.LIZ(), true) && C44172HVg.LJIL != null) {
            return true;
        }
        return false;
    }

    public static boolean LIZIZ(VideoPublishEditModel videoPublishEditModel, String str) {
        MusicBuzModel musicBuzModel;
        CreativeModel creativeModel = videoPublishEditModel.creativeModel;
        if (creativeModel != null) {
            musicBuzModel = creativeModel.musicBuzModel;
        } else {
            musicBuzModel = null;
        }
        AVMusic extractAVMusic = MusicBeanUtilKt.extractAVMusic(musicBuzModel);
        C44172HVg.LJIL.getClass();
        return C4LD.LIZ.LJJIJL(extractAVMusic, str);
    }
}
