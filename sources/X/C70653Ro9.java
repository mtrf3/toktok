package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.Ro9, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70653Ro9 extends ConstraintLayout {
    public static final int LJLJJLL = O6R.LJJIIZ(C32151Nz.LJIIZILJ(6));
    public static final int LJLJL = C7MY.LIZIZ(4);
    public final TuxIconView LJLIL;
    public final C2068389v LJLILLLLZI;
    public final float LJLJI;
    public final float LJLJJI;
    public final float LJLJJL;

    public final void setIconRes(int i) {
        TuxIconView tuxIconView = this.LJLIL;
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZ = i;
        c2068389v.LIZLLL = this.LJLILLLLZI.LIZLLL;
        tuxIconView.setTuxIcon(c2068389v);
    }

    public final void setTintColor(int i) {
        TuxIconView tuxIconView = this.LJLIL;
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZ = this.LJLILLLLZI.LIZ;
        c2068389v.LJ = Integer.valueOf(i);
        tuxIconView.setTuxIcon(c2068389v);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C70653Ro9(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        o.LJIIIZ(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C70653Ro9(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a1.LJFF(context, "context");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.a0p, R.attr.a0q, R.attr.a0r, R.attr.agu, R.attr.agv, R.attr.agw, R.attr.agx, R.attr.agy});
        o.LJIIIIZZ(obtainStyledAttributes, "context.obtainStyledAttr…yleable.CircleButtonView)");
        float dimension = obtainStyledAttributes.getDimension(7, 0.0f);
        this.LJLJI = dimension;
        float dimension2 = obtainStyledAttributes.getDimension(3, 0.0f);
        this.LJLJJI = dimension2;
        int color = obtainStyledAttributes.getColor(1, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        float f = obtainStyledAttributes.getFloat(2, 1.0f);
        int resourceId = obtainStyledAttributes.getResourceId(5, 0);
        int color2 = obtainStyledAttributes.getColor(6, 0);
        float dimension3 = obtainStyledAttributes.getDimension(4, 0.0f);
        this.LJLJJL = dimension3;
        obtainStyledAttributes.recycle();
        if (drawable == null) {
            C110614Vt c110614Vt = new C110614Vt();
            c110614Vt.LIZJ = Float.valueOf(dimension);
            c110614Vt.LIZ = Integer.valueOf(color);
            drawable = c110614Vt.LIZ(context);
        }
        drawable.setAlpha((int) (f * drawable.getAlpha()));
        setBackground(drawable);
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZ = resourceId;
        c2068389v.LIZLLL = Integer.valueOf(color2);
        this.LJLILLLLZI = c2068389v;
        TuxIconView tuxIconView = new TuxIconView(context, null, 0, 6, null);
        tuxIconView.setId(R.id.bn1);
        C018905p c018905p = new C018905p((int) dimension, (int) dimension2);
        c018905p.startToStart = 0;
        c018905p.endToEnd = 0;
        c018905p.topToTop = 0;
        c018905p.bottomToBottom = 0;
        int i2 = (int) dimension3;
        c018905p.setMarginStart(i2);
        c018905p.setMarginEnd(i2);
        ((ViewGroup.MarginLayoutParams) c018905p).topMargin = i2;
        ((ViewGroup.MarginLayoutParams) c018905p).bottomMargin = i2;
        tuxIconView.setLayoutParams(c018905p);
        tuxIconView.setTuxIcon(c2068389v);
        this.LJLIL = tuxIconView;
        addView(tuxIconView);
    }
}
