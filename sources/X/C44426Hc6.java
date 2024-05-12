package X;

import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Hc6, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44426Hc6 {
    public static String LIZJ(int i) {
        return (i == 0 || i == 14) ? "popular_song" : i == 3 ? "song_category" : i == 2 ? "search_result" : "";
    }

    public static List<MusicModel> LIZ(List<Music> list) {
        ArrayList arrayList = new ArrayList();
        for (Music music : list) {
            if (music != null) {
                MusicModel convertToMusicModel = music.convertToMusicModel();
                convertToMusicModel.setChallengeUserCount(music.getUserCount());
                convertToMusicModel.setChallengeMusic(true);
                convertToMusicModel.setDataType(0);
                arrayList.add(convertToMusicModel);
            }
        }
        return arrayList;
    }

    public static List<MusicModel> LIZIZ(List<Music> list, BaseResponse.ServerTimeExtra serverTimeExtra) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Music music : list) {
            if (music != null) {
                MusicModel convertToMusicModel = music.convertToMusicModel();
                if (serverTimeExtra != null) {
                    LogPbBean logPbBean = new LogPbBean();
                    logPbBean.setImprId(serverTimeExtra.logid);
                    convertToMusicModel.setLogPb(logPbBean);
                }
                arrayList.add(convertToMusicModel);
            }
        }
        return arrayList;
    }
}
