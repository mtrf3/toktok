package X;

import android.graphics.Bitmap;
import com.bytedance.mt.protector.impl.UriProtector;
import com.facebook.imagepipeline.common.ImageDecodeOptionsBuilder;
import com.lynx.canvas.loader.CanvasResourceResolver;
import com.lynx.tasm.core.JSProxy;
import defpackage.i0;

/* loaded from: classes15.dex */
public final class VU9 {
    public static String LIZ(long j, String str) {
        String str2;
        String LJFF;
        int i;
        try {
            if (str == null) {
                return null;
            }
            try {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("redirectUrl from url: ");
                LIZ.append(str);
                O5Y.LJJJ("KryptonImageLoader", X1D.LIZIZ(LIZ));
                str2 = JSProxy.LJFF(j, str);
            } catch (Exception e) {
                e = e;
                str2 = str;
            }
            try {
                if (str2.startsWith("assets:///") || str2.startsWith("asset:///")) {
                    if (str2.startsWith("assets:///")) {
                        i = 10;
                    } else {
                        i = 9;
                    }
                    String substring = str2.substring(i);
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("asset:///");
                    LIZ2.append(substring);
                    str2 = X1D.LIZIZ(LIZ2);
                }
                LJFF = "redirectUrl to url: ".concat(str);
            } catch (Exception e2) {
                e = e2;
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("redirectUrl exception: ");
                LIZ3.append(e.toString());
                O5Y.LJJJ("KryptonImageLoader", X1D.LIZIZ(LIZ3));
                LJFF = i0.LJFF("redirectUrl to url: ", str);
                O5Y.LJJJ("KryptonImageLoader", LJFF);
                return str2;
            }
            O5Y.LJJJ("KryptonImageLoader", LJFF);
            return str2;
        } catch (Throwable th) {
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append("redirectUrl to url: ");
            LIZ4.append(str);
            O5Y.LJJJ("KryptonImageLoader", X1D.LIZIZ(LIZ4));
            throw th;
        }
    }

    public static void LIZIZ(String str, CanvasResourceResolver canvasResourceResolver) {
        W6J LIZ = W5I.LIZ();
        W5P LIZLLL = W5P.LIZLLL(UriProtector.parse(str));
        LIZLLL.LIZJ = new C79238V7y(2.1474836E9f, Integer.MAX_VALUE, Integer.MAX_VALUE);
        ImageDecodeOptionsBuilder imageDecodeOptionsBuilder = new ImageDecodeOptionsBuilder();
        imageDecodeOptionsBuilder.setBitmapConfig(Bitmap.Config.ARGB_8888);
        imageDecodeOptionsBuilder.LJFF = true;
        LIZLLL.LJ = new C81810W8w(imageDecodeOptionsBuilder);
        ((AbstractC48384Iyq) LIZ.LJ(LIZLLL.LIZ(), null)).LJ(new VUC(canvasResourceResolver), C79561VKj.LJLIL);
    }
}
