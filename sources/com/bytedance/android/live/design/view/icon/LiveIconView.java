package com.bytedance.android.live.design.view.icon;

import X.AbstractC534928b;
import X.AnonymousClass132;
import X.C0TT;
import X.C0TU;
import X.C1K5;
import X.C1Q4;
import X.C20110qd;
import X.C259910h;
import X.C28H;
import X.C532227a;
import X.InterfaceC36821cU;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.bytedance.android.live.design.view.icon.LiveIconView;

/* loaded from: classes.dex */
public class LiveIconView extends C1K5 {
    public int LJLJI;
    public C1Q4 LJLJJI;
    public boolean LJLJJL;
    public ColorStateList LJLJJLL;
    public Drawable LJLJL;
    public float LJLJLJ;
    public int LJLJLLL;
    public float LJLL;
    public float LJLLI;
    public float LJLLILLLL;
    public float LJLLJ;
    public boolean LJLLL;
    public int LJLLLL;
    public int LJLLLLLL;
    public boolean LJLZ;

    public LiveIconView() {
        throw null;
    }

    public final void LIZ() {
        C1Q4 c1q4 = this.LJLJJI;
        if (c1q4 != null && this.LJLLLLLL != -1) {
            Context context = getContext();
            int i = this.LJLLLLLL;
            C28H c28h = c1q4.LJLLLL;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, c28h.LLLLLLL());
            c28h.LLLLZ(context, obtainStyledAttributes);
            obtainStyledAttributes.recycle();
            if (this.LJLJJI.isStateful()) {
                this.LJLJJI.setState(getDrawableState());
            }
        }
    }

    public final void LIZIZ() {
        ColorStateList colorStateList;
        C1Q4 c1q4 = this.LJLJJI;
        if (c1q4 != null && (colorStateList = this.LJLJJLL) != null) {
            c1q4.setTintList(colorStateList);
            if (this.LJLJJI.isStateful()) {
                this.LJLJJI.setState(getDrawableState());
            }
        }
    }

    public final void LIZJ() {
        C1Q4 c1q4 = this.LJLJJI;
        if (c1q4 != null) {
            float f = this.LJLJLJ;
            float f2 = this.LJLL;
            float f3 = this.LJLLI;
            int i = this.LJLJLLL;
            c1q4.LJLLI = f;
            c1q4.LJLJLLL = f2;
            c1q4.LJLL = f3;
            c1q4.LJLJLJ = i;
            if (i != 0 && f > 0.0f) {
                if (c1q4.LJLLJ == null) {
                    c1q4.LJLLJ = new Paint(1);
                }
                c1q4.LJLLJ.setColor(c1q4.LJLJLJ);
            } else {
                c1q4.LJLLJ = null;
            }
            c1q4.LJLLL = null;
            c1q4.invalidateSelf();
            c1q4.LJ();
            c1q4.invalidateSelf();
        }
    }

    public InterfaceC36821cU getIconBackgroundShapeController() {
        C1Q4 c1q4 = this.LJLJJI;
        if (c1q4 != null) {
            return c1q4.LJLLLLLL;
        }
        return null;
    }

    public AnonymousClass132 getIconStateAlphaController() {
        C1Q4 c1q4 = this.LJLJJI;
        if (c1q4 != null) {
            return c1q4.LJLLLL;
        }
        return null;
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C1Q4 c1q4 = this.LJLJJI;
        if (c1q4 != null && c1q4.setState(getDrawableState())) {
            invalidate();
        }
    }

    public C1Q4 getIcon() {
        return this.LJLJJI;
    }

    public float getIconHeightRatio() {
        return this.LJLLJ;
    }

    public ColorStateList getIconTintList() {
        return this.LJLJJLL;
    }

    public float getIconWidthRatio() {
        return this.LJLLILLLL;
    }

    public int getShadowColor() {
        return this.LJLJLLL;
    }

    public float getShadowDx() {
        return this.LJLL;
    }

    public float getShadowDy() {
        return this.LJLLI;
    }

    public float getShadowRadius() {
        return this.LJLJLJ;
    }

    public final void LJ(Drawable drawable) {
        boolean z;
        if (drawable instanceof C1Q4) {
            C1Q4 c1q4 = (C1Q4) drawable;
            this.LJLJJI = c1q4;
            super.setImageDrawable(c1q4);
        } else if (drawable == null) {
            this.LJLJJI = null;
            super.setImageDrawable(null);
        } else {
            C1Q4 c1q42 = new C1Q4(drawable);
            this.LJLJJI = c1q42;
            super.setImageDrawable(c1q42);
        }
        LIZIZ();
        C1Q4 c1q43 = this.LJLJJI;
        if (c1q43 != null) {
            c1q43.setAutoMirrored(this.LJLJJL);
        }
        C1Q4 c1q44 = this.LJLJJI;
        if (c1q44 != null) {
            c1q44.LIZJ(this.LJLJL);
        }
        C1Q4 c1q45 = this.LJLJJI;
        if (c1q45 != null && c1q45.LJZI != (z = this.LJLLL)) {
            c1q45.LJZI = z;
            c1q45.invalidateSelf();
        }
        LIZJ();
        C1Q4 c1q46 = this.LJLJJI;
        if (c1q46 != null) {
            c1q46.LIZLLL(this.LJLLILLLL);
        }
        C1Q4 c1q47 = this.LJLJJI;
        if (c1q47 != null) {
            float f = this.LJLLJ;
            if (c1q47.LJZ != f) {
                c1q47.LJZ = f;
                c1q47.LJI();
                c1q47.invalidateSelf();
            }
        }
        C1Q4 c1q48 = this.LJLJJI;
        if (c1q48 != null && this.LJLLLL != -1) {
            Context context = getContext();
            int i = this.LJLLLL;
            C532227a<C1Q4> c532227a = c1q48.LJLLLLLL;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, c532227a.LLLLLLL());
            c532227a.LLLLZ(context, obtainStyledAttributes);
            obtainStyledAttributes.recycle();
        }
        LIZ();
        C1Q4 c1q49 = this.LJLJJI;
        if (c1q49 != null) {
            c1q49.LL = this.LJLZ;
        }
    }

    public void setCheckColorFilter(boolean z) {
        this.LJLZ = z;
        C1Q4 c1q4 = this.LJLJJI;
        if (c1q4 != null) {
            c1q4.LL = z;
        }
    }

    public void setCutout(boolean z) {
        this.LJLLL = z;
        C1Q4 c1q4 = this.LJLJJI;
        if (c1q4 != null && c1q4.LJZI != z) {
            c1q4.LJZI = z;
            c1q4.invalidateSelf();
        }
    }

    public void setIcon(int i) {
        if (this.LJLJI == i) {
            return;
        }
        this.LJLJI = i;
        C0TU c0tu = C0TT.LIZ;
        Context context = getContext();
        c0tu.getClass();
        LJ(C0TU.LIZ(i, context));
        setIconAutoMirrored(c0tu.LIZIZ(i, false));
    }

    public void setIconAttr(int i) {
        setIcon(C259910h.LJ(i, getContext()));
    }

    public void setIconAutoMirrored(boolean z) {
        this.LJLJJL = z;
        C1Q4 c1q4 = this.LJLJJI;
        if (c1q4 != null) {
            c1q4.setAutoMirrored(z);
        }
    }

    public void setIconBackground(int i) {
        setIconBackground(C20110qd.LIZ(getContext(), i));
    }

    public void setIconBackgroundAppearance(int i) {
        this.LJLLLL = i;
        C1Q4 c1q4 = this.LJLJJI;
        if (c1q4 != null && i != -1) {
            Context context = getContext();
            int i2 = this.LJLLLL;
            C532227a<C1Q4> c532227a = c1q4.LJLLLLLL;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i2, c532227a.LLLLLLL());
            c532227a.LLLLZ(context, obtainStyledAttributes);
            obtainStyledAttributes.recycle();
        }
    }

    public void setIconBackgroundColor(int i) {
        setIconBackground(new ColorDrawable(i));
    }

    public void setIconHeightRatio(float f) {
        this.LJLLJ = f;
        C1Q4 c1q4 = this.LJLJJI;
        if (c1q4 != null && c1q4.LJZ != f) {
            c1q4.LJZ = f;
            c1q4.LJI();
            c1q4.invalidateSelf();
        }
    }

    public void setIconStateAlphaAppearance(int i) {
        this.LJLLLLLL = i;
        LIZ();
    }

    public void setIconTint(int i) {
        setIconTintList(ColorStateList.valueOf(i));
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.LJLJJLL = colorStateList;
        LIZIZ();
    }

    public void setIconWidthRatio(float f) {
        this.LJLLILLLL = f;
        C1Q4 c1q4 = this.LJLJJI;
        if (c1q4 != null) {
            c1q4.LIZLLL(f);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        setIcon(drawable);
    }

    public void setIcon(Drawable drawable) {
        this.LJLJI = -1;
        LJ(drawable);
    }

    public void setIconBackground(Drawable drawable) {
        this.LJLJL = drawable;
        C1Q4 c1q4 = this.LJLJJI;
        if (c1q4 != null) {
            c1q4.LIZJ(drawable);
        }
    }

    public LiveIconView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LiveIconView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LJLJI = -1;
        this.LJLLILLLL = 1.0f;
        this.LJLLJ = 1.0f;
        this.LJLLLL = -1;
        this.LJLLLLLL = -1;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.enabled, com.zhiliaoapp.musically.R.attr.ag7}, i, 0);
        int LJFF = C259910h.LJFF(getContext(), obtainStyledAttributes, 1);
        if (LJFF != -1) {
            setIcon(LJFF);
        }
        new AbstractC534928b<LiveIconView>(this) { // from class: X.2Dl
            @Override // X.QXX
            public final int[] LLLLLLL() {
                return new int[]{com.zhiliaoapp.musically.R.attr.a1r, com.zhiliaoapp.musically.R.attr.a93, com.zhiliaoapp.musically.R.attr.ag_, com.zhiliaoapp.musically.R.attr.agd, com.zhiliaoapp.musically.R.attr.agg, com.zhiliaoapp.musically.R.attr.agh, com.zhiliaoapp.musically.R.attr.agi, com.zhiliaoapp.musically.R.attr.agj, com.zhiliaoapp.musically.R.attr.agm, com.zhiliaoapp.musically.R.attr.ago, com.zhiliaoapp.musically.R.attr.agq, com.zhiliaoapp.musically.R.attr.as2};
            }

            {
                super(this);
            }

            @Override // X.AbstractC534928b
            public final void LLLLZIL(TypedArray typedArray) {
                int color;
                if (typedArray.hasValue(4) && (color = typedArray.getColor(4, 0)) != 0) {
                    float dimension = typedArray.getDimension(5, 0.0f);
                    float dimension2 = typedArray.getDimension(6, 0.0f);
                    float dimension3 = typedArray.getDimension(7, 0.0f);
                    LiveIconView liveIconView = (LiveIconView) this.LJLIL;
                    liveIconView.LJLJLJ = dimension3;
                    liveIconView.LJLL = dimension;
                    liveIconView.LJLLI = dimension2;
                    liveIconView.LJLJLLL = color;
                    liveIconView.LIZJ();
                }
                int indexCount = typedArray.getIndexCount();
                for (int i2 = 0; i2 < indexCount; i2++) {
                    int index = typedArray.getIndex(i2);
                    if (index == 11) {
                        ((LiveIconView) this.LJLIL).setIconBackground(typedArray.getDrawable(index));
                    } else if (index == 10) {
                        TypedValue typedValue = new TypedValue();
                        typedArray.getValue(index, typedValue);
                        ((LiveIconView) this.LJLIL).setIconWidthRatio(typedValue.getFloat());
                    } else if (index == 3) {
                        TypedValue typedValue2 = new TypedValue();
                        typedArray.getValue(index, typedValue2);
                        ((LiveIconView) this.LJLIL).setIconHeightRatio(typedValue2.getFloat());
                    } else if (index == 1) {
                        ((LiveIconView) this.LJLIL).setCutout(typedArray.getBoolean(index, false));
                    } else if (index == 9) {
                        ColorStateList LJIILLIIL = C1DF.LJIILLIIL(this.LJLIL.getContext(), typedArray, index);
                        if (LJIILLIIL != null) {
                            ((LiveIconView) this.LJLIL).setIconTintList(LJIILLIIL);
                        }
                    } else if (index == 2) {
                        int resourceId = typedArray.getResourceId(index, -1);
                        if (resourceId != -1) {
                            ((LiveIconView) this.LJLIL).setIconBackgroundAppearance(resourceId);
                        }
                    } else if (index == 8) {
                        int resourceId2 = typedArray.getResourceId(index, -1);
                        if (resourceId2 != -1) {
                            ((LiveIconView) this.LJLIL).setIconStateAlphaAppearance(resourceId2);
                        }
                    } else if (index == 0) {
                        ((LiveIconView) this.LJLIL).setCheckColorFilter(typedArray.getBoolean(index, false));
                    }
                }
            }
        }.LLLLZLLLI(attributeSet, i, 0);
        setEnabled(obtainStyledAttributes.getBoolean(0, isEnabled()));
        obtainStyledAttributes.recycle();
    }
}
