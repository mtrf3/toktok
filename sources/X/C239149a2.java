package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.9a2, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C239149a2 extends FrameLayout {
    public ImageView LJLIL;
    public C74282TDi LJLILLLLZI;
    public TuxTextView LJLJI;
    public boolean LJLJJI;

    public final void LIZIZ() {
        this.LJLJJI = false;
        LIZ();
        getPercentage().setText("");
        getCircleProgressView().setProgress(0);
    }

    public final void LIZJ() {
        this.LJLJJI = true;
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZ = R.raw.icon_arrow_clockwise_clock;
        c2068389v.LJ = Integer.valueOf(R.attr.dj);
        c2068389v.LIZIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(20));
        c2068389v.LIZJ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(20));
        Context context = getContext();
        o.LJIIIIZZ(context, "context");
        SY9 LIZ = c2068389v.LIZ(context);
        C110614Vt c110614Vt = new C110614Vt();
        c110614Vt.LIZIZ = Integer.valueOf(R.attr.d8);
        c110614Vt.LIZJ = Float.valueOf(C32151Nz.LJIIZILJ(34));
        c110614Vt.LJII = O6R.LJJIIZ(C32151Nz.LJIIZILJ(34));
        c110614Vt.LJI = O6R.LJJIIZ(C32151Nz.LJIIZILJ(34));
        Context context2 = getContext();
        o.LJIIIIZZ(context2, "context");
        getImageView().setImageDrawable(C26338AVi.LJIIJ(LIZ, c110614Vt.LIZ(context2)));
        getPercentage().setText("");
        getCircleProgressView().setProgress(0);
    }

    public final void LIZ() {
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZ = R.raw.icon_arrow_down_to_line;
        c2068389v.LJ = Integer.valueOf(R.attr.dj);
        c2068389v.LIZIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(18));
        c2068389v.LIZJ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(18));
        Context context = getContext();
        o.LJIIIIZZ(context, "context");
        SY9 LIZ = c2068389v.LIZ(context);
        C110614Vt c110614Vt = new C110614Vt();
        c110614Vt.LIZIZ = Integer.valueOf(R.attr.d8);
        c110614Vt.LIZJ = Float.valueOf(C32151Nz.LJIIZILJ(34));
        c110614Vt.LJII = O6R.LJJIIZ(C32151Nz.LJIIZILJ(34));
        c110614Vt.LJI = O6R.LJJIIZ(C32151Nz.LJIIZILJ(34));
        c110614Vt.LIZLLL = AnonymousClass391.LIZJ(1);
        c110614Vt.LJFF = Integer.valueOf(R.attr.dh);
        Context context2 = getContext();
        o.LJIIIIZZ(context2, "context");
        getImageView().setImageDrawable(C26338AVi.LJIIJ(LIZ, c110614Vt.LIZ(context2)));
    }

    public final C74282TDi getCircleProgressView() {
        C74282TDi c74282TDi = this.LJLILLLLZI;
        if (c74282TDi != null) {
            return c74282TDi;
        }
        o.LJIJI("circleProgressView");
        throw null;
    }

    public final ImageView getImageView() {
        ImageView imageView = this.LJLIL;
        if (imageView != null) {
            return imageView;
        }
        o.LJIJI("imageView");
        throw null;
    }

    public final TuxTextView getPercentage() {
        TuxTextView tuxTextView = this.LJLJI;
        if (tuxTextView != null) {
            return tuxTextView;
        }
        o.LJIJI("percentage");
        throw null;
    }

    public final boolean getShowingScheduledImage() {
        return this.LJLJJI;
    }

    public final void setCircleProgressView(C74282TDi c74282TDi) {
        o.LJIIIZ(c74282TDi, "<set-?>");
        this.LJLILLLLZI = c74282TDi;
    }

    public final void setImageView(ImageView imageView) {
        o.LJIIIZ(imageView, "<set-?>");
        this.LJLIL = imageView;
    }

    public final void setPause(int i) {
        this.LJLJJI = false;
        getCircleProgressView().setProgress(i);
        getPercentage().setText("");
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZ = R.raw.icon_arrow_down_to_line;
        c2068389v.LJ = Integer.valueOf(R.attr.dj);
        c2068389v.LIZIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(14));
        c2068389v.LIZJ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(14));
        Context context = getContext();
        o.LJIIIIZZ(context, "context");
        SY9 LIZ = c2068389v.LIZ(context);
        C110614Vt c110614Vt = new C110614Vt();
        c110614Vt.LIZIZ = Integer.valueOf(R.attr.d8);
        c110614Vt.LIZJ = Float.valueOf(C32151Nz.LJIIZILJ(34));
        c110614Vt.LJII = O6R.LJJIIZ(C32151Nz.LJIIZILJ(34));
        c110614Vt.LJI = O6R.LJJIIZ(C32151Nz.LJIIZILJ(34));
        Context context2 = getContext();
        o.LJIIIIZZ(context2, "context");
        getImageView().setImageDrawable(C26338AVi.LJIIJ(LIZ, c110614Vt.LIZ(context2)));
    }

    public final void setPercentage(TuxTextView tuxTextView) {
        o.LJIIIZ(tuxTextView, "<set-?>");
        this.LJLJI = tuxTextView;
    }

    public final void setProgress(int i) {
        this.LJLJJI = false;
        getCircleProgressView().setProgress(i);
        TuxTextView percentage = getPercentage();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(i);
        LIZ.append('%');
        percentage.setText(X1D.LIZIZ(LIZ));
        C110614Vt c110614Vt = new C110614Vt();
        c110614Vt.LIZIZ = Integer.valueOf(R.attr.d8);
        c110614Vt.LIZJ = Float.valueOf(C32151Nz.LJIIZILJ(34));
        c110614Vt.LJII = O6R.LJJIIZ(C32151Nz.LJIIZILJ(34));
        c110614Vt.LJI = O6R.LJJIIZ(C32151Nz.LJIIZILJ(34));
        Context context = getContext();
        o.LJIIIIZZ(context, "context");
        getImageView().setImageDrawable(c110614Vt.LIZ(context));
    }

    public final void setShowingScheduledImage(boolean z) {
        this.LJLJJI = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C239149a2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a1.LJFF(context, "context");
        C16880lQ.LLLLIILL(C16880lQ.LLZIL(getContext()), R.layout.bp3, this, true);
        View findViewById = findViewById(R.id.cfs);
        o.LJIIIIZZ(findViewById, "findViewById<ImageView>(R.id.download_icon)");
        setImageView((ImageView) findViewById);
        LIZ();
        View findViewById2 = findViewById(R.id.g7r);
        o.LJIIIIZZ(findViewById2, "findViewById<CircleProgressView>(R.id.loading)");
        setCircleProgressView((C74282TDi) findViewById2);
        View findViewById3 = findViewById(R.id.hlf);
        o.LJIIIIZZ(findViewById3, "findViewById<TuxTextView>(R.id.percent)");
        setPercentage((TuxTextView) findViewById3);
        getCircleProgressView().setProgress(0);
        getCircleProgressView().setMaxProgress(100);
        getCircleProgressView().setBgCircleColor(-1);
        getCircleProgressView().setProgressColor(-1);
        getCircleProgressView().setCircleWidth(C15380j0.LIZ(4.0f));
        getCircleProgressView().setBgCircleWidth(C15380j0.LIZ(4.0f));
    }
}
