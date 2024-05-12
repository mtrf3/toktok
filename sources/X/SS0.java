package X;

import android.content.Context;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.zhiliaoapp.musically.R;

/* loaded from: classes13.dex */
public final class SS0 {
    public static final /* synthetic */ int LIZ = 0;

    static {
        C16880lQ.LJLLJ(SS0.class);
    }

    public static void LIZ(MusicModel musicModel) {
        if (musicModel.getMusic() != null && musicModel.getMusic().getChallenge() != null) {
            AVExternalServiceImpl.LIZ().publishService().addChallenge(musicModel.getMusic().getChallenge());
        }
    }

    public static boolean LIZIZ(MusicModel musicModel, Context context, boolean z) {
        if (musicModel != null) {
            if (!TextUtils.isEmpty(musicModel.getLocalPath()) || (musicModel.getUrl() != null && !TextUtils.isEmpty(musicModel.getUrl().getUri()) && !C79004UzY.LJJIFFI(musicModel.getUrl().getUrlList()) && musicModel.getMusicStatus() != 0)) {
                return true;
            }
            String offlineDesc = musicModel.getOfflineDesc();
            if (TextUtils.isEmpty(offlineDesc)) {
                offlineDesc = context.getString(R.string.iia);
            }
            if (z) {
                C30869C9p.LIZIZ(context, offlineDesc);
            }
        }
        return false;
    }
}
