package v82;

import X.AbstractC85293Wj;
import X.C27606AsU;
import X.C48924JIa;
import X.C73044Slc;
import X.C7MY;
import X.JIZ;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public class IDdS501S0100000_8 extends AbstractC85293Wj {
    public final int $t;
    public Object l0;

    public static final void onFailed$0(IDdS501S0100000_8 iDdS501S0100000_8, Throwable th) {
    }

    public static final void onFailed$1(IDdS501S0100000_8 iDdS501S0100000_8, Throwable th) {
    }

    public static final void onFailed$3(IDdS501S0100000_8 iDdS501S0100000_8, Throwable th) {
    }

    public static final void onFailed$4(IDdS501S0100000_8 iDdS501S0100000_8, Throwable th) {
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

    public IDdS501S0100000_8(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LIZIZ$0(IDdS501S0100000_8 iDdS501S0100000_8, Bitmap bitmap) {
        ((JIZ) iDdS501S0100000_8.l0).LJLILLLLZI.setCoverImage(bitmap);
    }

    public static final void LIZIZ$1(IDdS501S0100000_8 iDdS501S0100000_8, Bitmap bitmap) {
        C48924JIa c48924JIa = (C48924JIa) iDdS501S0100000_8.l0;
        C27606AsU c27606AsU = c48924JIa.LJLJJL;
        if (c27606AsU != null) {
            c27606AsU.LJFF = bitmap;
        }
        c48924JIa.LJLILLLLZI.setParams(c27606AsU);
    }

    public static final void LIZIZ$2(IDdS501S0100000_8 iDdS501S0100000_8, Bitmap bitmap) {
        if (bitmap == null || bitmap.getWidth() == 0 || bitmap.getHeight() == 0) {
            return;
        }
        if (bitmap.getWidth() > bitmap.getHeight()) {
            ImageView image = (ImageView) iDdS501S0100000_8.l0;
            o.LJIIIIZZ(image, "image");
            ViewGroup.LayoutParams layoutParams = image.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = (int) ((C7MY.LIZIZ(56) * bitmap.getHeight()) / bitmap.getWidth());
                image.setLayoutParams(layoutParams);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
        } else {
            ImageView image2 = (ImageView) iDdS501S0100000_8.l0;
            o.LJIIIIZZ(image2, "image");
            ViewGroup.LayoutParams layoutParams2 = image2.getLayoutParams();
            if (layoutParams2 != null) {
                layoutParams2.height = C7MY.LIZIZ(56);
                image2.setLayoutParams(layoutParams2);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
        }
        ((ImageView) iDdS501S0100000_8.l0).setImageBitmap(bitmap);
    }

    public static final void LIZIZ$3(IDdS501S0100000_8 iDdS501S0100000_8, Bitmap bitmap) {
        C73044Slc c73044Slc = (C73044Slc) ((View) iDdS501S0100000_8.l0).findViewById(R.id.hst);
        if (c73044Slc == null) {
            return;
        }
        c73044Slc.setCoverImage(bitmap);
    }

    public static final void LIZIZ$4(IDdS501S0100000_8 iDdS501S0100000_8, Bitmap bitmap) {
        C73044Slc c73044Slc;
        View view = (View) iDdS501S0100000_8.l0;
        if (view == null || (c73044Slc = (C73044Slc) view.findViewById(R.id.hst)) == null) {
            return;
        }
        c73044Slc.setCoverImage(bitmap);
    }

    public static final void onFailed$2(IDdS501S0100000_8 iDdS501S0100000_8, Throwable th) {
        ((ImageView) iDdS501S0100000_8.l0).setImageBitmap(null);
    }
}
