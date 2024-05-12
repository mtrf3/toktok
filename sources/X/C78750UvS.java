package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.bytedance.ies.xelement.bytedlottie.LynxBytedLottieView;
import com.lynx.tasm.base.LLog;
import kotlin.jvm.internal.o;

/* renamed from: X.UvS, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78750UvS extends AbstractC78749UvR {
    public final /* synthetic */ String LIZ;
    public final /* synthetic */ LynxBytedLottieView LIZIZ;

    public C78750UvS(String str, LynxBytedLottieView lynxBytedLottieView) {
        this.LIZ = str;
        this.LIZIZ = lynxBytedLottieView;
    }

    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0069: MOVE (r3 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]) (LINE:33554537), block:B:16:0x0069 */
    @Override // X.AbstractC78749UvR, X.VA3
    public final C81392Vwy<Bitmap> process(Bitmap sourceBitmap, AbstractC78853Ux7 bitmapFactory) {
        C81392Vwy<Bitmap> c81392Vwy;
        C81392Vwy c81392Vwy2;
        o.LJIIJ(sourceBitmap, "sourceBitmap");
        o.LJIIJ(bitmapFactory, "bitmapFactory");
        LLog.LIZLLL(2, "byted-lottie", "some memory is wasted, recreate the bitmap with 565");
        C81392Vwy c81392Vwy3 = null;
        try {
            try {
                c81392Vwy = bitmapFactory.LJ(sourceBitmap.getWidth(), sourceBitmap.getHeight(), Bitmap.Config.RGB_565);
                try {
                    new Canvas(c81392Vwy.LJI()).drawBitmap(sourceBitmap, 0.0f, 0.0f, (Paint) null);
                    C81392Vwy<Bitmap> LIZJ = C81392Vwy.LIZJ(c81392Vwy);
                    C81392Vwy.LJ(c81392Vwy);
                    return LIZJ;
                } catch (Exception e) {
                    e = e;
                    C16880lQ.LLLLIIL(e);
                    LynxBytedLottieView lynxBytedLottieView = this.LIZIZ;
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("error happened when change bitmap from ARG_8888 to RGB_565, imagePath is ");
                    LIZ.append(this.LIZ);
                    String LIZIZ = X1D.LIZIZ(LIZ);
                    String it = this.LIZ;
                    o.LJFF(it, "it");
                    lynxBytedLottieView.LJJI(3, LIZIZ, it);
                    C81392Vwy.LJ(c81392Vwy);
                    return super.process(sourceBitmap, bitmapFactory);
                }
            } catch (Throwable th) {
                th = th;
                c81392Vwy3 = c81392Vwy2;
                C81392Vwy.LJ(c81392Vwy3);
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            c81392Vwy = null;
        } catch (Throwable th2) {
            th = th2;
            C81392Vwy.LJ(c81392Vwy3);
            throw th;
        }
    }
}
