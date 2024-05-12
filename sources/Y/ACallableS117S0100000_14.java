package Y;

import X.C16880lQ;
import X.C73426Srm;
import X.C73849Syb;
import X.C76800UCe;
import X.C81147Vt1;
import X.C81150Vt4;
import X.C82891Wg3;
import X.C84499XEh;
import X.HandlerC81148Vt2;
import X.HandlerC81149Vt3;
import X.InterfaceC81151Vt5;
import X.InterfaceC81152Vt6;
import X.InterfaceC84497XEf;
import X.WQT;
import X.WQU;
import X.YO7;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public class ACallableS117S0100000_14 implements Callable {
    public final int $t;
    public Object l0;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            case 2:
                return call$2(this);
            case 3:
                return call$3(this);
            case 4:
                return call$4(this);
            case 5:
                return call$5(this);
            case 6:
                return call$6(this);
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS117S0100000_14 aCallableS117S0100000_14) {
        C81147Vt1 c81147Vt1 = ((HandlerC81148Vt2) aCallableS117S0100000_14.l0).LIZ.get();
        if (c81147Vt1 != null) {
            HandlerC81148Vt2 handlerC81148Vt2 = (HandlerC81148Vt2) aCallableS117S0100000_14.l0;
            c81147Vt1.setProgress(handlerC81148Vt2.LJ / handlerC81148Vt2.LIZJ);
            if (!c81147Vt1.LJLJLLL) {
                c81147Vt1.invalidate();
                ValueAnimator valueAnimator = c81147Vt1.LJLJJL;
                if (valueAnimator != null) {
                    C16880lQ.LJLJL(valueAnimator);
                    ValueAnimator valueAnimator2 = c81147Vt1.LJLJJL;
                    o.LJI(valueAnimator2);
                    valueAnimator2.cancel();
                    c81147Vt1.LJLJJL = null;
                }
                InterfaceC81152Vt6 interfaceC81152Vt6 = c81147Vt1.LJLJJI;
                if (interfaceC81152Vt6 != null) {
                    interfaceC81152Vt6.onCancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                c81147Vt1.LJLJJL = ofFloat;
                if (ofFloat != null) {
                    ofFloat.setDuration(1400L);
                }
                ValueAnimator valueAnimator3 = c81147Vt1.LJLJJL;
                if (valueAnimator3 != null) {
                    valueAnimator3.addListener(new ALAdapterS11S0100000_14(c81147Vt1, 39));
                }
                ValueAnimator valueAnimator4 = c81147Vt1.LJLJJL;
                if (valueAnimator4 != null) {
                    valueAnimator4.start();
                }
            }
        }
        return null;
    }

    public static final Object call$1(ACallableS117S0100000_14 aCallableS117S0100000_14) {
        boolean z;
        Bitmap src = (Bitmap) aCallableS117S0100000_14.l0;
        o.LJIIIZ(src, "src");
        if (src.getWidth() == 0 || src.getHeight() == 0) {
            z = true;
        } else {
            z = false;
        }
        Bitmap bitmap = null;
        RenderScript renderScript = null;
        if (!z) {
            int width = src.getWidth();
            int height = src.getHeight();
            Matrix matrix = new Matrix();
            matrix.setScale(0.5f, 0.5f);
            Bitmap scaleBitmap = Bitmap.createBitmap(src, 0, 0, src.getWidth(), src.getHeight(), matrix, true);
            Paint paint = new Paint(3);
            Canvas canvas = new Canvas();
            paint.setColorFilter(new PorterDuffColorFilter(0, PorterDuff.Mode.SRC_ATOP));
            canvas.scale(0.5f, 0.5f);
            canvas.drawBitmap(scaleBitmap, 0.0f, 0.0f, paint);
            o.LJIIIIZZ(scaleBitmap, "scaleBitmap");
            Bitmap ret = scaleBitmap.copy(scaleBitmap.getConfig(), true);
            try {
                renderScript = RenderScript.create(C82891Wg3.LIZ());
                renderScript.setMessageHandler(new RenderScript.RSMessageHandler());
                Allocation createFromBitmap = Allocation.createFromBitmap(renderScript, ret, Allocation.MipmapControl.MIPMAP_NONE, 1);
                Allocation createTyped = Allocation.createTyped(renderScript, createFromBitmap.getType());
                ScriptIntrinsicBlur create = ScriptIntrinsicBlur.create(renderScript, Element.U8_4(renderScript));
                create.setInput(createFromBitmap);
                create.setRadius(20.0f);
                create.forEach(createTyped);
                createTyped.copyTo(ret);
                renderScript.destroy();
                o.LJIIIIZZ(ret, "ret");
                bitmap = Bitmap.createScaledBitmap(ret, width, height, true);
                if (!ret.isRecycled()) {
                    ret.recycle();
                }
            } catch (Throwable th) {
                if (renderScript != null) {
                    renderScript.destroy();
                }
                throw th;
            }
        }
        if (bitmap == null) {
            bitmap = ((Bitmap) aCallableS117S0100000_14.l0).copy(Bitmap.Config.RGB_565, false);
        }
        if (bitmap != null) {
            return bitmap;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    public static final Object call$2(ACallableS117S0100000_14 aCallableS117S0100000_14) {
        ((YO7) aCallableS117S0100000_14.l0).destroy();
        return C76800UCe.LIZ;
    }

    public static final Object call$3(ACallableS117S0100000_14 aCallableS117S0100000_14) {
        Runnable runnable = (Runnable) aCallableS117S0100000_14.l0;
        if (runnable == null) {
            return null;
        }
        runnable.run();
        return null;
    }

    public static final Object call$4(ACallableS117S0100000_14 aCallableS117S0100000_14) {
        Runnable runnable = (Runnable) aCallableS117S0100000_14.l0;
        if (runnable == null) {
            return null;
        }
        runnable.run();
        return null;
    }

    public static final Object call$5(ACallableS117S0100000_14 aCallableS117S0100000_14) {
        C81150Vt4 c81150Vt4 = ((HandlerC81149Vt3) aCallableS117S0100000_14.l0).LIZ.get();
        if (c81150Vt4 != null) {
            c81150Vt4.setProgress(r2.LJ / r2.LIZJ);
            if (!c81150Vt4.LJLLI) {
                c81150Vt4.invalidate();
                ValueAnimator valueAnimator = c81150Vt4.LJLJL;
                if (valueAnimator != null) {
                    C16880lQ.LJLJL(valueAnimator);
                    c81150Vt4.LJLJL.cancel();
                    c81150Vt4.LJLJL = null;
                }
                InterfaceC81151Vt5 interfaceC81151Vt5 = c81150Vt4.LJLJJLL;
                if (interfaceC81151Vt5 != null) {
                    interfaceC81151Vt5.onCancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                c81150Vt4.LJLJL = ofFloat;
                ofFloat.setDuration(1400L);
                c81150Vt4.LJLJL.addListener(new ALAdapterS11S0100000_14(c81150Vt4, 7));
                c81150Vt4.LJLJL.start();
            }
        }
        return null;
    }

    public static final Object call$6(ACallableS117S0100000_14 aCallableS117S0100000_14) {
        WQU wqu = (WQU) aCallableS117S0100000_14.l0;
        wqu.getClass();
        C73849Syb c73849Syb = new C73849Syb();
        InterfaceC84497XEf interfaceC84497XEf = wqu.LIZJ.get();
        o.LJIIIIZZ(interfaceC84497XEf, "effectPlatform.get()");
        String str = wqu.LIZLLL.get();
        o.LJIIIIZZ(str, "panelSupplier.get()");
        C84499XEh.LJFF(interfaceC84497XEf, str, new WQT(wqu, c73849Syb), wqu.LJ);
        return new C73426Srm(c73849Syb);
    }

    public ACallableS117S0100000_14(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public ACallableS117S0100000_14(Runnable runnable, String str, int i) {
        this.$t = i;
        this.l0 = runnable;
    }
}
