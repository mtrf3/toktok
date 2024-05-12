package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.LLg, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54104LLg extends C54114LLq {
    @Override // X.C54114LLq, X.AbstractC54111LLn
    public final int LJIILIIL(boolean z) {
        return 92;
    }

    public static boolean LJJIJL() {
        LFH.LIZIZ.LIZLLL().LJIIZILJ();
        LEZ.LJFF();
        return false;
    }

    @Override // X.C54114LLq, X.AbstractC54111LLn
    public final ImageView LJFF() {
        ImageView imageView = new ImageView(this.LIZ.getContext());
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setLayoutParams(LJJIJIL());
        return imageView;
    }

    @Override // X.C54114LLq, X.AbstractC54111LLn
    public final ImageView LJI() {
        ImageView imageView = new ImageView(this.LIZ.getContext());
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setLayoutParams(LJJIJIL());
        return imageView;
    }

    public static FrameLayout.LayoutParams LJJIJIL() {
        LJJIJL();
        int LJJIIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(Double.valueOf(37.5d)));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(LJJIIZ, LJJIIZ);
        layoutParams.gravity = 49;
        return layoutParams;
    }

    @Override // X.C54114LLq, X.AbstractC54111LLn
    public final TuxTextView LJIIIIZZ() {
        LJJIJL();
        return null;
    }

    @Override // X.C54114LLq
    public final boolean LJJIIJ() {
        LJJIJL();
        return false;
    }

    @Override // X.C54114LLq
    public final FrameLayout.LayoutParams LJJIIZ() {
        return LJJIJIL();
    }

    @Override // X.C54114LLq
    public final FrameLayout.LayoutParams LJJIJIIJI() {
        return LJJIJIL();
    }

    @Override // X.C54114LLq
    public final ImageView.ScaleType LJJIIZI() {
        return ImageView.ScaleType.FIT_CENTER;
    }

    @Override // X.C54114LLq
    public final ImageView.ScaleType LJJIJIIJIL() {
        return ImageView.ScaleType.FIT_CENTER;
    }

    public C54104LLg(C54113LLp c54113LLp) {
        super(c54113LLp);
    }

    @Override // X.C54114LLq
    public final Drawable LJJIIJZLJL(L7P backgroundStyle) {
        int i;
        o.LJIIIZ(backgroundStyle, "backgroundStyle");
        if (backgroundStyle == L7P.LIGHT) {
            i = R.raw.icon_color_create_dark;
        } else {
            i = R.raw.icon_color_create_light;
        }
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZ = i;
        Context context = this.LIZ.getContext();
        o.LJIIIIZZ(context, "materialIconTab.context");
        return c2068389v.LIZ(context);
    }

    @Override // X.C54114LLq
    public final Drawable LJJIJ(L7P backgroundStyle) {
        int i;
        o.LJIIIZ(backgroundStyle, "backgroundStyle");
        if (backgroundStyle == L7P.LIGHT) {
            i = R.raw.icon_color_create_dark;
        } else {
            i = R.raw.icon_color_create_light;
        }
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZ = i;
        Context context = this.LIZ.getContext();
        o.LJIIIIZZ(context, "materialIconTab.context");
        return c2068389v.LIZ(context);
    }
}
