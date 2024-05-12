package X;

import Y.AUListenerS93S0100000_4;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.common.ConnectionResult;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.Vpz, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80959Vpz extends ConstraintLayout {
    public final ArrayList<C80964Vq4> LJLIL;
    public ValueAnimator LJLILLLLZI;
    public float LJLJI;
    public InterfaceC80963Vq3 LJLJJI;
    public final C80962Vq2 LJLJJL;

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.LJLILLLLZI;
        if (valueAnimator != null) {
            valueAnimator.end();
        }
    }

    public static ArrayList LJJLJLI(View view) {
        ViewGroup viewGroup;
        int childCount;
        if (view instanceof C80961Vq1) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        if ((view instanceof ViewGroup) && (childCount = (viewGroup = (ViewGroup) view).getChildCount()) >= 0) {
            int i = 0;
            while (true) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt instanceof C80961Vq1) {
                    arrayList2.add(childAt);
                } else if (childAt instanceof ViewGroup) {
                    arrayList2.addAll(LJJLJLI(childAt));
                }
                if (i == childCount) {
                    break;
                }
                i++;
            }
        }
        return arrayList2;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.LJLJJL.LJIIIIZZ) {
            super.dispatchDraw(canvas);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        ValueAnimator valueAnimator;
        super.onDraw(canvas);
        if (canvas != null && (valueAnimator = this.LJLILLLLZI) != null && valueAnimator.isRunning()) {
            this.LJLJJI.LIZ(this.LJLJI, canvas);
        }
    }

    public final void setSkeletonRender(InterfaceC80963Vq3 render) {
        o.LJIIIZ(render, "render");
        this.LJLJJI = render;
        if (getWidth() > 0 && getHeight() > 0) {
            this.LJLJJI.LIZIZ(this.LJLJJL, this.LJLIL, getWidth(), getHeight());
        }
    }

    public final void setWhetherToDrawChildren(boolean z) {
        this.LJLJJL.LJIIIIZZ = z;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C80959Vpz(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        o.LJIIIZ(context, "context");
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View changedView, int i) {
        o.LJIIIZ(changedView, "changedView");
        super.onVisibilityChanged(changedView, i);
        if (o.LJ(changedView, this)) {
            if (i == 0) {
                ValueAnimator valueAnimator = this.LJLILLLLZI;
                if (valueAnimator != null) {
                    valueAnimator.start();
                    return;
                }
                return;
            }
            ValueAnimator valueAnimator2 = this.LJLILLLLZI;
            if (valueAnimator2 == null) {
                return;
            }
            valueAnimator2.end();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C80959Vpz(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        InterfaceC80963Vq3 c80958Vpy;
        a1.LJFF(context, "context");
        this.LJLIL = new ArrayList<>();
        this.LJLJJI = new C80958Vpy();
        C80962Vq2 c80962Vq2 = new C80962Vq2();
        this.LJLJJL = c80962Vq2;
        setWillNotDraw(false);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.a6e, R.attr.a6f, R.attr.a6g, R.attr.a6h, R.attr.a6i, R.attr.a6j, R.attr.a6k, R.attr.a6l, R.attr.a6m, R.attr.a6n});
            c80962Vq2.LIZLLL = obtainStyledAttributes.getColor(3, -3355444);
            c80962Vq2.LJ = obtainStyledAttributes.getColor(4, -7829368);
            obtainStyledAttributes.getColor(5, -3355444);
            c80962Vq2.LJFF = obtainStyledAttributes.getInt(1, ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED);
            c80962Vq2.LJI = obtainStyledAttributes.getInt(0, 0);
            c80962Vq2.LJII = obtainStyledAttributes.getInt(2, 0);
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(7, 0);
            c80962Vq2.LIZ = dimensionPixelSize;
            c80962Vq2.LIZIZ = obtainStyledAttributes.getDimensionPixelSize(8, dimensionPixelSize);
            c80962Vq2.LIZJ = obtainStyledAttributes.getDimensionPixelSize(9, c80962Vq2.LIZ);
            c80962Vq2.LJIIIIZZ = obtainStyledAttributes.getBoolean(6, false);
            obtainStyledAttributes.recycle();
        }
        if (c80962Vq2.LJII == 1) {
            c80958Vpy = new C80960Vq0();
        } else {
            c80958Vpy = new C80958Vpy();
        }
        this.LJLJJI = c80958Vpy;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (getWidth() <= 0 || getHeight() <= 0) {
            return;
        }
        this.LJLIL.clear();
        Iterator it = LJJLJLI(this).iterator();
        while (it.hasNext()) {
            C80961Vq1 c80961Vq1 = (C80961Vq1) it.next();
            C80964Vq4 skeletonElement = c80961Vq1.getSkeletonElement();
            C80962Vq2 c80962Vq2 = this.LJLJJL;
            if (skeletonElement.LIZLLL == -3355444) {
                skeletonElement.LIZLLL = c80962Vq2.LIZLLL;
            }
            if (skeletonElement.LJ == -7829368) {
                skeletonElement.LJ = c80962Vq2.LJ;
            }
            if (skeletonElement.LIZ == 0) {
                skeletonElement.LIZ = c80962Vq2.LIZ;
            }
            if (skeletonElement.LIZIZ == 0) {
                skeletonElement.LIZIZ = c80962Vq2.LIZIZ;
            }
            if (skeletonElement.LIZJ == 0) {
                skeletonElement.LIZJ = c80962Vq2.LIZJ;
            }
            float left = c80961Vq1.getLeft();
            float top = c80961Vq1.getTop();
            Object parent = c80961Vq1.getParent();
            if (parent instanceof View) {
                View view = (View) parent;
                while (view != null && !(view instanceof C80959Vpz)) {
                    left += view.getLeft();
                    top += view.getTop();
                    Object parent2 = view.getParent();
                    if (parent2 instanceof View) {
                        view = (View) parent2;
                    }
                }
            }
            skeletonElement.LJIIIZ = left;
            skeletonElement.LJIIJ = top;
            skeletonElement.LJIIJJI = left + c80961Vq1.getMeasuredWidth();
            skeletonElement.LJIIL = top + c80961Vq1.getMeasuredHeight();
            this.LJLIL.add(skeletonElement);
        }
        if (!this.LJLIL.isEmpty()) {
            int i5 = this.LJLJJL.LJI;
            float f = 1.0f;
            float f2 = -1.0f;
            if (i5 != 0) {
                if (i5 != 1) {
                    f = 0.0f;
                    f2 = 0.0f;
                }
            } else {
                f = -1.0f;
                f2 = 1.0f;
            }
            ValueAnimator valueAnimator = this.LJLILLLLZI;
            if (valueAnimator != null) {
                valueAnimator.end();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f, f2);
            ofFloat.setDuration(this.LJLJJL.LJFF);
            ofFloat.setRepeatCount(-1);
            ofFloat.setRepeatMode(1);
            ofFloat.setInterpolator(new LinearInterpolator());
            ofFloat.addUpdateListener(new AUListenerS93S0100000_4(this, 56));
            ofFloat.start();
            this.LJLILLLLZI = ofFloat;
        }
        this.LJLJJI.LIZIZ(this.LJLJJL, this.LJLIL, getWidth(), getHeight());
    }
}
