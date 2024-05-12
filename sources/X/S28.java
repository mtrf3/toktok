package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class S28 extends LinearLayout {
    public final TuxTextView LJLIL;
    public final TuxTextView LJLILLLLZI;
    public final TuxTextView LJLJI;
    public boolean LJLJJI;

    public final void LIZ() {
        View view = this.LJLIL;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 80;
        layoutParams.setMarginEnd(getContext().getResources().getDimensionPixelOffset(R.dimen.p2));
        addView(view, layoutParams);
    }

    public final void setColor(ColorStateList colorStateList) {
        o.LJIIIZ(colorStateList, "colorStateList");
        this.LJLIL.setTextColor(colorStateList);
        this.LJLILLLLZI.setTextColor(colorStateList);
        this.LJLJI.setTextColor(colorStateList);
    }

    public final void setColorRes(int i) {
        this.LJLIL.setTextColorRes(i);
        this.LJLILLLLZI.setTextColorRes(i);
        this.LJLJI.setTextColorRes(i);
    }

    public final void setCurrencyShowLeft(boolean z) {
        if (C90193gN.LIZIZ(getContext())) {
            if (!z) {
                z = true;
            } else {
                z = false;
            }
        }
        if (z != this.LJLJJI) {
            this.LJLJJI = z;
            removeAllViews();
            if (this.LJLJJI) {
                LIZ();
                View view = this.LJLILLLLZI;
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                layoutParams.gravity = 80;
                addView(view, layoutParams);
                View view2 = this.LJLJI;
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                layoutParams2.gravity = 80;
                addView(view2, layoutParams2);
                return;
            }
            LIZ();
            View view3 = this.LJLJI;
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams3.gravity = 80;
            addView(view3, layoutParams3);
            View view4 = this.LJLILLLLZI;
            LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams4.gravity = 80;
            addView(view4, layoutParams4);
        }
    }

    public final void setCurrencyText(String text) {
        o.LJIIIZ(text, "text");
        this.LJLILLLLZI.setText(text);
    }

    public final void setPriceNumText(String text) {
        o.LJIIIZ(text, "text");
        this.LJLJI.setText(text);
    }

    public final void setPricePrefix(String prefix) {
        o.LJIIIZ(prefix, "prefix");
        this.LJLIL.setText(prefix);
    }

    public final void setPriceSize(int i) {
        ViewGroup.LayoutParams layoutParams = this.LJLILLLLZI.getLayoutParams();
        o.LJII(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
        ViewGroup.LayoutParams layoutParams3 = this.LJLIL.getLayoutParams();
        o.LJII(layoutParams3, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) layoutParams3;
        int i2 = layoutParams2.bottomMargin;
        int i3 = layoutParams4.bottomMargin;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            this.LJLJI.setTuxFont(62);
                            this.LJLILLLLZI.setTuxFont(92);
                            this.LJLIL.setTuxFont(92);
                            layoutParams2.bottomMargin = C79081V1x.LJII(1);
                            layoutParams4.bottomMargin = C79081V1x.LJII(1);
                        }
                    } else {
                        this.LJLJI.setTuxFont(42);
                        this.LJLILLLLZI.setTuxFont(82);
                        this.LJLIL.setTuxFont(82);
                        layoutParams2.bottomMargin = C79081V1x.LJII(1);
                        layoutParams4.bottomMargin = C79081V1x.LJII(1);
                    }
                } else {
                    this.LJLJI.setTuxFont(32);
                    this.LJLILLLLZI.setTuxFont(72);
                    this.LJLIL.setTuxFont(72);
                    layoutParams2.bottomMargin = C79081V1x.LJII(1);
                    layoutParams4.bottomMargin = C79081V1x.LJII(1);
                }
            } else {
                this.LJLJI.setTuxFont(22);
                this.LJLILLLLZI.setTuxFont(52);
                this.LJLIL.setTuxFont(52);
                layoutParams2.bottomMargin = C79081V1x.LJII(1);
                layoutParams4.bottomMargin = C79081V1x.LJII(1);
            }
        } else {
            this.LJLJI.setTuxFont(13);
            this.LJLILLLLZI.setTuxFont(33);
            this.LJLIL.setTuxFont(33);
            layoutParams2.bottomMargin = C79081V1x.LJII(2);
            layoutParams4.bottomMargin = C79081V1x.LJII(2);
        }
        if (i2 != layoutParams2.bottomMargin) {
            this.LJLILLLLZI.requestLayout();
        }
        if (i3 != layoutParams4.bottomMargin) {
            this.LJLIL.requestLayout();
        }
    }

    public final void setColor(int i) {
        this.LJLIL.setTextColor(i);
        this.LJLILLLLZI.setTextColor(i);
        this.LJLJI.setTextColor(i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S28(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        String LLLZLZ;
        String LLLZLZ2;
        a1.LJFF(context, "context");
        TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
        tuxTextView.setMaxLines(1);
        this.LJLIL = tuxTextView;
        TuxTextView tuxTextView2 = new TuxTextView(context, null, 6, 0);
        tuxTextView2.setMaxLines(1);
        this.LJLILLLLZI = tuxTextView2;
        TuxTextView tuxTextView3 = new TuxTextView(context, null, 6, 0);
        tuxTextView3.setMaxLines(1);
        tuxTextView3.setEllipsize(TextUtils.TruncateAt.END);
        tuxTextView3.setTextAlignment(5);
        tuxTextView3.setGravity(8388611);
        this.LJLJI = tuxTextView3;
        this.LJLJJI = true;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.a8l, R.attr.b5i, R.attr.b5j, R.attr.b5k, R.attr.b5l});
        o.LJIIIIZZ(obtainStyledAttributes, "context.obtainStyledAttr…R.styleable.NewPriceView)");
        this.LJLJJI = obtainStyledAttributes.getBoolean(0, true);
        if (C90193gN.LIZIZ(context)) {
            this.LJLJJI = !this.LJLJJI;
        }
        int i = obtainStyledAttributes.getInt(4, -1);
        ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(2);
        if (isInEditMode()) {
            LLLZLZ = "1999.999.000";
        } else {
            LLLZLZ = C16880lQ.LLLZLZ(obtainStyledAttributes, 1);
        }
        if (isInEditMode()) {
            LLLZLZ2 = "$";
        } else {
            LLLZLZ2 = C16880lQ.LLLZLZ(obtainStyledAttributes, 3);
        }
        String str = isInEditMode() ? "from" : null;
        obtainStyledAttributes.recycle();
        removeAllViews();
        if (this.LJLJJI) {
            LIZ();
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 80;
            addView(tuxTextView2, layoutParams);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams2.gravity = 80;
            addView(tuxTextView3, layoutParams2);
        } else {
            LIZ();
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams3.gravity = 80;
            addView(tuxTextView3, layoutParams3);
            LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams4.gravity = 80;
            addView(tuxTextView2, layoutParams4);
        }
        if (i >= 0) {
            setPriceSize(i);
        }
        if (colorStateList != null) {
            setColor(colorStateList);
        }
        if (LLLZLZ != null) {
            setPriceNumText(LLLZLZ);
        }
        if (LLLZLZ2 != null) {
            setCurrencyText(LLLZLZ2);
        }
        if (str != null) {
            setPricePrefix(str);
        }
    }
}
