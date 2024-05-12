package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.T5w, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74088T5w extends FrameLayout {
    public final C74086T5u LJLIL;
    public final TextView LJLILLLLZI;
    public String LJLJI;
    public boolean LJLJJI;

    public final boolean getDisableWhileLoading() {
        return this.LJLJJI;
    }

    public final void LIZ(boolean z) {
        this.LJLJJI = false;
        setEnabled(z);
        if (this.LJLIL.getVisibility() != 8) {
            this.LJLIL.setVisibility(8);
        }
        this.LJLIL.LIZJ();
        setText(this.LJLJI);
    }

    public final void LIZIZ(boolean z) {
        this.LJLJJI = z;
        setEnabled(!z);
        if (this.LJLIL.getVisibility() != 0) {
            this.LJLIL.setVisibility(0);
        }
        this.LJLIL.LIZIZ();
        setText("");
    }

    public final void setButtonText(String text) {
        o.LJIIIZ(text, "text");
        this.LJLJI = text;
        this.LJLILLLLZI.setText(text);
    }

    public final void setDisableWhileLoading(boolean z) {
        this.LJLJJI = z;
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.LJLILLLLZI.setEnabled(z);
        if (this.LJLILLLLZI.isEnabled() || this.LJLJJI) {
            TextView textView = this.LJLILLLLZI;
            Context context = getContext();
            o.LJIIIIZZ(context, "context");
            textView.setTextColor(AnonymousClass636.LJIIIIZZ(R.attr.dj, context));
            this.LJLILLLLZI.setBackground(C04270Et.LIZIZ(getContext(), R.drawable.ww));
            return;
        }
        TextView textView2 = this.LJLILLLLZI;
        Context context2 = getContext();
        o.LJIIIIZZ(context2, "context");
        textView2.setTextColor(AnonymousClass636.LJIIIIZZ(R.attr.gp, context2));
        this.LJLILLLLZI.setBackground(C04270Et.LIZIZ(getContext(), R.drawable.x8));
    }

    public final void setText(String text) {
        o.LJIIIZ(text, "text");
        this.LJLILLLLZI.setText(text);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C74088T5w(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{android.R.attr.textSize, android.R.attr.textColor, android.R.attr.background, android.R.attr.text, R.attr.axv, R.attr.axx, R.attr.axy, R.attr.ay0});
        o.LJIIIIZZ(obtainStyledAttributes, "context.obtainStyledAttr….styleable.LoadingButton)");
        int color = obtainStyledAttributes.getColor(4, -1);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(7, C17N.LJIILL(20.0d));
        float dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(5, C17N.LJIILL(3.0d));
        int color2 = obtainStyledAttributes.getColor(1, -16777216);
        String LLLZLZ = C16880lQ.LLLZLZ(obtainStyledAttributes, 3);
        this.LJLJI = LLLZLZ == null ? "" : LLLZLZ;
        Drawable drawable = obtainStyledAttributes.getDrawable(2);
        int dimensionPixelSize3 = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        obtainStyledAttributes.recycle();
        View.inflate(context, R.layout.nl, this);
        if (drawable != null) {
            setBackground(drawable);
        }
        View findViewById = findViewById(R.id.g87);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.loading_button_loading_view)");
        C74086T5u c74086T5u = (C74086T5u) findViewById;
        this.LJLIL = c74086T5u;
        View findViewById2 = findViewById(R.id.g88);
        o.LJIIIIZZ(findViewById2, "findViewById(R.id.loading_button_text)");
        TextView textView = (TextView) findViewById2;
        this.LJLILLLLZI = textView;
        textView.setText(this.LJLJI);
        textView.setTextColor(color2);
        ViewGroup.LayoutParams layoutParams = c74086T5u.getLayoutParams();
        o.LJII(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        layoutParams2.height = dimensionPixelSize;
        layoutParams2.width = dimensionPixelSize;
        c74086T5u.setLayoutParams(layoutParams2);
        c74086T5u.setLoadingColor(color);
        c74086T5u.setLineWidth(dimensionPixelSize2);
        if (dimensionPixelSize3 != -1) {
            textView.setTextSize(0, dimensionPixelSize3);
        }
        setEnabled(false);
        C7FC.LIZIZ(this);
    }
}
