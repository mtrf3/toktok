package X;

import android.R;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;

/* renamed from: X.08X, reason: invalid class name */
/* loaded from: classes.dex */
public final class C08X extends FrameLayout {
    public ArrayList<View> LJLIL;
    public ArrayList<View> LJLILLLLZI;
    public boolean LJLJI;

    @Override // android.view.ViewGroup
    public final void removeAllViewsInLayout() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            LIZ(getChildAt(childCount));
        }
        super.removeAllViewsInLayout();
    }

    public final void LIZ(View view) {
        ArrayList<View> arrayList;
        if (view.getAnimation() != null || ((arrayList = this.LJLILLLLZI) != null && arrayList.contains(view))) {
            if (this.LJLIL == null) {
                this.LJLIL = new ArrayList<>();
            }
            this.LJLIL.add(view);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.LJLJI && this.LJLIL != null) {
            for (int i = 0; i < this.LJLIL.size(); i++) {
                super.drawChild(canvas, (View) ListProtector.get(this.LJLIL, i), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final void endViewTransition(View view) {
        ArrayList<View> arrayList = this.LJLILLLLZI;
        if (arrayList != null) {
            arrayList.remove(view);
            ArrayList<View> arrayList2 = this.LJLIL;
            if (arrayList2 != null && arrayList2.remove(view)) {
                this.LJLJI = true;
            }
        }
        super.endViewTransition(view);
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        for (int i = 0; i < getChildCount(); i++) {
            getChildAt(i).dispatchApplyWindowInsets(new WindowInsets(windowInsets));
        }
        return windowInsets;
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        LIZ(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i) {
        LIZ(getChildAt(i));
        super.removeViewAt(i);
    }

    @Override // android.view.ViewGroup
    public final void removeViewInLayout(View view) {
        LIZ(view);
        super.removeViewInLayout(view);
    }

    public void setDrawDisappearingViewsLast(boolean z) {
        this.LJLJI = z;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.ViewGroup
    public final void startViewTransition(View view) {
        if (view.getParent() == this) {
            if (this.LJLILLLLZI == null) {
                this.LJLILLLLZI = new ArrayList<>();
            }
            this.LJLILLLLZI.add(view);
        }
        super.startViewTransition(view);
    }

    public C08X(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LJLJI = true;
        throw new UnsupportedOperationException("FragmentContainerView must be within a FragmentActivity to be instantiated from XML.");
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z) {
        if (z) {
            LIZ(view);
        }
        super.removeDetachedView(view, z);
    }

    @Override // android.view.ViewGroup
    public final void removeViews(int i, int i2) {
        for (int i3 = i; i3 < i + i2; i3++) {
            LIZ(getChildAt(i3));
        }
        super.removeViews(i, i2);
    }

    @Override // android.view.ViewGroup
    public final void removeViewsInLayout(int i, int i2) {
        for (int i3 = i; i3 < i + i2; i3++) {
            LIZ(getChildAt(i3));
        }
        super.removeViewsInLayout(i, i2);
    }

    public C08X(Context context, AttributeSet attributeSet, FragmentManager fragmentManager) {
        super(context, attributeSet);
        String str;
        this.LJLJI = true;
        String classAttribute = attributeSet.getClassAttribute();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.name, R.attr.tag});
        classAttribute = classAttribute == null ? C16880lQ.LLLZLZ(obtainStyledAttributes, 0) : classAttribute;
        String LLLZLZ = C16880lQ.LLLZLZ(obtainStyledAttributes, 1);
        obtainStyledAttributes.recycle();
        int id = getId();
        Fragment LJJJI = fragmentManager.LJJJI(id);
        if (classAttribute != null && LJJJI == null) {
            if (id <= 0) {
                if (LLLZLZ != null) {
                    str = " with tag ".concat(LLLZLZ);
                } else {
                    str = "";
                }
                throw new IllegalStateException("FragmentContainerView must have an android:id to add Fragment " + classAttribute + str);
            }
            AnonymousClass098 LJJJJL = fragmentManager.LJJJJL();
            context.getClassLoader();
            Fragment instantiate = Fragment.instantiate(((C1B0) LJJJJL).LIZIZ.mHost.LJLILLLLZI, classAttribute, null);
            instantiate.onInflate(context, attributeSet, (Bundle) null);
            C1B3 c1b3 = new C1B3(fragmentManager);
            c1b3.LJIILL = true;
            instantiate.mContainer = this;
            c1b3.LJIIIIZZ(getId(), 1, instantiate, LLLZLZ);
            c1b3.LJII();
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        Object tag = view.getTag(com.zhiliaoapp.musically.R.id.dmc);
        if ((tag instanceof Fragment) && tag != null) {
            super.addView(view, i, layoutParams);
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Views added to a FragmentContainerView must be associated with a Fragment. View ");
        LIZ.append(view);
        LIZ.append(" is not associated with a Fragment.");
        throw new IllegalStateException(X1D.LIZIZ(LIZ));
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        ArrayList<View> arrayList;
        if (this.LJLJI && (arrayList = this.LJLIL) != null && arrayList.size() > 0 && this.LJLIL.contains(view)) {
            return false;
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        Object tag = view.getTag(com.zhiliaoapp.musically.R.id.dmc);
        if ((tag instanceof Fragment) && tag != null) {
            return super.addViewInLayout(view, i, layoutParams, z);
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Views added to a FragmentContainerView must be associated with a Fragment. View ");
        LIZ.append(view);
        LIZ.append(" is not associated with a Fragment.");
        throw new IllegalStateException(X1D.LIZIZ(LIZ));
    }
}
