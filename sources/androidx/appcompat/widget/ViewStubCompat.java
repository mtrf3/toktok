package androidx.appcompat.widget;

import X.C16880lQ;
import X.InterfaceC012002y;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class ViewStubCompat extends View {
    public int LJLIL;
    public int LJLILLLLZI;
    public WeakReference<View> LJLJI;
    public LayoutInflater LJLJJI;

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    public void setOnInflateListener(InterfaceC012002y interfaceC012002y) {
    }

    public final View LIZ() {
        ViewParent parent = getParent();
        if (parent instanceof ViewGroup) {
            if (this.LJLIL != 0) {
                ViewGroup viewGroup = (ViewGroup) parent;
                LayoutInflater layoutInflater = this.LJLJJI;
                if (layoutInflater == null) {
                    layoutInflater = C16880lQ.LLZIL(getContext());
                }
                View LLLLIILL = C16880lQ.LLLLIILL(layoutInflater, this.LJLIL, viewGroup, false);
                int i = this.LJLILLLLZI;
                if (i != -1) {
                    LLLLIILL.setId(i);
                }
                int indexOfChild = viewGroup.indexOfChild(this);
                C16880lQ.LLIIII(this, viewGroup);
                ViewGroup.LayoutParams layoutParams = getLayoutParams();
                if (layoutParams != null) {
                    viewGroup.addView(LLLLIILL, indexOfChild, layoutParams);
                } else {
                    viewGroup.addView(LLLLIILL, indexOfChild);
                }
                this.LJLJI = new WeakReference<>(LLLLIILL);
                return LLLLIILL;
            }
            throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
        throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
    }

    public int getInflatedId() {
        return this.LJLILLLLZI;
    }

    public LayoutInflater getLayoutInflater() {
        return this.LJLJJI;
    }

    public int getLayoutResource() {
        return this.LJLIL;
    }

    public void setInflatedId(int i) {
        this.LJLILLLLZI = i;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.LJLJJI = layoutInflater;
    }

    public void setLayoutResource(int i) {
        this.LJLIL = i;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        WeakReference<View> weakReference = this.LJLJI;
        if (weakReference != null) {
            View view = weakReference.get();
            if (view != null) {
                view.setVisibility(i);
                return;
            }
            throw new IllegalStateException("setVisibility called on un-referenced view");
        }
        super.setVisibility(i);
        if (i != 0 && i != 4) {
            return;
        }
        LIZ();
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.id, R.attr.layout, R.attr.inflatedId}, 0, 0);
        this.LJLILLLLZI = obtainStyledAttributes.getResourceId(2, -1);
        this.LJLIL = obtainStyledAttributes.getResourceId(1, 0);
        setId(obtainStyledAttributes.getResourceId(0, -1));
        obtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }
}
