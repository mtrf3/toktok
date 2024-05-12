package X;

import com.ss.android.ugc.aweme.base.ImageUrlModel;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.profile.model.User;

/* renamed from: X.LhM, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54944LhM {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(Aweme aweme) {
        User author;
        if (aweme != null && (author = aweme.getAuthor()) != null) {
            return !C2060386t.LIZ(author.getUid());
        }
        return false;
    }

    public static boolean LIZIZ(Aweme aweme) {
        User author;
        UrlModel avatarThumb;
        if (aweme != null && (author = aweme.getAuthor()) != null && (avatarThumb = author.getAvatarThumb()) != null && !C78939UyV.LJ(avatarThumb).LIZ()) {
            return true;
        }
        return false;
    }

    public static boolean LIZJ(Aweme aweme) {
        if (aweme != null && aweme.getMusic() != null && !C2060386t.LIZ(aweme.getMusic().getIdStr())) {
            return true;
        }
        return false;
    }

    public static boolean LIZLLL(Aweme aweme) {
        Music music;
        UrlModel coverThumb;
        if (aweme != null && (music = aweme.getMusic()) != null && (coverThumb = music.getCoverThumb()) != null && !C78939UyV.LJ(coverThumb).LIZ()) {
            return true;
        }
        return false;
    }

    public static void LJFF(Aweme aweme, String str) {
        int i;
        if (aweme == null) {
            return;
        }
        boolean LJIIL = C48236IwS.LJIIL(aweme.getAid());
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", str);
        c188727au.LIZLLL(LJIIL ? 1 : 0, "cache");
        if (aweme.getMusic() == null) {
            i = 2;
        } else if (C2060386t.LIZ(aweme.getMusic().getMusicName())) {
            i = 3;
        } else {
            i = 0;
        }
        c188727au.LIZLLL(i, "status");
        FMX.LJIIL("music_title_show", c188727au.LIZ);
    }

    public static void LJ(Aweme aweme, String str, boolean z, boolean z2) {
        ImageUrlModel imageUrlModel;
        int i;
        UrlModel coverThumb;
        if (aweme == null) {
            return;
        }
        boolean LJIIL = C48236IwS.LJIIL(aweme.getAid());
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", str);
        c188727au.LIZLLL(LJIIL ? 1 : 0, "cache");
        if (z) {
            i = 0;
        } else {
            Music music = aweme.getMusic();
            if (music != null && (coverThumb = music.getCoverThumb()) != null) {
                imageUrlModel = C78939UyV.LJ(coverThumb);
            } else {
                imageUrlModel = null;
            }
            if (aweme.getMusic() == null || C2060386t.LIZ(aweme.getMusic().getIdStr())) {
                i = 2;
            } else if (aweme.getMusic().getCoverThumb() == null || imageUrlModel == null || imageUrlModel.LIZ()) {
                i = 3;
            } else if (z2) {
                i = 4;
            } else {
                i = 1;
            }
        }
        c188727au.LIZLLL(i, "status");
        FMX.LJIIL("music_turntable_show", c188727au.LIZ);
    }
}
