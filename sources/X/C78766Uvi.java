package X;

import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.base.model.UrlModel;

/* renamed from: X.Uvi, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78766Uvi {
    public static boolean LIZIZ(android.net.Uri uri) {
        if (uri == null) {
            return false;
        }
        return W8E.LJII().LJIIIZ().LJII(W5N.LJI().LIZ(W5O.LIZ(uri), null));
    }

    public static void LIZ(C62846OlW c62846OlW, UrlModel urlModel, W4Z w4z) {
        if (c62846OlW == null || c62846OlW.getContext() == null || urlModel == null || C79004UzY.LJJIFFI(urlModel.getUrlList())) {
            return;
        }
        W5O[] LJIIJ = C78765Uvh.LJIIJ(urlModel, null, W92.MEDIUM, null, Bitmap.Config.ARGB_8888);
        if (LJIIJ == null || LJIIJ.length == 0) {
            return;
        }
        C81705W4v LIZJ = W5I.LIZJ();
        LIZJ.LJIIL = c62846OlW.getController();
        LIZJ.LJIIJ = false;
        LIZJ.LJFF(true, LJIIJ);
        LIZJ.LJII = new C81690W4g(w4z);
        c62846OlW.setController(LIZJ.LIZ());
    }
}
