package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicDetail;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.7XU, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7XU {
    public static boolean LIZ(MusicDetail musicDetail) {
        Music music;
        UrlModel playUrl;
        List<String> urlList;
        o.LJIIIZ(musicDetail, "musicDetail");
        Music music2 = musicDetail.music;
        if ((music2 == null || music2.getMusicStatus() != 0) && (music = musicDetail.music) != null && (playUrl = music.getPlayUrl()) != null && (urlList = playUrl.getUrlList()) != null && !urlList.isEmpty()) {
            return false;
        }
        return true;
    }
}
