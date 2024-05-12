package X;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.59M, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C59M {
    public final ViewGroup LIZ;
    public ImageView LIZIZ;
    public final Drawable LIZJ;
    public final Drawable LIZLLL;
    public final Drawable LJ;
    public TextView LJFF;
    public TextView LJI;
    public TextView LJII;
    public final LinearLayout LJIIIIZZ;
    public final float LJIIIZ;
    public final Typeface LJIIJ;
    public final int LJIIJJI;
    public final RelativeLayout.LayoutParams LJIIL;
    public final ViewGroup.MarginLayoutParams LJIILIIL;
    public final ViewGroup.MarginLayoutParams LJIILJJIL;
    public final ViewGroup.MarginLayoutParams LJIILL;
    public final LinearLayout.LayoutParams LJIILLIIL;
    public int LJIIZILJ;
    public int LJIJ;
    public final int LJIJI;

    public final void LIZIZ() {
        TextView textView = this.LJFF;
        if (textView != null) {
            this.LJIIL.width = this.LJIJ;
            C16880lQ.LJZI(this.LJIIIIZZ, textView);
            LIZJ();
        }
    }

    public final void LIZJ() {
        C2ND.LIZ(new AqS152S0100000_2(this, 1079), 0L);
    }

    public final void LIZLLL() {
        int childCount;
        if (this.LJFF == null) {
            TextView textView = new TextView(this.LIZ.getContext());
            this.LJFF = textView;
            textView.setTextColor(textView.getResources().getColor(R.color.bd));
            textView.setBackground(LIZ());
            textView.setTextSize(1, this.LJIIIZ);
            textView.setGravity(17);
            V2B.LJIILL(textView, C134845Qy.LIZ(4.0f), 0, C134845Qy.LIZ(4.0f), 0);
            textView.setCompoundDrawablePadding(C134845Qy.LIZ(2.0f));
            textView.setMaxLines(1);
            textView.setTypeface(this.LJIIJ);
            textView.requestLayout();
        }
        TextView textView2 = this.LJFF;
        if (textView2 != null) {
            this.LJIIL.width = this.LJIJ;
            C16880lQ.LJZI(this.LJIIIIZZ, textView2);
            ImageView imageView = this.LIZIZ;
            if (imageView != null) {
                childCount = this.LJIIIIZZ.indexOfChild(imageView);
            } else {
                childCount = this.LJIIIIZZ.getChildCount();
            }
            this.LJIIIIZZ.addView(textView2, childCount, this.LJIILL);
            LIZJ();
        }
    }

    public final Drawable LIZ() {
        Drawable invoke = C1291054w.LJ().LJJIL.invoke();
        if (invoke == null) {
            Drawable drawable = this.LIZ.getContext().getResources().getDrawable(R.drawable.a7u);
            o.LJIIIIZZ(drawable, "mContainer.context.resources.getDrawable(resId)");
            return drawable;
        }
        return invoke;
    }

    public C59M(ViewGroup container, ViewGroup viewGroup) {
        int dimensionPixelSize;
        float f;
        o.LJIIIZ(container, "container");
        this.LIZ = container;
        this.LJ = C1291054w.LJ().LJJIIJ;
        LinearLayout linearLayout = new LinearLayout(container.getContext());
        this.LJIIIIZZ = linearLayout;
        this.LJIIJ = C1291054w.LJ().LJJJI;
        this.LJIIJJI = C134845Qy.LIZ(2.0f);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        this.LJIIL = layoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(C134845Qy.LIZ(20.0f), C134845Qy.LIZ(18.0f));
        this.LJIILIIL = marginLayoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams2 = new ViewGroup.MarginLayoutParams(-2, -2);
        marginLayoutParams2.setMarginStart(10);
        this.LJIILJJIL = marginLayoutParams2;
        ViewGroup.MarginLayoutParams marginLayoutParams3 = new ViewGroup.MarginLayoutParams(-2, -2);
        this.LJIILL = marginLayoutParams3;
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        this.LJIILLIIL = layoutParams2;
        linearLayout.setOrientation(0);
        layoutParams.topMargin = C134845Qy.LIZ(7.0f);
        layoutParams.addRule(18, viewGroup.getId());
        linearLayout.setLayoutParams(layoutParams);
        container.addView(linearLayout, layoutParams);
        marginLayoutParams3.setMarginStart(C134845Qy.LIZ(4.0f));
        marginLayoutParams.setMarginStart(C134845Qy.LIZ(4.0f));
        layoutParams2.setMarginStart(C134845Qy.LIZ(4.0f));
        C58G LJ = C1291054w.LJ();
        Float f2 = LJ.LJJIJLIJ;
        if (f2 != null) {
            dimensionPixelSize = C134845Qy.LIZ(f2.floatValue());
        } else {
            dimensionPixelSize = container.getResources().getDimensionPixelSize(R.dimen.a8p);
        }
        this.LJIJI = dimensionPixelSize;
        layoutParams2.height = dimensionPixelSize;
        marginLayoutParams.height = dimensionPixelSize;
        marginLayoutParams3.height = dimensionPixelSize;
        Float f3 = LJ.LJJIJL;
        if (f3 != null) {
            f = f3.floatValue();
        } else {
            f = 8.0f;
        }
        this.LJIIIZ = f;
        Drawable drawable = LJ.LJJIJIIJIL;
        if (drawable == null) {
            drawable = container.getContext().getResources().getDrawable(R.drawable.o7);
            o.LJIIIIZZ(drawable, "mContainer.context.resources.getDrawable(resId)");
        }
        this.LIZJ = drawable;
        Drawable drawable2 = LJ.LJJIII;
        this.LIZLLL = drawable2 == null ? null : drawable2;
    }

    public final void LJ(int i, String text) {
        Context context;
        TextView textView;
        o.LJIIIZ(text, "text");
        LIZLLL();
        if (!TextUtils.isEmpty(text) && (textView = this.LJFF) != null) {
            textView.setText(text);
        }
        if (i != 0) {
            TextView textView2 = this.LJFF;
            if (textView2 != null) {
                context = textView2.getContext();
            } else {
                context = null;
            }
            if (C68E.LIZ(context)) {
                TextView textView3 = this.LJFF;
                if (textView3 != null) {
                    textView3.setCompoundDrawablesWithIntrinsicBounds(0, 0, i, 0);
                    return;
                }
                return;
            }
            TextView textView4 = this.LJFF;
            if (textView4 == null) {
                return;
            }
            textView4.setCompoundDrawablesWithIntrinsicBounds(i, 0, 0, 0);
        }
    }
}
