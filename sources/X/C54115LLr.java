package X;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.LLr, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54115LLr extends C54112LLo {
    @Override // X.AbstractC54111LLn
    public final int LJIILIIL(boolean z) {
        return 92;
    }

    @Override // X.C54112LLo, X.AbstractC54111LLn
    public final ImageView LJ() {
        ImageView imageView = new ImageView(this.LIZ.getContext());
        imageView.setImageDrawable(this.LIZJ.LIZLLL(R.drawable.aw6, this.LIZ.getContext()));
        int LJJIIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(8));
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(LJJIIZ, LJJIIZ);
        layoutParams.setMargins(O6R.LJJIIZ(C32151Nz.LJIIZILJ(16)), O6R.LJJIIZ(C32151Nz.LJIIZILJ(2)), 0, 0);
        layoutParams.setMarginStart(O6R.LJJIIZ(C32151Nz.LJIIZILJ(16)));
        layoutParams.gravity = 49;
        imageView.setLayoutParams(layoutParams);
        return imageView;
    }

    @Override // X.C54112LLo, X.AbstractC54111LLn
    public final ImageView LJI() {
        ImageView imageView = new ImageView(this.LIZ.getContext());
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        int LJJIIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(30));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(LJJIIZ, LJJIIZ);
        layoutParams.gravity = 49;
        imageView.setLayoutParams(layoutParams);
        return imageView;
    }

    @Override // X.C54112LLo, X.AbstractC54111LLn
    public final TuxTextView LJIIIIZZ() {
        Context context = this.LIZ.getContext();
        o.LJIIIIZZ(context, "materialIconTab.context");
        TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
        tuxTextView.setTuxFont(92);
        tuxTextView.setTextColor(C04330Ez.LIZIZ(this.LIZ.getContext(), R.color.bd));
        tuxTextView.setLetterSpacing(0.01f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 49;
        layoutParams.leftMargin = O6R.LJJIIZ(C32151Nz.LJIIZILJ(3));
        layoutParams.rightMargin = O6R.LJJIIZ(C32151Nz.LJIIZILJ(3));
        layoutParams.topMargin = C7MY.LIZIZ(30);
        tuxTextView.setLayoutParams(layoutParams);
        tuxTextView.setGravity(17);
        tuxTextView.setMaxLines(2);
        tuxTextView.setText(this.LIZLLL.LIZJ);
        return tuxTextView;
    }

    @Override // X.C54112LLo
    public final TextView LJJIIJ() {
        Context context = this.LIZ.getContext();
        o.LJIIIIZZ(context, "materialIconTab.context");
        TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
        tuxTextView.setBackground(this.LIZJ.LIZLLL(R.drawable.avd, tuxTextView.getContext()));
        tuxTextView.setClickable(false);
        tuxTextView.setGravity(17);
        tuxTextView.setLines(1);
        tuxTextView.setTextSize(1, 12.0f);
        Context context2 = tuxTextView.getContext();
        o.LJIIIIZZ(context2, "context");
        tuxTextView.setTextColor(AnonymousClass636.LJIIIIZZ(R.attr.cl, context2));
        tuxTextView.setPadding(O6R.LJJIIZ(C32151Nz.LJIIZILJ(5)), 0, O6R.LJJIIZ(C32151Nz.LJIIZILJ(5)), 0);
        tuxTextView.setTuxFont(72);
        tuxTextView.setMinWidth(O6R.LJJIIZ(C32151Nz.LJIIZILJ(16)));
        tuxTextView.setMinHeight(O6R.LJJIIZ(C32151Nz.LJIIZILJ(16)));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.setMarginStart(O6R.LJJIIZ(C32151Nz.LJIIZILJ(13)));
        layoutParams.gravity = 49;
        tuxTextView.setLayoutParams(layoutParams);
        return tuxTextView;
    }

    public C54115LLr(C54113LLp c54113LLp) {
        super(c54113LLp);
    }
}
