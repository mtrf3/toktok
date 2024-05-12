package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.tools.mvtemplate.MvThemeData;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HAM {
    public final Keva LIZ;

    public HAM() {
        Keva repo = Keva.getRepo("pic_mv_theme_data_keva");
        o.LJIIIIZZ(repo, "getRepo(REPO_NAME)");
        this.LIZ = repo;
    }

    public final void LIZ(MvThemeData mvThemeData) {
        this.LIZ.storeBoolean("photo_mv_is1080p", C47261Igj.LJIJI());
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PicMvThemeDataKeva: enable_photo_to_1080p = ");
        LIZ.append(C47261Igj.LJIJI());
        C5Z5.LIZIZ(X1D.LIZIZ(LIZ));
        try {
            this.LIZ.storeString("single_mv", C44172HVg.LIZIZ.LJIILL(mvThemeData));
        } catch (Exception e) {
            H7B.LIZLLL(e);
        }
    }

    public final void LIZIZ(MvThemeData mvThemeData) {
        this.LIZ.storeBoolean("photo_mv_is1080p", C47261Igj.LJIJI());
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PicMvThemeDataKeva: enable_photo_to_1080p = ");
        LIZ.append(C47261Igj.LJIJI());
        C5Z5.LIZIZ(X1D.LIZIZ(LIZ));
        try {
            this.LIZ.storeString("slideshow_mv", C44172HVg.LIZIZ.LJIILL(mvThemeData));
        } catch (Exception e) {
            H7B.LIZLLL(e);
        }
    }
}
