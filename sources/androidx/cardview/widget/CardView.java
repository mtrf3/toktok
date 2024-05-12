package androidx.cardview.widget;

import X.C04210En;
import X.C1E2;
import X.C282719b;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
public class CardView extends FrameLayout {
    public static final int[] LJLJJLL = {R.attr.colorBackground};
    public static final C1E2 LJLJL = new C1E2();
    public boolean LJLIL;
    public boolean LJLILLLLZI;
    public final Rect LJLJI;
    public final Rect LJLJJI;
    public final C282719b LJLJJL;

    public CardView() {
        throw null;
    }

    @Override // android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i, int i2, int i3, int i4) {
    }

    public ColorStateList getCardBackgroundColor() {
        return ((C04210En) this.LJLJJL.LIZ).LJII;
    }

    public float getCardElevation() {
        return this.LJLJJL.LIZIZ.getElevation();
    }

    public int getContentPaddingBottom() {
        return this.LJLJI.bottom;
    }

    public int getContentPaddingLeft() {
        return this.LJLJI.left;
    }

    public int getContentPaddingRight() {
        return this.LJLJI.right;
    }

    public int getContentPaddingTop() {
        return this.LJLJI.top;
    }

    public float getMaxCardElevation() {
        return ((C04210En) this.LJLJJL.LIZ).LJ;
    }

    public float getRadius() {
        return ((C04210En) this.LJLJJL.LIZ).LIZ;
    }

    public boolean getPreventCornerOverlap() {
        return this.LJLILLLLZI;
    }

    public boolean getUseCompatPadding() {
        return this.LJLIL;
    }

    public void setCardBackgroundColor(int i) {
        C282719b c282719b = this.LJLJJL;
        ColorStateList valueOf = ColorStateList.valueOf(i);
        C04210En c04210En = (C04210En) c282719b.LIZ;
        c04210En.LIZIZ(valueOf);
        c04210En.invalidateSelf();
    }

    public void setCardElevation(float f) {
        this.LJLJJL.LIZIZ.setElevation(f);
    }

    public void setMaxCardElevation(float f) {
        LJLJL.LIZIZ(this.LJLJJL, f);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i) {
        super.setMinimumHeight(i);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i) {
        super.setMinimumWidth(i);
    }

    public void setPreventCornerOverlap(boolean z) {
        if (z != this.LJLILLLLZI) {
            this.LJLILLLLZI = z;
            C1E2 c1e2 = LJLJL;
            C282719b c282719b = this.LJLJJL;
            c1e2.LIZIZ(c282719b, ((C04210En) c282719b.LIZ).LJ);
        }
    }

    public void setRadius(float f) {
        C04210En c04210En = (C04210En) this.LJLJJL.LIZ;
        if (f == c04210En.LIZ) {
            return;
        }
        c04210En.LIZ = f;
        c04210En.LIZJ(null);
        c04210En.invalidateSelf();
    }

    public void setUseCompatPadding(boolean z) {
        if (this.LJLIL != z) {
            this.LJLIL = z;
            C1E2 c1e2 = LJLJL;
            C282719b c282719b = this.LJLJJL;
            c1e2.LIZIZ(c282719b, ((C04210En) c282719b.LIZ).LJ);
        }
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        C04210En c04210En = (C04210En) this.LJLJJL.LIZ;
        c04210En.LIZIZ(colorStateList);
        c04210En.invalidateSelf();
    }

    public CardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.zhiliaoapp.musically.R.attr.a1o);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    public CardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int color;
        ColorStateList valueOf;
        Rect rect = new Rect();
        this.LJLJI = rect;
        this.LJLJJI = new Rect();
        C282719b c282719b = new C282719b(this);
        this.LJLJJL = c282719b;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.minWidth, R.attr.minHeight, com.zhiliaoapp.musically.R.attr.a1h, com.zhiliaoapp.musically.R.attr.a1i, com.zhiliaoapp.musically.R.attr.a1j, com.zhiliaoapp.musically.R.attr.a1l, com.zhiliaoapp.musically.R.attr.a1m, com.zhiliaoapp.musically.R.attr.a1n, com.zhiliaoapp.musically.R.attr.a76, com.zhiliaoapp.musically.R.attr.a77, com.zhiliaoapp.musically.R.attr.a79, com.zhiliaoapp.musically.R.attr.a7_, com.zhiliaoapp.musically.R.attr.a7b}, i, com.zhiliaoapp.musically.R.style.h4);
        if (obtainStyledAttributes.hasValue(2)) {
            valueOf = obtainStyledAttributes.getColorStateList(2);
        } else {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(LJLJJLL);
            int color2 = obtainStyledAttributes2.getColor(0, 0);
            obtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color2, fArr);
            if (fArr[2] > 0.5f) {
                color = getResources().getColor(com.zhiliaoapp.musically.R.color.fl);
            } else {
                color = getResources().getColor(com.zhiliaoapp.musically.R.color.fk);
            }
            valueOf = ColorStateList.valueOf(color);
        }
        float dimension = obtainStyledAttributes.getDimension(3, 0.0f);
        float dimension2 = obtainStyledAttributes.getDimension(4, 0.0f);
        float dimension3 = obtainStyledAttributes.getDimension(5, 0.0f);
        this.LJLIL = obtainStyledAttributes.getBoolean(7, false);
        this.LJLILLLLZI = obtainStyledAttributes.getBoolean(6, true);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(8, 0);
        rect.left = obtainStyledAttributes.getDimensionPixelSize(10, dimensionPixelSize);
        rect.top = obtainStyledAttributes.getDimensionPixelSize(12, dimensionPixelSize);
        rect.right = obtainStyledAttributes.getDimensionPixelSize(11, dimensionPixelSize);
        rect.bottom = obtainStyledAttributes.getDimensionPixelSize(9, dimensionPixelSize);
        dimension3 = dimension2 > dimension3 ? dimension2 : dimension3;
        obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        C1E2 c1e2 = LJLJL;
        C04210En c04210En = new C04210En(dimension, valueOf);
        c282719b.LIZ = c04210En;
        setBackgroundDrawable(c04210En);
        setClipToOutline(true);
        setElevation(dimension2);
        c1e2.LIZIZ(c282719b, dimension3);
    }

    public void LIZLLL(int i, int i2, int i3, int i4) {
        this.LJLJI.set(i, i2, i3, i4);
        C1E2.LIZLLL(this.LJLJJL);
    }
}
