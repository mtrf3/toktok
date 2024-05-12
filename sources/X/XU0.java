package X;

import android.app.Activity;
import android.content.Context;
import android.media.MediaMetadataRetriever;
import android.text.TextUtils;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class XU0 {
    public static final /* synthetic */ int LIZ = 0;

    static {
        C16880lQ.LJLLJ(XU0.class);
    }

    public static boolean LIZJ() {
        String str;
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            str = (String) cls.getDeclaredMethod("get", String.class).invoke(cls, "ro.build.display.id");
        } catch (Throwable unused) {
            str = null;
        }
        if (TextUtils.isEmpty(str) || !str.toLowerCase().contains("flyme")) {
            return false;
        }
        return true;
    }

    public static long LIZIZ(String str) {
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                mediaMetadataRetriever.setDataSource(str);
                return Float.valueOf(mediaMetadataRetriever.extractMetadata(9)).floatValue();
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
                try {
                    mediaMetadataRetriever.release();
                    return -1L;
                } catch (Exception e2) {
                    C16880lQ.LLLLIIL(e2);
                    return -1L;
                }
            }
        } finally {
            try {
                mediaMetadataRetriever.release();
            } catch (Exception e3) {
                C16880lQ.LLLLIIL(e3);
            }
        }
    }

    public static void LIZLLL(int i, Activity activity) {
        SmartRoute buildRoute = SmartRouter.buildRoute(activity, "//assmusic/category");
        if (i == 0) {
            buildRoute.withParam("music_type", 6);
        } else if (i == 2) {
            buildRoute.withParam("music_type", 5);
        }
        buildRoute.withParam("sound_page_scene", 0);
        C16880lQ.LJFF(activity, 10086, buildRoute.buildIntent());
    }

    public static boolean LIZ(MusicModel musicModel, Context ameActivity, boolean z) {
        if (musicModel == null) {
            return false;
        }
        if (!TextUtils.isEmpty(musicModel.getLocalPath())) {
            return true;
        }
        if (musicModel.getUrl() != null && !TextUtils.isEmpty(musicModel.getUrl().getUri()) && !C79004UzY.LJJIFFI(musicModel.getUrl().getUrlList()) && musicModel.getMusicStatus() != 0) {
            return true;
        }
        if (z) {
            String offlineDesc = musicModel.getOfflineDesc();
            if (TextUtils.isEmpty(offlineDesc)) {
                o.LJIIIZ(ameActivity, "ameActivity");
                offlineDesc = ameActivity.getString(R.string.iia);
                o.LJIIIIZZ(offlineDesc, "ameActivity.getString(R.string.music_issue_toast)");
            }
            C30869C9p.LIZIZ(ameActivity, offlineDesc);
        }
        return false;
    }
}
