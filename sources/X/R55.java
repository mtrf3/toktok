package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.webkit.WebView;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class R55 implements InterfaceC38012Evw {
    public final WeakReference<Context> LJLIL;
    public final C38049EwX LJLILLLLZI;

    public R55(WeakReference<Context> weakReference, C38049EwX c38049EwX) {
        this.LJLIL = weakReference;
        this.LJLILLLLZI = c38049EwX;
    }

    @Override // X.InterfaceC38012Evw
    public final void call(C38048EwW c38048EwW, JSONObject jSONObject) {
        if (c38048EwW == null || c38048EwW.LIZLLL == null) {
            return;
        }
        c38048EwW.LJIIJ = false;
        float scale = this.LJLILLLLZI.LIZ.getScale();
        final int i = (int) (JSONObjectProtectorUtils.getInt(c38048EwW.LIZLLL, "width") * scale);
        final int i2 = (int) (JSONObjectProtectorUtils.getInt(c38048EwW.LIZLLL, "height") * scale);
        final int i3 = (int) (JSONObjectProtectorUtils.getInt(c38048EwW.LIZLLL, "left") * scale);
        final int i4 = (int) (JSONObjectProtectorUtils.getInt(c38048EwW.LIZLLL, "top") * scale);
        final int optInt = c38048EwW.LIZLLL.optInt("format", 0);
        String str = c38048EwW.LIZIZ;
        C38049EwX c38049EwX = this.LJLILLLLZI;
        if (c38049EwX == null || c38049EwX.LIZ == null) {
            return;
        }
        Callable callable = new Callable() { // from class: X.R57
            @Override // java.util.concurrent.Callable
            public final Object call() {
                R55 r55 = R55.this;
                int i5 = i;
                int i6 = i2;
                int i7 = i3;
                int i8 = i4;
                r55.getClass();
                Bitmap createBitmap = Bitmap.createBitmap(i5, i6, Bitmap.Config.RGB_565);
                Canvas canvas = new Canvas(createBitmap);
                canvas.translate(-i7, -i8);
                WebView webView = r55.LJLILLLLZI.LIZ;
                C37203Eit.LIZJ.getClass();
                C39214FaE.LIZ(webView, canvas);
                return createBitmap;
            }
        };
        C10C c10c = C10K.LJIIIIZZ;
        C10K.LIZIZ(callable, c10c, null).LJ(new C10I() { // from class: X.Hrq
            @Override // X.C10I
            public final Object then(C10K c10k) {
                Bitmap.CompressFormat compressFormat;
                String str2;
                R55 r55 = R55.this;
                int i5 = optInt;
                r55.getClass();
                Object obj = "";
                if (c10k.LJIIJJI() == null) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("code", 0);
                    jSONObject2.put("file_path", "");
                    return jSONObject2;
                }
                if (i5 != 1) {
                    if (i5 != 2) {
                        compressFormat = Bitmap.CompressFormat.JPEG;
                        str2 = ".jpg";
                    } else {
                        compressFormat = Bitmap.CompressFormat.WEBP;
                        str2 = ".webp";
                    }
                } else {
                    compressFormat = Bitmap.CompressFormat.PNG;
                    str2 = ".png";
                }
                Context context = r55.LJLIL.get();
                if (context == null) {
                    return null;
                }
                File LLIIJLIL = C16880lQ.LLIIJLIL(context);
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(LLIIJLIL.getAbsolutePath());
                String LJFF = JBR.LJFF(LIZ, File.separator, "Camera", LIZ);
                StringBuilder LIZ2 = X1D.LIZ();
                File file = new File(LJFF, C72545SdZ.LIZLLL(LIZ2, "share_", str2, LIZ2));
                C37246Eja c37246Eja = C37247Ejb.LIZIZ;
                String absolutePath = file.getAbsolutePath();
                c37246Eja.getClass();
                C37246Eja.LIZJ(absolutePath);
                boolean LIZ3 = C42300Giu.LIZ((Bitmap) c10k.LJIIJJI(), file, 100, compressFormat);
                ((Bitmap) c10k.LJIIJJI()).recycle();
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("code", LIZ3 ? 1 : 0);
                if (LIZ3) {
                    obj = file.getAbsoluteFile();
                }
                jSONObject3.put("file_path", obj);
                return jSONObject3;
            }
        }, C10K.LJI, null).LJ(new R56(this, str), c10c, null);
    }
}
