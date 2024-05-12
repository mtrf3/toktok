package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Vhh, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80445Vhh extends C72866Sik {
    public int LJLJJL;
    public int LJLJJLL;
    public boolean LJLJL;
    public boolean LJLJLJ;
    public final C80447Vhj LJLJLLL;
    public final ViewGroupOnHierarchyChangeListenerC80446Vhi LJLL;
    public int LJLLI;
    public boolean LJLLILLLL;

    private int getChipCount() {
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if (getChildAt(i2) instanceof C80438Vha) {
                i++;
            }
        }
        return i;
    }

    public void setOnCheckedChangeListener(InterfaceC80449Vhl interfaceC80449Vhl) {
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C80448Vhk();
    }

    public int getCheckedChipId() {
        if (this.LJLJL) {
            return this.LJLLI;
        }
        return -1;
    }

    public List<Integer> getCheckedChipIds() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if ((childAt instanceof C80438Vha) && ((CompoundButton) childAt).isChecked()) {
                arrayList.add(Integer.valueOf(childAt.getId()));
                if (this.LJLJL) {
                    return arrayList;
                }
            }
        }
        return arrayList;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        int i = this.LJLLI;
        if (i != -1) {
            LIZIZ(i, true);
            setCheckedId(this.LJLLI);
        }
    }

    @Override // X.C72866Sik
    public final boolean LIZ() {
        return this.LJLJI;
    }

    public int getChipSpacingHorizontal() {
        return this.LJLJJL;
    }

    public int getChipSpacingVertical() {
        return this.LJLJJLL;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (super.checkLayoutParams(layoutParams) && (layoutParams instanceof C80448Vhk)) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C80448Vhk(getContext(), attributeSet);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i;
        int i2;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        C17760mq c17760mq = new C17760mq(accessibilityNodeInfo);
        if (this.LJLJI) {
            i = getChipCount();
        } else {
            i = -1;
        }
        int rowCount = getRowCount();
        if (this.LJLJL) {
            i2 = 1;
        } else {
            i2 = 2;
        }
        c17760mq.LJIILLIIL(C17730mn.LIZ(rowCount, i, i2));
    }

    public void setCheckedId(int i) {
        this.LJLLI = i;
    }

    public void setChipSpacing(int i) {
        setChipSpacingHorizontal(i);
        setChipSpacingVertical(i);
    }

    public void setChipSpacingHorizontal(int i) {
        if (this.LJLJJL != i) {
            this.LJLJJL = i;
            setItemSpacing(i);
            requestLayout();
        }
    }

    public void setChipSpacingHorizontalResource(int i) {
        setChipSpacingHorizontal(getResources().getDimensionPixelOffset(i));
    }

    public void setChipSpacingResource(int i) {
        setChipSpacing(getResources().getDimensionPixelOffset(i));
    }

    public void setChipSpacingVertical(int i) {
        if (this.LJLJJLL != i) {
            this.LJLJJLL = i;
            setLineSpacing(i);
            requestLayout();
        }
    }

    public void setChipSpacingVerticalResource(int i) {
        setChipSpacingVertical(getResources().getDimensionPixelOffset(i));
    }

    public void setDividerDrawableHorizontal(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    public void setDividerDrawableVertical(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    public void setFlexWrap(int i) {
        throw new UnsupportedOperationException("Changing flex wrap not allowed. ChipGroup exposes a singleLine attribute instead.");
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.LJLL.LJLIL = onHierarchyChangeListener;
    }

    public void setSelectionRequired(boolean z) {
        this.LJLJLJ = z;
    }

    public void setShowDividerHorizontal(int i) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    public void setShowDividerVertical(int i) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    public void setSingleLine(int i) {
        setSingleLine(getResources().getBoolean(i));
    }

    public void setSingleSelection(boolean z) {
        if (this.LJLJL != z) {
            this.LJLJL = z;
            this.LJLLILLLL = true;
            for (int i = 0; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                if (childAt instanceof C80438Vha) {
                    ((C80438Vha) childAt).setChecked(false);
                }
            }
            this.LJLLILLLL = false;
            setCheckedId(-1);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C80448Vhk(layoutParams);
    }

    @Override // X.C72866Sik
    public void setSingleLine(boolean z) {
        super.setSingleLine(z);
    }

    public void setSingleSelection(int i) {
        setSingleSelection(getResources().getBoolean(i));
    }

    public C80445Vhh(Context context, AttributeSet attributeSet) {
        super(C78865UxJ.LIZ(context, attributeSet, R.attr.a29, R.style.a0d), attributeSet, R.attr.a29);
        this.LJLJLLL = new C80447Vhj(this);
        ViewGroupOnHierarchyChangeListenerC80446Vhi viewGroupOnHierarchyChangeListenerC80446Vhi = new ViewGroupOnHierarchyChangeListenerC80446Vhi(this);
        this.LJLL = viewGroupOnHierarchyChangeListenerC80446Vhi;
        this.LJLLI = -1;
        this.LJLLILLLL = false;
        TypedArray LIZLLL = C80244VeS.LIZLLL(getContext(), attributeSet, new int[]{R.attr.a1x, R.attr.a2g, R.attr.a2h, R.attr.a2i, R.attr.b_x, R.attr.bbh, R.attr.bbi}, R.attr.a29, R.style.a0d, new int[0]);
        int dimensionPixelOffset = LIZLLL.getDimensionPixelOffset(1, 0);
        setChipSpacingHorizontal(LIZLLL.getDimensionPixelOffset(2, dimensionPixelOffset));
        setChipSpacingVertical(LIZLLL.getDimensionPixelOffset(3, dimensionPixelOffset));
        setSingleLine(LIZLLL.getBoolean(5, false));
        setSingleSelection(LIZLLL.getBoolean(6, false));
        setSelectionRequired(LIZLLL.getBoolean(4, false));
        int resourceId = LIZLLL.getResourceId(0, -1);
        if (resourceId != -1) {
            this.LJLLI = resourceId;
        }
        LIZLLL.recycle();
        super.setOnHierarchyChangeListener(viewGroupOnHierarchyChangeListenerC80446Vhi);
        C16300kU.LJIJ(this, 1);
    }

    public final void LIZIZ(int i, boolean z) {
        View findViewById = findViewById(i);
        if (findViewById instanceof C80438Vha) {
            this.LJLLILLLL = true;
            ((C80438Vha) findViewById).setChecked(z);
            this.LJLLILLLL = false;
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof C80438Vha) {
            CompoundButton compoundButton = (CompoundButton) view;
            if (compoundButton.isChecked()) {
                int i2 = this.LJLLI;
                if (i2 != -1 && this.LJLJL) {
                    LIZIZ(i2, false);
                }
                setCheckedId(compoundButton.getId());
            }
        }
        super.addView(view, i, layoutParams);
    }
}
