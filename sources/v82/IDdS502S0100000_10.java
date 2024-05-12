package v82;

import X.AbstractC85293Wj;
import X.C3C5;
import X.C59437NUj;
import X.C62089OYj;
import X.C6D8;
import X.C7MY;
import X.InterfaceC62093OYn;
import X.InterfaceC67352kd;
import X.OL5;
import X.VA9;
import X.ViewOnClickListenerC59660NbE;
import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.view.ViewGroup;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public class IDdS502S0100000_10 extends AbstractC85293Wj {
    public final int $t;
    public Object l0;

    public static final void onFailed$3(IDdS502S0100000_10 iDdS502S0100000_10, Throwable th) {
    }

    public static final void onFailed$4(IDdS502S0100000_10 iDdS502S0100000_10, Throwable th) {
    }

    @Override // X.AbstractC85293Wj, X.InterfaceC78660Uu0
    public final void LIZ() {
        switch (this.$t) {
            case 2:
                LIZ$0(this);
                return;
            default:
                super.LIZ();
                return;
        }
    }

    @Override // X.InterfaceC78660Uu0
    public final void LIZIZ(Bitmap bitmap) {
        switch (this.$t) {
            case 0:
                LIZIZ$0(this, bitmap);
                return;
            case 1:
                LIZIZ$1(this, bitmap);
                return;
            case 2:
                LIZIZ$2(this, bitmap);
                return;
            case 3:
                LIZIZ$3(this, bitmap);
                return;
            case 4:
                LIZIZ$4(this, bitmap);
                return;
            default:
                super.LIZIZ(bitmap);
                return;
        }
    }

    @Override // X.InterfaceC78660Uu0
    public final void onFailed(Throwable th) {
        switch (this.$t) {
            case 0:
                onFailed$0(this, th);
                return;
            case 1:
                onFailed$1(this, th);
                return;
            case 2:
                onFailed$2(this, th);
                return;
            case 3:
                onFailed$3(this, th);
                return;
            case 4:
                onFailed$4(this, th);
                return;
            default:
                super.onFailed(th);
                return;
        }
    }

    public static final void LIZ$0(IDdS502S0100000_10 iDdS502S0100000_10) {
        ((OL5) iDdS502S0100000_10.l0).LJIIJ = false;
    }

    public IDdS502S0100000_10(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LIZIZ$0(IDdS502S0100000_10 iDdS502S0100000_10, Bitmap bitmap) {
        InterfaceC67352kd interfaceC67352kd = (InterfaceC67352kd) iDdS502S0100000_10.l0;
        C3C5.m7constructorimpl(bitmap);
        interfaceC67352kd.resumeWith(bitmap);
    }

    public static final void LIZIZ$1(IDdS502S0100000_10 iDdS502S0100000_10, Bitmap bitmap) {
        if (bitmap != null) {
            VA9 va9 = (VA9) ((C62089OYj) iDdS502S0100000_10.l0).LIZ(R.id.fyq);
            ((C62089OYj) iDdS502S0100000_10.l0).getClass();
            int min = Math.min(bitmap.getWidth(), bitmap.getHeight());
            Paint LIZIZ = C6D8.LIZIZ(true);
            Bitmap newBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(newBitmap);
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            LIZIZ.setShader(new BitmapShader(bitmap, tileMode, tileMode));
            float f = min / 2;
            canvas.drawCircle(f, f, f, LIZIZ);
            o.LJIIIIZZ(newBitmap, "newBitmap");
            va9.setImageBitmap(newBitmap);
            InterfaceC62093OYn interfaceC62093OYn = ((C62089OYj) iDdS502S0100000_10.l0).LJLJJI;
            if (interfaceC62093OYn != null) {
                interfaceC62093OYn.LIZ();
                return;
            }
            return;
        }
        ((VA9) ((C62089OYj) iDdS502S0100000_10.l0).LIZ(R.id.fyq)).setImageDrawable(((C62089OYj) iDdS502S0100000_10.l0).getDefaultDrawable());
        InterfaceC62093OYn interfaceC62093OYn2 = ((C62089OYj) iDdS502S0100000_10.l0).LJLJJI;
        if (interfaceC62093OYn2 == null) {
            return;
        }
        interfaceC62093OYn2.LIZ();
    }

    public static final void LIZIZ$2(IDdS502S0100000_10 iDdS502S0100000_10, Bitmap bitmap) {
        Bitmap dst;
        Bitmap bitmap2 = bitmap;
        ((OL5) iDdS502S0100000_10.l0).LJIIJ = false;
        if (bitmap2 != null) {
            OL5 ol5 = (OL5) iDdS502S0100000_10.l0;
            int LIZIZ = C7MY.LIZIZ(22);
            try {
                int width = bitmap2.getWidth();
                int height = bitmap2.getHeight();
                if (width != height || width != LIZIZ) {
                    if (width >= height) {
                        float f = LIZIZ / height;
                        Matrix matrix = new Matrix();
                        matrix.setScale(f, f);
                        dst = Bitmap.createBitmap(bitmap2, (width - height) / 2, 0, height, height, matrix, true);
                    } else {
                        float f2 = LIZIZ / width;
                        Matrix matrix2 = new Matrix();
                        matrix2.setScale(f2, f2);
                        dst = Bitmap.createBitmap(bitmap2, 0, (height - width) / 2, width, width, matrix2, true);
                    }
                    if (!o.LJ(bitmap2, dst) && !bitmap2.isRecycled()) {
                        bitmap2.recycle();
                    }
                    o.LJIIIIZZ(dst, "dst");
                    bitmap2 = dst;
                }
            } catch (Throwable unused) {
            }
            ol5.LJII = bitmap2;
        }
    }

    public static final void LIZIZ$3(IDdS502S0100000_10 iDdS502S0100000_10, Bitmap bitmap) {
        ViewOnClickListenerC59660NbE viewOnClickListenerC59660NbE;
        Resources resources;
        if (bitmap == null || (viewOnClickListenerC59660NbE = ((C59437NUj) iDdS502S0100000_10.l0).LJLJL) == null) {
            return;
        }
        Activity activity = ((C59437NUj) iDdS502S0100000_10.l0).LJLZ;
        if (activity != null) {
            resources = activity.getResources();
        } else {
            resources = null;
        }
        viewOnClickListenerC59660NbE.setBackground(new BitmapDrawable(resources, bitmap));
    }

    public static final void LIZIZ$4(IDdS502S0100000_10 iDdS502S0100000_10, Bitmap bitmap) {
        if (bitmap != null) {
            ((ViewGroup) iDdS502S0100000_10.l0).setBackground(new BitmapDrawable(((ViewGroup) iDdS502S0100000_10.l0).getResources(), bitmap));
        }
    }

    public static final void onFailed$0(IDdS502S0100000_10 iDdS502S0100000_10, Throwable th) {
        InterfaceC67352kd interfaceC67352kd = (InterfaceC67352kd) iDdS502S0100000_10.l0;
        C3C5.m7constructorimpl(null);
        interfaceC67352kd.resumeWith(null);
    }

    public static final void onFailed$1(IDdS502S0100000_10 iDdS502S0100000_10, Throwable th) {
        if (th != null) {
            th.printStackTrace();
        }
        ((VA9) ((C62089OYj) iDdS502S0100000_10.l0).LIZ(R.id.fyq)).setImageDrawable(((C62089OYj) iDdS502S0100000_10.l0).getDefaultDrawable());
        InterfaceC62093OYn interfaceC62093OYn = ((C62089OYj) iDdS502S0100000_10.l0).LJLJJI;
        if (interfaceC62093OYn != null) {
            interfaceC62093OYn.LJIL();
        }
    }

    public static final void onFailed$2(IDdS502S0100000_10 iDdS502S0100000_10, Throwable th) {
        ((OL5) iDdS502S0100000_10.l0).LJIIJ = false;
    }
}
