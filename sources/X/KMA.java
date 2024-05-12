package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.commercialize.media.impl.service.CommerceMediaServiceImpl;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.music.model.Music;
import java.util.List;

/* loaded from: classes9.dex */
public final class KMA extends C1A7 {
    public static final KMA LJLJLJ = new KMA();
    public static final C62822Ol8 LJLJLLL = C221108m2.LIZIZ(KMB.LJLIL);
    public static final boolean LJLL;

    static {
        boolean z;
        if (LJJIZ() == 2) {
            z = true;
        } else {
            z = false;
        }
        LJLL = z;
    }

    public static final int LJJIZ() {
        return ((Number) LJLJLLL.getValue()).intValue();
    }

    public static boolean LJJJ() {
        if (!DYB.LIZ() || ((Number) KMC.LIZ.getValue()).intValue() == 1 || !C46442IKo.LIZ()) {
            return false;
        }
        return true;
    }

    public static boolean LJJJI(Aweme aweme) {
        boolean z;
        Music music;
        Music music2;
        Music music3;
        UrlModel playUrl;
        List<String> urlList;
        Music music4;
        if (aweme == null) {
            return false;
        }
        if (aweme.getMusic() == null || CommerceMediaServiceImpl.LIZJ().LJIILLIIL(aweme.getMusic()) || (((music = aweme.getMusic()) != null && !music.isShootingAllowed()) || (((music2 = aweme.getMusic()) != null && music2.getMusicStatus() == 0) || (music3 = aweme.getMusic()) == null || (playUrl = music3.getPlayUrl()) == null || (urlList = playUrl.getUrlList()) == null || !(!urlList.isEmpty()) || (music4 = aweme.getMusic()) == null || music4.isCanNotReuse() || !XU0.LIZ(aweme.getMusic().convertToMusicModel(), null, false)))) {
            z = false;
        } else {
            z = true;
        }
        if (aweme.isAd() || !z) {
            return false;
        }
        return true;
    }
}
