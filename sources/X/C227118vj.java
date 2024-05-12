package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.8vj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C227118vj extends LinearLayout {
    public final ViewGroup LJLIL;
    public final ViewGroup LJLILLLLZI;
    public final TuxTextView LJLJI;
    public final GradientDrawable LJLJJI;
    public boolean LJLJJL;

    public final void LIZ(boolean z) {
        GradientDrawable gradientDrawable;
        if (z) {
            this.LJLJJL = true;
            GradientDrawable gradientDrawable2 = this.LJLJJI;
            if (gradientDrawable2 != null) {
                gradientDrawable2.mutate();
            }
            Context context = getContext();
            o.LJIIIIZZ(context, "context");
            Integer LJI = C79045V0n.LJI(R.attr.e7, context);
            if (LJI != null) {
                int intValue = LJI.intValue();
                GradientDrawable gradientDrawable3 = this.LJLJJI;
                if (gradientDrawable3 != null) {
                    gradientDrawable3.setStroke(O6R.LJJIIZ(C32151Nz.LJIIZILJ(1)), intValue);
                    return;
                }
                return;
            }
            return;
        }
        if (!this.LJLJJL || (gradientDrawable = this.LJLJJI) == null) {
            return;
        }
        gradientDrawable.setStroke(0, 0);
    }

    public final void setContentFieldView(View contentView) {
        o.LJIIIZ(contentView, "contentView");
        this.LJLILLLLZI.removeAllViews();
        this.LJLILLLLZI.addView(contentView);
    }

    public final void setFooterFieldView(View contentView) {
        o.LJIIIZ(contentView, "contentView");
        this.LJLIL.removeAllViews();
        this.LJLIL.addView(contentView);
    }

    public final void setTitleText(CharSequence text) {
        o.LJIIIZ(text, "text");
        this.LJLJI.setText(text);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C227118vj(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        GradientDrawable gradientDrawable;
        a1.LJFF(context, "context");
        LinearLayout.inflate(context, R.layout.bkv, this);
        setOrientation(1);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        View findViewById = findViewById(R.id.cs4);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.effect_edit_title)");
        this.LJLJI = (TuxTextView) findViewById;
        View findViewById2 = findViewById(R.id.cs0);
        o.LJIIIIZZ(findViewById2, "findViewById(R.id.effect_edit_content_container)");
        ViewGroup viewGroup = (ViewGroup) findViewById2;
        this.LJLILLLLZI = viewGroup;
        View findViewById3 = findViewById(R.id.cs1);
        o.LJIIIIZZ(findViewById3, "findViewById(R.id.effect_edit_footer_container)");
        this.LJLIL = (ViewGroup) findViewById3;
        Drawable background = viewGroup.getBackground();
        if (background instanceof GradientDrawable) {
            gradientDrawable = (GradientDrawable) background;
        } else {
            gradientDrawable = null;
        }
        this.LJLJJI = gradientDrawable;
    }
}
