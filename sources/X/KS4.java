package X;

import Y.ARunnableS44S0100000_8;
import android.graphics.Bitmap;
import android.os.Looper;
import android.text.TextUtils;
import android.widget.ImageView;
import com.bytedance.mt.protector.impl.UriProtector;
import com.facebook.imagepipeline.common.ImageDecodeOptionsBuilder;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;
import o53.IDdS475S0100000_8;

/* loaded from: classes9.dex */
public final class KS4 {
    public static final /* synthetic */ int LIZ = 0;

    /* JADX WARN: Type inference failed for: r0v27, types: [X.W5O, REQUEST] */
    /* JADX WARN: Type inference failed for: r0v8, types: [X.W5O, REQUEST] */
    public static final void LIZJ(C51446KHa params) {
        C79238V7y c79238V7y;
        boolean z;
        W5P LIZIZ;
        W5O[] w5oArr;
        W5P LIZIZ2;
        W5O LIZ2;
        W5P LIZIZ3;
        ?? LIZ3;
        List<String> urlList;
        int i;
        o.LJIIIZ(params, "params");
        if (!o.LJ(C16880lQ.LLJJJJ(), Looper.myLooper())) {
            C1DH.LJJIJIIJI(new ARunnableS44S0100000_8(params, 139));
            return;
        }
        ImageView imageView = params.LIZ;
        if (imageView == null) {
            return;
        }
        boolean z2 = imageView instanceof W5G;
        if (z2) {
            ((VA9) imageView).getHierarchy();
        }
        int i2 = params.LIZJ;
        if (i2 > 0 && (i = params.LIZLLL) > 0) {
            c79238V7y = new C79238V7y(i2, i);
        } else {
            c79238V7y = null;
        }
        UrlModel urlModel = params.LIZIZ;
        if (urlModel != null && urlModel.getUrlList() != null && (urlList = urlModel.getUrlList()) != null && urlList.size() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z && z2) {
            W92 w92 = W92.MEDIUM;
            Bitmap.Config config = Bitmap.Config.RGB_565;
            UrlModel urlModel2 = params.LIZIZ;
            boolean z3 = params.LJII;
            if (urlModel2 == null) {
                w5oArr = new W5O[0];
            } else {
                ArrayList arrayList = new ArrayList();
                List<String> urlList2 = urlModel2.getUrlList();
                if (urlList2 != null) {
                    for (String str : urlList2) {
                        if (str != null && str.length() != 0 && (LIZIZ2 = LIZIZ(str, w92, config, c79238V7y, z3)) != null && (LIZ2 = LIZIZ2.LIZ()) != null) {
                            arrayList.add(LIZ2);
                        }
                    }
                }
                if (arrayList.isEmpty()) {
                    w5oArr = new W5O[0];
                } else {
                    w5oArr = (W5O[]) arrayList.toArray(new W5O[0]);
                }
            }
            if (w5oArr.length == 0) {
                return;
            }
            C81705W4v LIZJ = W5I.LIZJ();
            VA9 va9 = (VA9) imageView;
            LIZJ.LJIIL = va9.getController();
            LIZJ.LJFF(true, w5oArr);
            if (!TextUtils.isEmpty(params.LJFF) && (LIZIZ3 = LIZIZ(params.LJFF, W92.MEDIUM, Bitmap.Config.RGB_565, c79238V7y, params.LJII)) != null && (LIZ3 = LIZIZ3.LIZ()) != 0) {
                LIZJ.LJ = LIZ3;
                LIZJ.LJIIJJI = true;
            }
            LIZ(LIZJ, params);
            LIZJ.LIZJ = "";
            LIZJ.LJIIJ = params.LJI;
            va9.setController(LIZJ.LIZ());
            return;
        }
        if (TextUtils.isEmpty(null) || !z2 || (LIZIZ = LIZIZ(null, null, null, c79238V7y, params.LJII)) == null) {
            return;
        }
        C81705W4v LIZJ2 = W5I.LIZJ();
        VA9 va92 = (VA9) imageView;
        LIZJ2.LJIIL = va92.getController();
        LIZJ2.LIZLLL = LIZIZ.LIZ();
        LIZ(LIZJ2, params);
        LIZJ2.LJIIJ = params.LJI;
        LIZJ2.LIZJ = "";
        va92.setController(LIZJ2.LIZ());
    }

    public static void LIZ(C81705W4v c81705W4v, C51446KHa c51446KHa) {
        c51446KHa.getClass();
        if (TextUtils.isEmpty("")) {
            c81705W4v.LJII = c51446KHa.LJ;
        } else {
            c81705W4v.LJII = new IDdS475S0100000_8(c51446KHa, 3);
        }
    }

    public static W5P LIZIZ(String str, W92 w92, Bitmap.Config config, C79238V7y c79238V7y, boolean z) {
        boolean z2;
        android.net.Uri parse;
        if (str == null || str.length() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        W5P w5p = null;
        if (z2) {
            return null;
        }
        if (ujb.o.LJJJLIIL(str, "/", false)) {
            parse = android.net.Uri.fromFile(new File(str));
        } else {
            parse = UriProtector.parse(str);
        }
        if (parse != null) {
            w5p = W5P.LIZLLL(parse);
            if (w92 != null) {
                w5p.LJIIIZ = w92;
            }
            ImageDecodeOptionsBuilder imageDecodeOptionsBuilder = new ImageDecodeOptionsBuilder();
            imageDecodeOptionsBuilder.LIZIZ(1);
            imageDecodeOptionsBuilder.LJ = false;
            imageDecodeOptionsBuilder.LJFF = z;
            if (config != null) {
                imageDecodeOptionsBuilder.setBitmapConfig(config);
            }
            w5p.LJ = new C81810W8w(imageDecodeOptionsBuilder);
            if (c79238V7y != null) {
                w5p.LIZJ = c79238V7y;
            }
        }
        return w5p;
    }
}
