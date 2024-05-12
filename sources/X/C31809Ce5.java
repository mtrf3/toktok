package X;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.jvm.internal.o;

/* renamed from: X.Ce5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31809Ce5 extends View {
    public C31810Ce6 LJLIL;

    public C31809Ce5(Context context) {
        this(context, null, 6);
    }

    public C31809Ce5(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
    }

    public final void LIZ(View view) {
        ViewParent viewParent;
        int i;
        if (getParent() != null) {
            return;
        }
        ViewGroup viewGroup = null;
        if (view != null) {
            viewParent = view.getParent();
        } else {
            viewParent = null;
        }
        if (viewParent instanceof ViewGroup) {
            viewGroup = (ViewGroup) viewParent;
        }
        if (viewGroup != null) {
            i = viewGroup.indexOfChild(view);
            C16880lQ.LJLLL(view, viewGroup);
        } else {
            i = -1;
        }
        C31810Ce6 c31810Ce6 = this.LJLIL;
        if (c31810Ce6 == null) {
            return;
        }
        setId(c31810Ce6.LIZJ);
        if (view != null) {
            view.setId(-1);
        }
        setVisibility(c31810Ce6.LIZLLL);
        ViewGroup viewGroup2 = c31810Ce6.LJ;
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.width = c31810Ce6.LIZIZ;
        layoutParams.height = c31810Ce6.LIZ;
        viewGroup2.addView(this, i, layoutParams);
    }

    public final void LIZIZ(View view) {
        ViewGroup viewGroup;
        int i;
        int i2;
        int id;
        ViewGroup.LayoutParams layoutParams;
        int i3;
        ViewGroup viewGroup2;
        ViewParent parent = getParent();
        if (!(parent instanceof ViewGroup) || (viewGroup = (ViewGroup) parent) == null) {
            return;
        }
        if (view == null) {
            C16880lQ.LLIIII(this, viewGroup);
            return;
        }
        int indexOfChild = viewGroup.indexOfChild(this);
        ViewGroup.LayoutParams layoutParams2 = getLayoutParams();
        if (layoutParams2 != null) {
            i = layoutParams2.height;
        } else {
            i = 0;
        }
        ViewGroup.LayoutParams layoutParams3 = getLayoutParams();
        if (layoutParams3 != null) {
            i2 = layoutParams3.width;
        } else {
            i2 = 0;
        }
        this.LJLIL = new C31810Ce6(i, i2, getId(), getVisibility(), viewGroup);
        if (view.getVisibility() == 0 && getVisibility() == 0) {
            view.setVisibility(0);
        } else {
            view.setVisibility(8);
        }
        if ((viewGroup instanceof RelativeLayout) || (viewGroup instanceof FrameLayout) || (viewGroup instanceof ConstraintLayout)) {
            id = getId();
        } else {
            id = View.generateViewId();
        }
        view.setId(id);
        setId(-1);
        C16880lQ.LLIIII(this, viewGroup);
        ViewParent parent2 = view.getParent();
        if ((parent2 instanceof ViewGroup) && (viewGroup2 = (ViewGroup) parent2) != null) {
            C16880lQ.LJLLL(view, viewGroup2);
        }
        if (getLayoutParams() != null) {
            if (view.getLayoutParams() == null) {
                layoutParams = getLayoutParams();
            } else {
                layoutParams = getLayoutParams();
                int i4 = view.getLayoutParams().width;
                int i5 = -2;
                if (i4 != -1 && i4 != -2) {
                    i3 = view.getLayoutParams().width;
                } else {
                    int i6 = layoutParams.width;
                    if ((i6 != -1 && i6 != -2) || i6 == view.getLayoutParams().width) {
                        i3 = layoutParams.width;
                    } else {
                        i3 = -2;
                    }
                }
                layoutParams.width = i3;
                int i7 = view.getLayoutParams().height;
                if (i7 != -1 && i7 != -2) {
                    i5 = view.getLayoutParams().height;
                } else {
                    int i8 = layoutParams.height;
                    if ((i8 != -1 && i8 != -2) || i8 == view.getLayoutParams().height) {
                        i5 = layoutParams.height;
                    }
                }
                layoutParams.height = i5;
            }
            viewGroup.addView(view, indexOfChild, layoutParams);
            return;
        }
        viewGroup.addView(view, indexOfChild);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        try {
            super.onRestoreInstanceState(parcelable);
        } catch (Exception unused) {
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C31809Ce5(android.content.Context r2, android.util.AttributeSet r3, int r4) {
        /*
            r1 = this;
            r0 = r4 & 2
            if (r0 == 0) goto L5
            r3 = 0
        L5:
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r0 = 0
            r1.<init>(r2, r3, r0)
            r0 = 1
            r1.setWillNotDraw(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31809Ce5.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
