package X;

import android.graphics.Bitmap;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.facebook.imagepipeline.common.ImageDecodeOptionsBuilder;
import com.zhiliaoapp.musically.R;
import o53.IDdS473S0100000_2;

/* renamed from: X.6mt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C170676mt {
    public static W5O[] LIZJ(Bitmap.Config config, String str) {
        ImageDecodeOptionsBuilder imageDecodeOptionsBuilder = new ImageDecodeOptionsBuilder();
        imageDecodeOptionsBuilder.setBitmapConfig(config);
        imageDecodeOptionsBuilder.LIZIZ(1);
        imageDecodeOptionsBuilder.LJ = false;
        C81810W8w c81810W8w = new C81810W8w(imageDecodeOptionsBuilder);
        W5P LIZLLL = W5P.LIZLLL(UriProtector.parse(str));
        LIZLLL.LJ = c81810W8w;
        return new W5O[]{LIZLLL.LIZ()};
    }

    public static void LIZIZ(W5G w5g, String str, Bitmap.Config config) {
        W5O[] w5oArr;
        if (w5g == null) {
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            w5oArr = LIZJ(config, str);
        } else {
            w5oArr = null;
        }
        LIZ(w5g, w5oArr, null, true);
    }

    public static void LIZ(W5G w5g, W5O[] w5oArr, IDdS473S0100000_2 iDdS473S0100000_2, boolean z) {
        if (w5oArr == null) {
            C78764Uvg.LIZ(w5g, R.drawable.c95);
            return;
        }
        C81705W4v LIZJ = W5I.LIZJ();
        LIZJ.LJIIL = w5g.getController();
        LIZJ.LJIIJ = z;
        LIZJ.LJFF(true, w5oArr);
        if (iDdS473S0100000_2 != null) {
            LIZJ.LJII = iDdS473S0100000_2;
        }
        w5g.setController(LIZJ.LIZ());
    }
}
