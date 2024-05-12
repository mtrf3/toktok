package X;

import Y.ARunnableS11S0101000_7;
import Y.ARunnableS23S0200000_4;
import android.graphics.Bitmap;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.facebook.imagepipeline.common.ImageDecodeOptionsBuilder;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.zhiliaoapp.musically.R;
import defpackage.e1;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Uvh, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78765Uvh {
    public static boolean LIZ;

    public static String LJIIJJI(String str) {
        File file;
        if (str != null && !str.isEmpty()) {
            android.net.Uri parse = UriProtector.parse(str);
            if (LJIILIIL(parse)) {
                WEK LJ = W8E.LJII().LJIIIZ().LJ(W5N.LJI().LIZ(W5O.LIZ(parse), null));
                if (LJ != null && (file = LJ.LIZ) != null) {
                    return file.getAbsolutePath();
                }
            }
        }
        return "";
    }

    public static String LJIIL(UrlModel urlModel) {
        List<String> urlList;
        if (urlModel != null) {
            try {
                if (C16880lQ.LLLLLLLZIL().equals("mounted") && (urlList = urlModel.getUrlList()) != null && !urlList.isEmpty()) {
                    int size = urlList.size();
                    for (int i = 0; i < size; i++) {
                        if (LJIILIIL(UriProtector.parse((String) ListProtector.get(urlList, i)))) {
                            return (String) ListProtector.get(urlList, i);
                        }
                    }
                }
            } catch (Exception unused) {
            }
        }
        return "";
    }

    public static boolean LJIILIIL(android.net.Uri uri) {
        if (uri == null) {
            return false;
        }
        return W8E.LJII().LJIIIZ().LJII(W5N.LJI().LIZ(W5O.LIZ(uri), null));
    }

    public static void LJIILLIIL(String str) {
        if (str == null || str.isEmpty()) {
            return;
        }
        ARunnableS11S0101000_7 aRunnableS11S0101000_7 = new ARunnableS11S0101000_7(2, str, 4);
        if (C19N.LJ("tt_fresco_helper_async_opt", true)) {
            android.net.Uri parse = UriProtector.parse(str);
            C161586Vu c161586Vu = new C161586Vu(aRunnableS11S0101000_7);
            if (parse == null) {
                return;
            }
            C38995FSd.LIZLLL().execute(new ARunnableS23S0200000_4(parse, c161586Vu, 28));
            return;
        }
        if (LJIILIIL(UriProtector.parse(str))) {
            return;
        }
        aRunnableS11S0101000_7.run();
    }

    public static void LIZ(C62846OlW c62846OlW, int i) {
        if (c62846OlW == null) {
            return;
        }
        c62846OlW.setImageURI(W5P.LIZJ(i).LIZ().LIZIZ);
    }

    public static void LIZLLL(C119634ml c119634ml, UrlModel urlModel) {
        if (e1.LIZ(31744, "tiktok_circle_image_view_opt", true, false) && (c119634ml instanceof C72433Sbl)) {
            c119634ml.LJLLL = true;
        }
        LIZIZ(c119634ml, urlModel, null, true);
    }

    public static void LJFF(C62846OlW c62846OlW, UrlModel urlModel) {
        LJI(c62846OlW, urlModel, -1, -1, null);
    }

    public static void LJIIIIZZ(C62846OlW c62846OlW, C78769Uvl c78769Uvl) {
        int intValue;
        int i = C78771Uvn.LIZ[c78769Uvl.LIZ.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return;
                }
                LJIIIZ(c62846OlW, (String) c78769Uvl.LIZIZ, -1, -1);
                return;
            }
            LJFF(c62846OlW, (UrlModel) c78769Uvl.LIZIZ);
            return;
        }
        Object obj = c78769Uvl.LIZIZ;
        if (obj == null) {
            intValue = 0;
        } else {
            intValue = ((Integer) obj).intValue();
        }
        LIZ(c62846OlW, intValue);
    }

    public static void LJIILL(UrlModel urlModel, InterfaceC78763Uvf interfaceC78763Uvf) {
        W5O[] LJIIJ = LJIIJ(urlModel, null, W92.MEDIUM, null, Bitmap.Config.RGB_565);
        W6J LIZ2 = W5I.LIZ();
        C78762Uve c78762Uve = new C78762Uve(interfaceC78763Uvf, LIZ2, LJIIJ);
        if (LJIIJ.length <= 0) {
            return;
        }
        ((AbstractC48384Iyq) LIZ2.LJ(LJIIJ[0], null)).LJ(c78762Uve, FT1.LIZ());
    }

    public static void LJII(C62846OlW c62846OlW, UrlModel urlModel, W4Z<InterfaceC81599W0t> w4z) {
        W92 w92 = W92.MEDIUM;
        if (e1.LIZ(31744, "tiktok_circle_image_view_opt", true, false) && (c62846OlW instanceof C72433Sbl)) {
            ((C72433Sbl) c62846OlW).LJLLL = false;
        }
        if (c62846OlW == null || urlModel == null || urlModel.getUrlList() == null || urlModel.getUrlList().size() == 0) {
            return;
        }
        if (c62846OlW.getContext() != null) {
            C16880lQ.LLLLL(c62846OlW.getContext());
        }
        W5O[] LJIIJ = LJIIJ(urlModel, null, w92, null, Bitmap.Config.RGB_565);
        if (LJIIJ == null || LJIIJ.length == 0) {
            return;
        }
        C81705W4v LIZJ = W5I.LIZJ();
        LIZJ.LJIIL = c62846OlW.getController();
        LIZJ.LJFF(true, LJIIJ);
        LIZJ.LJII = new C81690W4g(w4z);
        c62846OlW.setController(LIZJ.LIZ());
    }

    public static void LIZIZ(C72433Sbl c72433Sbl, UrlModel urlModel, APW apw, boolean z) {
        if (e1.LIZ(31744, "tiktok_circle_image_view_opt", true, false) && (c72433Sbl instanceof C72433Sbl)) {
            c72433Sbl.LJLLL = true;
        } else if (c72433Sbl == null) {
            return;
        }
        if (urlModel == null || urlModel.getUrlList() == null || urlModel.getUrlList().size() == 0) {
            return;
        }
        if (c72433Sbl.getContext() != null) {
            C16880lQ.LLLLL(c72433Sbl.getContext());
        }
        W5O[] LJIIJ = LJIIJ(urlModel, null, W92.MEDIUM, null, Bitmap.Config.RGB_565);
        if (LJIIJ == null || LJIIJ.length == 0) {
            return;
        }
        C81705W4v LIZJ = W5I.LIZJ();
        LIZJ.LJIIL = c72433Sbl.getController();
        LIZJ.LJFF(true, LJIIJ);
        LIZJ.LJIIJ = z;
        LIZJ.LJII = new C81690W4g(apw);
        c72433Sbl.setController(LIZJ.LIZ());
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [X.W5O, REQUEST] */
    public static void LJIIIZ(C62846OlW c62846OlW, String str, int i, int i2) {
        C79238V7y c79238V7y;
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        if (e1.LIZ(31744, "tiktok_circle_image_view_opt", true, false) && (c62846OlW instanceof C72433Sbl)) {
            ((C72433Sbl) c62846OlW).LJLLL = false;
        }
        if (c62846OlW == null) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            LIZ(c62846OlW, R.drawable.b0p);
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
        ?? LIZ2 = LIZLLL.LIZ();
        C81705W4v LIZJ = W5I.LIZJ();
        LIZJ.LJIIL = c62846OlW.getController();
        LIZJ.LIZLLL = LIZ2;
        c62846OlW.setController(LIZJ.LIZ());
    }

    public static void LJIILJJIL(UrlModel urlModel, int i, int i2, InterfaceC41846Gba<Bitmap> interfaceC41846Gba) {
        C79238V7y c79238V7y;
        W6J LJI = W8E.LJII().LJI();
        if (i > 0 && i2 > 0) {
            c79238V7y = new C79238V7y(i, i2);
        } else {
            c79238V7y = null;
        }
        W5O[] LJIIJ = LJIIJ(urlModel, c79238V7y, W92.MEDIUM, null, Bitmap.Config.RGB_565);
        if (LJIIJ.length == 0) {
            return;
        }
        W4W<C81392Vwy<W5A>> LJ = LJI.LJ(LJIIJ[0], null);
        ((AbstractC48384Iyq) LJ).LJ(new C41845GbZ(LJ, interfaceC41846Gba), C79561VKj.LJLIL);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [X.W5O, REQUEST] */
    public static void LIZJ(C62846OlW c62846OlW, String str, int i, int i2, boolean z) {
        C79238V7y c79238V7y;
        if (e1.LIZ(31744, "tiktok_circle_image_view_opt", true, false) && (c62846OlW instanceof C72433Sbl)) {
            ((C72433Sbl) c62846OlW).LJLLL = true;
        }
        if (c62846OlW == null) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            LIZ(c62846OlW, R.drawable.b0p);
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
        ?? LIZ2 = LIZLLL.LIZ();
        C81705W4v LIZJ = W5I.LIZJ();
        LIZJ.LJIIL = c62846OlW.getController();
        LIZJ.LIZLLL = LIZ2;
        LIZJ.LJIIJ = z;
        c62846OlW.setController(LIZJ.LIZ());
    }

    public static void LJI(C62846OlW c62846OlW, UrlModel urlModel, int i, int i2, VA3 va3) {
        C79238V7y c79238V7y;
        W5O[] LJIIJ;
        if (i > 0 && i2 > 0) {
            c79238V7y = new C79238V7y(i, i2);
        } else {
            c79238V7y = null;
        }
        if (e1.LIZ(31744, "tiktok_circle_image_view_opt", true, false) && (c62846OlW instanceof C72433Sbl)) {
            ((C72433Sbl) c62846OlW).LJLLL = false;
        }
        if (c62846OlW == null || urlModel == null || urlModel.getUrlList() == null || urlModel.getUrlList().size() == 0 || (LJIIJ = LJIIJ(urlModel, c79238V7y, W92.MEDIUM, va3, Bitmap.Config.RGB_565)) == null || LJIIJ.length == 0) {
            return;
        }
        C81705W4v LIZJ = W5I.LIZJ();
        LIZJ.LJIIL = c62846OlW.getController();
        LIZJ.LJFF(true, LJIIJ);
        c62846OlW.setController(LIZJ.LIZ());
    }

    public static W5O[] LJIIJ(UrlModel urlModel, C79238V7y c79238V7y, W92 w92, VA3 va3, Bitmap.Config config) {
        C64358PNq c64358PNq;
        if (urlModel == null || urlModel.getUrlList() == null || urlModel.getUrlList().size() == 0) {
            return new W5O[0];
        }
        ArrayList arrayList = new ArrayList();
        if (!LIZ) {
            c64358PNq = new C64358PNq();
        } else {
            c64358PNq = null;
        }
        for (String str : urlModel.getUrlList()) {
            if (!C38354F3m.LJ(str)) {
                ImageDecodeOptionsBuilder imageDecodeOptionsBuilder = new ImageDecodeOptionsBuilder();
                imageDecodeOptionsBuilder.setBitmapConfig(config);
                imageDecodeOptionsBuilder.LIZIZ(1);
                imageDecodeOptionsBuilder.LJ = false;
                C81810W8w c81810W8w = new C81810W8w(imageDecodeOptionsBuilder);
                W5P LIZLLL = W5P.LIZLLL(UriProtector.parse(str));
                LIZLLL.LJIIIZ = w92;
                LIZLLL.LJ = c81810W8w;
                if (va3 != null) {
                    LIZLLL.LJIIJ = va3;
                }
                if (c79238V7y != null) {
                    LIZLLL.LIZJ = c79238V7y;
                }
                if (c64358PNq != null) {
                    c64358PNq.LIZIZ++;
                    LIZLLL.LJIILJJIL = c64358PNq;
                }
                arrayList.add(LIZLLL.LIZ());
            }
        }
        if (arrayList.size() == 0) {
            return new W5O[0];
        }
        return (W5O[]) arrayList.toArray(new W5O[arrayList.size()]);
    }

    /* JADX WARN: Type inference failed for: r0v17, types: [X.W5O, REQUEST] */
    public static void LJ(W5G w5g, UrlModel urlModel, int i, int i2, VA3 va3, W4Z<InterfaceC81599W0t> w4z, boolean z, UrlModel urlModel2) {
        C79238V7y c79238V7y;
        if (w5g == null || urlModel == null || urlModel.getUrlList() == null || urlModel.getUrlList().size() == 0) {
            return;
        }
        if (i > 0 && i2 > 0) {
            c79238V7y = new C79238V7y(i, i2);
        } else {
            c79238V7y = null;
        }
        if (w5g.getContext() != null) {
            C16880lQ.LLLLL(w5g.getContext());
        }
        W5O[] LJIIJ = LJIIJ(urlModel, c79238V7y, W92.MEDIUM, va3, Bitmap.Config.RGB_565);
        if (LJIIJ == null || LJIIJ.length == 0) {
            return;
        }
        C81705W4v LIZJ = W5I.LIZJ();
        LIZJ.LJIIL = w5g.getController();
        LIZJ.LJFF(z, LJIIJ);
        if (urlModel2 != null && urlModel2.getUrlList() != null && !urlModel2.getUrlList().isEmpty()) {
            String str = (String) ListProtector.get(urlModel2.getUrlList(), 0);
            if (!TextUtils.isEmpty(str)) {
                ImageDecodeOptionsBuilder imageDecodeOptionsBuilder = new ImageDecodeOptionsBuilder();
                imageDecodeOptionsBuilder.setBitmapConfig(Bitmap.Config.RGB_565);
                imageDecodeOptionsBuilder.LJ = false;
                C81810W8w c81810W8w = new C81810W8w(imageDecodeOptionsBuilder);
                W5P LIZLLL = W5P.LIZLLL(UriProtector.parse(str));
                LIZLLL.LJ = c81810W8w;
                LIZLLL.LIZJ = c79238V7y;
                LIZJ.LJ = LIZLLL.LIZ();
            }
        }
        LIZJ.LJII = new C81690W4g(w4z);
        w5g.setController(LIZJ.LIZ());
    }
}
