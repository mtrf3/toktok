package X;

import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.service.MusicRecordService;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes10.dex */
public final class MEW {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(ActivityC45651qj activityC45651qj, Fragment fragment, Aweme aweme, String str, int i) {
        Music music;
        int i2;
        boolean z;
        boolean z2;
        String str2;
        if (aweme == null || (music = aweme.getMusic()) == null) {
            return;
        }
        String stickerIDs = aweme.getStickerIDs();
        Video video = aweme.getVideo();
        if (video != null) {
            i2 = video.getVideoLength();
        } else {
            i2 = 0;
        }
        if (aweme.getMusicBeginTime() < aweme.getMusicEndTime() && aweme.getMusicBeginTime() >= 0) {
            music.setMusicBeginTime(aweme.getMusicBeginTime());
            music.setMusicEndTime(aweme.getMusicEndTime());
        }
        MusicRecordService musicRecordService = new MusicRecordService();
        boolean downloadEffectOrMusicAfterEnterCamera = AVExternalServiceImpl.LIZ().configService().avsettingsConfig().downloadEffectOrMusicAfterEnterCamera();
        boolean isRecording = AVExternalServiceImpl.LIZ().configService().shortVideoConfig().isRecording();
        String LIZ2 = AnonymousClass629.LIZ("randomUUID().toString()");
        MusicModel convertToMusicModel = music.convertToMusicModel();
        C80036Vb6 c80036Vb6 = new C80036Vb6();
        if (downloadEffectOrMusicAfterEnterCamera && (!isRecording || activityC45651qj == null)) {
            z = true;
        } else {
            z = false;
        }
        Boolean bool = Boolean.FALSE;
        musicRecordService.startRecord(fragment, activityC45651qj, convertToMusicModel, stickerIDs, "", c80036Vb6, i2, z, str, i, "single_song", "single_song", LIZ2, bool, str, Boolean.TRUE, bool, null, null, null);
        if (music.getCollectStatus() == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        HT5.LIZJ(z2);
        String aid = aweme.getAid();
        o.LJIIIIZZ(aid, "aweme.aid");
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_method", "click_music_publish");
        c188727au.LJ(music.getId(), "music_id");
        c188727au.LJIIIZ("creation_id", LIZ2);
        c188727au.LJIIIZ("enter_from", str);
        c188727au.LJIIIZ("shoot_way", "single_song");
        c188727au.LJIIIZ("group_id", aid);
        if (TextUtils.isEmpty("")) {
            str2 = "";
        } else {
            str2 = ((String[]) s.LJLJJL("", new String[]{","}, 0, 6).toArray(new String[0]))[0];
        }
        c188727au.LJIIIZ("giphy_id", str2);
        c188727au.LIZLLL(HT5.LIZ(), "favorite_scene");
        C78983UzD.LJII(c188727au, Z9N.LIZIZ.LLJLLIL(str, ""));
        FMX.LJIIL("shoot", c188727au.LIZ);
    }
}
