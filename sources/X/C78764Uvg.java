package X;

import android.graphics.Bitmap;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.facebook.imagepipeline.common.ImageDecodeOptionsBuilder;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import o53.IDdS474S0100000_7;

/* renamed from: X.Uvg, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78764Uvg {
    public static boolean LJIIL(android.net.Uri uri) {
        if (uri == null) {
            return false;
        }
        return W8E.LJII().LJIIIZ().LJII(W5N.LJI().LIZ(W5O.LIZ(uri), null));
    }

    public static void LJIILL(String str) {
        if (str == null || str.isEmpty() || LJIIL(UriProtector.parse(str))) {
            return;
        }
        W8E.LJII().LJI().LJIILIIL(W5O.LIZIZ(str));
    }

    public static void LIZ(W5G w5g, int i) {
        if (w5g == null) {
            return;
        }
        w5g.setImageURI(W5P.LIZJ(i).LIZ().LIZIZ);
    }

    public static void LJFF(W5G w5g, UrlModel urlModel) {
        LJI(w5g, urlModel, -1, -1);
    }

    public static void LJIILJJIL(UrlModel urlModel, InterfaceC72705Sg9 interfaceC72705Sg9) {
        W5O[] LJIIJJI = LJIIJJI(urlModel, null, W92.MEDIUM, null, Bitmap.Config.RGB_565);
        W6J LIZ = W5I.LIZ();
        C78761Uvd c78761Uvd = new C78761Uvd(interfaceC72705Sg9, LIZ, LJIIJJI);
        if (LJIIJJI.length <= 0) {
            return;
        }
        ((AbstractC48384Iyq) LIZ.LJ(LJIIJJI[0], null)).LJ(c78761Uvd, FT1.LIZ());
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.W5O, REQUEST] */
    public static void LIZIZ(W5G w5g, String str, int i, int i2) {
        C79238V7y c79238V7y;
        if (w5g == null || TextUtils.isEmpty(str)) {
            return;
        }
        if (i > 0 && i2 > 0) {
            c79238V7y = new C79238V7y(i, i2);
        } else {
            c79238V7y = null;
        }
        W5P LIZLLL = W5P.LIZLLL(UriProtector.parse(str));
        if (c79238V7y != null) {
            LIZLLL.LIZJ = c79238V7y;
        }
        ?? LIZ = LIZLLL.LIZ();
        C81705W4v LIZJ = W5I.LIZJ();
        LIZJ.LJIIL = w5g.getController();
        LIZJ.LIZLLL = LIZ;
        LIZJ.LJIIJ = true;
        w5g.setController(LIZJ.LIZ());
    }

    public static void LIZJ(W5G w5g, android.net.Uri uri, int i, int i2) {
        LIZLLL(w5g, uri, i, i2, null, Bitmap.Config.RGB_565, null);
    }

    public static void LJI(W5G w5g, UrlModel urlModel, int i, int i2) {
        C79238V7y c79238V7y;
        if (i > 0 && i2 > 0) {
            c79238V7y = new C79238V7y(i, i2);
        } else {
            c79238V7y = null;
        }
        LJIIIIZZ(w5g, urlModel, c79238V7y, null, null);
    }

    public static void LJIIIZ(W5G w5g, String str, int i, int i2) {
        LJIIJ(w5g, str, i, i2, Bitmap.Config.ARGB_8888, null, null);
    }

    public static void LJIILIIL(UrlModel urlModel, int i, int i2, InterfaceC15040iS<Bitmap> interfaceC15040iS) {
        C79238V7y c79238V7y;
        W6J LJI = W8E.LJII().LJI();
        if (i > 0 && i2 > 0) {
            c79238V7y = new C79238V7y(i, i2);
        } else {
            c79238V7y = null;
        }
        W5O[] LJIIJJI = LJIIJJI(urlModel, c79238V7y, W92.MEDIUM, null, Bitmap.Config.RGB_565);
        if (LJIIJJI.length == 0) {
            return;
        }
        W4W<C81392Vwy<W5A>> LJ = LJI.LJ(LJIIJJI[0], null);
        ((AbstractC48384Iyq) LJ).LJ(new C42191Gh9(LJ, interfaceC15040iS), C79561VKj.LJLIL);
    }

    public static void LJII(W5G w5g, UrlModel urlModel, Bitmap.Config config, boolean z, W4Z<InterfaceC81599W0t> w4z) {
        W5O[] LJIIJJI;
        if (w5g == null || urlModel == null || w5g.getContext() == null || (LJIIJJI = LJIIJJI(urlModel, null, W92.MEDIUM, null, config)) == null || LJIIJJI.length <= 0) {
            return;
        }
        w5g.getContext();
        C81705W4v LIZJ = W5I.LIZJ();
        LIZJ.LJIIL = w5g.getController();
        LIZJ.LJFF(true, LJIIJJI);
        LIZJ.LJIIJ = z;
        LIZJ.LJII = new W4X(null, w4z);
        w5g.setController(LIZJ.LIZ());
    }

    public static void LJIIIIZZ(W5G w5g, UrlModel urlModel, C79238V7y c79238V7y, C78746UvO c78746UvO, IDdS474S0100000_7 iDdS474S0100000_7) {
        W5O[] LJIIJJI;
        if (w5g == null || urlModel == null || urlModel.getUrlList() == null || urlModel.getUrlList().size() == 0 || (LJIIJJI = LJIIJJI(urlModel, c79238V7y, W92.MEDIUM, c78746UvO, Bitmap.Config.RGB_565)) == null || LJIIJJI.length == 0) {
            return;
        }
        C81705W4v LIZJ = W5I.LIZJ();
        LIZJ.LJIIL = w5g.getController();
        LIZJ.LJFF(true, LJIIJJI);
        if (iDdS474S0100000_7 != null) {
            LIZJ.LJII = iDdS474S0100000_7;
        }
        w5g.setController(LIZJ.LIZ());
    }

    public static W5O[] LJIIJJI(UrlModel urlModel, C79238V7y c79238V7y, W92 w92, C78746UvO c78746UvO, Bitmap.Config config) {
        if (urlModel == null || urlModel.getUrlList() == null || urlModel.getUrlList().size() == 0) {
            return new W5O[0];
        }
        ArrayList arrayList = new ArrayList();
        for (String str : urlModel.getUrlList()) {
            if (!TextUtils.isEmpty(str)) {
                ImageDecodeOptionsBuilder imageDecodeOptionsBuilder = new ImageDecodeOptionsBuilder();
                imageDecodeOptionsBuilder.setBitmapConfig(config);
                imageDecodeOptionsBuilder.LIZIZ(1);
                imageDecodeOptionsBuilder.LJ = false;
                C81810W8w c81810W8w = new C81810W8w(imageDecodeOptionsBuilder);
                W5P LIZLLL = W5P.LIZLLL(UriProtector.parse(str));
                LIZLLL.LJIIIZ = w92;
                LIZLLL.LJ = c81810W8w;
                if (c78746UvO != null) {
                    LIZLLL.LJIIJ = c78746UvO;
                }
                if (c79238V7y != null) {
                    LIZLLL.LIZJ = c79238V7y;
                }
                arrayList.add(LIZLLL.LIZ());
            }
        }
        if (arrayList.size() == 0) {
            return new W5O[0];
        }
        return (W5O[]) arrayList.toArray(new W5O[arrayList.size()]);
    }

    public static void LIZLLL(W5G w5g, android.net.Uri uri, int i, int i2, C78744UvM c78744UvM, Bitmap.Config config, W4V w4v) {
        LJ(w5g, uri, i, i2, c78744UvM, config, w4v, null);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [X.W5O, REQUEST] */
    public static void LJIIJ(W5G w5g, String str, int i, int i2, Bitmap.Config config, SIY siy, W4V w4v) {
        C79238V7y c79238V7y;
        if (w5g == null) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            LIZ(w5g, R.drawable.c95);
            return;
        }
        if (i > 0 && i2 > 0) {
            c79238V7y = new C79238V7y(i, i2);
        } else {
            c79238V7y = null;
        }
        W5P LIZLLL = W5P.LIZLLL(UriProtector.parse(str));
        if (c79238V7y != null) {
            LIZLLL.LIZJ = c79238V7y;
        }
        if (config != null) {
            ImageDecodeOptionsBuilder imageDecodeOptionsBuilder = new ImageDecodeOptionsBuilder();
            imageDecodeOptionsBuilder.setBitmapConfig(config);
            LIZLLL.LJ = new C81810W8w(imageDecodeOptionsBuilder);
        }
        if (siy != null) {
            LIZLLL.LJIILJJIL = siy;
        }
        ?? LIZ = LIZLLL.LIZ();
        C81705W4v LIZJ = W5I.LIZJ();
        LIZJ.LJIIL = w5g.getController();
        LIZJ.LJII = w4v;
        LIZJ.LIZLLL = LIZ;
        w5g.setController(LIZJ.LIZ());
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [X.W5O, REQUEST] */
    public static void LJ(W5G w5g, android.net.Uri uri, int i, int i2, AbstractC78749UvR abstractC78749UvR, Bitmap.Config config, W4V w4v, SIY siy) {
        if (w5g == null || uri == null) {
            return;
        }
        W5P LIZLLL = W5P.LIZLLL(uri);
        if (i > 0 && i2 > 0) {
            LIZLLL.LIZJ = new C79238V7y(i, i2);
        }
        if (config != null) {
            ImageDecodeOptionsBuilder imageDecodeOptionsBuilder = new ImageDecodeOptionsBuilder();
            imageDecodeOptionsBuilder.setBitmapConfig(config);
            LIZLLL.LJ = new C81810W8w(imageDecodeOptionsBuilder);
        }
        if (abstractC78749UvR != null) {
            LIZLLL.LJIIJ = abstractC78749UvR;
        }
        if (siy != null) {
            LIZLLL.LJIILJJIL = siy;
        }
        ?? LIZ = LIZLLL.LIZ();
        C81705W4v LIZJ = W5I.LIZJ();
        LIZJ.LJIIL = w5g.getController();
        LIZJ.LIZLLL = LIZ;
        if (w4v != null) {
            LIZJ.LJII = w4v;
        }
        w5g.setController(LIZJ.LIZ());
    }
}
