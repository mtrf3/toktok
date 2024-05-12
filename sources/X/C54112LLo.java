package X;

import Y.AUListenerS90S0100000_1;
import Y.IDTListenerS118S0100000_9;
import android.animation.ValueAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.LLo, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public class C54112LLo extends AbstractC54111LLn {
    public ValueAnimator LJIIL;
    public ValueAnimator LJIILIIL;
    public final C62822Ol8 LJIILJJIL;
    public final C62822Ol8 LJIILL;

    @Override // X.AbstractC54111LLn
    public final void LJIILLIIL() {
    }

    @Override // X.AbstractC54111LLn
    public final void LJJI() {
    }

    @Override // X.AbstractC54111LLn
    public ImageView LJ() {
        ImageView imageView = new ImageView(this.LIZ.getContext());
        imageView.setImageDrawable(this.LIZJ.LIZLLL(R.drawable.aw6, this.LIZ.getContext()));
        int LJJIIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(8));
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(LJJIIZ, LJJIIZ);
        layoutParams.setMargins(O6R.LJJIIZ(C32151Nz.LJIIZILJ(16)), O6R.LJJIIZ(C32151Nz.LJIIZILJ(4)), 0, 0);
        layoutParams.setMarginStart(O6R.LJJIIZ(C32151Nz.LJIIZILJ(16)));
        layoutParams.gravity = 49;
        imageView.setLayoutParams(layoutParams);
        return imageView;
    }

    @Override // X.AbstractC54111LLn
    public final ImageView LJFF() {
        ImageView imageView = new ImageView(this.LIZ.getContext());
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        int LJJIIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(36));
        if (C34051DXz.LIZ() && !DY1.LIZ()) {
            LJJIIZ = C7MY.LIZIZ(30);
        }
        int LIZ = C47135Ieh.LIZ(10, LJJIIZ);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(LIZ, LIZ);
        layoutParams.gravity = 49;
        imageView.setLayoutParams(layoutParams);
        C26338AVi.LJI(imageView, 0, AnonymousClass391.LIZJ(5), 0, 0, false, 16);
        imageView.setId(R.id.f80);
        return imageView;
    }

    @Override // X.AbstractC54111LLn
    public ImageView LJI() {
        ImageView imageView = new ImageView(this.LIZ.getContext());
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        int LJJIIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(36));
        if (C34051DXz.LIZ() && !DY1.LIZ()) {
            LJJIIZ = C7MY.LIZIZ(30);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(LJJIIZ, LJJIIZ);
        layoutParams.gravity = 49;
        imageView.setLayoutParams(layoutParams);
        return imageView;
    }

    @Override // X.AbstractC54111LLn
    public final ImageView LJII() {
        ImageView imageView = new ImageView(this.LIZ.getContext());
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setImageDrawable(this.LIZJ.LIZLLL(R.drawable.aw2, this.LIZ.getContext()));
        int LJJIIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(36));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(LJJIIZ, LJJIIZ);
        layoutParams.gravity = 49;
        imageView.setLayoutParams(layoutParams);
        return imageView;
    }

    @Override // X.AbstractC54111LLn
    public TuxTextView LJIIIIZZ() {
        Context context = this.LIZ.getContext();
        o.LJIIIIZZ(context, "materialIconTab.context");
        TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
        tuxTextView.setTuxFont(LJIILIIL(false));
        tuxTextView.setTextColor(C04330Ez.LIZIZ(this.LIZ.getContext(), R.color.bd));
        tuxTextView.setLetterSpacing(0.01f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 81;
        layoutParams.bottomMargin = C7MY.LIZIZ(4);
        tuxTextView.setLayoutParams(layoutParams);
        tuxTextView.setGravity(17);
        tuxTextView.setSingleLine(true);
        tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
        tuxTextView.setText(this.LIZLLL.LIZJ);
        return tuxTextView;
    }

    @Override // X.AbstractC54111LLn
    public final View LJIIL() {
        return this.LIZ.getCustomizedNoticeUI();
    }

    @Override // X.AbstractC54111LLn
    public final void LJIILL() {
        if (LJJII(LH5.SELECT, this.LIZIZ, false)) {
            LJJIII();
        }
    }

    @Override // X.AbstractC54111LLn
    public final void LJIIZILJ() {
        if (LJJII(LH5.UNSELECT, this.LIZIZ, false)) {
            LJJIII();
        }
    }

    public TextView LJJIIJ() {
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
        Integer LJI = C79045V0n.LJI(R.attr.dj, context2);
        if (LJI != null) {
            tuxTextView.setTextColor(LJI.intValue());
        }
        tuxTextView.setPadding(C7MY.LIZIZ(5), 0, O6R.LJJIIZ(C32151Nz.LJIIZILJ(5)), 0);
        tuxTextView.setTuxFont(72);
        tuxTextView.setMinWidth(O6R.LJJIIZ(C32151Nz.LJIIZILJ(16)));
        tuxTextView.setMinHeight(O6R.LJJIIZ(C32151Nz.LJIIZILJ(16)));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(C7MY.LIZIZ(13), O6R.LJJIIZ(C32151Nz.LJIIZILJ(2)), 0, 0);
        layoutParams.setMarginStart(O6R.LJJIIZ(C32151Nz.LJIIZILJ(13)));
        layoutParams.gravity = 49;
        tuxTextView.setLayoutParams(layoutParams);
        return tuxTextView;
    }

    @Override // X.AbstractC54111LLn
    public void LJJIII() {
        C53986LGs c53986LGs;
        int i;
        LJIIIZ();
        LJIIJJI();
        Context context = this.LIZ.getContext();
        o.LJIIIIZZ(context, "materialIconTab.context");
        boolean LJIILJJIL = AnonymousClass636.LJIILJJIL(context);
        if (C19N.LJ("bottom_tab_icon_dark_mode_settings", true) && LJIILJJIL) {
            LH6 lh6 = this.LIZLLL.LIZLLL;
            if (LJIILJJIL()) {
                c53986LGs = lh6.LIZIZ;
            } else {
                c53986LGs = lh6.LIZLLL;
            }
        } else {
            LH6 lh62 = this.LIZLLL.LIZLLL;
            if (this.LIZIZ == L7P.DARK) {
                if (LJIILJJIL()) {
                    c53986LGs = lh62.LIZIZ;
                } else {
                    c53986LGs = lh62.LIZLLL;
                }
            } else if (LJIILJJIL()) {
                c53986LGs = lh62.LIZ;
            } else {
                c53986LGs = lh62.LIZJ;
            }
        }
        C54113LLp c54113LLp = this.LIZ;
        c54113LLp.setTabIconImageDrawable(this.LIZJ.LIZLLL(c53986LGs.LJLIL, c54113LLp.getContext()));
        Context context2 = c54113LLp.getContext();
        o.LJIIIIZZ(context2, "context");
        Integer LJI = C79045V0n.LJI(c53986LGs.LJLILLLLZI, context2);
        if (LJI != null) {
            i = LJI.intValue();
        } else {
            i = 0;
        }
        c54113LLp.setTitleTextColor(i);
        c54113LLp.setTitleTuxFont(LJIILIIL(LJIILJJIL()));
        TuxTextView tabTitleView = c54113LLp.getTabTitleView();
        if (tabTitleView != null && tabTitleView.getText().toString().length() > 16 && tabTitleView.getPaint().measureText(tabTitleView.getText().toString()) > 230.0f) {
            tabTitleView.setTextSize(1, 8.0f);
        }
    }

    @Override // X.AbstractC54111LLn
    public final void LJIJJ() {
        LJJIII();
    }

    public C54112LLo(C54113LLp c54113LLp) {
        super(c54113LLp);
        C62822Ol8 LIZIZ = C221108m2.LIZIZ(C54107LLj.LJLIL);
        this.LJIILJJIL = LIZIZ;
        C62822Ol8 LIZIZ2 = C221108m2.LIZIZ(C54106LLi.LJLIL);
        this.LJIILL = LIZIZ2;
        LJIIIZ();
        LH4 lh4 = this.LIZLLL;
        if (LJJII(lh4.LJFF, lh4.LJ, true)) {
            LJJIII();
        }
        if (((Boolean) LIZIZ2.getValue()).booleanValue() || ((Boolean) LIZIZ.getValue()).booleanValue()) {
            c54113LLp.setTouchListener(new IDTListenerS118S0100000_9(this, 11));
        }
    }

    @Override // X.AbstractC54111LLn
    public final void LIZ(InterfaceC88472Yns<? super Context, ? extends View> viewCreateLogic) {
        o.LJIIIZ(viewCreateLogic, "viewCreateLogic");
        C54113LLp c54113LLp = this.LIZ;
        c54113LLp.getClass();
        if (c54113LLp.LJLLI == null) {
            Context context = c54113LLp.getContext();
            o.LJIIIIZZ(context, "context");
            View invoke = viewCreateLogic.invoke(context);
            c54113LLp.addView(invoke);
            c54113LLp.LJLLI = invoke;
        }
    }

    @Override // X.AbstractC54111LLn
    public final void LJIL(L7P tabBackgroundStyle) {
        o.LJIIIZ(tabBackgroundStyle, "tabBackgroundStyle");
        if (LJJII(this.LJ, tabBackgroundStyle, true)) {
            LJJIII();
        }
    }

    @Override // X.AbstractC54111LLn
    public final void LIZJ(int i, boolean z) {
        String valueOf;
        TextView textView;
        TextView textView2;
        if (!o.LJ(this.LIZLLL.LIZIZ, "NOTIFICATION") && !o.LJ(this.LIZLLL.LIZIZ, "FRIENDS_TAB") && !o.LJ(this.LIZLLL.LIZIZ, "USER") && !o.LJ(this.LIZLLL.LIZIZ, "SHOP_MALL") && !o.LJ(this.LIZLLL.LIZIZ, "FASHION_MALL") && !o.LJ(this.LIZLLL.LIZIZ, "Following")) {
            return;
        }
        if (o.LJ(this.LIZLLL.LIZIZ, "USER") && !C54305LSz.LJ()) {
            return;
        }
        boolean z2 = true;
        if (!this.LJIIJJI) {
            TextView LJJIIJ = LJJIIJ();
            if (LJJIIJ != null) {
                C54113LLp c54113LLp = this.LIZ;
                c54113LLp.getClass();
                c54113LLp.LJLJL = LJJIIJ;
                if (c54113LLp.LJLLJ) {
                    LJJIIJ.setAlpha(0.0f);
                }
                c54113LLp.addView(c54113LLp.LJLJL);
                TextView textView3 = c54113LLp.LJLJL;
                if (textView3 != null) {
                    textView3.bringToFront();
                }
            }
            this.LJIIJJI = true;
        }
        if (i <= 0) {
            this.LIZ.setCountDotVisibility(8);
            this.LJI = 0;
            return;
        }
        if (o.LJ(this.LIZLLL.LIZIZ, "FRIENDS_TAB") || o.LJ(this.LIZLLL.LIZIZ, "Following")) {
            if (i > 99) {
                valueOf = "99";
            } else {
                valueOf = String.valueOf(i);
            }
        } else if (o.LJ(this.LIZLLL.LIZIZ, "USER")) {
            if (i > 9) {
                if (C90193gN.LIZ()) {
                    valueOf = "+9";
                } else {
                    valueOf = "9+";
                }
            } else {
                valueOf = String.valueOf(i);
            }
        } else if (i > 99) {
            if (C90193gN.LIZ()) {
                valueOf = "+99";
            } else {
                valueOf = "99+";
            }
        } else {
            valueOf = String.valueOf(i);
        }
        if (!z || ((textView2 = this.LIZ.LJLJL) != null && textView2.getVisibility() == 0)) {
            z2 = false;
        }
        C54113LLp c54113LLp2 = this.LIZ;
        c54113LLp2.setCountDotVisibility(0);
        c54113LLp2.setCountDotText(valueOf);
        if (z2 && (textView = c54113LLp2.LJLJL) != null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.setInterpolator(C55953Lxd.LJII());
            ofFloat.setDuration(300L);
            ofFloat.addUpdateListener(new AUListenerS90S0100000_1(textView, 79));
            ofFloat.start();
        }
        this.LJI = i;
    }

    @Override // X.AbstractC54111LLn
    public final boolean LJJII(LH5 tabStatus, L7P backgroundStyle, boolean z) {
        o.LJIIIZ(tabStatus, "tabStatus");
        o.LJIIIZ(backgroundStyle, "backgroundStyle");
        if (this.LJ == tabStatus && this.LIZIZ == backgroundStyle && !z) {
            return false;
        }
        if (z) {
            LJJ(tabStatus);
            z = true;
        }
        if (o.LJ(this.LIZLLL.LIZIZ, "HOME")) {
            this.LIZIZ = backgroundStyle;
        } else if (this.LIZIZ != backgroundStyle) {
            this.LIZIZ = backgroundStyle;
            if (LJIILJJIL()) {
                return true;
            }
        }
        return z;
    }
}
