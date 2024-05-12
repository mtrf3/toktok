package X;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;

/* renamed from: X.1A9, reason: invalid class name */
/* loaded from: classes.dex */
public class C1A9 extends AbstractC019505v {
    public float LJLIL;
    public float LJLILLLLZI;
    public float LJLJI;
    public ConstraintLayout LJLJJI;
    public float LJLJJL;
    public float LJLJJLL;
    public float LJLJL;
    public float LJLJLJ;
    public float LJLJLLL;
    public float LJLL;
    public float LJLLI;
    public float LJLLILLLL;
    public final boolean LJLLJ;
    public View[] LJLLL;
    public float LJLLLL;
    public float LJLLLLLL;
    public boolean LJLZ;
    public boolean LJZ;

    public final void LJ() {
        if (this.LJLJJI == null) {
            return;
        }
        if (!this.LJLLJ && !Float.isNaN(this.LJLJL) && !Float.isNaN(this.LJLJLJ)) {
            return;
        }
        if (Float.isNaN(this.LJLIL) || Float.isNaN(this.LJLILLLLZI)) {
            View[] views = getViews(this.LJLJJI);
            int left = views[0].getLeft();
            int top = views[0].getTop();
            int right = views[0].getRight();
            int bottom = views[0].getBottom();
            for (int i = 0; i < this.mCount; i++) {
                View view = views[i];
                left = Math.min(left, view.getLeft());
                top = Math.min(top, view.getTop());
                right = Math.max(right, view.getRight());
                bottom = Math.max(bottom, view.getBottom());
            }
            this.LJLJLLL = right;
            this.LJLL = bottom;
            this.LJLLI = left;
            this.LJLLILLLL = top;
            if (Float.isNaN(this.LJLIL)) {
                this.LJLJL = (left + right) / 2;
            } else {
                this.LJLJL = this.LJLIL;
            }
            if (Float.isNaN(this.LJLILLLLZI)) {
                this.LJLJLJ = (top + bottom) / 2;
                return;
            } else {
                this.LJLJLJ = this.LJLILLLLZI;
                return;
            }
        }
        this.LJLJLJ = this.LJLILLLLZI;
        this.LJLJL = this.LJLIL;
    }

    public final void LJFF() {
        int i;
        if (this.LJLJJI == null || (i = this.mCount) == 0) {
            return;
        }
        View[] viewArr = this.LJLLL;
        if (viewArr == null || viewArr.length != i) {
            this.LJLLL = new View[i];
        }
        for (int i2 = 0; i2 < this.mCount; i2++) {
            this.LJLLL[i2] = this.LJLJJI.getViewById(this.mIds[i2]);
        }
    }

    public final void transform() {
        double radians;
        if (this.LJLJJI == null) {
            return;
        }
        if (this.LJLLL == null) {
            LJFF();
        }
        LJ();
        if (Float.isNaN(this.LJLJI)) {
            radians = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
        } else {
            radians = Math.toRadians(this.LJLJI);
        }
        float sin = (float) Math.sin(radians);
        float cos = (float) Math.cos(radians);
        float f = this.LJLJJL;
        float f2 = f * cos;
        float f3 = this.LJLJJLL;
        float f4 = (-f3) * sin;
        float f5 = f * sin;
        float f6 = f3 * cos;
        for (int i = 0; i < this.mCount; i++) {
            View view = this.LJLLL[i];
            int right = (view.getRight() + view.getLeft()) / 2;
            int bottom = (view.getBottom() + view.getTop()) / 2;
            float f7 = right - this.LJLJL;
            float f8 = bottom - this.LJLJLJ;
            float f9 = (((f4 * f8) + (f2 * f7)) - f7) + this.LJLLLL;
            float f10 = (((f6 * f8) + (f7 * f5)) - f8) + this.LJLLLLLL;
            view.setTranslationX(f9);
            view.setTranslationY(f10);
            view.setScaleY(this.LJLJJLL);
            view.setScaleX(this.LJLJJL);
            if (!Float.isNaN(this.LJLJI)) {
                view.setRotation(this.LJLJI);
            }
        }
    }

