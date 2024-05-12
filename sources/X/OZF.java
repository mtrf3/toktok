package X;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Shader;
import android.widget.ImageView;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class OZF implements InterfaceC78660Uu0 {
    public final /* synthetic */ OZD LJLIL;

    @Override // X.InterfaceC78660Uu0
    public final void onProgress(float f) {
    }

    @Override // X.InterfaceC78660Uu0
    public final void LIZ() {
        OZH ozh;
        OZD ozd = this.LJLIL;
        ozd.LJLJI = 3;
        if (ozd.LJLJJI == 2 && (ozh = ozd.LJLJJL) != null) {
            ozh.LIZIZ();
        }
    }

    public OZF(OZD ozd) {
        this.LJLIL = ozd;
    }

    @Override // X.InterfaceC78660Uu0
    public final void LIZIZ(Bitmap bitmap) {
        int i;
        OZH ozh;
        OZD ozd = this.LJLIL;
        if (bitmap != null) {
            ImageView imageView = ozd.LJLIL;
            ozd.getClass();
            int min = Math.min(bitmap.getWidth(), bitmap.getHeight());
            Paint LIZIZ = C6D8.LIZIZ(true);
            Bitmap newBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(newBitmap);
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            LIZIZ.setShader(new BitmapShader(bitmap, tileMode, tileMode));
            float f = min / 2;
            canvas.drawCircle(f, f, f, LIZIZ);
            o.LJIIIIZZ(newBitmap, "newBitmap");
            imageView.setImageBitmap(newBitmap);
            i = 2;
        } else {
            i = 3;
        }
        ozd.LJLJI = i;
        OZD ozd2 = this.LJLIL;
        if (ozd2.LJLJJI == 2 && (ozh = ozd2.LJLJJL) != null) {
            ozh.LIZIZ();
        }
    }

    @Override // X.InterfaceC78660Uu0
    public final void onFailed(Throwable th) {
        OZH ozh;
        OZD ozd = this.LJLIL;
        ozd.LJLJI = 3;
        if (ozd.LJLJJI == 2 && (ozh = ozd.LJLJJL) != null) {
            ozh.LIZIZ();
        }
    }
}
