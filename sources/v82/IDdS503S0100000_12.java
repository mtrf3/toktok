package v82;

import X.AbstractC85293Wj;
import X.C2068389v;
import X.C32151Nz;
import X.C38995FSd;
import X.C71884SJc;
import X.O6R;
import X.T9M;
import Y.ARunnableS31S0200000_12;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public class IDdS503S0100000_12 extends AbstractC85293Wj {
    public final int $t;
    public Object l0;

    public static final void onFailed$0(IDdS503S0100000_12 iDdS503S0100000_12, Throwable th) {
    }

    public static final void onFailed$1(IDdS503S0100000_12 iDdS503S0100000_12, Throwable th) {
    }

    public static final void onFailed$2(IDdS503S0100000_12 iDdS503S0100000_12, Throwable th) {
    }

    public static final void onFailed$4(IDdS503S0100000_12 iDdS503S0100000_12, Throwable th) {
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
            case 5:
                LIZIZ$5(this, bitmap);
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
            case 5:
                onFailed$5(this, th);
                return;
            default:
                super.onFailed(th);
                return;
        }
    }

    public IDdS503S0100000_12(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LIZIZ$0(IDdS503S0100000_12 iDdS503S0100000_12, Bitmap bitmap) {
        if (bitmap != null) {
            C38995FSd.LIZJ().execute(new ARunnableS31S0200000_12(bitmap, (View) iDdS503S0100000_12.l0, 8));
        }
    }

    public static final void LIZIZ$1(IDdS503S0100000_12 iDdS503S0100000_12, Bitmap bitmap) {
        if (bitmap != null) {
            C38995FSd.LIZJ().execute(new ARunnableS31S0200000_12(bitmap, (View) iDdS503S0100000_12.l0, 10));
        }
    }

    public static final void LIZIZ$2(IDdS503S0100000_12 iDdS503S0100000_12, Bitmap bitmap) {
        if (bitmap != null) {
            C38995FSd.LIZJ().execute(new ARunnableS31S0200000_12(bitmap, (View) iDdS503S0100000_12.l0, 12));
        }
    }

    public static final void LIZIZ$3(IDdS503S0100000_12 iDdS503S0100000_12, Bitmap bitmap) {
        C71884SJc c71884SJc = (C71884SJc) iDdS503S0100000_12.l0;
        c71884SJc.LJLJJI = bitmap;
        if (bitmap != null) {
            c71884SJc.updateBitmap("preview_image", bitmap);
        }
        C71884SJc c71884SJc2 = (C71884SJc) iDdS503S0100000_12.l0;
        c71884SJc2.LJLJI = true;
        c71884SJc2.play();
    }

    public static final void LIZIZ$4(IDdS503S0100000_12 iDdS503S0100000_12, Bitmap bitmap) {
        BitmapDrawable bitmapDrawable = new BitmapDrawable(bitmap);
        ((TuxIconView) iDdS503S0100000_12.l0).setBackground(null);
        ((TuxIconView) iDdS503S0100000_12.l0).setBackgroundDrawable(bitmapDrawable);
        T9M.LIZ.getClass();
        if (T9M.LIZ().largeIconHeight.length() == 0 || T9M.LIZ().largeIconWidth.length() == 0) {
            return;
        }
        Integer height = CastIntegerProtector.valueOf(T9M.LIZ().largeIconHeight);
        Integer width = CastIntegerProtector.valueOf(T9M.LIZ().largeIconWidth);
        TuxIconView tuxIconView = (TuxIconView) iDdS503S0100000_12.l0;
        o.LJIIIIZZ(width, "width");
        int LJJIIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(width));
        o.LJIIIIZZ(height, "height");
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(LJJIIZ, O6R.LJJIIZ(C32151Nz.LJIIZILJ(height)));
        layoutParams.gravity = 17;
        if (T9M.LIZ().spaceBetweenTextIcon.length() != 0) {
            Integer valueOf = CastIntegerProtector.valueOf(T9M.LIZ().spaceBetweenTextIcon);
            o.LJIIIIZZ(valueOf, "valueOf(BonusH5BannerDat…paceBetweenTextAndIcon())");
            layoutParams.setMargins(0, 0, valueOf.intValue(), 0);
        }
        tuxIconView.setLayoutParams(layoutParams);
    }

    public static final void LIZIZ$5(IDdS503S0100000_12 iDdS503S0100000_12, Bitmap bitmap) {
        BitmapDrawable bitmapDrawable = new BitmapDrawable(bitmap);
        ((TuxIconView) iDdS503S0100000_12.l0).setBackground(null);
        ((TuxIconView) iDdS503S0100000_12.l0).setBackgroundDrawable(bitmapDrawable);
        T9M.LIZ.getClass();
        if (T9M.LIZ().middleIconHeight.length() == 0 || T9M.LIZ().middleIconWidth.length() == 0) {
            return;
        }
        Integer height = CastIntegerProtector.valueOf(T9M.LIZ().middleIconHeight);
        Integer width = CastIntegerProtector.valueOf(T9M.LIZ().middleIconWidth);
        TuxIconView tuxIconView = (TuxIconView) iDdS503S0100000_12.l0;
        o.LJIIIIZZ(width, "width");
        int LJJIIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(width));
        o.LJIIIIZZ(height, "height");
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(LJJIIZ, O6R.LJJIIZ(C32151Nz.LJIIZILJ(height)));
        layoutParams.setMarginStart(O6R.LJJIIZ(C32151Nz.LJIIZILJ(20)));
        tuxIconView.setLayoutParams(layoutParams);
    }

    public static final void onFailed$3(IDdS503S0100000_12 iDdS503S0100000_12, Throwable th) {
        C71884SJc c71884SJc = (C71884SJc) iDdS503S0100000_12.l0;
        c71884SJc.LJLJI = true;
        c71884SJc.play();
    }

    public static final void onFailed$5(IDdS503S0100000_12 iDdS503S0100000_12, Throwable th) {
        TuxIconView tuxIconView = (TuxIconView) iDdS503S0100000_12.l0;
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZJ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(20));
        c2068389v.LIZIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(20));
        c2068389v.LIZ = R.raw.icon_effect_house;
        c2068389v.LJ = Integer.valueOf(R.attr.dj);
        tuxIconView.setTuxIcon(c2068389v);
    }
}