    @Override // X.AbstractC019505v, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.LJLJJI = (ConstraintLayout) getParent();
        if (this.LJLZ || this.LJZ) {
            int visibility = getVisibility();
            float elevation = getElevation();
            for (int i = 0; i < this.mCount; i++) {
                View viewById = this.LJLJJI.getViewById(this.mIds[i]);
                if (viewById != null) {
                    if (this.LJLZ) {
                        viewById.setVisibility(visibility);
                    }
                    if (this.LJZ && elevation > 0.0f) {
                        viewById.setTranslationZ(viewById.getTranslationZ() + elevation);
                    }
                }
            }
        }
    }

    @Override // X.AbstractC019505v
    public final void init(AttributeSet attributeSet) {
        super.init(attributeSet);
        this.mUseViewMeasure = false;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.orientation, R.attr.padding, R.attr.paddingLeft, R.attr.paddingTop, R.attr.paddingRight, R.attr.paddingBottom, R.attr.visibility, R.attr.maxWidth, R.attr.maxHeight, R.attr.minWidth, R.attr.minHeight, R.attr.paddingStart, R.attr.paddingEnd, R.attr.elevation, com.zhiliaoapp.musically.R.attr.xw, com.zhiliaoapp.musically.R.attr.xx, com.zhiliaoapp.musically.R.attr.xy, com.zhiliaoapp.musically.R.attr.a1p, com.zhiliaoapp.musically.R.attr.a6s, com.zhiliaoapp.musically.R.attr.a6v, com.zhiliaoapp.musically.R.attr.a6w, com.zhiliaoapp.musically.R.attr.adm, com.zhiliaoapp.musically.R.attr.adn, com.zhiliaoapp.musically.R.attr.ado, com.zhiliaoapp.musically.R.attr.adp, com.zhiliaoapp.musically.R.attr.adq, com.zhiliaoapp.musically.R.attr.adr, com.zhiliaoapp.musically.R.attr.ads, com.zhiliaoapp.musically.R.attr.adt, com.zhiliaoapp.musically.R.attr.adu, com.zhiliaoapp.musically.R.attr.adv, com.zhiliaoapp.musically.R.attr.adw, com.zhiliaoapp.musically.R.attr.adx, com.zhiliaoapp.musically.R.attr.ady, com.zhiliaoapp.musically.R.attr.ae0, com.zhiliaoapp.musically.R.attr.ae1, com.zhiliaoapp.musically.R.attr.ae2, com.zhiliaoapp.musically.R.attr.ae3, com.zhiliaoapp.musically.R.attr.ae4, com.zhiliaoapp.musically.R.attr.akw, com.zhiliaoapp.musically.R.attr.alr, com.zhiliaoapp.musically.R.attr.als, com.zhiliaoapp.musically.R.attr.alt, com.zhiliaoapp.musically.R.attr.alu, com.zhiliaoapp.musically.R.attr.alv, com.zhiliaoapp.musically.R.attr.alw, com.zhiliaoapp.musically.R.attr.alx, com.zhiliaoapp.musically.R.attr.aly, com.zhiliaoapp.musically.R.attr.alz, com.zhiliaoapp.musically.R.attr.am0, com.zhiliaoapp.musically.R.attr.am1, com.zhiliaoapp.musically.R.attr.am2, com.zhiliaoapp.musically.R.attr.am3, com.zhiliaoapp.musically.R.attr.am4, com.zhiliaoapp.musically.R.attr.am5, com.zhiliaoapp.musically.R.attr.am6, com.zhiliaoapp.musically.R.attr.am7, com.zhiliaoapp.musically.R.attr.am8, com.zhiliaoapp.musically.R.attr.am9, com.zhiliaoapp.musically.R.attr.am_, com.zhiliaoapp.musically.R.attr.ama, com.zhiliaoapp.musically.R.attr.amb, com.zhiliaoapp.musically.R.attr.amc, com.zhiliaoapp.musically.R.attr.amd, com.zhiliaoapp.musically.R.attr.ame, com.zhiliaoapp.musically.R.attr.amf, com.zhiliaoapp.musically.R.attr.amg, com.zhiliaoapp.musically.R.attr.amh, com.zhiliaoapp.musically.R.attr.ami, com.zhiliaoapp.musically.R.attr.amj, com.zhiliaoapp.musically.R.attr.amk, com.zhiliaoapp.musically.R.attr.aml, com.zhiliaoapp.musically.R.attr.amm, com.zhiliaoapp.musically.R.attr.amn, com.zhiliaoapp.musically.R.attr.amo, com.zhiliaoapp.musically.R.attr.amp, com.zhiliaoapp.musically.R.attr.amq, com.zhiliaoapp.musically.R.attr.amr, com.zhiliaoapp.musically.R.attr.ams, com.zhiliaoapp.musically.R.attr.amt, com.zhiliaoapp.musically.R.attr.amu, com.zhiliaoapp.musically.R.attr.amv, com.zhiliaoapp.musically.R.attr.amx, com.zhiliaoapp.musically.R.attr.amy, com.zhiliaoapp.musically.R.attr.an2, com.zhiliaoapp.musically.R.attr.an3, com.zhiliaoapp.musically.R.attr.an4, com.zhiliaoapp.musically.R.attr.an5, com.zhiliaoapp.musically.R.attr.an6, com.zhiliaoapp.musically.R.attr.an7, com.zhiliaoapp.musically.R.attr.ang});
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 6) {
                    this.LJLZ = true;
                } else if (index == 13) {
                    this.LJZ = true;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        applyLayoutFeatures();
    }

    @Override // android.view.View
    public void setPivotX(float f) {
        this.LJLIL = f;
        transform();
    }

    @Override // android.view.View
    public void setPivotY(float f) {
        this.LJLILLLLZI = f;
        transform();
    }

    @Override // android.view.View
    public void setRotation(float f) {
        this.LJLJI = f;
        transform();
    }

    @Override // android.view.View
    public void setScaleX(float f) {
        this.LJLJJL = f;
        transform();
    }

    @Override // android.view.View
    public void setScaleY(float f) {
        this.LJLJJLL = f;
        transform();
    }

    @Override // android.view.View
    public void setTranslationX(float f) {
        this.LJLLLL = f;
        transform();
    }

    @Override // android.view.View
    public void setTranslationY(float f) {
        this.LJLLLLLL = f;
        transform();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        applyLayoutFeatures();
    }

    @Override // X.AbstractC019505v
    public final void updatePostLayout(ConstraintLayout constraintLayout) {
        LJFF();
        this.LJLJL = Float.NaN;
        this.LJLJLJ = Float.NaN;
        C018205i c018205i = ((C018905p) getLayoutParams()).widget;
        c018205i.setWidth(0);
        c018205i.setHeight(0);
        LJ();
        layout(((int) this.LJLLI) - getPaddingLeft(), ((int) this.LJLLILLLL) - getPaddingTop(), getPaddingRight() + ((int) this.LJLJLLL), getPaddingBottom() + ((int) this.LJLL));
        transform();
    }

    @Override // X.AbstractC019505v
    public final void updatePreDraw(ConstraintLayout constraintLayout) {
        this.LJLJJI = constraintLayout;
        float rotation = getRotation();
        if (rotation == 0.0f) {
            if (!Float.isNaN(this.LJLJI)) {
                this.LJLJI = rotation;
                return;
            }
            return;
        }
        this.LJLJI = rotation;
    }

    public C1A9(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LJLIL = Float.NaN;
        this.LJLILLLLZI = Float.NaN;
        this.LJLJI = Float.NaN;
        this.LJLJJL = 1.0f;
        this.LJLJJLL = 1.0f;
        this.LJLJL = Float.NaN;
        this.LJLJLJ = Float.NaN;
        this.LJLJLLL = Float.NaN;
        this.LJLL = Float.NaN;
        this.LJLLI = Float.NaN;
        this.LJLLILLLL = Float.NaN;
        this.LJLLJ = true;
    }
}
