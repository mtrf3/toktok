package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.o;

/* renamed from: X.9xt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C253939xt extends LinearLayout {
    public static final int LJLJJL = O6R.LJJIIZ(C32151Nz.LJIIZILJ(20));
    public final C62822Ol8 LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public final C62822Ol8 LJLJI;
    public final TuxIconView LJLJJI;

    private final TuxTextView getTextView() {
        return (TuxTextView) this.LJLIL.getValue();
    }

    public final AI8 getTextCell() {
        return (AI8) this.LJLILLLLZI.getValue();
    }

    public final AIF getTextCellAccessory() {
        return (AIF) this.LJLJI.getValue();
    }

    public final void setCellVisibility(boolean z) {
        int i;
        AI8 textCell = getTextCell();
        o.LJIIIIZZ(textCell, "textCell");
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        textCell.setVisibility(i);
    }

    public final void setViewVisibility(boolean z) {
        int i;
        TuxTextView textView = getTextView();
        o.LJIIIIZZ(textView, "textView");
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        textView.setVisibility(i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C253939xt(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        float dimension;
        float dimension2;
        a1.LJFF(context, "context");
        this.LJLIL = C221108m2.LIZIZ(new AqS154S0100000_4(this, 1252));
        this.LJLILLLLZI = C221108m2.LIZIZ(new AqS154S0100000_4(this, 1250));
        this.LJLJI = C221108m2.LIZIZ(new AqS154S0100000_4(this, 1251));
        TuxIconView tuxIconView = new TuxIconView(context, null, 0, 6, null);
        tuxIconView.setIconRes(R.raw.icon_ellipsis_horizontal);
        int i = LJLJJL;
        tuxIconView.setIconWidth(i);
        tuxIconView.setIconHeight(i);
        tuxIconView.setTintColor(R.attr.gv);
        this.LJLJJI = tuxIconView;
        C16880lQ.LLLZIIL(R.layout.lt, C16880lQ.LLZIL(context), this);
        setOrientation(1);
        AIF textCellAccessory = getTextCellAccessory();
        if (textCellAccessory != null) {
            textCellAccessory.LJIIL(tuxIconView);
            textCellAccessory.LJIILL(false);
        }
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.b_z});
        o.LJIIIIZZ(obtainStyledAttributes, "this.context.obtainStyle…trs, R.styleable.Account)");
        boolean z = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        if (z) {
            dimension = getResources().getDimension(R.dimen.ff);
        } else {
            dimension = getResources().getDimension(R.dimen.fe);
        }
        int i2 = (int) dimension;
        if (z) {
            dimension2 = getResources().getDimension(R.dimen.fd);
        } else {
            dimension2 = getResources().getDimension(R.dimen.fc);
        }
        ViewGroup.LayoutParams layoutParams = getTextView().getLayoutParams();
        o.LJII(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        ((ViewGroup.MarginLayoutParams) layoutParams).setMargins(0, i2, 0, (int) dimension2);
        getTextView().requestLayout();
    }

    public final void LIZ(boolean z, boolean z2) {
        int i;
        TuxTextView textView = getTextView();
        o.LJIIIIZZ(textView, "textView");
        int i2 = 8;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        textView.setVisibility(i);
        AI8 textCell = getTextCell();
        o.LJIIIIZZ(textCell, "textCell");
        if (z2) {
            i2 = 0;
        }
        textCell.setVisibility(i2);
    }
}
