package X;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.9wI, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C252949wI extends LinearLayout {
    public final View LJLIL;
    public final View LJLILLLLZI;
    public final ImageView LJLJI;
    public final TextView LJLJJI;
    public final int LJLJJL;
    public final int LJLJJLL;
    public final boolean LJLJL;

    public final void LIZ() {
        this.LJLIL.setBackgroundColor(this.LJLJJL);
        this.LJLILLLLZI.setVisibility(8);
    }

    public final void LIZIZ(String text) {
        o.LJIIIZ(text, "text");
        boolean z = this.LJLJL;
        try {
            if (o.LJ(getResources().getResourceTypeName(0), "drawable")) {
                this.LJLJI.setImageResource(0);
            }
        } catch (Resources.NotFoundException unused) {
        }
        if (z) {
            this.LJLIL.setVisibility(0);
            this.LJLIL.setBackgroundColor(this.LJLJJLL);
        } else {
            this.LJLIL.setVisibility(8);
        }
        this.LJLILLLLZI.setVisibility(0);
        this.LJLJJI.setText(text);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C252949wI(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        this.LJLJL = true;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.textSize, com.zhiliaoapp.musically.R.attr.a_i, com.zhiliaoapp.musically.R.attr.a_j, com.zhiliaoapp.musically.R.attr.a_l, com.zhiliaoapp.musically.R.attr.az6, com.zhiliaoapp.musically.R.attr.b7o, com.zhiliaoapp.musically.R.attr.b7p, com.zhiliaoapp.musically.R.attr.baq});
        o.LJIIIIZZ(obtainStyledAttributes, "context.obtainStyledAttr…ble.InputResultIndicator)");
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(1, C17N.LJIILL(0.5d));
        this.LJLJJL = obtainStyledAttributes.getColor(2, AnonymousClass636.LJIIIIZZ(com.zhiliaoapp.musically.R.attr.dt, context));
        this.LJLJJLL = obtainStyledAttributes.getColor(3, C04330Ez.LIZIZ(context, com.zhiliaoapp.musically.R.color.kp));
        int color = obtainStyledAttributes.getColor(6, C04330Ez.LIZIZ(context, com.zhiliaoapp.musically.R.color.kp));
        int resourceId = obtainStyledAttributes.getResourceId(5, com.zhiliaoapp.musically.R.drawable.b8m);
        boolean z = obtainStyledAttributes.getBoolean(7, true);
        this.LJLJL = z;
        int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(4, -1);
        int dimensionPixelSize3 = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        obtainStyledAttributes.recycle();
        View.inflate(context, com.zhiliaoapp.musically.R.layout.bag, this);
        View findViewById = findViewById(com.zhiliaoapp.musically.R.id.izf);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.result_indicator_group_line)");
        this.LJLIL = findViewById;
        View findViewById2 = findViewById(com.zhiliaoapp.musically.R.id.izd);
        o.LJIIIIZZ(findViewById2, "findViewById(R.id.result_indicator_group_content)");
        this.LJLILLLLZI = findViewById2;
        View findViewById3 = findViewById(com.zhiliaoapp.musically.R.id.ize);
        o.LJIIIIZZ(findViewById3, "findViewById(R.id.result_indicator_group_image)");
        ImageView imageView = (ImageView) findViewById3;
        this.LJLJI = imageView;
        View findViewById4 = findViewById(com.zhiliaoapp.musically.R.id.izg);
        o.LJIIIIZZ(findViewById4, "findViewById(R.id.result_indicator_group_text)");
        TextView textView = (TextView) findViewById4;
        this.LJLJJI = textView;
        if (dimensionPixelSize2 != -1) {
            ViewGroup.LayoutParams layoutParams = findViewById2.getLayoutParams();
            o.LJII(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = dimensionPixelSize2;
        }
        if (dimensionPixelSize3 != -1) {
            textView.setTextSize(0, dimensionPixelSize3);
        }
        ViewGroup.LayoutParams layoutParams2 = findViewById.getLayoutParams();
        layoutParams2.height = dimensionPixelSize;
        findViewById.setLayoutParams(layoutParams2);
        try {
            if (o.LJ(getResources().getResourceTypeName(resourceId), "drawable")) {
                imageView.setImageResource(resourceId);
            }
        } catch (Resources.NotFoundException unused) {
        }
        textView.setTextColor(color);
        findViewById.setVisibility(z ? 0 : 8);
        LIZ();
    }
}
